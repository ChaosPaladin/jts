package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_healer extends raid_private_standard {
	protected int HealMagic_a = 458752001;
	protected int SelfRangeBuff_a = 458752001;

	protected void CREATED() {
myself.c_ai0 = myself.sm;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (gg.Rand(3) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff_a, 1, 1, 1000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.c_ai0 = attacker;

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
if (private.hp < private.max_hp / 2 && gg.Rand(3) < 1) {
myself.AddUseSkillDesire(private, HealMagic_a, 1, 1, 1000000);

}
myself.AddUseSkillDesire(private, HealMagic_a, 1, 1, 100);
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (speller.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (myself.IsNullCreature(myself.c_ai0) == 0 && skill_name_id == HealMagic_a && myself.c_ai0 != myself.sm && myself.DistFromMe(myself.c_ai0) < 200) {
myself.AddFleeDesire(myself.c_ai0, 100000000);

}
	}


}