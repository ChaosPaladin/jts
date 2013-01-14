package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_shot_range extends warrior {
	protected int LongRangePhysicalSpecial = 458752001;
	protected int PhysicalSpecial = 458752001;
	protected int SelfRangePhysicalSpecial = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.i_ai3 = gg.GetIndexFromCreature(attacker);
if (myself.DistFromMe(attacker) > 200) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 1002) {
c0 = gg.GetCreatureFromIndex(myself.i_ai3);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) > 200) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(c0, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}

} else {
myself.i_ai3 = 0;

}
myself.AddTimerEx(1002, 5000);

}
	}


}