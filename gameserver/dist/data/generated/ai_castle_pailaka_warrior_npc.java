package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_warrior_npc extends ai_castle_pailaka_npc {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(attacker) == 0) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
myself.AddAttackDesire(attacker, 0, damage);
if (myself.DistFromMe(attacker) >= 300) {
myself.BroadcastScriptEvent(2117004, gg.GetIndexFromCreature(attacker), 1000);

}

}

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (Skill01_ID != 458752001 && gg.Rand(100) < Skill01_Prob) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, 1000000);

}

}
if (Skill02_ID != 458752001 && gg.Rand(100) < Skill02_Prob) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, 1000000);

}

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(attacker) == 0) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
if (myself.CanAttack(attacker) == 1) {
myself.MakeAttackEvent(attacker, damage / 2, 0);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam c0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
myself.MakeAttackEvent(creature, 100, 0);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 2117006) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 0, 10);
myself.MakeAttackEvent(c0, 10, 0);

}

}
super;
	}


}