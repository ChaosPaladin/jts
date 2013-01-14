package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sw_socialer extends show_npc {
	protected int SocicalShowState = 0;

	protected void CREATED() {
myself.AddTimerEx(8000, 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 11 && script_event_arg2 == 13) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8000) {
if (SocicalShowState == 1) {
myself.AddEffectActionDesire(myself.sm, 1, 106 * 1000 / 30, 50);
myself.BroadcastScriptEvent(11, 7, 2000);

}
if (SocicalShowState == 2) {
myself.AddEffectActionDesire(myself.sm, 1, 106 * 1000 / 30, 50);
myself.BroadcastScriptEvent(11, 9, 2000);

}
if (SocicalShowState == 3) {
myself.AddEffectActionDesire(myself.sm, 1, 106 * 1000 / 30, 50);
myself.BroadcastScriptEvent(11, 11, 2000);

}

}
	}


}