package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lesser_patrol_watcher extends warrior_aggressive_casting_curse {
	protected String SuperPointName = "";
	protected int SuperPointMethod = 2;
	protected int SuperPointDesire = 50;
	protected int BroadCastRange = 450;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai4 = 0;
if (myself.IsNullString(SuperPointName) != 1) {
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);
myself.ChangeMoveType(0);

}
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam s0) {
if (myself.IsNullString(SuperPointName) != 1) {
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);
myself.ChangeMoveType(0);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.c_ai0 = attacker;
myself.AddTimerEx(2519011, 6 * 1000);
myself.AddTimerEx(2519012, 2 * 60 * 1000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.c_ai0 = creature;
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1800875, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800876, "", "", "", "", ""));

}
myself.AddTimerEx(2519011, 6 * 1000);
myself.AddTimerEx(2519012, 2 * 60 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2519010) {
myself.LookNeighbor(450);
myself.AddTimerEx(2519010, 30 * 1000);

}
if (timer_id == 2519011) {
if (myself.i_ai4 == 1) {
return;

}
if (myself.sm.class_id == 1022668) {
myself.Shout(gg.MakeFString(1800865, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1800861, "", "", "", "", ""));

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEvent(10016, gg.GetIndexFromCreature(myself.c_ai0), BroadCastRange);

}

}
if (timer_id == 2519012) {
myself.i_ai0 = 0;

}
	}

	protected void MY_DYING() {
myself.i_ai4 = 1;
	}


}