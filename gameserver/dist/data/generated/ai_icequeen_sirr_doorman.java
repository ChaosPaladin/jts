package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_sirr_doorman extends citizen {
	protected int debug_mode = 0;
	protected String fnHi = "sirr_npc001.htm";
	protected String fnInBattle = "sirr_npc002.htm";

	protected void CREATED() {
myself.i_ai0 = 0;
gg.SendScriptEvent(myself.boss, 23140022, gg.GetIndexFromCreature(myself.sm));
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 23140014) {
myself.i_ai0 = 1;

} else if (script_event_arg1 == 23140019) {
myself.i_ai0 = 2;
myself.Despawn();

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
myself.ShowPage(talker, fnHi);

} else if (myself.i_ai0 == 1) {
myself.ShowPage(talker, fnInBattle);

} else if (myself.i_ai0 == 2) {
if (debug_mode) {
myself.Say("없는 케이스");

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -2316) {
if (reply == 1) {
myself.InstantTeleport(talker, 114694, -113700, -11200);

}

}
	}


}