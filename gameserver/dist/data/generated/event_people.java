package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_people extends default_npc {
	protected String ShopName = "";
	protected String fnHi = "mhi.htm";
	protected String fnUnableItemSell = "muib.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == -1) {
if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3877) >= 2 && gg.OwnItemCount(talker, 3882) >= 1 && gg.OwnItemCount(talker, 3881) >= 1 && gg.OwnItemCount(talker, 3883) >= 1 && gg.OwnItemCount(talker, 3875) >= 1 && gg.OwnItemCount(talker, 3879) >= 1 && gg.OwnItemCount(talker, 3888) >= 1) {
myself.DeleteItem1(talker, 3877, 2);
myself.DeleteItem1(talker, 3882, 1);
myself.DeleteItem1(talker, 3881, 1);
myself.DeleteItem1(talker, 3883, 1);
myself.DeleteItem1(talker, 3875, 1);
myself.DeleteItem1(talker, 3879, 1);
myself.DeleteItem1(talker, 3888, 1);
i1 = gg.Rand(100000);
if (i1 < 17) {
myself.GiveItem1(talker, 6662, 1);

} else if (i1 < 517) {
myself.GiveItem1(talker, 8752, 1);

} else if (i1 < 1517) {
myself.GiveItem1(talker, 8742, 1);

} else if (i1 < 3217) {
myself.GiveItem1(talker, 3959, 1);

} else if (i1 < 6017) {
myself.GiveItem1(talker, 3958, 1);

} else if (i1 < 6277) {
myself.GiveItem1(talker, 13429, 1);

} else if (i1 < 6537) {
myself.GiveItem1(talker, 13430, 1);

} else if (i1 < 6797) {
myself.GiveItem1(talker, 13431, 1);

} else if (i1 < 13797) {
myself.GiveItem1(talker, 13425, 1);

} else if (i1 < 21797) {
myself.GiveItem1(talker, 13426, 1);

} else {
myself.GiveItem1(talker, 13428, 1);

}

} else {
myself.ShowPage(talker, fnUnableItemSell);

}

} else if (reply == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13418) >= 1 && gg.OwnItemCount(talker, 13417) >= 1 && gg.OwnItemCount(talker, 3877) >= 1 && gg.OwnItemCount(talker, 3875) >= 1 && gg.OwnItemCount(talker, 3885) >= 1 && gg.OwnItemCount(talker, 3886) >= 1) {
myself.DeleteItem1(talker, 13418, 1);
myself.DeleteItem1(talker, 13417, 1);
myself.DeleteItem1(talker, 3877, 1);
myself.DeleteItem1(talker, 3875, 1);
myself.DeleteItem1(talker, 3885, 1);
myself.DeleteItem1(talker, 3886, 1);
i1 = gg.Rand(100000);
if (i1 < 50) {
myself.GiveItem1(talker, 6660, 1);

} else if (i1 < 1050) {
myself.GiveItem1(talker, 8762, 1);

} else if (i1 < 3050) {
myself.GiveItem1(talker, 8752, 2);

} else if (i1 < 6050) {
myself.GiveItem1(talker, 3959, 2);

} else if (i1 < 10050) {
myself.GiveItem1(talker, 3958, 2);

} else if (i1 < 10550) {
myself.GiveItem1(talker, 13429, 1);

} else if (i1 < 11050) {
myself.GiveItem1(talker, 13430, 1);

} else if (i1 < 11550) {
myself.GiveItem1(talker, 13431, 1);

} else if (i1 < 21550) {
myself.GiveItem1(talker, 13422, 1);

} else if (i1 < 33550) {
myself.GiveItem1(talker, 13423, 1);

} else {
myself.GiveItem1(talker, 13424, 1);

}

} else {
myself.ShowPage(talker, fnUnableItemSell);

}

} else if (reply == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3879) >= 1 && gg.OwnItemCount(talker, 3885) >= 1 && gg.OwnItemCount(talker, 3875) >= 2 && gg.OwnItemCount(talker, 3876) >= 1 && gg.OwnItemCount(talker, 3881) >= 1) {
myself.DeleteItem1(talker, 3879, 1);
myself.DeleteItem1(talker, 3885, 1);
myself.DeleteItem1(talker, 3875, 2);
myself.DeleteItem1(talker, 3876, 1);
myself.DeleteItem1(talker, 3881, 1);
i1 = gg.Rand(100000);
if (i1 < 25) {
myself.GiveItem1(talker, 6661, 1);

} else if (i1 < 575) {
myself.GiveItem1(talker, 8752, 1);

} else if (i1 < 1475) {
myself.GiveItem1(talker, 8742, 1);

} else if (i1 < 3475) {
myself.GiveItem1(talker, 3959, 1);

} else if (i1 < 6475) {
myself.GiveItem1(talker, 3958, 1);

} else if (i1 < 6975) {
myself.GiveItem1(talker, 13429, 1);

} else if (i1 < 7475) {
myself.GiveItem1(talker, 13430, 1);

} else if (i1 < 7975) {
myself.GiveItem1(talker, 13431, 1);

} else if (i1 < 11975) {
myself.GiveItem1(talker, 13425, 1);

} else if (i1 < 16975) {
myself.GiveItem1(talker, 13426, 1);

} else {
myself.GiveItem1(talker, 13427, 1);

}

} else {
myself.ShowPage(talker, fnUnableItemSell);

}

}

}
	}


}