package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class b_time_clear_npc4_maker extends inzone_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
if (script_event_arg1 == 12560) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12561, script_event_arg2, script_event_arg3);

}

}
super;
	}


}