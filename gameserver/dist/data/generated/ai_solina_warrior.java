package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_solina_warrior extends warrior {
	protected int PhysicalSpecial = 413597697;
	protected int TIMER = 100;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 10000);

}

}
myself.AddMoveAroundDesire(5, 5);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.IsNullCreature(myself.top_desire_target) == 1) {
myself.AddAttackDesire(creature, 1, 1000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 10 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
myself.i_ai0 = 1;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0) {
if (script_event_arg1 == 21140014 && myself.i_ai0 == 1) {
i0 = script_event_arg2;
if (gg.Rand(100) < 30) {
myself.AddAttackDesireEx(i0, 1, 1, 100);

}

}
myself.AddTimerEx(TIMER, 30 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER) {
myself.i_ai0 = 0;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1000);
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}


}