package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_teleporter_forge extends citizen {
	protected int forge_lower_x = 173492;
	protected int forge_lower_y = -112272;
	protected int forge_lower_z = -5200;
	protected String fnNotAllowed = "chandra003.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 1000 && myself.GetLeaderOfParty(party0) == talker) {
myself.TeleportParty(party0.id, forge_lower_x, forge_lower_y, forge_lower_z, 3000, 0);

} else {
myself.ShowPage(talker, fnNotAllowed);

}

} else {
myself.InstantTeleport(talker, forge_lower_x, forge_lower_y, forge_lower_z);

}

}

}
super;
	}


}