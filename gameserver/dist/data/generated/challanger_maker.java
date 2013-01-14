package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class challanger_maker extends default_maker {
	protected String maker6f = "gludio58_1926_600m1";
	protected String maker7f = "gludio58_1926_700m1";
	protected String maker8f = "gludio58_1926_800m1";

	protected void ON_START(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
myself.i_ai0 = 3;
myself.i_ai1 = 0;
myself.i_ai2 = 1;
for (i0 = 0; i0 <= 34; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Spawn2(1, 0, 0);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 78010034) {
if (myself.i_ai1 != 1) {
def0 = myself.GetSpawnDefine(35);
if (gg.IsNull(def0) == 0) {
def0.Spawn2(1, 0, 0);
myself.i_ai1 = 1;

}
maker0 = gg.GetNpcMaker(maker6f);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010034, 0, 0);

}
maker0 = gg.GetNpcMaker(maker8f);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010034, 0, 0);

}

}

} else if (script_event_arg1 == 78010025) {
myself.i_ai0 = myself.i_ai0 - 1;
if (myself.i_ai0 <= 0) {
myself.AddTimerEx(78001, 1 * 1000);

}

} else if (script_event_arg1 == 78010004) {
if (script_event_arg2 == 1) {
if (myself.i_ai1 != 0) {
def0 = myself.GetSpawnDefine(35);
if (gg.IsNull(def0) == 0) {
def0.Despawn();
myself.i_ai1 = 0;

}
if (script_event_arg3 == 0) {
myself.AddTimerEx(78003, 1 * 1000);

}

}

} else if (script_event_arg2 == 0) {
if (script_event_arg3 == 0) {
myself.AddTimerEx(78003, 1 * 1000);

}

}

} else if (script_event_arg1 == 78010005) {
for (i0 = 0; i0 <= 2; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, 0);

}

}
gg.SendMakerScriptEvent(myself, 78010004, 1, 1);
myself.AddTimerEx(78001, 20 * 60 * 1000);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (timer_id == 78001) {
if (myself.i_ai2 == 1) {
for (i0 = 0; i0 <= 34; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.i_ai2 = 0;
myself.AddTimerEx(78004, 1 * 60 * 1000);

} else {
myself.AddTimerEx(78001, 1 * 60 * 1000);

}

} else if (timer_id == 78002) {
if (myself.i_ai2 == 0) {
myself.i_ai0 = 3;
for (i0 = 0; i0 <= 34; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Spawn2(1, 0, 0);

}

}
myself.i_ai2 = 1;
myself.AddTimerEx(78003, 1 * 1000);

} else {
myself.AddTimerEx(78002, 1 * 60 * 1000);

}

} else if (timer_id == 78003) {
if (myself.i_ai2 == 1) {
maker0 = gg.GetNpcMaker(maker6f);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010004, 0, 0);

}
maker0 = gg.GetNpcMaker(maker8f);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010004, 0, 0);

}

}

} else if (timer_id == 78004) {
if (myself.i_ai2 == 0) {
def0 = myself.GetSpawnDefine(36);
if (gg.IsNull(def0) == 0) {
def0.Spawn2(1, 30, 0);

}

} else {
myself.AddTimerEx(78004, 1 * 60 * 1000);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam i0) {
def0 = myself.GetSpawnDefine(36);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
myself.AddTimerEx(78002, 2 * 60 * 1000);

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}