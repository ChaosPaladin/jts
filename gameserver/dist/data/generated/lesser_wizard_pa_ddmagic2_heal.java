package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lesser_wizard_pa_ddmagic2_heal extends wizard_pa_ddmagic2_heal {
	protected void NO_DESIRE() {
myself.AddMoveAroundLimitedDesire(5, 5, 200);
	}


}