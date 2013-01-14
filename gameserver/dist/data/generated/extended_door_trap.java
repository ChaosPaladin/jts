package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class extended_door_trap extends auto_door_trap {
	protected String DoorName = "extended_door_trap_door_default_1";
	protected String DoorName2 = "extended_door_trap_door_default_2";
	protected String DoorName3 = "extended_door_trap_door_default_3";
	protected String DoorName4 = "extended_door_trap_door_default_4";
	protected String DoorName5 = "extended_door_trap_door_default_5";
	protected String MeshName = "";
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int IsItemCheck = 0;
	protected int RemoveItem = 0;
	protected int DoorItem = 0;
	protected int DoorCloseTime = 0;
	protected String areadata = "extended_door_trap_area_default";
	protected int mesh_index = -1;
	protected int targetable = 0;
	protected int IsDespawn = 0;
	protected int OpenMultipleDoor = 0;
	protected int script_event_num = -1;
	protected int script_event_door = 0;
	protected int fortress_use = 0;
	protected int fortress_id = -1;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
super;
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
c0 = gg.GetCreatureFromID(i0);
if (IsItemCheck == 1) {
if (gg.OwnItemCount(c0, DoorItem) >= 1) {
if (gg.IsSameString(areadata, "extended_door_trap_area_default") == 0) {
gg.Area_SetOnOffEx(areadata, 1, myself.InstantZone_GetId());

}
if (mesh_index > -1) {
myself.SetStaticMeshStatus(c0, MeshName, targetable, mesh_index);
myself.c_ai0 = c0;

}
if (gg.IsSameString(DoorName, "extended_door_trap_door_default_1") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 0, i2);

}
if (gg.IsSameString(DoorName2, "extended_door_trap_door_default_2") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName2, 0, i2);

}
if (gg.IsSameString(DoorName3, "extended_door_trap_door_default_3") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName3, 0, i2);

}
if (gg.IsSameString(DoorName4, "extended_door_trap_door_default_4") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName4, 0, i2);

}
if (gg.IsSameString(DoorName5, "extended_door_trap_door_default_5") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName5, 0, i2);

}
if (RemoveItem == 1) {
myself.DeleteItem1(c0, DoorItem, 1);

}
if (IsDespawn == 1) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}

}
if (DoorCloseTime > 0) {
myself.AddTimerEx(2001, DoorCloseTime * 1000);

}

}

} else if (OpenMultipleDoor == 1) {
if (gg.IsSameString(areadata, "extended_door_trap_area_default") == 0) {
gg.Area_SetOnOffEx(areadata, 1, myself.InstantZone_GetId());

}
if (mesh_index > -1) {
myself.SetStaticMeshStatus(c0, MeshName, targetable, mesh_index);
myself.c_ai0 = c0;

}
if (gg.IsSameString(DoorName, "extended_door_trap_door_default_1") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 0, i2);

}
if (gg.IsSameString(DoorName2, "extended_door_trap_door_default_2") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName2, 0, i2);

}
if (gg.IsSameString(DoorName3, "extended_door_trap_door_default_3") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName3, 0, i2);

}
if (gg.IsSameString(DoorName4, "extended_door_trap_door_default_4") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName4, 0, i2);

}
if (gg.IsSameString(DoorName5, "extended_door_trap_door_default_5") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName5, 0, i2);

}
if (IsDespawn == 1) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}

}
if (DoorCloseTime > 0) {
myself.AddTimerEx(2001, DoorCloseTime * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i2) {
if (timer_id == 2001) {
if (gg.IsSameString(areadata, "extended_door_trap_area_default") == 0) {
gg.Area_SetOnOffEx(areadata, 0, myself.InstantZone_GetId());

}
if (mesh_index > -1) {
myself.SetStaticMeshStatus(myself.c_ai0, MeshName, targetable, 0);

}
if (gg.IsSameString(DoorName, "extended_door_trap_door_default_1") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 1, i2);

}
if (gg.IsSameString(DoorName2, "extended_door_trap_door_default_2") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName2, 1, i2);

}
if (gg.IsSameString(DoorName3, "extended_door_trap_door_default_3") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName3, 1, i2);

}
if (gg.IsSameString(DoorName4, "extended_door_trap_door_default_4") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName4, 1, i2);

}
if (gg.IsSameString(DoorName5, "extended_door_trap_door_default_5") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName5, 1, i2);

}
if (IsDespawn == 2) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i2) {
if (fortress_use == 1 && fortress_id > -1) {
if (gg.Fortress_GetOwnerPledgeId(fortress_id) > 0) {
return;

}

}
if (script_event_arg1 == script_event_num) {
if (gg.IsSameString(DoorName, "extended_door_trap_door_default_1") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, script_event_door, i2);

}
if (gg.IsSameString(DoorName2, "extended_door_trap_door_default_2") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName2, script_event_door, i2);

}
if (gg.IsSameString(DoorName3, "extended_door_trap_door_default_3") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName3, script_event_door, i2);

}
if (gg.IsSameString(DoorName4, "extended_door_trap_door_default_4") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName4, script_event_door, i2);

}
if (gg.IsSameString(DoorName5, "extended_door_trap_door_default_5") == 0) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName5, script_event_door, i2);

}

}
	}


}