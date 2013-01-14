package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kuram extends default_npc {
	protected int nType = 0;
	protected String fnStart = "kerthang_manager001.htm";
	protected String fnTeamList = "kerthang_manager003.htm";
	protected int ground1_1_x = 0;
	protected int ground1_1_y = 0;
	protected int ground1_1_z = 0;
	protected int ground1_2_x = 0;
	protected int ground1_2_y = 0;
	protected int ground1_2_z = 0;
	protected int ground2_1_x = 0;
	protected int ground2_1_y = 0;
	protected int ground2_1_z = 0;
	protected int ground2_2_x = 0;
	protected int ground2_2_y = 0;
	protected int ground2_2_z = 0;
	protected int ground3_1_x = 0;
	protected int ground3_1_y = 0;
	protected int ground3_1_z = 0;
	protected int ground3_2_x = 0;
	protected int ground3_2_y = 0;
	protected int ground3_2_z = 0;
	protected int ground4_1_x = 0;
	protected int ground4_1_y = 0;
	protected int ground4_1_z = 0;
	protected int ground4_2_x = 0;
	protected int ground4_2_y = 0;
	protected int ground4_2_z = 0;
	protected int center_x = 0;
	protected int center_y = 0;
	protected int center_z = 0;
	protected int center1_1_x = 0;
	protected int center1_1_y = 0;
	protected int center1_1_z = 0;
	protected int center1_2_x = 0;
	protected int center1_2_y = 0;
	protected int center1_2_z = 0;
	protected int center1_3_x = 0;
	protected int center1_3_y = 0;
	protected int center1_3_z = 0;
	protected int center1_4_x = 0;
	protected int center1_4_y = 0;
	protected int center1_4_z = 0;
	protected int center1_5_x = 0;
	protected int center1_5_y = 0;
	protected int center1_5_z = 0;
	protected int center2_1_x = 0;
	protected int center2_1_y = 0;
	protected int center2_1_z = 0;
	protected int center2_2_x = 0;
	protected int center2_2_y = 0;
	protected int center2_2_z = 0;
	protected int center2_3_x = 0;
	protected int center2_3_y = 0;
	protected int center2_3_z = 0;
	protected int center2_4_x = 0;
	protected int center2_4_y = 0;
	protected int center2_4_z = 0;
	protected int center2_5_x = 0;
	protected int center2_5_y = 0;
	protected int center2_5_z = 0;
	protected String tower_maker1 = "etc09_1716_026m2";
	protected String tower_maker1 = "etc09_1716_002m2";
	protected String tower_maker1 = "etc09_1716_008m2";
	protected String tower_maker1 = "etc09_1716_014m2";
	protected String tower_maker1 = "etc09_1716_020m2";
	protected String clear_maker1 = "etc09_1716_031m1";
	protected String clear_maker2 = "etc09_1716_032m1";
	protected String clear_maker3 = "etc09_1716_033m1";
	protected String clear_maker4 = "etc09_1716_034m1";
	protected String clear_maker5 = "etc09_1716_035m1";
	protected String messenger_maker1 = "etc09_1716_026m1";
	protected String messenger_maker2 = "etc09_1716_002m1";
	protected String messenger_maker3 = "etc09_1716_008m1";
	protected String messenger_maker4 = "etc09_1716_014m1";
	protected String messenger_maker5 = "etc09_1716_020m1";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
gg.SetAsNull(myself.c_ai0);
gg.SetAsNull(myself.c_ai1);
gg.SetAsNull(myself.c_ai2);
gg.SetAsNull(myself.c_ai3);
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.int_list.Add(0);
myself.CreatePVPMatch(nType);
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
if (nType == 0) {
myself.ShowPage(talker, "kerthang_manager1_40.htm");

} else if (nType == 1) {
myself.ShowPage(talker, "kerthang_manager1_50.htm");

} else if (nType == 2) {
myself.ShowPage(talker, "kerthang_manager1_60.htm");

} else if (nType == 3) {
myself.ShowPage(talker, "kerthang_manager1_70.htm");

} else if (nType == 4) {
myself.ShowPage(talker, "kerthang_manager1_80.htm");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam party1, HandlerParam maker0, HandlerParam private, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam c0, HandlerParam c1) {
if (timer_id == 1001) {

} else if (timer_id == 1002) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullParty(party1) == 0) {
if (myself.i_quest0 == 1 && myself.i_quest3 == 1) {
myself.CheckRegisterParty2(party0, party1);

}

}

}
myself.i_quest3 = 0;

} else if (timer_id == 1003) {
if (nType == 0) {
maker0 = gg.GetNpcMaker(clear_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker1);
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

} else if (nType == 1) {
maker0 = gg.GetNpcMaker(clear_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_033", 1);
gg.Castle_GateOpenClose2("kerthang_door_034", 1);
gg.Castle_GateOpenClose2("kerthang_door_035", 1);
gg.Castle_GateOpenClose2("kerthang_door_036", 1);
gg.Castle_GateOpenClose2("kerthang_door_037", 1);
gg.Castle_GateOpenClose2("kerthang_door_038", 1);
gg.Castle_GateOpenClose2("kerthang_door_039", 1);
gg.Castle_GateOpenClose2("kerthang_door_040", 1);

} else if (nType == 2) {
maker0 = gg.GetNpcMaker(clear_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_001", 1);
gg.Castle_GateOpenClose2("kerthang_door_002", 1);
gg.Castle_GateOpenClose2("kerthang_door_003", 1);
gg.Castle_GateOpenClose2("kerthang_door_004", 1);
gg.Castle_GateOpenClose2("kerthang_door_005", 1);
gg.Castle_GateOpenClose2("kerthang_door_006", 1);
gg.Castle_GateOpenClose2("kerthang_door_007", 1);
gg.Castle_GateOpenClose2("kerthang_door_008", 1);

} else if (nType == 3) {
maker0 = gg.GetNpcMaker(clear_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_009", 1);
gg.Castle_GateOpenClose2("kerthang_door_010", 1);
gg.Castle_GateOpenClose2("kerthang_door_011", 1);
gg.Castle_GateOpenClose2("kerthang_door_012", 1);
gg.Castle_GateOpenClose2("kerthang_door_013", 1);
gg.Castle_GateOpenClose2("kerthang_door_014", 1);
gg.Castle_GateOpenClose2("kerthang_door_015", 1);
gg.Castle_GateOpenClose2("kerthang_door_016", 1);

} else if (nType == 4) {
maker0 = gg.GetNpcMaker(clear_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_017", 1);
gg.Castle_GateOpenClose2("kerthang_door_018", 1);
gg.Castle_GateOpenClose2("kerthang_door_019", 1);
gg.Castle_GateOpenClose2("kerthang_door_020", 1);
gg.Castle_GateOpenClose2("kerthang_door_021", 1);
gg.Castle_GateOpenClose2("kerthang_door_022", 1);
gg.Castle_GateOpenClose2("kerthang_door_023", 1);
gg.Castle_GateOpenClose2("kerthang_door_024", 1);

}

} else if (timer_id == 1004) {
if (nType == 0) {
maker0 = gg.GetNpcMaker(clear_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

} else if (nType == 1) {
maker0 = gg.GetNpcMaker(clear_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

} else if (nType == 2) {
maker0 = gg.GetNpcMaker(clear_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

} else if (nType == 3) {
maker0 = gg.GetNpcMaker(clear_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

} else if (nType == 4) {
maker0 = gg.GetNpcMaker(clear_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 13100, 0, 0);

}

}

} else if (timer_id == 1005) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
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

} else if (timer_id == 1006) {
if (myself.i_ai0 == 0 || myself.i_ai1 == 0) {
myself.i_quest0 = 0;

}
if (myself.i_ai0 > 0 && myself.i_ai1 > 0 && myself.i_quest0 == 4) {
myself.i_quest0 = 1;
myself.AddTimerEx(1011, 3 * 60 * 1000);
myself.AddTimerEx(1008, 60 * 1000);
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}

}
if (nType == 0) {
maker0 = gg.GetNpcMaker(clear_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker1);
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

} else if (nType == 1) {
maker0 = gg.GetNpcMaker(clear_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_033", 1);
gg.Castle_GateOpenClose2("kerthang_door_034", 1);
gg.Castle_GateOpenClose2("kerthang_door_035", 1);
gg.Castle_GateOpenClose2("kerthang_door_036", 1);
gg.Castle_GateOpenClose2("kerthang_door_037", 1);
gg.Castle_GateOpenClose2("kerthang_door_038", 1);
gg.Castle_GateOpenClose2("kerthang_door_039", 1);
gg.Castle_GateOpenClose2("kerthang_door_040", 1);

} else if (nType == 2) {
maker0 = gg.GetNpcMaker(clear_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_001", 1);
gg.Castle_GateOpenClose2("kerthang_door_002", 1);
gg.Castle_GateOpenClose2("kerthang_door_003", 1);
gg.Castle_GateOpenClose2("kerthang_door_004", 1);
gg.Castle_GateOpenClose2("kerthang_door_005", 1);
gg.Castle_GateOpenClose2("kerthang_door_006", 1);
gg.Castle_GateOpenClose2("kerthang_door_007", 1);
gg.Castle_GateOpenClose2("kerthang_door_008", 1);

} else if (nType == 3) {
maker0 = gg.GetNpcMaker(clear_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_009", 1);
gg.Castle_GateOpenClose2("kerthang_door_010", 1);
gg.Castle_GateOpenClose2("kerthang_door_011", 1);
gg.Castle_GateOpenClose2("kerthang_door_012", 1);
gg.Castle_GateOpenClose2("kerthang_door_013", 1);
gg.Castle_GateOpenClose2("kerthang_door_014", 1);
gg.Castle_GateOpenClose2("kerthang_door_015", 1);
gg.Castle_GateOpenClose2("kerthang_door_016", 1);

} else if (nType == 4) {
maker0 = gg.GetNpcMaker(clear_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(messenger_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
gg.Castle_GateOpenClose2("kerthang_door_017", 1);
gg.Castle_GateOpenClose2("kerthang_door_018", 1);
gg.Castle_GateOpenClose2("kerthang_door_019", 1);
gg.Castle_GateOpenClose2("kerthang_door_020", 1);
gg.Castle_GateOpenClose2("kerthang_door_021", 1);
gg.Castle_GateOpenClose2("kerthang_door_022", 1);
gg.Castle_GateOpenClose2("kerthang_door_023", 1);
gg.Castle_GateOpenClose2("kerthang_door_024", 1);

}

} else if (timer_id == 1007) {
if (myself.i_ai0 > 0 && myself.i_ai1 > 0 && myself.i_quest0 == 5) {
myself.i_quest0 = 1;
myself.i_quest4 = 1;
myself.AddTimerEx(1012, 3 * 60 * 1000);
myself.AddTimerEx(1008, 60 * 1000);
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}

}

} else if (timer_id == 1008) {
if (myself.i_quest0 == 1) {
myself.AddTimerEx(1009, 60 * 1000);
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(2), "", "", "", ""));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(2), "", "", "", ""));

}

}

}

}

} else if (timer_id == 1009) {
if (myself.i_quest0 == 1) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(1), "", "", "", ""));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(1), "", "", "", ""));

}

}

}

}

} else if (timer_id == 1010) {
myself.i_quest0 = 0;

} else if (timer_id == 1011) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullParty(party1) == 0) {
if (myself.i_quest0 == 1 && myself.i_quest2 == 1) {
myself.CheckRegisterParty2(party0, party1);
myself.i_quest2 = 0;

}

}

}

} else if (timer_id == 1012) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullParty(party1) == 0) {
if (myself.i_quest0 == 1 && myself.i_quest4 == 1) {
myself.CheckRegisterParty2(party0, party1);
myself.i_quest4 = 0;

}

}

}

} else if (timer_id == 2001) {
if (nType == 0) {
gg.Castle_GateOpenClose2("kerthang_door_025", 0);
gg.Castle_GateOpenClose2("kerthang_door_026", 0);
gg.Castle_GateOpenClose2("kerthang_door_027", 0);
gg.Castle_GateOpenClose2("kerthang_door_028", 0);
gg.Castle_GateOpenClose2("kerthang_door_029", 0);
gg.Castle_GateOpenClose2("kerthang_door_030", 0);
gg.Castle_GateOpenClose2("kerthang_door_031", 0);
gg.Castle_GateOpenClose2("kerthang_door_032", 0);

} else if (nType == 1) {
gg.Castle_GateOpenClose2("kerthang_door_033", 0);
gg.Castle_GateOpenClose2("kerthang_door_034", 0);
gg.Castle_GateOpenClose2("kerthang_door_035", 0);
gg.Castle_GateOpenClose2("kerthang_door_036", 0);
gg.Castle_GateOpenClose2("kerthang_door_037", 0);
gg.Castle_GateOpenClose2("kerthang_door_038", 0);
gg.Castle_GateOpenClose2("kerthang_door_039", 0);
gg.Castle_GateOpenClose2("kerthang_door_040", 0);

} else if (nType == 2) {
gg.Castle_GateOpenClose2("kerthang_door_001", 0);
gg.Castle_GateOpenClose2("kerthang_door_002", 0);
gg.Castle_GateOpenClose2("kerthang_door_003", 0);
gg.Castle_GateOpenClose2("kerthang_door_004", 0);
gg.Castle_GateOpenClose2("kerthang_door_005", 0);
gg.Castle_GateOpenClose2("kerthang_door_006", 0);
gg.Castle_GateOpenClose2("kerthang_door_007", 0);
gg.Castle_GateOpenClose2("kerthang_door_008", 0);

} else if (nType == 3) {
gg.Castle_GateOpenClose2("kerthang_door_009", 0);
gg.Castle_GateOpenClose2("kerthang_door_010", 0);
gg.Castle_GateOpenClose2("kerthang_door_011", 0);
gg.Castle_GateOpenClose2("kerthang_door_012", 0);
gg.Castle_GateOpenClose2("kerthang_door_013", 0);
gg.Castle_GateOpenClose2("kerthang_door_014", 0);
gg.Castle_GateOpenClose2("kerthang_door_015", 0);
gg.Castle_GateOpenClose2("kerthang_door_016", 0);

} else if (nType == 4) {
gg.Castle_GateOpenClose2("kerthang_door_017", 0);
gg.Castle_GateOpenClose2("kerthang_door_018", 0);
gg.Castle_GateOpenClose2("kerthang_door_019", 0);
gg.Castle_GateOpenClose2("kerthang_door_020", 0);
gg.Castle_GateOpenClose2("kerthang_door_021", 0);
gg.Castle_GateOpenClose2("kerthang_door_022", 0);
gg.Castle_GateOpenClose2("kerthang_door_023", 0);
gg.Castle_GateOpenClose2("kerthang_door_024", 0);

}

}
	}

	protected void REGISTER_RESURRECTION_TOWER_RESULT(HandlerParam reply, HandlerParam i0) {
	}

	protected void REGISTER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam party1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam maker0, HandlerParam c0, HandlerParam fhtml0, HandlerParam fhtml1) {
if (reply == 0) {
myself.ShowPage(talker, "kerthang_manager014.htm");
myself.i_ai0 = i0;
myself.i_ai1 = i1;
myself.i_ai2 = i2;
myself.i_ai3 = i3;
myself.i_ai4 = i4;
if (myself.i_ai0 > 0 && myself.i_ai1 > 0 && myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest3 = 1;
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
myself.AddTimerEx(1002, 3 * 60 * 1000);
myself.AddTimerEx(1008, 60 * 1000);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800080, gg.IntToStr(3), "", "", "", ""));

}

}

}

}

} else if (reply == 1) {

} else if (reply == 2) {
myself.ShowPage(talker, "kerthang_manager008.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "kerthang_manager009.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "kerthang_manager017.htm");

} else if (reply == 5) {
myself.ShowPage(talker, "kerthang_manager010.htm");

} else if (reply == 6) {
myself.FHTML_SetFileName(fhtml1, "kerthang_manager011.htm");
party0 = gg.GetParty(talker);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (nType == 0) {
if (c0.level < 40 || c0.level >= 50) {
myself.FHTML_SetStr(fhtml1, "levelnomatch", c0.name);

}

} else if (nType == 1) {
if (c0.level < 50 || c0.level >= 60) {
myself.FHTML_SetStr(fhtml1, "levelnomatch", c0.name);

}

} else if (nType == 2) {
if (c0.level < 60 || c0.level >= 70) {
myself.FHTML_SetStr(fhtml1, "levelnomatch", c0.name);

}

} else if (nType == 3) {
if (c0.level < 70 || c0.level >= 80) {
myself.FHTML_SetStr(fhtml1, "levelnomatch", c0.name);

}

}

}

}

}
myself.ShowFHTML(talker, fhtml1);

} else if (reply == 7) {
myself.ShowPage(talker, "kerthang_manager012.htm");

} else if (reply == 8) {
myself.ShowPage(talker, "kerthang_manager013.htm");

} else if (reply == 9) {
myself.FHTML_SetFileName(fhtml0, "kerthang_manager021.htm");
party1 = gg.GetParty(talker);
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
if (myself.IsNullParty(party1) == 0) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(370999297)) != -1) {
myself.FHTML_SetStr(fhtml0, "debuffpc", c0.name);

}

}

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 10) {

}
	}

	protected void UNREGISTER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam party0, HandlerParam party1, HandlerParam fhtml0, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam c4) {
myself.i_ai0 = i0;
myself.i_ai1 = i1;
myself.i_ai2 = i2;
myself.i_ai3 = i3;
myself.i_ai4 = i4;
myself.i_quest1 = i5;
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.i_quest2 == 1) {
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i7 = 0; i7 < i6; i7 = i7 + 1) {
c0 = myself.GetMemberOfParty(party0, i7);
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800106, "", "", "", "", ""));

}

}

}
myself.AddTimerEx(1006, 60 * 1000);
myself.i_quest0 = 4;
myself.i_quest3 = 2;

}
if (myself.i_quest2 == 2) {
myself.ShowPage(talker, "kerthang_manager018.htm");

} else {
myself.ShowPage(talker, "kerthang_manager005.htm");

}
	}

	protected void START_PVP_MATCH_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam maker0, HandlerParam h0) {
if (myself.i_quest0 == 1) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (nType == 0) {
myself.CreateOnePrivateEx(1018539, "ai_tower_of_kerthang", 0, 0, -85936, -47824, -11488, -3072, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018539, "ai_tower_of_kerthang", 0, 0, -84720, -48144, -11488, 30052, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 1) {
myself.CreateOnePrivateEx(1018540, "ai_tower_of_kerthang", 0, 0, -84456, -52636, -11440, 9588, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018540, "ai_tower_of_kerthang", 0, 0, -83716, -51572, -11440, -21708, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 2) {
myself.CreateOnePrivateEx(1018541, "ai_tower_of_kerthang", 0, 0, -79448, -52648, -11440, 22100, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018541, "ai_tower_of_kerthang", 0, 0, -80144, -51632, -11440, -10064, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 3) {
myself.CreateOnePrivateEx(1018542, "ai_tower_of_kerthang", 0, 0, -77792, -47920, -11440, -29332, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018542, "ai_tower_of_kerthang", 0, 0, -79008, -48348, -11440, 3192, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (nType == 4) {
myself.CreateOnePrivateEx(1018543, "ai_tower_of_kerthang", 0, 0, -81856, -44944, -11440, -15576, myself.sm.id, party0.id, 0);
myself.CreateOnePrivateEx(1018543, "ai_tower_of_kerthang", 0, 0, -81792, -46160, -11440, 16988, myself.sm.id, party1.id, 0);
maker0 = gg.GetNpcMaker(clear_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
myself.i_quest0 = 2;
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (nType != 4) {
if (nType == 0) {
i7 = 49;

} else if (nType == 1) {
i7 = 59;

} else if (nType == 2) {
i7 = 69;

} else if (nType == 3) {
i7 = 79;

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(68157441) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(68157441));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(71172097) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(71172097));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69992449) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69992449));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69402625) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69402625));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69599233) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69599233));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(83099649) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(83099649));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(71106561) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(71106561));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(90963969) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(90963969));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}

}
myself.CastBuffForQuestReward(c0, 370999297);

}

}

}
if (myself.IsNullParty(party1) == 0) {
i6 = party1.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party1, i5);
if (myself.IsNullCreature(c0) == 0) {
if (nType != 4) {
if (nType == 0) {
i7 = 49;

} else if (nType == 1) {
i7 = 59;

} else if (nType == 2) {
i7 = 69;

} else if (nType == 3) {
i7 = 79;

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(68157441) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(68157441));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(71172097) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(71172097));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69992449) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69992449));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69402625) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69402625));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(69599233) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(69599233));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(83099649) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(83099649));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(71106561) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(71106561));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(90963969) != -1)) {
i0 = gg.GetAbnormalMagicLevel(c0, myself.Skill_GetAbnormalType(90963969));
if (i0 > i7) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}

}
myself.CastBuffForQuestReward(c0, 370999297);

}

}

}
myself.AddTimerEx(1005, 2000);

}
	}

	protected void END_PVP_MATCH_RESULT(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam party0, HandlerParam party1) {
myself.i_ai0 = i0;
myself.i_ai1 = i1;
myself.i_ai2 = i2;
myself.i_ai3 = i3;
myself.i_ai4 = i4;
myself.i_quest1 = i5;
myself.i_quest0 = 5;
myself.AddTimerEx(1003, 20 * 1000);
myself.AddTimerEx(1004, 5000);
party0 = gg.GetPartyFromID(myself.i_ai0);
if (myself.IsNullParty(party0) == 0) {
i6 = party0.member_count;
for (i7 = 0; i7 < i6; i7 = i7 + 1) {
c0 = myself.GetMemberOfParty(party0, i7);
if (myself.IsNullCreature(c0) == 0) {
myself.Dispel(c0, myself.Skill_GetAbnormalType(370999297));

}

}

}
if (myself.i_ai0 > 0 && myself.i_ai1 > 0) {
myself.AddTimerEx(1007, 30 * 1000);

} else if (myself.i_ai0 == 0 || myself.i_ai1 == 0) {
myself.i_quest0 = 0;

}
	}

	protected void CHECK_REGISTER_PARTY_RESULT2(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam c1, HandlerParam c2) {
party0 = gg.GetPartyFromID(myself.i_ai0);
party1 = gg.GetPartyFromID(myself.i_ai1);
if (i1 == 7) {
party0 = gg.GetPartyFromID(i0);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800081, "", "", "", "", ""));

}

}
if (myself.IsNullCreature(c1) == 0) {
myself.UnregisterPVPMatch(party0, c0);

}

}

}
if (i3 == 7) {
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800081, "", "", "", "", ""));

}

}
if (myself.IsNullCreature(c1) == 0) {
myself.UnregisterPVPMatch(party0, c0);

}

}

}
if (i1 == 6) {
party0 = gg.GetPartyFromID(i0);
if (myself.IsNullParty(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (nType == 0) {
if (c0.level < 40 || c0.level >= 50) {
myself.c_ai2 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai2.name, "", "", "", ""));

} else if (nType == 1) {
if (c0.level < 50 || c0.level >= 60) {
myself.c_ai2 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai2.name, "", "", "", ""));

} else if (nType == 2) {
if (c0.level < 60 || c0.level >= 70) {
myself.c_ai2 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai2.name, "", "", "", ""));

} else if (nType == 3) {
if (c0.level < 70 || c0.level >= 80) {
myself.c_ai2 = c0;

}

}

}

}
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsNullCreature(myself.c_ai2) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai2.name, "", "", "", ""));

}

}

}
myself.c_ai2 = gg.GetNullCreature();

}

}
if (i3 == 6) {
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (nType == 0) {
if (c0.level < 40 || c0.level >= 50) {
myself.c_ai1 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai1.name, "", "", "", ""));

} else if (nType == 1) {
if (c0.level < 50 || c0.level >= 60) {
myself.c_ai1 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai1.name, "", "", "", ""));

} else if (nType == 2) {
if (c0.level < 60 || c0.level >= 70) {
myself.c_ai1 = c0;

}
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai1.name, "", "", "", ""));

} else if (nType == 3) {
if (c0.level < 70 || c0.level >= 80) {
myself.c_ai1 = c0;

}

}

}

}
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c0 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 20000, 0, gg.MakeFString(1800128, myself.c_ai1.name, "", "", "", ""));

}

}

}
myself.c_ai1 = gg.GetNullCreature();

}

}
if (i1 == 0 && i3 == 0 && myself.i_quest0 == 1) {
myself.StartPVPMatch(party0, party1);

}
if (i1 != 0) {
myself.i_quest0 = 0;
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800123, "", "", "", "", ""));

}

}
party1 = gg.GetPartyFromID(i0);
if (myself.IsNullParty(party1) == 0) {
c2 = myself.GetLeaderOfParty(party1);
myself.i_quest2 = 2;
if (myself.IsNullCreature(c2) == 0) {
myself.UnregisterPVPMatch(party1, c2);

}

}

}

}
if (i3 != 0) {
myself.i_quest0 = 0;
party0 = gg.GetPartyFromID(i0);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
i6 = party0.member_count;
for (i5 = 0; i5 < i6; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1800123, "", "", "", "", ""));

}

}
party1 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party1) == 0) {
c2 = myself.GetLeaderOfParty(party1);
myself.i_quest2 = 2;
if (myself.IsNullCreature(c2) == 0) {
myself.UnregisterPVPMatch(party1, c2);

}

}

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam fhtml1, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam c4, HandlerParam i0, HandlerParam i1) {
if (ask == 777) {
myself.FHTML_SetFileName(fhtml0, fnTeamList);
if (myself.i_ai0 > 0) {
party1 = gg.GetPartyFromID(myself.i_ai0);
if (myself.IsNullParty(party1) == 0) {
c0 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c0) == 0) {
myself.FHTML_SetStr(fhtml0, "team0", c0.name);

}

}

}
if (myself.i_ai1 > 0) {
party1 = gg.GetPartyFromID(myself.i_ai1);
if (myself.IsNullParty(party1) == 0) {
c1 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c1) == 0) {
myself.FHTML_SetStr(fhtml0, "team1", c1.name);

}

}

}
if (myself.i_ai2 > 0) {
party1 = gg.GetPartyFromID(myself.i_ai2);
if (myself.IsNullParty(party1) == 0) {
c2 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c2) == 0) {
myself.FHTML_SetStr(fhtml0, "team2", c2.name);

}

}

}
if (myself.i_ai3 > 0) {
party1 = gg.GetPartyFromID(myself.i_ai3);
if (myself.IsNullParty(party1) == 0) {
c3 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c3) == 0) {
myself.FHTML_SetStr(fhtml0, "team3", c3.name);

}

}

}
if (myself.i_ai4 > 0) {
party1 = gg.GetPartyFromID(myself.i_ai4);
if (myself.IsNullParty(party1) == 0) {
c4 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c4) == 0) {
myself.FHTML_SetStr(fhtml0, "team4", c4.name);

}

}

}
myself.FHTML_SetFileName(fhtml1, "kerthang_manager019.htm");
party1 = gg.GetPartyFromID(myself.i_ai0);
if (myself.IsNullParty(party1) == 0) {
c0 = myself.GetLeaderOfParty(party1);
if (myself.IsNullCreature(c0) == 0) {
myself.FHTML_SetStr(fhtml1, "victoryteam", c0.name);
myself.FHTML_SetStr(fhtml1, "victorycount", gg.IntToStr(myself.i_quest1));

}

}
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (gg.Party_GetLeader(talker) == talker) {
myself.RegisterPVPMatch(party0, talker);

} else {
myself.ShowPage(talker, "kerthang_manager004.htm");

}

} else {
myself.ShowPage(talker, "kerthang_manager008.htm");

}

} else if (reply == 2) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (gg.Party_GetLeader(talker) == talker) {
if (party0 == gg.GetPartyFromID(myself.i_ai0) || party0 == gg.GetPartyFromID(myself.i_ai1) || party0 == gg.GetPartyFromID(myself.i_ai2) || party0 == gg.GetPartyFromID(myself.i_ai3) || party0 == gg.GetPartyFromID(myself.i_ai4)) {
if (party0 == gg.GetPartyFromID(myself.i_ai0) || party0 == gg.GetPartyFromID(myself.i_ai1)) {
myself.i_quest2 = 1;

}
myself.UnregisterPVPMatch(party0, talker);

} else {
myself.ShowPage(talker, "kerthang_manager006.htm");

}

} else {
myself.ShowPage(talker, "kerthang_manager004.htm");

}

}

} else if (reply == 3) {
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 4) {
myself.ShowPage(talker, "kerthang_manager016.htm");

} else if (reply == 5) {
if (myself.i_quest1 > 0) {
myself.ShowFHTML(talker, fhtml1);

} else {
myself.ShowPage(talker, "kerthang_manager020.htm");

}

} else if (reply == 6) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -59161, -56954, -2036);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -59155, -56831, -2036);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -59299, -56955, -2036);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -59224, -56837, -2036);

} else {
myself.InstantTeleport(talker, -59134, -56899, -2036);

}

}

}
	}


}