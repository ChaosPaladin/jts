package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_seyo extends citizen {
	protected int TRICKERY_TIMER = 1112;
	protected String fnBusy = "seyo003.htm";
	protected String fnNoToken0 = "seyo002a.htm";
	protected String fnNoToken1 = "seyo002b.htm";
	protected String fnNoToken2 = "seyo002c.htm";

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (myself.i_ai0 == 0) {
if (ask = -415) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 15486) > 0) {
myself.i_ai0 = 1;
myself.DeleteItem1(talker, 15486, 1);
i0 = gg.Rand(100) + 1;
if (i0 > 99) {
myself.GiveItem1(talker, 15486, 100);
myself.Say(gg.MakeFString(1801155, talker.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801156, talker.name, "", "", "", ""));

}
myself.AddTimerEx(TRICKERY_TIMER, 5 * 1000);

} else {
myself.ShowPage(talker, fnNoToken0);

}

} else if (reply == 5) {
if (gg.OwnItemCount(talker, 15486) >= 5) {
myself.i_ai0 = 1;
myself.DeleteItem1(talker, 15486, 5);
i0 = gg.Rand(100) + 1;
if (i0 > 80) {
i0 = gg.Rand(3) + 5 * 2;
myself.GiveItem1(talker, 15486, i0);
myself.Say(gg.MakeFString(1801157, talker.name, gg.IntToStr(i0), "", "", ""));

} else if (i0 > 20 && i0 <= 80) {
myself.GiveItem1(talker, 15486, 1);
myself.Say(gg.MakeFString(1801158, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801159, talker.name, "", "", "", ""));

}
myself.AddTimerEx(TRICKERY_TIMER, 5 * 1000);

} else {
myself.ShowPage(talker, fnNoToken1);

}

} else if (reply == 20) {
if (gg.OwnItemCount(talker, 15486) >= 20) {
myself.i_ai0 = 1;
myself.DeleteItem1(talker, 15486, 20);
i0 = gg.Rand(10000) + 1;
if (i0 == 10000) {
myself.GiveItem1(talker, 15486, i0);
myself.Say(gg.MakeFString(1801160, talker.name, "", "", "", ""));

} else if (i0 > 10 && i0 <= 9999) {
myself.GiveItem1(talker, 15486, 1);
myself.Say(gg.MakeFString(1801161, "", "", "", "", ""));

} else if (i0 <= 10) {
i0 = gg.Rand(100);
myself.GiveItem1(talker, 15486, 1);
myself.Say(gg.MakeFString(1801162, "", "", "", "", ""));

}
myself.AddTimerEx(TRICKERY_TIMER, 5 * 1000);

} else {
myself.ShowPage(talker, fnNoToken2);

}

}

}

} else {
myself.ShowPage(talker, fnBusy);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TRICKERY_TIMER) {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;
i0 = gg.Rand(5) + 1;
switch (i0) {
case 1: {
myself.Say(gg.MakeFString(1801163, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1801164, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1801165, "", "", "", "", ""));
break;

}
case 4: {
myself.Say(gg.MakeFString(1801166, "", "", "", "", ""));
break;

}
case 5: {
myself.Say(gg.MakeFString(1801167, "", "", "", "", ""));
break;

}

}

}

}
super;
	}


}