package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class auto_door_trap extends default_trap {
	protected String DoorName = "auto_door_trap_default";
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int IsItemCheck = 0;
	protected int DoorItem = 0;
	protected int DoorCloseTime = 0;

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
c0 = gg.GetCreatureFromID(i0);
if (IsItemCheck == 1) {
if (gg.OwnItemCount(c0, DoorItem) >= 1) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 0, i2);
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (DoorCloseTime > 0) {
myself.AddTimerEx(2001, DoorCloseTime * 1000);

}
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}

}

} else {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 0, i2);
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
if (DoorCloseTime > 0) {
myself.AddTimerEx(2001, DoorCloseTime * 1000);

}
if (timer > 0) {
myself.AddTimerEx(1001, timer * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i2) {
if (timer_id == 2001) {
i2 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(DoorName, 1, i2);

}
super;
	}


}