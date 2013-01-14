package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ice_fairy_sirr_maker extends Close_Door_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 10005) {
myself.i_ai0 = myself.i_ai0 + 1;
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(10001, myself.i_ai0, 0);

}
if (script_event_arg1 == 11040) {
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(11040, script_event_arg2, 0);

}
	}

	protected void ON_DOOR_EVENT(HandlerParam enabled, HandlerParam i0, HandlerParam i1, HandlerParam def0, HandlerParam maker0) {
if (enabled == 0) {
if (myself.enabled) {
return;

}
myself.enabled = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_1m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11037, 0, 0);

}

}

}

}

} else {
if (myself.enabled == 0) {
return;

}
myself.enabled = 0;
for (i1 = 0; i1 < myself.def_count; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
myself.i_ai0 = 0;
super;
	}


}