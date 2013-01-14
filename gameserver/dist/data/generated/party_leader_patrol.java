package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_patrol extends party_leader {
	protected String WayPoints = "" ;
	protected String WayPointDelays = "" ;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 5);
	}

	protected void CREATED() {
myself.AddMoveToWayPointDesire(WayPoints, WayPointDelays, 1, 10);
super;
	}

	protected void MOVE_TO_WAY_POINT_FINISHED(HandlerParam way_point_index, HandlerParam next_way_point_index) {
myself.i_ai1 = next_way_point_index;
myself.AddTimerEx(100001, myself.GetWayPointDelay(WayPointDelays, way_point_index) * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100001) {
if (myself.i_ai1 > 0) {
myself.AddMoveToWayPointDesire(WayPoints, WayPointDelays, myself.i_ai1, 10);

} else {
myself.AddMoveToWayPointDesire(WayPoints, WayPointDelays, 1, 10);

}

}
super;
	}


}