package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_supply_officer extends citizen {
	protected int fortress_id = 0;
	protected int fee_power_up_lv1 = 100000;
	protected int fee_power_up_lv2 = 250000;
	protected String fnGuardLevel = "fortress_supply_lv.htm";
	protected int hasPledgePower = 19;
	protected String fnIsUnderSiege = "";
	protected String fnNotMyLord = "";
	protected String fnNoAuthority = "";
	protected String fnNoCastleContract = "";
	protected String fnAfterSetFacility = "";
	protected String fnTreasureLevel = "";
	protected String fnMedalLevel = "";
	protected String ai_type1 = "";
	protected String ai_type2 = "";
	protected String ai_type3 = "";
	protected String ai_type4 = "";
	protected String ai_type5 = "";
	protected String ai_type6 = "";
	protected int silhouette1 = 1020130;
	protected int silhouette2 = 1020130;
	protected int silhouette3 = 1020130;
	protected int silhouette4 = 1020130;
	protected int silhouette5 = 1020130;
	protected int silhouette6 = 1020130;
	protected int silhouette = 1020130;
	protected int tr_x = 0;
	protected int tr_y = 0;
	protected int tr_z = 0;
	protected int item_medal = 0;
	protected String fnUpgradeSuccess = "";
	protected String fnUpgradeFail = "";
	protected String fnGetMedalSuccess = "";
	protected String fnGetMedalFail = "";
	protected String fnNoReward = "fortress_no_treasure.htm";
	protected String fnGetTreasureSuccess = "";
	protected String fnGetTreasureFail = "";
	protected String fnNoTreasure = "fortress_no_treasure.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam fhtml0) {
if (ask == -272) {
if (myself.IsMyLord(talker) == 0) {
myself.ShowPage(talker, fnNoAuthority);
return;

}
if (reply == 0) {
i0 = myself.Fortress_GetOwnerRewardCycleCount(fortress_id);
myself.FHTML_SetFileName(fhtml0, fnMedalLevel);
myself.FHTML_SetStr(fhtml0, "medal_level", gg.IntToStr(i0));
myself.ShowFHTML(talker, fhtml0);
return;

} else if (reply == 1) {
i0 = myself.Fortress_GetOwnerRewardCycleCount(fortress_id);
if (i0 == 0) {
myself.ShowPage(talker, fnNoReward);
return;

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, item_medal, i0);
myself.Fortress_OwnerRewardTaken(myself.sm.id, talker.id, fortress_id, item_medal, i0);
myself.ShowPage(talker, fnGetMedalSuccess);
return;

}

}

}
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
if (ask == -271) {
if (myself.IsMyLord(talker) == 0) {
myself.ShowPage(talker, fnNoAuthority);
return;

}
if (reply == 0) {
i0 = myself.Fortress_GetCastleTreasureLevel(fortress_id);
myself.FHTML_SetFileName(fhtml0, fnTreasureLevel);
myself.FHTML_SetStr(fhtml0, "treasure_level", gg.IntToStr(i0));
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 1) {
i0 = myself.Fortress_GetCastleTreasureLevel(fortress_id);
switch (i0) {
case 1: {
myself.CreateOnePrivateEx(silhouette1, ai_type1, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(silhouette2, ai_type2, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(silhouette3, ai_type3, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 4: {
myself.CreateOnePrivateEx(silhouette4, ai_type4, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 5: {
myself.CreateOnePrivateEx(silhouette5, ai_type5, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 6: {
myself.CreateOnePrivateEx(silhouette6, ai_type6, 0, 0, tr_x, tr_y, tr_z, 0, 0, 0, 0);
break;

}
case 0: {
myself.ShowPage(talker, fnNoTreasure);
break;

}

}
if (i0 > 0) {
myself.Fortress_CastleTreasureTaken(myself.sm.id, talker.id, fortress_id);
myself.ShowPage(talker, fnGetTreasureSuccess);

}

}

}
if (ask == -297) {
if (reply == 0) {
i0 = 0;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.Fortress_SetFacility(talker, 1, 0);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, fnGuardLevel);
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 1);
myself.FHTML_SetStr(fhtml0, "guard_level", gg.IntToStr(i0));
myself.ShowFHTML(talker, fhtml0);

}

} else if (ask == -298) {
if (reply == 1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 1);
if (i0 > 0) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_power_up_lv1;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 1, 1);
myself.ShowPage(talker, fnAfterSetFacility);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 2) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 1);
if (i0 > 1) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_power_up_lv2;
if (gg.OwnItemCount(talker, 57) >= i0) {
if (gg.Fortress_GetFacilityLevel(fortress_id, 1) >= 1) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 1, 2);
myself.ShowPage(talker, fnAfterSetFacility);

} else {
myself.ShowPage(talker, "fortress_not_lv1.htm");

}

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

} else if (reply == 3) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 1);
if (i0 >= 2) {
myself.ShowPage(talker, "fortress_already_upgraded.htm");
return;

}
i0 = fee_power_up_lv1 + fee_power_up_lv2;
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
myself.Fortress_SetFacility(talker, 1, 2);
myself.ShowPage(talker, fnAfterSetFacility);

} else {
myself.ShowPage(talker, "fortress_not_enough_money.htm");

}

}

}
	}

	protected void FORTRESS_UPGRADE_FACILITY_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (reply == 1) {
myself.ShowPage(talker, fnUpgradeSuccess);

} else if (reply == 0) {
myself.ShowPage(talker, fnUpgradeFail);

}
	}


}