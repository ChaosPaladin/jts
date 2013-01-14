package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_friend_special extends merchant {
	protected String fnSpecialProduct1 = "";
	protected String fnSpecialProduct2 = "";

	protected void TALKED(HandlerParam talker) {
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnSpecialProduct2);

} else if (gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0) {
myself.ShowPage(talker, fnSpecialProduct1);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -32) {
if (reply == 0) {
myself.ShowMultisell(212, talker);

} else if (reply == 1) {
myself.ShowMultisell(251, talker);

} else if (reply == 2) {
myself.ShowMultisell(252, talker);

}

} else if (ask == -303) {
myself.ShowMultisell(reply, talker);

}
	}


}