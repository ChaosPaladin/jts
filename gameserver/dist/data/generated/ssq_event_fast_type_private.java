package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_fast_type_private extends ssq_event_basic_warrior {
	protected int PhysicalSpecial = 262209537;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 100);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam plist0, HandlerParam pos0, HandlerParam i2, HandlerParam i3) {
if (myself.InMyTerritory(attacker) == 0) {
return;

}
i2 = 1;
i3 = 100;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, i2 * i3);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 25 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c1) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
if (myself.InMyTerritory(c1)) {
if (script_event_arg1 == 10007) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.AddMoveToDesire(myself.sm.param1, script_event_arg2, gg.FloatToInt(myself.sm.z), 50);

}

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.p_state != 3) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

}
	}


}