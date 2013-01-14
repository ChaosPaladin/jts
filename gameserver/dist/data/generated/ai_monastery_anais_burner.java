package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_monastery_anais_burner extends default_npc {
	protected int BURNER_NUMBER = 0;
	protected int TIME_FOR_TARGET = 2000;
	protected int TARGET = 300;
	protected int POSX = 10101;
	protected int POSY = 20202;
	protected int POSZ = 30303;

	protected void CREATED() {
myself.ChangeStatus(2);
myself.i_quest9 = 0;
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 2114008) {
myself.c_ai0 = gg.GetCreatureFromID(script_event_arg2);

} else if (script_event_arg1 == 2114006 && script_event_arg2 == BURNER_NUMBER) {
myself.ChangeNPCState(myself.sm, 1);
myself.i_ai0 = 1;
myself.AddTimerEx(TIME_FOR_TARGET, 1 * 1000);

} else if (script_event_arg1 == 2114009) {
myself.ChangeNPCState(myself.sm, 1);
i0 = script_event_arg2;
c0 = gg.GetCreatureFromID(i0);
if (myself.i_quest9 == 1) {

}
myself.CreateOnePrivateEx(1018929, "ai_grail_protection", 0, 0, POSX, POSY, POSZ, 0, c0.id, 0, 0);

} else if (script_event_arg1 == 2114007) {
myself.ChangeNPCState(myself.sm, 2);
myself.Suicide();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIME_FOR_TARGET) {
myself.ChangeNPCState(myself.sm, 2);
gg.SendScriptEvent(myself.c_ai0, 21140010, myself.sm.id);
myself.AddTimerEx(TIME_FOR_TARGET, 20 * 1000);
if (myself.i_quest9 == 1) {

}

}
	}


}