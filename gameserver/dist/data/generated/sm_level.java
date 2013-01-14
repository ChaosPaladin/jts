package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sm_level extends default_maker {
	protected int on_start_spawn = 0;
	protected int level = 0;

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
if (deleted_def.respawn_time != 0) {
if (myself.maximum_npc >= myself.npc_count + 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}

} else if (myself.i_ai0 == 0) {

}
	}


}