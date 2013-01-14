package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_ddmagic2_solina extends wizard_ddmagic2_heal {
	protected int W_ShortRangeDDMagic = 458752001;
	protected int W_LongRangeDDMagic = 458752001;
	protected int MagicHeal = 458752001;

	protected void CREATED() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void NO_DESIRE() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0) {
if (creature.is_pc != 0) {
if (creature.occupation == 30 || creature.occupation == 16 || creature.occupation == 5 || creature.occupation == 90 || creature.occupation == 105 || creature.occupation == 97) {
if (myself.i_ai3 == 0) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(10075, creature.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(10076, creature.name, "", "", "", ""));

}
myself.i_ai3 = 1;

}

} else {
if (myself.DistFromMe(creature) > 100 && gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
i0 = 0;
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}
if (myself.GetHateInfoCount() == 0 && i0 == 1) {
myself.AddHateInfo(creature, 300, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i6, HandlerParam i0) {
if (attacker.is_pc != 0) {
if (attacker.occupation == 30 || attacker.occupation == 16 || attacker.occupation == 5 || attacker.occupation == 90 || attacker.occupation == 105 || attacker.occupation == 97) {
if (myself.i_ai4 == 0) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(10077, attacker.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(10078, attacker.name, "", "", "", ""));

}
myself.i_ai4 = 1;

}

}

}
super;
	}


}