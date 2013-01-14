package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_enter_zaken extends citizen {
	protected int Day_InstantZone_ID = 133;
	protected int Day_EnterType_P = 1;
	protected int Day_EnterType_M = 2;
	protected int Night_InstantZone_ID = 114;
	protected int Night_EnterType = 2;
	protected int Day_83_InstantZone_ID = 135;

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.builder_level > 0 && attacker.builder_level <= 3) {
if (gg.OwnItemCount(attacker, 57) == 133) {
myself.InstantZone_Enter(attacker, Day_InstantZone_ID, 0);

} else if (gg.OwnItemCount(attacker, 57) == 1331) {
myself.InstantZone_Enter(attacker, Night_InstantZone_ID, Day_EnterType_P);

} else if (gg.OwnItemCount(attacker, 57) == 1332) {
myself.InstantZone_Enter(attacker, Night_InstantZone_ID, Day_EnterType_M);

} else if (gg.OwnItemCount(attacker, 57) == 114) {
myself.InstantZone_Enter(attacker, Night_InstantZone_ID, 0);

} else if (gg.OwnItemCount(attacker, 57) == 1141) {
myself.InstantZone_Enter(attacker, Night_InstantZone_ID, Night_EnterType);

} else if (gg.OwnItemCount(attacker, 57) == 135) {
myself.InstantZone_Enter(attacker, Day_83_InstantZone_ID, 0);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
gg.SendUIEvent(creature, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (ask == -2124001) {
if (reply == 1) {
if (talker.instant_zone_type_id_in_use > 0) {
myself.InstantZone_Enter(talker, talker.instant_zone_type_id_in_use, 0);
return;

}
if (myself.MPCC_GetMPCCId(talker) < 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (talker == c0) {
myself.InstantZone_Enter(talker, Day_InstantZone_ID, Day_EnterType_P);
return;

} else {
myself.ShowPage(talker, "zaken_enter001a.htm");

}

} else {
myself.ShowPage(talker, "zaken_enter001b.htm");

}

} else {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (talker == c0) {
myself.InstantZone_Enter(talker, Day_InstantZone_ID, Day_EnterType_M);
return;

} else {
myself.ShowPage(talker, "zaken_enter001c.htm");

}

}

} else if (reply == 2) {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
myself.InstantZone_Enter(talker, Night_InstantZone_ID, Night_EnterType);
if (talker == c0) {
i1 = myself.MPCC_GetPartyCount(i0);
if (i1 < 7) {
myself.ShowPage(talker, "zaken_enter001d.htm");

}

} else {
myself.ShowPage(talker, "zaken_enter001c.htm");

}

} else if (reply == 3) {
if (talker.instant_zone_type_id_in_use > 0) {
myself.InstantZone_Enter(talker, talker.instant_zone_type_id_in_use, 0);
return;

}
if (myself.MPCC_GetMPCCId(talker) < 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (talker == c0) {
myself.InstantZone_Enter(talker, Day_83_InstantZone_ID, Day_EnterType_P);
return;

} else {
myself.ShowPage(talker, "zaken_enter001a.htm");

}

} else {
myself.ShowPage(talker, "zaken_enter001b.htm");

}

} else {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (talker == c0) {
myself.InstantZone_Enter(talker, Day_83_InstantZone_ID, Day_EnterType_M);
return;

} else {
myself.ShowPage(talker, "zaken_enter001c.htm");

}

}

}

}
	}


}