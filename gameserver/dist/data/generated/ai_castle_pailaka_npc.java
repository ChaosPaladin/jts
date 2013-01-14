package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_npc extends warrior {
	protected int Buff = 458752001;
	protected int Skill01_ID = 458752001;
	protected int Skill02_ID = 458752001;
	protected int Skill01_Prob = 20;
	protected int Skill02_Prob = 20;
	protected int String_Num1 = -1;
	protected int String_Num2 = -1;
	protected int String_Num3 = -1;
	protected int String_Num4 = -1;
	protected int String_Num5 = -1;
	protected int String_Num6 = -1;
	protected int debug_mode = 0;
	protected String fnHi = "";
	protected String fnNowInBattle = "";
	protected String fnMissionSuccess = "";

	protected void CREATED() {
if (String_Num1 > 0) {
myself.Say(gg.MakeFString(String_Num1, "", "", "", "", ""));

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = gg.FloatToInt(myself.sm.max_hp);
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_quest0 = 0;
myself.AddTimerEx(1230, 1 * 1000);
myself.AddTimerEx(5617, 2 * 60 * 1000);
myself.AddTimerEx(5620, 5 * 1000);
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_quest0 == 0) {
myself.ShowPage(talker, fnHi);

} else if (myself.i_quest0 == 1) {
myself.ShowPage(talker, fnNowInBattle);

} else if (myself.i_quest0 == 2) {
myself.ShowPage(talker, fnMissionSuccess);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 23000 && reply == 1) {
myself.InstantZone_Leave(talker);

}
	}

	protected void ATTACKED() {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.i_quest0 = 1;

}
if (myself.i_ai4 != 1) {
if (myself.i_ai3 == gg.FloatToInt(myself.sm.max_hp)) {
if (myself.sm.hp < myself.sm.max_hp * 0.400000) {
myself.i_ai3 = gg.FloatToInt(myself.sm.hp);
if (String_Num3 > 0) {
myself.Say(gg.MakeFString(String_Num3, "", "", "", "", ""));

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.100000) {
if (myself.i_ai3 > gg.FloatToInt(myself.sm.max_hp * 0.100000)) {
myself.i_ai3 = gg.FloatToInt(myself.sm.hp);
if (String_Num4 > 0) {
myself.Say(gg.MakeFString(String_Num4, "", "", "", "", ""));

}

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.i_quest0 = 1;

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam c0) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
myself.i_ai0 = 1;
myself.i_ai1 = c0.id;
myself.i_ai5 = party0.id;

} else {
myself.i_ai0 = 1;
myself.i_ai1 = creature.id;
myself.i_ai5 = party0.id;

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1230) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1230, 3 * 1000);

}

}
if (timer_id == 5617) {
if (myself.i_ai1 != 0) {
c1 = gg.GetCreatureFromID(myself.i_ai1);
if (myself.IsNullCreature(c1) == 0) {
party0 = gg.GetParty(c1);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.DistFromMe(c0) <= 75) {
myself.CastBuffForQuestReward(c0, Buff);

}

}

} else if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) <= 75) {
myself.CastBuffForQuestReward(c1, Buff);

}

}

}

}
myself.AddTimerEx(5617, 2 * 60 * 1000);

} else if (timer_id == 5620) {
myself.BroadcastScriptEvent(2117001, gg.GetIndexFromCreature(myself.sm), 1500);
myself.AddTimerEx(5620, 10 * 1000);

} else if (timer_id == 5634) {
myself.Suicide();

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 2117009 || script_event_arg1 == 2117007) {
if (debug_mode) {
myself.Say("clear flag");

}
myself.i_quest0 = 2;
if (String_Num6 > 0) {
myself.Shout(gg.MakeFString(String_Num6, "", "", "", "", ""));

}
party0 = gg.GetPartyFromID(myself.i_ai5);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (gg.HaveMemo(c0, 727) == 1 && gg.GetMemoState(c0, 727) == 2 && myself.sm.instant_zone_type_id >= 80 && myself.sm.instant_zone_type_id <= 88) {
myself.SetMemoState(c0, 727, 3);

} else if (gg.HaveMemo(c0, 726) == 1 && gg.GetMemoState(c0, 726) == 2 && myself.sm.instant_zone_type_id >= 89 && myself.sm.instant_zone_type_id <= 109) {
myself.SetMemoState(c0, 726, 3);

}

}

}

}
	}

	protected void CLAN_DIED(HandlerParam victim, HandlerParam i0) {
if (myself.i_ai4 == 0) {
myself.AddTimerEx(5634, 1500);
myself.i_ai4 = 1;

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam maker0, HandlerParam reply) {
if (myself.sm.hp < 1) {
myself.InstantZone_Finish(5);

}
if (String_Num5 > 0) {
myself.Say(gg.MakeFString(String_Num5, "", "", "", "", ""));

}
myself.i_quest0 = 99;
	}


}