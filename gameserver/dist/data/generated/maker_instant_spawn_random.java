package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_instant_spawn_random extends default_maker {
	protected String maker_name1 = "spawn_random_default1";
	protected String maker_name2 = "spawn_random_default2";
	protected String maker_name3 = "spawn_random_default3";
	protected int maker_cnt = 1;
	protected int respawn_time = 0;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (reply == 0) {
i1 = gg.Rand(maker_cnt);
if (i1 == 0) {
maker0 = gg.GetNpcMaker(maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, deleted_def.respawn_time, 0);

}

} else if (i1 == 1) {
maker0 = gg.GetNpcMaker(maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, deleted_def.respawn_time, 0);

}

} else if (i1 == 2) {
maker0 = gg.GetNpcMaker(maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, deleted_def.respawn_time, 0);

}

}

}
	}


}