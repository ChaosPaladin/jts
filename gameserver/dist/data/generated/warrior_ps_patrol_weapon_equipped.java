package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ps_patrol_weapon_equipped extends warrior_physicalspecial {
	protected int MoveAroundSocial = 0;
	protected int SelfRangePhysicalSpecial = 0;
	protected int DeBuff = 458752001;
	protected int DeBuff2 = 458752001;

	protected void CREATED() {
myself.AddMoveAroundDesire(5, 5);
myself.c_ai0 = myself.sm;
myself.i_ai3 = 0;
super;
	}

	protected void NO_DESIRE() {
myself.i_ai3 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0 && myself.IsWeaponEquippedInHand(creature) == 1) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(creature, DeBuff, 0, 1, 1000000);

}
myself.c_ai0 = creature;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff2, 0, 1, 1000000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 10000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == DeBuff) {
if (myself.i_ai3 == 0) {
myself.Say(gg.MakeFString(1121006, "", "", "", "", ""));
myself.i_ai3 = 1;

}
myself.AddAttackDesire(myself.c_ai0, 1, 10000);

}
	}


}