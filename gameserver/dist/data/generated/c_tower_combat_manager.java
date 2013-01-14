package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_combat_manager extends default_npc {
	protected String fnHi = "c_tower_switch.htm";
	protected String DoorName1 = "door_en";
	protected String DoorName2 = "door_ex";
	protected String MonsterMakerName = "c_tower_monster_set";
	protected String TrapMakerName = "c_tower_trap_lurker";
	protected String NaiaGateMakerName = "gludio59_1825_top01m1";
	protected String BeforeMaker = "unguya~";
	protected int ControlMessage = 10001;
	protected int CheckMessage = 10101;
	protected int RoomNumber = 0;
	protected int IsTrapRoom = 0;
	protected int LimitTime = 300000;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 1);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
party0 = gg.GetParty(talker);
if (myself.i_ai1 == 1) {
return;

} else if (gg.IsNull(party0) == 1) {
myself.ShowSystemMessage(talker, 2291);
return;

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam maker1, HandlerParam i0, HandlerParam party0) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
myself.i_quest0 = party0.id;

} else {
myself.ShowSystemMessage(talker, 2291);
return;

}
myself.InstantTeleportInMyTerritoryWithCondition(16110, 243841, 11616, 200, 2, myself.i_quest0);
if (RoomNumber == 0) {
gg.Castle_GateOpenClose2(DoorName1, 1);

} else {
gg.Castle_GateOpenClose2(DoorName1, 1);
maker1 = gg.GetNpcMaker(BeforeMaker);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 88013, 0, 0);

}

}
maker0 = gg.GetNpcMaker(MonsterMakerName);
i0 = gg.GetIndexFromCreature(myself.sm);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 88008, i0, 0);

}
myself.i_ai1 = 1;
myself.i_ai2 = 1;
myself.AddLogByNpc(122, talker, 1, 0);
myself.AddTimerEx(1005, LimitTime);
if (IsTrapRoom == 1) {
maker1 = gg.GetNpcMaker(TrapMakerName);
if (gg.IsNull(maker1) == 0) {

}
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam c0, HandlerParam maker0, HandlerParam maker1, HandlerParam timer_id) {
if (script_event_arg1 == 88009) {
myself.i_quest1 = -1;
gg.Castle_GateOpenClose2(DoorName2, 0);
myself.i_ai2 = 0;
if (RoomNumber == 2) {
myself.AddTimerEx(1004, 30000);

}
if (IsTrapRoom == 1) {
maker0 = gg.GetNpcMaker(TrapMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (RoomNumber == 3) {
maker1 = gg.GetNpcMaker(NaiaGateMakerName);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 33033, 0, 0);

}

}
myself.AddTimerEx(9999, LimitTime * 6);

} else if (script_event_arg1 == 88013) {
myself.i_ai1 = 0;
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 1);

} else if (script_event_arg1 == 10101 || script_event_arg1 == 10001) {
return;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam maker1) {
if (timer_id == 1005) {
if (myself.i_ai2 == 1) {
if (myself.i_quest1 == -1) {
myself.i_quest1 = 0;
return;

} else if (myself.i_quest1 == 0) {
myself.InstantTeleportInMyTerritory(16110, 243841, 11616, 200);
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
gg.Castle_GateOpenClose2(DoorName1, 0);
maker0 = gg.GetNpcMaker(MonsterMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
if (IsTrapRoom == 1) {
maker1 = gg.GetNpcMaker(TrapMakerName);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1000, 0, 0);

}

}

}

} else if (myself.i_ai2 == 0) {
myself.i_quest1 = 0;

}

} else if (timer_id == 1004) {
gg.Castle_GateOpenClose2(DoorName2, 1);
gg.Castle_GateOpenClose2(DoorName1, 0);
myself.i_ai1 = 0;
myself.i_quest0 = 0;
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 243971, -13376, 100);

} else if (timer_id == 9999) {
if (myself.i_ai1 == 1 && myself.i_ai2 == 0) {
myself.InstantTeleportInMyTerritory(16110, 243841, 11616, 200);
myself.i_ai1 = 0;
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 1);

}

}
	}


}