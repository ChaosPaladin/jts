package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_fire_manager extends default_npc {
	protected int event_end = 0;
	protected int event_doing = 1;
	protected int event_reward = 2;
	protected int kill_count_1 = 207360;
	protected int kill_count_2 = 241920;
	protected int kill_count_3 = 276480;
	protected int kill_count_4 = 321408;
	protected int kill_count_5 = 328320;
	protected int kill_count_6 = 328320;
	protected int kill_count_7 = 328320;
	protected int kill_count_8 = 328320;
	protected int kill_count_9 = 328320;
	protected int kill_count_10 = 335232;
	protected int kill_count_11 = 335232;
	protected int kill_count_12 = 338688;
	protected int kill_count_13 = 342144;
	protected int kill_count_14 = 352512;
	protected int test_mode = 2;

	protected void CREATED(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.i_ai0 = event_end;
i0 = gg.GetPlayingUserAverage();
if (i0 >= 4000) {
myself.i_ai1 = 4000;

} else if (i0 >= 2501) {
myself.i_ai1 = 3000;

} else if (i0 >= 1501) {
myself.i_ai1 = 2000;

} else {
myself.i_ai1 = 1500;

}
myself.i_ai2 = -1;
myself.i_ai3 = 0;
myself.i_ai4 = 2000000000;
i1 = myself.sm.db_value;
i2 = 1 + gg.GetEventElapsedTime() / 3600 / 24;
if (i1 / 10000000 == i2) {
gg.SetEventValue(0, i1 % 10000000);

} else {
gg.SetEventValue(0, 0);

}
gg.SetEventDebugInfo(1, myself.i_ai4);
myself.AddTimerEx(7777, 1000 * 10);
myself.RegisterGlobalMap(103, 0);
myself.RegisterGlobalMap(104, gg.GetIndexFromCreature(myself.sm));
if (test_mode == 0) {
myself.Say("br_fire_manager Created");
myself.Say("playing average = ");
myself.SayInt(myself.i_ai1);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 1) {
if (myself.i_ai0 == event_doing) {
gg.SetEventValue(0, gg.GetEventValue(0) + script_event_arg2);

}
if (test_mode == 0) {
myself.Say("total_kill_count");
myself.SayInt(gg.GetEventValue(0));

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (timer_id == 7777) {
gg.SetEventDebugInfo(0, gg.GetEventValue(0));
myself.SetDBValue(myself.sm, gg.GetEventValue(0) + 10000000 * myself.i_ai2);
i0 = 0;
i2 = myself.i_ai2;
myself.i_ai2 = 1 + gg.GetEventElapsedTime() / 3600 / 24;
if (myself.i_ai2 < 1) {
myself.AddTimerEx(7777, 1000 * 10);
super;
return;

}
if (i2 != myself.i_ai2) {
i0 = 1;
myself.i_ai3 = 0;
if (i2 > 0) {
gg.SetEventValue(0, 0);

}
if (myself.i_ai2 >= 1 && myself.i_ai2 <= 14) {
myself.i_ai0 = event_doing;
switch (myself.i_ai2) {
case 1: {
myself.i_ai4 = kill_count_1;
break;

}
case 2: {
myself.i_ai4 = kill_count_2;
break;

}
case 3: {
myself.i_ai4 = kill_count_3;
break;

}
case 4: {
myself.i_ai4 = kill_count_4;
break;

}
case 5: {
myself.i_ai4 = kill_count_5;
break;

}
case 6: {
myself.i_ai4 = kill_count_6;
break;

}
case 7: {
myself.i_ai4 = kill_count_7;
break;

}
case 8: {
myself.i_ai4 = kill_count_8;
break;

}
case 9: {
myself.i_ai4 = kill_count_9;
break;

}
case 10: {
myself.i_ai4 = kill_count_10;
break;

}
case 11: {
myself.i_ai4 = kill_count_11;
break;

}
case 12: {
myself.i_ai4 = kill_count_12;
break;

}
case 13: {
myself.i_ai4 = kill_count_13;
break;

}
case 14: {
myself.i_ai4 = kill_count_14;
break;

}

}
switch (test_mode) {
case 0: {
myself.i_ai4 = myself.i_ai4 / 10000;
break;

}
case 1: {
myself.i_ai4 = myself.i_ai4 / 1000;
break;

}

}
myself.i_ai4 = myself.i_ai4 * myself.i_ai1 / 4000;
gg.SetEventDebugInfo(1, myself.i_ai4);
if (test_mode == 0) {
myself.Say("New Day Kill Point=");
myself.SayInt(myself.i_ai4);

}

} else if (myself.i_ai2 > 14) {
myself.i_ai0 = event_end;

}

}
if (myself.i_ai0 == event_doing && myself.i_ai4 > 0) {
i3 = myself.i_ai3;
myself.i_ai3 = gg.GetEventValue(0) * 100 / myself.i_ai4;
if (myself.i_ai3 > 100) {
myself.i_ai3 = 100;

}
if (myself.i_ai3 >= 100) {
i0 = 1;
myself.i_ai0 = event_reward;
if (test_mode == 0) {
i5 = 60;

} else if (test_mode == 1) {
i5 = 60 * 10;

} else {
i5 = 3600;

}
switch (myself.i_ai2) {
case 1: {
gg.StartBuffEvent(1, 10, i5 * 1, 1);
break;

}
case 2: {
gg.StartBuffEvent(1, 10, i5 * 2, 1);
break;

}
case 3: {
gg.StartBuffEvent(1, 10, i5 * 2, 1);
break;

}
case 4: {
gg.StartBuffEvent(1, 15, i5 * 2, 1);
break;

}
case 5: {
gg.StartBuffEvent(1, 20, i5 * 2, 1);
break;

}
case 6: {
myself.RegisterGlobalMap(103, 6);
myself.AddTimerEx(1000, i5 * 5 * 1000);
gg.StartBuffEvent(2, 20573, i5 * 5, 1);
break;

}
case 7: {
gg.StartBuffEvent(1, 20, i5 * 2, 1);
break;

}
case 8: {
gg.StartBuffEvent(1, 25, i5 * 2, 1);
break;

}
case 9: {
gg.StartBuffEvent(1, 25, i5 * 3, 1);
break;

}
case 10: {
myself.RegisterGlobalMap(103, 10);
myself.AddTimerEx(1000, i5 * 5 * 1000);
gg.StartBuffEvent(2, 20574, i5 * 5, 1);
break;

}
case 11: {
gg.StartBuffEvent(1, 30, i5 * 3, 1);
break;

}
case 12: {
gg.StartBuffEvent(1, 30, i5 * 3, 1);
break;

}
case 13: {
gg.StartBuffEvent(1, 40, i5 * 3, 1);
break;

}
case 14: {
myself.RegisterGlobalMap(103, 14);
myself.AddTimerEx(1000, i5 * 8 * 1000);
gg.StartBuffEvent(2, 20575, i5 * 8, 1);
break;

}

}

} else if (i3 / 10 != myself.i_ai3 / 10) {
i0 = 1;

}

}
if (i0 > 0) {
gg.SetEventState(20090801, myself.i_ai0, myself.i_ai2, myself.i_ai3, 0, 0, 0, "", "");
if (test_mode == 0) {
myself.Say("broadcast score = ");
myself.SayInt(myself.i_ai3);

}

}
myself.AddTimerEx(7777, 1000 * 10);

} else if (timer_id == 1000) {
myself.RegisterGlobalMap(103, 0);

}
super;
	}


}