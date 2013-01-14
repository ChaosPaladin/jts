package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crystal_B_time_checker extends default_trap {
	protected void CREATED() {
myself.BroadcastScriptEvent(12560, 1, 4000);
myself.AddTimerEx(2001, 10 * 1000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam c1) {
if (script_event_arg1 == 12561) {
if (script_event_arg2 != 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

}
if (script_event_arg3 != 0) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
myself.c_ai1 = c1;

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai0 == 0) {
myself.c_ai0 = c0;
myself.i_ai0 = 1;

}
if (myself.i_ai1 == 0 && myself.c_ai0 != c0) {
myself.c_ai1 = c0;
myself.i_ai1 = 1;

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
if (timer_id == 2001) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);

} else if (myself.IsNullCreature(myself.c_ai1) == 0) {
party0 = gg.GetParty(myself.c_ai1);

}
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
i3 = 0;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.InMyTerritory(c0) == 0) {
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343105)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343106)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343107)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343108)) > 0) {
i3 = i3 + 1;

}

}

}

}
if (i3 == 0) {
myself.InstantZone_Finish(5);

}

}
myself.AddTimerEx(2001, 30 * 1000);

}
	}


}