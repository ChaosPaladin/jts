package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_fav_8_main extends default_maker {
	protected String sub_maker_name = "gludio58_1926_80";
	protected String sub_maker_name_1 = "gludio58_1926_801m1";
	protected String sub_maker_name_2 = "gludio58_1926_802m1";
	protected String sub_maker_name_3 = "gludio58_1926_803m1";
	protected String sub_maker_name_4 = "gludio58_1926_804m1";
	protected int death_count = 7;
	protected String f6_maker_name = "gludio58_1926_601m1";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 1;
myself.i_ai1 = gg.Rand(death_count);
myself.i_ai2 = gg.Rand(death_count);
myself.i_ai3 = gg.Rand(death_count);
myself.i_ai4 = gg.Rand(death_count);
myself.AddTimerEx(78001, 1 * 1000);
myself.AddTimerEx(78002, 3 * 60 * 60 * 1000);
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0) {
if (script_event_arg1 == 78010019) {
switch (script_event_arg3) {
case 1: {
myself.i_ai1 = myself.i_ai1 + 1;
break;

}
case 2: {
myself.i_ai2 = myself.i_ai2 + 1;
break;

}
case 3: {
myself.i_ai3 = myself.i_ai3 + 1;
break;

}
case 4: {
myself.i_ai4 = myself.i_ai4 + 1;
break;

}

}
myself.AddTimerEx(78001, 10 * 1000);

} else if (script_event_arg1 == 78010016) {
if (script_event_arg2 == 3) {
if (myself.i_ai0 != -1) {
maker0 = gg.GetNpcMaker(sub_maker_name + gg.IntToStr(script_event_arg3) + "m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010003, 0, script_event_arg3);
myself.i_ai0 = -1;
maker0 = gg.GetNpcMaker(f6_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010034, 0, script_event_arg3);

}

}

}
myself.i_ai1 = gg.Rand(death_count);
myself.i_ai2 = gg.Rand(death_count);
myself.i_ai3 = gg.Rand(death_count);
myself.i_ai4 = gg.Rand(death_count);
myself.AddTimerEx(78001, 5 * 60 * 1000);

} else {
if (gg.Rand(1000) > 500 && script_event_arg2 < 3) {
myself.i_ai0 = script_event_arg2 + 1;

} else {
myself.i_ai0 = script_event_arg2;

}
switch (script_event_arg3) {
case 1: {
myself.i_ai1 = 0;
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 2: {
myself.i_ai2 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 3: {
myself.i_ai3 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 4: {
myself.i_ai4 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
break;

}

}
myself.AddTimerEx(78001, 10 * 1000);

}

} else if (script_event_arg1 == 78010040) {
myself.i_ai0 = script_event_arg2;
switch (script_event_arg3) {
case 1: {
myself.i_ai1 = 0;
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 2: {
myself.i_ai2 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 3: {
myself.i_ai3 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai4 = myself.i_ai4 + 1 * gg.Rand(3);
break;

}
case 4: {
myself.i_ai4 = 0;
myself.i_ai1 = myself.i_ai1 + 1 * gg.Rand(3);
myself.i_ai2 = myself.i_ai2 + 1 * gg.Rand(3);
myself.i_ai3 = myself.i_ai3 + 1 * gg.Rand(3);
break;

}

}
myself.AddTimerEx(78001, 10 * 1000);

} else if (script_event_arg1 == 78010034) {
myself.i_ai0 = -1;

} else if (script_event_arg1 == 78010004) {
myself.i_ai0 = 1;

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam def0) {
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
if (myself.i_ai1 >= myself.i_ai2 && myself.i_ai1 >= myself.i_ai3 && myself.i_ai1 >= myself.i_ai4 && myself.i_ai1 >= death_count && myself.i_ai0 > 0) {
maker0 = gg.GetNpcMaker(sub_maker_name_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010018, myself.i_ai0, 1);
myself.i_ai0 = 0;

}

} else if (myself.i_ai2 >= myself.i_ai1 && myself.i_ai2 >= myself.i_ai3 && myself.i_ai2 >= myself.i_ai4 && myself.i_ai2 >= death_count && myself.i_ai0 > 0) {
maker0 = gg.GetNpcMaker(sub_maker_name_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010018, myself.i_ai0, 2);
myself.i_ai0 = 0;

}

} else if (myself.i_ai3 >= myself.i_ai1 && myself.i_ai3 >= myself.i_ai2 && myself.i_ai3 >= myself.i_ai4 && myself.i_ai3 >= death_count && myself.i_ai0 > 0) {
maker0 = gg.GetNpcMaker(sub_maker_name_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010018, myself.i_ai0, 3);
myself.i_ai0 = 0;

}

} else if (myself.i_ai4 >= myself.i_ai1 && myself.i_ai4 >= myself.i_ai2 && myself.i_ai4 >= myself.i_ai3 && myself.i_ai4 >= death_count && myself.i_ai0 > 0) {
maker0 = gg.GetNpcMaker(sub_maker_name_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010018, myself.i_ai0, 4);
myself.i_ai0 = 0;

}

}

}
if (timer_id == 78002) {
if (myself.i_ai0 != 0) {
myself.i_ai0 = 1;
myself.i_ai1 = gg.Rand(death_count);
myself.i_ai2 = gg.Rand(death_count);
myself.i_ai3 = gg.Rand(death_count);
myself.i_ai4 = gg.Rand(death_count);
myself.AddTimerEx(78001, 1 * 1000);
myself.AddTimerEx(78002, 3 * 60 * 60 * 1000);

} else {
myself.AddTimerEx(78002, 15 * 60 * 1000);

}

}
	}


}