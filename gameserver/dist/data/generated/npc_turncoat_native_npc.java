package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_turncoat_native_npc extends default_npc {
	protected String fnHi = "turncoat_native_npc001.htm";
	protected String fnHi2 = "turncoat_native_npc002.htm";
	protected String fnHi3 = "turncoat_native_npc002a.htm";
	protected String reodas_door = "hell_town_door";
	protected int item_bribe = 9676;
	protected int item_bribe_quantity = 10;
	protected int reset_time = 30;
	protected int FieldCycle = 1;
	protected int FieldCycle_Quantity = -50;
	protected int Threshold_Level_Min = 6;
	protected int Threshold_Level_Max = 100;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -7801) {
if (reply == 1) {
if (gg.OwnItemCount(talker, item_bribe) >= item_bribe_quantity) {
myself.Say(gg.MakeFString(1800111, "", "", "", "", ""));
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, talker);
gg.Castle_GateOpenClose2(reodas_door, 0);
myself.DeleteItem1(talker, item_bribe, item_bribe_quantity);
myself.AddTimerEx(78001, reset_time * 60 * 1000);

} else if (gg.OwnItemCount(talker, item_bribe) > 0 && gg.OwnItemCount(talker, item_bribe) < item_bribe_quantity) {
myself.ShowPage(talker, fnHi2);

} else {
myself.ShowPage(talker, fnHi3);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
gg.Castle_GateOpenClose2(reodas_door, 1);

}
	}


}