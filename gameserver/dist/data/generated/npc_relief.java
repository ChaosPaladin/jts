package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_relief extends default_npc {
	protected String fnHi = "caravan_relief001.htm";
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = -10;
	protected int Threshold_Level_Min = 6;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = 1400000;
	protected int Threshold_Point_Max = 20000000;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MY_DYING(HandlerParam last_attacker) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, last_attacker);
	}


}