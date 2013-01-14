package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss06_angel extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void CREATED() {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = 0;
myself.i_ai2 = 100;
myself.i_ai3 = 0;
myself.AddTimerEx(2001, 5000);
myself.AddTimerEx(2002, 5000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001) {
i0 = 5000 + gg.Rand(5) * 1000;
myself.AddTimerEx(2001, i0);
if (myself.boss.flag == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 0) {
myself.RemoveAttackDesire(myself.boss.id);
myself.LookNeighbor(300);

}

}
myself.i_ai1 = 0;
if (myself.IsNullCreature(myself.c_ai2) == 0) {
if (myself.c_ai2.alive == 1) {
myself.AddAttackDesire(myself.c_ai2, 1, myself.i_ai2 / myself.sm.max_hp / 0.050000 * 100);

}

}

} else {
myself.i_ai1 = 0;
if (myself.boss.flag == 1 && myself.i_ai0 == 1 || myself.i_ai0 == 2) {
myself.i_ai1 = 1;

} else if (myself.boss.flag == 2 && myself.i_ai0 == 3 || myself.i_ai0 == 4) {
myself.i_ai1 = 1;

} else if (myself.boss.flag == 3 && myself.i_ai0 == 1 || myself.i_ai0 == 3) {
myself.i_ai1 = 1;

} else if (myself.boss.flag == 4 && myself.i_ai0 == 2 || myself.i_ai0 == 4 || myself.i_ai0 == 5) {
myself.i_ai1 = 1;

}
if (myself.i_ai1 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 0) {
myself.RemoveAttackDesire(myself.boss.id);

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.AddAttackDesire(myself.c_ai2, 1, 1.000000 * myself.i_ai2 / myself.sm.level + 7 * 100);

}

}

} else {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 1) {
myself.RemoveAllAttackDesire();

}

}
myself.AddAttackDesire(myself.boss, 1, 10000);

}

}

}
if (timer_id == 2002) {
if (myself.IsMyBossAlive() == 0 || myself.boss.flag == 6) {
myself.Despawn();

} else {
myself.AddTimerEx(2002, 5000);
if (myself.i_ai1 == 1) {
myself.AddAttackDesire(myself.boss, 1, 10000);

} else if (myself.i_ai3 == 3) {
myself.i_ai3 = 0;
myself.AddAttackDesire(myself.boss, 1, 1000);

} else if (myself.p_state != 3) {
myself.i_ai3 = myself.i_ai3 + 1;
myself.LookNeighbor(300);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam f0) {
if (attacker.is_pc == 1) {
myself.c_ai2 = attacker;
myself.i_ai2 = damage;

}
if (myself.i_ai1 == 0) {
c0 = attacker;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

} else {
c0 = myself.boss;

}
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(270794753) < myself.sm.mp && myself.Skill_GetConsumeHP(270794753) < myself.sm.hp && myself.Skill_InReuseDelay(270794753) == 0) {
myself.AddUseSkillDesire(c0, 270794753, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 5 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50) {
if (myself.Skill_GetConsumeMP(270860289) < myself.sm.mp && myself.Skill_GetConsumeHP(270860289) < myself.sm.hp && myself.Skill_InReuseDelay(270860289) == 0) {
myself.AddUseSkillDesire(myself.sm, 270860289, 1, 1, 1000000);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.InMyTerritory(creature) == 0 || creature.alive == 0 || creature.is_pc == 0) {
return;

}
if (myself.i_ai1 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 0) {
myself.RemoveAttackDesire(myself.boss.id);

}

}
myself.AddAttackDesire(creature, 1, 200);

}
if (myself.IsNullCreature(myself.c_ai2) == 1) {
myself.c_ai2 = creature;
myself.i_ai2 = 100;

} else if (myself.c_ai2.alive == 0) {
myself.c_ai2 = creature;
myself.i_ai2 = 100;

}
	}


}