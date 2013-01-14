package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_tree_use_skill extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(5001, 1000 * 60 * 20);
if (myself.sm.in_peacezone == 0) {
myself.AddTimerEx(5002, 1000 * 10);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.Despawn();

} else if (timer_id == 5002) {
if (myself.Skill_GetConsumeMP(140181505) < myself.sm.mp && myself.Skill_GetConsumeHP(140181505) < myself.sm.hp && myself.Skill_InReuseDelay(140181505) == 0) {
myself.AddUseSkillDesire(myself.sm, 140181505, 1, 1, 1000000);

}
myself.AddTimerEx(5002, 10000);

}
super;
	}


}