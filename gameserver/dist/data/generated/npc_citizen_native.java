package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_citizen_native extends warrior_basic {
	protected String fnHi = "citizen_native_npc001.htm";
	protected String fnHi2 = "citizen_native_npc002.htm";
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = -10;
	protected int Threshold_Level_Min = 5;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = 100020;
	protected int Terminal_Threshold = 6;
	protected int timer = 10;

	protected void CREATED() {
myself.AddTimerEx(7001, timer * 60 * 1000);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 <= Threshold_Level_Min) {
myself.ShowPage(talker, fnHi);

} else if (i0 >= Terminal_Threshold) {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (timer_id == 7001 && i0 <= Threshold_Level_Min) {
myself.Say(gg.MakeFString(1800073, "", "", "", "", ""));
myself.Suicide();

}
super;
	}


}