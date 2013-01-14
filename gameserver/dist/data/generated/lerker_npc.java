package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lerker_npc extends default_npc {
	protected void CREATED() {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam party0) {
if (timer_id == 1001) {
myself.AddUseSkillDesire(myself.sm, 355467272, 1, 1, 1000000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12524) {
myself.AddTimerEx(1001, myself.i_ai0 * 300);

}
if (script_event_arg1 == 12525) {
myself.AddTimerEx(1001, 3500 - myself.i_ai0 * 300);

}
if (script_event_arg1 == 12526) {
myself.AddTimerEx(1001, myself.i_ai0 * 300);

}
if (script_event_arg1 == 12527) {
myself.AddTimerEx(1001, 3500 - myself.i_ai0 * 300);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 355467272) {
myself.Despawn();

}
	}


}