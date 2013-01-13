package ru.jts.loginserver.network.game_client.clientpackets;

import ru.jts.common.GlobalConstans;
import ru.jts.common.configuration.Config;
import ru.jts.common.log.Log;
import ru.jts.common.network.ClientPacket;
import ru.jts.loginserver.database.AccountsDAO;
import ru.jts.loginserver.database.GameserversDAO;
import ru.jts.loginserver.manager.SessionManager;
import ru.jts.loginserver.model.Account;
import ru.jts.loginserver.network.game_client.LoginClient;
import ru.jts.loginserver.network.game_client.crypt.PasswordHash;
import ru.jts.loginserver.network.game_client.serverpackets.LoginFail;
import ru.jts.loginserver.network.game_client.serverpackets.LoginOK;
import ru.jts.loginserver.network.game_server.serverpackets.GetAccountInfo;

import javax.crypto.Cipher;

/**
 * @author : Camelion
 * @date : 15.08.12  22:04
 */
public class RequestAuthLogin extends ClientPacket<LoginClient> {
    private static final String LOG_TAG = "RequestAuthLogin.java";
    private static final String CIPHER_CONFIG = "RSA/ECB/nopadding";

    private final byte[] data = new byte[128];

    @Override
    protected void readImpl() {
        readB(data);
        readD();
        readD();
        readD();
        readD();
        readD();
        readD();
        readH();
        readC();
    }

    @Override
    protected void runImpl() {
        LoginClient client = getNetworkClient();

        byte[] decrypted;
        try {
            Cipher rsaCipher = Cipher.getInstance(CIPHER_CONFIG);
            rsaCipher.init(Cipher.DECRYPT_MODE, client.getRSAPrivateKey());
            decrypted = rsaCipher.doFinal(data, 0x00, 0x80);
        } catch (Exception e) {
            client.close(LoginFail.REASON_ACCESS_FAILED_TRY_AGAIN_LATER_1);
            return;
        }

        String login = new String(decrypted, 0x5E, 14).trim().toLowerCase();
        String password = new String(decrypted, 0x6C, 16).trim();

        int ncotp = decrypted[0x7c];
        ncotp |= decrypted[0x7d] << 8;
        ncotp |= decrypted[0x7e] << 16;
        ncotp |= decrypted[0x7f] << 24;

        String pass_hash = PasswordHash.hash(password, Config.getString("loginserver.password_hash"));

        if (GlobalConstans.DEBUG)
            Log.d(LOG_TAG, "Login: {}, pass: {}, ncotp: " + ncotp, login, pass_hash);

        Account account = AccountsDAO.getInstance().restoreByLogin(login);
        if (account == null) { // Такого аккаунта нет в базе данных
            if (Config.getBool("loginserver.auto_create_accounts")) { // создаем, если возможно
                account = new Account(login, pass_hash);
                if (GlobalConstans.DEBUG)
                    Log.d(LOG_TAG, "Created new account for {}", login);
            } else { // Иначе - закрываем соединение
                client.close(LoginFail.REASON_USER_OR_PASS_WRONG);
                return;
            }
        } else if (!account.getPasswordHash().equals(pass_hash)) {
            client.close(LoginFail.REASON_PASS_WRONG);
            return;
        }

        // пароли совпадают, либо создан новый аккаунт
        // ...

        account.setLastIP(client.getIPAddress());
        AccountsDAO.getInstance().saveAccount(account);

        getNetworkClient().setAccount(account);

        SessionManager.getInstance().openSession(account.getLogin(), client.getSessionKey());

        GameserversDAO.getInstance().sendPacketToAll(new GetAccountInfo(account.getLogin()));

        client.sendPacket(new LoginOK(client.getSessionKey().getLoginOK1(), client.getSessionKey().getLoginOK2()));
    }
}
