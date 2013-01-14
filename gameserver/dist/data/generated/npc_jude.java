package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_jude extends citizen {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 0;
	protected int Threshold_Level_Min = 5;
	protected int Threshold_Level_Max = 5;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 < 3) {
myself.ShowPage(talker, "jude001.htm");

} else if (i0 == 3 || i0 == 4) {
myself.ShowPage(talker, "jude001c.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "jude001a.htm");

} else {
myself.ShowPage(talker, "jude001b.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -1006) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 9684) >= 40) {
myself.GiveItem1(talker, 9677, 1);
myself.DeleteItem1(talker, 9684, 40);
myself.ShowPage(talker, "jude002.htm");

} else {
myself.ShowPage(talker, "jude002a.htm");

}

}

}
	}


}