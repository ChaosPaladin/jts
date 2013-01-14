package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_topspin extends default_npc {
	protected int PhysicalSpecial1 = 458752001;
	protected int PhysicalSpecial2 = 458752001;
	protected int PhysicalSpecial3 = 458752001;
	protected int PhysicalSpecial4 = 458752001;
	protected int PhysicalSpecial5 = 458752001;
	protected int PhysicalSpecial6 = 458752001;

	protected void CREATED() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.ChangeMoveType(1);
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial2, 0, 1, 10000000000);
myself.AddTimerEx(5000, 60000);
myself.AddTimerEx(5001, 10000);
	}

	protected void NO_DESIRE() {
myself.ChangeMoveType(1);
myself.AddMoveAroundDesire(500, 50);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 1) {
if (myself.i_ai3 == 0) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;
myself.AddTimerEx(5002, 20000);

}

} else if (myself.i_ai4 == 0) {
myself.i_ai4 = 2;
myself.AddTimerEx(5002, 20000);

}

} else if (script_event_arg1 == 2) {
if (myself.i_ai3 == 0) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 2;
myself.AddTimerEx(5002, 20000);

}

} else if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;
myself.AddTimerEx(5002, 20000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5000) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(343146497));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(343212033));
if (gg.Rand(10) < 5) {
myself.i_ai3 = 0;
myself.AddUseSkillDesire(myself.sm, 343212033, 1, 1, 10000000000);

} else {
myself.i_ai3 = 1;
myself.AddUseSkillDesire(myself.sm, 343146497, 1, 1, 10000000000);

}
myself.AddTimerEx(5000, 60000);

} else if (timer_id == 5001) {
if (myself.i_ai3 == 0) {
if (myself.i_ai4 == 0) {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial2, 0, 1, 10000000000);

} else if (myself.i_ai4 == 1) {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial1, 0, 1, 10000000000);

} else {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial3, 0, 1, 10000000000);

}

} else if (myself.i_ai4 == 0) {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial5, 0, 1, 10000000000);

} else if (myself.i_ai4 == 1) {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial4, 0, 1, 10000000000);

} else {
myself.AddUseSkillDesire(myself.sm, PhysicalSpecial6, 0, 1, 10000000000);

}
myself.ChangeMoveType(1);
myself.AddTimerEx(5001, 10000);

} else if (timer_id == 5002) {
if (myself.i_ai4 == 0) {

} else if (myself.i_ai4 == 1) {
myself.i_ai4 = 0;

} else if (myself.i_ai4 == 2) {
myself.i_ai4 = 0;

}

}
super;
	}


}