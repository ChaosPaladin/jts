package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mrkeeper extends default_npc {
	protected String fnHi = "mr_keeper.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam quest_id) {
if (ask == 255) {
if (reply == 1) {
if (myself.CanLotto() == 1) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 10000;
if (i1 >= 95 && i1 < 195) {
myself.InstantTeleport(talker, -12782, 122862, -3114);
return;

}
if (i1 >= 195 && i1 < 295) {
myself.InstantTeleport(talker, -80684, 149770, -3043);
return;

}
if (i1 >= 295 && i1 < 395) {
myself.InstantTeleport(talker, 15744, 142928, -2704);
return;

}
if (i1 >= 395 && i1 < 495) {
myself.InstantTeleport(talker, 83475, 147966, -3404);
return;

}
if (i1 >= 495 && i1 < 595) {
myself.InstantTeleport(talker, 82971, 53207, -1470);
return;

}
if (i1 >= 595 && i1 < 695) {
myself.InstantTeleport(talker, 117110, 76883, -2670);
return;

}
if (i1 >= 695 && i1 < 795) {
myself.InstantTeleport(talker, 146705, 25840, -2000);
return;

}
if (i1 >= 795 && i1 < 895) {
myself.InstantTeleport(talker, 111333, 219345, -3546);
return;

}
if (i1 >= 895 && i1 < 995) {
myself.InstantTeleport(talker, 12919, 181038, -3560);
return;

}
if (i1 >= 995 && i1 < 1095) {
myself.InstantTeleport(talker, 147870, -55380, -2728);
return;

}
if (i1 >= 1095 && i1 < 1195) {
myself.InstantTeleport(talker, 43845, -47820, -792);
return;

}
if (i1 >= 1195 && i1 < 1295) {
myself.InstantTeleport(talker, 87099, -143426, -1288);
return;

}

} else {
myself.ShowPage(talker, "server_15_under001.htm");

}

}

}
	}


}