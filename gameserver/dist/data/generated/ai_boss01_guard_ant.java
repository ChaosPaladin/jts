package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss01_guard_ant extends warrior_aggressive {
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.AddTimerEx(3001, 90000 + gg.Rand(240000));
myself.AddTimerEx(3002, 10 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
if (gg.Rand(100) < 66) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(3001, 90000 + gg.Rand(240000));

}
if (timer_id == 3002) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
myself.AddTimerEx(3002, 10 * 1000);

}
super;
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

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20000);

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

	protected void SEE_CREATURE(HandlerParam creature) {
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