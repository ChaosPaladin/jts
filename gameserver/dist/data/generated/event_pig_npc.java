package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_pig_npc extends default_npc {
	protected int event_animal = 12;
	protected int event_year = 2008;
	protected int pig_bow_time = 24;
	protected int pig_bow_num = 3;
	protected int pig_max_coin = 20;
	protected int pig_cubix = 10632;
	protected int bigpig_golden_coin = 9143;
	protected int event_coin = 9142;
	protected int buff1 = 341311489;
	protected int buff2 = 341377025;
	protected int buff3 = 341442561;
	protected int buff4 = 341508097;
	protected int buff5 = 341573633;
	protected int buff6 = 341639169;
	protected int buff7 = 341704705;
	protected int buff8 = 341770241;
	protected int buff9 = 341835777;
	protected int buff10 = 341901313;
	protected int bigpig_buff1 = 9146;
	protected int bigpig_buff2 = 9147;
	protected int bigpig_buff3 = 9148;
	protected int bigpig_buff4 = 9149;
	protected int bigpig_buff5 = 9150;
	protected int bigpig_buff6 = 9151;
	protected int bigpig_buff7 = 9152;
	protected int bigpig_buff8 = 9153;
	protected int bigpig_buff9 = 9154;
	protected int bigpig_buff10 = 9155;
	protected int bigpig_scroll_escape = 9156;
	protected int bigpig_scroll_resurrection = 9157;
	protected int bigpig_gold_circlet = 9158;
	protected int bigpig_silver_circlet = 9159;
	protected int bigpig_ages = 9160;
	protected int bigpig_Dday = 955;
	protected int bigpig_Djel = 956;
	protected int bigpig_Cday = 951;
	protected int bigpig_Cjel = 952;
	protected int bigpig_Bday = 947;
	protected int bigpig_Bjel = 948;
	protected int bigpig_Aday = 729;
	protected int bigpig_Ajel = 730;
	protected int bigpig_life_stone1 = 8743;
	protected int bigpig_life_stone2 = 8744;
	protected int bigpig_life_stone3 = 8745;
	protected int bigpig_life_stone4 = 8746;
	protected int bigpig_life_stone5 = 8747;
	protected int bigpig_life_stone6 = 8748;
	protected int bigpig_life_stone7 = 8749;
	protected int bigpig_life_stone8 = 8750;
	protected int bigpig_life_stone9 = 8751;
	protected int bigpig_life_stone10 = 8752;

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager001.htm");

} else {
myself.ShowPage(talker, "event_pig_manager001.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (ask == 1) {
if (reply == 2) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager002.htm");

} else {
myself.ShowPage(talker, "event_pig_manager002.htm");

}

} else if (reply == 3) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_03.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_03.htm");

}

}

}
if (ask == 2) {
if (reply == 3) {
if (gg.OwnItemCount(talker, 57) >= event_year) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_04.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_04.htm");

}
i0 = gg.Rand(100);
if (i0 >= 90) {
if (gg.Rand(100) >= 90) {
i1 = 20;

} else if (gg.Rand(100) >= 70) {
i1 = 19;

} else if (gg.Rand(100) >= 60) {
i1 = 18;

} else if (gg.Rand(100) >= 50) {
i1 = 17;

} else {
i1 = 16;

}

} else if (i0 >= 60) {
if (gg.Rand(100) >= 90) {
i1 = 15;

} else if (gg.Rand(100) >= 80) {
i1 = 14;

} else if (gg.Rand(100) >= 70) {
i1 = 13;

} else if (gg.Rand(100) >= 60) {
i1 = 12;

} else if (gg.Rand(100) >= 50) {
i1 = 11;

} else if (gg.Rand(100) >= 40) {
i1 = 10;

} else if (gg.Rand(100) >= 30) {
i1 = 9;

} else {
i1 = 8;

}

} else if (gg.Rand(100) >= 90) {
i1 = 7;

} else if (gg.Rand(100) >= 80) {
i1 = 6;

} else if (gg.Rand(100) >= 70) {
i1 = 5;

} else if (gg.Rand(100) >= 60) {
i1 = 4;

} else if (gg.Rand(100) >= 50) {
i1 = 3;

} else if (gg.Rand(100) >= 40) {
i1 = 2;

} else if (gg.Rand(100) >= 30) {
i1 = 1;

} else {
i1 = 0;

}
myself.GiveEventItem(talker, 57, event_year, 9141, pig_bow_num, i1, pig_bow_time, 0, 0);

} else if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_06.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_06.htm");

}

}

}
if (ask == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (reply == 2) {
if (gg.OwnItemCount(talker, event_coin) < pig_max_coin) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_07.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_07.htm");

}

} else if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_08.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_08.htm");

}

} else if (reply == 10) {
if (gg.OwnItemCount(talker, event_coin) >= pig_max_coin) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_09.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_09.htm");

}
myself.AddUseSkillDesire(talker, buff1, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff2, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff3, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff7, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff4, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff5, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff6, 1, 0, 1000000);
i2 = gg.Rand(10000);
if (i2 >= 9990) {
myself.GiveItem1(talker, bigpig_ages, 1);

} else if (i2 >= 9970) {
myself.GiveItem1(talker, bigpig_silver_circlet, 1);

} else if (i2 >= 9935) {
i4 = gg.Rand(100);
if (i4 >= 90) {
myself.GiveItem1(talker, bigpig_life_stone10, 1);

} else if (i4 >= 80) {
myself.GiveItem1(talker, bigpig_life_stone9, 1);

} else if (i4 >= 70) {
myself.GiveItem1(talker, bigpig_life_stone8, 1);

} else if (i4 >= 60) {
myself.GiveItem1(talker, bigpig_life_stone7, 1);

} else if (i4 >= 50) {
myself.GiveItem1(talker, bigpig_life_stone6, 1);

} else if (i4 >= 40) {
myself.GiveItem1(talker, bigpig_life_stone5, 1);

} else if (i4 >= 30) {
myself.GiveItem1(talker, bigpig_life_stone4, 1);

} else if (i4 >= 20) {
myself.GiveItem1(talker, bigpig_life_stone3, 1);

} else if (i4 >= 10) {
myself.GiveItem1(talker, bigpig_life_stone2, 1);

} else {
myself.GiveItem1(talker, bigpig_life_stone1, 1);

}

} else if (i2 >= 9885) {
myself.GiveItem1(talker, bigpig_gold_circlet, 1);

} else if (i2 >= 9815) {
myself.GiveItem1(talker, bigpig_Aday, 1);
myself.GiveItem1(talker, bigpig_Ajel, 1);

} else if (i2 >= 9575) {
myself.GiveItem1(talker, bigpig_Bday, 1);
myself.GiveItem1(talker, bigpig_Bjel, 1);

} else if (i2 >= 9175) {
myself.GiveItem1(talker, bigpig_scroll_resurrection, 1);

} else if (i2 >= 7975) {
myself.GiveItem1(talker, bigpig_scroll_escape, 1);

} else if (i2 >= 6625) {
myself.GiveItem1(talker, bigpig_Cday, 1);
myself.GiveItem1(talker, bigpig_Cjel, 1);

} else if (i2 >= 4125) {
if (gg.OwnItemCount(talker, pig_cubix) > 0) {
myself.GiveItem1(talker, bigpig_Dday, 1);
myself.GiveItem1(talker, bigpig_Djel, 1);

} else if (gg.Rand(2) < 1) {
myself.GiveItem1(talker, bigpig_Dday, 1);
myself.GiveItem1(talker, bigpig_Djel, 1);

} else {
myself.GiveItem1(talker, pig_cubix, 1);

}
if (gg.Rand(100) >= 98) {
myself.GiveItem1(talker, 9140, 1);

}

} else {
i4 = gg.Rand(100);
if (i4 >= 91) {
myself.GiveItem1(talker, bigpig_buff1, 1);

} else if (i4 >= 82) {
myself.GiveItem1(talker, bigpig_buff2, 1);

} else if (i4 >= 73) {
myself.GiveItem1(talker, bigpig_buff3, 1);

} else if (i4 >= 64) {
myself.GiveItem1(talker, bigpig_buff4, 1);

} else if (i4 >= 55) {
myself.GiveItem1(talker, bigpig_buff5, 1);

} else if (i4 >= 46) {
myself.GiveItem1(talker, bigpig_buff6, 1);

} else if (i4 >= 37) {
myself.GiveItem1(talker, bigpig_buff7, 1);

} else if (i4 >= 28) {
myself.GiveItem1(talker, bigpig_buff8, 1);

} else if (i4 >= 19) {
myself.GiveItem1(talker, bigpig_buff9, 1);

} else {
myself.GiveItem1(talker, bigpig_buff10, 1);

}
if (gg.Rand(100) >= 98) {
myself.GiveItem1(talker, 9140, 1);

}
i4 = gg.Rand(100);
if (i4 >= 91) {
myself.GiveItem1(talker, bigpig_buff1, 1);

} else if (i4 >= 82) {
myself.GiveItem1(talker, bigpig_buff2, 1);

} else if (i4 >= 73) {
myself.GiveItem1(talker, bigpig_buff3, 1);

} else if (i4 >= 64) {
myself.GiveItem1(talker, bigpig_buff4, 1);

} else if (i4 >= 55) {
myself.GiveItem1(talker, bigpig_buff5, 1);

} else if (i4 >= 46) {
myself.GiveItem1(talker, bigpig_buff6, 1);

} else if (i4 >= 37) {
myself.GiveItem1(talker, bigpig_buff7, 1);

} else if (i4 >= 28) {
myself.GiveItem1(talker, bigpig_buff8, 1);

} else if (i4 >= 19) {
myself.GiveItem1(talker, bigpig_buff9, 1);

} else {
myself.GiveItem1(talker, bigpig_buff10, 1);

}

}
myself.DeleteItem1(talker, event_coin, pig_max_coin);

} else if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_07.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_07.htm");

}

} else if (reply == 11) {
if (gg.OwnItemCount(talker, event_coin) >= pig_max_coin) {
if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_09.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_09.htm");

}
myself.AddUseSkillDesire(talker, buff1, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff2, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff3, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff7, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff10, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff9, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, buff8, 1, 0, 1000000);
i2 = gg.Rand(10000);
if (i2 >= 9990) {
myself.GiveItem1(talker, bigpig_ages, 1);

} else if (i2 >= 9970) {
myself.GiveItem1(talker, bigpig_silver_circlet, 1);

} else if (i2 >= 9935) {
i4 = gg.Rand(100);
if (i4 >= 90) {
myself.GiveItem1(talker, bigpig_life_stone10, 1);

} else if (i4 >= 80) {
myself.GiveItem1(talker, bigpig_life_stone9, 1);

} else if (i4 >= 70) {
myself.GiveItem1(talker, bigpig_life_stone8, 1);

} else if (i4 >= 60) {
myself.GiveItem1(talker, bigpig_life_stone7, 1);

} else if (i4 >= 50) {
myself.GiveItem1(talker, bigpig_life_stone6, 1);

} else if (i4 >= 40) {
myself.GiveItem1(talker, bigpig_life_stone5, 1);

} else if (i4 >= 30) {
myself.GiveItem1(talker, bigpig_life_stone4, 1);

} else if (i4 >= 20) {
myself.GiveItem1(talker, bigpig_life_stone3, 1);

} else if (i4 >= 10) {
myself.GiveItem1(talker, bigpig_life_stone2, 1);

} else {
myself.GiveItem1(talker, bigpig_life_stone1, 1);

}

} else if (i2 >= 9885) {
myself.GiveItem1(talker, bigpig_gold_circlet, 1);

} else if (i2 >= 9815) {
myself.GiveItem1(talker, bigpig_Aday, 1);
myself.GiveItem1(talker, bigpig_Ajel, 1);

} else if (i2 >= 9575) {
myself.GiveItem1(talker, bigpig_Bday, 1);
myself.GiveItem1(talker, bigpig_Bjel, 1);

} else if (i2 >= 9175) {
myself.GiveItem1(talker, bigpig_scroll_resurrection, 1);

} else if (i2 >= 7975) {
myself.GiveItem1(talker, bigpig_scroll_escape, 1);

} else if (i2 >= 6625) {
myself.GiveItem1(talker, bigpig_Cday, 1);
myself.GiveItem1(talker, bigpig_Cjel, 1);

} else if (i2 >= 4125) {
if (gg.OwnItemCount(talker, pig_cubix) > 0) {
myself.GiveItem1(talker, bigpig_Dday, 1);
myself.GiveItem1(talker, bigpig_Djel, 1);

} else if (gg.Rand(2) < 1) {
myself.GiveItem1(talker, bigpig_Dday, 1);
myself.GiveItem1(talker, bigpig_Djel, 1);

} else {
myself.GiveItem1(talker, pig_cubix, 1);

}
if (gg.Rand(100) >= 98) {
myself.GiveItem1(talker, 9140, 1);

}

} else {
i4 = gg.Rand(100);
if (i4 >= 91) {
myself.GiveItem1(talker, bigpig_buff1, 1);

} else if (i4 >= 82) {
myself.GiveItem1(talker, bigpig_buff2, 1);

} else if (i4 >= 73) {
myself.GiveItem1(talker, bigpig_buff3, 1);

} else if (i4 >= 64) {
myself.GiveItem1(talker, bigpig_buff4, 1);

} else if (i4 >= 55) {
myself.GiveItem1(talker, bigpig_buff5, 1);

} else if (i4 >= 46) {
myself.GiveItem1(talker, bigpig_buff6, 1);

} else if (i4 >= 37) {
myself.GiveItem1(talker, bigpig_buff7, 1);

} else if (i4 >= 28) {
myself.GiveItem1(talker, bigpig_buff8, 1);

} else if (i4 >= 19) {
myself.GiveItem1(talker, bigpig_buff9, 1);

} else {
myself.GiveItem1(talker, bigpig_buff10, 1);

}
i4 = gg.Rand(100);
if (i4 >= 91) {
myself.GiveItem1(talker, bigpig_buff1, 1);

} else if (i4 >= 82) {
myself.GiveItem1(talker, bigpig_buff2, 1);

} else if (i4 >= 73) {
myself.GiveItem1(talker, bigpig_buff3, 1);

} else if (i4 >= 64) {
myself.GiveItem1(talker, bigpig_buff4, 1);

} else if (i4 >= 55) {
myself.GiveItem1(talker, bigpig_buff5, 1);

} else if (i4 >= 46) {
myself.GiveItem1(talker, bigpig_buff6, 1);

} else if (i4 >= 37) {
myself.GiveItem1(talker, bigpig_buff7, 1);

} else if (i4 >= 28) {
myself.GiveItem1(talker, bigpig_buff8, 1);

} else if (i4 >= 19) {
myself.GiveItem1(talker, bigpig_buff9, 1);

} else {
myself.GiveItem1(talker, bigpig_buff10, 1);

}

}
myself.DeleteItem1(talker, event_coin, pig_max_coin);

} else if (event_animal == 1) {
myself.ShowPage(talker, "event_rat_manager_q01_07.htm");

} else {
myself.ShowPage(talker, "event_pig_manager_q01_07.htm");

}

}

}
	}


}