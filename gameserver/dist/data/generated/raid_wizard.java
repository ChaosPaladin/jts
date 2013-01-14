package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_wizard extends raid_private_standard {
	protected int Debuff_a = 458752001;
	protected int DDMagic_a = 458752001;

	protected void CREATED() {
myself.c_ai0 = myself.sm;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.c_ai0 != myself.sm && myself.DistFromMe(myself.c_ai0) < 200) {
myself.AddFleeDesire(myself.c_ai0, 100000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.c_ai0 = attacker;
if (myself.IsMyBossAlive() == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, DDMagic_a, 0, 1, 1000000);

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff_a)) == -1 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, Debuff_a, 0, 1, 1000000);

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.level >= myself.sm.level + 8) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(Rand * 15 * 10) < 1) {
myself.AddUseSkillDesire(attacker, DDMagic_a, 0, 1, 1000000);

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff_a)) == -1 && gg.Rand(Rand * 15 * 10) < 1) {
myself.AddUseSkillDesire(attacker, Debuff_a, 0, 1, 1000000);

}

} else {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, DDMagic_a, 0, 1, 1000000);

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff_a)) == -1 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, Debuff_a, 0, 1, 1000000);

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(speller, DDMagic_a, 0, 1, 1000000);

}
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Debuff_a)) == -1 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(speller, Debuff_a, 0, 1, 1000000);

}
super;
	}


}