package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_epic_warrior_lilim extends warrior_basic {
	protected String door_name = "";
	protected int inzone_id1 = -1;

	protected void MY_DYING() {
if (inzone_id1 == -1) {

} else {
gg.Castle_GateOpenCloseEx(door_name, 0, myself.InstantZone_GetId());

}
	}


}