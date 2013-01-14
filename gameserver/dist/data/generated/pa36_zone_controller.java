package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pa36_zone_controller extends zone_controller {
	protected int zone_type = 0;
	protected int enter_type = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam s0, HandlerParam party0, HandlerParam c0) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 128) {
if (reply == 2) {
if (zone_type > -1 && enter_type > -1) {
if (myself.GetOneTimeQuestFlag(talker, 128) == 0) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

}

}

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, fnEnterFailed);

} else if (reply == 1) {
if (myself.GetOneTimeQuestFlag(talker, 128) == 0) {
myself.ShowPage(talker, "pa36_intro_npc_q0128_06a.htm");

} else {
return;

}

}
	}


}