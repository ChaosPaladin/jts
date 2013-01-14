package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_deployer extends default_npc {
	protected int FieldCycle = 3;
	protected int FieldCycle_z2_Quantity = 100000;
	protected int FieldCycle_z3_Quantity = 200000;
	protected int tide = 0;
	protected int zone = 2;
	protected int room = 0;
	protected String type = "dispatcher";
	protected String z3_entrance = "zone3_entrance";
	protected int boss_vein_limit = 20;
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected int TM_INITIAL_DELAY = 78000;
	protected int TIME_INITIAL_DELAY = 30;
	protected int TM_ZONE2_ATK_LIMIT = 78001;
	protected int TM_ZONE3_ATK_LIMIT = 78004;
	protected int TM_ZONE3_DEF_LIMIT = 78005;
	protected int TIME_LIMIT = 1500;
	protected int TM_ZONE2_DEF1_LIMIT = 78002;
	protected int TIME_ZONE2_DEF1_LIMIT = 900;
	protected int TM_ZONE2_DEF2_LIMIT = 78003;
	protected int TIME_ZONE2_DEF2_LIMIT = 300;
	protected int TM_STRATEGY_RENEW = 78006;
	protected int TM_TIME_REMAINING1 = 78014;
	protected int TM_TIME_REMAINING2 = 78015;
	protected int TM_TIME_REMAINING3 = 78016;
	protected int TM_TIME_REMAINING4 = 78017;
	protected int TIME_TIME_REMAINING = 300;
	protected int TM_zone2_fail_laziness = 78018;
	protected int TM_ZONE2_LOOP = 78019;
	protected int TIME_ZONE2_LOOP = 60;
	protected String z2_a_sboss01_maker = "rumwarsha14_1424_a_sb1m1";
	protected String z2_a_sboss02_maker = "rumwarsha14_1424_a_sb2m1";
	protected String z2_a_sboss03_maker = "rumwarsha14_1424_a_sb3m1";
	protected String z2_a_sboss04_maker = "rumwarsha14_1424_a_sb4m1";
	protected String z2_a_sb01_mob_maker = "rumwarsha14_1424_a_sb1m2";
	protected String z2_a_sb02_mob_maker = "rumwarsha14_1424_a_sb2m2";
	protected String z2_a_sb03_mob_maker = "rumwarsha14_1424_a_sb3m2";
	protected String z2_a_sb04_mob_maker = "rumwarsha14_1424_a_sb4m2";
	protected String z2_a_tumor01_maker = "rumwarsha14_1424_a_t1m1";
	protected String z2_a_tumor02_maker = "rumwarsha14_1424_a_t2m1";
	protected String z2_a_tumor03_maker = "rumwarsha14_1424_a_t3m1";
	protected String z2_a_tumor04_maker = "rumwarsha14_1424_a_t4m1";
	protected String z2_a_tm01_mob_maker = "rumwarsha14_1424_a_t1m2";
	protected String z2_a_tm02_mob_maker = "rumwarsha14_1424_a_t2m2";
	protected String z2_a_tm03_mob_maker = "rumwarsha14_1424_a_t3m2";
	protected String z2_a_tm04_mob_maker = "rumwarsha14_1424_a_t4m2";
	protected String z2_d_sboss01_maker = "rumwarsha14_1424_d_sb1m1";
	protected String z2_d_sboss02_maker = "rumwarsha14_1424_d_sb2m1";
	protected String z2_d_sboss03_maker = "rumwarsha14_1424_d_sb3m1";
	protected String z2_d_sboss04_maker = "rumwarsha14_1424_d_sb4m1";
	protected String z2_d_sb01_mob_maker = "rumwarsha14_1424_d_sb1m2";
	protected String z2_d_sb02_mob_maker = "rumwarsha14_1424_d_sb2m2";
	protected String z2_d_sb03_mob_maker = "rumwarsha14_1424_d_sb3m2";
	protected String z2_d_sb04_mob_maker = "rumwarsha14_1424_d_sb4m2";
	protected String z2_d_tumor01_maker = "rumwarsha14_1424_d_t1m1";
	protected String z2_d_tumor02_maker = "rumwarsha14_1424_d_t2m1";
	protected String z2_d_tumor03_maker = "rumwarsha14_1424_d_t3m1";
	protected String z2_d_tumor04_maker = "rumwarsha14_1424_d_t4m1";
	protected String z2_d_tm01_mob_maker = "rumwarsha14_1424_d_t1m2";
	protected String z2_d_tm02_mob_maker = "rumwarsha14_1424_d_t2m2";
	protected String z2_d_tm03_mob_maker = "rumwarsha14_1424_d_t3m2";
	protected String z2_d_tm04_mob_maker = "rumwarsha14_1424_d_t4m2";
	protected String z2_d_defboss_maker = "rumwarsha14_1424_defbossm1";
	protected String z2_a_trap01_maker = "rumwarsha14_1424_a_l0m1";
	protected String z2_a_trap11_maker = "rumwarsha14_1424_a_l1m1";
	protected String z2_a_trap21_maker = "rumwarsha14_1424_a_l2m1";
	protected String z2_a_trap31_maker = "rumwarsha14_1424_a_l3m1";
	protected String z2_a_trap41_maker = "rumwarsha14_1424_a_l4m1";
	protected String z2_a_trap51_maker = "rumwarsha14_1424_a_l5m1";
	protected String z2_a_trap61_maker = "rumwarsha14_1424_a_l6m1";
	protected String z2_a_trap71_maker = "rumwarsha14_1424_a_l7m1";
	protected String z2_a_trap81_maker = "rumwarsha14_1424_a_l8m1";
	protected String z2_a_trap91_maker = "rumwarsha14_1424_a_l9m1";
	protected String z2_a_trap101_maker = "rumwarsha14_1424_a_l10m1";
	protected String z2_a_trap111_maker = "rumwarsha14_1424_a_l11m1";
	protected String z2_a_trap02_maker = "rumwarsha14_1424_a_l0m2";
	protected String z2_a_trap12_maker = "rumwarsha14_1424_a_l1m2";
	protected String z2_a_trap22_maker = "rumwarsha14_1424_a_l2m2";
	protected String z2_a_trap32_maker = "rumwarsha14_1424_a_l3m2";
	protected String z2_a_trap42_maker = "rumwarsha14_1424_a_l4m2";
	protected String z2_a_trap52_maker = "rumwarsha14_1424_a_l5m2";
	protected String z2_a_trap62_maker = "rumwarsha14_1424_a_l6m2";
	protected String z2_a_trap72_maker = "rumwarsha14_1424_a_l7m2";
	protected String z2_a_trap82_maker = "rumwarsha14_1424_a_l8m2";
	protected String z2_a_trap92_maker = "rumwarsha14_1424_a_l9m2";
	protected String z2_a_trap102_maker = "rumwarsha14_1424_a_l10m2";
	protected String z2_a_trap112_maker = "rumwarsha14_1424_a_l11m2";
	protected String z2_d_trap01_maker = "rumwarsha14_1424_d_l0m1";
	protected String z2_d_trap11_maker = "rumwarsha14_1424_d_l1m1";
	protected String z2_d_trap21_maker = "rumwarsha14_1424_d_l2m1";
	protected String z2_d_trap31_maker = "rumwarsha14_1424_d_l3m1";
	protected String z2_d_trap41_maker = "rumwarsha14_1424_d_l4m1";
	protected String z2_d_trap51_maker = "rumwarsha14_1424_d_l5m1";
	protected String z2_d_trap61_maker = "rumwarsha14_1424_d_l6m1";
	protected String z2_d_trap71_maker = "rumwarsha14_1424_d_l7m1";
	protected String z2_d_trap81_maker = "rumwarsha14_1424_d_l8m1";
	protected String z2_d_trap91_maker = "rumwarsha14_1424_d_l9m1";
	protected String z2_d_trap101_maker = "rumwarsha14_1424_d_l10m1";
	protected String z2_d_trap111_maker = "rumwarsha14_1424_d_l11m1";
	protected String z2_d_trap02_maker = "rumwarsha14_1424_d_l0m2";
	protected String z2_d_trap12_maker = "rumwarsha14_1424_d_l1m2";
	protected String z2_d_trap22_maker = "rumwarsha14_1424_d_l2m2";
	protected String z2_d_trap32_maker = "rumwarsha14_1424_d_l3m2";
	protected String z2_d_trap42_maker = "rumwarsha14_1424_d_l4m2";
	protected String z2_d_trap52_maker = "rumwarsha14_1424_d_l5m2";
	protected String z2_d_trap62_maker = "rumwarsha14_1424_d_l6m2";
	protected String z2_d_trap72_maker = "rumwarsha14_1424_d_l7m2";
	protected String z2_d_trap82_maker = "rumwarsha14_1424_d_l8m2";
	protected String z2_d_trap92_maker = "rumwarsha14_1424_d_l9m2";
	protected String z2_d_trap102_maker = "rumwarsha14_1424_d_l10m2";
	protected String z2_d_trap112_maker = "rumwarsha14_1424_d_l11m2";
	protected String ech_atk_seq0_maker = "rumwarsha15_1424_echmusm1";
	protected String ech_atk_seq1_maker = "rumwarsha15_1424_echmusm2";
	protected String ech_atk_expel_maker = "rumwarsha15_1424_expelm1";
	protected String z3_a_tumor01_maker = "rumwarsha15_1424_a_t1m1";
	protected String z3_a_tumor02_maker = "rumwarsha15_1424_a_t2m1";
	protected String z3_a_tumor03_maker = "rumwarsha15_1424_a_t3m1";
	protected String z3_a_tumor04_maker = "rumwarsha15_1424_a_t4m1";
	protected String z3_a_tumor05_maker = "rumwarsha15_1424_a_t5m1";
	protected String z3_a_tumor06_maker = "rumwarsha15_1424_a_t6m1";
	protected String z3_a_tm01_mob_maker = "rumwarsha15_1424_a_t1m2";
	protected String z3_a_tm02_mob_maker = "rumwarsha15_1424_a_t2m2";
	protected String z3_a_tm03_mob_maker = "rumwarsha15_1424_a_t3m2";
	protected String z3_a_tm04_mob_maker = "rumwarsha15_1424_a_t4m2";
	protected String z3_a_tm05_mob_maker = "rumwarsha15_1424_a_t5m2";
	protected String z3_a_tm06_mob_maker = "rumwarsha15_1424_a_t6m2";
	protected String ech_def_seq0_maker = "rumwarsha15_1424_ech_dummy1m1";
	protected String ech_def_seq1_maker = "rumwarsha15_1424_ech_dummy2m1";
	protected String ech_def_seq2_maker = "rumwarsha15_1424_ech_dummy2m2";
	protected String ech_def_seq3_maker = "rumwarsha15_1424_defwagonm1";
	protected String ech_def_seq4_maker = "rumwarsha15_1424_veinm1";
	protected String z3_d_tumor01_maker = "rumwarsha15_1424_d_t1m1";
	protected String z3_d_tumor02_maker = "rumwarsha15_1424_d_t2m1";
	protected String z3_d_tumor03_maker = "rumwarsha15_1424_d_t3m1";
	protected String z3_d_tumor04_maker = "rumwarsha15_1424_d_t4m1";
	protected String z3_d_tumor05_maker = "rumwarsha15_1424_d_t5m1";
	protected String z3_d_tumor06_maker = "rumwarsha15_1424_d_t6m1";
	protected String z3_d_tm01_mob_maker = "rumwarsha15_1424_d_t1m2";
	protected String z3_d_tm02_mob_maker = "rumwarsha15_1424_d_t2m2";
	protected String z3_d_tm03_mob_maker = "rumwarsha15_1424_d_t3m2";
	protected String z3_d_tm04_mob_maker = "rumwarsha15_1424_d_t4m2";
	protected String z3_d_tm05_mob_maker = "rumwarsha15_1424_d_t5m2";
	protected String z3_d_tm06_mob_maker = "rumwarsha15_1424_d_t6m2";
	protected String z3_a_trap11_maker = "rumwarsha15_1424_a_c1m1";
	protected String z3_a_trap21_maker = "rumwarsha15_1424_a_c2m1";
	protected String z3_a_trap31_maker = "rumwarsha15_1424_a_c3m1";
	protected String z3_a_trap41_maker = "rumwarsha15_1424_a_c4m1";
	protected String z3_a_trap51_maker = "rumwarsha15_1424_a_c5m1";
	protected String z3_a_trap61_maker = "rumwarsha15_1424_a_c6m1";
	protected String z3_a_trap12_maker = "rumwarsha15_1424_a_c1m2";
	protected String z3_a_trap22_maker = "rumwarsha15_1424_a_c2m2";
	protected String z3_a_trap32_maker = "rumwarsha15_1424_a_c3m2";
	protected String z3_a_trap42_maker = "rumwarsha15_1424_a_c4m2";
	protected String z3_a_trap52_maker = "rumwarsha15_1424_a_c5m2";
	protected String z3_a_trap62_maker = "rumwarsha15_1424_a_c6m2";
	protected String z3_d_trap11_maker = "rumwarsha15_1424_d_c1m1";
	protected String z3_d_trap21_maker = "rumwarsha15_1424_d_c2m1";
	protected String z3_d_trap31_maker = "rumwarsha15_1424_d_c3m1";
	protected String z3_d_trap41_maker = "rumwarsha15_1424_d_c4m1";
	protected String z3_d_trap51_maker = "rumwarsha15_1424_d_c5m1";
	protected String z3_d_trap61_maker = "rumwarsha15_1424_d_c6m1";
	protected String z3_d_trap12_maker = "rumwarsha15_1424_d_c1m2";
	protected String z3_d_trap22_maker = "rumwarsha15_1424_d_c2m2";
	protected String z3_d_trap32_maker = "rumwarsha15_1424_d_c3m2";
	protected String z3_d_trap42_maker = "rumwarsha15_1424_d_c4m2";
	protected String z3_d_trap52_maker = "rumwarsha15_1424_d_c5m2";
	protected String z3_d_trap62_maker = "rumwarsha15_1424_d_c6m2";
	protected int echmus_x = -179537;
	protected int echmus_y = 209551;
	protected int echmus_z = -15504;
	protected int tumor_3_1_x = -179779;
	protected int tumor_3_1_y = 212540;
	protected int tumor_3_1_z = -15520;
	protected int tumor_3_2_x = -177028;
	protected int tumor_3_2_y = 211135;
	protected int tumor_3_2_z = -15520;
	protected int tumor_3_3_x = -176355;
	protected int tumor_3_3_y = 208043;
	protected int tumor_3_3_z = -15520;
	protected int tumor_3_4_x = -179284;
	protected int tumor_3_4_y = 205990;
	protected int tumor_3_4_z = -15520;
	protected int tumor_3_5_x = -182268;
	protected int tumor_3_5_y = 208218;
	protected int tumor_3_5_z = -15520;
	protected int tumor_3_6_x = -182069;
	protected int tumor_3_6_y = 211140;
	protected int tumor_3_6_z = -15520;
	protected int TM_scene_atk_opening = 78007;
	protected int TM_scene_atk_success = 78008;
	protected int TM_scene_atk_failure = 78009;
	protected int TIME_scene_atk_opening = 62;
	protected int TIME_scene_atk_success = 18;
	protected int TIME_scene_atk_failure = 17;
	protected int TM_scene_def_opening = 78010;
	protected int TM_scene_def_success = 78011;
	protected int TM_scene_def_failure = 78012;
	protected int TIME_scene_def_opening = 0;
	protected int TIME_scene_def_success = 0;
	protected int TIME_scene_def_failure = 0;
	protected int QID_z2_atk = 696;
	protected int QID_z2_def = 697;
	protected int QID_z3_def = 698;
	protected int TM_look_quester = 78013;
	protected int TIME_look_quester = 30;
	protected int babble_mode = 2;

	protected void CREATED(HandlerParam maker0, HandlerParam i0, HandlerParam s0) {
if (gg.IsSameString(type, "expeller") == 0) {
myself.i_ai0 = 0;
myself.int_list.Clear();
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai5 = 0;
myself.LookNeighbor(450);
myself.AddTimerEx(TM_look_quester, TIME_look_quester * 1000);
if (zone == 2 && tide == 0) {
s0 = gg.MakeFString(1800262, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");

} else if (zone == 2 && tide == 1) {
s0 = gg.MakeFString(1800262, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");

} else if (zone == 3 && tide == 0) {
s0 = gg.MakeFString(1800262, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");

} else if (zone == 3 && tide == 1) {
s0 = gg.MakeFString(1800262, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.AddTimerEx(TM_INITIAL_DELAY, TIME_INITIAL_DELAY * 1000);

} else if (babble_mode == 1) {
myself.Shout("익스펠러 스폰!");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0, HandlerParam s1) {
if (script_event_arg1 == 78010053) {
if (script_event_arg2 == 0) {
switch (script_event_arg3) {
case 211: {
myself.i_ai1 = 0;
break;

}
case 221: {
myself.i_ai2 = 0;
break;

}
case 231: {
myself.i_ai3 = 0;
break;

}
case 241: {
myself.i_ai4 = 0;
break;

}
case 301: {
myself.i_ai1 = 0;
break;

}
case 302: {
myself.i_ai2 = 0;
break;

}
case 303: {
myself.i_ai3 = 0;
break;

}
case 304: {
myself.i_ai4 = 0;
break;

}
case 305: {
myself.i_quest1 = 0;
break;

}
case 306: {
myself.i_quest2 = 0;
break;

}

}
if (zone == 2 && tide == 0) {
s0 = gg.MakeFString(1800275, gg.MakeFString(1800241, "", "", "", "", ""), "", "", "", "");

} else if (zone == 2 && tide == 1) {
s0 = gg.MakeFString(1800301, gg.MakeFString(1800241, "", "", "", "", ""), "", "", "", "");

} else if (zone == 3 && tide == 0) {
s0 = gg.MakeFString(1800303, gg.MakeFString(1800242, "", "", "", "", ""), "", "", "", "");

} else if (zone == 3 && tide == 1) {
s0 = gg.MakeFString(1800305, gg.MakeFString(1800242, "", "", "", "", ""), "", "", "", "");

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

} else if (script_event_arg2 == 1) {
switch (script_event_arg3) {
case 211: {
myself.i_ai1 = 1;
break;

}
case 221: {
myself.i_ai2 = 1;
break;

}
case 231: {
myself.i_ai3 = 1;
break;

}
case 241: {
myself.i_ai4 = 1;
break;

}
case 301: {
myself.i_ai1 = 1;
break;

}
case 302: {
myself.i_ai2 = 1;
break;

}
case 303: {
myself.i_ai3 = 1;
break;

}
case 304: {
myself.i_ai4 = 1;
break;

}
case 305: {
myself.i_quest1 = 1;
break;

}
case 306: {
myself.i_quest2 = 1;
break;

}

}
if (zone == 2 && tide == 0 && myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 < 4) {
s0 = gg.MakeFString(1800274, gg.MakeFString(1800241, "", "", "", "", ""), "", "", "", "");

} else if (zone == 2 && tide == 0) {
s0 = gg.MakeFString(1800299, gg.MakeFString(1800241, "", "", "", "", ""), "", "", "", "");

} else if (zone == 2 && tide == 1) {
s0 = gg.MakeFString(1800300, gg.MakeFString(1800241, "", "", "", "", ""), "", "", "", "");

} else if (zone == 3 && tide == 0) {
s0 = gg.MakeFString(1800302, gg.MakeFString(1800242, "", "", "", "", ""), "", "", "", "");

} else if (zone == 3 && tide == 1) {
s0 = gg.MakeFString(1800304, gg.MakeFString(1800242, "", "", "", "", ""), "", "", "", "");

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
if (babble_mode == 1) {
myself.Shout("디스패처 - 종양체 플립 이벤트 - 타입:" + gg.IntToStr(script_event_arg2) + "방:" + gg.IntToStr(script_event_arg3));

}

} else if (script_event_arg1 == 78010054) {
if (script_event_arg2 == 0) {
switch (script_event_arg3) {
case 212: {
myself.i_quest1 = 0;
break;

}
case 222: {
myself.i_quest2 = 0;
break;

}
case 232: {
myself.i_quest3 = 0;
break;

}
case 242: {
myself.i_quest4 = 0;
break;

}

}

} else if (script_event_arg2 == 1) {
switch (script_event_arg3) {
case 212: {
myself.i_quest1 = 1;
break;

}
case 222: {
myself.i_quest2 = 1;
break;

}
case 232: {
myself.i_quest3 = 1;
break;

}
case 242: {
myself.i_quest4 = 1;
break;

}

}

}
if (babble_mode == 1) {
myself.Shout("디스패처 -  중간보스 플립 이벤트 - 타입:" + gg.IntToStr(script_event_arg2) + "방:" + gg.IntToStr(script_event_arg3));

}

}
if (script_event_arg1 == 78010053 || script_event_arg1 == 78010054) {
if (babble_mode == 1) {
myself.Shout("디스패처 -  플립 이벤트");

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 1000);

}
if (script_event_arg1 == 78010053 && script_event_arg2 == 1 && zone == 2 && tide == 1) {
if (babble_mode == 1) {
myself.Shout("디스패처 - 종양체 다운 디스폰 이벤트");

}
switch (script_event_arg3) {
case 211: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
break;

}
case 221: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
break;

}
case 231: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
break;

}
case 241: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
break;

}

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010051, 0, 0);

}

}
if (script_event_arg1 == 78010061 && zone == 2 || zone == 3) {
if (babble_mode == 1) {
myself.Shout("디스패처 -  이동 대상 지역 요청 - 방:" + gg.IntToStr(script_event_arg2));

}
if (zone == 2 || zone == 3) {
if (myself.i_ai1 == 1 && script_event_arg2 != 211 && script_event_arg2 != 301) {
if (zone == 2) {
myself.int_list.Add(211);

} else {
myself.int_list.Add(301);

}

}
if (myself.i_ai2 == 1 && script_event_arg2 != 221 && script_event_arg2 != 302) {
if (zone == 2) {
myself.int_list.Add(221);

} else {
myself.int_list.Add(302);

}

}
if (myself.i_ai3 == 1 && script_event_arg2 != 231 && script_event_arg2 != 303) {
if (zone == 2) {
myself.int_list.Add(231);

} else {
myself.int_list.Add(303);

}

}
if (myself.i_ai4 == 1 && script_event_arg2 != 241 && script_event_arg2 != 304) {
if (zone == 2) {
myself.int_list.Add(241);

} else {
myself.int_list.Add(304);

}

}
if (myself.i_quest1 == 1 && zone == 3 && script_event_arg2 != 305) {
myself.int_list.Add(305);

}
if (myself.i_quest2 == 1 && zone == 3 && script_event_arg2 != 306) {
myself.int_list.Add(306);

}
if (myself.int_list.GetSize() > 0) {
i0 = myself.int_list.Get(gg.Rand(myself.int_list.GetSize()));

} else {
i0 = 9999;

}
myself.int_list.Clear();
if (tide == 0) {
if (script_event_arg2 == 211) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 221) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 231) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 241) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 301) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 302) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 303) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 304) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 305) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 306) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

}

} else if (script_event_arg2 == 211) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 221) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 231) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 241) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 301) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 302) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 303) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 304) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 305) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

} else if (script_event_arg2 == 306) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010062, script_event_arg2, i0);

}

}

}

} else if (script_event_arg1 == 78010069 || script_event_arg1 == 78010066 && gg.IsSameString(type, "expeller")) {
if (babble_mode == 1) {
myself.Shout("익스펠러:" + gg.IntToStr(script_event_arg1) + ", " + gg.IntToStr(script_event_arg2) + ", " + gg.IntToStr(script_event_arg3));

}
if (script_event_arg2 == 301) {
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg2 == 302) {
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg2 == 303) {
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg2 == 304) {
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_4_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_4_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_4_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg2 == 305) {
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_5_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_5_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_5_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg2 == 306) {
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010063, script_event_arg2, script_event_arg3);

}

} else {
switch (gg.Rand(6)) {
case 0: {
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_1_x, tumor_3_1_y, tumor_3_1_z, 0);
break;

}
case 1: {
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_2_x, tumor_3_2_y, tumor_3_2_z, 0);
break;

}
case 2: {
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_3_x, tumor_3_3_y, tumor_3_3_z, 0);
break;

}
case 3: {
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_4_x, tumor_3_4_y, tumor_3_3_z, 0);
break;

}
case 4: {
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_3_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_5_x, tumor_3_5_y, tumor_3_3_z, 0);
break;

}
case 5: {
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
myself.InstantTeleportInMyTerritory(tumor_3_6_x, tumor_3_6_y, tumor_3_6_z, 0);
break;

}

}

}

}
if (script_event_arg1 == 78010073 && zone == 3 && tide == 1) {
myself.i_quest4 = myself.i_quest4 + 1;
if (myself.i_quest4 >= boss_vein_limit && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800246, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_Finish(15);

} else {
s1 = gg.IntToStr(boss_vein_limit - myself.i_quest4);
s0 = gg.MakeFString(1800232, s1, "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (gg.Rand(5) == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}

}
if (myself.i_quest4 == 5 && myself.i_quest0 == 0 || myself.i_quest4 == 15 && myself.i_quest0 == 1) {
if (myself.i_quest4 == 5) {
s0 = gg.MakeFString(1800252, "", "", "", "", "");
myself.i_quest0 = 1;

} else {
s0 = gg.MakeFString(1800253, "", "", "", "", "");
myself.i_quest0 = 2;

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (babble_mode == 1) {
myself.Shout("마견 스폰 이벤트 전달");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, myself.i_quest4, 0);

}

}

}

}
if (zone == 3 && tide == 0 && script_event_arg1 == 78010053) {
if (script_event_arg2 == 1) {
if (babble_mode == 1) {
myself.Shout("종양체 파괴 - 에키무스 약화");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

} else if (script_event_arg2 == 0) {
if (babble_mode == 1) {
myself.Shout("종양체 재생 - 에키무스 강화");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}

}

} else if (zone == 3 && tide == 1 && script_event_arg1 == 78010053) {
if (script_event_arg2 == 1) {
if (babble_mode == 1) {
myself.Shout("종양체 상태 포식자 메이커에 전달 - 간격 증가");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

} else if (script_event_arg2 == 0) {
if (babble_mode == 1) {
myself.Shout("종양체 상태 포식자 메이커에 전달 - 간격 감소");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}

}

}
if (script_event_arg1 == 78010053 && zone == 2 && tide == 0) {
if (script_event_arg2 == 1 && myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 == 4 && myself.i_quest1 == 0) {
if (babble_mode == 1) {
myself.Shout("종양체 모두 파괴 - 코흐메네스 스폰!");

}
myself.i_quest1 = 1;
if (script_event_arg3 == 211) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

} else if (script_event_arg3 == 221) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

} else if (script_event_arg3 == 231) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

} else if (script_event_arg3 == 241) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

}

} else if (script_event_arg2 == 0 && myself.i_quest1 == 1) {
if (babble_mode == 1) {
myself.Shout("종양체 재생 - 코흐메네스 디스폰!");

}
myself.i_quest1 = 0;
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010070, 0, 0);

}

}

}
if (script_event_arg1 == 78010054 && zone == 2 && tide == 1 && myself.i_quest1 + myself.i_quest2 + myself.i_quest3 + myself.i_quest4 < 4 && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800246, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_Finish(15);

}
if (script_event_arg1 == 78010071 && zone == 2 && tide == 0 && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800245, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
myself.InstantZone_MarkRestriction();
if (FieldCycle_z2_Quantity > 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = FieldCycle_z2_Quantity;
i2 = 0 - FieldCycle_z2_Quantity;
if (i0 >= 1 && i0 <= 2) {
gg.AddPoint_FieldCycle(FieldCycle, i1, 1, myself.sm);

} else if (i0 >= 3 && i0 <= 5) {
gg.AddPoint_FieldCycle(FieldCycle, i2, 1, myself.sm);

}

}
if (myself.i_ai5 != 0) {
if (myself.MPCC_GetPartyCount(myself.i_ai5) > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(myself.i_ai5); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(myself.i_ai5, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c0 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.SetMemoState(c0, 696, 4);
if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SCRIPT_EVENT: the Z2ATK quest memo is set normally for:" + c0.name, 0, 0, 0, 0, c0.id, myself.i_ai5);

}

}

}

}

}

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SCRIPT_EVENT: an invalid alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SCRIPT_EVENT: no alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_Finish(15);

} else if (script_event_arg1 == 78010071 && script_event_arg2 == 1 && zone == 3 && tide == 0 && myself.i_quest0 < 99) {
myself.InstantZone_MarkRestriction();
if (FieldCycle_z3_Quantity > 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = FieldCycle_z3_Quantity;
i2 = 0 - FieldCycle_z3_Quantity;
if (i0 >= 1 && i0 <= 2) {
gg.AddPoint_FieldCycle(FieldCycle, i1, 1, myself.sm);

} else if (i0 >= 3 && i0 <= 5) {
gg.AddPoint_FieldCycle(FieldCycle, i2, 1, myself.sm);

}

}
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (babble_mode == 1) {
myself.Shout("에키무스 공격 성공 연출 시작!");

}
myself.StartScenePlayerAround(myself.sm, 3, 8000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TM_scene_atk_success, TIME_scene_atk_success * 1000);

} else if (script_event_arg1 == 78010071 && script_event_arg2 == 0 && zone == 3 && tide == 0 && myself.i_quest0 < 99) {
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (babble_mode == 1) {
myself.Shout("에키무스 공격 실패 연출 시작!");

}
myself.StartScenePlayerAround(myself.sm, 4, 8000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TM_scene_atk_failure, TIME_scene_atk_failure * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam c0, HandlerParam maker0, HandlerParam s0, HandlerParam s1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
s0 = "";
if (timer_id == TM_INITIAL_DELAY) {
if (zone == 2) {
if (tide == 0) {
myself.AddTimerEx(TM_ZONE2_ATK_LIMIT, TIME_LIMIT * 1000);
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.i_quest0 = 0;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 1 * 60 * 1000);

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 2 * 60 * 1000);

}
s0 = gg.MakeFString(1800263, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

} else if (tide == 1) {
myself.AddTimerEx(TM_ZONE2_DEF1_LIMIT, TIME_ZONE2_DEF1_LIMIT * 1000);
myself.i_ai1 = 1;
myself.i_ai2 = 1;
myself.i_ai3 = 1;
myself.i_ai4 = 1;
myself.i_quest1 = 1;
myself.i_quest2 = 1;
myself.i_quest3 = 1;
myself.i_quest4 = 1;
myself.i_quest0 = 0;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 1 * 60 * 1000);

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 2 * 60 * 1000);

}
s0 = gg.MakeFString(1800263, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
myself.AddTimerEx(TM_TIME_REMAINING1, TIME_TIME_REMAINING * 1000);
myself.AddTimerEx(TM_ZONE2_LOOP, 1000);

} else if (zone == 3) {
gg.Castle_GateOpenCloseEx(z3_entrance, 0, myself.InstantZone_GetId());
if (tide == 0) {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.i_quest0 = 0;
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
if (babble_mode == 1) {
myself.Shout("에키무스 개시 연출 시작!");

}
myself.StartScenePlayerAround(myself.sm, 2, 8000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TM_scene_atk_opening, TIME_scene_atk_opening * 1000);

} else if (tide == 1) {
myself.AddTimerEx(TM_ZONE3_DEF_LIMIT, TIME_LIMIT * 1000);
myself.i_ai1 = 1;
myself.i_ai2 = 1;
myself.i_ai3 = 1;
myself.i_ai4 = 1;
myself.i_quest1 = 1;
myself.i_quest2 = 1;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.i_quest0 = 0;
i0 = gg.Rand(3) + 2;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 1, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 1 * 60 * 1000);

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 2 * 60 * 1000);

}
s0 = gg.MakeFString(1800263, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
myself.AddTimerEx(TM_TIME_REMAINING1, TIME_TIME_REMAINING * 1000);

}

} else if (timer_id == TM_scene_atk_opening) {
if (babble_mode == 1) {
myself.Shout("에키무스 개시 연출 끝!");

}
s0 = gg.MakeFString(1800263, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
i0 = gg.Rand(3) + 2;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 1, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 1 * 60 * 1000);

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010067, 0, 0);

}
myself.AddTimerEx(TM_STRATEGY_RENEW, 2 * 60 * 1000);

}
myself.AddTimerEx(TM_ZONE3_ATK_LIMIT, TIME_LIMIT * 1000);

} else if (timer_id == TM_STRATEGY_RENEW) {
if (zone == 2) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2 + myself.i_quest3 + myself.i_quest4;
if (i0 > 0 && i0 <= 3) {
myself.i_ai0 = TACT_AGGRESIVE;

} else if (i0 >= 4 && i0 <= 5) {
myself.i_ai0 = TACT_INTERCEPT;

} else if (i0 >= 6 && i0 <= 8) {
myself.i_ai0 = TACT_DEFENSIVE;

}
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1 + myself.i_quest1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2 + myself.i_quest2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3 + myself.i_quest3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4 + myself.i_quest4, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4, myself.i_ai0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1 + myself.i_quest1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2 + myself.i_quest2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3 + myself.i_quest3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4 + myself.i_quest4, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4, myself.i_ai0);

}

}

} else if (zone == 3) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
if (i0 > 0 && i0 <= 2) {
myself.i_ai0 = TACT_AGGRESIVE;

} else if (i0 >= 3 && i0 <= 4) {
myself.i_ai0 = TACT_INTERCEPT;

} else if (i0 >= 5 && i0 <= 6) {
myself.i_ai0 = TACT_DEFENSIVE;

}
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_quest1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_quest2, myself.i_ai0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai2, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai3, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_ai4, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_quest1, myself.i_ai0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010065, myself.i_quest2, myself.i_ai0);

}

}

}

} else if (timer_id == TM_ZONE2_ATK_LIMIT) {
if (tide == 0 && zone == 2 && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800246, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_Finish(15);

}

} else if (timer_id == TM_ZONE2_DEF1_LIMIT) {
if (zone == 2 && tide == 1 & myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 < 4) {
if (babble_mode == 1) {
s0 = gg.MakeFString(1800251, "", "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
if (myself.i_ai1 == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

}
if (myself.i_ai2 == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

}
if (myself.i_ai3 == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

}
if (myself.i_ai4 == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010068, 0, 0);

}

}

}
myself.AddTimerEx(TM_ZONE2_DEF2_LIMIT, TIME_ZONE2_DEF2_LIMIT * 1000);

} else if (timer_id == TM_ZONE2_DEF2_LIMIT) {
if (zone == 2 && tide == 1 && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800245, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (FieldCycle_z2_Quantity > 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = FieldCycle_z2_Quantity;
i2 = 0 - FieldCycle_z2_Quantity;
if (i0 >= 1 && i0 <= 2) {
gg.AddPoint_FieldCycle(FieldCycle, i1, 1, myself.sm);

} else if (i0 >= 3 && i0 <= 5) {
gg.AddPoint_FieldCycle(FieldCycle, i2, 1, myself.sm);

}

}
if (myself.i_ai5 != 0) {
if (myself.MPCC_GetPartyCount(myself.i_ai5) > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(myself.i_ai5); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(myself.i_ai5, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c0 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.SetMemoState(c0, 697, 4);
if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SCRIPT_EVENT: the Z2DEF quest memo is set normally for:" + c0.name, 0, 0, 0, 0, c0.id, myself.i_ai5);

}

}

}

}

}

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "TIMER_FIRED: an invalid alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "TIMER_FIRED: no alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(15);

}

} else if (timer_id == TM_ZONE3_ATK_LIMIT) {
if (tide == 0 && zone == 3 && myself.i_quest0 < 99) {
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (babble_mode == 1) {
myself.Shout("에키무스 공격 실패 연출 시작!");

}
myself.StartScenePlayerAround(myself.sm, 4, 8000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TM_scene_atk_failure, TIME_scene_atk_failure * 1000);

}

} else if (timer_id == TM_ZONE3_DEF_LIMIT) {
if (tide == 1 && zone == 3 && myself.i_quest4 < boss_vein_limit && myself.i_quest0 < 99) {
s0 = gg.MakeFString(1800245, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800244, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (FieldCycle_z3_Quantity > 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = FieldCycle_z3_Quantity;
i2 = 0 - FieldCycle_z3_Quantity;
if (i0 >= 1 && i0 <= 2) {
gg.AddPoint_FieldCycle(FieldCycle, i1, 1, myself.sm);

} else if (i0 >= 3 && i0 <= 5) {
gg.AddPoint_FieldCycle(FieldCycle, i2, 1, myself.sm);

}

}
if (myself.i_ai5 != 0) {
if (myself.MPCC_GetPartyCount(myself.i_ai5) > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(myself.i_ai5); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(myself.i_ai5, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c0 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.SetMemoState(c0, 698, 4);
if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SCRIPT_EVENT: the Z3DEF quest memo is set normally for:" + c0.name, 0, 0, 0, 0, c0.id, myself.i_ai5);

}

}

}

}

}

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "TIMER_FIRED: an invalid alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}

} else if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "TIMER_FIRED: no alliance info!", 0, 0, 0, 0, 0, myself.i_ai5);

}
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_atk_seq0_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq2_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), ech_def_seq3_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm05_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tm06_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(15);

}

} else if (timer_id == TM_scene_atk_success) {
if (babble_mode == 1) {
myself.Shout("에키무스 공격 성공 연출 끝!");

}
s0 = gg.MakeFString(1800245, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 3, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.InstantZone_Finish(15);

} else if (timer_id == TM_scene_atk_failure) {
if (babble_mode == 1) {
myself.Shout("에키무스 공격 실패 연출 끝!");

}
s0 = gg.MakeFString(1800246, gg.MakeFString(1800242, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.InstantZone_Finish(15);

} else if (timer_id == TM_ZONE2_LOOP) {
if (myself.i_quest0 >= 0 && myself.i_quest0 <= 12) {
if (myself.i_quest0 == 0 || myself.i_quest0 == 12) {
myself.i_quest0 = 1;

} else {
myself.i_quest0 = myself.i_quest0 + 1;

}
s0 = "14_24_undying_z2";
if (tide == 0) {
s0 = s0 + "a";

} else {
s0 = s0 + "d";

}
s0 = s0 + "_loop";
if (myself.i_quest0 == 1 || myself.i_quest0 == 5 || myself.i_quest0 == 9) {
s1 = s0 + "0" + gg.IntToStr(myself.i_quest0) + "_01";

} else if (myself.i_quest0 == 2 || myself.i_quest0 == 6 || myself.i_quest0 == 10) {
if (myself.i_quest0 < 10) {
s1 = s0 + "0" + gg.IntToStr(myself.i_quest0) + "_02";

} else {
s1 = s0 + gg.IntToStr(myself.i_quest0) + gg.IntToStr(myself.i_quest0) + "_02";

}

} else if (myself.i_quest0 == 3 || myself.i_quest0 == 7 || myself.i_quest0 == 11) {
if (myself.i_quest0 < 10) {
s1 = s0 + "0" + gg.IntToStr(myself.i_quest0) + "_03";

} else {
s1 = s0 + gg.IntToStr(myself.i_quest0) + gg.IntToStr(myself.i_quest0) + "_03";

}

} else if (myself.i_quest0 == 4 || myself.i_quest0 == 8 || myself.i_quest0 == 12) {
if (myself.i_quest0 < 10) {
s1 = s0 + "0" + gg.IntToStr(myself.i_quest0) + "_04";

} else {
s1 = s0 + gg.IntToStr(myself.i_quest0) + gg.IntToStr(myself.i_quest0) + "_04";

}

}
myself.AddTimerEx(TM_ZONE2_LOOP, TIME_ZONE2_LOOP * 1000);

}

} else if (timer_id == TM_TIME_REMAINING1) {
if (zone == 2 && tide == 0 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;
if (i0 == 0) {
s0 = gg.MakeFString(1800307, "", "", "", "", "") + " ";

}
s0 = s0 + gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else if (zone == 2 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;
s0 = gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

} else if (zone == 3 && tide == 0 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else if (zone == 3 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

}
s0 = s0 + " " + gg.MakeFString(1010643, gg.IntToStr(20), "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (zone == 2) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

} else if (zone == 3) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

}
myself.AddTimerEx(TM_TIME_REMAINING2, TIME_TIME_REMAINING * 1000);

} else if (timer_id == TM_TIME_REMAINING2 && myself.i_quest0 < 99) {
if (zone == 2 && tide == 0 && myself.i_quest0 < 99) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 > 0) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 == 1) {
s0 = gg.MakeFString(1800307, "", "", "", "", "") + " ";

}
s0 = s0 + gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else {
myself.AddTimerEx(TM_zone2_fail_laziness, 1000);
return;

}
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;

} else if (zone == 2 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;
s0 = gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

} else if (zone == 3 && tide == 0 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else if (zone == 3 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

}
s0 = s0 + " " + gg.MakeFString(1010643, gg.IntToStr(15), "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (zone == 2) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

} else if (zone == 3) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

}
myself.AddTimerEx(TM_TIME_REMAINING3, TIME_TIME_REMAINING * 1000);

} else if (timer_id == TM_TIME_REMAINING3 && myself.i_quest0 < 99) {
if (zone == 2 && tide == 0 && myself.i_quest0 < 99) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 > 1) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 == 2) {
s0 = gg.MakeFString(1800307, "", "", "", "", "") + " ";

}
s0 = s0 + gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else {
myself.AddTimerEx(TM_zone2_fail_laziness, 1000);
return;

}
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;

} else if (zone == 2 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;
s0 = gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

} else if (zone == 3 && tide == 0 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else if (zone == 3 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

}
s0 = s0 + " " + gg.MakeFString(1010643, gg.IntToStr(10), "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (zone == 2) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

} else if (zone == 3) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

}
myself.AddTimerEx(TM_TIME_REMAINING4, TIME_TIME_REMAINING * 1000);

} else if (timer_id == TM_TIME_REMAINING4 && myself.i_quest0 < 99) {
if (zone == 2 && tide == 0 && myself.i_quest0 < 99) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 > 2) {
if (myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 < 4) {
s0 = gg.MakeFString(1800307, "", "", "", "", "") + " ";

}
s0 = s0 + gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else {
myself.AddTimerEx(TM_zone2_fail_laziness, 1000);
return;

}
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;

} else if (zone == 2 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4;
s0 = gg.MakeFString(1800241, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

} else if (zone == 3 && tide == 0 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800243, "", "", "", "", "");

} else if (zone == 3 && tide == 1 && myself.i_quest0 < 99) {
i0 = myself.i_ai1 + myself.i_ai2 + myself.i_ai3 + myself.i_ai4 + myself.i_quest1 + myself.i_quest2;
s0 = gg.MakeFString(1800242, "", "", "", "", "") + " " + gg.MakeFString(1800244, "", "", "", "", "");

}
s0 = s0 + " " + gg.MakeFString(1010643, gg.IntToStr(5), "", "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
if (zone == 2) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

} else if (zone == 3) {
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_a_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor05_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z3_d_tumor06_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010056, i0, 0);

}

}

}

} else if (timer_id == TM_look_quester) {
if (myself.IsNullCreature(myself.c_ai0) != 0) {
myself.LookNeighbor(450);
myself.AddTimerEx(TM_look_quester, TIME_look_quester * 1000);

}

} else if (timer_id == TM_zone2_fail_laziness) {
s0 = gg.MakeFString(1800308, "", "", "", "", "");
s0 = s0 + " " + gg.MakeFString(1800246, gg.MakeFString(1800241, "", "", "", "", ""), gg.MakeFString(1800243, "", "", "", "", ""), "", "", "");
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 4, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);
myself.i_quest0 = 99;
if (tide == 0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm01_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm02_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor03_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm03_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sboss04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_sb04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tumor04_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_tm04_mob_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap01_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap11_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap21_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap31_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap41_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap51_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap61_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap71_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap81_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap91_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap101_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap111_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap02_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap12_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap22_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap32_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap42_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap52_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap62_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap72_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap82_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap92_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap102_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_d_trap112_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.InstantZone_Finish(15);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 0 && myself.MPCC_GetMPCCId(creature) > 0) {
if (myself.i_ai5 == 0 || myself.MPCC_GetPartyCount(myself.i_ai5) <= 0) {
if (babble_mode == 2) {
if (myself.i_ai5 == 0) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SEE_CREATURE: an alliance info is normally set", 0, 0, 0, 0, 0, myself.MPCC_GetMPCCId(creature));

} else if (myself.MPCC_GetPartyCount(myself.i_ai5) <= 0) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SEE_CREATURE: an invalid alliance info is detected - resetting info ", 0, 0, 0, 0, myself.MPCC_GetMPCCId(creature), myself.i_ai5);

}

}
myself.i_ai5 = myself.MPCC_GetMPCCId(creature);
myself.c_ai0 = myself.MPCC_GetMaster(myself.i_ai5);

} else if (myself.i_ai5 != myself.MPCC_GetMPCCId(creature)) {
if (babble_mode == 2) {
myself.AddLogByNpc2(127, myself.sm, "defend_blight_test", "SEE_CREATURE: a rebundant alliance is detected", 0, 0, 0, 0, myself.MPCC_GetMPCCId(creature), myself.i_ai5);

}

}

}
	}


}