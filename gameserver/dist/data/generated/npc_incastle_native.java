package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_incastle_native extends default_npc {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 104;
	protected int FieldCycle_Quantity = 10;
	protected int Threshold_Level_Min = 9;
	protected int Threshold_Level_Max = 9;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void CREATED() {
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 < Threshold_Level_Min) {
myself.ShowPage(talker, "incastle_native001a.htm");

} else if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
myself.ShowPage(talker, "incastle_native001.htm");

} else {
myself.ShowPage(talker, "incastle_native001b.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (ask == -1006) {
if (reply == 1) {
i1 = gg.OwnItemCount(talker, 9674);
if (i1 >= 5) {
gg.AddPoint_FieldCycle(1, 5 * 20, 4, talker);
myself.DeleteItem1(talker, 9674, 5);
myself.ShowPage(talker, "incastle_native002.htm");
myself.AddTimerEx(1000, 3000);

} else {
myself.ShowPage(talker, "incastle_native002a.htm");

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.Despawn();

}
	}


}