package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_lab_random extends warrior_casting_enchant_lab_clan1 {
	protected int SelfRangePhysicalSpecial = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp < myself.sm.max_hp / 3 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp / 0.600000 && gg.Rand(100) < 25) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp / 0.900000 && gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}


}