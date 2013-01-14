package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_q_grima extends warrior_use_skill {
	protected int TIMER_attack_me = 2314002;
	protected int IsAggressive = 1;
	protected int is_invader = -1;
	protected int debug_mode = 0;
	protected int party_member_num = 5;

	protected void CREATED() {
myself.i_ai0 = 0;
if (is_invader == 1) {
myself.AddTimerEx(TIMER_attack_me, 10 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_attack_me) {
if (debug_mode) {
myself.Say("10초마다 날 때려줘");

}
myself.BroadcastScriptEvent(2117001, gg.GetIndexFromCreature(myself.sm), 1500);
myself.AddTimerEx(TIMER_attack_me, 10 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddAttackDesire(attacker, 1, damage * 2);
if (attacker.is_pc == 1) {
myself.BroadcastScriptEvent(23140100, gg.GetIndexFromCreature(myself.sm), 3500);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 23141001) {
if (gg.GetCreatureFromIndex(script_event_arg2) != myself.sm) {
myself.i_ai0 = myself.i_ai0 + 1;

}

} else if (script_event_arg1 == 2117001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.npc_class_id != myself.sm.npc_class_id) {
myself.AddAttackDesire(c0, 1, 1000);

}

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (is_invader == 1) {
if (myself.i_ai0 == party_member_num - 1) {
if (debug_mode) {
myself.Say("MY_DYING : ALL_GRIMA_DIED");

}
myself.BroadcastScriptEvent(23141002, 0, 3500);

} else {
if (debug_mode) {
myself.Say("MY_DYING : " + myself.i_ai0 + " GRIMA_DIED. ");

}
myself.BroadcastScriptEvent(23141001, gg.GetIndexFromCreature(myself.sm), 3500);

}

}
	}


}