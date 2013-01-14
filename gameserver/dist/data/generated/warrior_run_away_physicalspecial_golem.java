package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_run_away_physicalspecial_golem extends warrior {
	protected int PhysicalSpecial = 458752001;
	protected int LongRangePhysicalSpecial = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.c_ai1 = attacker;
if (myself.i_ai1 == 0 && myself.DistFromMe(attacker) < 100) {
myself.i_ai1 = 1;
myself.AddTimerEx(1003, 2000);

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 200) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1002) {
if (myself.IsNullCreature(myself.c_ai1) == 0 && myself.DistFromMe(myself.c_ai1) > 200) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
myself.AddTimerEx(1002, 5000);

}
if (timer_id == 1003) {
myself.AddFleeDesire(myself.c_ai1, 1000);
myself.i_ai1 = 0;

}
	}


}