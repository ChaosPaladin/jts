package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_run_away_fiend_archer extends wizard {
	protected int flee_x = 0;
	protected int flee_y = 0;
	protected int flee_z = 0;
	protected int W_FiendArcher = 272039937;

	protected void CREATED(HandlerParam c0) {
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam skill_name_id) {
if (gg.IsNull(myself.top_desire_target) == 0) {
myself.c_ai0 = myself.top_desire_target;

} else {
myself.c_ai0 = attacker;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737));
if (i0 >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.i_ai3 == 1) {
myself.i_ai3 = 3;
myself.RemoveAllDesire();

}

}

}
if (myself.sm.hp < myself.sm.max_hp / 2.000000 && flee_x != 0 && flee_y != 0 && flee_z != 0 && myself.i_ai3 == 0) {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.i_ai3 = 1;
myself.RemoveAllDesire();
myself.AddMoveToDesire(flee_x, flee_y, flee_z, 2000);
return;

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100 + 300), 0, 1, 1);

} else {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100), 0, 1, 1);

}

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001 && myself.i_ai3 == 2) {
if (myself.sm.p_state != 3) {
if (gg.IsNull(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 1000);
i0 = gg.GetIndexFromCreature(myself.c_ai0);
myself.BroadcastScriptEvent(10000, i0, 400);

}
myself.i_ai3 = 3;

}

}
if (timer_id == 2002 && myself.i_ai0 == 2) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 50000);

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.DistFromMe(h0.creature) < 100) {
myself.AddFleeDesire(h0.creature, 1000);
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam h0, HandlerParam i0) {
if (myself.i_ai3 == 1) {
if (flee_x == x && flee_y == y && flee_z == z) {
myself.RemoveAllDesire();
myself.AddMoveAroundDesire(1000, 50);
myself.i_ai3 = 2;
if (gg.Rand(100) < 50) {
myself.AddTimerEx(2001, 1000);

} else {
myself.AddTimerEx(2002, 1000);

}

}

} else if (myself.i_ai3 == 3) {
if (myself.start_x == x && myself.start_y == y && myself.start_z == z) {
myself.i_ai3 = 0;

}

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}
	}


}