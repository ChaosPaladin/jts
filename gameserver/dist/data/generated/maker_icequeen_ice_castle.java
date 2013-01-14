package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_icequeen_ice_castle extends inzone_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0) {
super;
if (script_event_arg1 == 23140015) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(23140015, 0, 0);

}

} else if (script_event_arg1 == 23140040) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(23140040, 0, 0);

}

}
	}


}