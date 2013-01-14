package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_echimus_dummy extends default_npc {
	protected String type = "";
	protected int tide = 0;
	protected String fnHi = "";
	protected int wagon_classid = 1022523;
	protected int TM_search_wagon = 78001;
	protected int TIME_search_wagon = 2;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0) {
if (gg.IsSameString(type, "boss_display") == 1) {

} else if (gg.IsSameString(type, "boss_dummy") == 1) {
myself.AddTimerEx(TM_search_wagon, TIME_search_wagon * 1000);

}
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TM_search_wagon) {
if (babble_mode == 1) {
myself.Say("주변에 웨건이 있나");

}
myself.BroadcastScriptEventEx(78010073, 2424, 0, 300);
myself.AddTimerEx(TM_search_wagon, TIME_search_wagon * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010070 && gg.IsSameString(type, "boss_display") == 1 && tide == 1) {
myself.Shout(gg.MakeFString(1800306, "", "", "", "", ""));

}
	}


}