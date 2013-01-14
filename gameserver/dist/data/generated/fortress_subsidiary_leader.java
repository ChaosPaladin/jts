package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_subsidiary_leader extends warrior_basic {
	protected int fortress_id = 0;
	protected String DoorName = "";
	protected String DoorName2 = "";
	protected String DoorName3 = "";
	protected String DoorName4 = "";
	protected int msg_door_break = -1;
	protected int msg_open_door = -1;
	protected int msg_dying = -1;
	protected int move_desire = 50;
	protected int x0 = 0;
	protected int y0 = 0;
	protected int z0 = 0;
	protected int x1 = 0;
	protected int y1 = 0;
	protected int z1 = 0;
	protected int x2 = 0;
	protected int y2 = 0;
	protected int z2 = 0;
	protected int x3 = 0;
	protected int y3 = 0;
	protected int z3 = 0;
	protected int x4 = 0;
	protected int y4 = 0;
	protected int z4 = 0;
	protected int x5 = 0;
	protected int y5 = 0;
	protected int z5 = 0;
	protected int x6 = 0;
	protected int y6 = 0;
	protected int z6 = 0;
	protected int x7 = 0;
	protected int y7 = 0;
	protected int z7 = 0;
	protected int x8 = 0;
	protected int y8 = 0;
	protected int z8 = 0;
	protected int x9 = 0;
	protected int y9 = 0;
	protected int z9 = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(6098, 30 * 1000);
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai0 >= 0 && myself.i_ai0 <= 9) {
switch (myself.i_ai0) {
case 0: {
break;

}
case 1: {
myself.AddMoveToDesire(x1, y1, z1, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 2: {
myself.AddMoveToDesire(x2, y2, z2, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 3: {
myself.AddMoveToDesire(x3, y3, z3, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 4: {
myself.AddMoveToDesire(x4, y4, z4, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 5: {
myself.AddMoveToDesire(x5, y5, z5, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 6: {
myself.AddMoveToDesire(x6, y6, z6, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 7: {
myself.AddMoveToDesire(x7, y7, z7, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 8: {
myself.AddMoveToDesire(x8, y8, z8, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 9: {
myself.AddMoveToDesire(x9, y9, z9, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;
break;

}

}

} else {
myself.AddDoNothingDesire(40, 30);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg2 == 3) {
if (script_event_arg1 == 6) {
if (script_event_arg3 != 1) {
return;

}
if (myself.i_ai0 > 0) {
return;

}
if (msg_door_break > 0) {
myself.Shout(gg.MakeFString(msg_door_break, "", "", "", "", ""));

}
myself.AddMoveToDesire(x0, y0, z0, move_desire);
myself.i_ai0 = myself.i_ai0 + 1;

} else if (script_event_arg1 == 3) {
if (myself.sm.hp > 0) {
if (msg_open_door > 0) {
myself.Shout(gg.MakeFString(msg_open_door, "", "", "", "", ""));

}
if (myself.IsNullString(DoorName) == 0) {
gg.Castle_GateOpenClose2(DoorName, 0);

}
if (myself.IsNullString(DoorName2) == 0) {
gg.Castle_GateOpenClose2(DoorName2, 0);

}
if (myself.IsNullString(DoorName3) == 0) {
gg.Castle_GateOpenClose2(DoorName3, 0);

}
if (myself.IsNullString(DoorName4) == 0) {
gg.Castle_GateOpenClose2(DoorName4, 0);

}
myself.AddTimerEx(6099, 3 * 1000);

}

}

}
super;
	}

	protected void MY_DYING() {
if (msg_dying > 0) {
myself.Shout(gg.MakeFString(msg_dying, "", "", "", "", ""));

}
myself.Fortress_ProtectedNpcDied(myself.sm.id, fortress_id);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 6099) {
myself.Despawn();

} else if (timer_id == 6098) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
myself.AddTimerEx(6098, 30 * 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Fortress_GetPledgeSiegeState(creature) != 2 || myself.IsNullCreature(creature.master) == 0 && myself.Fortress_GetPledgeSiegeState(creature.master) != 2) {
return;

}
super;
	}


}