package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ambassador_castle extends citizen {
	protected int castle_id = 0;
	protected int fortress_id = 0;
	protected String fnHi1 = "";
	protected String fnHi2 = "";
	protected String fnContractSuccess = "";
	protected String fnContractFail = "";
	protected String fnIndepFail = "gludio_ambassador002.htm";
	protected String fnIndepAlready = "gludio_ambassador002.htm";
	protected int despawn_time = 60;
	protected int msg_timeout = -1;

	protected void CREATED() {
myself.AddTimerEx(7791, despawn_time * 60 * 1000);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, fnHi);
return;

} else {
myself.ShowPage(talker, fnHi2);
return;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -299) {
if (reply == 0) {
myself.Fortress_ContractCastle(myself.sm.id, talker.id, fortress_id, castle_id);
return;

} else if (reply == 1) {
myself.Fortress_ContractCastle(myself.sm.id, talker.id, fortress_id, -1);
return;

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 11039) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 7790) {
myself.Despawn();

} else if (timer_id == 7791) {
if (msg_timeout > 0) {
myself.Say(gg.MakeFString(msg_timeout, "", "", "", "", ""));

}
myself.Fortress_ContractCastle(myself.sm.id, 0, fortress_id, -1);
myself.AddTimerEx(7790, 3 * 1000);

} else if (timer_id == 7792) {
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.AddTimerEx(7790, 3 * 1000);

}
	}

	protected void FORTRESS_CONTRACT_CASTLE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, fnContractSuccess);
myself.AddTimerEx(7792, 3 * 1000);

} else if (reply == 0) {
myself.ShowPage(talker, fnContractFail);

} else if (reply == 1) {
myself.ShowPage(talker, fnHi1);
myself.AddTimerEx(7792, 3 * 1000);

} else if (reply == 2) {
myself.ShowPage(talker, fnIndepFail);

} else if (reply == 3) {
myself.ShowPage(talker, fnIndepAlready);

}
	}


}