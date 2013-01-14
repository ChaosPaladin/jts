package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ct3_fc_main_manger extends ai_ct3_fc_manager {
	protected int DB_CHECK_COMPLETE = 4405;
	protected int GM_ID = 111114;
	protected int WARNING_TIMER = 4406;
	protected int AREA_SETTING = 4407;
	protected int AREA_CHECK = 4408;
	protected String AreaDataName1 = "14_23_beastacon_for_melee";
	protected String AreaDataName2 = "14_23_beastacon_for_archer";
	protected String AreaDataName3 = "14_23_beastacon_for_mage";
	protected String AreaDataName11 = "14_23_beastacon_for_melee_for_pc";
	protected String AreaDataName12 = "14_23_beastacon_for_archer_for_pc";
	protected String AreaDataName13 = "14_23_beastacon_for_mage_for_pc";
	protected String AreaDataName4 = "13_23_cocracon_for_melee";
	protected String AreaDataName5 = "13_23_cocracon_for_archer";
	protected String AreaDataName6 = "13_23_cocracon_for_mage";
	protected String AreaDataName14 = "13_23_cocracon_for_melee_for_pc";
	protected String AreaDataName15 = "13_23_cocracon_for_archer_for_pc";
	protected String AreaDataName16 = "13_23_cocracon_for_mage_for_pc";
	protected String AreaDataName7 = "14_23_raptilicon_for_melee";
	protected String AreaDataName8 = "14_23_raptilicon_for_archer";
	protected String AreaDataName9 = "14_23_raptilicon_for_mage";
	protected String AreaDataName17 = "14_23_raptilicon_for_melee_for_pc";
	protected String AreaDataName18 = "14_23_raptilicon_for_archer_for_pc";
	protected String AreaDataName19 = "14_23_raptilicon_for_mage_for_pc";

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
gg.Area_SetOnOff(AreaDataName1, 0);
gg.Area_SetOnOff(AreaDataName2, 0);
gg.Area_SetOnOff(AreaDataName3, 0);
gg.Area_SetOnOff(AreaDataName4, 0);
gg.Area_SetOnOff(AreaDataName5, 0);
gg.Area_SetOnOff(AreaDataName6, 0);
gg.Area_SetOnOff(AreaDataName7, 0);
gg.Area_SetOnOff(AreaDataName8, 0);
gg.Area_SetOnOff(AreaDataName9, 0);
gg.Area_SetOnOff(AreaDataName11, 0);
gg.Area_SetOnOff(AreaDataName12, 0);
gg.Area_SetOnOff(AreaDataName13, 0);
gg.Area_SetOnOff(AreaDataName14, 0);
gg.Area_SetOnOff(AreaDataName15, 0);
gg.Area_SetOnOff(AreaDataName16, 0);
gg.Area_SetOnOff(AreaDataName17, 0);
gg.Area_SetOnOff(AreaDataName18, 0);
gg.Area_SetOnOff(AreaDataName19, 0);
gg.LoadDBSavingMap(myself.sm, 33);
gg.LoadDBSavingMap(myself.sm, 34);
gg.LoadDBSavingMap(myself.sm, 35);
gg.LoadDBSavingMap(myself.sm, 36);
myself.AddTimerEx(WARNING_TIMER, 30 * 1000);
myself.AddTimerEx(AREA_CHECK, 5 * 60 * 1000);
super;
	}

	protected void LOAD_DBSAVING_MAP_RETURNED(HandlerParam talker, HandlerParam i0, HandlerParam i1) {
if (i0 == 33) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (i0 == 34) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (i0 == 35) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (i0 == 36) {
myself.i_ai0 = myself.i_ai0 + 1;

}
if (myself.i_ai0 == 4) {
if (myself.i_ai1 == 0) {
myself.AddTimerEx(DB_CHECK_COMPLETE, 5 * 1000);
myself.AddLogByNpc2(127, myself.sm, "a_seed_fc_manager", "4 DBV Checked ", myself.i_ai0, myself.i_ai1, 0, 0, 0, 1);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == DB_CHECK_COMPLETE) {
if (gg.GetDBSavingMap(33) > 0 && gg.GetDBSavingMap(33) < 7) {

} else {
i0 = gg.Rand(6) + 1;
gg.RegisterDBSavingMap(33, i0);

}
myself.AddTimerEx(AREA_SETTING, 5 * 1000);

} else if (timer_id == AREA_CHECK) {
if (myself.i_ai1 == 0) {
myself.AddTimerEx(DB_CHECK_COMPLETE, 5 * 1000);

}

} else if (timer_id == WARNING_TIMER) {
if (gg.GetDateTime(0, 6) == 1) {
if (gg.GetDateTime(0, 3) == 12) {
if (gg.GetDateTime(0, 4) > 50) {

}

}

}
myself.AddTimerEx(WARNING_TIMER, 60 * 1000);

} else if (timer_id == AREA_SETTING) {
if (myself.i_ai1 == 0) {
switch (gg.GetDBSavingMap(33)) {
case 1: {
gg.RegisterDBSavingMap(34, 1);
gg.RegisterDBSavingMap(35, 2);
gg.RegisterDBSavingMap(36, 3);
gg.Area_SetOnOff(AreaDataName1, 1);
gg.Area_SetOnOff(AreaDataName5, 1);
gg.Area_SetOnOff(AreaDataName9, 1);
gg.Area_SetOnOff(AreaDataName11, 1);
gg.Area_SetOnOff(AreaDataName15, 1);
gg.Area_SetOnOff(AreaDataName19, 1);
myself.i_ai1 = 1;
break;

}
case 2: {
gg.RegisterDBSavingMap(34, 1);
gg.RegisterDBSavingMap(35, 3);
gg.RegisterDBSavingMap(36, 2);
gg.Area_SetOnOff(AreaDataName1, 1);
gg.Area_SetOnOff(AreaDataName6, 1);
gg.Area_SetOnOff(AreaDataName8, 1);
gg.Area_SetOnOff(AreaDataName11, 1);
gg.Area_SetOnOff(AreaDataName16, 1);
gg.Area_SetOnOff(AreaDataName18, 1);
myself.i_ai1 = 1;
break;

}
case 3: {
gg.RegisterDBSavingMap(34, 2);
gg.RegisterDBSavingMap(35, 1);
gg.RegisterDBSavingMap(36, 3);
gg.Area_SetOnOff(AreaDataName2, 1);
gg.Area_SetOnOff(AreaDataName4, 1);
gg.Area_SetOnOff(AreaDataName9, 1);
gg.Area_SetOnOff(AreaDataName12, 1);
gg.Area_SetOnOff(AreaDataName14, 1);
gg.Area_SetOnOff(AreaDataName19, 1);
myself.i_ai1 = 1;
break;

}
case 4: {
gg.RegisterDBSavingMap(34, 2);
gg.RegisterDBSavingMap(35, 3);
gg.RegisterDBSavingMap(36, 1);
gg.Area_SetOnOff(AreaDataName2, 1);
gg.Area_SetOnOff(AreaDataName6, 1);
gg.Area_SetOnOff(AreaDataName7, 1);
gg.Area_SetOnOff(AreaDataName12, 1);
gg.Area_SetOnOff(AreaDataName16, 1);
gg.Area_SetOnOff(AreaDataName17, 1);
myself.i_ai1 = 1;
break;

}
case 5: {
gg.RegisterDBSavingMap(34, 3);
gg.RegisterDBSavingMap(35, 1);
gg.RegisterDBSavingMap(36, 2);
gg.Area_SetOnOff(AreaDataName3, 1);
gg.Area_SetOnOff(AreaDataName4, 1);
gg.Area_SetOnOff(AreaDataName8, 1);
gg.Area_SetOnOff(AreaDataName13, 1);
gg.Area_SetOnOff(AreaDataName14, 1);
gg.Area_SetOnOff(AreaDataName18, 1);
myself.i_ai1 = 1;
break;

}
case 6: {
gg.RegisterDBSavingMap(34, 3);
gg.RegisterDBSavingMap(35, 2);
gg.RegisterDBSavingMap(36, 1);
gg.Area_SetOnOff(AreaDataName3, 1);
gg.Area_SetOnOff(AreaDataName5, 1);
gg.Area_SetOnOff(AreaDataName7, 1);
gg.Area_SetOnOff(AreaDataName13, 1);
gg.Area_SetOnOff(AreaDataName15, 1);
gg.Area_SetOnOff(AreaDataName17, 1);
myself.i_ai1 = 1;
break;

}

}

}

}
	}

	protected void FIELD_CYCLE_STEP_EXPIRED(HandlerParam event_id, HandlerParam i0, HandlerParam i10, HandlerParam i1) {
if (event_id == RaceCycleID) {
if (i0 == 2) {
if (i1 == 0) {
myself.i_ai1 = 0;
i0 = gg.Rand(6) + 1;
gg.RegisterDBSavingMap(33, i0);
gg.Area_SetOnOff(AreaDataName1, 0);
gg.Area_SetOnOff(AreaDataName2, 0);
gg.Area_SetOnOff(AreaDataName3, 0);
gg.Area_SetOnOff(AreaDataName4, 0);
gg.Area_SetOnOff(AreaDataName5, 0);
gg.Area_SetOnOff(AreaDataName6, 0);
gg.Area_SetOnOff(AreaDataName7, 0);
gg.Area_SetOnOff(AreaDataName8, 0);
gg.Area_SetOnOff(AreaDataName9, 0);
gg.Area_SetOnOff(AreaDataName11, 0);
gg.Area_SetOnOff(AreaDataName12, 0);
gg.Area_SetOnOff(AreaDataName13, 0);
gg.Area_SetOnOff(AreaDataName14, 0);
gg.Area_SetOnOff(AreaDataName15, 0);
gg.Area_SetOnOff(AreaDataName16, 0);
gg.Area_SetOnOff(AreaDataName17, 0);
gg.Area_SetOnOff(AreaDataName18, 0);
gg.Area_SetOnOff(AreaDataName19, 0);
myself.AddTimerEx(AREA_SETTING, 30 * 1000);

}

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (reply == -1) {
gg.RegisterDBSavingMap(33, 0);
gg.RegisterDBSavingMap(34, 0);
gg.RegisterDBSavingMap(35, 0);
gg.RegisterDBSavingMap(36, 0);
gg.SetStep_FieldCycle(4, 0, 8, myself.sm);
gg.SetStep_FieldCycle(5, 0, 8, myself.sm);
gg.SetStep_FieldCycle(6, 0, 8, myself.sm);
myself.Whisper(creature, "GM value *& Race Field Cycle Step was initialized");
myself.Whisper(creature, "Please Restart NPC Server");
gg.Area_SetOnOff(AreaDataName1, 0);
gg.Area_SetOnOff(AreaDataName2, 0);
gg.Area_SetOnOff(AreaDataName3, 0);
gg.Area_SetOnOff(AreaDataName4, 0);
gg.Area_SetOnOff(AreaDataName5, 0);
gg.Area_SetOnOff(AreaDataName6, 0);
gg.Area_SetOnOff(AreaDataName7, 0);
gg.Area_SetOnOff(AreaDataName8, 0);
gg.Area_SetOnOff(AreaDataName9, 0);
gg.Area_SetOnOff(AreaDataName11, 0);
gg.Area_SetOnOff(AreaDataName12, 0);
gg.Area_SetOnOff(AreaDataName13, 0);
gg.Area_SetOnOff(AreaDataName14, 0);
gg.Area_SetOnOff(AreaDataName15, 0);
gg.Area_SetOnOff(AreaDataName16, 0);
gg.Area_SetOnOff(AreaDataName17, 0);
gg.Area_SetOnOff(AreaDataName18, 0);
gg.Area_SetOnOff(AreaDataName19, 0);

} else if (reply == 0) {
myself.Whisper(creature, "===== Seed Status =====");
i0 = gg.GetDBSavingMap(33);
i1 = gg.GetDBSavingMap(34);
i2 = gg.GetDBSavingMap(35);
i3 = gg.GetDBSavingMap(36);
myself.Whisper(creature, "시드 " + i0 + " 비스타콘 " + i1 + " 코크라콘 " + i2 + " 렙틸리콘 " + i3 + " ");

} else if (reply > 0 && reply < 7) {
gg.Area_SetOnOff(AreaDataName1, 0);
gg.Area_SetOnOff(AreaDataName2, 0);
gg.Area_SetOnOff(AreaDataName3, 0);
gg.Area_SetOnOff(AreaDataName4, 0);
gg.Area_SetOnOff(AreaDataName5, 0);
gg.Area_SetOnOff(AreaDataName6, 0);
gg.Area_SetOnOff(AreaDataName7, 0);
gg.Area_SetOnOff(AreaDataName8, 0);
gg.Area_SetOnOff(AreaDataName9, 0);
gg.Area_SetOnOff(AreaDataName11, 0);
gg.Area_SetOnOff(AreaDataName12, 0);
gg.Area_SetOnOff(AreaDataName13, 0);
gg.Area_SetOnOff(AreaDataName14, 0);
gg.Area_SetOnOff(AreaDataName15, 0);
gg.Area_SetOnOff(AreaDataName16, 0);
gg.Area_SetOnOff(AreaDataName17, 0);
gg.Area_SetOnOff(AreaDataName18, 0);
gg.Area_SetOnOff(AreaDataName19, 0);
myself.Whisper(creature, "===== Debug Mode =====");
switch (reply) {
case 1: {
gg.RegisterDBSavingMap(34, 1);
gg.RegisterDBSavingMap(35, 2);
gg.RegisterDBSavingMap(36, 3);
gg.Area_SetOnOff(AreaDataName1, 1);
gg.Area_SetOnOff(AreaDataName5, 1);
gg.Area_SetOnOff(AreaDataName9, 1);
gg.Area_SetOnOff(AreaDataName11, 1);
gg.Area_SetOnOff(AreaDataName15, 1);
gg.Area_SetOnOff(AreaDataName19, 1);
myself.Whisper(creature, "Areadata Setting Case 1");
break;

}
case 2: {
gg.RegisterDBSavingMap(34, 1);
gg.RegisterDBSavingMap(35, 3);
gg.RegisterDBSavingMap(36, 2);
gg.Area_SetOnOff(AreaDataName1, 1);
gg.Area_SetOnOff(AreaDataName6, 1);
gg.Area_SetOnOff(AreaDataName8, 1);
gg.Area_SetOnOff(AreaDataName11, 1);
gg.Area_SetOnOff(AreaDataName16, 1);
gg.Area_SetOnOff(AreaDataName18, 1);
myself.Whisper(creature, "Areadata Setting Case 2");
break;

}
case 3: {
gg.RegisterDBSavingMap(34, 2);
gg.RegisterDBSavingMap(35, 1);
gg.RegisterDBSavingMap(36, 3);
gg.Area_SetOnOff(AreaDataName2, 1);
gg.Area_SetOnOff(AreaDataName4, 1);
gg.Area_SetOnOff(AreaDataName9, 1);
gg.Area_SetOnOff(AreaDataName12, 1);
gg.Area_SetOnOff(AreaDataName14, 1);
gg.Area_SetOnOff(AreaDataName19, 1);
myself.Whisper(creature, "Areadata Setting Case 3");
break;

}
case 4: {
gg.RegisterDBSavingMap(34, 2);
gg.RegisterDBSavingMap(35, 3);
gg.RegisterDBSavingMap(36, 1);
gg.Area_SetOnOff(AreaDataName2, 1);
gg.Area_SetOnOff(AreaDataName6, 1);
gg.Area_SetOnOff(AreaDataName7, 1);
gg.Area_SetOnOff(AreaDataName12, 1);
gg.Area_SetOnOff(AreaDataName16, 1);
gg.Area_SetOnOff(AreaDataName17, 1);
myself.Whisper(creature, "Areadata Setting Case 4");
break;

}
case 5: {
gg.RegisterDBSavingMap(34, 3);
gg.RegisterDBSavingMap(35, 1);
gg.RegisterDBSavingMap(36, 2);
gg.Area_SetOnOff(AreaDataName3, 1);
gg.Area_SetOnOff(AreaDataName4, 1);
gg.Area_SetOnOff(AreaDataName8, 1);
gg.Area_SetOnOff(AreaDataName13, 1);
gg.Area_SetOnOff(AreaDataName14, 1);
gg.Area_SetOnOff(AreaDataName18, 1);
myself.Whisper(creature, "Areadata Setting Case 5");
break;

}
case 6: {
gg.RegisterDBSavingMap(34, 3);
gg.RegisterDBSavingMap(35, 2);
gg.RegisterDBSavingMap(36, 1);
gg.Area_SetOnOff(AreaDataName3, 1);
gg.Area_SetOnOff(AreaDataName5, 1);
gg.Area_SetOnOff(AreaDataName7, 1);
gg.Area_SetOnOff(AreaDataName13, 1);
gg.Area_SetOnOff(AreaDataName15, 1);
gg.Area_SetOnOff(AreaDataName17, 1);
myself.Whisper(creature, "Areadata Setting Case 6");
break;

}

}

}
super;
	}


}