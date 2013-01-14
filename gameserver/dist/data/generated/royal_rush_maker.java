package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_maker extends default_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.AddTimerEx(3000, 1000);
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam i0) {
i0 = gg.GetDateTime(0, 4);
if (i0 > 49 && i0 < 60) {
created_npc.Despawn();

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
i0 = gg.GetDateTime(0, 4);
if (deleted_def.respawn_time == 0 || i0 > 49 && i0 < 59) {

} else {
super;

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 3000) {
i0 = gg.GetDateTime(0, 4);
i1 = gg.GetDateTime(0, 5);
if (i0 == 54 && i1 == 0) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}
if (i0 == 54 && i1 == 1) {
if (myself.npc_count > 0) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}

}
if (i0 == 54 && i1 == 2) {
if (myself.npc_count > 0) {
gg.SendMakerScriptEvent(myself, 1000, 0, 0);

}

}
myself.AddTimerEx(3000, 1000);

}
	}


}