package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_k extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_kamael000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50008) {
if (reply == 1) {
myself.InstantTeleport(talker, -119902, 44293, 360);

} else if (reply == 2) {
myself.InstantTeleport(talker, -118848, 43229, 544);

} else if (reply == 3) {
myself.InstantTeleport(talker, -117347, 43260, 544);

} else if (reply == 4) {
myself.InstantTeleport(talker, -114979, 44930, 512);

} else if (reply == 5) {
myself.InstantTeleport(talker, -121244, 54282, -1464);

} else if (reply == 6) {
myself.InstantTeleport(talker, -124630, 78822, -3520);

} else if (reply == 7) {
myself.InstantTeleport(talker, -113830, 65181, -2640);

} else if (reply == 8) {
myself.InstantTeleport(talker, -92738, 38872, -2464);

} else if (reply == 9) {
myself.InstantTeleport(talker, -89340, 47096, -2856);

} else if (reply == 10) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 11) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 12) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 13) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 14) {
myself.InstantTeleport(talker, -13256, 125395, -3128);

} else if (reply == 15) {
myself.InstantTeleport(talker, -84537, 153288, -3168);

} else if (reply == 16) {
myself.InstantTeleport(talker, 83359, 54492, -1520);

} else if (reply == 17) {
myself.InstantTeleport(talker, 80765, 150452, -3528);

} else if (reply == 18) {
myself.InstantTeleport(talker, 16613, 146327, -3112);

}

}
super;
	}


}