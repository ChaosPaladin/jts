package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_e extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_elf000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50007) {
if (reply == 1) {
myself.InstantTeleport(talker, 45473, 48113, -3056);

} else if (reply == 2) {
myself.InstantTeleport(talker, 45148, 52247, -2792);

} else if (reply == 3) {
myself.InstantTeleport(talker, 47912, 49713, -2984);

} else if (reply == 4) {
myself.InstantTeleport(talker, 42606, 42302, -3488);

} else if (reply == 5) {
myself.InstantTeleport(talker, 39379, 51175, -3448);

} else if (reply == 6) {
myself.InstantTeleport(talker, 34551, 46756, -3688);

} else if (reply == 7) {
myself.InstantTeleport(talker, 11979, 58683, -3400);

} else if (reply == 8) {
myself.InstantTeleport(talker, 3227, 74645, -3840);

} else if (reply == 9) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 10) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 11) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 12) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 13) {
myself.InstantTeleport(talker, -13501, 122750, -3104);

} else if (reply == 14) {
myself.InstantTeleport(talker, 43758, 49674, -3048);

} else if (reply == 15) {
myself.InstantTeleport(talker, -13480, 121675, -2968);

} else if (reply == 16) {
myself.InstantTeleport(talker, 85544, 146521, -3400);

} else if (reply == 17) {
myself.InstantTeleport(talker, 19953, 144495, -3096);

} else if (reply == 18) {
myself.InstantTeleport(talker, 85345, 146606, -3400);

} else if (reply == 19) {
myself.InstantTeleport(talker, 16387, 142227, -2688);

} else if (reply == 20) {
myself.InstantTeleport(talker, -85006, 105843, -3592);

}

}
super;
	}


}