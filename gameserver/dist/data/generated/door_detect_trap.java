package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class door_detect_trap extends default_trap {
	protected int show_created = 1;
	protected int show_detected = 0;
	protected int show_activated = 0;
	protected int show_step_in = 0;
	protected int show_step_out = 0;
	protected int show_defused = 1;
	protected String DoorName = "door_detect_trap_default";
	protected int DoorCloseTime = 0;

	protected void TRAP_DEFUSED(HandlerParam i0) {
if (IsDefused == 1) {
myself.SetWorldTrapVisibleByClassId(myself.sm.class_id, show_detected);
gg.Castle_GateOpenClose2(DoorName, 0);
myself.AddTimerEx(1002, DoorCloseTime * 1000);

}
myself.AddTimerEx(1001, timer * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1002) {
gg.Castle_GateOpenClose2(DoorName, 1);

}
super;
	}


}