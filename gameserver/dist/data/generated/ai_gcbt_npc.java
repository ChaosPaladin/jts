package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gcbt_npc extends default_npc {
	protected int ground1_1_x = -86433;
	protected int ground1_1_y = -46655;
	protected int ground1_1_z = -11496;
	protected int ground1_2_x = -86066;
	protected int ground1_2_y = -46491;
	protected int ground1_2_z = -11496;
	protected int ground2_1_x = -86882;
	protected int ground2_1_y = -48441;
	protected int ground2_1_z = -11496;
	protected int ground2_2_x = -86837;
	protected int ground2_2_y = -49123;
	protected int ground2_2_z = -11496;
	protected int ground3_1_x = -84499;
	protected int ground3_1_y = -49128;
	protected int ground3_1_z = -11496;
	protected int ground3_2_x = -83812;
	protected int ground3_2_y = -49250;
	protected int ground3_2_z = -11496;
	protected int ground4_1_x = -83776;
	protected int ground4_1_y = -47943;
	protected int ground4_1_z = -11496;
	protected int ground4_2_x = -83645;
	protected int ground4_2_y = -47764;
	protected int ground4_2_z = -11496;
	protected int center_x = -84934;
	protected int center_y = -47900;
	protected int center_z = -11496;
	protected int center1_1_x = -85517;
	protected int center1_1_y = -47668;
	protected int center1_1_z = -11496;
	protected int center1_2_x = -85664;
	protected int center1_2_y = -47805;
	protected int center1_2_z = -11496;
	protected int center1_3_x = -85706;
	protected int center1_3_y = -48000;
	protected int center1_3_z = -11496;
	protected int center1_4_x = -85666;
	protected int center1_4_y = -48197;
	protected int center1_4_z = -11496;
	protected int center2_1_x = -84954;
	protected int center2_1_y = -47807;
	protected int center2_1_z = -11496;
	protected int center2_2_x = -84909;
	protected int center2_2_y = -47993;
	protected int center2_2_z = -11496;
	protected int center2_3_x = -84963;
	protected int center2_3_y = -48202;
	protected int center2_3_z = -11496;
	protected int center2_4_x = -85113;
	protected int center2_4_y = -48348;
	protected int center2_4_z = -11496;
	protected int center1_5_x = -85487;
	protected int center1_5_y = -47911;
	protected int center1_5_z = -11496;
	protected int center2_5_x = -85150;
	protected int center2_5_y = -48063;
	protected int center2_5_z = -11496;
	protected String clear_maker = "etc09_1716_031m1";
	protected int nType = 8;
	protected int TIMER_start_delay = 22220;
	protected int TIMER_end_match1 = 22221;
	protected int TIMER_end_match2 = 22222;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.CreatePVPMatch(nType);
	}

	protected void REGISTER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam party1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam maker0, HandlerParam c0, HandlerParam fhtml0, HandlerParam fhtml1) {
if (debug_mode) {
myself.Say("REGISTER");

}
if (reply == 0) {

}
	}

	protected void START_PVP_MATCH_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam maker0, HandlerParam h0) {
if (debug_mode) {
myself.Say("*** START ***");

}
myself.i_ai0 = i0;
myself.i_ai1 = i1;
party0 = gg.GetPartyFromID(i0);
party1 = gg.GetPartyFromID(i1);
if (myself.IsNullParty(party0) == 0) {
if (debug_mode) {
myself.Say("START : party0 is not null. [OK]");

}

}
if (myself.IsNullParty(party1) == 0) {
if (debug_mode) {
myself.Say("START : party1 is not null. [OK]");

}

}
if (nType == 8) {
if (debug_mode) {
myself.Say("START : nType is correct. [OK]");

}
myself.CreateOnePrivateEx(1018539, "ai_tower_of_kerthang", 0, 0, -85936, -47824, -11488, -3072, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018539, "ai_tower_of_kerthang", 0, 0, -84720, -48144, -11488, 30052, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (debug_mode) {
myself.Say("START : nType is incorrect. [ERROR]");

}
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, 370999297);

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, 370999297);

}

}

}
myself.AddTimerEx(TIMER_start_delay, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i5, HandlerParam i6, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam maker0) {
if (timer_id == TIMER_start_delay) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
if (debug_mode) {
myself.Say("START_TELEPORT : party0 is not null. [OK]");

}

}
if (myself.IsNullParty(party1) == 0) {
if (debug_mode) {
myself.Say("START_TELEPORT : party1 is not null. [OK]");

}

}
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (i5 == 0) {
gg.InstantTeleportEx(c0, ground1_1_x, ground1_1_y, ground1_1_z, 0);

} else if (i5 == 1) {
gg.InstantTeleportEx(c0, ground2_1_x, ground2_1_y, ground2_1_z, 0);

} else if (i5 == 2) {
gg.InstantTeleportEx(c0, ground3_1_x, ground3_1_y, ground3_1_z, 0);

} else if (i5 == 3) {
gg.InstantTeleportEx(c0, ground4_1_x, ground4_1_y, ground4_1_z, 0);

} else if (i5 == 4) {
gg.InstantTeleportEx(c0, center1_1_x, center1_1_y, center1_1_z, 0);

} else if (i5 == 5) {
gg.InstantTeleportEx(c0, center1_2_x, center1_2_y, center1_2_z, 0);

} else if (i5 == 6) {
gg.InstantTeleportEx(c0, center1_3_x, center1_3_y, center1_3_z, 0);

} else if (i5 == 7) {
gg.InstantTeleportEx(c0, center1_4_x, center1_4_y, center1_4_z, 0);

} else if (i5 == 8) {
gg.InstantTeleportEx(c0, center1_5_x, center1_5_y, center1_5_z, 0);

}

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
if (i5 == 0) {
gg.InstantTeleportEx(c0, ground1_2_x, ground1_2_y, ground1_2_z, 0);

} else if (i5 == 1) {
gg.InstantTeleportEx(c0, ground2_2_x, ground2_2_y, ground2_2_z, 0);

} else if (i5 == 2) {
gg.InstantTeleportEx(c0, ground3_2_x, ground3_2_y, ground3_2_z, 0);

} else if (i5 == 3) {
gg.InstantTeleportEx(c0, ground4_2_x, ground4_2_y, ground4_2_z, 0);

} else if (i5 == 4) {
gg.InstantTeleportEx(c0, center2_1_x, center2_1_y, center2_1_z, 0);

} else if (i5 == 5) {
gg.InstantTeleportEx(c0, center2_2_x, center2_2_y, center2_2_z, 0);

} else if (i5 == 6) {
gg.InstantTeleportEx(c0, center2_3_x, center2_3_y, center2_3_z, 0);

} else if (i5 == 7) {
gg.InstantTeleportEx(c0, center2_4_x, center2_4_y, center2_4_z, 0);

} else if (i5 == 8) {
gg.InstantTeleportEx(c0, center2_5_x, center2_5_y, center2_5_z, 0);

}

}

}

}

} else if (timer_id == TIMER_end_match1) {
if (nType == 8) {
if (debug_mode) {
myself.Say("END_timer1 : nType is correct. [OK]");

}
maker0 = gg.GetNpcMaker(clear_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_025", 1);
gg.Castle_GateOpenClose2("kerthang_door_026", 1);
gg.Castle_GateOpenClose2("kerthang_door_027", 1);
gg.Castle_GateOpenClose2("kerthang_door_028", 1);
gg.Castle_GateOpenClose2("kerthang_door_029", 1);
gg.Castle_GateOpenClose2("kerthang_door_030", 1);
gg.Castle_GateOpenClose2("kerthang_door_031", 1);
gg.Castle_GateOpenClose2("kerthang_door_032", 1);

}

} else if (timer_id == TIMER_end_match2) {
if (nType == 8) {
if (debug_mode) {
myself.Say("END_timer2 : nType is correct. [OK]");

}
maker0 = gg.GetNpcMaker(clear_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

}

}
	}

	protected void END_PVP_MATCH_RESULT(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam party0, HandlerParam party1) {
myself.i_ai0 = i0;
myself.i_ai1 = i1;
myself.AddTimerEx(TIMER_end_match1, 20 * 1000);
myself.AddTimerEx(TIMER_end_match2, 5000);
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
if (debug_mode) {
myself.Say("END : party0 is not null. [OK]");

}

}
if (myself.IsNullParty(party1) == 0) {
if (debug_mode) {
myself.Say("END : party1 is not null. [OK]");

}

}
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i7 = 0; i7 < i6; i7 = i7 + 1) {
c0 = myself.GetMemberOfParty(party0, i7);
if (myself.IsNullCreature(c0) == 0) {
myself.Dispel(c0, myself.Skill_GetAbnormalType(370999297));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i7 = 0; i7 < i6; i7 = i7 + 1) {
c0 = myself.GetMemberOfParty(party1, i7);
if (myself.IsNullCreature(c0) == 0) {
myself.Dispel(c0, myself.Skill_GetAbnormalType(370999297));

}

}

}
	}


}