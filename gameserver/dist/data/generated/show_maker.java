package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class show_maker extends default_maker {
	protected int on_start_spawn = 0;
	protected int show_index = 0;
	protected int l2_time_hour = 0;
	protected int l2_time_min = 0;
	protected String maker_name1 = "etc08_npc1816_01m2";
	protected String maker_name2 = "etc08_npc1816_01m3";
	protected String maker_name3 = "etc08_npc1816_01m4";
	protected String maker_name4 = "etc08_npc1816_01m5";
	protected String maker_name5 = "etc08_npc1816_01m6";
	protected String maker_name6 = "etc08_npc1816_01m7";
	protected String maker_name7 = "etc08_npc1816_01m8";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
i2 = gg.GetL2Time(2);
myself.AddTimerEx(1816500, 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1816500) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
if (i0 == 20 && i1 == 30 && myself.i_ai2 == 0) {
myself.i_ai0 = 0;
myself.i_ai1 = 1;
myself.i_ai2 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
myself.AddTimerEx(1816600, 1000);

}
myself.AddTimerEx(1816500, 1000);

}
if (timer_id == 1816600) {
if (myself.i_ai1 == 0) {
myself.AddTimerEx(1816600, 1000);
return;

}
switch (myself.i_ai0) {
case 1: {
maker0 = gg.GetNpcMaker(maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 2: {
maker0 = gg.GetNpcMaker(maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 3: {
maker0 = gg.GetNpcMaker(maker_name4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 4: {
maker0 = gg.GetNpcMaker(maker_name5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 5: {
maker0 = gg.GetNpcMaker(maker_name6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 6: {
maker0 = gg.GetNpcMaker(maker_name7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;
break;

}
case 7: {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.AddTimerEx(1816500, 1000);

}

}
myself.AddTimerEx(1816600, 5000);

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
switch (script_event_arg1) {
case 1: {
myself.i_ai0 = myself.i_ai0 + 1;
myself.i_ai1 = 1;
break;

}
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, script_event_arg2, 0);

}

}

}

}
break;

}

}
	}


}