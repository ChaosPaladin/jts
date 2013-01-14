package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_search_npc extends default_npc {
	protected int search_jaru1 = 10254;
	protected int search_jaru2 = 10255;
	protected int search_jaru3 = 10256;
	protected int search_jaru4 = 10257;
	protected int search_jaru5 = 10258;
	protected int search_jaru6 = 10259;
	protected int search_piece = 10272;
	protected int search_scroll = 10274;
	protected int isThemePark = 0;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.AddTimerEx(1000, 60000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (isThemePark == 0) {
myself.ShowPage(talker, "event_search_manager001a.htm");

} else {
myself.ShowPage(talker, "event_search_manager001.htm");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1000) {
if (gg.Rand(5) < 1) {
if (isThemePark == 0) {
if (gg.Rand(5) < 1) {
myself.Say(gg.MakeFString(1600012, "", "", "", "", ""));

} else if (gg.Rand(4) < 1) {
myself.Say(gg.MakeFString(1600013, "", "", "", "", ""));

} else if (gg.Rand(3) < 1) {
myself.Say(gg.MakeFString(1600014, "", "", "", "", ""));

} else if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600015, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600016, "", "", "", "", ""));

}

} else if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600017, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600013, "", "", "", "", ""));

}

}
myself.AddTimerEx(1000, 60000);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (ask == 1) {
if (reply == 1) {
if (gg.OwnItemCount(talker, search_piece) >= 50) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, search_piece, 50);
i0 = gg.Rand(10000);
if (i0 < 5) {
myself.GiveItem1(talker, search_jaru1, 1);

} else if (i0 < 325) {
myself.GiveItem1(talker, search_jaru2, 1);

} else if (i0 < 992) {
myself.GiveItem1(talker, search_jaru3, 1);

} else if (i0 < 1945) {
myself.GiveItem1(talker, search_jaru4, 1);

} else if (i0 < 4678) {
myself.GiveItem1(talker, search_jaru5, 1);

} else {
myself.GiveItem1(talker, search_jaru6, 1);

}
if (isThemePark == 0) {
myself.ShowPage(talker, "event_search_manager001a.htm");

} else {
myself.ShowPage(talker, "event_search_manager001.htm");

}

} else {
myself.ShowPage(talker, "event_search_manager_q01_04.htm");

}

} else if (reply == 2) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 / 1000000;
if (i1 >= 100) {
i1 = i1 % 100;

}
if (i1 < 0) {
i1 = 0;

}
if (i1 == 1) {
myself.InstantTeleport(talker, -15148, 123886, -3112);

} else if (i1 == 2) {
myself.InstantTeleport(talker, -80881, 151307, -3040);

} else if (i1 == 3) {
myself.InstantTeleport(talker, 18342, 145271, -3088);

} else if (i1 == 4) {
myself.InstantTeleport(talker, 81536, 145638, -3528);

} else if (i1 == 5) {
myself.InstantTeleport(talker, 79943, 55619, -1552);

} else if (i1 == 6) {
myself.InstantTeleport(talker, 117415, 76498, -2688);

} else if (i1 == 7) {
myself.InstantTeleport(talker, 146945, 27152, -2200);

} else if (i1 == 8) {
myself.InstantTeleport(talker, 111829, 221375, -3608);

} else if (i1 == 9) {
myself.InstantTeleport(talker, 46911, 49441, -3056);

} else if (i1 == 10) {
myself.InstantTeleport(talker, 147867, -58250, -2976);

} else if (i1 == 11) {
myself.InstantTeleport(talker, 43964, -48700, -792);

} else if (i1 == 12) {
myself.InstantTeleport(talker, 87703, -142393, -1336);

} else if (i1 == 13) {
myself.InstantTeleport(talker, -84752, 243122, -3728);

} else if (i1 == 14) {
myself.InstantTeleport(talker, 11179, 15848, -4584);

} else if (i1 == 15) {
myself.InstantTeleport(talker, 17441, 170434, -3504);

} else if (i1 == 16) {
myself.InstantTeleport(talker, -44132, -113766, -240);

} else if (i1 == 17) {
myself.InstantTeleport(talker, 114976, -178774, -856);

} else if (i1 == 18) {
myself.InstantTeleport(talker, -119377, 47000, 360);

} else {
myself.Say(gg.MakeFString(1600019, "", "", "", "", ""));

}

}

} else if (ask == 2) {
if (reply == 1) {
if (isThemePark == 0) {
myself.ShowPage(talker, "event_search_manager001a.htm");

} else {
myself.ShowPage(talker, "event_search_manager001.htm");

}

}

} else if (ask == 3) {
if (reply == 1) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
if (isThemePark != 0) {
i1 = isThemePark * 1000000;

}
i2 = 0;
i2 = i0 / 1000000;
if (i2 > 0) {
i2 = i2 % 100;
i2 = i2 * 1000000;

} else {
i2 = 0;

}
if (isThemePark != 0) {
if (i0 < 0) {
myself.SetMemoStateEx(talker, 255, 1, i1);

} else {
myself.SetMemoStateEx(talker, 255, 1, i0 - i2 + i1);

}

}
if (gg.Rand(3) < 1) {
myself.InstantTeleport(talker, -58752, -56898, -2032);

} else if (gg.Rand(2) < 1) {
myself.InstantTeleport(talker, -59722, -57866, -2032);

} else {
myself.InstantTeleport(talker, -60695, -56894, -2032);

}

} else if (reply == 2) {
if (myself.IsEventDropTime() == 1) {
if (gg.OwnItemCount(talker, 57) >= 500) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_search_manager_q01_03.htm");
myself.GiveEventItem(talker, 57, 500, search_scroll, 1, 0, 12, 0, 0);

} else {
myself.ShowPage(talker, "event_search_manager_q01_05.htm");

}

} else {
myself.ShowPage(talker, "event_search_manager_q01_06.htm");

}

}

}
	}


}