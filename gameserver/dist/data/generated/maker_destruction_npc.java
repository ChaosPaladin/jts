package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruction_npc extends default_maker {
	protected String ambush_maker_11 = "rumwarsha1224_611";
	protected String ambush_maker_12 = "rumwarsha1224_612";
	protected String ambush_maker_21 = "rumwarsha1224_621";
	protected String ambush_maker_22 = "rumwarsha1224_622";
	protected String ambush_maker_11 = "rumwarsha1224_601";
	protected String ambush_maker_12 = "rumwarsha1224_602";
	protected int FieldCycle = 2;

	protected void ON_START() {
if (FieldCycle != -1) {
myself.RegisterFieldCycleEventEx(FieldCycle);

}
super;
	}

	protected void ON_FIELD_CYCLE_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam i1, HandlerParam def0) {
if (event_id == FieldCycle) {
if (state == 2) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(9842002, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 1224014) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}

} else if (script_event_arg1 == 1224013) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}

}
	}


}