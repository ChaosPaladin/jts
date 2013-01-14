package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_saint_middle_ddmagic extends wizard_saint_basic {
	protected int W_MiddleRangeDDMagic = 272039937;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
super;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
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
if (myself.DistFromMe(attacker) > 100 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_MiddleRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_MiddleRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_MiddleRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_MiddleRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_MiddleRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_MiddleRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_MiddleRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_MiddleRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_MiddleRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_MiddleRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
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
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(h0.creature, DeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, DeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
if (gg.Rand(100) < 33 && myself.DistFromMe(h0.creature) < 40) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_MiddleRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_MiddleRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_MiddleRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_MiddleRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_MiddleRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.DistFromMe(h0.creature) < 100) {
myself.AddFleeDesire(h0.creature, 1000000);

} else {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(h0.creature, DeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, DeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
if (gg.Rand(100) < 33 && myself.DistFromMe(h0.creature) < 40) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_MiddleRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_MiddleRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_MiddleRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_MiddleRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_MiddleRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}

} else if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
myself.AddAttackDesire(h0.creature, 1, 1000);

}
	}


}