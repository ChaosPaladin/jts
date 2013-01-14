package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_lab_run extends warrior_casting_enchant_lab_clan2 {
	protected int PhysicalSpecial = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp < myself.sm.max_hp / 0.400000) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
if (myself.InMyTerritory(myself.sm) == 0) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);

}

}
super;
	}


}