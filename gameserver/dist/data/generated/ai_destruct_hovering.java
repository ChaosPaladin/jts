package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_hovering extends ai_destruct_warrior_dd_self {
	protected void CREATED() {
myself.AddMoveAroundDesire(1000, 1000);
myself.i_ai1 = 0;
super;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(1000, 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai1 == 0) {
myself.RemoveAllDesire();
myself.AddAttackDesire(attacker, 1, 2000);
myself.i_ai1 = 1;

}
super;
	}


}