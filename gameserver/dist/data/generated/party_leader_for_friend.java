package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_for_friend extends party_leader_casting_3skill_approach {
	protected int AttackPointX = 149441;
	protected int AttackPointY = 46544;
	protected int AttackPointZ = -3408;
	protected int AttackRate = 10;
	protected int CreatureID = 0;

	protected void CREATED() {
myself.AddTimerEx(4052, 1000);
myself.i_ai4 = 0;
myself.sm.flag = CreatureID;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4050) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;
myself.AddMoveToDesire(AttackPointX, AttackPointY, AttackPointZ, 1000);
myself.AddTimerEx(4051, 10000);

} else if (myself.i_ai4 == 1) {
myself.i_ai4 = 0;
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100000);

}
myself.AddTimerEx(4050, AttackRate * 60 * 1000);

} else if (timer_id == 4051) {
if (myself.i_ai4 == 1) {
myself.LookNeighbor(300);
myself.AddTimerEx(4051, 1000);

}

} else if (timer_id == 4052) {
myself.i_ai4 = 1;
myself.AddTimerEx(4050, AttackRate * 60 * 1000);
myself.AddTimerEx(4051, 10000);
myself.AddMoveToDesire(AttackPointX, AttackPointY, AttackPointZ, 10000000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.flag == myself.sm.flag) {

} else {
myself.AddAttackDesire(creature, 1, 1000);

}
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


}