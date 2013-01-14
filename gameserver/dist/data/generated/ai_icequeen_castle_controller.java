package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_castle_controller extends default_npc {
	protected String TRR_FREYA_1F = "schuttgart29_2314_06";
	protected String AREA_stone_lv1 = "23_14_icequeen_lv1";
	protected String AREA_stone_lv2 = "23_14_icequeen_lv2";
	protected String AREA_stone_lv3 = "23_14_icequeen_lv3";
	protected String AREA_stone_lv4 = "23_14_icequeen_lv4";
	protected String AREA_stone_lv5 = "23_14_icequeen_lv5";
	protected String AREA_stone_lv6 = "23_14_icequeen_lv6";
	protected String AREA_stone_lv7 = "23_14_icequeen_lv7";
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String MAKER_ice_castle = "schuttgart29_2314_06m1";
	protected int is_hard_mode = 0;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam pos0, HandlerParam maker0) {
if (script_event_arg1 == 23140015) {
if (myself.i_ai0 >= 7) {
if (debug_mode) {
myself.Say("결빙석 지대 과중 중첩!!!");

}
gg.Area_SetOnOffEx(AREA_stone_lv6, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv7, 1, myself.InstantZone_GetId());
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140041, 0, 0);

}

} else {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 < 7) {
myself.ChangeNPCState(myself.sm, myself.i_ai0);

} else if (myself.i_ai0 >= 7) {
myself.ChangeNPCState(myself.sm, 7);

}
if (debug_mode) {
myself.Say("결빙석 지대 레벨 업 " + myself.i_ai0);

}
switch (myself.i_ai0) {
case 1: {
gg.Area_SetOnOffEx(AREA_stone_lv1, 1, myself.InstantZone_GetId());
break;

}
case 2: {
gg.Area_SetOnOffEx(AREA_stone_lv1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv2, 1, myself.InstantZone_GetId());
break;

}
case 3: {
gg.Area_SetOnOffEx(AREA_stone_lv2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv3, 1, myself.InstantZone_GetId());
break;

}
case 4: {
gg.Area_SetOnOffEx(AREA_stone_lv3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv4, 1, myself.InstantZone_GetId());
break;

}
case 5: {
gg.Area_SetOnOffEx(AREA_stone_lv4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv5, 1, myself.InstantZone_GetId());
break;

}
case 6: {
gg.Area_SetOnOffEx(AREA_stone_lv5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv6, 1, myself.InstantZone_GetId());
break;

}

}

}
pos0 = gg.GetRandomPosInTerritory(TRR_FREYA_1F, 0);
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count >= 1) {
myself.CreateOnePrivateEx(1018853, "ai_icequeen_stone", 0, 0, gg.FloatToInt(pos0.x), gg.FloatToInt(pos0.y), gg.FloatToInt(pos0.z), 0, is_hard_mode, 0, 0);
if (debug_mode) {
myself.Say("결빙석 스폰! " + gg.FloatToInt(pos0.x) + ", " + gg.FloatToInt(pos0.y) + ", " + gg.FloatToInt(pos0.z));

}

} else if (debug_mode) {
myself.Say("이미 9개의 결빙석이 스폰되었음");

}

} else if (script_event_arg1 == 23140040) {
if (myself.i_ai0 > 0) {
if (debug_mode) {
myself.Say("결빙석 지대 레벨 다운");

}
switch (myself.i_ai0) {
case 1: {
gg.Area_SetOnOffEx(AREA_stone_lv1, 0, myself.InstantZone_GetId());
break;

}
case 2: {
gg.Area_SetOnOffEx(AREA_stone_lv2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv1, 1, myself.InstantZone_GetId());
break;

}
case 3: {
gg.Area_SetOnOffEx(AREA_stone_lv3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv2, 1, myself.InstantZone_GetId());
break;

}
case 4: {
gg.Area_SetOnOffEx(AREA_stone_lv4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv3, 1, myself.InstantZone_GetId());
break;

}
case 5: {
gg.Area_SetOnOffEx(AREA_stone_lv5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv4, 1, myself.InstantZone_GetId());
break;

}
case 6: {
gg.Area_SetOnOffEx(AREA_stone_lv6, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv5, 1, myself.InstantZone_GetId());
break;

}
case 7: {
gg.Area_SetOnOffEx(AREA_stone_lv7, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AREA_stone_lv6, 1, myself.InstantZone_GetId());
break;

}

}
myself.i_ai0 = myself.i_ai0 - 1;
if (myself.i_ai0 == 0) {
myself.ChangeNPCState(myself.sm, 8);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140057, 0, 0);

}

} else {
myself.ChangeNPCState(myself.sm, myself.i_ai0);

}

}

}
	}


}