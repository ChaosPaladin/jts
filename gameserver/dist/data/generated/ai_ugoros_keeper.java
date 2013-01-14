package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ugoros_keeper extends citizen {
	protected int GM_UGOROS = 37;
	protected int ugoros_x = 95984;
	protected int ugoros_y = 85692;
	protected int ugoros_z = -3692;
	protected int ugoros_exile_x = 94224;
	protected int ugoros_exile_y = 83019;
	protected int ugoros_exile_z = -3552;
	protected String fnNoItem = "batracos002.htm";
	protected String fnNotAccepted = "batracos003.htm";
	protected String fnNoUgoros = "batracos004.htm";
	protected String fnWayOut = "batracos005.htm";
	protected int TID_EXILE_WAIT = 78001;
	protected int TIME_EXILE_WAIT = 3;
	protected int clearer_mode = 79;
	protected int babble_mode = 0;

	protected void TALKED(HandlerParam talker) {
if (myself.sm.param1 == clearer_mode) {
myself.ShowPage(talker, fnWayOut);
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0) {
if (ask == -7801) {
if (reply == 1) {
if (myself.sm.param1 == clearer_mode) {
gg.InstantTeleportEx(talker, ugoros_exile_x, ugoros_exile_y, ugoros_exile_z, 0);

} else if (myself.GetGlobalMap(GM_UGOROS) == -1) {
myself.ShowPage(talker, fnNoUgoros);

} else if (gg.OwnItemCount(talker, 15496) > 0 || babble_mode) {
if (myself.GetGlobalMap(GM_UGOROS) == -2) {
myself.ShowPage(talker, fnNotAccepted);

} else {
gg.InstantTeleportEx(talker, ugoros_x, ugoros_y, ugoros_z, 0);
if (babble_mode != 1) {
myself.DeleteItem1(talker, 15496, 1);

}
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(GM_UGOROS));
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 78010084, talker.id);

}

}

} else {
myself.ShowPage(talker, fnNoItem);

}

}

}
super;
	}

	protected void CREATED() {
if (myself.sm.param1 == clearer_mode) {
if (babble_mode) {
myself.Say("spawned");
if (myself.InMyTerritory(myself.sm)) {
myself.Say("inside my trr");

}

}
myself.AddTimerEx(TID_EXILE_WAIT, TIME_EXILE_WAIT * 60 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_EXILE_WAIT && myself.sm.param1 == clearer_mode) {
myself.InstantTeleportInMyTerritory(ugoros_exile_x, ugoros_exile_y, ugoros_exile_z, 500);
myself.Despawn();

}
	}


}