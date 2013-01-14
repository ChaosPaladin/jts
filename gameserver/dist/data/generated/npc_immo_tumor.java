package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_tumor extends default_npc {
	protected int tide = 0;
	protected String type = "";
	protected int zone = 0;
	protected int room = 0;
	protected String z3_entrance = "zone3_entrance";
	protected String ech_atk_seq0_maker = "rumwarsha15_1424_echmusm1";
	protected String ech_atk_seq1_maker = "rumwarsha15_1424_echmusm2";
	protected String ech_atk_expel_maker = "rumwarsha15_1424_expelm1";
	protected String ech_def_seq0_maker = "rumwarsha15_1424_ech_dummy1m1";
	protected String ech_def_seq1_maker = "rumwarsha15_1424_ech_dummy2m1";
	protected String ech_def_seq2_maker = "rumwarsha15_1424_ech_dummy2m2";
	protected String ech_def_seq3_maker = "rumwarsha15_1424_defwagonm1";
	protected String ech_def_seq4_maker = "rumwarsha15_1424_veinm1";
	protected String dispatcher_maker = "";
	protected int Skill_Branding = 542375937;
	protected int reward_siege = 13797;
	protected int reward_rate = 15;
	protected int cost_warp_low = 1;
	protected int cost_warp_high = 3;
	protected int TIME_reward_drop = 60;
	protected int TM_RESPAWN_BLANK = 78001;
	protected int TM_SPAWN_VEIN = 78002;
	protected int TM_SEND_HELP = 78003;
	protected int TM_REWARD_DROP = 78004;
	protected int TM_TUMOR_CHECK = 78005;
	protected int TIME_respawn_blank = 10;
	protected int Vein01 = 1018709;
	protected String Vein01_AI = "spc_vein_2lv_1";
	protected int Vein02 = 1018710;
	protected String Vein02_AI = "spc_vein_2lv_2";
	protected int Vein03 = 1018711;
	protected String Vein03_AI = "spc_vein_2lv_3";
	protected int Vein_Convergency = 7;
	protected int Vein_Size = 50;
	protected int regen_value = 24;
	protected int Vein_Delay = 30;
	protected int Vein_Demand = 1500;
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected String fnHi = "";
	protected String fnHi_warpAsk = "tumor002.htm";
	protected String fnHi_warpBossAsk = "tumor002a.htm";
	protected String fnHi_warpBossAsk2 = "tumor002b.htm";
	protected String fnHi_warpConfirm = "tumor003.htm";
	protected String fnHi_warpConfirm2 = "tumor003a.htm";
	protected String fnHi_warpFailed = "tumor004.htm";
	protected String fnHi_warpNoDest = "tumor005.htm";
	protected String fnHi_notParty = "tumor006.htm";
	protected String fnHi_warpBlank = "tumor099.htm";
	protected int z2_tumor1_x = -176036;
	protected int z2_tumor1_y = 210002;
	protected int z2_tumor1_z = -11948;
	protected int z2_tumor2_x = -176039;
	protected int z2_tumor2_y = 208203;
	protected int z2_tumor2_z = -11949;
	protected int z2_tumor3_x = -183288;
	protected int z2_tumor3_y = 208205;
	protected int z2_tumor3_z = -11939;
	protected int z2_tumor4_x = -183290;
	protected int z2_tumor4_y = 210004;
	protected int z2_tumor4_z = -11939;
	protected int z3_tumor1_x = -179779;
	protected int z3_tumor1_y = 212540;
	protected int z3_tumor1_z = -15520;
	protected int z3_tumor2_x = -177028;
	protected int z3_tumor2_y = 211135;
	protected int z3_tumor2_z = -15520;
	protected int z3_tumor3_x = -176355;
	protected int z3_tumor3_y = 208043;
	protected int z3_tumor3_z = -15520;
	protected int z3_tumor4_x = -179284;
	protected int z3_tumor4_y = 205990;
	protected int z3_tumor4_z = -15520;
	protected int z3_tumor5_x = -182268;
	protected int z3_tumor5_y = 208218;
	protected int z3_tumor5_z = -15520;
	protected int z3_tumor6_x = -182069;
	protected int z3_tumor6_y = 211140;
	protected int z3_tumor6_z = -15520;
	protected int echmus_x = -179537;
	protected int echmus_y = 209551;
	protected int echmus_z = -15504;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0) {
if (gg.IsSameString(type, "boss") == 1) {
gg.Castle_GateOpenCloseEx(z3_entrance, 1, myself.InstantZone_GetId());

}
if (gg.IsSameString(type, "def") == 1) {
if (babble_mode == 1) {
myself.Shout("경직 시간 시작");

}
myself.AddTimerEx(TM_RESPAWN_BLANK, TIME_respawn_blank * 1000);

}
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam maker0, HandlerParam party0) {
if (timer_id == TM_TUMOR_CHECK) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
if (babble_mode == 1) {
myself.Shout("점령 상태 요청");

}
gg.SendMakerScriptEvent(maker0, 78010061, room, 0);

}

} else if (timer_id == TM_RESPAWN_BLANK) {
if (babble_mode == 1) {
myself.Shout("정상화");

}
myself.i_ai0 = 1;
myself.AddTimerEx(TM_SPAWN_VEIN, 1000);
myself.AddTimerEx(TM_REWARD_DROP, TIME_reward_drop * 1000);

} else if (timer_id == TM_SPAWN_VEIN) {
maker0 = myself.GetMyMaker();
if (maker0.npc_count < maker0.maximum_npc && myself.i_ai2 < Vein_Demand) {
if (babble_mode == 1) {
myself.Say("베인 스폰 시킴");

}
switch (gg.Rand(3)) {
case 0: {
myself.CreateOnePrivateEx(Vein01, Vein01_AI, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(Vein02, Vein02_AI, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(Vein03, Vein03_AI, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.y) + gg.Rand(Vein_Convergency) * Vein_Size - gg.Rand(Vein_Convergency) * Vein_Size, gg.FloatToInt(myself.sm.z), gg.Rand(61440), 0, 0, 0);
break;

}

}

} else if (babble_mode == 1) {
myself.Say("NPC최대 수 초과");

}
i0 = gg.FloatToInt(Vein_Delay / 2) + gg.Rand(gg.FloatToInt(Vein_Delay / 2));
myself.AddTimerEx(TM_SPAWN_VEIN, i0 * 1000);

} else if (timer_id == TM_REWARD_DROP) {
if (gg.Rand(100) <= reward_rate) {
if (babble_mode == 1) {
myself.Say("종양체(?활성) - 보상 아이템 드랍");

}
myself.DropItem1(myself.sm, reward_siege, 1);

}
myself.AddTimerEx(TM_REWARD_DROP, TIME_reward_drop * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam party0, HandlerParam i0, HandlerParam s0, HandlerParam c0) {
if (script_event_arg1 == 78010058 && myself.i_ai0 != 0) {
if (script_event_arg2 == 0) {
myself.i_ai2 = myself.i_ai2 + regen_value;
if (myself.i_ai2 >= Vein_Demand) {
if (babble_mode == 1) {
s0 = gg.IntToStr(room) + "번 방 종양체 활성화!";
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.Despawn();

}

}
c0 = gg.GetCreatureFromID(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEventEx(c0, 998915, 0, 0);

}
if (babble_mode == 1) {
myself.Say("재생력 상승! 영혼관" + gg.IntToStr(myself.i_ai2) + "점");

}

} else if (script_event_arg2 == 1) {
myself.i_ai2 = myself.i_ai2 - script_event_arg3;
if (babble_mode == 1) {
myself.Say("재생력 하락! 영혼관" + gg.IntToStr(myself.i_ai2) + "점");

}

}

} else if (script_event_arg1 == 78010062 && script_event_arg2 == room && myself.i_ai0 != 0) {
if (script_event_arg3 != 9999 && gg.OwnItemCount(myself.c_ai0, reward_siege) >= cost_warp_low) {
s0 = gg.MakeFString(1800247, myself.c_ai0.name, "", "", "", "");
if (babble_mode == 1) {
s0 = s0 + ": " + gg.IntToStr(room) + "->" + gg.IntToStr(script_event_arg3);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (babble_mode == 1) {
myself.Say("점령지 이동 비용 지불");

}
myself.DeleteItem1(myself.c_ai0, reward_siege, cost_warp_low);

} else if (script_event_arg3 != 9999) {
myself.ShowPage(myself.c_ai0, fnHi_warpFailed);
return;

}
if (script_event_arg3 == 211) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z2_tumor1_x + gg.Rand(100) - gg.Rand(100), z2_tumor1_y + gg.Rand(100) - gg.Rand(100), z2_tumor1_z);

} else {
myself.TeleportParty(party0.id, z2_tumor1_x + gg.Rand(100) - gg.Rand(100), z2_tumor1_y + gg.Rand(100) - gg.Rand(100), z2_tumor1_z, 2000, 0);

}

} else if (script_event_arg3 == 221) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z2_tumor2_x + gg.Rand(100) - gg.Rand(100), z2_tumor2_y + gg.Rand(100) - gg.Rand(100), z2_tumor2_z);

} else {
myself.TeleportParty(party0.id, z2_tumor2_x + gg.Rand(100) - gg.Rand(100), z2_tumor2_y + gg.Rand(100) - gg.Rand(100), z2_tumor2_z, 2000, 0);

}

} else if (script_event_arg3 == 231) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z2_tumor3_x + gg.Rand(100) - gg.Rand(100), z2_tumor3_y + gg.Rand(100) - gg.Rand(100), z2_tumor3_z);

} else {
myself.TeleportParty(party0.id, z2_tumor3_x + gg.Rand(100) - gg.Rand(100), z2_tumor3_y + gg.Rand(100) - gg.Rand(100), z2_tumor3_z, 2000, 0);

}

} else if (script_event_arg3 == 241) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z2_tumor4_x + gg.Rand(100) - gg.Rand(100), z2_tumor4_y + gg.Rand(100) - gg.Rand(100), z2_tumor4_z);

} else {
myself.TeleportParty(party0.id, z2_tumor4_x + gg.Rand(100) - gg.Rand(100), z2_tumor4_y + gg.Rand(100) - gg.Rand(100), z2_tumor4_z, 2000, 0);

}

} else if (script_event_arg3 == 301) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z3_tumor1_x + gg.Rand(100) - gg.Rand(100), z3_tumor1_y + gg.Rand(100) - gg.Rand(100), z3_tumor1_z);

} else {
myself.TeleportParty(party0.id, z3_tumor1_x + gg.Rand(100) - gg.Rand(100), z3_tumor1_y + gg.Rand(100) - gg.Rand(100), z3_tumor1_z, 2000, 0);

}

} else if (script_event_arg3 == 302) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z3_tumor2_x + gg.Rand(100) - gg.Rand(100), z3_tumor2_y + gg.Rand(100) - gg.Rand(100), z3_tumor2_z);

} else {
myself.TeleportParty(party0.id, z3_tumor2_x + gg.Rand(100) - gg.Rand(100), z3_tumor2_y + gg.Rand(100) - gg.Rand(100), z3_tumor2_z, 2000, 0);

}

} else if (script_event_arg3 == 303) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z3_tumor3_x + gg.Rand(100) - gg.Rand(100), z3_tumor3_y + gg.Rand(100) - gg.Rand(100), z3_tumor3_z);

} else {
myself.TeleportParty(party0.id, z3_tumor3_x + gg.Rand(100) - gg.Rand(100), z3_tumor3_y + gg.Rand(100) - gg.Rand(100), z3_tumor3_z, 2000, 0);

}

} else if (script_event_arg3 == 304) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z3_tumor4_x + gg.Rand(100) - gg.Rand(100), z3_tumor4_y + gg.Rand(100) - gg.Rand(100), z3_tumor4_z);

} else {
myself.TeleportParty(party0.id, z3_tumor4_x + gg.Rand(100) - gg.Rand(100), z3_tumor4_y + gg.Rand(100) - gg.Rand(100), z3_tumor4_z, 2000, 0);

}

} else if (script_event_arg3 == 305) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai0, z3_tumor5_x + gg.Rand(100) - gg.Rand(100), z3_tumor5_y + gg.Rand(100) - gg.Rand(100), z3_tumor5_z);

} else {
myself.TeleportParty(party0.id, z3_tumor5_x + gg.Rand(100) - gg.Rand(100), z3_tumor5_y + gg.Rand(100) - gg.Rand(100), z3_tumor5_z, 2000, 0);

}

} else if (script_event_arg3 == 9999) {
myself.ShowPage(myself.c_ai0, fnHi_warpNoDest);

}

} else if (script_event_arg1 == 78010063 && script_event_arg2 == room) {
s0 = gg.MakeFString(1800248, myself.c_ai0.name, "", "", "", "");
if (babble_mode == 1) {
s0 = s0 + ": " + gg.IntToStr(room) + "-> 에키무스 방";

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (gg.OwnItemCount(myself.c_ai0, reward_siege) >= cost_warp_high) {
if (babble_mode == 1) {
myself.Say("파티 스위칭 비용 지불");

}
myself.DeleteItem1(myself.c_ai0, reward_siege, cost_warp_high);

} else if (gg.IsSameString(type, "boss") == 0) {
myself.ShowPage(myself.c_ai0, fnHi_warpFailed);
return;

}
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
myself.TeleportParty(party0.id, echmus_x + gg.Rand(100) - gg.Rand(100), echmus_y + gg.Rand(100) - gg.Rand(100), echmus_z, 2000, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, party0.id, 0);

}

} else if (babble_mode == 1) {
myself.InstantTeleport(myself.c_ai0, echmus_x + gg.Rand(100) - gg.Rand(100), echmus_y + gg.Rand(100) - gg.Rand(100), echmus_z);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, myself.c_ai0.id, 1);

}

} else {
myself.ShowPage(myself.c_ai0, fnHi_notParty);

}

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsNullCreature(talker) == 0) {
myself.c_ai0 = talker;

}
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam party0, HandlerParam i0, HandlerParam s0) {
if (myself.IsNullCreature(talker) == 0) {
myself.c_ai0 = talker;

}
if (ask == -7801) {
if (reply == 1) {
if (babble_mode == 1) {
myself.Say("reply1받음");

}
if (myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1 && zone == 3 && tide == 0) {
myself.ShowPage(talker, fnHi_warpBossAsk2);

} else if (myself.i_ai0 == 0 && gg.IsSameString(type, "boss") == 1) {
myself.ShowPage(talker, fnHi_warpBossAsk);

} else if (myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1 && zone == 2 || zone == 3 && tide == 1) {
myself.ShowPage(talker, fnHi_warpAsk);

} else {
myself.ShowPage(talker, fnHi_warpBlank);

}

} else if (reply == 2 && myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1) {
if (babble_mode == 1) {
myself.Say("reply2받음");

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0 || babble_mode == 1) {
myself.ShowPage(talker, fnHi_warpConfirm);

} else {
myself.ShowPage(talker, fnHi_notParty);

}

} else if (reply == 4 && myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1) {
if (babble_mode == 1) {
myself.Say("reply4받음");

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0 || babble_mode == 1) {
if (gg.OwnItemCount(talker, reward_siege) >= cost_warp_low) {
if (babble_mode == 1) {
s0 = gg.IntToStr(room) + "방으로 부터 이동 시도!";
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
myself.AddTimerEx(TM_TUMOR_CHECK, 1);

} else {
myself.ShowPage(talker, fnHi_warpFailed);

}

} else {
myself.ShowPage(talker, fnHi_notParty);

}

} else if (reply == 3 && myself.i_ai0 == 0 && gg.IsSameString(type, "boss") == 1) {
if (babble_mode == 1) {
myself.Say("reply3받음");

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
s0 = gg.MakeFString(1800248, myself.c_ai0.name, "", "", "", "");
if (babble_mode == 1) {
s0 = s0 + ": " + gg.IntToStr(room) + "-> 에키무스 방";

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.TeleportParty(party0.id, echmus_x + gg.Rand(100) - gg.Rand(100), echmus_y + gg.Rand(100) - gg.Rand(100), echmus_z, 2000, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, party0.id, 0);

}

} else if (babble_mode == 1) {
myself.InstantTeleport(talker, echmus_x + gg.Rand(100) - gg.Rand(100), echmus_y + gg.Rand(100) - gg.Rand(100), echmus_z);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, talker.id, 1);

}

} else {
myself.ShowPage(talker, fnHi_notParty);
return;

}
if (myself.IsNullParty(party0) == 0 || babble_mode == 1) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.Despawn();

}

} else if (reply == 6 && myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1 && zone == 3 && tide == 0) {
if (babble_mode == 1) {
myself.Say("reply6받음");

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0 || babble_mode == 1) {
myself.ShowPage(talker, fnHi_warpConfirm2);

} else {
myself.ShowPage(talker, fnHi_notParty);

}

} else if (reply == 5 && myself.i_ai0 != 0 && gg.IsSameString(type, "def") == 1 && zone == 3 && tide == 0) {
if (babble_mode == 1) {
myself.Say("reply5받음");

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0 || babble_mode == 1) {
if (gg.OwnItemCount(talker, reward_siege) >= cost_warp_high) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_expel_maker);
if (gg.IsNull(maker0) == 0) {
if (babble_mode == 1) {
s0 = gg.IntToStr(room) + "방으로 부터 스위칭 시도!";
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
gg.SendMakerScriptEvent(maker0, 78010069, room, 0);

}

} else {
myself.ShowPage(talker, fnHi_warpFailed);

}

} else {
myself.ShowPage(talker, fnHi_notParty);

}

} else {
myself.ShowPage(talker, fnHi_warpBlank);

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.BroadcastScriptEventEx(989812, 0, 0, 1500);
	}


}