package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_B_course_private extends warrior_use_skill {
	protected int selfbuff1 = 458752001;
	protected int selfbuff2 = 458752001;
	protected int Skill01_Probablity = 0;
	protected String doorname = "cyratal_cave_b_b";

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param2);
i0 = myself.sm.param1;
myself.i_ai3 = myself.sm.param3;
if (i0 == 1) {
myself.AddMoveToDesire(153589, 149525, -12136, 1000000);

} else if (i0 == 2) {
myself.AddMoveToDesire(153610, 149615, -12136, 1000000);

} else if (i0 == 3) {
myself.AddMoveToDesire(153638, 149693, -12136, 1000000);

} else if (i0 == 4) {
myself.AddMoveToDesire(153680, 149771, -12136, 1000000);

} else if (i0 == 5) {
myself.AddMoveToDesire(153721, 149833, -12136, 1000000);

} else if (i0 == 6) {
myself.AddMoveToDesire(153607, 149459, -12136, 1000000);

} else if (i0 == 7) {
myself.AddMoveToDesire(153632, 149367, -12136, 1000000);

} else if (i0 == 8) {
myself.AddMoveToDesire(153657, 149294, -12136, 1000000);

} else if (i0 == 9) {
myself.AddMoveToDesire(153709, 149223, -12136, 1000000);

} else if (i0 == 10) {
myself.AddMoveToDesire(153776, 149167, -12136, 1000000);

} else if (i0 == 11) {
myself.AddMoveToDesire(153776, 149887, -12136, 1000000);

} else if (i0 == 12) {
myself.AddMoveToDesire(153838, 149117, -12136, 1000000);

} else if (i0 == 13) {
myself.AddMoveToDesire(153844, 149938, -12136, 1000000);

} else if (i0 == 14) {
myself.AddMoveToDesire(153925, 149081, -12136, 1000000);

}
	}

	protected void NO_DESIRE() {
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.BroadcastScriptEvent(12516, 1, 3000);
myself.RemoveAllDesire();
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0, HandlerParam c0) {
if (private != myself.boss) {
myself.AddAttackDesire(attacker, 1, 1000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim) {
if (victim == myself.boss) {
myself.AddAttackDesire(attacker, 1, 20000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12517) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, 1000000);

}
if (script_event_arg1 == 12518) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, 1000000);

}
if (script_event_arg1 == 12516) {
if (myself.i_ai3 == 1) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 == 10) {
myself.AddTimerEx(2001, 1000);
gg.Castle_GateOpenCloseEx(doorname, 1, myself.InstantZone_GetId());

}

} else if (myself.i_ai3 == 2) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 == 12) {
myself.AddTimerEx(2001, 1000);
gg.Castle_GateOpenCloseEx(doorname, 1, myself.InstantZone_GetId());

}

} else if (myself.i_ai3 == 3) {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_ai2 == 14) {
myself.AddTimerEx(2001, 1000);
gg.Castle_GateOpenCloseEx(doorname, 1, myself.InstantZone_GetId());

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0) {
if (timer_id == 2001) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (gg.FloatToInt(myself.c_ai0.x) < 153265) {
myself.RemoveAllDesire();
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
i3 = gg.Rand(i1);
for (i2 = i3; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.FloatToInt(c0.x) < 153265) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.FloatToInt(c0.x) < 153265) {

} else if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.AddAttackDesire(c0, 1, 70000);
return;

}

}

}

} else if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.AddAttackDesire(c0, 1, 70000);
return;

}

}

}

}

} else {
myself.AddAttackDesire(myself.c_ai0, 1, 70000);

}

} else if (gg.FloatToInt(myself.boss.x) < 153265) {

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000);

}

}
	}


}