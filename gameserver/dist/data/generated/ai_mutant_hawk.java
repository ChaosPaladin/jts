package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mutant_hawk extends default_air_monster {
	protected void CREATED() {
if (myself.sm.class_id == 1025627) {
myself.AddTimerEx(9004, 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 9004) {
if (myself.sm.max_hp * 0.100000 > myself.sm.hp) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
c0 = myself.top_desire_target;
myself.RemoveAllDesire();
myself.AddFollowDesire(c0, 5000);
myself.AddTimerEx(9005, 1000);
return;

}

}
myself.AddTimerEx(9004, 10000);
return;

}
if (timer_id == 9005) {
if (myself.IsNullCreature(myself.top_desire_target)) {
myself.AddTimerEx(9005, 2000);
return;

}
if (myself.DistFromMe(myself.top_desire_target) < 300) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, 100000);
myself.Despawn();
return;

}
myself.AddTimerEx(9005, 1000);
return;

}
super;
	}


}