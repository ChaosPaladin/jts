package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_enter_dream_border extends citizen {
	protected int InstantZone_ID = -1;
	protected int EnterType = 1;
	protected String enter_error_party_leader = "";
	protected String enter_error_no_party = "";
	protected String enter_success = "";
	protected String explain_dream = "";
	protected int give_item = 15311;

	protected void CREATED() {
myself.i_ai9 = 0;
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (ask == -7802) {
if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.InstantZone_Enter(talker, InstantZone_ID, EnterType);

} else if (reply == 2) {
myself.ShowPage(talker, explain_dream);

} else if (reply == 3) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 / 100000000;
if (i1 >= 100) {
i1 = i1 % 100;

}
if (i1 < 0) {
i1 = 0;

}
if (i1 == 0) {
myself.InstantTeleport(talker, 43835, -47749, -792);

}
if (i1 == 1) {
myself.InstantTeleport(talker, -14023, 123677, -3112);

} else if (i1 == 2) {
myself.InstantTeleport(talker, 18101, 145936, -3088);

} else if (i1 == 3) {
myself.InstantTeleport(talker, 80905, 56361, -1552);

} else if (i1 == 4) {
myself.InstantTeleport(talker, 108469, 221690, -3592);

} else if (i1 == 5) {
myself.InstantTeleport(talker, 42772, -48062, -792);

} else if (i1 == 6) {
myself.InstantTeleport(talker, 85991, -142234, -1336);

} else {
myself.Say(gg.MakeFString(1600019, "", "", "", "", ""));

}
i1 = i1 * 100000000;
myself.SetMemoStateEx(talker, 255, 1, i0 - i1);

} else if (reply == 4) {
myself.ShowMultisell(707, talker);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam c0, HandlerParam state, HandlerParam party0, HandlerParam i1, HandlerParam i2, HandlerParam c1, HandlerParam i4) {
if (reply == 0) {

} else if (reply == 1) {
if (state == 0) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
if (myself.i_ai9 == 1) {
myself.Shout("파티원 수 : " + gg.IntToStr(i1));

}
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("아이템 삭제");

}
i4 = gg.OwnItemCount(c1, give_item);
myself.DeleteItem1(c1, give_item, i4);

}

}

}
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (talker == c0) {
myself.GiveItem1(c0, give_item, 1);
if (myself.i_ai9 == 1) {
myself.Shout("아이템 주기");

}

}

}
myself.ShowPage(talker, enter_success);

}
	}


}