package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_emery_facility extends default_npc {
	protected String CleftMakerName = "default_maker_name";
	protected String AreaDataName = "default_area_name";
	protected int ZoneType = -1;
	protected int DestroyPoint = -1;

	protected void CREATED() {
gg.Area_SetOnOff(AreaDataName, 0);
if (gg.IsSameString("emery_facility_l", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300154, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_a", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300155, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_b", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300156, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_c", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300157, "", "", "", "", ""));

}
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.c_ai0 = attacker;
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam i0, HandlerParam i1) {
if (myself.GetCleftState() != 2) {
return;

}
if (gg.IsSameString("emery_facility_l", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300158, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_a", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300159, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_b", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300160, "", "", "", "", ""));

}
if (gg.IsSameString("emery_facility_s_c", myself.sm.name) == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 6000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1300161, "", "", "", "", ""));

}
myself.CleftCenterDestroyed(ZoneType, myself.c_ai0, DestroyPoint);
gg.Area_SetOnOff(AreaDataName, 1);
maker0 = gg.GetNpcMaker(CleftMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
	}


}