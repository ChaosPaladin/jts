package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class normal_doorkeeper extends citizen {
	protected String DoorName1 = "border_door_01";
	protected String fnHi = "normal_doorman001.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -201) {
switch (reply) {
case 1: {
gg.Castle_GateOpenClose2(DoorName1, 0);
break;

}
case 2: {
gg.Castle_GateOpenClose2(DoorName1, 1);
break;

}

}

}
	}


}