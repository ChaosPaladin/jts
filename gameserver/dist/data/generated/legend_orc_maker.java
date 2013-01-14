package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class legend_orc_maker extends default_maker {
	protected String vice_maker_name = "default_maker_default";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 2114001) {
maker0 = gg.GetNpcMaker(vice_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}