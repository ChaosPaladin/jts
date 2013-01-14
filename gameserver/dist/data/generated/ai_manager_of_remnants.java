package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_manager_of_remnants extends citizen {
	protected int FieldCycle = 2;

	protected void TALK_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam party0, HandlerParam c0, HandlerParam i2, HandlerParam i3, HandlerParam c1) {
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam party0, HandlerParam c0, HandlerParam i2, HandlerParam i3, HandlerParam c1, HandlerParam fhtml0) {
if (ask == 693) {
if (reply == 10) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) != 0) {
if (talker.transformID == 260 || talker.transformID == 8 || talker.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}

} else {
i3 = party0.member_count;
for (i2 = 0; i2 < i3; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (c1.transformID == 260 || c1.transformID == 8 || c1.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}

}

}

}
if (gg.GetStep_FieldCycle(FieldCycle) == 2) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 != 2) {
myself.ShowPage(talker, "manager_of_remnants_q0693_10.htm");
return;

}
if (gg.GetMemoState(talker, 693) == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) != 0) {
myself.ShowPage(talker, "manager_of_remnants_q0693_06.htm");
return;

} else {
c0 = myself.GetLeaderOfParty(party0);
if (talker != c0) {
myself.FHTML_SetFileName(fhtml0, "manager_of_remnants_q0693_07.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);
return;

}
i3 = party0.member_count;
for (i2 = 0; i2 < i3; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 693) == 1) {

} else {
myself.FHTML_SetFileName(fhtml0, "manager_of_remnants_q0693_08.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
myself.InstantZone_Enter(talker, gg.GetMemoStateEx(talker, 693, 1) + 121, 1);

}

} else if (gg.GetMemoState(talker, 693) == 2 && gg.GetMemoStateEx(talker, 693, 1) >= 2) {
myself.InstantZone_Enter(talker, gg.GetMemoStateEx(talker, 693, 1) + 121, 1);

}

} else {
myself.ShowPage(talker, "manager_of_remnants_q0693_16.htm");

}

}

}
super;
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
if (reply == 0) {
myself.ShowPage(talker, "manager_of_remnants_q0693_17.htm");

} else if (reply == 1) {
if (gg.HaveMemo(talker, 693) == 1 && gg.GetMemoState(talker, 693) == 1) {
if (myself.IsNullCreature(talker) == 0) {
i2 = gg.GetMemoStateEx(talker, 693, 1);
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.SetMemoState(c0, 693, 2);
myself.SetMemoStateEx(c0, 693, 1, i2);
myself.ShowPage(c0, "manager_of_remnants_q0693_20.htm");

}

}

}

}

} else if (gg.HaveMemo(talker, 693) == 1 && gg.GetMemoState(talker, 693) == 2) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
if (talker != c0) {
myself.ShowPage(c0, "manager_of_remnants_q0693_20.htm");

} else {
i0 = party0.member_count;
i2 = gg.GetMemoStateEx(talker, 693, 1);
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.SetMemoState(c0, 693, 2);
myself.SetMemoStateEx(c0, 693, 1, i2);
myself.ShowPage(c0, "manager_of_remnants_q0693_20.htm");

}

}

}

} else {
myself.ShowPage(c0, "manager_of_remnants_q0693_20.htm");

}

}

}
	}


}