package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_zaken_candle extends default_npc {
	protected int sroom_id = -1;
	protected String large_room_maker_A = "t21_24_slave1f_001m";
	protected String large_room_maker_B = "t21_24_slave1f_002m";
	protected String large_room_maker_C = "t21_24_slave1f_003m";
	protected String large_room_maker_D = "t21_24_slave1f_004m";
	protected String large_room_maker_E = "t21_24_slave1f_005m";
	protected String large_room_maker_F = "t21_24_slave1f_006m";
	protected String large_room_maker_G = "t21_24_slave1f_007m";
	protected String large_room_maker_H = "t21_24_slave1f_008m";
	protected String large_room_maker_I = "t21_24_slave1f_009m";
	protected String large_room_maker_J = "t21_24_slave1f_010m";
	protected String large_room_maker_K = "t21_24_slave1f_011m";
	protected String large_room_maker_L = "t21_24_slave1f_012m";
	protected String large_room_maker_M = "t21_24_slave1f_013m";
	protected String large_room_maker_N = "t21_24_slave1f_014m";
	protected String large_room_maker_O = "t21_24_slave1f_015m";
	protected String day_zaken_maker = "zd_1f_001m1";
	protected int GlobalMap_ID = 38;
	protected int OHS_Weapon = 15280;
	protected int THS_Weapon = 15281;
	protected int BOW_Weapon = 15302;

	protected void CREATED() {
myself.i_ai2 = myself.GetCurrentTick();
myself.AddTimerEx(1053, 1000);
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(2124008, 8000);
myself.EquipItem(OHS_Weapon);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (creature.is_pc == 1) {
if (myself.i_ai4 >= 60) {
i0 = gg.FloatToInt(myself.i_ai4 / 60);
i1 = myself.i_ai4 - i0 * 60;

} else if (myself.i_ai4 < 60) {
i0 = 0;
i1 = myself.i_ai4;

}
gg.SendUIEvent(creature, 0, 0, 0, "1", gg.IntToStr(i0), gg.IntToStr(i1), "경과 시간 : ", "60", "0");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam maker1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (timer_id == 1053) {
i0 = myself.GetCurrentTick();
myself.i_ai4 = i0 - myself.i_ai2;
myself.AddTimerEx(1053, 1000);

}
if (timer_id == 2124008) {
i1 = 0;
i2 = -1;
i3 = -1;
myself.i_ai1 = myself.GetGlobalMap(GlobalMap_ID);
myself.AddLogByNpc2(127, myself.sm, "zaken_test", "zaken_Global_id :", myself.i_ai1, 0, 0, 0, 0, 0);
switch (myself.i_ai1) {
case 0: {
if (sroom_id == 1 || sroom_id == 3 || sroom_id == 4 || sroom_id == 6) {
i1 = 1;

}
break;

}
case 1: {
if (sroom_id == 2 || sroom_id == 4 || sroom_id == 5 || sroom_id == 7) {
i1 = 1;

}
break;

}
case 2: {
if (sroom_id == 4 || sroom_id == 6 || sroom_id == 7 || sroom_id == 9) {
i1 = 1;

}
break;

}
case 3: {
if (sroom_id == 6 || sroom_id == 8 || sroom_id == 9 || sroom_id == 11) {
i1 = 1;

}
break;

}
case 4: {
if (sroom_id == 7 || sroom_id == 9 || sroom_id == 10 || sroom_id == 12) {
i1 = 1;

}
break;

}
case 5: {
if (sroom_id == 13 || sroom_id == 15 || sroom_id == 16 || sroom_id == 18) {
i1 = 1;

}
break;

}
case 6: {
if (sroom_id == 14 || sroom_id == 16 || sroom_id == 17 || sroom_id == 19) {
i1 = 1;

}
break;

}
case 7: {
if (sroom_id == 16 || sroom_id == 18 || sroom_id == 19 || sroom_id == 21) {
i1 = 1;

}
break;

}
case 8: {
if (sroom_id == 18 || sroom_id == 20 || sroom_id == 21 || sroom_id == 23) {
i1 = 1;

}
break;

}
case 9: {
if (sroom_id == 19 || sroom_id == 21 || sroom_id == 22 || sroom_id == 24) {
i1 = 1;

}
break;

}
case 10: {
if (sroom_id == 25 || sroom_id == 27 || sroom_id == 28 || sroom_id == 30) {
i1 = 1;

}
break;

}
case 11: {
if (sroom_id == 26 || sroom_id == 28 || sroom_id == 29 || sroom_id == 31) {
i1 = 1;

}
break;

}
case 12: {
if (sroom_id == 28 || sroom_id == 30 || sroom_id == 31 || sroom_id == 33) {
i1 = 1;

}
break;

}
case 13: {
if (sroom_id == 30 || sroom_id == 32 || sroom_id == 33 || sroom_id == 35) {
i1 = 1;

}
break;

}
case 14: {
if (sroom_id == 31 || sroom_id == 33 || sroom_id == 34 || sroom_id == 36) {
i1 = 1;

}
break;

}

}
switch (myself.i_ai1) {
case 0: {
myself.i_ai3 = 0;
i4 = 1;
break;

}
case 1: {
myself.i_ai3 = 1;
i4 = 1;
break;

}
case 2: {
myself.i_ai3 = 2;
i4 = 1;
break;

}
case 3: {
myself.i_ai3 = 3;
i4 = 1;
break;

}
case 4: {
myself.i_ai3 = 4;
i4 = 1;
break;

}
case 5: {
myself.i_ai3 = 0;
i4 = 2;
break;

}
case 6: {
myself.i_ai3 = 1;
i4 = 2;
break;

}
case 7: {
myself.i_ai3 = 2;
i4 = 2;
break;

}
case 8: {
myself.i_ai3 = 3;
i4 = 2;
break;

}
case 9: {
myself.i_ai3 = 4;
i4 = 2;
break;

}
case 10: {
myself.i_ai3 = 0;
i4 = 3;
break;

}
case 11: {
myself.i_ai3 = 1;
i4 = 3;
break;

}
case 12: {
myself.i_ai3 = 2;
i4 = 3;
break;

}
case 13: {
myself.i_ai3 = 3;
i4 = 3;
break;

}
case 14: {
myself.i_ai3 = 4;
i4 = 3;
break;

}

}
if (i1 == 0) {
i2 = myself.InstantZone_GetId();
switch (sroom_id) {
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_A + "1");
i3 = 1;
i5 = 0;
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_B + "1");
i3 = 1;
i5 = 1;
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_A + "2");
i3 = 1;
i5 = 0;
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_C + "1");
i3 = 1;
i5 = 2;
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_B + "2");
i3 = 1;
i5 = 1;
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_C + "2");
i3 = 1;
i5 = 2;
break;

}
case 7: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_C + "3");
i3 = 1;
i5 = 2;
break;

}
case 8: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_D + "1");
i3 = 1;
i5 = 3;
break;

}
case 9: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_C + "4");
i3 = 1;
i5 = 2;
break;

}
case 10: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_E + "1");
i3 = 1;
i5 = 4;
break;

}
case 11: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_D + "2");
i3 = 1;
i5 = 3;
break;

}
case 12: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_E + "2");
i3 = 1;
i5 = 4;
break;

}
case 13: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_F + "1");
i3 = 2;
i5 = 0;
break;

}
case 14: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_G + "1");
i3 = 2;
i5 = 1;
break;

}
case 15: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_F + "2");
i3 = 2;
i5 = 0;
break;

}
case 16: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_H + "1");
i3 = 2;
i5 = 2;
break;

}
case 17: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_G + "2");
i3 = 2;
i5 = 1;
break;

}
case 18: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_H + "2");
i3 = 2;
i5 = 2;
break;

}
case 19: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_H + "3");
i3 = 2;
i5 = 2;
break;

}
case 20: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_I + "1");
i3 = 2;
i5 = 3;
break;

}
case 21: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_H + "4");
i3 = 2;
i5 = 2;
break;

}
case 22: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_J + "1");
i3 = 2;
i5 = 4;
break;

}
case 23: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_I + "2");
i3 = 2;
i5 = 3;
break;

}
case 24: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_J + "2");
i3 = 2;
i5 = 4;
break;

}
case 25: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_K + "1");
i3 = 3;
i5 = 0;
break;

}
case 26: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_L + "1");
i3 = 3;
i5 = 1;
break;

}
case 27: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_K + "2");
i3 = 3;
i5 = 0;
break;

}
case 28: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_M + "1");
i3 = 3;
i5 = 2;
break;

}
case 29: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_L + "2");
i3 = 3;
i5 = 1;
break;

}
case 30: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_M + "2");
i3 = 3;
i5 = 2;
break;

}
case 31: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_M + "3");
i3 = 3;
i5 = 2;
break;

}
case 32: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_N + "1");
i3 = 3;
i5 = 3;
break;

}
case 33: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_M + "4");
i3 = 3;
i5 = 2;
break;

}
case 34: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_O + "1");
i3 = 3;
i5 = 4;
break;

}
case 35: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_N + "2");
i3 = 3;
i5 = 3;
break;

}
case 36: {
maker0 = gg.InstantZone_GetNpcMaker(i2, large_room_maker_O + "2");
i3 = 3;
i5 = 4;
break;

}

}
myself.EquipItem(THS_Weapon);
if (myself.i_ai3 == i5 && i3 != i4) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 0, 10000, 0, gg.MakeFString(1800866, "", "", "", "", ""));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.AddTimerEx(2124009, 2000);
return;

}

}
if (gg.IsNull(maker0) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 0, 10000, 0, gg.MakeFString(1800867, "", "", "", "", ""));
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.AddTimerEx(2124009, 2000);

}
if (i3 != i4) {
maker1 = gg.InstantZone_GetNpcMaker(i2, day_zaken_maker);
if (gg.IsNull(maker1) == 0) {
switch (i3) {
case 1: {
gg.SendMakerScriptEvent(maker1, 2124003, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(maker1, 2124004, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(maker1, 2124005, 0, 0);
break;

}

}

}

}

} else {
myself.EquipItem(BOW_Weapon);
i2 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i2, day_zaken_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2124002, 0, 0);

}

}

}
if (timer_id == 2124009) {
myself.BroadcastScriptEvent(10016, gg.GetIndexFromCreature(myself.c_ai0), 2500);

}
if (timer_id == 2124010) {
myself.BroadcastScriptEvent(10016, gg.GetIndexFromCreature(myself.sm), 1500);
myself.AddTimerEx(2124009, 5000);

}
	}


}