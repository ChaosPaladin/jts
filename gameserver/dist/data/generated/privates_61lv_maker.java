package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class privates_61lv_maker extends inzone_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 10025) {
for (i1 = 0; i1 < myself.def_count; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.enabled = 0;

}
super;
	}


}