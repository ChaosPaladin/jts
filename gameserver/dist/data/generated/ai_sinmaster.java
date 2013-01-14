package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_sinmaster extends warrior_basic {
	protected int mode = 0;
	protected int time_interval = 3600;
	protected int Skill01_Probablity = 0;
	protected int Skill02_Probablity = 0;

	protected void CREATED() {
myself.i_ai0 = 7;
myself.i_ai1 = 1;
myself.i_ai2 = 1;
myself.AddTimerEx(78001, time_interval * 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 78010006) {
myself.i_ai1 = 0;

} else if (script_event_arg1 == 78010007) {
myself.i_ai2 = 0;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
if (myself.i_ai1 != 1) {
myself.i_ai1 = 1;

}
if (myself.i_ai2 != 1) {
myself.i_ai2 = 1;

}
myself.AddTimerEx(78001, time_interval * 1000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (mode == 0) {
i0 = gg.Rand(15000);

} else {
i0 = gg.Rand(10000);

}
if (i0 <= 150) {
if (myself.i_ai2 != 1 && i0 <= 50) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, myself.i_ai0 * 1000000);

} else if (myself.i_ai1 != 1) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, myself.i_ai0 * 1000000);

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai0 = myself.i_ai0 - 1;
if (myself.i_ai0 <= 2) {
myself.Say(gg.MakeFString(1800112, "", "", "", "", ""));
myself.Despawn();

}

}
	}


}