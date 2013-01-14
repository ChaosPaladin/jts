package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_cratae_monster extends default_maker {
	protected void ON_START() {
myself.i_ai0 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0) {
switch (script_event_arg1) {
case 1717008: {
myself.i_ai0 = 1;
gg.SendMakerScriptEvent(myself, 1001, 0, 0);
break;

}
case 1717009: {
myself.i_ai0 = 0;
myself.AddTimerEx(3384, 15 * 1000);
break;

}

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id) {
if (timer_id == 3384) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.i_ai0 == 1) {
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}