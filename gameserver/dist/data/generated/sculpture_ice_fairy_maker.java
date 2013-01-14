package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sculpture_ice_fairy_maker extends default_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 10005) {
myself.i_ai0 = myself.i_ai0 + 1;
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(10001, myself.i_ai0, 0);

} else if (script_event_arg1 == 10025) {
myself.i_ai0 = 0;
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(10001, myself.i_ai0, 0);

}
	}


}