package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_heretic2 extends party_leader_physicalspecial2 {
	protected int SpecialAttack = 0;
	protected int SelfMagicHeal = 458752001;
	protected int HelpCastRange = 500;
	protected int DistNoDesire = 500;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
if (creature != myself.sm) {
if (myself.Skill_GetConsumeMP(SpecialAttack) < myself.sm.mp && myself.Skill_GetConsumeHP(SpecialAttack) < myself.sm.hp && myself.Skill_InReuseDelay(SpecialAttack) == 0) {
myself.AddUseSkillDesire(creature, SpecialAttack, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(SelfMagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfMagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(SelfMagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfMagicHeal, 1, 1, 1000000);

}

}
return;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.BroadcastScriptEventEx(10033, gg.GetIndexFromCreature(attacker), gg.GetIndexFromCreature(myself.sm), HelpCastRange);

}
if (myself.sm.hp < myself.sm.max_hp * 0.400000 && gg.Rand(100) < 33) {
if (gg.Rand(100) < 33 && attacker.occupation == 5 || attacker.occupation == 90 || myself.IsInCategory(3, attacker.occupation)) {
myself.BroadcastScriptEventEx(10002, gg.GetIndexFromCreature(attacker), gg.GetIndexFromCreature(myself.sm), HelpCastRange);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0, HandlerParam i0) {
if (myself.sm.hp < myself.sm.max_hp * 0.400000 && gg.Rand(100) < 33) {
if (myself.i_ai3 == 0) {
myself.LookNeighbor(300);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == SelfMagicHeal && success == 1) {
myself.i_ai3 = 1;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (speller.is_pc != 0 && myself.IsInCategory(12, speller.npc_class_id) == 0) {
if (myself.sm.hp < myself.sm.max_hp * 0.400000 && gg.Rand(100) < 33) {
if (myself.IsInCategory(3, speller.occupation)) {
myself.BroadcastScriptEventEx(10002, gg.GetIndexFromCreature(speller), gg.GetIndexFromCreature(myself.sm), HelpCastRange);

}

}

}
super;
	}

	protected void OUT_OF_TERRITORY() {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);
myself.BroadcastScriptEventEx(10035, 0, gg.GetIndexFromCreature(myself.sm), DistNoDesire);
	}


}