package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_mimic_magical extends azit_watering_mimic {
	protected int DDMagic = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(9) < 1) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == DDMagic && success == 1) {
myself.Despawn();

}
	}


}