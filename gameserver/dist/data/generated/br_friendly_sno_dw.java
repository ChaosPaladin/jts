package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_friendly_sno_dw extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_newbie_supporter_dwarf000.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50005) {
if (reply == 1) {
myself.InstantTeleport(talker, 115538, -178062, -912);

} else if (reply == 2) {
myself.InstantTeleport(talker, 115393, -182601, -1440);

} else if (reply == 3) {
myself.InstantTeleport(talker, 114812, -179662, -872);

} else if (reply == 4) {
myself.InstantTeleport(talker, 116014, -174628, -968);

} else if (reply == 5) {
myself.InstantTeleport(talker, 125455, -180665, -1768);

} else if (reply == 6) {
myself.InstantTeleport(talker, 116129, -200225, -3488);

} else if (reply == 7) {
myself.InstantTeleport(talker, 137861, -203740, -3720);

} else if (reply == 8) {
myself.InstantTeleport(talker, 163444, -206198, -3352);

} else if (reply == 9) {
myself.InstantTeleport(talker, 20891, 140881, -3464);

} else if (reply == 10) {
myself.InstantTeleport(talker, -50576, 145859, -2784);

} else if (reply == 11) {
myself.InstantTeleport(talker, 109217, -157614, -1992);

} else if (reply == 12) {
myself.InstantTeleport(talker, 83507, 90117, -3104);

} else if (reply == 13) {
myself.InstantTeleport(talker, 115726, -183314, -1472);

} else if (reply == 14) {
myself.InstantTeleport(talker, 115393, -182601, -1440);

} else if (reply == 15) {
myself.InstantTeleport(talker, 83159, 146605, -3464);

}

}
super;
	}


}