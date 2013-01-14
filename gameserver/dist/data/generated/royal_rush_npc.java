package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_npc extends citizen {
	protected String room_trigger_1 = "1rd_trigger_a";
	protected String room_trigger_2 = "1rd_trigger_b";
	protected String room_trigger_3 = "1rd_trigger_c";
	protected String room_trigger_4 = "1rd_trigger_d";
	protected String room_trigger_5 = "1rd_trigger_e";
	protected String room_trigger_boss = "1rd_type2_boss_e";
	protected int StartTelPosX = 0;
	protected int StartTelPosY = 0;
	protected int StartTelPosZ = 0;
	protected int EscapeTelPosX = 0;
	protected int EscapeTelPosY = 0;
	protected int EscapeTelPosZ = 0;
	protected int ShoutMsg = 0;
	protected int lock_npc_id1 = 1031075;
	protected int lock_npc_id2 = 1031075;
	protected int lock_npc_id3 = 1031075;
	protected int lock_npc_id4 = 1031075;
	protected int lock_npc_id5 = 1031075;
	protected String lock_npc_ai1 = "conq_barons_lock";
	protected String lock_npc_ai2 = "conq_barons_lock";
	protected String lock_npc_ai3 = "conq_barons_lock";
	protected String lock_npc_ai4 = "conq_barons_lock";
	protected String lock_npc_ai5 = "conq_barons_lock";
	protected int lock_x1 = 0;
	protected int lock_y1 = 0;
	protected int lock_z1 = 0;
	protected int lock_d1 = 0;
	protected int lock_x2 = 0;
	protected int lock_y2 = 0;
	protected int lock_z2 = 0;
	protected int lock_d2 = 0;
	protected int lock_x3 = 0;
	protected int lock_y3 = 0;
	protected int lock_z3 = 0;
	protected int lock_d3 = 0;
	protected int lock_x4 = 0;
	protected int lock_y4 = 0;
	protected int lock_z4 = 0;
	protected int lock_d4 = 0;
	protected int lock_x5 = 0;
	protected int lock_y5 = 0;
	protected int lock_z5 = 0;
	protected int lock_d5 = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void CREATED() {
myself.AddTimerEx(3000, 1000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (lock_x1 != 0) {
myself.CreateOnePrivateEx(lock_npc_id1, lock_npc_ai1, 0, 0, lock_x1, lock_y1, lock_z1, lock_d1, 0, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id2, lock_npc_ai2, 0, 0, lock_x2, lock_y2, lock_z2, lock_d2, 0, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id3, lock_npc_ai3, 0, 0, lock_x3, lock_y3, lock_z3, lock_d3, 0, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id4, lock_npc_ai4, 0, 0, lock_x4, lock_y4, lock_z4, lock_d4, 0, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id5, lock_npc_ai5, 0, 0, lock_x5, lock_y5, lock_z5, lock_d5, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(lock_npc_id1, "royal_rush_lock", 0, 0, 182727, -85493, -7200, -32584, 1, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id2, "royal_rush_lock", 0, 0, 184547, -85479, -7200, -32584, 2, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id3, "royal_rush_lock", 0, 0, 186349, -85473, -7200, -32584, 3, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id4, "royal_rush_lock", 0, 0, 188154, -85463, -7200, -32584, 4, 0, 0);
myself.CreateOnePrivateEx(lock_npc_id5, "royal_rush_lock", 0, 0, 189947, -85466, -7200, -32584, 5, 0, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0) {
if (timer_id == 3001) {
if (myself.i_ai1 == 1) {
maker0 = gg.GetNpcMaker(room_trigger_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 0;

}

} else if (timer_id == 3000) {
i0 = gg.GetDateTime(0, 4);
i1 = gg.GetDateTime(0, 5);
if (i0 == 0 && i1 < 5) {
if (myself.i_ai1 == 0) {
maker0 = gg.GetNpcMaker(room_trigger_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai1 = 1;
myself.AddTimerEx(3001, 5 * 1000);

}

} else if (i0 == 5 || i0 == 10 || i0 == 15 || i0 == 20 || i0 == 25 || i0 == 30 || i0 == 35 || i0 == 40 || i0 == 45 && i1 == 0) {
if (ShoutMsg == 1) {
myself.ShoutEx(gg.MakeFString(1000455, "", "", "", "", "") + i0 + gg.MakeFString(1000456, "", "", "", "", ""), 11500);

}

} else if (i0 == 50 && i1 == 0) {
if (ShoutMsg == 1) {
myself.ShoutEx(gg.MakeFString(1000457, "", "", "", "", ""), 11500);

}
if (EscapeTelPosX != 0 && EscapeTelPosY != 0 && EscapeTelPosZ != 0) {
myself.InstantTeleportInMyTerritory(EscapeTelPosX, EscapeTelPosY, EscapeTelPosZ, 100);

}

} else if (i0 == 54 && i1 >= 0 && i1 <= 30) {
myself.av_quest0.Exchange(0);

} else if (i0 == 55 && i1 == 0) {
myself.ShoutEx(gg.MakeFString(1000500, "", "", "", "", ""), 11500);
myself.ShoutEx(gg.MakeFString(1000501, "", "", "", "", ""), 11500);

}
myself.AddTimerEx(3000, 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam maker0, HandlerParam i0, HandlerParam s0) {
switch (script_event_arg1) {
case 1001: {
maker0 = gg.GetNpcMaker(room_trigger_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1002: {
maker0 = gg.GetNpcMaker(room_trigger_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1003: {
maker0 = gg.GetNpcMaker(room_trigger_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1004: {
maker0 = gg.GetNpcMaker(room_trigger_5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1005: {
i0 = gg.Rand(4);
i0 = i0 + 1;
s0 = room_trigger_boss + "_type" + i0;
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}

}
	}


}