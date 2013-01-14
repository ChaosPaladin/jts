package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_dungeon_teleporter extends default_npc {
	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, "frintessa_teleporter001.htm");
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam reply, HandlerParam talker, HandlerParam maker0, HandlerParam c1, HandlerParam i6, HandlerParam c2, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c3, HandlerParam party0, HandlerParam s0) {
if (ask == 654) {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (talker != c0) {
myself.InstantZone_Enter(talker, 136, 2);

} else if (gg.OwnItemCount(talker, 8073) == 0) {
myself.ShowPage(talker, "frintessa_teleporter004.htm");

} else {
myself.InstantZone_Enter(talker, 136, 2);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam state, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2, HandlerParam c1, HandlerParam i3) {
if (state == 0) {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (myself.IsNullCreature(c0) == 0) {
if (talker != c0) {

} else if (reply == 0) {
myself.ShowPage(talker, "frintessa_teleporter008.htm");

} else {
myself.DeleteItem1(talker, 8073, 1);

}

}
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(i0); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(i0, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c1) == 0) {
if (gg.OwnItemCount(c1, 8192) > 0) {
myself.DeleteItem1(c1, 8192, gg.OwnItemCount(c1, 8192));

}
if (gg.OwnItemCount(c1, 8556) > 0) {
myself.DeleteItem1(c1, 8556, gg.OwnItemCount(c1, 8556));

}

}

}

}

}

} else if (state == 1) {

}
	}


}