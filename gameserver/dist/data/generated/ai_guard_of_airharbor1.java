package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_guard_of_airharbor1 extends citizen {
	protected String fnHi = "guard_of_airharbor2001.htm";
	protected String fnFignting = "guard_of_airharbor2002.htm";
	protected String SuperPointName = "gludio_airport1";
	protected int SearchType = 0;
	protected int Enemy = 1018782;

	protected void CREATED() {
myself.ChangeMoveType(0);
myself.LookNeighbor(1000);
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 2000);
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
myself.LookNeighbor(1000);
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 50);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && creature.npc_class_id == Enemy) {
myself.AddAttackDesire(creature, 1, 500000);
myself.AddTimerEx(1525001, 1000);
myself.i_ai0 = creature.id;
myself.i_ai1 = 1;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1000) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 500000);
myself.AddTimerEx(1525001, 1000);
myself.i_ai0 = c0.id;
myself.i_ai1 = 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 1525001) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.alive == 0) {
myself.RemoveAllDesire();
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 2000);
myself.i_ai1 = 0;
return;

}
myself.AddTimerEx(1525001, 5000);

}

}
	}

	protected void TALKED(HandlerParam talker) {
if (NoFnHi == 1) {
return;

}
if (myself.i_ai1) {
myself.ShowPage(talker, fnFignting);

} else {
myself.ShowPage(talker, fnHi);

}
	}


}