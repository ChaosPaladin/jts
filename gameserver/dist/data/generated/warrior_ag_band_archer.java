package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_band_archer extends warrior_aggressive_use_power_shot {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg2 == 10033) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 200);

}

}

}
if (script_event_arg2 == 10043) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
myself.ChangeMoveType(1);
myself.AddMoveToDesire(gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 10000000);

}

}
if (script_event_arg1 == 10001041) {
myself.AddMoveToDesire(script_event_arg2, script_event_arg3, gg.FloatToInt(myself.sm.z), 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.RemoveAllDesire();
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial, 0, 1, 1000000);

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (gg.Rand(100) < 20 && speller.is_pc != 0 && myself.IsInCategory(3, speller.occupation) != 0) {
myself.RemoveAllAttackDesire();
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
myself.AddAttackDesire(speller, 1, 1 * 200000);

}

}
	}


}