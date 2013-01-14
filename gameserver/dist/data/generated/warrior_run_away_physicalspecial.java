package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_run_away_physicalspecial extends warrior {
	protected int flee_x = 0;
	protected int flee_y = 0;
	protected int flee_z = 0;
	protected int PhysicalSpecial = 264241153;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (gg.IsNull(myself.top_desire_target) == 0) {
myself.c_ai0 = myself.top_desire_target;

} else {
myself.c_ai0 = attacker;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737));
if (i0 >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 3;
myself.RemoveAllDesire();

}
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

}

}

}
if (myself.sm.hp < myself.sm.max_hp / 2.000000 && flee_x != 0 && flee_y != 0 && flee_z != 0 && myself.i_ai0 == 0) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.i_ai0 = 1;
myself.RemoveAllDesire();
myself.AddMoveToDesire(flee_x, flee_y, flee_z, 2000);
return;

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai0 == 1) {
if (flee_x == x && flee_y == y && flee_z == z) {
myself.RemoveAllDesire();
myself.AddMoveAroundDesire(1000, 50);
myself.i_ai0 = 2;
if (gg.Rand(100) < 50) {
myself.AddTimerEx(2001, 1000);

} else {
myself.AddTimerEx(2002, 1000);

}

}

}
if (myself.i_ai0 == 3) {
if (myself.start_x == x && myself.start_y == y && myself.start_z == z) {
myself.i_ai0 = 0;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001 && myself.i_ai0 == 2) {
if (gg.IsNull(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 1000);
i0 = gg.GetIndexFromCreature(myself.c_ai0);
myself.BroadcastScriptEvent(10000, i0, 400);

}
myself.i_ai0 = 3;

}
if (timer_id == 2002 && myself.i_ai0 == 2) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 50000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10000) {
if (myself.sm.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (gg.IsNull(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}

}
	}


}