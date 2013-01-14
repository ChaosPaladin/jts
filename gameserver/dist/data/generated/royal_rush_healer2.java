package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_healer2 extends wizard {
	protected int W_RangeHeal = 266403841;
	protected int W_LongRangeDDMagic = 266403841;
	protected int W_SelfRangeDDMagic = 262209537;
	protected int W_SelfRangeDeBuff = 262209537;

	protected void CREATED() {
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_SelfRangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(W_SelfRangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_SelfRangeDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}
if (gg.Rand(100) < 33 && myself.DistFromMe(attacker) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_RangeHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(W_RangeHeal) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_RangeHeal) == 0) {
myself.AddUseSkillDesire(attacker, W_RangeHeal, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_RangeHeal, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

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
if (myself.i_ai0 != 1) {
if (gg.Rand(100) < 33 && myself.DistFromMe(h0.creature) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}

}
	}


}