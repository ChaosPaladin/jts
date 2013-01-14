package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_shot_range_debuff extends warrior_physicalspecial_shot_range {
	protected int DeBuff1 = 458752001;
	protected int DeBuff2 = 458752001;
	protected int DeBuff3 = 458752001;
	protected int DeBuff4 = 458752001;
	protected int DeBuff5 = 458752001;
	protected int LongRangePhysicalSpecial = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp < myself.sm.max_hp / 3 && gg.Rand(100) < 60) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp / 3) {
if (gg.Rand(100) < 50) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff2, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(DeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff3) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff3, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(DeBuff4) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff4) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff4) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff4, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(DeBuff5) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff5) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff5) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff5, 1, 1, 1000000);

}

}
super;
	}


}