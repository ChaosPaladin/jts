package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_kanaf extends citizen {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 110;
	protected int FieldCycle_Quantity = 3;
	protected int Threshold_Level_Min = 10;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;
	protected int zone_type = 2;
	protected int enter_type = 1;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, "kcaien001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam party0) {
if (ask == -1006) {
if (reply == 1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

} else {
myself.ShowPage(talker, "kcaien002b.htm");

}

} else {
myself.ShowPage(talker, "kcaien002a.htm");

}

} else if (reply == 2) {
switch (gg.Rand(3)) {
case 0: {
myself.ShowPage(talker, "kcaien001a.htm");
break;

}
case 1: {
myself.ShowPage(talker, "kcaien001b.htm");
break;

}
case 2: {
myself.ShowPage(talker, "kcaien001c.htm");
break;

}
case 3: {
break;

}

}

}

}
	}


}