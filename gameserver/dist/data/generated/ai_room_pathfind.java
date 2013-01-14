package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_room_pathfind extends citizen {
	protected String c_doorname = "island_of_oracle_e";
	protected String maker_name = "innadril19_2423_004m1";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam maker0, HandlerParam i0) {
if (myself.i_ai1 == 1) {
if (NoFnHi == 1) {
return;

}
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
if (myself.i_ai0 == 0) {
gg.Castle_GateOpenCloseEx(c_doorname, 0, myself.InstantZone_GetId());
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 1);

}
myself.i_ai0 = 1;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 12575) {
myself.i_ai1 = 1;

}
	}


}