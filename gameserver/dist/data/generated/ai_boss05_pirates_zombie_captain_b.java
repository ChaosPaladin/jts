package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss05_pirates_zombie_captain_b extends warrior_aggressive_physicalspecial {
	protected int PhysicalSpecial = 266534918;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.sm.weight_point = gg.FloatToInt(myself.sm.x);
myself.sm.respawn_time = gg.FloatToInt(myself.sm.y);
myself.sm.flag = gg.FloatToInt(myself.sm.z);
myself.LookNeighbor(1500);
myself.AddTimerEx(1051, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1051) {
if (myself.start_x - myself.sm.x * myself.start_x - myself.sm.x + myself.start_y - myself.sm.y * myself.start_y - myself.sm.y > 1500 * 1500) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 1) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.AddTimerEx(1052, 3000);

}
myself.AddTimerEx(1051, 10 * 1000);

}
if (timer_id == 1052) {
myself.LookNeighbor(1000);

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

}
if (creature.z > myself.sm.z - 100 && creature.z < myself.sm.z + 100) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
myself.MakeAttackEvent(creature, 9, 1);

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

}
if (attacker.level <= myself.sm.level + 8) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20000);

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


}