package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_warrior_stone extends warrior_physicalspecial {
	protected int DeBuff = 277348353;
	protected int SelfRangeDDMagic = 277348353;
	protected int SelfBuff1 = 277348353;
	protected int SelfBuff2 = 277348353;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 1000000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.GetLifeTime() > 7 && myself.p_state != 3) {
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

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 1, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff2, 1, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff2, 1, 1, 1000000);

}

}

}
super;
	}


}