package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_mingming extends citizen {
	protected void CREATED() {
myself.c_ai4 = gg.GetNullCreature();
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.c_ai4 = talker;
myself.LookNeighbor(500);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.npc_class_id == 1014836) {
if (myself.IsNullCreature(myself.c_ai4) == 0 && creature.master == myself.c_ai4) {
myself.ShowPage(myself.c_ai4, "romantic_cat_mingming002.htm");

} else {
myself.ShowPage(myself.c_ai4, "romantic_cat_mingming001.htm");

}

} else if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.ShowPage(myself.c_ai4, "romantic_cat_mingming001.htm");

}
	}


}