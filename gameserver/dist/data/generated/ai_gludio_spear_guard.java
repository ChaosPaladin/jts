package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_spear_guard extends ai_gludio_hold {
	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 16121857) {
myself.AddAttackDesire(speller, 1, 50000);

}
	}


}