package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_instant_spawn_serial extends default_maker {
	protected int loop_cnt = 0;
	protected String maker_name = "spawn_serial_default";
	protected int respawn_time = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = loop_cnt;
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (reply == 0 && myself.i_ai0 > 0) {
myself.i_ai0 = myself.i_ai0 - 1;
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, deleted_def.respawn_time, 0);

}

} else if (reply == 0 && myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, deleted_def.respawn_time, 1);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1001: {
if (script_event_arg3 == 1) {
myself.i_ai0 = loop_cnt;

}
super;
break;

}

}
	}


}