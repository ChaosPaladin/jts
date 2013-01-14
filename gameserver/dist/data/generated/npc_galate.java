package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_galate extends citizen {
	protected int FieldCycle = 1;
	protected int Threshold_Point_Min = 0;
	protected int Threshold_Point_Max = 1000000000;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (myself.GetOneTimeQuestFlag(talker, 133) == 1) {
if (i0 == 0) {
myself.ShowPage(talker, "galate002.htm");

} else {
myself.ShowPage(talker, "galate002c.htm");

}

} else if (i0 == 0) {
myself.ShowPage(talker, "galate001.htm");

} else {
myself.ShowPage(talker, "galate001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (ask == -1006) {
if (reply == 1) {
if (i0 == 0) {
myself.ShowPage(talker, "galate003a.htm");

} else {
myself.ShowPage(talker, "galate003b.htm");

}

} else if (reply == 2) {
if (i0 == 0) {
myself.ShowPage(talker, "galate003c.htm");

} else {
myself.ShowPage(talker, "galate003b.htm");

}

} else if (reply == 11) {
i1 = gg.OwnItemCount(talker, 9693);
if (i1 > 0) {
gg.AddPoint_FieldCycle(FieldCycle, i1 * 10, 4, talker);
myself.DeleteItem1(talker, 9693, i1);
myself.ShowPage(talker, "galate003d.htm");

} else {
myself.ShowPage(talker, "galate003e.htm");

}

} else if (reply == 12) {
i1 = gg.OwnItemCount(talker, 9695);
if (i1 > 0) {
gg.AddPoint_FieldCycle(FieldCycle, i1 * 200, 4, talker);
myself.DeleteItem1(talker, 9695, i1);
myself.ShowPage(talker, "galate003d.htm");

} else {
myself.ShowPage(talker, "galate003e.htm");

}

} else if (reply == 13) {
i1 = gg.OwnItemCount(talker, 9696);
if (i1 > 0) {
gg.AddPoint_FieldCycle(FieldCycle, i1 * 200, 4, talker);
myself.DeleteItem1(talker, 9696, i1);
myself.ShowPage(talker, "galate003d.htm");

} else {
myself.ShowPage(talker, "galate003e.htm");

}

} else if (reply == 14) {
i1 = gg.OwnItemCount(talker, 9697);
if (i1 > 0) {
gg.AddPoint_FieldCycle(FieldCycle, i1 * 200, 4, talker);
myself.DeleteItem1(talker, 9697, i1);
myself.ShowPage(talker, "galate003d.htm");

} else {
myself.ShowPage(talker, "galate003e.htm");

}

}

}
super;
	}


}