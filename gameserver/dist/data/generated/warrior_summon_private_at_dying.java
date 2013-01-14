package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_summon_private_at_dying extends warrior {
	protected String Privates = "orc:party_private:1:20sec";
	protected int SummonPrivateRate = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
myself.i_ai3 = gg.GetIndexFromCreature(attacker);

}

}
super;
	}

	protected void MY_DYING() {
if (gg.Rand(100) < SummonPrivateRate) {
myself.CreatePrivates(Privates);
myself.BroadcastScriptEvent(10020, myself.i_ai3, 500);
myself.AddTimerEx(5001, 1500);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 5001) {
myself.BroadcastScriptEvent(10020, myself.i_ai3, 500);
myself.AddTimerEx(5001, 1500);
super;

}
	}


}