package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hall_a_alarm_maker extends inzone_maker {
	protected String WallDoorName1 = "frintessa_new_door_101";
	protected String WallDoorName2 = "frintessa_new_door_102";
	protected String WallDoorName3 = "frintessa_new_door_103";
	protected String WallDoorName4 = "frintessa_new_door_104";
	protected String WallDoorName5 = "frintessa_new_door_105";
	protected String WallDoorName6 = "frintessa_new_door_106";
	protected String WallDoorName7 = "frintessa_new_door_107";
	protected String WallDoorName8 = "frintessa_new_door_108";
	protected String A_Monsters01 = "godard32_1713_011m1";
	protected String A_Monsters02 = "godard32_1713_012m1";
	protected String A_Monsters03 = "godard32_1713_013m1";
	protected String A_Monsters04 = "godard32_1713_014m1";
	protected String A_Monsters05 = "godard32_1713_015m1";
	protected String A_Monsters06 = "godard32_1713_016m1";
	protected String A_Monsters07 = "godard32_1713_017m1";
	protected String A_Monsters08 = "godard32_1713_018m1";
	protected int inzone_type_param = 136;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;

	protected void ON_START() {
myself.i_ai0 = 0;
super;
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0, HandlerParam i0) {
i0 = myself.GetInZoneID();
gg.Castle_GateOpenCloseEx(WallDoorName1, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName2, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName3, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName4, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName5, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName6, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName7, 0, i0);
gg.Castle_GateOpenCloseEx(WallDoorName8, 0, i0);
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters01);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters02);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters03);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters04);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters05);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters06);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters07);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, A_Monsters08);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001041, 0, 0);

}
	}


}