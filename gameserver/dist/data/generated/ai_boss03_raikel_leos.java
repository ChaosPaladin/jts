package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss03_raikel_leos extends party_private {
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.AddTimerEx(2001, 10000);
myself.i_ai0 = myself.boss.flag;
myself.i_ai1 = 1;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.IsNullCreature(myself.boss) == 0 && myself.boss.flag != myself.i_ai0 || myself.DistFromMe(myself.boss) > 3000 && myself.i_ai1 == 1 && myself.IsMyBossAlive() != 0) {
myself.i_ai0 = myself.boss.flag;
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));
myself.RemoveAllAttackDesire();

}
myself.AddTimerEx(2001, 10000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.level <= myself.boss.level + 8) {
if (gg.Rand(100) < 5) {
if (myself.Skill_GetConsumeMP(266534916) < myself.sm.mp && myself.Skill_GetConsumeHP(266534916) < myself.sm.hp && myself.Skill_InReuseDelay(266534916) == 0) {
myself.AddUseSkillDesire(attacker, 266534916, 0, 1, 1000000);

}

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.i_ai1 = 0;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
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

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20000);

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

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.level > myself.sm.level + 8) {
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