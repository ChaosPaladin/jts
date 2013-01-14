package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_casting_3skill_magical2_revival extends warrior_casting_3skill_magical2_revival {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.DistFromMe(creature) > 100) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic1) == 0) {
myself.AddUseSkillDesire(creature, DDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(creature, DDMagic2, 0, 1, 1000000);

}

}

}
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.p_state == 1) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(creature, DeBuff, 0, 1, 1000000);

}

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}


}