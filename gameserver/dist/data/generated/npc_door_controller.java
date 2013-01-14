package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_door_controller extends default_npc {
	protected String add_monster_maker1 = "rumwarsha1224_031m1";
	protected String add_monster_maker2 = "rumwarsha1224_032m1";
	protected String add_monster_maker3 = "rumwarsha1224_033m1";
	protected String add_monster_maker4 = "rumwarsha1224_034m1";
	protected String add_monster_maker5 = "rumwarsha1224_035m1";
	protected String add_monster_maker6 = "rumwarsha1224_036m1";
	protected String add_monster_maker7 = "rumwarsha1224_037m1";
	protected String add_monster_maker8 = "rumwarsha1224_038m1";

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
gg.InzoneDoorBreakable("door_of_shield_011", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_012", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_021", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_022", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_031", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_032", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_041", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_042", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_051", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_052", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_061", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_062", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_071", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_072", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_081", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_082", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_091", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("door_of_shield_092", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("gate_of_destruction021", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("gate_of_destruction022", myself.InstantZone_GetId());
gg.InzoneDoorBreakable("gate_of_fortress", myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_destruction001", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_destruction002", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_001", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_002", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_003", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_004", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_005", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_006", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("secret_door_007", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_011", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_012", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_021", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_022", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_031", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_032", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_041", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_042", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_051", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_052", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_061", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_062", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_071", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_072", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_081", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_082", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_091", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_shield_092", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_destruction021", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_destruction022", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("gate_of_fortress", 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx("door_of_throne", 1, myself.InstantZone_GetId());
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam maker0) {
myself.BroadcastScriptEvent(1224003, gg.GetIndexFromCreature(attacker), 1500);
if (myself.i_ai0 == 0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, add_monster_maker8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai0 = 1;

}
	}

	protected void MY_DYING() {
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800295, "", "", "", "", ""));
super;
	}


}