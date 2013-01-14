package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_warp_gate extends citizen {
	protected int FieldCycle = 1;
	protected int Threshold_Point_Min = 0;
	protected int Threshold_Point_Max = 1000000000;

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
myself.i_ai4 = myself.sm.param1;
if (i0 == 0) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i1 < 25000) {
if (myself.sm.param1 == 0) {

} else {
myself.CreateOnePrivateEx(1032315, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Despawn();

}

} else if (i1 < 50000) {
if (myself.sm.param1 == 1) {

} else {
myself.CreateOnePrivateEx(1032316, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1, 0, 0);
myself.Despawn();

}

} else if (i1 < 75000) {
if (myself.sm.param1 == 2) {

} else {
myself.CreateOnePrivateEx(1032317, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 2, 0, 0);
myself.Despawn();

}

} else if (i1 < 100000) {
if (myself.sm.param1 == 3) {

} else {
myself.CreateOnePrivateEx(1032318, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 3, 0, 0);
myself.Despawn();

}

} else if (myself.sm.param1 == 4) {

} else {
myself.CreateOnePrivateEx(1032319, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 4, 0, 0);
myself.Despawn();

}

} else if (i0 >= 1) {
if (myself.sm.param1 == 5) {

} else {
myself.CreateOnePrivateEx(1032319, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 5, 0, 0);
myself.Despawn();

}

}
myself.AddTimerEx(5999, 60 * 60 * 1000);
myself.AddTimerEx(6999, 10 * 1000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 0) {
myself.ShowPage(talker, "warp_gate001.htm");

} else if (i0 >= 1) {
myself.ShowPage(talker, "warp_gate001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 0) {
myself.ShowPage(talker, "warp_gate001.htm");

} else if (myself.GetOneTimeQuestFlag(talker, 133) == 1 || myself.GetOneTimeQuestFlag(talker, 130) == 1) {
myself.InstantTeleport(talker, -11272, 236464, -3248);

} else {
myself.ShowPage(talker, "warp_gate001b.htm");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 5999) {
i2 = gg.GetStep_FieldCycle(FieldCycle);
if (i2 < 1) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 95000) {
gg.AddPoint_FieldCycle(1, 39, 4, myself.sm);

}

} else if (i2 == 1) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 400000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 2) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 492000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 3) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 584000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 4) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 676000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 5) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 768000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 6) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 860000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 7) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 952000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 8) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 1044000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 9) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 1136000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 10) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 1228000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

} else if (i2 == 11) {
if (gg.GetPoint_FieldCycle(FieldCycle) < 1320000) {
gg.AddPoint_FieldCycle(1, 500, 4, myself.sm);

}

}
myself.AddTimerEx(5999, 60 * 60 * 1000);

}
if (timer_id == 6999) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 0) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i1 < 25000) {
if (myself.i_ai4 == 0) {

} else {
myself.CreateOnePrivateEx(1032315, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Despawn();

}

} else if (i1 < 50000) {
if (myself.i_ai4 == 1) {

} else {
myself.CreateOnePrivateEx(1032316, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1, 0, 0);
myself.Despawn();

}

} else if (i1 < 75000) {
if (myself.i_ai4 == 2) {

} else {
myself.CreateOnePrivateEx(1032317, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 2, 0, 0);
myself.Despawn();

}

} else if (i1 < 100000) {
if (myself.i_ai4 == 3) {

} else {
myself.CreateOnePrivateEx(1032318, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 3, 0, 0);
myself.Despawn();

}

} else if (myself.i_ai4 == 4) {

} else {
myself.CreateOnePrivateEx(1032319, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 4, 0, 0);
myself.Despawn();

}

} else if (i0 >= 1) {
if (myself.i_ai4 == 5) {

} else {
myself.CreateOnePrivateEx(1032319, "npc_warp_gate", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 5, 0, 0);
myself.Despawn();

}

}
myself.AddTimerEx(6999, 10 * 1000);

}
	}


}