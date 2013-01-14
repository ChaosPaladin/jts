package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_h extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_human000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50003) {
if (reply == 1) {
myself.InstantTeleport(talker, -83925, 243416, -3728);

} else if (reply == 2) {
myself.InstantTeleport(talker, -83141, 242806, -3720);

} else if (reply == 3) {
myself.InstantTeleport(talker, -84903, 245094, -3720);

} else if (reply == 4) {
myself.InstantTeleport(talker, -81788, 243677, -3712);

} else if (reply == 5) {
myself.InstantTeleport(talker, -81797, 240198, -3680);

} else if (reply == 6) {
myself.InstantTeleport(talker, -93490, 242721, -3464);

} else if (reply == 7) {
myself.InstantTeleport(talker, -102727, 238718, -3496);

} else if (reply == 8) {
myself.InstantTeleport(talker, -113854, 244875, -3344);

} else if (reply == 9) {
myself.InstantTeleport(talker, -48029, 199525, -3712);

} else if (reply == 10) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 11) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 12) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 13) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 14) {
myself.InstantTeleport(talker, -81891, 149296, -3120);

} else if (reply == 15) {
myself.InstantTeleport(talker, -82523, 150435, -3120);

} else if (reply == 16) {
myself.InstantTeleport(talker, -85103, 152782, -3160);

} else if (reply == 17) {
myself.InstantTeleport(talker, -80491, 150743, -3040);

} else if (reply == 18) {
myself.InstantTeleport(talker, -79372, 150765, -3040);

} else if (reply == 19) {
myself.InstantTeleport(talker, 19953, 144495, -3096);

} else if (reply == 20) {
myself.InstantTeleport(talker, 85544, 146521, -3400);

} else if (reply == 21) {
myself.InstantTeleport(talker, 85345, 146606, -3400);

} else if (reply == 22) {
myself.InstantTeleport(talker, 16387, 142227, -2688);

} else if (reply == 23) {
myself.InstantTeleport(talker, -85006, 105843, -3592);

}

}
super;
	}


}