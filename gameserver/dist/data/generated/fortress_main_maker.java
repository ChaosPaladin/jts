package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_main_maker extends default_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam def0) {
if (script_event_arg1 == 10025) {
def0 = myself.GetSpawnDefine(0);
def0.SendScriptEvent(1006, 0, 0);

}
	}


}