package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trap_check_npc extends default_trap {
	protected String DoorName = "cyratal_cave_a_e";
	protected int IsDetected = 0;
	protected int IsDefused = 0;

	protected void CREATED() {
	}

	protected void TRAP_DETECTED(HandlerParam i0, HandlerParam i1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
myself.Shout(gg.MakeFString(1800077, "", "", "", "", ""));
	}

	protected void TRAP_DEFUSED(HandlerParam i0) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 0);
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 12557) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
	}


}