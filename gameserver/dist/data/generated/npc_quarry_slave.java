package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_quarry_slave extends default_npc {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = -20;
	protected int Threshold_Level_Min = 1;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = 100050;
	protected int Threshold_Point_Max = 1000000000;
	protected int FieldCycle2 = 1;
	protected int FieldCycle2_Condition = 103;
	protected int FieldCycle2_Quantity = 50;
	protected int Threshold_Level_Min2 = 5;
	protected int Threshold_Level_Max2 = 5;
	protected int Threshold_Point_Min2 = 0;
	protected int Threshold_Point_Max2 = 1000000000;
	protected String fnHi = "quarry_slave001.htm";

	protected void CREATED() {
myself.sm.flag = 0;
myself.i_ai4 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle2);
if (i0 >= Threshold_Level_Min2 && i0 <= Threshold_Level_Max2) {
myself.ShowPage(talker, "quarry_slave001.htm");

} else {
myself.ShowPage(talker, "quarry_slave002.htm");

}
	}

	protected void NO_DESIRE() {
if (myself.sm.flag == 1) {
myself.AddFollowDesire(myself.c_ai4, 50);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.BroadcastScriptEvent(gg.GetIndexFromCreature(myself.sm), 1000001, 300);
myself.AddTimerEx(1001, 1000);

} else if (timer_id == 1002) {
if (myself.InMyTerritory(myself.sm) == 1) {
myself.sm.flag = 0;
myself.RemoveAllDesire();
myself.EquipItem(0);
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z));

} else {
myself.Say(gg.MakeFString(1800073, "", "", "", "", ""));
myself.Suicide();

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (ask == -1006) {
if (reply == 1) {
if (myself.sm.flag == 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle2);
if (i0 >= Threshold_Level_Min2 && i0 <= Threshold_Level_Max2) {
if (myself.IsNullCreature(talker) == 0) {
myself.ShowPage(talker, "quarry_slave002a.htm");
myself.sm.flag = 1;
myself.RemoveAllDesire();
myself.EquipItem(9136);
myself.AddFollowDesire(talker, 50);
myself.i_ai4 = gg.GetIndexFromCreature(talker);
myself.BroadcastScriptEvent(gg.GetIndexFromCreature(myself.sm), 1000001, 300);
myself.AddTimerEx(1001, 1000);
myself.AddTimerEx(1002, 15 * 60 * 1000);

}

} else {
myself.ShowPage(talker, "quarry_slave002.htm");

}

} else if (myself.sm.flag == 1) {
c0 = gg.GetCreatureFromIndex(myself.i_ai4);
if (myself.IsNullCreature(c0) == 0) {

} else {
myself.ShowPage(talker, "quarry_slave002a.htm");
myself.sm.flag = 1;
myself.RemoveAllDesire();
myself.c_ai4 = talker;
myself.EquipItem(9136);
myself.AddFollowDesire(myself.c_ai4, 50);
myself.BroadcastScriptEvent(gg.GetIndexFromCreature(myself.sm), 1000001, 300);
myself.AddTimerEx(1001, 1000);

}

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 1000000) {
i0 = gg.GetStep_FieldCycle(FieldCycle2);
if (i0 >= Threshold_Level_Min2 && i0 <= Threshold_Level_Max2) {
c0 = gg.GetCreatureFromIndex(myself.i_ai4);
if (myself.IsNullCreature(c0) == 0) {
gg.AddPoint_FieldCycle(FieldCycle2, FieldCycle2_Quantity, 4, c0);

} else {
gg.AddPoint_FieldCycle(FieldCycle2, FieldCycle2_Quantity, 4, myself.sm);

}

}
myself.Say(gg.MakeFString(1800026, "", "", "", "", ""));
if (gg.Rand(10000) < 261) {
myself.DropItem1(myself.sm, 9628, 1);

} else if (gg.Rand(10000) < 175) {
myself.DropItem1(myself.sm, 9630, 1);

} else if (gg.Rand(10000) < 145) {
myself.DropItem1(myself.sm, 9629, 1);

} else if (gg.Rand(10000) < 6667) {
myself.DropItem1(myself.sm, 1876, 1);

} else if (gg.Rand(10000) < 1333) {
myself.DropItem1(myself.sm, 1877, 1);

} else if (gg.Rand(10000) < 2222) {
myself.DropItem1(myself.sm, 1874, 1);

}
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam c0, HandlerParam i1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max && i1 >= Threshold_Point_Min && i1 <= Threshold_Point_Max) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0 && c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id) != 0) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, c0);

} else {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, myself.sm);

}

}
	}


}