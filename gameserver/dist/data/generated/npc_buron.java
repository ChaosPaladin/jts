package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_buron extends citizen {
	protected int FieldCycle = 1;
	protected int Threshold_Level_Min = 2;
	protected int Threshold_Level_Max = 4;

	protected void CREATED() {
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 < Threshold_Level_Min) {
myself.ShowPage(talker, "buron001.htm");

} else if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
myself.ShowPage(talker, "buron002.htm");

} else if (i0 > Threshold_Level_Max) {
myself.ShowPage(talker, "buron001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -1006) {
if (reply == 1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= 2) {
if (gg.OwnItemCount(talker, 9674) >= 10) {
myself.GiveItem1(talker, 9669, 1);
myself.DeleteItem1(talker, 9674, 10);

} else {
myself.ShowPage(talker, "buron002a.htm");

}

} else {
myself.ShowPage(talker, "buron002b.htm");

}

} else if (reply == 2) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= 2) {
if (gg.OwnItemCount(talker, 9674) >= 10) {
myself.GiveItem1(talker, 9670, 1);
myself.DeleteItem1(talker, 9674, 10);

} else {
myself.ShowPage(talker, "buron002a.htm");

}

} else {
myself.ShowPage(talker, "buron002b.htm");

}

} else if (reply == 3) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= 2) {
if (gg.OwnItemCount(talker, 9674) >= 10) {
myself.GiveItem1(talker, 9671, 1);
myself.DeleteItem1(talker, 9674, 10);

} else {
myself.ShowPage(talker, "buron002a.htm");

}

} else {
myself.ShowPage(talker, "buron002b.htm");

}

} else if (reply == 4) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1) {
myself.ShowPage(talker, "buron003a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "buron003b.htm");

} else if (i0 == 3) {
myself.ShowPage(talker, "buron003c.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "buron003h.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "buron003d.htm");

} else if (i0 == 6) {
myself.ShowPage(talker, "buron003i.htm");

} else if (i0 == 7) {
myself.ShowPage(talker, "buron003e.htm");

} else if (i0 == 8) {
myself.ShowPage(talker, "buron003f.htm");

} else if (i0 == 9) {
myself.ShowPage(talker, "buron003g.htm");

} else if (i0 == 10) {
myself.ShowPage(talker, "buron003j.htm");

} else if (i0 == 11) {
myself.ShowPage(talker, "buron003k.htm");

}

}

}
	}


}