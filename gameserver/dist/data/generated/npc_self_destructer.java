package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_self_destructer extends default_npc {
	protected int mode = 0;
	protected int room_no = 0;
	protected String my_maker_name = "gludio58_1926_last_standm1";
	protected String area_explosion = "19_26_tolles_destruction1";
	protected String fnHi = "self_destructer001.htm";
	protected String fnHi2 = "self_destructer002.htm";
	protected String fnHi3 = "self_destructer003.htm";
	protected String fnHi4 = "self_destructer004.htm";
	protected String fnHi5 = "self_destructer005.htm";
	protected String fnHi6 = "self_destructer001a.htm";
	protected String fnHi7 = "self_destructer003a.htm";
	protected int time_limit = 10;
	protected int item_1 = 10427;
	protected int item_2 = 10428;
	protected int item_3 = 10429;
	protected int item_4 = 10430;
	protected int item_5 = 10431;
	protected int ShoutMsg = 1010643;
	protected int ShoutMsg2 = 1800079;
	protected int ShoutMsg3 = 1800117;
	protected int ShoutMsg4 = 1800118;
	protected int ShoutMsg5 = 1800119;
	protected int escapex = 9431;
	protected int escapey = 251898;
	protected int escapez = -2021;
	protected int TM_min_passed = 78002;
	protected int TM_sec_passed = 78003;

	protected void CREATED(HandlerParam maker0) {
myself.i_ai0 = 1;
myself.i_ai1 = 0;
myself.i_ai2 = time_limit;
myself.i_ai3 = 60;
myself.i_ai4 = item_1;
if (mode == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010022, 0, 0);

}
myself.Shout(gg.MakeFString(ShoutMsg3, gg.IntToStr(myself.i_ai2), "", "", "", ""));
myself.AddTimerEx(TM_min_passed, 1 * 60 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (mode == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
if (timer_id == TM_min_passed) {
if (myself.i_ai2 == 1) {
myself.i_ai2 = myself.i_ai2 - 1;
myself.AddTimerEx(TM_sec_passed, 1 * 1000);

} else if (myself.i_ai2 > 1) {
myself.i_ai2 = myself.i_ai2 - 1;
myself.Shout(gg.MakeFString(ShoutMsg, gg.IntToStr(myself.i_ai2), "", "", "", ""));
myself.AddTimerEx(TM_min_passed, 1 * 60 * 1000);

} else {
myself.i_ai2 = 0;
myself.AddTimerEx(TM_sec_passed, 1 * 1000);

}

} else if (timer_id == TM_sec_passed) {
if (myself.i_ai2 > 1) {
myself.i_ai3 = 60;
return;

}
if (myself.i_ai3 <= 0 || myself.i_ai2 < 0) {
gg.SendMakerScriptEvent(maker0, 78010023, 0, 0);

} else {
if (myself.i_ai3 <= 10 || myself.i_ai3 == 20 || myself.i_ai3 == 30 || myself.i_ai3 == 40 || myself.i_ai3 == 50) {
myself.Shout(gg.MakeFString(ShoutMsg2, gg.IntToStr(myself.i_ai3), "", "", "", ""));

}
myself.i_ai3 = myself.i_ai3 - 1;
myself.AddTimerEx(TM_sec_passed, 1 * 1000);

}

} else if (timer_id == 78004) {
myself.Say(gg.MakeFString(1010631, "", "", "", "", ""));
myself.i_ai1 = 0;

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010002) {
if (mode == 0 && myself.i_ai2 > 0 && myself.i_ai2 <= 7) {
myself.i_ai2 = myself.i_ai2 + 3;
myself.i_ai3 = 60;
myself.Shout(gg.MakeFString(ShoutMsg5, "", "", "", "", ""));

}

} else if (script_event_arg1 == 78010030) {
if (mode == 0 && myself.i_ai2 > 3) {
myself.i_ai2 = myself.i_ai2 - 3;
if (myself.i_ai2 < 1) {
myself.i_ai2 = 1;

}
myself.i_ai3 = 60;
myself.Shout(gg.MakeFString(ShoutMsg4, "", "", "", "", ""));

}

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (myself.i_ai0 == 0) {
myself.ShowPage(talker, fnHi2);

} else if (myself.i_ai1 != 1) {
if (myself.IsInCategory(11, talker.occupation) != 0) {
myself.ShowPage(talker, fnHi6);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnHi4);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0) {
if (ask == -7801) {
if (reply == 1) {
if (myself.IsInCategory(11, talker.occupation) != 0) {
myself.i_ai1 = 6;

} else {
myself.i_ai1 = 3;

}
if (gg.Rand(1000) < myself.i_ai1 - myself.i_ai0 * 100) {
myself.i_ai0 = myself.i_ai0 - 1;
if (myself.IsInCategory(11, talker.occupation) != 0) {
myself.ShowPage(talker, fnHi7);

} else {
myself.ShowPage(talker, fnHi3);

}

} else {
myself.i_ai1 = 1;
myself.ShowPage(talker, fnHi4);
myself.AddTimerEx(78004, myself.i_ai3 * 1000);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, item_1) == 0 && gg.OwnItemCount(talker, item_2) == 0 && gg.OwnItemCount(talker, item_3) == 0 && gg.OwnItemCount(talker, item_4) == 0 && gg.OwnItemCount(talker, item_5) == 0 && myself.i_ai4 != 99999) {
if (mode != 0) {
switch (room_no) {
case 0: {
myself.i_ai4 = item_2;
break;

}
case 1: {
myself.i_ai4 = item_3;
break;

}
case 2: {
myself.i_ai4 = item_4;
break;

}
case 3: {
myself.i_ai4 = item_5;
break;

}

}

}
myself.GiveItem1(talker, myself.i_ai4, 1);
myself.i_ai4 = 99999;
if (mode != 0) {
myself.Despawn();

}

} else {
myself.ShowPage(talker, fnHi5);

}

}

}
	}


}