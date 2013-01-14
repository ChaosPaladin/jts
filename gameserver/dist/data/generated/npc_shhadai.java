package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_shhadai extends citizen {
	protected int on_oasis = 100;
	protected int PosX = 9032;
	protected int PosY = 253063;
	protected int PosZ = -1928;
	protected int PosX_temp = 16882;
	protected int PosY_temp = 238952;
	protected int PosZ_temp = 9776;

	protected void CREATED(HandlerParam i0) {
i0 = gg.GetL2Time(2);
if (i0) {
myself.InstantTeleport(myself.sm, PosX, PosY, PosZ);
myself.i_ai3 = 1;

} else {
myself.InstantTeleport(myself.sm, PosX_temp, PosY_temp, PosZ_temp);
myself.i_ai3 = 0;

}
myself.AddTimerEx(5003, 10000);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, "shhadai001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
myself.ShowPage(talker, "shhadai002.htm");

}

} else if (ask == -303) {
if (reply == 617 || reply == 616 || reply == 624 || reply == 625) {
myself.ShowMultisell(reply, talker);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5003) {
i0 = gg.GetL2Time(2);
if (i0) {
if (myself.i_ai3 == 1) {

} else {
myself.InstantTeleport(myself.sm, PosX, PosY, PosZ);
myself.i_ai3 = 1;

}

} else if (myself.i_ai3 == 1) {
myself.InstantTeleport(myself.sm, PosX_temp, PosY_temp, PosZ_temp);
myself.i_ai3 = 0;

}
myself.AddTimerEx(5003, 10000);

}
super;
	}


}