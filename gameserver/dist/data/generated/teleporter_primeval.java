package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleporter_primeval extends citizen {
	protected int Tel_x = 0;
	protected int Tel_y = 0;
	protected int Tel_z = 0;
	protected String fnHi2 = "";
	protected int is_dbg = 0;

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam s0) {
if (is_dbg > 2) {
s0 = "[DBG3]" + "[" + gg.IntToStr(myself.sm.class_id) + "]" + myself.sm.name + ": teleport_requested:" + talker.name;
myself.Say(s0);
s0 = "";

}
if (myself.IsInCombatMode(talker) == 1) {
myself.ShowPage(talker, fnHi2);

} else {
myself.InstantTeleport(talker, Tel_x, Tel_y, Tel_z);

}
	}


}