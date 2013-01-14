package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_healer extends ai_destruct_wizard_selfrange_buff {
	protected int Debuff = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
myself.i_ai1 = myself.i_ai1 + 1;
i0 = gg.Rand(100);
if (i0 < 10) {
if (myself.Skill_GetConsumeMP(Debuff) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff) == 0) {
myself.AddUseSkillDesire(attacker, Debuff, 0, 1, 1000000);

}

}
	}

	protected void SEE_CREATURE() {
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam i0) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 >= 80) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, 1000000);

}
myself.i_ai1 = 0;

}
if (victim.hp < victim.max_hp * 0.700000) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 1, 1000000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
super;
if (script_event_arg1 == 1224003 && my_role_flag == 3) {
if (myself.i_ai3 == 0) {
myself.i_ai3 = 1;
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.AddTimerEx(2471, 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
super;
if (timer_id == 2471) {
i0 = gg.Rand(300) - 150;
i1 = gg.Rand(300) - 150;
myself.AddMoveToDesire(gg.FloatToInt(myself.c_ai0.x) + i0, gg.FloatToInt(myself.c_ai0.y) + i1, gg.FloatToInt(myself.c_ai0.z), 100);
myself.AddTimerEx(2472, 10 * 1000);

} else if (timer_id == 2472) {
myself.i_ai3 = 0;

}
	}


}