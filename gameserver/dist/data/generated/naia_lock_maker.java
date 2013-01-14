package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class naia_lock_maker extends default_maker {
	protected void ON_START(HandlerParam def0, HandlerParam i0) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
myself.i_ai1 = 1;
myself.i_ai2 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0) {
if (script_event_arg1 == 33033) {
if (myself.i_ai1 == 0) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
myself.i_ai1 = 1;
myself.i_ai2 = 0;

}

} else if (script_event_arg1 == 78010026) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

} else if (script_event_arg1 == 78010008) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();
myself.i_ai1 = 0;

}
myself.AddTimerEx(78002, 20 * 60 * 1000);

} else if (script_event_arg1 == 78010009) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();
myself.i_ai1 = 0;

}
myself.AddTimerEx(78002, 5 * 60 * 1000);

} else if (script_event_arg1 == 78010041) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010041, script_event_arg2, script_event_arg3);

}
if (myself.i_ai2 == 0) {
myself.AddTimerEx(78001, 20 * 60 * 1000);
myself.i_ai2 = 1;

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0) {
if (timer_id == 78001) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();
myself.i_ai1 = 0;

}
myself.i_ai0 = 1;
myself.i_ai2 = 0;
myself.AddTimerEx(78002, 3 * 1000);

} else if (timer_id == 78002) {
gg.SendMakerScriptEvent(myself, 33033, 0, 0);

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam died) {
def0 = myself.GetSpawnDefine(1);
if (deleted_def == def0 && died != 0) {
gg.SendMakerScriptEvent(myself, 78010009, 0, 0);

}
	}


}