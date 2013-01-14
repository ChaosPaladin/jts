package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class freya_deacon_keeper extends default_npc {
	protected String szName = "freya_deacon_q0656";
	protected String DoorName1 = "ice_barrier_001";
	protected String DoorName2 = "ice_barrier_002";
	protected String fnHi = "freya_deacon001.htm";
	protected String fnHi2 = "freya_deacon002.htm";

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.i_ai2 == 1 && myself.i_ai1 == party0.id) {
myself.ShowPage(talker, fnHi2);

} else if (myself.i_ai2 == 1 && myself.i_ai1 != party0.id) {
myself.ShowPage(talker, szName + "_01.htm");

}

} else if (myself.i_ai2 == 1) {
myself.ShowPage(talker, szName + "_01.htm");

}
if (myself.i_ai2 == 0) {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state, HandlerParam party0) {
if (ask == 656) {
switch (reply) {
case 1: {
if (talker.level >= 82) {
myself.InstantTeleport(talker, 103045, -124361, -2768);

} else {
party0 = gg.GetParty(talker);
if (myself.i_ai2 == 0) {
if (myself.IsNullParty(party0)) {
myself.ShowPage(talker, szName + "_06.htm");

} else if (myself.i_ai1 == 0 || party0.id == myself.i_ai1) {
i0 = party0.member_count;
if (gg.Party_GetLeader(talker) == talker) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, 8057) < 10) {
myself.FHTML_SetFileName(fhtml0, szName + "_03.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}
if (i0 == i1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, szName + "_04.htm");
for (i3 = 0; i3 < i0; i3 = i3 + 1) {
c0 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c0) == 0) {
myself.DeleteItem1(c0, 8057, 10);

}

}
myself.GiveItem1(talker, 8379, 3);
myself.ShowPage(talker, szName + "_05.htm");
party0 = gg.GetParty(talker);
myself.i_ai4 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 100000, 0, gg.MakeFString(1121000, "", "", "", "", ""));

}

}
myself.Shout(gg.MakeFString(1121005, "", "", "", "", ""));
myself.AddTimerEx(1005, 2 * 60000);
myself.i_ai2 = 1;
myself.i_ai1 = party0.id;
myself.c_ai0 = talker;

}

} else {
myself.ShowPage(talker, szName + "_02.htm");

}

}

} else {
myself.ShowPage(talker, szName + "_01.htm");

}

}

}

}

} else if (ask == -2317) {
if (reply == 1) {
if (talker.level >= 82) {
myself.InstantTeleport(talker, 103045, -124361, -2768);

} else {
myself.ShowPage(talker, "freya_deacon_q0656_01a.htm");

}

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
if (reply == 0) {
if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 2) {
myself.ShowPage(talker, "freya_deacon_q10285_10.htm");

}

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 2) {
myself.SetFlagJournal(talker, 10285, 9);
myself.ShowQuestMark(talker, 10285);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 10026) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1121004, "", "", "", "", ""));

}

}
myself.BroadcastScriptEvent(11039, 0, 8000);
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);
myself.i_ai3 = 1;
myself.i_ai2 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();

}
if (script_event_arg1 == 10005) {
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_3m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1121003, "", "", "", "", ""));

}

}
myself.BroadcastScriptEvent(11039, 0, 8000);
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);
myself.i_ai2 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();

}
if (script_event_arg1 == 11037) {
myself.i_ai3 = 0;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam maker0, HandlerParam party0) {
if (timer_id == 2002) {
if (myself.IsNullCreature(myself.c_ai0)) {
return;

}
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
if (myself.i_ai4 >= i1) {
myself.TeleportParty(myself.i_ai1, 113533, -126159, -3488, 1000, 0);
maker0 = gg.GetNpcMaker("schuttgart13_mb2314_05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11040, gg.GetIndexFromCreature(myself.c_ai0), 0);

}

} else {
myself.Shout(gg.MakeFString(1121007, "", "", "", "", ""));
myself.i_ai2 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);

}

}

}
if (timer_id == 2003) {
if (myself.i_ai3 == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1010643, gg.IntToStr(30), "", "", "", ""));

}

}
myself.AddTimerEx(2004, 10 * 60 * 1000);

}

}
if (timer_id == 2004) {
if (myself.i_ai3 == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1010643, gg.IntToStr(20), "", "", "", ""));

}

}

}

}
if (timer_id == 1005) {
i0 = myself.GetGlobalMap(7);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);

}
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 10027, 0);

}
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
myself.AddTimerEx(1006, 5000);
myself.AddTimerEx(2002, 5000);
myself.i_ai3 = 0;

}
if (timer_id == 1006) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1121001, "", "", "", "", ""));

}

}

}
	}


}