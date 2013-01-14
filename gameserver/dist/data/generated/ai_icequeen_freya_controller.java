package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_controller extends default_npc {
	protected String MAKER_freya_1st = "schuttgart29_2314_100m1";
	protected String MAKER_freya_2nd = "schuttgart29_2314_102m1";
	protected String MAKER_freya_3rd = "schuttgart29_2314_104m1";
	protected String MAKER_freya_4th = "schuttgart29_2314_106m1";
	protected String MAKER_freya_ending = "schuttgart29_2314_108m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";
	protected String MAKER_ice_castle = "schuttgart29_2314_06m1";
	protected String MAKER_freya_2nd_spelling = "schuttgart29_2314_102m3";
	protected int TIMER_1st_phase_success = 2314201;
	protected int TIMER_2nd_phase_success = 2314202;
	protected int TIMER_3rd_phase_success = 2314203;
	protected int TIMER_4th_phase_success = 2314204;
	protected int TIMER_SCENE_15 = 2314501;
	protected int TIMER_SCENE_15_END = 2314511;
	protected int scene_num_15 = 15;
	protected int scene_sec_15 = 53500;
	protected int TIMER_SCENE_16 = 2314502;
	protected int TIMER_SCENE_16_END = 2314512;
	protected int scene_num_16 = 16;
	protected int scene_sec_16 = 24100;
	protected int TIMER_SCENE_17 = 2314503;
	protected int TIMER_SCENE_17_END = 2314513;
	protected int scene_num_17 = 17;
	protected int scene_sec_17 = 21500;
	protected int TIMER_SCENE_18 = 2314504;
	protected int TIMER_SCENE_18_END = 2314514;
	protected int scene_num_18 = 18;
	protected int scene_sec_18 = 27000;
	protected int TIMER_SCENE_19 = 2314505;
	protected int TIMER_SCENE_19_END = 2314515;
	protected int scene_num_19 = 19;
	protected int scene_sec_19 = 16000;
	protected int TIMER_SCENE_20 = 2314506;
	protected int TIMER_SCENE_20_END = 2314516;
	protected int scene_num_20 = 20;
	protected int scene_sec_20 = 3000;
	protected int TIMER_SCENE_22 = 2314508;
	protected int TIMER_SCENE_22_END = 2314518;
	protected int scene_num_22 = 22;
	protected int scene_sec_22 = 22500;
	protected int TIMER_SCENE_23 = 2314509;
	protected int TIMER_SCENE_23_END = 2314519;
	protected int scene_num_23 = 23;
	protected int scene_sec_23 = 7000;
	protected int TIMER_knight = 2314205;
	protected int TIMER_castle = 2314206;
	protected int TIMER_start = 2314207;
	protected int TIMER_hold_desire = 2314301;
	protected int TIMER_ZONEINFO_CHG = 2314302;
	protected int TIMER_reset_routine = 2314305;
	protected int TIMER_force_defeat = 2314023;
	protected int TIMER_2nd_hard_timer = 2314026;
	protected int FLAG_SPAWN = 231400;
	protected int FLAG_NO_SPAWN = 231401;
	protected int phase_to_phase = 60000;
	protected String IceQueen_DoorName = "icequeen_door_001";
	protected int is_hard_mode = 0;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
if (debug_mode) {
myself.Shout("controller spawned");

}
myself.i_ai0 = 23140001;
myself.i_ai1 = FLAG_NO_SPAWN;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_ai6 = 6;
myself.i_ai7 = 0;
myself.CreateOnePrivateEx(1018919, "ai_icequeen_freya_entrance", 0, 0, 114394, -112383, -11200, 0, is_hard_mode, 0, 0);
gg.Castle_GateOpenCloseEx(IceQueen_DoorName, 0, myself.InstantZone_GetId());
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam maker0) {
if (myself.i_ai4 == 0) {
if (debug_mode) {
myself.Say("SEE_CREATURE");
myself.Say("PC의 아데나 : " + gg.OwnItemCount(creature, 57));
myself.Say("3423 : opening 연출 생략하고 전투 시작");
myself.Say("3424 : 2페이즈부터 시작.");
myself.Say("3425 : 3페이즈부터 시작.");
myself.Say("else : 정상 진행");

}
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 || myself.IsInCategory(123, creature.npc_class_id) == 1) {
myself.i_ai4 = 1;
if (debug_mode == 1 && gg.OwnItemCount(creature, 57) == 3423) {
myself.AddTimerEx(TIMER_SCENE_15_END, 4 * 1000);

} else if (debug_mode == 1 && gg.OwnItemCount(creature, 57) == 3424) {
myself.AddTimerEx(TIMER_1st_phase_success, 4 * 1000);

} else if (debug_mode == 1 && gg.OwnItemCount(creature, 57) == 3425) {
myself.AddTimerEx(TIMER_2nd_phase_success, 7 * 1000);

} else {
myself.AddTimerEx(TIMER_SCENE_15, 10 * 1000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 23140014) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 7000, 0, gg.MakeFString(1801086, "", "", "", "", ""));
gg.Castle_GateOpenCloseEx(IceQueen_DoorName, 1, myself.InstantZone_GetId());
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140014, 0);

}
myself.i_ai1 = FLAG_SPAWN;
myself.AddTimerEx(TIMER_knight, 1000);
myself.AddTimerEx(TIMER_castle, 1000);

} else if (myself.i_ai2 == 1) {
if (debug_mode) {
myself.Shout("Phase1 battle already started. event duplicated");

}

}

} else if (script_event_arg1 == 23140016) {
if (debug_mode) {
myself.Shout("Phase1 battle end");

}
myself.i_ai1 = FLAG_NO_SPAWN;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, FLAG_NO_SPAWN, 0, 0);

}
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140055, 0);

}
if (script_event_arg2 == 1) {
if (debug_mode) {
myself.Shout("Phase1 battle success. wait 1min");

}
myself.AddTimerEx(TIMER_SCENE_16, 1000);
myself.BroadcastScriptEventEx(23140020, 1, 0, 4000);

} else if (script_event_arg2 == 2) {
if (debug_mode) {
myself.Shout("Phase1 battle failed.");

}
myself.AddTimerEx(TIMER_SCENE_22, 1000);

}

} else if (script_event_arg1 == 23140017) {
if (debug_mode) {
myself.Shout("Phase2 battle end");

}
myself.i_ai1 = FLAG_NO_SPAWN;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, FLAG_NO_SPAWN, 0, 0);

}
if (script_event_arg2 == 1) {
if (debug_mode) {
myself.Shout("Phase2 battle success. wait 1min");

}
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140050, 1000);

}
myself.AddTimerEx(TIMER_SCENE_17, phase_to_phase);
myself.BroadcastScriptEventEx(23140020, 2, 0, 4000);

} else if (script_event_arg2 == 2) {
if (debug_mode) {
myself.Shout("Phase2 battle failed.");

}
myself.AddTimerEx(TIMER_SCENE_22, 1000);

}

} else if (script_event_arg1 == 23140018) {
if (debug_mode) {
myself.Shout("Phase3 battle end");

}
myself.i_ai1 = FLAG_NO_SPAWN;
if (script_event_arg2 == 1) {
if (debug_mode) {
myself.Shout("Phase3 battle success. no wait and goint 4th phase");

}
myself.AddTimerEx(TIMER_hold_desire, 1000);

} else if (script_event_arg2 == 2) {
if (debug_mode) {
myself.Shout("Phase3 battle failed.");

}
myself.AddTimerEx(TIMER_SCENE_22, 1000);

}

} else if (script_event_arg1 == 23140019) {
if (debug_mode) {
myself.Shout("Phase4 battle end");

}
myself.i_ai1 = FLAG_NO_SPAWN;
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140055, 0);
gg.SendScriptEvent(c0, 23140019, 0);

}
if (script_event_arg2 == 1) {
if (debug_mode) {
myself.Shout("Phase4 battle success.");

}
myself.AddTimerEx(TIMER_SCENE_19, 1000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140006, 0, 0);

}
myself.BroadcastScriptEventEx(23140020, 4, 0, 4000);

} else if (script_event_arg2 == 2) {
if (debug_mode) {
myself.Shout("Phase4 battle failed.");

}
myself.AddTimerEx(TIMER_SCENE_22, 1000);

}

} else if (script_event_arg1 == 23140022) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai3 = script_event_arg2;

}

} else if (script_event_arg1 == 23140048) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140055, 0);

}
myself.i_ai5 = 1;

} else if (script_event_arg1 == 23140049) {
myself.i_ai5 = 0;

} else if (script_event_arg1 == 23140053) {
myself.AddTimerEx(TIMER_SCENE_23, 1000);

} else if (script_event_arg1 == 23140057) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140057, 0);

}

} else if (script_event_arg1 == 23140058) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140058, 0);

}

} else if (script_event_arg1 == 23141234) {
myself.AddTimerEx(TIMER_SCENE_22_END, 1);

} else if (script_event_arg1 == 23140064) {
if (myself.i_ai1 == FLAG_NO_SPAWN) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140065, 0);

}

}

} else if (script_event_arg1 == 23140066 || script_event_arg1 == 23140067 || script_event_arg1 == 23140068) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, script_event_arg1, 0);

}

} else if (script_event_arg1 == 23140070) {
if (script_event_arg2 == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 1, 5000, 0, gg.MakeFString(1801189, "", "", "", "", ""));

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 1, 5000, 0, gg.MakeFString(1801111, "", "", "", "", ""));

}

} else if (script_event_arg1 == 23140059) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, script_event_arg1, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam c0) {
if (timer_id == TIMER_1st_phase_success) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 7000, 0, gg.MakeFString(1801087, "", "", "", "", ""));
myself.i_ai0 = 23140002;
myself.i_ai1 = FLAG_SPAWN;
myself.AddTimerEx(TIMER_knight, 1000);
myself.AddTimerEx(TIMER_castle, 1000);
if (is_hard_mode == 1) {
if (debug_mode) {
myself.Say("하드모드. 6분 타이머 시작.");

}
myself.AddTimerEx(TIMER_2nd_hard_timer, 1000);

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_2nd);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_2nd_spelling);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, FLAG_SPAWN, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
gg.SendMakerScriptEvent(maker0, 23140002, 0, 0);

}

} else if (timer_id == TIMER_2nd_phase_success) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 7000, 0, gg.MakeFString(1801088, "", "", "", "", ""));
myself.i_ai0 = 23140003;
myself.i_ai1 = FLAG_SPAWN;
myself.AddTimerEx(TIMER_knight, 1000);
myself.AddTimerEx(TIMER_castle, 1000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_3rd);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, FLAG_SPAWN, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
gg.SendMakerScriptEvent(maker0, 23140003, 0, 0);

}

} else if (timer_id == TIMER_3rd_phase_success) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 7000, 0, gg.MakeFString(1801089, "", "", "", "", ""));
myself.i_ai0 = 23140005;
myself.i_ai1 = FLAG_SPAWN;
myself.AddTimerEx(TIMER_knight, 1000);
myself.AddTimerEx(TIMER_castle, 1000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_4th);
if (gg.IsNull(maker0) == 0) {
if (is_hard_mode == 1) {

} else {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140005, 0, 0);

}

} else if (timer_id == TIMER_4th_phase_success) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_ending);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (timer_id == TIMER_knight) {
if (myself.i_ai1 == FLAG_SPAWN) {
if (is_hard_mode == 1) {
switch (myself.i_ai0) {
case 23140001: {
i1 = 25;
i2 = 4;
break;

}
case 23140002: {
i1 = 25;
i2 = 4;
break;

}
case 23140003: {
i1 = 20;
i2 = 4;
break;

}
case 23140005: {
i1 = 20;
i2 = 4;
break;

}

}

} else {
switch (myself.i_ai0) {
case 23140001: {
i1 = 30;
i2 = 1;
break;

}
case 23140002: {
i1 = 30;
i2 = 2;
break;

}
case 23140003: {
i1 = 45;
i2 = 2;
break;

}
case 23140005: {
i1 = 30;
i2 = 2;
break;

}

}

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai5 == 0) {
gg.SendMakerScriptEvent(maker0, 23140015, i2, 0);

}

}
if (debug_mode) {
myself.Say("기사 스폰or움직임 지시 timer : " + i1 + " 마리수 : " + i2);

}
if (debug_mode) {
myself.Say("현재시간 : " + gg.GetDateTime(0, 4) + "분 " + gg.GetDateTime(0, 5) + "초");

}
myself.AddTimerEx(TIMER_knight, i1 * 1000);

} else if (myself.i_ai1 == FLAG_NO_SPAWN) {

}

} else if (timer_id == TIMER_castle) {
if (myself.i_ai1 == FLAG_SPAWN) {
if (is_hard_mode == 1) {
switch (myself.i_ai0) {
case 23140001: {
i1 = 25;
break;

}
case 23140002: {
i1 = 20;
break;

}
case 23140003: {
i1 = 20;
break;

}
case 23140005: {
i1 = 20;
break;

}

}

} else {
switch (myself.i_ai0) {
case 23140001: {
i1 = 45;
break;

}
case 23140002: {
i1 = 30;
break;

}
case 23140003: {
i1 = 30;
break;

}
case 23140005: {
i1 = 0;
break;

}

}

}
if (i1 > 0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_castle);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);
if (is_hard_mode == 1) {
if (gg.Rand(2) == 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

}

}
myself.AddTimerEx(TIMER_castle, i1 * 1000);

}

} else if (myself.i_ai1 == FLAG_NO_SPAWN) {

}

} else if (timer_id == TIMER_SCENE_15) {
if (debug_mode) {
myself.Say("TIMER_SCENE_15");

}
myself.StartScenePlayerAround(myself.sm, scene_num_15, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TIMER_SCENE_15_END, scene_sec_15);

} else if (timer_id == TIMER_SCENE_15_END) {
if (debug_mode) {
myself.Say("오프닝 종료. 몬스터 스폰.");

}
myself.i_ai1 = FLAG_SPAWN;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_1st);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
gg.SendMakerScriptEvent(maker0, 23140001, 0, 0);

}
myself.AddTimerEx(TIMER_start, 5 * 60 * 1000);

} else if (timer_id == TIMER_SCENE_16) {
if (debug_mode) {
myself.Say("TIMER_SCENE_16");

}
myself.StartScenePlayerAround(myself.sm, scene_num_16, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TIMER_SCENE_16_END, scene_sec_16);

} else if (timer_id == TIMER_SCENE_16_END) {
if (debug_mode) {
myself.Say("SCENE P1->P2 종료. 대기시간 1분");

}
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140050, 0);

}
myself.AddTimerEx(TIMER_1st_phase_success, phase_to_phase);

} else if (timer_id == TIMER_SCENE_17) {
if (debug_mode) {
myself.Say("TIMER_SCENE_17");

}
myself.StartScenePlayerAround(myself.sm, scene_num_17, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_2nd_spelling);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.AddTimerEx(TIMER_ZONEINFO_CHG, 15 * 1000);
myself.AddTimerEx(TIMER_SCENE_17_END, scene_sec_17);

} else if (timer_id == TIMER_SCENE_17_END) {
if (debug_mode) {
myself.Say("SCENE P2->P3 종료. P3 시작.");

}
myself.AddTimerEx(TIMER_2nd_phase_success, 1000);

} else if (timer_id == TIMER_SCENE_18) {
if (debug_mode) {
myself.Say("TIMER_SCENE_18");

}
gg.Castle_GateOpenCloseEx(IceQueen_DoorName, 0, myself.InstantZone_GetId());
myself.StartScenePlayerAround(myself.sm, scene_num_18, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TIMER_SCENE_18_END, scene_sec_18);

} else if (timer_id == TIMER_SCENE_18_END) {
if (debug_mode) {
myself.Say("SCENE P3->P4 종료. P4 시작.");

}
gg.Castle_GateOpenCloseEx(IceQueen_DoorName, 1, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(23140049, 0, 4000);
myself.AddTimerEx(TIMER_3rd_phase_success, 1000);

} else if (timer_id == TIMER_SCENE_19) {
if (debug_mode) {
myself.Say("TIMER_SCENE_19");

}
myself.StartScenePlayerAround(myself.sm, scene_num_19, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TIMER_ZONEINFO_CHG, 500);
gg.Castle_GateOpenCloseEx(IceQueen_DoorName, 0, myself.InstantZone_GetId());
myself.AddTimerEx(TIMER_SCENE_19_END, scene_sec_19);

} else if (timer_id == TIMER_SCENE_19_END) {
if (debug_mode) {
myself.Shout("프레야 엔딩 1 종료.");

}
myself.AddTimerEx(TIMER_4th_phase_success, 1000);

} else if (timer_id == TIMER_SCENE_22) {
if (debug_mode) {
myself.Say("TIMER_SCENE_22");

}
myself.StartScenePlayerAround(myself.sm, scene_num_22, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.BroadcastScriptEvent(23140048, 0, 4000);
myself.BroadcastScriptEvent(23140020, 0, 4000);
myself.AddTimerEx(TIMER_SCENE_22_END, scene_sec_22);

} else if (timer_id == TIMER_SCENE_22_END) {
if (debug_mode) {
myself.Shout("PC 패배 연출 종료.");

}
myself.BroadcastScriptEvent(23140049, 0, 4000);
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140059, 0);

}
myself.AddTimerEx(TIMER_reset_routine, 2000);

} else if (timer_id == TIMER_SCENE_23) {
if (debug_mode) {
myself.Say("TIMER_SCENE_23");

}
myself.StartScenePlayerAround(myself.sm, scene_num_23, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.BroadcastScriptEvent(23140048, 0, 4000);
myself.AddTimerEx(TIMER_SCENE_23_END, scene_sec_23);

} else if (timer_id == TIMER_SCENE_23_END) {
if (debug_mode) {
myself.Say("빙궁기사단장 연출 종료.");

}
myself.BroadcastScriptEvent(23140049, 0, 4000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140054, 0, 0);

}

} else if (timer_id == TIMER_ZONEINFO_CHG) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140021, 0);

}

} else if (timer_id == TIMER_hold_desire) {
myself.BroadcastScriptEvent(23140048, 0, 4000);
myself.AddTimerEx(TIMER_SCENE_18, 1000);

} else if (timer_id == TIMER_start) {
gg.SendScriptEvent(myself.sm, 23140014, 0);
myself.BroadcastScriptEvent(23140010, 1, 4000);

} else if (timer_id == TIMER_2nd_hard_timer) {
if (myself.i_ai0 == 23140002 && myself.i_ai1 == FLAG_NO_SPAWN) {
if (debug_mode) {
myself.Shout("빙궁기사단장이 시간내로 죽어 타이머 종료");

}

} else {
if (myself.i_ai6 >= 1 && myself.i_ai7 == 0) {
myself.i_ai6 = myself.i_ai6 - 1;
myself.i_ai7 = 59;

} else {
myself.i_ai7 = myself.i_ai7 - 1;

}
if (myself.i_ai6 == 0 && myself.i_ai7 == 1) {
myself.AddTimerEx(TIMER_force_defeat, 1000);

} else if (myself.i_ai6 == 0 && myself.i_ai7 < 10) {
myself.AddTimerEx(TIMER_2nd_hard_timer, 1000);

} else {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai5 == 1) {
gg.SendScriptEventEx(c0, 23140061, 0, 0);
myself.AddTimerEx(TIMER_2nd_hard_timer, 1000);

} else {
gg.SendScriptEventEx(c0, 23140061, myself.i_ai6, myself.i_ai7);
myself.AddTimerEx(TIMER_2nd_hard_timer, 1000);

}

}

}

}

} else if (timer_id == TIMER_force_defeat) {
if (debug_mode) {
myself.Say("6분 타이머 패배");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, FLAG_NO_SPAWN, 0, 0);

}
myself.AddTimerEx(TIMER_SCENE_22, 1000);

} else if (timer_id == TIMER_reset_routine) {
myself.BroadcastScriptEvent(23140020, 0, 4000);
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140063, 0, 0);

}
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140063, 0);

}
myself.Despawn();
myself.InstantZone_Finish(5);

}
	}


}