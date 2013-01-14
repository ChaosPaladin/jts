package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_kief extends citizen {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 1;
	protected int Threshold_Level_Min = 2;
	protected int Threshold_Level_Max = 3;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 < Threshold_Level_Min) {
myself.ShowPage(talker, "kief001.htm");

} else if (i0 >= 2 && i0 <= 3) {
myself.ShowPage(talker, "kief001a.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "kief001e.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "kief001d.htm");

} else if (i0 == 6) {
myself.ShowPage(talker, "kief001b.htm");

} else if (i0 == 7) {
myself.ShowPage(talker, "kief001c.htm");

} else if (i0 >= 8) {
myself.ShowPage(talker, "kief001f.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -1006) {
if (reply == 1) {
i0 = gg.OwnItemCount(talker, 9674);
if (i0 >= 1) {
gg.AddPoint_FieldCycle(FieldCycle, 10 * i0, 4, talker);
myself.DeleteItem1(talker, 9674, i0);
myself.ShowPage(talker, "kief010.htm");

} else {
myself.ShowPage(talker, "kief010a.htm");

}

} else if (reply == 2) {
i0 = gg.OwnItemCount(talker, 9680);
if (i0 >= 1) {
gg.AddPoint_FieldCycle(FieldCycle, 20 * i0, 4, talker);
myself.DeleteItem1(talker, 9680, i0);
myself.ShowPage(talker, "kief011a.htm");

} else {
myself.ShowPage(talker, "kief011b.htm");

}

} else if (reply == 3) {
i0 = gg.OwnItemCount(talker, 9681);
if (i0 >= 1) {
gg.AddPoint_FieldCycle(FieldCycle, 80 * i0, 4, talker);
myself.DeleteItem1(talker, 9681, i0);
myself.ShowPage(talker, "kief011c.htm");

} else {
myself.ShowPage(talker, "kief011d.htm");

}

} else if (reply == 4) {
i0 = gg.OwnItemCount(talker, 9682);
if (i0 >= 1) {
gg.AddPoint_FieldCycle(FieldCycle, 200 * i0, 4, talker);
myself.DeleteItem1(talker, 9682, i0);
myself.ShowPage(talker, "kief011e.htm");

} else {
myself.ShowPage(talker, "kief011f.htm");

}

} else if (reply == 5) {
myself.ShowPage(talker, "kief011g.htm");

} else if (reply == 6) {
i0 = gg.OwnItemCount(talker, 10012);
if (i0 >= 20) {
myself.GiveItem1(talker, 9672, 1);
myself.DeleteItem1(talker, 10012, 20);
myself.ShowPage(talker, "kief011h.htm");

} else {
myself.ShowPage(talker, "kief011i.htm");

}

}

}
	}


}