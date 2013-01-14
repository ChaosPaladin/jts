package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class air_4th_dummy_maker extends default_air_maker {
	protected String RaidMakerName = "rumwarsha_e1225_03m1";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 10025) {
myself.enabled = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.i_ai0 = 0;

}
if (script_event_arg1 == 1001) {
myself.enabled = 1;

}
switch (script_event_arg1) {
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
if (myself.i_ai0 != 0) {
return;

} else {
myself.i_ai0 = 1;

}
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
myself.AddTimerEx(1224001, 2 * 60 * 1000);
break;

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1224001) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
maker0 = gg.GetNpcMaker(RaidMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}