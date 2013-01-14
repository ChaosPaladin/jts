package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class door_opener extends default_npc {
	protected String TDoorName1 = "frintessa_new_door_151";
	protected String TDoorName2 = "frintessa_new_door_251";
	protected String TDoorName3 = "frintessa_new_door_252";
	protected String TDoorName4 = "frintessa_new_door_351";
	protected String WallDoorName1A = "frintessa_new_door_101";
	protected String WallDoorName2A = "frintessa_new_door_102";
	protected String WallDoorName3A = "frintessa_new_door_103";
	protected String WallDoorName4A = "frintessa_new_door_104";
	protected String WallDoorName5A = "frintessa_new_door_105";
	protected String WallDoorName6A = "frintessa_new_door_106";
	protected String WallDoorName7A = "frintessa_new_door_107";
	protected String WallDoorName8A = "frintessa_new_door_108";
	protected String WallDoorName1B = "frintessa_new_door_201";
	protected String WallDoorName2B = "frintessa_new_door_202";
	protected String WallDoorName3B = "frintessa_new_door_203";
	protected String WallDoorName4B = "frintessa_new_door_204";
	protected String WallDoorName5B = "frintessa_new_door_205";
	protected String WallDoorName6B = "frintessa_new_door_206";
	protected String WallDoorName7B = "frintessa_new_door_207";
	protected String WallDoorName8B = "frintessa_new_door_208";
	protected String WallDoorName9B = "frintessa_new_door_209";
	protected String WallDoorName10B = "frintessa_new_door_210";

	protected void ATTACKED(HandlerParam i2) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(TDoorName1, 0, i2);
gg.Castle_GateOpenCloseEx(TDoorName2, 0, i2);
gg.Castle_GateOpenCloseEx(TDoorName3, 0, i2);
gg.Castle_GateOpenCloseEx(TDoorName4, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName1A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName2A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName3A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName4A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName5A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName6A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName7A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName8A, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName1B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName2B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName3B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName4B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName5B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName6B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName7B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName8B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName9B, 0, i2);
gg.Castle_GateOpenCloseEx(WallDoorName10B, 0, i2);
	}


}