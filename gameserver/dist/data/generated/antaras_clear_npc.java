package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class antaras_clear_npc extends default_npc {
	protected int suicide1_x = 0;
	protected int suicide2_x = 0;
	protected int suicide3_x = 0;
	protected int suicide4_x = 0;
	protected int suicide5_x = 0;
	protected int suicide6_x = 0;
	protected int suicide1_y = 0;
	protected int suicide2_y = 0;
	protected int suicide3_y = 0;
	protected int suicide4_y = 0;
	protected int suicide5_y = 0;
	protected int suicide6_y = 0;
	protected int zerging_spawn_x = 0;
	protected int zerging_spawn_y = 0;
	protected int dice = 0;

	protected void CREATED() {
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 12000 && myself.Maker_GetNpcCount() < 150) {
myself.CreateOnePrivateEx(1029077, "antaras_clear_npc_summon", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (script_event_arg1 == 12016) {
if (script_event_arg2 == dice && myself.Maker_GetNpcCount() <= 143) {
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide1_x, suicide1_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide2_x, suicide2_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide3_x, suicide3_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide4_x, suicide4_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide5_x, suicide5_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide6_x, suicide6_y, 0);
myself.CreateOnePrivateEx(1029076, "antaras_zergling", 0, 0, 177648, 114816, -7735, 0, suicide1_x, suicide1_y, 0);

}
myself.AddTimerEx(1001, 3000);

} else if (script_event_arg1 == 12002) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.c_ai0 == myself.sm) {
myself.BroadcastScriptEventEx(12010, myself.i_ai2, 0, 8000);
myself.BroadcastScriptEventEx(12003, 0, 0, 2400);

}
if (myself.i_ai3 >= 1 && myself.Maker_GetNpcCount() < 150) {
myself.CreateOnePrivateEx(1029076, "antaras_zergling", 0, 0, 177648, 114816, -7735, 0, suicide1_x, suicide1_y, 0);

}

} else if (script_event_arg1 == 12020) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.c_ai0 == myself.sm) {
myself.BroadcastScriptEventEx(12010, myself.i_ai2, 0, 8000);

}

} else if (script_event_arg1 == 12003 && myself.c_ai0 != myself.sm && myself.Maker_GetNpcCount() <= 144) {
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide1_x, suicide1_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide2_x, suicide2_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide3_x, suicide3_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide4_x, suicide4_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide5_x, suicide5_y, 0);
myself.CreateOnePrivateEx(1029070, "antaras_zergling", 0, 0, zerging_spawn_x, zerging_spawn_y, -7735, 0, suicide6_x, suicide6_y, 0);

} else if (script_event_arg1 == 12004 && myself.Maker_GetNpcCount() < 150) {
myself.CreateOnePrivateEx(1029077, "antaras_clear_npc_summon2", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (script_event_arg1 == 12006) {
myself.i_ai3 = script_event_arg2;
myself.BroadcastScriptEventEx(12001, script_event_arg2, gg.GetIndexFromCreature(myself.sm), 8000);

} else if (script_event_arg1 == 12007) {
myself.BroadcastScriptEventEx(12005, script_event_arg2, script_event_arg3, 8000);

} else if (script_event_arg1 == 12009) {
myself.i_ai2 = script_event_arg2;

} else if (script_event_arg1 == 12017) {
myself.i_ai3 = script_event_arg2;
myself.BroadcastScriptEventEx(12019, script_event_arg2, gg.GetIndexFromCreature(myself.sm), 8000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001 && myself.Maker_GetNpcCount() < 150) {
myself.CreateOnePrivateEx(1029077, "antaras_clear_npc_summon_dice", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
	}


}