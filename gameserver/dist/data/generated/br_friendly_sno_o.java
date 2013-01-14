package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_o extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_orc000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50004) {
if (reply == 1) {
myself.InstantTeleport(talker, -45402, -113599, -240);

} else if (reply == 2) {
myself.InstantTeleport(talker, -46290, -114661, -200);

} else if (reply == 3) {
myself.InstantTeleport(talker, -46219, -112570, -200);

} else if (reply == 4) {
myself.InstantTeleport(talker, -43334, -113585, -216);

} else if (reply == 5) {
myself.InstantTeleport(talker, -51107, -110527, -240);

} else if (reply == 6) {
myself.InstantTeleport(talker, -27405, -128781, -1080);

} else if (reply == 7) {
myself.InstantTeleport(talker, -8022, -139095, -1264);

} else if (reply == 8) {
myself.InstantTeleport(talker, 11763, -131081, -1512);

} else if (reply == 9) {
myself.InstantTeleport(talker, 414, -114398, -3536);

} else if (reply == 10) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 11) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 12) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 13) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 14) {
myself.InstantTeleport(talker, -46017, -114489, -200);

} else if (reply == 15) {
myself.InstantTeleport(talker, -44706, -112008, -240);

} else if (reply == 16) {
myself.InstantTeleport(talker, -44931, -115055, -240);

} else if (reply == 17) {
myself.InstantTeleport(talker, 20012, 144554, -3096);

} else if (reply == 18) {
myself.InstantTeleport(talker, -85006, 105843, -3592);

}

}
super;
	}


}