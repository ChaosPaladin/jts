package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class airship_npc extends citizen {
	protected int airport_ID = 0;
	protected int platform_ID = 0;
	protected int airport_Type = 0;
	protected int AirshipConfirm = 13559;
	protected int EnergyStone = 13277;
	protected String firstHTML_free1 = "air_manager_aden1001.htm";
	protected String firstHTML_free2 = "air_manager_aden1001.htm";
	protected String firstHTML_pledge = "air_manager_kserth1001.htm";

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (airport_ID == 1) {
myself.ShowPage(talker, firstHTML_free1);

} else if (airport_ID == 3) {
myself.ShowPage(talker, firstHTML_free2);

} else {
myself.ShowPage(talker, firstHTML_pledge);

}
	}

	protected void CREATED() {
if (airport_ID < 100) {
myself.i_ai1 = myself.RegisterAsAirportManager(airport_ID, platform_ID, 1);

} else {
myself.i_ai1 = myself.RegisterAsAirportManager(airport_ID, platform_ID, 0);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0, HandlerParam pledge0) {
if (ask == -1724) {
pledge0 = myself.GetPledge(talker);
if (reply == 1) {
if (talker.transformID != 8 && talker.transformID != 9 && talker.transformID != 260) {
if (talker.yongma_type == 0) {
myself.GetOnAirShip(talker);

} else {
myself.ShowSystemMessage(talker, 2258);

}

} else {
myself.ShowSystemMessage(talker, 2727);

}

} else if (reply == 2) {
if (gg.IsNull(pledge0) == 0) {
if (myself.HavePledgePower(talker, 10)) {
if (airport_ID >= 100) {
if (myself.i_ai1 > -1) {
if (myself.IsOccupiedPlatform(myself.i_ai1) == 0) {
if (gg.OwnItemCount(talker, EnergyStone) >= 5) {
myself.SummonAirShip(talker, airport_ID, platform_ID);

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800250, "", "", "", "", ""));

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800224, "", "", "", "", ""));

}

}

}

} else {
myself.ShowSystemMessage(talker, 794);

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800228, "", "", "", "", ""));

}

} else if (reply == 3) {
if (gg.IsNull(pledge0) == 0) {
if (pledge0.airship_count > 0) {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800278, "", "", "", "", ""));

} else if (gg.OwnItemCount(talker, AirshipConfirm) > 0) {
myself.BuyAirShip(talker, 2);

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800277, "", "", "", "", ""));

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800228, "", "", "", "", ""));

}

} else if (reply == 4) {
if (talker.transformID != 8 && talker.transformID != 9 && talker.transformID != 260) {
if (talker.yongma_type == 0) {
myself.GetOnAirShip(talker);

} else {
myself.ShowSystemMessage(talker, 2258);

}

} else {
myself.ShowSystemMessage(talker, 2727);

}

}

}
	}

	protected void ON_AIRSHIP_EVENT(HandlerParam state, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
if (state == 0) {
if (airport_ID == 1) {
myself.Shout(gg.MakeFString(1800222, "", "", "", "", ""));

} else if (airport_ID == 3) {
myself.Shout(gg.MakeFString(1800220, "", "", "", "", ""));

}
myself.i_ai0 = 1;

} else if (state == 1) {
if (airport_ID == 1) {
myself.Shout(gg.MakeFString(1800223, "", "", "", "", ""));

} else if (airport_ID == 3) {
myself.Shout(gg.MakeFString(1800221, "", "", "", "", ""));

}
myself.i_ai0 = 0;

} else if (state == 2) {
myself.i_ai0 = 1;
myself.Shout(gg.MakeFString(1800219, "", "", "", "", ""));

}
	}


}