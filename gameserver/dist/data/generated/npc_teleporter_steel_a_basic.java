package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_teleporter_steel_a_basic extends citizen {
	protected int Up_x = 0;
	protected int Up_y = 0;
	protected int Up_z = 0;
	protected int Up_Raid_Enter = -1;
	protected int Down_x = 0;
	protected int Down_y = 0;
	protected int Down_z = 0;
	protected int Down_Raid_Enter = -1;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c1, HandlerParam c2, HandlerParam i3, HandlerParam i0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
i3 = 0;
if (myself.IsNullCreature(c1) == 0) {
if (c1 == talker) {
if (myself.DistFromMe(c1) < 1000) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c2 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c2) == 0) {
if (talker.z - c2.z > 100 || c2.z - talker.z > 100) {
i3 = i3 + 1;

}

}

}
if (i3 > 0) {
myself.ShowPage(talker, "teleporter_a01001b.htm");

} else {
myself.TeleportParty(party0.id, Up_x, Up_y, Up_z, 4000, 0);

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001b.htm");

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001a.htm");

}

} else if (reply == 2) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
i3 = 0;
if (myself.IsNullCreature(c1) == 0) {
if (c1 == talker) {
if (myself.DistFromMe(c1) < 1000) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c2 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c2) == 0) {
if (talker.z - c2.z > 100 || c2.z - talker.z > 100) {
i3 = i3 + 1;

}

}

}
if (i3 > 0) {
myself.ShowPage(talker, "teleporter_a01001b.htm");

} else {
myself.TeleportParty(party0.id, Down_x, Down_y, Down_z, 2000, 0);

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001b.htm");

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001a.htm");

}

} else if (reply == 3) {
if (Up_Raid_Enter > 0) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (c1 == talker) {
myself.InstantZone_Enter(talker, Up_Raid_Enter, 1);

} else {
myself.ShowPage(talker, "teleporter_a01001b.htm");

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001a.htm");

}

}
if (Down_Raid_Enter > 0) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (c1 == talker) {
myself.InstantZone_Enter(talker, Down_Raid_Enter, 1);

} else {
myself.ShowPage(talker, "teleporter_a01001b.htm");

}

}

} else {
myself.ShowPage(talker, "teleporter_a01001a.htm");

}

}

}

}
	}


}