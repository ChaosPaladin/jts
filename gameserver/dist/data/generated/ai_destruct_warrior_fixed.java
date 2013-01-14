package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_warrior_fixed extends ai_destruct_basic {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 0;
	protected int SelfRangeDD_ID = 458752001;
	protected int SelfRangeDD_Prob = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage);

}
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, 1000000);

}

}

}

}

}
if (SelfRangeDD_ID != 458752001) {
if (gg.Rand(10000) < SelfRangeDD_Prob) {
if (myself.Skill_GetConsumeMP(SelfRangeDD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDD_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDD_ID, 0, 0, 1000000);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.MakeAttackEvent(attacker, damage / 10, 0);
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.MakeAttackEvent(target.master, 100, 0);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
myself.MakeAttackEvent(creature, 100, 0);

}
super;
	}


}