package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_warrior_buff extends ai_nest_warrior_basic {
	protected int Buff = 458752001;
	protected int BuffDelay = 10;
	protected int TIMER_BUFF_DELAY = 33113;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) == 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (victim.hp < victim.max_hp * 0.500000) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff)) == 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(victim, Buff, 1, 1, 1000000);

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_BUFF_DELAY, BuffDelay * 1000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_BUFF_DELAY) {
myself.i_ai5 = 0;

}
	}


}