package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ev_tiger_manager extends citizen {
	protected String fnHi = "ev_tiger_manager001.htm";
	protected String fnHi2 = "ev_tiger_manager011.htm";
	protected String NotEnoughAdena = "ev_tiger_manager003.htm";
	protected String NotEventDay = "ev_tiger_manager012.htm";
	protected String NotEnoughPigCoin = "ev_tiger_manager004.htm";
	protected String NotEnoughGoldPigCoin = "ev_tiger_manager005.htm";
	protected String GoodJob = "ev_tiger_manager006.htm";
	protected int event_year = 2010;
	protected int pig_bow_time = 12;
	protected int pig_bow_num = 1;
	protected int event_package = 17066;
	protected int event_cow_drug = 17067;
	protected int pig_max_coin = 20;
	protected int event_golden_coin = 14721;
	protected int event_coin = 14720;
	protected int event_present1 = 17069;
	protected int event_present2 = 17070;
	protected int event_present3 = 17071;
	protected int event_present4 = 17072;
	protected int event_present5 = 17073;
	protected int event_present6 = 17074;
	protected int event_present7 = 17075;
	protected int event_present8 = 17076;
	protected int event_present9 = 17077;
	protected int event_present10 = 17093;
	protected int event_present11 = 17078;
	protected int event_present12 = 17079;
	protected int event_present13 = 17080;
	protected int event_present14 = 17081;

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
if (gg.OwnItemCount(talker, event_coin) >= 20) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, GoodJob);
myself.DeleteItem1(talker, event_coin, 20);
i2 = gg.Rand(1000000);
if (i2 >= 742435) {
myself.GiveItem1(talker, event_present13, 1);

} else if (i2 >= 484871) {
myself.GiveItem1(talker, event_present12, 1);

} else if (i2 >= 227307) {
myself.GiveItem1(talker, event_present11, 1);

} else if (i2 >= 550) {
myself.GiveItem1(talker, event_present10, 1);

} else if (i2 >= 515) {
myself.GiveItem1(talker, event_present9, 1);

} else if (i2 >= 470) {
myself.GiveItem1(talker, event_present8, 1);

} else if (i2 >= 382) {
myself.GiveItem1(talker, event_present7, 1);

} else if (i2 >= 275) {
myself.GiveItem1(talker, event_present6, 1);

} else if (i2 >= 211) {
myself.GiveItem1(talker, event_present5, 1);

} else if (i2 >= 168) {
myself.GiveItem1(talker, event_present4, 1);

} else if (i2 >= 80) {
myself.GiveItem1(talker, event_present3, 1);

} else if (i2 >= 35) {
myself.GiveItem1(talker, event_present2, 1);

} else if (i2 >= 0) {
myself.GiveItem1(talker, event_present1, 1);

}

} else {
myself.ShowPage(talker, NotEnoughPigCoin);

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, event_golden_coin) >= 20) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, GoodJob);
myself.DeleteItem1(talker, event_golden_coin, 20);
myself.GiveItem1(talker, event_present14, 1);

} else {
myself.ShowPage(talker, NotEnoughGoldPigCoin);

}

}

}
	}


}