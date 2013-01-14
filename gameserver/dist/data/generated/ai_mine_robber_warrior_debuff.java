package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_robber_warrior_debuff extends warrior_use_skill {
	protected int SelfBuff = 458752001;
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 2000;
	protected int TIMER_SKILL_RESET = 33112;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (myself.sm.hp < myself.sm.max_hp * 0.600000) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff));
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_SKILL_RESET, 10 * 60 * 1000);

}

}
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == TIMER_SKILL_RESET) {
myself.i_ai5 = 0;
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
super;
if (skill_id == 6145 && skill_level == 0) {
if (myself.p_state != 3) {
if (debug_mode) {
myself.Say("전투중이 아닐 때 어스웜의 마기가 해제되었음. 재버프");

}
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}

}

}
	}


}