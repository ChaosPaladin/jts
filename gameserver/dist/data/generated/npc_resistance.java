package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_resistance extends citizen {
	protected String fnHi = "hellbound_resistance001.htm";
	protected String fnHi2 = "hellbound_resistance002.htm";
	protected int FieldCycle = 1;
	protected int Threshold_Level_Min = 5;
	protected int Threshold_Level_Max = 100;
	protected int Terminal_Threshold = 6;

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 <= Threshold_Level_Min) {
myself.ShowPage(talker, fnHi);

} else if (i0 >= Terminal_Threshold) {
myself.ShowPage(talker, fnHi2);

}
	}


}