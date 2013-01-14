package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_cratae_lotto extends default_maker {
	protected void ON_NPC_CREATED(HandlerParam created_npc) {
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
i0 = deleted_def.respawn_rand * 2;
i1 = gg.Rand(i0) + 1;
i0 = i1 - i0 / 2;
deleted_def.Spawn2(1, deleted_def.respawn_time + i0, 0);

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}