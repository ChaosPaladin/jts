package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zaken_day_maker extends inzone_maker {
	protected int script_event_enable = 1;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 2124002) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 > 3) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2124001, 0, 0);

}

}

}

}
if (script_event_arg1 == 2124003) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 > 3) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2124006, 0, 0);

}

}

}

}
if (script_event_arg1 == 2124004) {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_ai2 > 3) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2124007, 0, 0);

}

}

}

}
if (script_event_arg1 == 2124005) {
myself.i_ai3 = myself.i_ai3 + 1;
if (myself.i_ai3 > 3) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2124008, 0, 0);

}

}

}

}
	}


}