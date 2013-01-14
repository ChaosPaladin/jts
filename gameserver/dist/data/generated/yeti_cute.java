package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class yeti_cute extends parade_npc {
	protected void CREATED() {
myself.SetVisible(0);
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10) {
if (script_event_arg2 == timerVal + delayTime * spawnLocation - 1) {
myself.SetVisible(1);
myself.AddTimerEx(1000, 10);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
switch (spawnLocation) {
case 1: {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -58832, -2037, 2000);

}
if (myself.i_ai0 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -58832, -2037, 2000);

}
if (myself.i_ai0 == 2) {
myself.AddMoveToDesire(-AddMoveToDesire, -58832, -2037, 2000);

}
break;

}
case 2: {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -57003, -2008, 2000);

}
if (myself.i_ai0 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -56102, -2008, 2000);

}
if (myself.i_ai0 == 2) {
myself.AddMoveToDesire(-AddMoveToDesire, -53930, -2104, 2000);

}
break;

}
case 3: {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -53074, -2072, 2000);

}
if (myself.i_ai0 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -53074, -2040, 2000);

}
if (myself.i_ai0 == 2) {
myself.AddMoveToDesire(-AddMoveToDesire, -53068, -2008, 2000);

}
break;

}
case 4: {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -54124, -2037, 2000);

}
if (myself.i_ai0 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -54710, -2037, 2000);

}
if (myself.i_ai0 == 2) {
myself.AddMoveToDesire(-AddMoveToDesire, -55483, -2037, 2000);

}
break;

}
case 5: {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -57139, -2037, 2000);

}
if (myself.i_ai0 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -57538, -2037, 2000);

}
if (myself.i_ai0 == 2) {
myself.AddMoveToDesire(-AddMoveToDesire, -57983, -2037, 2000);

}
break;

}

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddEffectActionDesire(myself.sm, 1, 106 * 1000 / 30, 3000);
myself.AddTimerEx(1000, 5 * 1000);
if (myself.i_ai0 == 3) {
myself.Despawn();

}
	}


}