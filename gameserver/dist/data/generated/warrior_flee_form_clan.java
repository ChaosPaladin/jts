package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_flee_form_clan extends warrior_physicalspecial {
	protected int Distance = 250;

	protected void CLAN_DIED(HandlerParam victim, HandlerParam i0) {
myself.AddFleeDesireEx(victim, Distance, 10000);
super;
	}


}