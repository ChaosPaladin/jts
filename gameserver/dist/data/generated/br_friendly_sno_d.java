package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_d extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_darkelf000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50006) {
if (reply == 1) {
myself.InstantTeleport(talker, 12364, 16622, -4584);

} else if (reply == 2) {
myself.InstantTeleport(talker, 10561, 14358, -4240);

} else if (reply == 3) {
myself.InstantTeleport(talker, 13432, 17634, -4536);

} else if (reply == 4) {
myself.InstantTeleport(talker, 26291, 14678, -3648);

} else if (reply == 5) {
myself.InstantTeleport(talker, 17863, 8339, -3648);

} else if (reply == 6) {
myself.InstantTeleport(talker, -10222, 23074, -3712);

} else if (reply == 7) {
myself.InstantTeleport(talker, -23044, 39945, -2960);

} else if (reply == 8) {
myself.InstantTeleport(talker, -56988, 72153, -3192);

} else if (reply == 9) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 10) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 11) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 12) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 13) {
myself.InstantTeleport(talker, -12769, 123176, -3096);

} else if (reply == 14) {
myself.InstantTeleport(talker, -12489, 123462, -3104);

} else if (reply == 15) {
myself.InstantTeleport(talker, -44181, 79654, -3648);

} else if (reply == 16) {
myself.InstantTeleport(talker, -12542, 123093, -3096);

} else if (reply == 17) {
myself.InstantTeleport(talker, 85544, 146521, -3400);

} else if (reply == 18) {
myself.InstantTeleport(talker, 19953, 144495, -3096);

} else if (reply == 19) {
myself.InstantTeleport(talker, 85345, 146606, -3400);

} else if (reply == 20) {
myself.InstantTeleport(talker, 16387, 142227, -2688);

} else if (reply == 21) {
myself.InstantTeleport(talker, -85006, 105843, -3592);

}

}
super;
	}


}