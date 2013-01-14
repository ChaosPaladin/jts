package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_controller_topspin extends default_npc {
	protected int control_number = 1;

	protected void CREATED() {
myself.i_ai4 = control_number;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (talker.occupation == 57 || talker.occupation == 118) {
myself.ShowPage(talker, "device001.htm");

} else {
myself.ShowPage(talker, "device001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
if (control_number == 1) {
myself.BroadcastScriptEvent(1, 0, 3000);

} else {
myself.BroadcastScriptEvent(2, 0, 3000);

}

}

}
	}


}