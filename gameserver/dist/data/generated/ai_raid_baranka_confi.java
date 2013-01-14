package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_raid_baranka_confi extends warrior_use_skill {
	protected int SelfRangeBuff = 264110082;
	protected int TIMER_SKILL_RESET = 33112;

	protected void CREATED() {
super;
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_SKILL_RESET, 5 * 60 * 1000);
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == TIMER_SKILL_RESET) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_SKILL_RESET, 5 * 60 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 2214005 || script_event_arg1 == 2214007) {
myself.Despawn();

} else if (script_event_arg1 == 2214008) {
if (myself.IsMyBossAlive()) {
if (myself.boss == gg.GetCreatureFromIndex(script_event_arg2)) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(script_event_arg3), 500, 0);

}

}

}
	}


}