package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chapel_door_guard_basic extends citizen {
	protected int Pass = 8067;
	protected String DoorName = "chapel_door_guard_basic_default";
	protected String GateOpenHTML = "chapel_door_guard002.htm";
	protected String GateOpenFailHTML = "chapel_door_guard003.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 502 && reply == 3) {
if (gg.OwnItemCount(talker, Pass) >= 1) {
gg.Castle_GateOpenClose2(DoorName, 0);
myself.ShowPage(talker, GateOpenHTML);

} else {
myself.ShowPage(talker, GateOpenFailHTML);

}

}
super;
	}


}