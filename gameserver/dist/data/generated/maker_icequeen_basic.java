package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_icequeen_basic extends inzone_maker {
	protected int on_start_spawn = 0;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
super;
myself.enabled = 1;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam def0) {
super;
if (script_event_arg1 == 23140044) {
myself.i_ai9 = myself.i_ai9 + 1;
if (myself.i_ai9 == 5) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(23140044, 0, 0);

}

}

} else if (script_event_arg1 == 23140042) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(23140042, script_event_arg2, 0);

}

}

} else if (script_event_arg1 == 23140060) {
def0 = myself.GetSpawnDefine(gg.Rand(2));
if (gg.IsNull(def0) == 0) {
def0.Spawn2(1, 0, 0);

}

}
	}


}