package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rift_watcher_1 extends teleport_dungeon_admit_npc {
	protected void MENU_SELECTED(HandlerParam LevelNumber, HandlerParam ask, HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam party0, HandlerParam reply, HandlerParam rlist0, HandlerParam room0, HandlerParam talker) {
if (ask == 635) {
myself.SetCurrentQuestID(635);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 635) {
if (reply == 1) {
party0 = gg.GetParty(talker);
c0 = gg.Party_GetLeader(talker);
i0 = gg.Party_GetCount(talker);
i1 = 0;
i3 = -1;
if (gg.IsNull(party0)) {
myself.ShowPage(talker, "rift_watcher_1_q0635_01.htm");

} else if (c0 != talker) {
myself.FHTML_SetFileName(fhtml0, "rift_watcher_1_q0635_02.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);

} else {
i6 = myself.GetCurrentTick();
for (i2 = 0; i2 < i0; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(talker, i2);
if (myself.GetMemoCount(c1) > 41 - 1 && gg.HaveMemo(c1, 635) == 0) {
i1 = 2;
myself.FHTML_SetFileName(fhtml0, "rift_watcher_1_q0635_03a.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);

} else if (gg.OwnItemCount(c1, 7079) < 21) {
i5 = gg.GetMemoStateEx(c1, 635, 1);
if (gg.GetMemoState(c1, 635) != 2 || i6 - i5 > 3600) {
i1 = 1;
myself.FHTML_SetFileName(fhtml0, "rift_watcher_1_q0635_03.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);

}

}

}
if (i1 == 0) {
rlist0 = gg.GetRoomInfoList(LevelName);
if (gg.IsNull(rlist0)) {
myself.Say("Error!! 방 정보를 조회 할 수 없습니다.");

} else {
i3 = -1;
i5 = 0;
for (i4 = 0; i4 < 8; i4 = i4 + 1) {
room0 = rlist0.GetRoomInfo(i4);
if (room0.status.value == 1) {
if (room0.party_id == party0.id) {
i3 = -2;

}

} else {
i5 = i5 + 1;

}

}
if (i3 != -2 && i5 >= 3) {
i3 = -1;
for (i4 = 0; i4 < 8; i4 = i4 + 1) {
if (i3 == -1) {
i5 = gg.Rand(8);
room0 = rlist0.GetRoomInfo(i5);
if (room0.status.value == 0) {
if (room0.status.Exchange(1) == 0) {
i3 = i5;

}

}

}

}
if (i3 == -1) {
for (i4 = 0; i4 < 8; i4 = i4 + 1) {
if (i3 == -1) {
room0 = rlist0.GetRoomInfo(i4);
if (room0.status.value == 0) {
if (room0.status.Exchange(1) == 0) {
i3 = i4;

}

}

}

}

}
room0.SetParty(party0.id);
switch (i3) {
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
if (i3 == -1) {
myself.ShowPage(talker, "rift_watcher_1_q0635_04.htm");

} else if (i3 == -2) {
myself.ShowPage(talker, "rift_watcher_1_q0635_08.htm");

} else {
i6 = gg.GetTimeOfDay();
for (i2 = 0; i2 < i0; i2 = i2 + 1) {
if (myself.DistFromMe(c0) <= 1500) {
c1 = gg.Party_GetCreature(talker, i2);
if (gg.GetMemoState(c1, 635) == 2) {
myself.SetMemoState(c1, 635, 0);

} else {
myself.DeleteItem1(c1, 7079, 21);

}
myself.SetMemoState(c1, 635, i6);
if (c1 == c0) {
myself.SetMemoStateEx(c1, 635, 1, 1);
gg.AddLogEx(7, c1, i3, LevelNumber);

} else {
myself.SetMemoStateEx(c1, 635, 1, 0);

}

}

}
myself.ShowPage(talker, "rift_watcher_1_q0635_05.htm");

}

}

}

}
if (reply == 2) {
myself.RemoveMemo(talker, 505);
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 10000;
i2 = i0 - i1 + 5 / 10000;
myself.ShowPage(talker, "rift_watcher_1_q0635_06.htm");
myself.RemoveMemo(talker, 635);
gg.AddLog(2, talker, 635);
if (gg.GetSSQPart(talker) == 2) {
i6 = 1;

} else {
i6 = 2;

}
if (i1 >= 95 && i1 < 195) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, -80542, 150315, -3040);
break;

}
case 2: {
myself.InstantTeleport(talker, -82340, 151575, -3120);
break;

}

}

} else if (i1 >= 195 && i1 < 295) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, -13996, 121413, -2984);
break;

}
case 2: {
myself.InstantTeleport(talker, -14727, 124002, -3112);
break;

}

}

} else if (i1 >= 295 && i1 < 395) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 16320, 142915, -2696);
break;

}
case 2: {
myself.InstantTeleport(talker, 18501, 144673, -3056);
break;

}

}

} else if (i1 >= 395 && i1 < 495) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 83312, 149236, -3400);
break;

}
case 2: {
myself.InstantTeleport(talker, 81572, 148580, -3464);
break;

}

}

} else if (i1 >= 495 && i1 < 595) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 111359, 220959, -3544);
break;

}
case 2: {
myself.InstantTeleport(talker, 112441, 220149, -3544);
break;

}

}

} else if (i1 >= 595 && i1 < 695) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 83057, 53983, -1488);
break;

}
case 2: {
myself.InstantTeleport(talker, 82842, 54613, -1520);
break;

}

}

} else if (i1 >= 695 && i1 < 795) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 146955, 26690, -2200);
break;

}
case 2: {
myself.InstantTeleport(talker, 147528, 28899, -2264);
break;

}

}

} else if (i1 >= 795 && i1 < 895) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 115206, 74775, -2600);
break;

}
case 2: {
myself.InstantTeleport(talker, 116651, 77512, -2688);
break;

}

}

} else if (i1 >= 995 && i1 < 1095) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 148326, -55533, -2776);
break;

}
case 2: {
myself.InstantTeleport(talker, 149968, -56645, -2976);
break;

}

}

} else if (i1 >= 1095 && i0 < 1195) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 45605, -50360, -792);
break;

}
case 2: {
myself.InstantTeleport(talker, 44505, -48331, -792);
break;

}

}

} else if (i1 >= 1195 && i0 < 1295) {
switch (i6) {
case 1: {
myself.InstantTeleport(talker, 86730, -143148, -1336);
break;

}
case 2: {
myself.InstantTeleport(talker, 85048, -142046, -1536);
break;

}

}

} else if (i2 == 1) {
myself.InstantTeleport(talker, -41443, 210030, -5080);

} else if (i2 == 2) {
myself.InstantTeleport(talker, -53034, -250421, -7935);

} else if (i2 == 3) {
myself.InstantTeleport(talker, 45160, 123605, -5408);

} else if (i2 == 4) {
myself.InstantTeleport(talker, 46488, 170184, -4976);

} else if (i2 == 5) {
myself.InstantTeleport(talker, 111521, 173905, -5432);

} else if (i2 == 6) {
myself.InstantTeleport(talker, -20395, -250930, -8191);

} else if (i2 == 7) {
myself.InstantTeleport(talker, -21482, 77253, -5168);

} else if (i2 == 8) {
myself.InstantTeleport(talker, 140688, 79565, -5424);

} else if (i2 == 9) {
myself.InstantTeleport(talker, -52007, 78986, -4736);

} else if (i2 == 10) {
myself.InstantTeleport(talker, 118547, 132669, -4824);

} else if (i2 == 11) {
myself.InstantTeleport(talker, 172562, -17730, -4896);

} else if (i2 == 12) {
myself.InstantTeleport(talker, 83344, 209110, -5432);

} else if (i2 == 13) {
myself.InstantTeleport(talker, -19154, 13415, -4896);

} else if (i2 == 14) {
myself.InstantTeleport(talker, 12747, -248614, -9607);

} else if (i2 == 21) {
myself.InstantTeleport(talker, -41559, 209140, -5080);

} else if (i2 == 22) {
myself.InstantTeleport(talker, 42448, 143943, -5376);

} else if (i2 == 23) {
myself.InstantTeleport(talker, 45239, 124522, -5408);

} else if (i2 == 24) {
myself.InstantTeleport(talker, 45680, 170299, -4976);

} else if (i2 == 25) {
myself.InstantTeleport(talker, 110659, 174008, -5432);

} else if (i2 == 26) {
myself.InstantTeleport(talker, 77132, 78399, -5120);

} else if (i2 == 27) {
myself.InstantTeleport(talker, -22408, 77375, -5168);

} else if (i2 == 28) {
myself.InstantTeleport(talker, 139807, 79675, -5424);

} else if (i2 == 29) {
myself.InstantTeleport(talker, -53177, 79100, -4736);

} else if (i2 == 30) {
myself.InstantTeleport(talker, 117647, 132801, -4824);

} else if (i2 == 31) {
myself.InstantTeleport(talker, 171684, -17602, -4896);

} else if (i2 == 32) {
myself.InstantTeleport(talker, 82456, 209218, -5432);

} else if (i2 == 33) {
myself.InstantTeleport(talker, -20105, 13505, -4896);

} else if (i2 == 34) {
myself.InstantTeleport(talker, 113299, 84547, -6536);

}

}
if (reply == 3) {
if (myself.GetSSQStatus() == 1) {
if (gg.GetSSQPart(talker) != 2) {
switch (gg.Rand(3)) {
case 0: {
myself.InstantTeleport(talker, -81328, 86536, -5152);
break;

}
case 1: {
myself.InstantTeleport(talker, -81262, 86468, -5152);
break;

}
case 2: {
myself.InstantTeleport(talker, -81248, 86582, -5152);
break;

}

}
myself.ShowPage(talker, "rift_watcher_1_q0635_10.htm");

} else if (gg.GetSSQPart(talker) == 2) {
switch (gg.Rand(3)) {
case 0: {
myself.InstantTeleport(talker, -80316, 111356, -4896);
break;

}
case 1: {
myself.InstantTeleport(talker, -80226, 111290, -4896);
break;

}
case 2: {
myself.InstantTeleport(talker, -80217, 111435, -4896);
break;

}

}
myself.ShowPage(talker, "rift_watcher_1_q0635_10.htm");

} else {
myself.ShowPage(talker, "rift_watcher_1_q0635_11.htm");

}

} else {
myself.ShowPage(talker, "rift_watcher_1_q0635_12.htm");

}

}

}
super;
	}


}