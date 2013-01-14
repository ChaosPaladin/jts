package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_labyrinth_b extends warrior_use_skill {
	protected void CREATED() {
myself.AddTimerEx(8255, 3 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8255) {
if (myself.start_z - gg.FloatToInt(myself.sm.z) > 500 || myself.start_z - gg.FloatToInt(myself.sm.z) < -500) {
myself.RemoveAllAttackDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(8255, 3000);

}
super;
	}


}