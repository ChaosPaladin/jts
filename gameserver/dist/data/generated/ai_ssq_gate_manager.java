package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_gate_manager extends citizen {
	protected void CREATED() {
myself.i_ai5 = 0;
myself.i_ai6 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0, HandlerParam c0) {
if (timer_id == 7802) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "iz112_1724_f01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
c0 = gg.GetCreatureFromID(myself.i_ai6);
if (myself.IsNullCreature(c0) == 0) {
myself.ShowSystemMessage(c0, 3032);

}
myself.AddTimerEx(7810, 1000);

} else if (timer_id == 7810) {
myself.BroadcastScriptEvent(9274218, myself.i_ai6, 5000);
myself.AddTimerEx(7810, 1000);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam maker0) {
if (ask == 196) {
if (reply == 1) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) >= 3) {
i0 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx("door_of_ssq_necro6", 0, i0);
maker0 = gg.InstantZone_GetNpcMaker(i0, "iz112_1724_f02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai6 = talker.id;
myself.StartScenePlayer(talker, 12);
myself.AddTimerEx(7802, 18000);

}

}

}
	}


}