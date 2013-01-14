package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wizard_ag_saint extends party_leader_wizard_saint {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.GetHateInfoCount() == 0) {
if (gg.Rand(100) < 33 && myself.DistFromMe(creature) < 40) {
if (myself.Skill_GetConsumeMP(RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(RangeDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, RangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, RangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic1, 0, 1, 1000000);

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
super;

}
	}


}