package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit01_bloody_lord_nurka2 extends ai_agit01_bloody_lord_nurka1 {
	protected String Privates = "orc:party_private:1:20sec";
	protected int b02_x1 = 45802;
	protected int b02_y1 = 109981;
	protected int b02_z1 = -1970;
	protected int b02_x2 = 44525;
	protected int b02_y2 = 108867;
	protected int b02_z2 = -2020;

	protected void CREATED() {
myself.InstantTeleportInMyTerritory(51952, 111060, -1970, 200);
myself.AddTimerEx(2001, 10000);
myself.sm.flag = 0;
myself.CreatePrivates(Privates);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.Castle_GetRawSystemTime() - myself.Castle_GetRawSiegeTime() < 1800) {

} else if (myself.Castle_GetRawSystemTime() - myself.Castle_GetRawSiegeTime() < 3600) {
if (myself.sm.flag < 1) {
myself.AddMoveToDesire(b02_x1, b02_y1, b02_z1, 100000000);
myself.sm.flag = 1;

}

} else if (myself.sm.flag < 2) {
myself.AddMoveToDesire(b02_x2, b02_y2, b02_z2, 100000000);
myself.sm.flag = 2;

}
myself.AddTimerEx(2001, 10000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}
	}


}