package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_door_trap extends default_trap {
	protected String DoorName = "cyratal_cave_a_b";
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int IsItemCheck = 1;
	protected int DoorItem = 9694;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (IsItemCheck == 1) {
if (gg.OwnItemCount(c0, DoorItem) >= 1) {
if (myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.c_ai0 = c0;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.c_ai0.is_pc == 1) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
myself.DeleteItem1(c0, DoorItem, 1);

}

}

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12550) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
	}

	protected void TRAP_STEP_OUT(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (c0 == myself.c_ai0) {
myself.i_ai1 = 0;
gg.Castle_GateOpenCloseEx(DoorName, 1, myself.InstantZone_GetId());
myself.c_ai0 = myself.sm;

}

}
	}


}