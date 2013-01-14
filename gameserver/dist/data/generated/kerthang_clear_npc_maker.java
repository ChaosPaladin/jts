package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kerthang_clear_npc_maker extends default_maker {
	protected void ON_START() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
if (script_event_arg1 == 13100) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(13101, 1, 0);

}

}
super;
	}


}