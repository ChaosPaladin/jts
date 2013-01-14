package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader extends party_leader_param_warrior {
	protected void CREATED() {
myself.sm.weight_point = 10;
myself.AddTimerEx(1007, 120 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1007) {
if (myself.InMyTerritory(myself.sm) == 0 && myself.IsInCombatMode(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
myself.AddTimerEx(1007, 120 * 1000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (private != myself.sm) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * damage * private.weight_point * 10);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && private.respawn_time != 0) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}
	}


}