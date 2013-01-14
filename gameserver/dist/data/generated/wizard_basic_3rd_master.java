package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_basic_3rd_master extends wizard_basic {
	protected void CREATED(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("gludio58_1926_trap03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0) {
if (myself.i_ai0 == 0) {
myself.c_ai0 = attacker;
myself.BroadcastScriptEvent(19261000, gg.GetIndexFromCreature(attacker), 10000);
myself.i_ai0 = 1;
myself.AddTimerEx(25000, 60 * 1000);
myself.AddTimerEx(1816, 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1816) {
if (myself.IsNullCreature(myself.c_ai0)) {
myself.i_ai0 = 0;

}
myself.AddTimerEx(1816, 1000);

}
if (timer_id == 25000) {
myself.i_ai0 = 0;

}
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("gludio58_1926_trap03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.BroadcastScriptEvent(19261002, 0, 10000);
super;
	}


}