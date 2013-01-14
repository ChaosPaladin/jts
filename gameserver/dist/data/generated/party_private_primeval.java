package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_primeval extends party_private_physicalspecial {
	protected int BroadCastReception = 0;
	protected int ag_type = 1;
	protected int mobile_type = 0;
	protected int is_dbg = 0;

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.class_id == 1022215 || attacker.class_id == 1022217 || attacker.class_id == 1022216) {
myself.Suicide();
return;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event";
myself.Say(s0);
s0 = "";

}
if (script_event_arg1 == 10016) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0.is_pc != 0 && BroadCastReception == 1) {
if (is_dbg > 2) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": script_event::" + "replace top_desire_target as " + c0.name;
myself.Say(s0);
s0 = "";

}
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 100);

}

}

}
super;
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": see_creature" + " creature:" + creature.name;
myself.Say(s0);
s0 = "";

}
if (ag_type == 1) {
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

}
	}


}