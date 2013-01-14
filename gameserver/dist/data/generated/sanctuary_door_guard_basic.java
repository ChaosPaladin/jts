package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sanctuary_door_guard_basic extends citizen {
	protected int Pass1 = 8064;
	protected int Pass2 = 8065;
	protected int Pass3 = 8067;
	protected String DoorName = "sanctuary_door_guard_basic_default";
	protected String GateOpenHTML = "sanctuary_door_guard002.htm";
	protected String GateOpenFailHTML = "sanctuary_door_guard003.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 502 && reply == 1) {
if (gg.OwnItemCount(talker, Pass1) >= 1 || gg.OwnItemCount(talker, Pass2) >= 1 || gg.OwnItemCount(talker, Pass3) >= 1) {
gg.Castle_GateOpenClose2(DoorName, 0);
myself.ShowPage(talker, GateOpenHTML);

} else {
myself.ShowPage(talker, GateOpenFailHTML);

}

}
super;
	}


}