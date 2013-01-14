package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cratae_controller extends default_npc {
	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
myself.IsUserPVPMatching(creature);

}
super;
	}

	protected void IS_USER_PVPMATCHING_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (reply == 0) {
c0 = gg.GetCreatureFromID(i0);
myself.InstantTeleport(c0, -70411, -70958, -1416);

}
	}


}