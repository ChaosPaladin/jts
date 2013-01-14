package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss06_teleporter extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "dimension_vertex_4001.htm");
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam c1, HandlerParam i2) {
i0 = myself.GetGlobalMap(2);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0 && c0.alive) {
if (c0.db_value == 0) {
if (gg.OwnItemCount(talker, 4295) > 0) {
myself.DeleteItem1(talker, 4295, 1);
i1 = 114077;
i2 = 15882;
myself.InstantTeleport(talker, i1, i2, 10078);

} else {
myself.ShowPage(talker, "dimension_vertex_4002.htm");

}

} else {
myself.ShowPage(talker, "dimension_vertex_4003.htm");

}

} else {
myself.ShowPage(talker, "dimension_vertex_4004.htm");

}

} else {
myself.ShowPage(talker, "dimension_vertex_4004.htm");

}
	}


}