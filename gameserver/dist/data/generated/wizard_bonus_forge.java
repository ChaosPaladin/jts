package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_bonus_forge extends warrior_basic {
	protected int Skill01_ID = 301924353;
	protected int Skill01_Check_Dist = 0;
	protected int Skill01_Probablity = 10000;
	protected int HateClass1 = 71;
	protected double HateClass1Boost = 5.000000;
	protected double HATE_SKILL_Weight_Point = 30.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int TID_BONUS_TIME = 78001;
	protected int TID_SKILL_COOLTIME = 78002;
	protected int babble_mode = 0;

	protected void CREATED() {
gg.SetAsNull(myself.c_ai1);
myself.AddTimerEx(TID_BONUS_TIME, 60 * 1000);
myself.AddTimerEx(TID_SKILL_COOLTIME, 3 * 1000);
super;
	}

	protected void SEE_CREATURE() {
if (babble_mode == 1) {
myself.Say("보임");

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0) {
myself.c_ai1 = attacker;
if (myself.GetLifeTime() < Aggressive_Time) {
return;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0, HandlerParam skill_name_id, HandlerParam h0) {
myself.c_ai1 = attacker;
if (myself.GetLifeTime() < Aggressive_Time) {
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_BONUS_TIME) {
myself.Suicide();

} else if (timer_id == TID_SKILL_COOLTIME) {
if (myself.IsNullCreature(myself.c_ai1) == 0 && myself.GetLifeTime() >= Aggressive_Time) {
if (babble_mode == 1) {
myself.Say("스킬 대상 :" + myself.c_ai1.name);

}
myself.AddUseSkillDesire(myself.c_ai1, Skill01_ID, 0, 0, Maximum_Hate);

}
myself.AddTimerEx(TID_SKILL_COOLTIME, 3 * 1000);

}
super;
	}


}