package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class keeper_for_friend extends warehouse_keeper {
	protected String fnUseKeepingFriend = "";

	protected void TALKED(HandlerParam talker) {
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnUseKeepingFriend);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -33) {
if (gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnUseKeepingFriend);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}

}
	}


}