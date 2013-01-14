package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_game_manager_all extends citizen {
	protected int GM_ID = 8;
	protected String maker_name_game = "azit_watering_game_manager_all_maker_default";
	protected String maker_name_clear = "azit_watering_game_manager_all_maker_finish";
	protected String szName = "game_manager";

	protected void CREATED(HandlerParam reply) {
myself.sm.residence_id = 62;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (myself.Castle_IsUnderSiege()) {
myself.ShowPage(talker, "game_manager003.htm");

} else {
myself.ShowPage(talker, "game_manager001.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -200) {
myself.MG_JoinGame(talker);

}
	}

	protected void MG_JOIN_GAME_RETURNED(HandlerParam talker, HandlerParam reply) {
switch (reply) {
case 0: {
break;

}
case -1: {
myself.ShowPage(talker, "game_manager002.htm");
break;

}
case -2: {
myself.ShowPage(talker, "game_manager004.htm");
break;

}
case -3: {
myself.ShowPage(talker, "game_manager005.htm");
break;

}
case -4: {
myself.ShowPage(talker, "game_manager006.htm");
break;

}
case -5: {
myself.ShowPage(talker, "game_manager007.htm");
break;

}
case -6: {
myself.ShowPage(talker, "game_manager008.htm");
break;

}
case -7: {
myself.ShowPage(talker, "game_manager009.htm");
break;

}
case -8: {
myself.ShowPage(talker, "game_manager010.htm");
break;

}
case -9: {
myself.ShowPage(talker, "game_manager011.htm");
break;

}
case -10: {
myself.ShowPage(talker, "game_manager012.htm");
break;

}
case -11: {
myself.ShowPage(talker, "game_manager013.htm");
break;

}
case -12: {
myself.ShowPage(talker, "game_manager003.htm");
break;

}
case -14: {
myself.ShowPage(talker, "game_manager014.htm");
break;

}
case -15: {
myself.ShowPage(talker, "game_manager015.htm");
break;

}

}
	}


}