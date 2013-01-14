package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss01_nurse_ant extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 1.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 20);

} else {
myself.AddMoveAroundDesire(40, 20);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (private.npc_class_id == 1029001) {
if (private.hp < private.max_hp) {
if (myself.DistFromMe(private) > 2500 && myself.p_state == 10 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target.npc_class_id == 1029002) {

} else {
myself.AddUseSkillDesire(private, 263454721, 1, 1, 1000000);

}

}

}
if (private.npc_class_id == 1029002) {
if (private.hp < private.max_hp) {
myself.AddUseSkillDesire(private, 263454721, 1, 1, 100);
myself.AddUseSkillDesire(private, 263716865, 1, 1, 100);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (private == myself.boss) {
myself.Despawn();

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (attacker.z - myself.sm.z > 500 || attacker.z - myself.sm.z < -500) {

} else if (attacker.level > myself.sm.level + 8) {
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
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0) {
if (speller.z - myself.sm.z > 500 || speller.z - myself.sm.z < -500) {

} else if (speller.level > myself.sm.level + 8) {
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

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (creature.z - myself.sm.z > 500 || creature.z - myself.sm.z < -500) {

} else if (creature.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);
myself.RemoveAttackDesire(creature.id);
return;

} else {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);

}

}

} else {
super;

}
	}


}