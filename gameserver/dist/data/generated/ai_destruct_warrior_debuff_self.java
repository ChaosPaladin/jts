package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_warrior_debuff_self extends ai_destruct_warrior {
	protected int SelfRangeDebuff_ID = 458752001;
	protected int SelfRangeDebuff_Prob = 0;

	protected void CREATED() {
super;
myself.AddTimerEx(1001, 10 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.DistFromMe(myself.boss) >= 6000) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));

}
myself.AddTimerEx(1001, 10 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (SelfRangeDebuff_ID != 458752001) {
if (gg.Rand(10000) < SelfRangeDebuff_Prob) {
if (myself.Skill_GetConsumeMP(SelfRangeDebuff_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDebuff_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDebuff_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_ID, 0, 1, 1000000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
super;
if (script_event_arg1 == 1224021) {
i0 = myself.MPCC_GetMPCCId(myself.top_desire_target);
c0 = myself.MPCC_GetMaster(i0);
myself.AddAttackDesire(c0, 1, 100000);

}
	}

	protected void NO_DESIRE() {
if (myself.IsNullCreature(myself.boss) == 0) {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

}

}
	}


}