package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_guard_officer extends citizen {
	protected int fortress_id = 0;
	protected int fee_photocannon = 300000;
	protected int fee_scout = 300000;
	protected int fee_door = 400000;
	protected int fee_guard_reinforce_lv1 = 100000;
	protected int fee_guard_reinforce_lv2 = 250000;
	protected String fnGuardLevel = "fortress_guard_lv.htm";
	protected int hasPledgePower = 19;
	protected String fnIsUnderSiege = "";
	protected String fnNotMyLord = "";
	protected String fnNoAuthority = "";
	protected String fnNoCastleContract = "";
	protected String fnAfterSetFacility = "";
	protected String fnUpgradeSuccess = "";
	protected String fnUpgradeFail = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam fhtml0) {
if (gg.Fortress_GetContractStatus(fortress_id) != 1) {
myself.ShowPage(talker, fnNoCastleContract);
return;

} else if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, hasPledgePower) && talker.pledge_id != 0 && myself.Castle_GetPledgeId() == talker.pledge_id) {
if (myself.Castle_IsUnderSiege()) {
myself.ShowPage(talker, fnIsUnderSiege);
return;

}

} else {
myself.ShowPage(talker, fnNoAuthority);
return;

}
if (ask == -291) {
if (reply == -1) {
i0 = 0;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.Fortress_ResetFacility(talker);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, fnGuardLevel);
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 0);
myself.FHTML_SetStr(fhtml0, "reinforce_level", gg.IntToStr(i0));
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 3);
myself.FHTML_SetStr(fhtml0, "photocannon_level", gg.IntToStr(i0));
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 4);
myself.FHTML_SetStr(fhtml0, "scout_level", gg.IntToStr(i0));
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 2);
myself.FHTML_SetStr(fhtml0, "door_level", gg.IntToStr(i0));
myself.ShowFHTML(talker, fhtml0);

}

} else if (ask == -292) {
if (reply == 1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 3);
if (i0 > 0) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_photocannon;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 3, 1);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

}

} else if (ask == -293) {
if (reply == 1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 4);
if (i0 > 0) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_scout;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 4, 1);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

}

} else if (ask == -294) {
if (reply == 1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 2);
if (i0 > 0) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_door;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 2, 1);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

}

} else if (ask == -295) {
if (reply == 1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 0);
if (i0 > 0) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_guard_reinforce_lv1;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 0, 1);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 2) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 0);
if (i0 > 1) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_guard_reinforce_lv2;
if (gg.OwnItemCount(talker, 57) >= i0) {
if (gg.Fortress_GetFacilityLevel(fortress_id, 0) >= 1) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 0, 2);

} else {
myself.ShowPage(talker, "fortress_not_lv1.htm");

}

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 3) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 0);
if (i0 >= 2) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_guard_reinforce_lv1 + fee_guard_reinforce_lv2;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 0, 2);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

}

}
	}

	protected void FORTRESS_UPGRADE_FACILITY_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (reply == 1) {
myself.ShowPage(talker, fnAfterSetFacility);

} else if (reply == 0) {
myself.ShowPage(talker, fnUpgradeFail);

}
	}


}