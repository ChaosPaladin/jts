package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_help_pc extends default_npc {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 2500;
	protected int Buff = 458752001;
	protected int Dash = 458752001;
	protected int TIMER_buff = 2314017;
	protected int TIMER_dash = 2314019;
	protected int TIMER_call_npc = 2314020;
	protected int TIMER_heal = 2314022;
	protected int PosX = -1;
	protected int PosY = -1;
	protected int PosZ = -1;
	protected int position = -1;
	protected int debug_mode = 0;

	protected void CREATED() {
if (position != 2) {
if (Dash != 458752001) {
myself.AddTimerEx(TIMER_dash, 1000);

}
myself.AddTimerEx(TIMER_buff, 1000);
myself.AddTimerEx(TIMER_heal, 2000);
myself.AddTimerEx(TIMER_call_npc, 2000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 23140020) {
myself.Despawn();

} else if (script_event_arg1 == 23140052) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);
if (script_event_arg3 == 2314) {
myself.AddAttackDesire(c0, 1, 500);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TIMER_buff) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 0, 10000000);
myself.AddTimerEx(TIMER_buff, 25 * 1000);

} else if (timer_id == TIMER_dash) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) > 200) {
myself.AddUseSkillDesire(myself.top_desire_target, Dash, 0, 1, 1000000000);

}

}
myself.AddTimerEx(TIMER_dash, 10 * 1000);

} else if (timer_id == TIMER_call_npc) {
myself.BroadcastScriptEvent(23140051, gg.GetIndexFromCreature(myself.sm), 1500);
myself.AddTimerEx(TIMER_call_npc, 10 * 1000);

} else if (timer_id == TIMER_heal) {
i0 = gg.FloatToInt(myself.sm.max_hp * 0.250000) + gg.FloatToInt(myself.sm.hp);
if (i0 > gg.FloatToInt(myself.sm.max_hp)) {
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp);

} else {
gg.SetNpcParam(myself.sm, 9, i0);

}
myself.AddTimerEx(TIMER_heal, 5 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0 && myself.IsInCategory(123, attacker.npc_class_id) == 0) {
myself.AddAttackDesire(attacker, 1, damage);
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (gg.Rand(2) == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}
	}


}