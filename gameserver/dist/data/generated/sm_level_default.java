package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sm_level_default extends sm_level {
	protected String next_maker_name = "level_switch";
	protected int on_start_spawn = 1;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 1;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 21140013) {
myself.i_ai0 = 0;

}
if (script_event_arg1 == 21140012) {
myself.i_ai0 = 1;

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(next_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (myself.i_ai0 == 0) {

}
super;
	}


}