package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_robber_berserker extends warrior_use_skill {
	protected int SelfBuff1 = 458752001;
	protected int SelfBuff2 = 458752001;
	protected int TIMER_SKILL_RESET = 33112;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 10000000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (myself.sm.hp < myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff2, 1, 1, 1000000);

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_SKILL_RESET, 10 * 60 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == TIMER_SKILL_RESET) {
myself.i_ai5 = 0;

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
super;
if (skill_id == 6145 && skill_level == 0) {
if (myself.p_state != 3) {
if (debug_mode) {
myself.Say("전투중이 아닐 때 어스웜의 마기가 해제되었음. 재버프");

}
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 1, 1, 10000000);

}

}

}
	}


}