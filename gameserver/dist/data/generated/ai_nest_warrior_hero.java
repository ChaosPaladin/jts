package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_warrior_hero extends ai_nest_warrior_basic {
	protected String Privates1 = "";
	protected String Privates2 = "";
	protected int Buff = 458752001;
	protected int BuffDelay = 10;
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 3333;
	protected int TIMER_BUFF_DELAY = 33113;

	protected void CREATED(HandlerParam maker0) {
super;
if (myself.IsMyBossAlive()) {

} else {
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count >= 1) {
if (gg.Rand(100) < 70) {
myself.CreatePrivates(Privates1);

} else {
myself.CreatePrivates(Privates2);

}

}

}
myself.i_ai5 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) == 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

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