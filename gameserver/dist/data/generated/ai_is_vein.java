package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_vein extends default_npc {
	protected int regen_value = 1;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 10;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(1001, 15 * 1000);
myself.BroadcastScriptEventEx(98914, 0, gg.GetIndexFromCreature(myself.sm), 3000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 1001) {
myself.BroadcastScriptEventEx(98914, 0, gg.GetIndexFromCreature(myself.sm), 3000);
myself.AddTimerEx(1001, 12 + gg.Rand(4) * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0, HandlerParam i0) {
if (script_event_arg1 == 998915) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (script_event_arg1 == 989812) {
myself.i_ai0 = 1;

} else if (script_event_arg1 == 998916) {
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.BroadcastScriptEventEx(9898903, myself.i_ai0, gg.GetIndexFromCreature(myself.sm), 3000);
	}


}