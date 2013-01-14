package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class us1_battle_manager_b extends default_npc {
	protected String my_maker1 = "rumwarsha13_1424_1101";
	protected String my_maker2 = "rumwarsha13_1424_1102";
	protected String my_maker3 = "rumwarsha13_1424_1103";
	protected String my_maker4 = "rumwarsha13_1424_1104";
	protected String my_maker5 = "rumwarsha13_1424_1105";
	protected String my_maker6 = "rumwarsha13_1424_1106";
	protected String tumor_maker1 = "rumwarsha13_1424_1801";
	protected String tumor_maker2 = "rumwarsha13_1424_1802";
	protected int start_time = 0;
	protected int now_time = 0;
	protected int loc_x = -173703;
	protected int loc_y = 218097;
	protected int loc_z = -9528;

	protected void CREATED(HandlerParam maker0, HandlerParam i0, HandlerParam maker1) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai0 = myself.GetCurrentTick();
myself.AddTimerEx(1001, 1000);
myself.AddTimerEx(1003, 60 * 1000);
maker1 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), tumor_maker2);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 1001) {
i0 = myself.GetCurrentTick();
myself.i_ai1 = i0 - myself.i_ai0;
myself.AddTimerEx(1001, 1000);

} else if (timer_id == 1003) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, my_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (creature.is_pc == 1) {
if (myself.i_ai1 >= 60) {
i0 = gg.FloatToInt(myself.i_ai1 / 60);
i1 = myself.i_ai1 - i0 * 60;

} else if (myself.i_ai1 < 60) {
i0 = 0;
i1 = myself.i_ai1;

}
gg.SendUIEvent(creature, 0, 0, 0, "1", gg.IntToStr(i0), gg.IntToStr(i1), "경과 시간 : ", "60", "0");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 989809) {
switch (script_event_arg2) {
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_maker6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}
break;

}
case 3001: {
myself.CreateOnePrivateEx(1032530, "ai_is_time_attack_reward", 0, 0, loc_x, loc_y, loc_z, 0, myself.i_ai1, 1, 0);
myself.InstantZone_Finish(10);
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), tumor_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 998916, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), tumor_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 998916, 0, 0);

}
break;

}

}

}
	}


}