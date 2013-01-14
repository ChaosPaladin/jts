package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class quest_0021_superpoint_move_npc extends default_npc {
	protected String SuperPointName = "test3";
	protected int SearchType = 0;

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 4) {
myself.i_quest0 = 1;
myself.AddTimerEx(2104, 1000 * 15);

}
super;
	}

	protected void CREATED() {
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 10000);
myself.AddTimerEx(3000, 1000 * 60);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
myself.SoundEffect(creature, "horror_01");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
myself.AddTimerEx(3000, 1000 * 60);
myself.LookNeighbor(300);

}
	}


}