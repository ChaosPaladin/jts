package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_valentine_manager extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_valentine_manager001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 50001) {
switch (reply) {
case 1: {
if (gg.OwnItemCount(talker, 20191) <= 0) {
myself.GiveItem1(talker, 20191, 1);
myself.ShowPage(talker, "br_valentine_manager004.htm");

} else {
myself.ShowPage(talker, "br_valentine_manager005.htm");

}
break;

}
case 2: {
if (gg.OwnItemCount(talker, 20198) <= 0) {
myself.ShowPage(talker, "br_valentine_manager006.htm");

} else if (gg.OwnItemCount(talker, 20190) <= 0) {
myself.ShowPage(talker, "br_valentine_manager007.htm");

} else {
myself.ShowPage(talker, "br_valentine_manager009.htm");

}
break;

}
case 3: {
if (gg.OwnItemCount(talker, 20198) <= 0) {
myself.ShowPage(talker, "br_valentine_manager006.htm");

} else if (gg.OwnItemCount(talker, 20190) <= 0) {
myself.ShowPage(talker, "br_valentine_manager007.htm");

} else {
myself.DeleteItem1(talker, 20198, 1);
myself.DeleteItem1(talker, 20190, 1);
myself.GiveItem1(talker, 20199, 1);
myself.ShowPage(talker, "br_valentine_manager010.htm");

}

}

}

}
	}


}