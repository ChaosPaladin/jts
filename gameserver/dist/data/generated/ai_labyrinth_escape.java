package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_labyrinth_escape extends citizen {
	protected String fnYouAreNotLeader = "0000000000.htm";

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam party0, HandlerParam c0) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
if (c0 != talker) {
myself.ShowPage(talker, fnYouAreNotLeader);
return;

}

} else {
myself.ShowPage(talker, fnYouAreNotLeader);
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0) {
if (ask == -588) {
if (reply == 9981) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
myself.InstantZone_Leave(c0);

}

}

}

}
super;
	}


}