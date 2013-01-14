package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_campfire extends default_npc {
	protected int campfire_range = 600;
	protected int Skill01_ID = -1;
	protected int Skill02_ID = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(2219001, 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 2219017) {
myself.i_ai0 = 2;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 2119019, 0);

}
myself.ChangeNPCState(myself.sm, 1);
myself.CreateOnePrivateEx(1018933, "ai_xel_campfire_dummy", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) + 100, 0, 0, 0, 0);
myself.AddTimerEx(2219002, 3000);

}
if (script_event_arg1 == 2219022) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam s0) {
if (reply == 1) {
myself.Whisper(creature, "status " + myself.i_ai0);

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam c0) {
if (skill_name_id == 594739201) {

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 2219001) {
myself.AddTimerEx(2219001, 30 * 1000 + gg.Rand(5000));
myself.ChangeNPCState(myself.sm, 2);
i0 = gg.GetL2Time(2);
if (i0) {
i1 = 2;

} else {
i1 = 4;

}
if (gg.Rand(i1) < 1) {
myself.i_ai0 = 1;
myself.ChangeNPCState(myself.sm, 1);
myself.BroadcastScriptEvent(2219021, gg.GetIndexFromCreature(myself.sm), campfire_range);

} else {
myself.i_ai0 = 0;
myself.ChangeNPCState(myself.sm, 2);
myself.BroadcastScriptEvent(2219020, 0, campfire_range);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 2219022, 1);

}

}

}
if (timer_id == 2219002) {
myself.BroadcastScriptEvent(2219018, gg.GetIndexFromCreature(myself.sm), campfire_range);

}
	}


}