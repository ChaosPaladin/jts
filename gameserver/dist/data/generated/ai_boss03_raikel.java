package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss03_raikel extends warrior_passive_casting_enchant_clan {
	protected int Buff = 264110083;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.AddTimerEx(5001, 90000 + gg.Rand(240000));
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
if (gg.Rand(100) < 66) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(5001, 90000 + gg.Rand(240000));

}
super;
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
if (myself.sm.max_hp / 2 > myself.sm.hp) {
if (myself.Skill_GetConsumeMP(295960577) < myself.sm.mp && myself.Skill_GetConsumeHP(295960577) < myself.sm.hp && myself.Skill_InReuseDelay(295960577) == 0) {
myself.AddUseSkillDesire(myself.sm, 295960577, 1, 1, 1000000);

}

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