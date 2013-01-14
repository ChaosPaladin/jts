package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_tran_decide_action extends ai_boss08_follower_of_frintessa_tran_set_db {
	protected void CREATED(HandlerParam reply) {
super;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = myself.GetCurrentTick();
if (myself.i_ai0 == 7) {
myself.AddTimerEx(3000, 60 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam plist0, HandlerParam pos0, HandlerParam i2, HandlerParam c0) {
myself.i_quest1 = myself.GetCurrentTick();
if (myself.sm.hp < myself.sm.max_hp * 0.750000) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 30021);

}
myself.i_ai4 = 30021;

} else if (myself.sm.hp < myself.sm.max_hp * 0.500000) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 30022);

}
myself.i_ai4 = 30022;

} else if (myself.sm.hp < myself.sm.max_hp * 0.250000) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 30023);

}
myself.i_ai4 = 30023;

} else {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 30024);

}
myself.i_ai4 = 30024;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
super;
if (timer_id == 3000) {
if (myself.i_ai0 == 7) {
myself.LookNeighbor(2000);
myself.AddTimerEx(3000, 60 * 1000);

}

}
	}

	protected void NO_DESIRE(HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam i3, HandlerParam c3) {
if (myself.i_ai4 == 1) {

} else {
myself.LookNeighbor(2000);

}
super;
	}


}