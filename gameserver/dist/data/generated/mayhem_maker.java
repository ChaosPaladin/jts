package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mayhem_maker extends default_maker {
	protected String area_explosion = "19_26_tolles_destruction1";
	protected String tolles_door1 = "tolles_door_51";
	protected String tolles_door2 = "tolles_door_52";
	protected String maker_4f_tel_name = "gludio58_1926_trap04m1";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
for (i0 = 11; i0 <= 12; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 78010013) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
gg.Castle_GateOpenClose2(tolles_door1, 0);
gg.Castle_GateOpenClose2(tolles_door2, 0);
maker0 = gg.GetNpcMaker(maker_4f_tel_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (script_event_arg1 == 78010022 || script_event_arg1 == 78010023 || script_event_arg1 == 78010024) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}
if (script_event_arg1 == 78010023) {
for (i0 = 0; i0 <= 10; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}
gg.Area_SetOnOff(area_explosion, 1);
myself.i_ai0 = 0;
myself.AddTimerEx(78001, 5 * 60 * 1000);

}
if (script_event_arg1 == 78010022 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddTimerEx(78002, 60 * 60 * 1000);

}

} else if (script_event_arg1 == 78010002 || script_event_arg1 == 78010030) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

} else if (script_event_arg1 == 1001) {
for (i0 = 11; i0 <= 12; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}
gg.Castle_GateOpenClose2(tolles_door1, 1);
gg.Castle_GateOpenClose2(tolles_door2, 1);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
gg.Area_SetOnOff(area_explosion, 0);
maker0 = gg.GetNpcMaker(maker_4f_tel_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (timer_id == 78002 && myself.i_ai0 == 1) {
gg.SendMakerScriptEvent(myself, 78010023, 0, 0);

}
	}

	protected void ON_NPC_DELETED() {
	}


}