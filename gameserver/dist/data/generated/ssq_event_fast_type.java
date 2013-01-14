package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_fast_type extends ssq_event_basic_warrior {
	protected int PhysicalSpecial = 264241153;
	protected int IsStrong = 0;
	protected int private_name = 33;
	protected String private_ai = "warrior";

	protected void CREATED() {
myself.i_ai0 = 0;
if (myself.sm.param3 & 268435456) {
myself.i_ai0 = 1;
myself.sm.param3 = myself.sm.param3 - 268435456;

}
myself.AddTimerEx(2002, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.LookNeighbor(600);
myself.AddTimerEx(2002, 5000);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.InMyTerritory(attacker) == 0) {
return;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1 * 100);

}
if (IsStrong == 1) {
i0 = 20;

} else {
i0 = 3;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < i0 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
if (myself.InMyTerritory(c1)) {
if (script_event_arg1 == 10007) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.AddMoveToDesire(myself.sm.param1, script_event_arg2, gg.FloatToInt(myself.sm.z), 50);

}

}
if (script_event_arg1 == 10014) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
i0 = i0 = gg.FloatToInt(1.000000 * myself.GetCurrentTick() - myself.i_ai0 / 60 * 17 * 2 * 100);
if (i0 > gg.Rand(100) && myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 5 * 100);

}

}

}

}

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
if (myself.i_ai0 == 0) {
myself.BroadcastScriptEvent(10009, myself.sm.param3, 1500);

} else {
myself.BroadcastScriptEvent(10010, myself.sm.param3, 1500);

}
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

} else if (IsStrong == 0) {
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
i1 = 5 + gg.FloatToInt(FloatToInt * 25 / 100);
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
i1 = 8 + gg.FloatToInt(FloatToInt * 25 / 100);
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