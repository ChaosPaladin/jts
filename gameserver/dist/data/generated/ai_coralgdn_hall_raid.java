package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_coralgdn_hall_raid extends wizard_use_skill {
	protected void MY_DYING() {
myself.DropItem1(myself.sm, 10017, 1);
super;
	}


}