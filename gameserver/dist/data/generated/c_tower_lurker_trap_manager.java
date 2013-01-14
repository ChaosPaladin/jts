package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_lurker_trap_manager extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(9909, 13000);
myself.i_ai0 = 0;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 9909 && myself.i_ai0 == 0) {
myself.i_ai1 = 10001;
myself.i_ai2 = 10005;
myself.i_ai0 = 1;

} else if (timer_id == 9909 && myself.i_ai0 == 1) {
myself.i_ai1 = 10002;
myself.i_ai2 = 10006;
myself.i_ai0 = 2;

} else if (timer_id == 9909 && myself.i_ai0 == 2) {
myself.i_ai1 = 10003;
myself.i_ai2 = 10007;
myself.i_ai0 = 3;

} else if (timer_id == 9909 && myself.i_ai0 == 3) {
myself.i_ai1 = 10004;
myself.i_ai2 = 10008;
myself.i_ai0 = 0;

}
myself.BroadcastScriptEvent(88011, myself.i_ai1, 900);
myself.BroadcastScriptEvent(88011, myself.i_ai2, 900);
myself.AddTimerEx(9909, 20000);
	}


}