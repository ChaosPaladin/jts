package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_sanctuary_priest extends warrior_basic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 154533889 && myself.sm.hp < myself.sm.max_hp * 0.020000) {
myself.Suicide();

}
super;
	}

	protected void MY_DYING() {
super;
	}


}