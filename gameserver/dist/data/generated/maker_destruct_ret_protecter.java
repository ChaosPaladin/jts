package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_ret_protecter extends default_maker {
	protected String enter_maker_name = "destruct_ret_ptc_enter_maker_name";
	protected String invasion_maker_name = "destruct_ret_ptc_invasion_maker_name";
	protected String manager_maker_name = "rumwarsha04_1225_002m1";

	protected void ON_START() {
myself.i_ai4 = 2;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 1224012) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai4 = 2;

}

} else if (script_event_arg1 == 1224013) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (script_event_arg1 == 1224014) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam died) {
if (died == 1) {
myself.i_ai4 = myself.i_ai4 - 1;

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0) {
if (myself.i_ai4 > 0) {

} else {
maker0 = gg.GetNpcMaker(enter_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}

}
	}


}