package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_entrance extends default_npc {
	protected String AREA_effect_1s_01 = "23_14_icequeen_1s_01";
	protected String AREA_effect_1s_02 = "23_14_icequeen_1s_02";
	protected String AREA_effect_1s_03 = "23_14_icequeen_1s_03";
	protected String AREA_effect_1s_04 = "23_14_icequeen_1s_04";
	protected String AREA_effect_1s_05 = "23_14_icequeen_1s_05";
	protected String AREA_effect_1s_06 = "23_14_icequeen_1s_06";
	protected String AREA_effect_1s_07 = "23_14_icequeen_1s_07";
	protected String AREA_effect_1s_08 = "23_14_icequeen_1s_08";
	protected String AREA_effect_1s_09 = "23_14_icequeen_1s_09";
	protected String AREA_effect_1s_10 = "23_14_icequeen_1s_10";
	protected String AREA_effect_1s_11 = "23_14_icequeen_1s_11";
	protected String AREA_effect_1s_12 = "23_14_icequeen_1s_12";
	protected String AREA_effect_1s_13 = "23_14_icequeen_1s_13";
	protected String AREA_effect_1s_14 = "23_14_icequeen_1s_14";
	protected String AREA_effect_1s_15 = "23_14_icequeen_1s_15";
	protected String AREA_effect_1s_16 = "23_14_icequeen_1s_16";
	protected String AREA_effect_1s_17 = "23_14_icequeen_1s_17";
	protected String AREA_effect_1s_18 = "23_14_icequeen_1s_18";
	protected String AREA_effect_1s_19 = "23_14_icequeen_1s_19";
	protected String AREA_effect_1s_20 = "23_14_icequeen_1s_20";
	protected String AREA_effect_1s_21 = "23_14_icequeen_1s_21";
	protected String AREA_effect_2s_01 = "23_14_icequeen_2s_01";
	protected String AREA_effect_2s_02 = "23_14_icequeen_2s_02";
	protected String AREA_effect_2s_03 = "23_14_icequeen_2s_03";
	protected String AREA_effect_2s_04 = "23_14_icequeen_2s_04";
	protected String AREA_effect_2s_05 = "23_14_icequeen_2s_05";
	protected String AREA_effect_2s_06 = "23_14_icequeen_2s_06";
	protected String AREA_effect_2s_07 = "23_14_icequeen_2s_07";
	protected String AREA_effect_2s_08 = "23_14_icequeen_2s_08";
	protected String AREA_effect_1s_01_hd = "23_14_icequeen_1s_01_hd";
	protected String AREA_effect_1s_02_hd = "23_14_icequeen_1s_02_hd";
	protected String AREA_effect_1s_03_hd = "23_14_icequeen_1s_03_hd";
	protected String AREA_effect_1s_04_hd = "23_14_icequeen_1s_04_hd";
	protected String AREA_effect_1s_05_hd = "23_14_icequeen_1s_05_hd";
	protected String AREA_effect_1s_06_hd = "23_14_icequeen_1s_06_hd";
	protected String AREA_effect_1s_07_hd = "23_14_icequeen_1s_07_hd";
	protected String AREA_effect_1s_08_hd = "23_14_icequeen_1s_08_hd";
	protected String AREA_effect_1s_09_hd = "23_14_icequeen_1s_09_hd";
	protected String AREA_effect_1s_10_hd = "23_14_icequeen_1s_10_hd";
	protected String AREA_effect_1s_11_hd = "23_14_icequeen_1s_11_hd";
	protected String AREA_effect_1s_12_hd = "23_14_icequeen_1s_12_hd";
	protected String AREA_effect_1s_13_hd = "23_14_icequeen_1s_13_hd";
	protected String AREA_effect_1s_14_hd = "23_14_icequeen_1s_14_hd";
	protected String AREA_effect_1s_15_hd = "23_14_icequeen_1s_15_hd";
	protected String AREA_effect_1s_16_hd = "23_14_icequeen_1s_16_hd";
	protected String AREA_effect_1s_17_hd = "23_14_icequeen_1s_17_hd";
	protected String AREA_effect_1s_18_hd = "23_14_icequeen_1s_18_hd";
	protected String AREA_effect_1s_19_hd = "23_14_icequeen_1s_19_hd";
	protected String AREA_effect_1s_20_hd = "23_14_icequeen_1s_20_hd";
	protected String AREA_effect_1s_21_hd = "23_14_icequeen_1s_21_hd";
	protected String AREA_effect_2s_01_hd = "23_14_icequeen_2s_01_hd";
	protected String AREA_effect_2s_02_hd = "23_14_icequeen_2s_02_hd";
	protected String AREA_effect_2s_03_hd = "23_14_icequeen_2s_03_hd";
	protected String AREA_effect_2s_04_hd = "23_14_icequeen_2s_04_hd";
	protected String AREA_effect_2s_05_hd = "23_14_icequeen_2s_05_hd";
	protected String AREA_effect_2s_06_hd = "23_14_icequeen_2s_06_hd";
	protected String AREA_effect_2s_07_hd = "23_14_icequeen_2s_07_hd";
	protected String AREA_effect_2s_08_hd = "23_14_icequeen_2s_08_hd";
	protected int SKILL_death_clock = 411566081;
	protected int SKILL_area_lv1 = 421855233;
	protected int TIMER_start = 2314030;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0) {
myself.SetMaxHateListSize(50);
myself.i_ai0 = 1;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
if (myself.sm.param1 == 0) {
myself.i_ai3 = 0;

} else if (myself.sm.param1 == 1) {
myself.i_ai3 = 1;

}
i0 = myself.InstantZone_GetId();
if (myself.i_ai3 == 0) {
gg.Area_SetOnOffEx(AREA_effect_1s_01, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08, 0, i0);

} else if (myself.i_ai3 == 1) {
gg.Area_SetOnOffEx(AREA_effect_1s_01_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08_hd, 0, i0);

}
gg.SendScriptEvent(myself.boss, 23140022, gg.GetIndexFromCreature(myself.sm));
myself.CreateOnePrivateEx(1032762, "ai_icequeen_sirr_doorman", 0, 0, 114766, -113141, -11200, 15956, 0, 0, 0);
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (creature.is_pc == 1) {
myself.AddHateInfo(creature, 1, 0, 1, 1);
i0 = myself.GetHateInfoCount();
if (debug_mode) {
myself.Say("입장 누적 PC수 : " + i0);

}
if (myself.i_ai0 == 3) {
myself.ChangeZoneInfo(creature, 0, 2);
myself.InstantTeleport(creature, 114727, -113387, -11200);

} else {
myself.ChangeZoneInfo(creature, 0, 1);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam h0, HandlerParam s0) {
if (script_event_arg1 == 23140050) {
if (debug_mode) {
myself.Shout("SCE_1MIN_TIMER");

}
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
gg.SendUIEvent(h0.creature, 0, 0, 0, "0", "1", "0", gg.MakeFString(1801090, "", "", "", "", ""), "0", "0");

}

}

}

}

}

} else if (script_event_arg1 == 23140021) {
if (debug_mode) {
myself.Shout("SCE_ZONEINFO_CHG");

}
if (myself.i_ai1 == 0) {
if (debug_mode) {
myself.Shout("NOW P3");

}
myself.i_ai0 = 3;
myself.i_ai1 = 1;
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
myself.ChangeZoneInfo(h0.creature, 0, 2);

}

}

}

}

}
i0 = myself.InstantZone_GetId();
if (myself.i_ai3 == 0) {
gg.Area_SetOnOffEx(AREA_effect_1s_01, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08, 1, i0);

} else if (myself.i_ai3 == 1) {
gg.Area_SetOnOffEx(AREA_effect_1s_01_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08_hd, 1, i0);

}

} else if (myself.i_ai1 == 1) {
if (debug_mode) {
myself.Shout("NOW P4");

}
myself.i_ai0 = 4;
myself.i_ai1 = 0;
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
myself.ChangeZoneInfo(h0.creature, 0, 1);

}

}

}

}

}
i0 = myself.InstantZone_GetId();
if (myself.i_ai3 == 0) {
gg.Area_SetOnOffEx(AREA_effect_1s_01, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08, 0, i0);

} else if (myself.i_ai3 == 1) {
gg.Area_SetOnOffEx(AREA_effect_1s_01_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_02_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_03_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_04_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_05_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_06_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_07_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_08_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_09_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_10_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_11_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_12_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_13_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_14_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_15_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_16_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_17_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_18_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_19_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_20_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_1s_21_hd, 1, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_01_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_02_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_03_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_04_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_06_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_07_hd, 0, i0);
gg.Area_SetOnOffEx(AREA_effect_2s_08_hd, 0, i0);

}

}

} else if (script_event_arg1 == 23140055) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(SKILL_death_clock)) > 0) {
if (debug_mode) {
myself.Shout("죽음의 선고 dispel : " + h0.creature.name);

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(SKILL_death_clock));

}

}

}

}

}

}

} else if (script_event_arg1 == 23140057) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(SKILL_area_lv1)) > 0) {
if (debug_mode) {
myself.Shout("area lv1 dispel : " + h0.creature.name);

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(SKILL_area_lv1));

}

}

}

}

}

}

} else if (script_event_arg1 == 23140058) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.HaveMemo(h0.creature, 10286) == 1) {
myself.SetMemoState(h0.creature, 10286, 10);
myself.SetFlagJournal(h0.creature, 10286, 7);
myself.ShowQuestMark(h0.creature, 10286);
myself.SoundEffect(h0.creature, "ItemSound.quest_middle");

}

}

}

}

}

}

} else if (script_event_arg1 == 23140059) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (h0.creature.is_pc == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(SKILL_area_lv1)) > 0) {
if (debug_mode) {
myself.Shout("area lv1 dispel : " + h0.creature.name);

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(SKILL_area_lv1));

}
if (debug_mode) {
myself.Shout("leave " + h0.creature.name);

}
myself.InstantZone_Leave(h0.creature);

}

}

}

}

}

}

} else if (script_event_arg1 == 23140061) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (script_event_arg2 == 0 && script_event_arg3 == 0) {
gg.SendUIEvent(h0.creature, 1, 0, 0, "0", gg.IntToStr(script_event_arg2), gg.IntToStr(script_event_arg3), gg.MakeFString(1801110, "", "", "", "", ""), "0", "0");

} else {
gg.SendUIEvent(h0.creature, 0, 0, 0, "0", gg.IntToStr(script_event_arg2), gg.IntToStr(script_event_arg3), gg.MakeFString(1801110, "", "", "", "", ""), "0", "0");

}

}

}

}

}

}

} else if (script_event_arg1 == 23140022) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai2 = script_event_arg2;

}

} else if (script_event_arg1 == 23140014) {
c0 = gg.GetCreatureFromIndex(myself.i_ai2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140014, 0);

}

} else if (script_event_arg1 == 23140019) {
c0 = gg.GetCreatureFromIndex(myself.i_ai2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140019, 0);

}
myself.i_ai0 = 5;

} else if (script_event_arg1 == 23140063) {
myself.i_ai0 = 1;
myself.Despawn();

} else if (script_event_arg1 == 23140066) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (h0.creature.is_pc == 1) {
myself.VoiceNPCEffect(h0.creature, "Freya.freya_voice_03", 0);

}

}

}

}

}

}

} else if (script_event_arg1 == 23140067) {
i0 = gg.Rand(3);
switch (i0) {
case 0: {
s0 = "Freya.freya_voice_09";
break;

}
case 1: {
s0 = "Freya.freya_voice_10";
break;

}
case 2: {
s0 = "Freya.freya_voice_11";
break;

}

}
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (h0.creature.is_pc == 1) {
myself.VoiceNPCEffect(h0.creature, s0, 0);
if (debug_mode) {
myself.Shout("voice blizzard : " + h0.creature.name);

}

}

}

}

}

}

}

} else if (script_event_arg1 == 23140068) {
if (myself.i_ai3 == 0) {
i0 = gg.Rand(5);

} else if (myself.i_ai3 == 1) {
i0 = gg.Rand(8);

}
switch (i0) {
case 0: {
s0 = "Freya.freya_voice_04";
break;

}
case 1: {
s0 = "Freya.freya_voice_05";
break;

}
case 2: {
s0 = "Freya.freya_voice_06";
break;

}
case 3: {
s0 = "Freya.freya_voice_07";
break;

}
case 4: {
s0 = "Freya.freya_voice_08";
break;

}
case 5: {
s0 = "Freya.freya_voice_12";
break;

}
case 6: {
s0 = "Freya.freya_voice_13";
break;

}
case 7: {
s0 = "Freya.freya_voice_14";
break;

}

}
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.instant_zone_id == myself.InstantZone_GetId()) {
if (h0.creature.is_pc == 1) {
myself.VoiceNPCEffect(h0.creature, s0, 0);
if (debug_mode) {
myself.Shout("voice normal : " + h0.creature.name);

}

}

}

}

}

}

}

}
	}


}