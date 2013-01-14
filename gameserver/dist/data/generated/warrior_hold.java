package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_hold extends warrior {
	protected double DoNothing_DecayRatio = 1.000000;

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.AddDoNothingDesire(40, 30);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);

}
	}


}