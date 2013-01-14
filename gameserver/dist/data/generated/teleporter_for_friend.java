package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleporter_for_friend extends teleporter {
	protected String fnForFriendNormal = "";
	protected String fnForFriendSpecial = "";

protected Object[][] PositionForFriend = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void TALKED(HandlerParam talker) {
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnForFriendSpecial);

} else if (gg.OwnItemCount(talker, FriendShip4) > 0) {
myself.ShowPage(talker, fnForFriendNormal);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (ask == -30) {
if (reply == 1) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

} else if (reply == 2) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionForFriend, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

}

}
super;
	}


}