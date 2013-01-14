package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_archer extends ssq_event_basic_warrior {
	protected int DespawnMagic = 70057985;

	protected void CREATED(HandlerParam i0) {
myself.AddTimerEx(2000, 3000);
myself.i_ai0 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10015) {
myself.RemoveAllAttackDesire();
myself.i_ai4 = 1;

}
	}

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.AddDoNothingDesire(40, 30);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai4 == 1) {
return;

}
if (myself.p_state != 3) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 0 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 0, 200);

}
if (myself.IsInCategory(1, creature.occupation) == 1 || myself.IsInCategory(2, creature.occupation) == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 0 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 0, 200);

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 0 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 0, 200);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2000) {
myself.LookNeighbor(600);
myself.AddTimerEx(2000, 3000);
if (myself.p_state == 3 && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) > 500) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}

}
if (timer_id == 2007) {
myself.Despawn();

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai4 == 1) {
return;

}
if (myself.InMyTerritory(attacker) == 0) {
return;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1.000000 * damage / myself.sm.level + 7 * 100);

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(DespawnMagic)) >= 0 && myself.i_ai0 == 0) {
myself.AddTimerEx(2007, 5000);
myself.i_ai0 = 1;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
myself.BroadcastScriptEvent(10006, myself.sm.param1, 1500);
if (myself.i_ai1 == 1) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 2 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

} else {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 6 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

}
	}


}