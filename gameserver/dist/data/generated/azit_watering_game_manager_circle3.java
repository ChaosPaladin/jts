package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_game_manager_circle3 extends azit_watering_game_manager {
	protected int NumberOfCircle = 3;
	protected String AreaData_DeBuff = "rainbow_slow_3";

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
if (creature.is_pc == 0 && myself.i_ai3 == 0) {
myself.i_ai3 = gg.GetIndexFromCreature(creature);
myself.BroadcastScriptEvent(10004, myself.i_ai3, 8000);

}
super;
	}


}