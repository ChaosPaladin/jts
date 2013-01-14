package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_strong extends warrior_physicalspecial {
	protected int PhysicalSpecial = 458752001;
	protected int SelfRangePhysicalSpecial = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.sm.hp < myself.sm.max_hp / 2) {
if (myself.IsNullParty(party0) == 1 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

} else if (myself.IsNullParty(party0) != 1 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}


}