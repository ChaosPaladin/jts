package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_clan extends merchant {
	protected int item_oath = 9911;
	protected int num_oath = 1;
	protected int fame_oath = 500;
	protected int item_proof = 9910;
	protected int num_proof = 10;
	protected int fame_proof = 100;
	protected int item_strap = 9912;
	protected int num_strap = 100;
	protected int fame_strap = 12;
	protected String fnHi1 = "";
	protected String fnNoPledge = "";
	protected String fnPledgeFameValue = "";
	protected String fnUpdateFameSuccess = "";
	protected String fnNotEnoughItem = "";
	protected int pledge_lv_req = 5;
	protected String fnLowerPledgeLvReq = "clan_merchant_hullia007.htm";

	protected void TALKED(HandlerParam talker) {
if (talker.pledge_id > 0 && talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9)) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, myself.sm.name + "002.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam fhtml0, HandlerParam pledge0) {
if (ask == -303 && reply == 551) {
myself.ShowMultisell(551, talker);

} else if (ask == -303 && reply == 628) {
myself.ShowMultisell(628, talker);

} else if (ask == -302) {
if (myself.GetPledgeSkillLevel(talker) < pledge_lv_req) {
myself.ShowPage(talker, fnLowerPledgeLvReq);
return;

}
if (reply == -1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetFileName(fhtml0, fnPledgeFameValue);
myself.FHTML_SetStr(fhtml0, "pledge_name", pledge0.name);
myself.FHTML_SetStr(fhtml0, "fame_value", gg.IntToStr(myself.OwnPledgeNameValue(talker)));
myself.ShowFHTML(talker, fhtml0);

}
return;

} else if (reply == 0) {
myself.ShowPage(talker, fnHi1);
return;

} else if (reply == 1) {
i0 = item_oath;
i1 = num_oath;
i2 = fame_oath;

} else if (reply == 2) {
i0 = item_proof;
i1 = num_proof;
i2 = fame_proof;

} else if (reply == 3) {
i0 = item_strap;
i1 = num_strap;
i2 = fame_strap;

}
if (gg.OwnItemCount(talker, i0) >= i1) {
if (talker.pledge_id <= 0) {
myself.ShowPage(talker, fnNoPledge);
return;

}
myself.DeleteItem1(talker, i0, i1);
myself.UpdatePledgeNameValue(talker, i2);
myself.ShowPage(talker, fnUpdateFameSuccess);
return;

} else {
myself.ShowPage(talker, fnNotEnoughItem);
return;

}

}
super;
	}


}