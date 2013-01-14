package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class a_seed_gathering_maker extends default_maker {
	protected int FieldCycle_ID = -1;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam def0) {
if (deleted_def.respawn_time != 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle_ID);
if (i0 == 2) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, gg.FloatToInt(deleted_def.respawn_time * 0.500000), deleted_def.respawn_rand);

}

} else if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}


}