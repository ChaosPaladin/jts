package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleport_dungeon_manager_npc extends citizen {
	protected String fnHi = "tel_dungeon_npc_hi";
	protected String fnNoMoreChance = "tel_dungeon_npc_nomorechance.htm";
	protected String fnYouAreNotLeader = "tel_dungeon_npc_notleader.htm";
	protected String LevelName = "TeleportDungeon1";
	protected int RoomIndex = 0;
	protected int LevelNumber = 1;
	protected int escape_x = 1;
	protected int escape_y = 1;
	protected int escape_z = 1;
	protected int CreviceOfDiminsion = 0;
	protected int PosX0 = 1;
	protected int PosY0 = 1;
	protected int PosX1 = 1;
	protected int PosY1 = 1;
	protected int PosX2 = 1;
	protected int PosY2 = 1;
	protected int PosX3 = 1;
	protected int PosY3 = 1;
	protected int PosX4 = 1;
	protected int PosY4 = 1;
	protected int PosX5 = 1;
	protected int PosY5 = 1;
	protected int PosX6 = 1;
	protected int PosY6 = 1;
	protected int PosX7 = 1;
	protected int PosY7 = 1;
	protected int PosX8 = 1;
	protected int PosY8 = 1;

	protected void CREATED(HandlerParam rlist0) {
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
myself.AddTimerEx(2001, 1000);
myself.i_ai1 = 3;
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam maker0, HandlerParam rlist0, HandlerParam room0) {
if (gg.OwnItemCount(attacker, 57) == 1980) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0)) {
gg.Announce("차원의틈새:파티를 먼저 구성하세요");
return;

} else if (myself.i_ai2 == 1) {
gg.Announce("차원의틈새:테스트가 시작된 상태 입니다.");

} else {
maker0 = myself.GetMyMaker();
rlist0 = gg.GetRoomInfoList(LevelName);
room0 = rlist0.GetRoomInfo(RoomIndex);
if (room0.status.value == 0) {
room0.status.Exchange(1);
room0.SetParty(party0.id);
gg.Announce("차원의틈새:테스트를 시작합니다.");
myself.i_ai2 = 1;

} else {
gg.Announce("차원의틈새:현재 활성화 된 방입니다.");

}

}

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam s0) {
s0 = fnHi + RoomIndex + ".htm";
myself.ShowPage(talker, s0);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam room0, HandlerParam room1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam party0, HandlerParam rlist0, HandlerParam maker0, HandlerParam c0) {
if (ask == -1000) {
maker0 = myself.GetMyMaker();
rlist0 = gg.GetRoomInfoList(LevelName);
room0 = rlist0.GetRoomInfo(RoomIndex);
if (reply == 1) {
party0 = gg.GetPartyFromID(room0.party_id);
c0 = myself.GetLeaderOfParty(party0);
if (talker == c0) {
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
room0.status.Exchange(0);
gg.AddLog(8, c0, 1);
room0.Clear();

} else {
myself.ShowPage(talker, fnYouAreNotLeader);

}

} else if (reply == 2) {
if (gg.Party_GetLeader(talker) == talker) {
i0 = gg.GetMemoStateEx(talker, 635, 1);
if (i0 == 1) {
myself.SetMemoStateEx(talker, 635, 1, 0);
i0 = -1;
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
i2 = gg.Rand(8);
room1 = rlist0.GetRoomInfo(i2);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i2;

}

}

}

}
if (i0 == -1) {
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
room1 = rlist0.GetRoomInfo(i1);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i1;

}

}

}

}

}
if (i0 == -1) {
myself.i_ai4 = -1;

} else {
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room1.SetParty(room0.party_id);
switch (i0) {
case 0: {
myself.TeleportParty(room0.party_id, PosX0, PosY0, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 1: {
myself.TeleportParty(room0.party_id, PosX1, PosY1, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 2: {
myself.TeleportParty(room0.party_id, PosX2, PosY2, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 3: {
myself.TeleportParty(room0.party_id, PosX3, PosY3, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 4: {
myself.TeleportParty(room0.party_id, PosX4, PosY4, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 5: {
myself.TeleportParty(room0.party_id, PosX5, PosY5, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 6: {
myself.TeleportParty(room0.party_id, PosX6, PosY6, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 7: {
myself.TeleportParty(room0.party_id, PosX7, PosY7, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}

}
room0.status.Exchange(0);
gg.AddLogEx(324, talker, RoomIndex, i0);
room0.Clear();

}

} else {
myself.ShowPage(talker, fnNoMoreChance);

}

} else {
myself.ShowPage(talker, fnYouAreNotLeader);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam rlist0, HandlerParam room0, HandlerParam room1, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam c0, HandlerParam i3) {
rlist0 = gg.GetRoomInfoList(LevelName);
if (gg.IsNull(rlist0)) {
myself.AddTimerEx(timer_id, 10000);
return;

}
room0 = rlist0.GetRoomInfo(RoomIndex);
maker0 = myself.GetMyMaker();
if (timer_id == 2001) {
if (gg.IsNull(room0)) {

} else if (room0.status.value == 1) {
if (gg.GetTimeOfDay() - room0.time < 15) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

} else if (room0.PartyChanged()) {
if (gg.GetTimeOfDay() - room0.time > 3) {
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room0.status.Exchange(0);
c0 = gg.GetCreatureFromID(room0.GetMemberID(0));
gg.AddLog(8, c0, 2);
room0.Clear();

}

} else if (myself.InMyTerritory(myself.GetLeaderOfParty(gg.GetPartyFromID(room0.party_id))) == 0) {
if (gg.GetTimeOfDay() - room0.time > 3) {
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room0.status.Exchange(0);
c0 = gg.GetCreatureFromID(room0.GetMemberID(0));
gg.AddLog(8, c0, 2);
room0.Clear();

}

} else if (gg.GetTimeOfDay() - room0.time > 60 * 8 + gg.Rand(5) * 30) {
if (myself.i_ai2 == 1) {
if (RoomIndex == 8 && myself.i_ai1 == 2) {

} else {
gg.Announce("차원의틈새:테스트가 종료 되었습니다.");
room0.status.Exchange(0);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
myself.i_ai2 = 0;

}

} else {
room1 = rlist0.GetRoomInfo(8);
i0 = -1;
for (i1 = 0; i1 < room0.member_count; i1 = i1 + 1) {
if (i0 == -1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i1));
if (gg.IsNull(c0) == 0) {
i0 = gg.GetMemoStateEx(c0, 635, 0);
break;

}

}

}
if (RoomIndex == 8 && myself.i_ai1 == 2) {

} else if (i0 + 60 * 40 < gg.GetTimeOfDay()) {
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room0.status.Exchange(0);
c0 = gg.GetCreatureFromID(room0.GetMemberID(0));
gg.AddLog(8, c0, 0);
room0.Clear();

} else {
myself.AddTimerEx(2002, 5000);
myself.EarthQuakeToParty(room0.party_id, 20, 10, 1);

}

}

} else if (RoomIndex == 8 && myself.i_ai1 == 3) {
myself.AddTimerEx(2002, 5000);
myself.EarthQuakeToParty(room0.party_id, 10, 10, 1);

}

} else {
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);

}
myself.AddTimerEx(2001, 10000);

} else if (timer_id == 2002) {
if (room0.PartyChanged()) {
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room0.status.Exchange(0);
room0.Clear();

} else {
party0 = gg.GetPartyFromID(room0.party_id);
c0 = myself.GetLeaderOfParty(party0);
i3 = 0;
if (c0.alive == 0 || myself.InMyTerritory(c0) == 0) {
for (i0 = 0; i0 < room0.member_count; i0 = i0 + 1) {
c0 = gg.GetCreatureFromID(room0.GetMemberID(i0));
if (gg.HaveMemo(c0, 635)) {
myself.SetMemoStateEx(c0, 635, 1, -1);

}

}
myself.InstantTeleportInMyTerritory(escape_x, escape_y, escape_z, 100);
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room0.status.Exchange(0);
c0 = gg.GetCreatureFromID(room0.GetMemberID(0));
gg.AddLog(8, c0, 2);
room0.Clear();

} else if (RoomIndex == 8 && myself.i_ai1 == 2) {

} else {
room1 = rlist0.GetRoomInfo(8);
if (RoomIndex != 8 && gg.Rand(100) < 15 && room1.status.value == 0) {
if (room1.status.Exchange(1) == 1) {
i0 = -1;
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
i2 = gg.Rand(8);
room1 = rlist0.GetRoomInfo(i2);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i2;

}

}

}

}
if (i0 == -1) {
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
room1 = rlist0.GetRoomInfo(i1);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i1;

}

}

}

}

}
if (i0 == -1) {
myself.i_ai4 = -1;

} else {
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room1.SetParty(room0.party_id);
switch (i0) {
case 0: {
myself.TeleportParty(room0.party_id, PosX0, PosY0, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 1: {
myself.TeleportParty(room0.party_id, PosX1, PosY1, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 2: {
myself.TeleportParty(room0.party_id, PosX2, PosY2, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 3: {
myself.TeleportParty(room0.party_id, PosX3, PosY3, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 4: {
myself.TeleportParty(room0.party_id, PosX4, PosY4, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 5: {
myself.TeleportParty(room0.party_id, PosX5, PosY5, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 6: {
myself.TeleportParty(room0.party_id, PosX6, PosY6, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 7: {
myself.TeleportParty(room0.party_id, PosX7, PosY7, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}

}

}

} else {
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room1.SetParty(room0.party_id);
myself.TeleportParty(room0.party_id, PosX8, PosY8, gg.FloatToInt(myself.sm.z), 2000, 0);

}

} else {
i0 = -1;
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
i2 = gg.Rand(8);
room1 = rlist0.GetRoomInfo(i2);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i2;

}

}

}

}
if (i0 == -1) {
for (i1 = 0; i1 < 8; i1 = i1 + 1) {
if (i0 == -1) {
room1 = rlist0.GetRoomInfo(i1);
if (room1.status.value == 0) {
if (room1.status.Exchange(1) == 0) {
i0 = i1;

}

}

}

}

}
if (i0 == -1) {
myself.i_ai4 = -1;

} else {
gg.SendMakerScriptEvent(maker0, 0, 0, 0);
room1.SetParty(room0.party_id);
switch (i0) {
case 0: {
myself.TeleportParty(room0.party_id, PosX0, PosY0, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 1: {
myself.TeleportParty(room0.party_id, PosX1, PosY1, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 2: {
myself.TeleportParty(room0.party_id, PosX2, PosY2, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 3: {
myself.TeleportParty(room0.party_id, PosX3, PosY3, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 4: {
myself.TeleportParty(room0.party_id, PosX4, PosY4, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 5: {
myself.TeleportParty(room0.party_id, PosX5, PosY5, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 6: {
myself.TeleportParty(room0.party_id, PosX6, PosY6, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}
case 7: {
myself.TeleportParty(room0.party_id, PosX7, PosY7, gg.FloatToInt(myself.sm.z), 2000, 0);
break;

}

}

}

}
room0.status.Exchange(0);
room0.Clear();

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 3 || script_event_arg1 == 2) {
myself.i_ai1 = script_event_arg1;

}
	}


}