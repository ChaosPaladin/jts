package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_no_start_spawn extends inzone_maker {
	protected int on_start_spawn = 0;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
super;
myself.enabled = 1;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
	}


}