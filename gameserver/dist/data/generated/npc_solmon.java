package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_solmon extends citizen {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 0;
	protected int Threshold_Level_Min = 5;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == Threshold_Level_Min) {
myself.ShowPage(talker, "solmon001.htm");

} else if (i0 > Threshold_Level_Min) {
myself.ShowPage(talker, "solmon001a.htm");

}
	}


}