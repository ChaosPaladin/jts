package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_vote_manager extends citizen {
	protected String fnHi = "vote_manager001.htm";
	protected String fnHi1 = "vote_manager002.htm";
	protected String fnHi2 = "vote_manager003.htm";
	protected String fnHi3 = "vote_manager004.htm";
	protected String fnHi4 = "vote_manager005.htm";
	protected String fnHi5 = "vote_manager006.htm";
	protected String fnHi6 = "vote_manager007.htm";
	protected String fnHi7 = "vote_manager008.htm";
	protected int vote_fee1 = 4000;
	protected int vote_fee2 = 30000;
	protected int vote_fee3 = 110000;
	protected int vote_fee4 = 310000;
	protected int vote_fee5 = 970000;
	protected int vote_fee6 = 2160000;
	protected int vote_fee7 = 5000000;
	protected int vote_count_fee = 100000;
	protected int vote_limit_time = 20;
	protected int vote_package11 = 17095;
	protected int vote_package12 = 17096;
	protected int vote_package13 = 17097;
	protected int vote_package14 = 17098;
	protected int vote_package15 = 17099;
	protected int vote_package21 = 17100;
	protected int vote_package22 = 17101;
	protected int vote_package23 = 17102;
	protected int vote_package24 = 17103;
	protected int vote_package25 = 17104;
	protected int vote_package31 = 17105;
	protected int vote_package32 = 17106;
	protected int vote_package33 = 17107;
	protected int vote_package34 = 17108;
	protected int vote_package35 = 17109;
	protected int vote_package41 = 17110;
	protected int vote_package42 = 17111;
	protected int vote_package43 = 17112;
	protected int vote_package44 = 17113;
	protected int vote_package45 = 17114;
	protected int vote_package51 = 17115;
	protected int vote_package52 = 17116;
	protected int vote_package53 = 17117;
	protected int vote_package54 = 17118;
	protected int vote_package55 = 17119;
	protected int vote_package61 = 17120;
	protected int vote_package62 = 17121;
	protected int vote_package63 = 17122;
	protected int vote_package64 = 17123;
	protected int vote_package65 = 17124;
	protected int vote_package71 = 17125;
	protected int vote_package72 = 17126;
	protected int vote_package73 = 17127;
	protected int vote_package74 = 17128;
	protected int vote_package75 = 17129;

	protected void TALKED(HandlerParam talker) {
if (talker.level <= 19) {
myself.ShowPage(talker, fnHi);

} else if (talker.level <= 39) {
myself.ShowPage(talker, fnHi1);

} else if (talker.level <= 51) {
myself.ShowPage(talker, fnHi2);

} else if (talker.level <= 60) {
myself.ShowPage(talker, fnHi3);

} else if (talker.level <= 75) {
myself.ShowPage(talker, fnHi4);

} else if (talker.level <= 79) {
myself.ShowPage(talker, fnHi5);

} else if (talker.level <= 85) {
myself.ShowPage(talker, fnHi6);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.Rand(5);
if (ask == 20002) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee1) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee1, vote_package11, 1, 0, vote_limit_time, 8, 1);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee1, vote_package12, 1, 0, vote_limit_time, 8, 1);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee1, vote_package13, 1, 0, vote_limit_time, 8, 1);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee1, vote_package14, 1, 0, vote_limit_time, 8, 1);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee1, vote_package15, 1, 0, vote_limit_time, 8, 1);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20003) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee2) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee2, vote_package21, 1, 0, vote_limit_time, 8, 2);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee2, vote_package22, 1, 0, vote_limit_time, 8, 2);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee2, vote_package23, 1, 0, vote_limit_time, 8, 2);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee2, vote_package24, 1, 0, vote_limit_time, 8, 2);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee2, vote_package25, 1, 0, vote_limit_time, 8, 2);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20004) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee3) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee3, vote_package31, 1, 0, vote_limit_time, 8, 3);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee3, vote_package32, 1, 0, vote_limit_time, 8, 3);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee3, vote_package33, 1, 0, vote_limit_time, 8, 3);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee3, vote_package34, 1, 0, vote_limit_time, 8, 3);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee3, vote_package35, 1, 0, vote_limit_time, 8, 3);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20005) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee4) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee4, vote_package41, 1, 0, vote_limit_time, 8, 4);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee4, vote_package42, 1, 0, vote_limit_time, 8, 4);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee4, vote_package43, 1, 0, vote_limit_time, 8, 4);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee4, vote_package44, 1, 0, vote_limit_time, 8, 4);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee4, vote_package45, 1, 0, vote_limit_time, 8, 4);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20006) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee5) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee5, vote_package51, 1, 0, vote_limit_time, 8, 5);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee5, vote_package52, 1, 0, vote_limit_time, 8, 5);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee5, vote_package53, 1, 0, vote_limit_time, 8, 5);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee5, vote_package54, 1, 0, vote_limit_time, 8, 5);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee5, vote_package55, 1, 0, vote_limit_time, 8, 5);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20007) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee6) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee6, vote_package61, 1, 0, vote_limit_time, 8, 6);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee6, vote_package62, 1, 0, vote_limit_time, 8, 6);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee6, vote_package63, 1, 0, vote_limit_time, 8, 6);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee6, vote_package64, 1, 0, vote_limit_time, 8, 6);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee6, vote_package65, 1, 0, vote_limit_time, 8, 6);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

} else if (ask == 20008) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= vote_count_fee) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_count_fee, 17094, 1, 0, vote_limit_time, 8, 0);

} else {
myself.ShowPage(talker, fnHi7);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= vote_fee7) {
if (i0 == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee7, vote_package71, 1, 0, vote_limit_time, 8, 7);

} else if (i0 == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee7, vote_package72, 1, 0, vote_limit_time, 8, 7);

} else if (i0 == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee7, vote_package73, 1, 0, vote_limit_time, 8, 7);

} else if (i0 == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee7, vote_package74, 1, 0, vote_limit_time, 8, 7);

} else if (i0 == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, vote_fee7, vote_package75, 1, 0, vote_limit_time, 8, 7);

}

} else {
myself.ShowPage(talker, fnHi7);

}

}

}
	}


}