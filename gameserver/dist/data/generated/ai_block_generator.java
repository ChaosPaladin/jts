package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_block_generator extends abstract_npc {
	protected int GroundID = -1;

	protected void CREATED() {
myself.AddEffectActionDesire(myself.sm, 3, 150 * 1000 / 30, 50);
myself.AddTimerEx(1000, 15 * 1000);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.Despawn();

}
	}


}