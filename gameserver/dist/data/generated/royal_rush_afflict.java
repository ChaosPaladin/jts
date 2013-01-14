package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_afflict extends royal_rush_default_npc {
	protected int afflict_skill1 = 264241153;
	protected int afflict_skill2 = 264241153;
	protected int afflict_skill3 = 264241153;

	protected void CREATED(HandlerParam i0) {
i0 = gg.Rand(3);
switch (i0) {
case 0: {
myself.i_ai0 = 0;
myself.AddTimerEx(3001, 5000);
break;

}
case 1: {
myself.i_ai0 = 1;
myself.AddTimerEx(3002, 5000);
break;

}
case 2: {
myself.i_ai0 = 2;
myself.AddTimerEx(3002, 5000);
break;

}

}
myself.LookNeighbor(300);
super;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && gg.Rand(100) < 50) {
myself.AddFollowDesire(creature, 100);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddFleeDesire(attacker, 100);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
if (myself.Skill_GetConsumeMP(afflict_skill1) < myself.sm.mp && myself.Skill_GetConsumeHP(afflict_skill1) < myself.sm.hp && myself.Skill_InReuseDelay(afflict_skill1) == 0) {
myself.AddUseSkillDesire(myself.sm, afflict_skill1, 0, 1, 1000000);

}

}
if (timer_id == 3002) {
if (myself.i_ai0 == 1) {
if (myself.Skill_GetConsumeMP(afflict_skill2) < myself.sm.mp && myself.Skill_GetConsumeHP(afflict_skill2) < myself.sm.hp && myself.Skill_InReuseDelay(afflict_skill2) == 0) {
myself.AddUseSkillDesire(myself.sm, afflict_skill2, 0, 1, 1000000);

}

} else if (myself.i_ai0 == 2) {
if (myself.Skill_GetConsumeMP(afflict_skill3) < myself.sm.mp && myself.Skill_GetConsumeHP(afflict_skill3) < myself.sm.hp && myself.Skill_InReuseDelay(afflict_skill3) == 0) {
myself.AddUseSkillDesire(myself.sm, afflict_skill3, 0, 1, 1000000);

}

}
myself.AddTimerEx(3003, 5000);

}
if (timer_id == 3003) {
myself.LookNeighbor(300);

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam skill_name_id) {
switch (myself.i_ai0) {
case 0: {
myself.Despawn();
break;

}
case 1: {
if (myself.Skill_GetConsumeMP(afflict_skill2) < myself.sm.mp && myself.Skill_GetConsumeHP(afflict_skill2) < myself.sm.hp && myself.Skill_InReuseDelay(afflict_skill2) == 0) {
myself.AddUseSkillDesire(myself.sm, afflict_skill2, 0, 1, 1000000);

}
break;

}
case 2: {
if (myself.Skill_GetConsumeMP(afflict_skill3) < myself.sm.mp && myself.Skill_GetConsumeHP(afflict_skill3) < myself.sm.hp && myself.Skill_InReuseDelay(afflict_skill3) == 0) {
myself.AddUseSkillDesire(myself.sm, afflict_skill3, 0, 1, 1000000);

}
break;

}

}
	}


}