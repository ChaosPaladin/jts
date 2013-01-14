package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warning_teller extends default_npc {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.is_pc == 1 && creature.level <= 37) {
myself.Say(gg.MakeFString(1000513, creature.name, "", "", "", ""));

}
	}


}