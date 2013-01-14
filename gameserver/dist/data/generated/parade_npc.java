package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class parade_npc extends default_npc {
	protected String SuperPointName = "";
	protected int SearchType = 0;
	protected int SuperPointDesire = 10000;
	protected int timerVal = 0;
	protected int timerIdx = 0;
	protected int spawnLocation = 0;
	protected int delayTime = 50;

	protected void CREATED() {
if (myself.i_ai0 == 0) {
myself.SetVisible(0);
myself.i_ai0 = 1;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10) {
if (script_event_arg2 == timerVal + delayTime * spawnLocation - 1) {
myself.SetVisible(1);
myself.RemoveAllDesire();
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, SuperPointDesire);

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam success) {
switch (spawnLocation) {
case 1: {
if (script_event_arg1 == 1) {
myself.Despawn();

}
break;

}
case 2: {
if (script_event_arg1 == 2) {
myself.Despawn();

}
break;

}
case 3: {
if (script_event_arg1 == 2) {
myself.Despawn();

}
break;

}
case 4: {
if (script_event_arg1 == 1) {
myself.Despawn();

}
break;

}
case 5: {
if (script_event_arg1 == 1) {
myself.Despawn();

}
break;

}

}
myself.i_ai0 = 0;
	}


}