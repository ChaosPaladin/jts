package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chapel_outta_guard_basic extends citizen {
	protected String DoorName = "chapel_outta_guard_basic_default";
	protected String GateOpenHTML = "chapel_outta_guard002.htm";
	protected String GateOpenFailHTML = "chapel_outta_guard003.htm";

	protected void CREATED() {
myself.AddTimerEx(3456, 15 * 1000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 502 && reply == 4) {
gg.Castle_GateOpenClose2(DoorName, 0);
myself.ShowPage(talker, GateOpenHTML);

}
super;
	}


}