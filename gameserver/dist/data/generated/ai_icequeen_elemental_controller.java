package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_elemental_controller extends default_npc {
	protected int debug_mode = 0;
	protected int TIMER_release_lock = 2314025;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam pos0) {
if (script_event_arg1 == 23140012) {
if (debug_mode) {
myself.Say("elemental controller : 스폰 신호 받음.");

}
if (myself.i_ai0 == 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
pos0 = gg.GetRandomPosInCreature(c0, 20, 50);
if (myself.IsNullCreature(c0) == 0) {
myself.CreateOnePrivateEx(1018854, "ai_icequeen_elemental", 0, 0, gg.FloatToInt(pos0.x), gg.FloatToInt(pos0.y), gg.FloatToInt(pos0.z), 0, script_event_arg3, 0, 0);

}

} else if (myself.i_ai0 == 1) {
if (debug_mode) {
myself.Say("스폰 중지 lock 상태이므로 숨결 스폰 안함.");

}

}

} else if (script_event_arg1 == 23140020) {
myself.i_ai0 = 1;
myself.AddTimerEx(TIMER_release_lock, 30 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_release_lock) {
myself.i_ai0 = 0;

}
	}


}