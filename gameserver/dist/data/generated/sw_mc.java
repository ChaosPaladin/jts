package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sw_mc extends show_npc {
	protected int ShoutMg_MC = 0;
	protected String makeName = "etc08_npc1816_01m1";

	protected void CREATED() {
myself.i_ai3 = 1800105;
myself.Shout(gg.MakeFString(myself.i_ai3, "", "", "", "", ""));
myself.AddTimerEx(1816000, 30 * 1000);
myself.i_ai1 = 1;
myself.i_ai2 = 0;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai0 == 6) {
myself.AddMoveToDesire(-AddMoveToDesire, -56430, -2008, 200000);

}
if (myself.i_ai0 == 13) {
myself.AddMoveToDesire(-AddMoveToDesire, -56340, -2008, 20000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 1816002 && myself.i_ai0 == 7) {
myself.BroadcastScriptEvent(11, 8, 2000);

}
if (timer_id == 1816003 && myself.i_ai0 == 9) {
myself.BroadcastScriptEvent(11, 10, 2000);

}
if (timer_id == 1816004 && myself.i_ai0 == 11) {
myself.BroadcastScriptEvent(11, 12, 2000);

}
if (timer_id == 1816005 && myself.i_ai0 == 12) {
myself.BroadcastScriptEvent(11, 13, 2000);

}
if (timer_id == 1816006 && myself.i_ai0 == 13) {
myself.BroadcastScriptEvent(11, 15, 2000);

}
if (timer_id == 1816201) {
if (myself.i_ai4 == 0) {
myself.i_ai2 = 1;
myself.i_ai1 = 1;
myself.AddTimerEx(1816001, 10);
return;

} else {
myself.Shout(gg.MakeFString(myself.i_ai3, "", "", "", "", ""));
myself.i_ai3 = myself.i_ai3 + 1;
myself.i_ai4 = myself.i_ai4 - 1;
myself.AddTimerEx(1816201, 5000);

}

}
if (myself.i_ai1 == 0) {
return;

}
if (timer_id == 1816000) {
if (myself.i_ai0 == 0) {
myself.i_ai3 = 1800082;
myself.Shout(gg.MakeFString(myself.i_ai3, "", "", "", "", ""));
myself.BroadcastScriptEvent(11, 1, 2000);

}

}
if (timer_id == 1816001) {
if (myself.i_ai0 == 1) {
if (myself.i_ai2 == 0) {
myself.i_ai3 = 1800083;
myself.i_ai4 = 5;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -56665, -2034, 200000);
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 3) {
myself.AddMoveToDesire(-AddMoveToDesire, -56430, -2008, 200000);
myself.i_ai3 = 1800088;
myself.Shout(gg.MakeFString(myself.i_ai3, "", "", "", "", ""));
myself.i_ai1 = 0;

}
if (myself.i_ai0 == 4) {
if (myself.i_ai2 == 0) {
myself.i_ai3 = 1800089;
myself.i_ai4 = 3;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
myself.AddMoveToDesire(-AddMoveToDesire, -56665, -2034, 200000);
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 6) {
if (myself.i_ai2 == 0) {
myself.AddMoveToDesire(-AddMoveToDesire, -56430, -2008, 200000);
myself.i_ai3 = 1800092;
myself.i_ai4 = 3;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 7) {
myself.AddTimerEx(1816002, 5000);

}
if (myself.i_ai0 == 8) {
if (myself.i_ai2 == 0) {
myself.i_ai3 = 1800095;
myself.i_ai4 = 2;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
myself.Shout(gg.MakeFString(1800097, "", "", "", "", ""));
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 9) {
myself.AddTimerEx(1816003, 5000);
myself.i_ai1 = 0;

}
if (myself.i_ai0 == 10) {
if (myself.i_ai2 == 0) {
myself.i_ai3 = 1800098;
myself.i_ai4 = 2;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 11) {
myself.AddTimerEx(1816004, 5000);
myself.i_ai1 = 0;

}
if (myself.i_ai0 == 12) {
myself.i_ai3 = 1800100;
myself.Shout(gg.MakeFString(myself.i_ai3, "", "", "", "", ""));
myself.AddTimerEx(1816005, 5000);
myself.i_ai1 = 0;

}
if (myself.i_ai0 == 13) {
myself.AddMoveToDesire(-AddMoveToDesire, -56340, -2008, 20000);
maker0 = gg.GetNpcMaker(makeName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1, 0, 0);

}
if (myself.i_ai2 == 0) {
myself.i_ai3 = 1800101;
myself.i_ai4 = 3;
myself.AddTimerEx(1816201, 10);
myself.i_ai1 = 0;

}
if (myself.i_ai2 == 1) {
myself.AddTimerEx(1816006, 5000);
myself.i_ai1 = 0;

}

}
if (myself.i_ai0 == 15) {
myself.Despawn();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;

}
myself.AddTimerEx(1816001, 1000);

}
myself.AddTimerEx(1816001, 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 11 && script_event_arg2 != myself.i_ai0) {
myself.i_ai0 = script_event_arg2;
myself.i_ai1 = 1;
myself.i_ai2 = 0;
myself.AddTimerEx(1816001, 1000);

}
	}


}