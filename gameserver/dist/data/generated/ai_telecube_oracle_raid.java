package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_telecube_oracle_raid extends default_npc {
	protected String fnHi = "";
	protected String fnHi2 = "";
	protected String maker_name = "innadril22_2422_600m1";
	protected int telecube_item1 = 9695;
	protected int telecube_item2 = 9696;
	protected int telecube_item3 = 9697;

	protected void CREATED() {
myself.AddTimerEx(2002, 10 * 60 * 1000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
party0 = gg.GetParty(talker);
if (gg.Party_GetLeader(talker) == talker) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, "a_telecube_balor002.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam maker0) {
if (ask == -1005) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
if (myself.DistFromMe(c0) <= 1000) {
if (gg.OwnItemCount(c0, telecube_item1) < 1) {
myself.Shout(gg.MakeFString(1800028, c0.name, "", "", "", ""));
return;

}
if (gg.OwnItemCount(c0, telecube_item2) < 1) {
myself.Shout(gg.MakeFString(1800027, c0.name, "", "", "", ""));
return;

}
if (gg.OwnItemCount(c0, telecube_item3) < 1) {
myself.Shout(gg.MakeFString(1800029, c0.name, "", "", "", ""));
return;

}

} else {
myself.Shout(gg.MakeFString(1800030, c0.name, "", "", "", ""));
return;

}

}

}

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.OwnItemCount(c0, telecube_item1) >= 1 && gg.OwnItemCount(c0, telecube_item2) >= 1 && gg.OwnItemCount(c0, telecube_item3) >= 1) {
if (i2 == 0 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153526, 142172, -12743, 22324);

} else if (i2 == 1 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153600, 142184, -12743, 12828);

} else if (i2 == 2 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153650, 142140, -12743, 6252);

} else if (i2 == 3 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153680, 142076, -12743, 0);

} else if (i2 == 4 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153653, 142013, -12743, -5556);

} else if (i2 == 5 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153591, 141969, -12743, -12036);

} else if (i2 == 6 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153529, 141983, -12743, -18372);

} else if (i2 == 7 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153471, 142039, -12743, -31088);

} else if (i2 == 8 && myself.DistFromMe(c0) < 1000) {
i3 = gg.Rand(100);
if (i3 <= 33) {
myself.DeleteItem1(c0, telecube_item1, 1);

} else if (i3 <= 66) {
myself.DeleteItem1(c0, telecube_item2, 1);

} else {
myself.DeleteItem1(c0, telecube_item3, 1);

}
gg.InstantTeleportEx(c0, 153468, 142113, -12743, 27912);

}

} else {
myself.ShowPage(talker, fnHi2);

}

}

}

} else {
myself.ShowPage(talker, fnHi2);

}

} else if (reply == 2) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantZone_Leave(c0);

}

}

}

} else if (reply == 3) {
myself.ShowPage(talker, "c_telecube_balor001b.htm");

} else if (reply == 4) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
if (myself.DistFromMe(c0) <= 1000) {
if (gg.OwnItemCount(c0, telecube_item3) < 1) {
myself.Shout(gg.MakeFString(1800029, c0.name, "", "", "", ""));
return;

}

} else {
myself.Shout(gg.MakeFString(1800030, c0.name, "", "", "", ""));
return;

}

}

}

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.OwnItemCount(c0, telecube_item3) >= 1) {
myself.DeleteItem1(c0, telecube_item3, 1);

}

}

}
myself.TeleportParty(party0.id, 142649, 142657, -15658, 1000, 0);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.Despawn();

}
	}


}