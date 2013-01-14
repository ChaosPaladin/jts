package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_coralgdn_hall_treasure extends default_npc {
	protected void ATTACKED(HandlerParam damage, HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 157286401) {
myself.Suicide();

}
	}


}