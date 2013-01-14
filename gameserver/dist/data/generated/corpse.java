package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class corpse extends default_npc {
	protected void CREATED() {
myself.Suicide();
	}


}