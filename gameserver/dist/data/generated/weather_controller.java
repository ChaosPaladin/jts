package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class weather_controller extends citizen {
	protected int buff1 = 458752001;
	protected int buff2 = 458752001;

	protected void SEE_CREATURE(HandlerParam creature) {
if (gg.HaveMemo(creature, 120) == 1) {
if (myself.Skill_GetConsumeMP(buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(buff1) < myself.sm.hp && myself.Skill_InReuseDelay(buff1) == 0) {
myself.AddUseSkillDesire(creature, buff1, 0, 0, 1000000);

}
if (myself.Skill_GetConsumeMP(buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(buff2) < myself.sm.hp && myself.Skill_InReuseDelay(buff2) == 0) {
myself.AddUseSkillDesire(creature, buff2, 0, 0, 1000000);

}

}
	}


}