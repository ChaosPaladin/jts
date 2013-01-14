package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_debug extends default_npc {
	protected String MAKER_freya_1st = "schuttgart29_2314_100m1";
	protected String MAKER_freya_2nd = "schuttgart29_2314_102m1";
	protected String MAKER_freya_3rd = "schuttgart29_2314_104m1";
	protected String MAKER_freya_4th = "schuttgart29_2314_106m1";
	protected String MAKER_freya_ending = "schuttgart29_2314_108m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";
	protected String MAKER_ice_castle = "schuttgart29_2314_06m1";
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
	protected int debug_mode = 0;

	protected void CREATED() {
myself.ChangeNickName(myself.sm, "debugnpc");
myself.ChangeMasterName(myself.sm, "0을입력하면설명서");
	}

	protected void TALKED(HandlerParam talker) {
if (debug_mode) {
myself.Say("Debug용 NPC 입니다.");
myself.Say("11 : KNIGHT 한마리 스폰");
myself.Say("12 : KNIGHT 두마리 스폰");
myself.Say("21 : ZoneInfo : 지형변경");
myself.Say("22 : ZoneInfo : 원래지형");
myself.Say("30 : UI TIMER TEST - ON");
myself.Say("31 : UI TIMER TEST - OFF");
myself.Say("40 : no damage mode - ON");
myself.Say("41 : no damage mode - OFF");
myself.Say("1015 : SCENE ID 15 - 오프닝");
myself.Say("1016 : SCENE ID 16 - P1 -> P2");
myself.Say("1017 : SCENE ID 17 - P2 -> P3");
myself.Say("1018 : SCENE ID 18 - P3 -> P4");
myself.Say("1019 : SCENE ID 19 - 엔딩 #1");
myself.Say("1020 : SCENE ID 20 - 엔딩 #2");
myself.Say("1021 : SCENE ID 21 - 강제 패배");
myself.Say("1022 : SCENE ID 22 - 일반 패배");
myself.Say("1023 : SCENE ID 23 - 중간보스 스폰");
myself.Say("51 : 리셋 루틴 테스트");

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc == 1) {
myself.AddAttackDesire(attacker, 1, 1000000);

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0, HandlerParam maker0) {
if (reply == 0) {
if (debug_mode) {
myself.Say("Debug용 NPC 입니다.");
myself.Say("11 : KNIGHT 한마리 스폰");
myself.Say("12 : KNIGHT 두마리 스폰");
myself.Say("21 : ZoneInfo : 지형변경");
myself.Say("22 : ZoneInfo : 원래지형");
myself.Say("30 : UI TIMER TEST - ON");
myself.Say("31 : UI TIMER TEST - OFF");
myself.Say("40 : no damage mode - ON");
myself.Say("41 : no damage mode - OFF");
myself.Say("1015 : SCENE ID 15 - 오프닝");
myself.Say("1016 : SCENE ID 16 - P1 -> P2");
myself.Say("1017 : SCENE ID 17 - P2 -> P3");
myself.Say("1018 : SCENE ID 18 - P3 -> P4");
myself.Say("1019 : SCENE ID 19 - 엔딩 #1");
myself.Say("1020 : SCENE ID 20 - 엔딩 #2");
myself.Say("1021 : SCENE ID 21 - 강제 패배");
myself.Say("1022 : SCENE ID 22 - 일반 패배");
myself.Say("1023 : SCENE ID 23 - 중간보스 스폰");

}

}
if (reply == 11) {
myself.Say("11");
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140015, 1, 0);

}

} else if (reply == 12) {
myself.Say("12");
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140015, 2, 0);

}

} else if (reply == 21) {
myself.Say("21 : ZoneInfo : 지형변경");
myself.ChangeZoneInfo(creature, 0, 2);
i0 = myself.InstantZone_GetId();
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

} else if (reply == 22) {
myself.Say("22 : ZoneInfo : 원래지형");
myself.ChangeZoneInfo(creature, 0, 1);
i0 = myself.InstantZone_GetId();
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

} else if (reply == 30) {
myself.Say("30 : ON UI TIMER");
gg.SendUIEvent(creature, 0, 0, 0, "0", "1", "0", gg.MakeFString(1801090, "", "", "", "", ""), "0", "0");

} else if (reply == 31) {
myself.Say("31 : OFF UI TIMER");
gg.SendUIEvent(creature, 1, 0, 0, "0", "1", "0", gg.MakeFString(1801090, "", "", "", "", ""), "0", "0");

} else if (reply == 40) {
myself.Say("40 : no damage mode - on");
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

} else if (reply == 41) {
myself.Say("41 : no damage mode - off");
myself.sm.absolute_defence = 0;
myself.sm.no_attack_damage = 0;

} else if (reply == 1015) {
myself.Say("1015");
myself.StartScenePlayerAround(myself.sm, 15, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1016) {
myself.Say("1016");
myself.StartScenePlayerAround(myself.sm, 16, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1017) {
myself.Say("1017");
myself.StartScenePlayerAround(myself.sm, 17, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1018) {
myself.Say("1018");
myself.StartScenePlayerAround(myself.sm, 18, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1019) {
myself.Say("1019");
myself.StartScenePlayerAround(myself.sm, 19, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1020) {
myself.Say("1020");
myself.StartScenePlayerAround(myself.sm, 20, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1021) {
myself.Say("1021");
myself.StartScenePlayerAround(myself.sm, 21, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1022) {
myself.Say("1022");
myself.StartScenePlayerAround(myself.sm, 22, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 1023) {
myself.Say("1023");
myself.StartScenePlayerAround(myself.sm, 23, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else if (reply == 51) {
myself.Say("51");
myself.BroadcastScriptEvent(23141234, 0, 1000);

}
	}


}