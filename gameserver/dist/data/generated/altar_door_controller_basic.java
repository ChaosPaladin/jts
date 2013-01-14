package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class altar_door_controller_basic extends citizen {
	protected String DoorName = "altar_door_controller_basic_default";
	protected String DoorName3rdFloor = "altar_door_controller_basic_DoorName3rdFloor";
	protected String MakerNameUniqueNPC2ndFloor = "altar_start_02";
	protected String MakerNameJako2ndFloor = "altar_start_01";
	protected String MakerNameAltarDoorCon = "rune14_andreas_m3";
	protected String MakerNameStageCon = "rune14_andreas_m2";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam maker1) {
if (myself.i_ai0 == 0) {
myself.BroadcastScriptEvent(1, gg.GetIndexFromCreature(creature), 4000);

} else if (myself.i_ai0 == 2) {
myself.BroadcastScriptEvent(3, gg.GetIndexFromCreature(creature), 4000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam maker0, HandlerParam maker1) {
if (script_event_arg1 == 0) {
if (gg.IsSameString(DoorName, "altar_door_controller_basic_default") == 0) {
gg.Castle_GateOpenClose2(DoorName, 0);

}
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 1);

}

} else if (script_event_arg1 == 1) {
maker0 = gg.GetNpcMaker(MakerNameUniqueNPC2ndFloor);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("unique npc maker가 존재 하지 않습니다");

}
maker1 = gg.GetNpcMaker(MakerNameJako2ndFloor);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

} else {
myself.Say("jako npc maker가 존재 하지 않습니다");

}
maker1 = gg.GetNpcMaker(MakerNameStageCon);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

} else {
myself.Say("stage control npc maker가 존재 하지 않습니다");

}
myself.AddTimerEx(2001, 3 * 60 * 1000);

} else if (script_event_arg1 == 2) {
myself.Shout(gg.MakeFString(10079, "", "", "", "", ""));
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 0);

}
myself.AddTimerEx(2002, 3 * 60 * 1000);

} else if (script_event_arg1 == 3) {
myself.i_ai1 = 1;
myself.AddTimerEx(2003, 2 * 60 * 1000);

} else if (script_event_arg1 == 4) {

} else if (script_event_arg1 == 5) {
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 0);

}
if (myself.IsNullString(DoorName) == 0) {
gg.Castle_GateOpenClose2(DoorName, 0);

}
maker0 = gg.GetNpcMaker(MakerNameStageCon);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("stage control npc maker가 존재 하지 않습니다");

}
myself.AddTimerEx(2004, 3 * 60 * 1000);

} else if (script_event_arg1 == 6) {
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 1);

}
myself.AddTimerEx(2005, 3 * 60 * 1000);

} else if (script_event_arg1 == 7) {
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 0);

}
myself.AddTimerEx(2006, 60 * 60 * 1000);

}
if (script_event_arg1 < 9) {
myself.i_ai0 = script_event_arg1;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 2001) {
if (myself.IsNullString(DoorName) == 0) {
gg.Castle_GateOpenClose2(DoorName, 1);

}

} else if (timer_id == 2002) {
if (myself.i_ai1 == 0) {
if (gg.IsSameString(DoorName3rdFloor, "altar_door_controller_basic_DoorName3rdFloor") == 0) {
gg.Castle_GateOpenClose2(DoorName3rdFloor, 1);

}

}

} else if (timer_id == 2003) {
myself.i_ai1 = 0;
myself.AddTimerEx(2002, 1 * 60 * 1000);

} else if (timer_id == 2004) {
myself.BroadcastScriptEvent(6, gg.GetIndexFromCreature(myself.sm), 4000);

} else if (timer_id == 2005) {
myself.Despawn();

} else if (timer_id == 2006) {
maker0 = gg.GetNpcMaker(MakerNameUniqueNPC2ndFloor);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("2nd foor unique npc maker가 존재 하지 않습니다");

}
maker0 = gg.GetNpcMaker(MakerNameStageCon);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("stage control npc maker가 존재 하지 않습니다");

}
if (myself.IsNullString(DoorName) == 0) {
gg.Castle_GateOpenClose2(DoorName, 0);

}
myself.i_ai0 = 0;
myself.BroadcastScriptEvent(0, gg.GetIndexFromCreature(myself.sm), 4000);

}
	}


}