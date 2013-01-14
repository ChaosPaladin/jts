package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss02_b02_death_knight extends warrior_aggressive {
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.AddTimerEx(3001, 90000 + gg.Rand(240000));
myself.AddTimerEx(3002, 3000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (timer_id == 3001) {
if (gg.Rand(100) < 66) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(3001, 90000 + gg.Rand(240000));

}
if (timer_id == 3002) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.InMyTerritory(myself.sm) == 0) {
i2 = gg.FloatToInt(myself.sm.y);
i3 = gg.FloatToInt(myself.start_y);
i4 = gg.FloatToInt(myself.top_desire_target.z);
i5 = gg.FloatToInt(myself.sm.z);
if (i2 > 113000) {
if (i2 - i3 > 1000 || i4 - i5 > 1000 || i5 - i4 > 1000) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}

}

}

}
myself.AddTimerEx(3002, 1000);

}
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
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