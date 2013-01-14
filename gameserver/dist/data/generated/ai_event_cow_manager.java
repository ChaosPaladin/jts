package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_cow_manager extends citizen {
	protected String fnHi = "event_cow_manager001.htm";
	protected String fnHi2 = "event_cow_manager011.htm";
	protected String NotEnoughAdena = "event_cow_manager003.htm";
	protected String NotEventDay = "event_cow_manager012.htm";
	protected String NotEnoughPigCoin = "event_cow_manager004.htm";
	protected String NotEnoughGoldPigCoin = "event_cow_manager005.htm";
	protected String GoodJob = "event_cow_manager006.htm";
	protected int event_animal = 2;
	protected int event_year = 2009;
	protected int pig_bow_time = 12;
	protected int pig_bow_num = 1;
	protected int event_package = 14740;
	protected int event_cow_drug = 14722;
	protected int pig_max_coin = 50;
	protected int event_golden_coin = 14721;
	protected int event_coin = 14720;
	protected int event_present1 = 14729;
	protected int event_present2 = 14739;
	protected int event_present3 = 14746;
	protected int event_present4 = 14747;
	protected int event_present5 = 14748;
	protected int event_present6 = 14752;
	protected int event_present7 = 14753;
	protected int event_present8 = 14754;
	protected int event_present9 = 14755;
	protected int event_present10 = 14756;
	protected int event_present11 = 14757;
	protected int event_present12 = 14758;
	protected int event_present13 = 14759;
	protected int event_present14 = 14760;
	protected int event_present15 = 14761;
	protected int event_present16 = 14762;
	protected int event_present17 = 14763;
	protected int event_present18 = 14764;
	protected int event_present19 = 10260;
	protected int event_present20 = 10261;
	protected int event_present21 = 10262;
	protected int event_present22 = 10263;
	protected int event_present23 = 10264;
	protected int event_present24 = 10265;
	protected int event_present25 = 10266;
	protected int event_present26 = 10267;
	protected int event_present27 = 10268;
	protected int event_present28 = 10269;
	protected int event_present29 = 10270;
	protected int event_present30 = 9156;
	protected int event_present31 = 9157;
	protected int event_present32 = 14742;
	protected int event_present33 = 14743;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam i2) {
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsEventDropTime() == 1) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == 20002) {
if (reply == 1) {
if (myself.IsEventDropTime() == 1) {
if (gg.OwnItemCount(talker, 57) >= event_year) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, event_year, event_package, pig_bow_num, 0, pig_bow_time, 0, 0);

} else {
myself.ShowPage(talker, NotEnoughAdena);

}

} else {
myself.ShowPage(talker, NotEventDay);

}

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 57) >= event_year) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 57, event_year);
myself.GiveItem1(talker, event_cow_drug, 200);

} else {
myself.ShowPage(talker, NotEnoughAdena);

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, event_coin) >= 50) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, GoodJob);
myself.DeleteItem1(talker, event_coin, 50);
i2 = gg.Rand(10000);
if (i2 >= 9840) {
myself.GiveItem1(talker, event_present31, 1);

} else if (i2 >= 9310) {
myself.GiveItem1(talker, event_present30, 1);

} else if (i2 >= 8717) {
myself.GiveItem1(talker, event_present29, 1);

} else if (i2 >= 8124) {
myself.GiveItem1(talker, event_present28, 1);

} else if (i2 >= 7531) {
myself.GiveItem1(talker, event_present27, 1);

} else if (i2 >= 6938) {
myself.GiveItem1(talker, event_present26, 1);

} else if (i2 >= 6345) {
myself.GiveItem1(talker, event_present25, 1);

} else if (i2 >= 5752) {
myself.GiveItem1(talker, event_present24, 1);

} else if (i2 >= 5159) {
myself.GiveItem1(talker, event_present23, 1);

} else if (i2 >= 4566) {
myself.GiveItem1(talker, event_present22, 1);

} else if (i2 >= 3973) {
myself.GiveItem1(talker, event_present21, 1);

} else if (i2 >= 3380) {
myself.GiveItem1(talker, event_present20, 1);

} else if (i2 >= 2787) {
myself.GiveItem1(talker, event_present19, 1);

} else if (i2 >= 2700) {
myself.GiveItem1(talker, event_present18, 1);

} else if (i2 >= 2613) {
myself.GiveItem1(talker, event_present17, 1);

} else if (i2 >= 2526) {
myself.GiveItem1(talker, event_present16, 1);

} else if (i2 >= 2439) {
myself.GiveItem1(talker, event_present15, 1);

} else if (i2 >= 2352) {
myself.GiveItem1(talker, event_present14, 1);

} else if (i2 >= 2265) {
myself.GiveItem1(talker, event_present13, 1);

} else if (i2 >= 2178) {
myself.GiveItem1(talker, event_present12, 1);

} else if (i2 >= 2091) {
myself.GiveItem1(talker, event_present11, 1);

} else if (i2 >= 2004) {
myself.GiveItem1(talker, event_present10, 1);

} else if (i2 >= 1917) {
myself.GiveItem1(talker, event_present9, 1);

} else if (i2 >= 1830) {
myself.GiveItem1(talker, event_present8, 1);

} else if (i2 >= 1743) {
myself.GiveItem1(talker, event_present7, 1);

} else if (i2 >= 1733) {
myself.GiveItem1(talker, event_present6, 1);

} else if (i2 >= 1723) {
myself.GiveItem1(talker, event_present5, 1);

} else if (i2 >= 1713) {
myself.GiveItem1(talker, event_present4, 1);

} else if (i2 >= 1703) {
myself.GiveItem1(talker, event_present3, 1);

} else if (i2 >= 200) {
myself.GiveItem1(talker, event_present2, 1);

} else if (i2 >= 0) {
myself.GiveItem1(talker, event_present1, 1);

}

} else {
myself.ShowPage(talker, NotEnoughPigCoin);

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, event_golden_coin) >= 50) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, GoodJob);
myself.DeleteItem1(talker, event_golden_coin, 50);
i3 = gg.Rand(100);
if (i3 >= 70) {
myself.GiveItem1(talker, event_present33, 1);

} else {
myself.GiveItem1(talker, event_present32, 1);

}

} else {
myself.ShowPage(talker, NotEnoughGoldPigCoin);

}

}

}
	}


}