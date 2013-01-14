package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_bernarde extends citizen {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 0;
	protected int Threshold_Level_Min = 1;
	protected int Threshold_Level_Max = 5;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;
	protected int tranform_skill = 220135425;

	protected void CREATED() {
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (talker.transformID == 101) {
if (i0 <= 1) {
myself.ShowPage(talker, "bernarde001a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "bernarde002.htm");

} else if (i0 == 3) {
myself.ShowPage(talker, "bernarde001c.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "bernarde001d.htm");

} else {
myself.ShowPage(talker, "bernarde001f.htm");

}

} else if (i0 < 2) {
myself.ShowPage(talker, "bernarde001.htm");

} else {
myself.ShowPage(talker, "bernarde003.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -1006) {
if (reply == 1) {
myself.ShowPage(talker, "bernarde002a.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 9674) >= 5) {
myself.GiveItem1(talker, 9673, 1);
myself.DeleteItem1(talker, 9674, 5);
myself.ShowPage(talker, "bernarde002b.htm");

} else {
myself.ShowPage(talker, "bernarde002c.htm");

}

} else if (reply == 3) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1) {
myself.ShowPage(talker, "bernarde003a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "bernarde003b.htm");

} else if (i0 == 3) {
myself.ShowPage(talker, "bernarde003c.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "bernarde003h.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "bernarde003d.htm");

} else if (i0 == 6) {
myself.ShowPage(talker, "bernarde003i.htm");

} else if (i0 == 7) {
myself.ShowPage(talker, "bernarde003e.htm");

} else if (i0 == 8) {
myself.ShowPage(talker, "bernarde003f.htm");

} else if (i0 == 9) {
myself.ShowPage(talker, "bernarde003g.htm");

} else if (i0 == 10) {
myself.ShowPage(talker, "bernarde003j.htm");

} else if (i0 == 11) {
myself.ShowPage(talker, "bernarde003k.htm");

}

} else if (reply == 4) {
i1 = gg.OwnItemCount(talker, 9684);
if (i1 >= 1) {
gg.AddPoint_FieldCycle(FieldCycle, i1 * 1000, 4, talker);
myself.DeleteItem1(talker, 9684, i1);
myself.ShowPage(talker, "bernarde002d.htm");

} else {
myself.ShowPage(talker, "bernarde002e.htm");

}

}

}
	}


}