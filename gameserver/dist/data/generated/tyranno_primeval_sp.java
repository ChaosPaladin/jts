package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tyranno_primeval_sp extends tyranno_primeval {
	protected int mobile_type = 0;
	protected String SuperPointName = "";
	protected int SuperPointMethod = 2;
	protected int SuperPointDesire = 50;

	protected void CREATED(HandlerParam s0) {
super;
if (myself.IsNullString(SuperPointName) != 1) {
if (mobile_type == 1) {
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);

}

} else if (is_dbg > 0) {
s0 = "[DBG1]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": super point name is null";
myself.Say(s0);
s0 = "";

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": node_arrived";
myself.Say(s0);
s0 = "";

}
if (script_event_arg3 > -1 && mobile_type == 1) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": play social" + "[" + gg.IntToStr(script_event_arg3) + "]";
myself.Say(s0);
s0 = "";

}
myself.AddEffectActionDesire(myself.sm, script_event_arg3, 10, 10000000);

}

}
if (myself.IsNullString(SuperPointName) != 1) {
if (mobile_type == 1) {
myself.LookNeighbor(1000);
myself.AddTimerEx(2017001, 5000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2017001) {
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);

}
super;
	}


}