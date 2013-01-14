package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_ag_stone extends party_leader {
	protected int RangeHold_a = 458752001;
	protected int DeBuff = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam i1, HandlerParam damage) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (myself.i_ai1 < 3 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) == -1) {
if (myself.i_ai1 == 0) {
myself.c_ai0 = attacker;
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, DeBuff, 0, 1, 1000000);

}
myself.i_ai1 = myself.i_ai1 + 1;

} else if (myself.i_ai1 == 1 && myself.c_ai0 != attacker) {
myself.c_ai1 = attacker;
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, DeBuff, 0, 1, 1000000);

}
myself.i_ai1 = myself.i_ai1 + 1;

} else if (myself.i_ai1 == 2 && myself.c_ai0 != attacker && myself.c_ai1 != attacker) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}
myself.i_ai1 = myself.i_ai1 + 1;

}

} else if (gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(RangeHold_a) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeHold_a) < myself.sm.hp && myself.Skill_InReuseDelay(RangeHold_a) == 0) {
myself.AddUseSkillDesire(myself.sm, RangeHold_a, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
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

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == DeBuff) {
myself.RemoveAttackDesire(target.id);

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_2m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10005, 0, 0);

}
	}


}