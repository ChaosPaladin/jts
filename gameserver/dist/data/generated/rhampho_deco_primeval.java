package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rhampho_deco_primeval extends default_npc {
	protected int mobile_type = 0;
	protected int FreewayID = -1;
	protected int FreewayMethod = 1;
	protected int FreewayDesire = 2000;
	protected int FreewayPlayAniRange = 500;
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
super;
if (FreewayID > -1) {
if (mobile_type == 1) {
myself.AddMoveFreewayDesire(FreewayID, FreewayMethod, FreewayDesire);

}

} else if (is_dbg > 0) {
s0 = "[DBG1]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": super point name is null";
myself.Say(s0);
s0 = "";

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 2017888) {
maker0 = myself.GetMyMaker();
myself.Say("maker name : " + maker0.name);
myself.AddTimerEx(2017888, 10 * 1000);

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam state, HandlerParam success, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": node_arrived";
myself.Say(s0);
s0 = "";

}
if (script_event_arg3 > -1) {
if (mobile_type == 1) {
if (is_dbg > 1) {
s0 = "[DBG2]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": play social" + "[" + gg.IntToStr(script_event_arg3) + "]";
myself.Say(s0);
s0 = "";

}
myself.PlayAnimation(script_event_arg3, FreewayPlayAniRange);

}

}
if (FreewayID > -1) {
if (mobile_type == 1) {
myself.AddMoveFreewayDesire(FreewayID, FreewayMethod, FreewayDesire);

}

}
	}


}