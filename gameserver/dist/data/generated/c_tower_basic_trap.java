package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_basic_trap extends default_trap {
	protected String AreaName = "keep_damage_trap_default";
	protected int IdentityNumber = 0;
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int trap_skill = 458752001;

	protected void CREATED() {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);
if (gg.IsSameString(AreaName, "") == 0) {
myself.i_ai0 = 0;
myself.AddTimerEx(9099, 10000);

}
	}

	protected void TRAP_DEFUSED(HandlerParam i0) {
myself.c_ai0 = gg.GetCreatureFromID(i0);
myself.ShowSystemMessage(myself.c_ai0, 2285);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9099 && myself.i_ai0 == 0) {
gg.Area_SetOnOff(AreaName, 1);
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 1);

} else if (timer_id == 9099 && myself.i_ai0 == 1) {
gg.Area_SetOnOff(AreaName, 0);
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, 0);
myself.i_ai0 = 0;

}
myself.AddTimerEx(9099, 20000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 88011 && script_event_arg2 == IdentityNumber) {
myself.i_ai0 = 1;

}
	}


}