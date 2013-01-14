package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_ag_slow_type2 extends party_leader_pa_slow_type2 {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.p_state != 3) {
i6 = gg.Rand(100);
if (myself.DistFromMe(creature) > 100 && i6 < 10) {
if (myself.Skill_GetConsumeMP(DDMagicSlow) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagicSlow) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagicSlow) == 0) {
myself.AddUseSkillDesire(creature, DDMagicSlow, 0, 1, 1000000);

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