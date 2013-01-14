package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lvchk_instant_teleporter extends citizen {
	protected String fnHi = "thi.htm";
	protected String fnYouHigher = "";
	protected String fnYouLower = "";
	protected int higher_lv = -1;
	protected int lower_lv = -1;
	protected int tel_rate = 50;
	protected int PosX1 = 0;
	protected int PosY1 = 0;
	protected int PosZ1 = 0;
	protected int PosX2 = 0;
	protected int PosY2 = 0;
	protected int PosZ2 = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (higher_lv > 0 && talker.level >= higher_lv) {
myself.ShowPage(talker, fnYouHigher);
return;

}
if (lower_lv > 0 && talker.level <= lower_lv) {
myself.ShowPage(talker, fnYouLower);
return;

}
if (gg.Rand(100) < tel_rate) {
myself.InstantTeleport(talker, PosX1, PosY1, PosZ1);

} else {
myself.InstantTeleport(talker, PosX2, PosY2, PosZ2);

}
	}


}