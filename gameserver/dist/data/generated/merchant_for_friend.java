package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_friend extends merchant {
	protected void TALKED(HandlerParam talker) {
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -31) {
if (reply == 0) {
myself.ShowBuySell(talker, SellList0, BuyList0, -50);

}
if (reply == 1) {
myself.ShowBuySell(talker, SellList1, BuyList0, -50);

}
if (reply == 2) {
myself.SellPreview(talker, SellList0, ShopName, fnBuy, "", "");

}
if (reply == 3) {
myself.SellPreview(talker, SellList1, ShopName, fnBuy, "", "");

}
if (reply == 4) {
myself.ShowBuySell(talker, SellList4, BuyList0, -50);

}
if (reply == 5) {
myself.ShowBuySell(talker, SellList5, BuyList0, -50);

}
if (reply == 6) {
myself.ShowBuySell(talker, SellList6, BuyList0, -50);

}
if (reply == 7) {
myself.ShowBuySell(talker, SellList7, BuyList0, -50);

}

}
super;
	}


}