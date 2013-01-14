package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_corpse extends default_npc {
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam maker0) {
if (babble_mode == 1) {
myself.Say("자살!");

}
myself.Suicide();
	}


}