package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_steward extends steward {
	protected int fortress_id = 0;
	protected int InContract = 0;
	protected int ContractCastle = 0;
	protected String fnHi1 = "";
	protected String fnHi2 = "";
	protected String fileSetName = "FortressDeco";
	protected int fstr_own_time = 1300135;
	protected String fnFortressInfo = "fortress_steward022.htm";
	protected String fnFortressInfoIndep = "fortress_steward023.htm";
	protected int fstr_parent_castle = 1001000;
	protected int fstr_no_parent = 1300136;
	protected int fstr_contract_status = 1300123;
	protected int dominion_id = 81;

	protected void CREATED() {
myself.RegisterTeleporterType(1, 0);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam fhtml0) {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnIsUnderSiege);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam s1) {
super;
if (ask == -272) {
if (reply == 0) {
i0 = gg.Fortress_GetAvailableOwnMinutes(fortress_id);
i1 = i0 / 60;
i2 = i0 % 60;
i4 = gg.Fortress_GetParentCastleId(fortress_id);
if (i4 > 0 && i4 < 10) {
i5 = gg.Fortress_GetContractStatus(fortress_id);
i6 = gg.Fortress_GetRentCost(fortress_id);
i7 = gg.Fortress_GetNextRewardRemainTime(fortress_id);
myself.FHTML_SetFileName(fhtml0, fnFortressInfo);
myself.FHTML_SetStr(fhtml0, "ParentCastle", gg.MakeFString(fstr_parent_castle + i4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "ContractStatus", gg.MakeFString(fstr_contract_status + i5, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "RentCost", i6 * 2);
myself.FHTML_SetInt(fhtml0, "NextDueHour", i7 / 60);
myself.FHTML_SetInt(fhtml0, "NextDueMin", i7 % 60);

} else {
myself.FHTML_SetFileName(fhtml0, fnFortressInfoIndep);
myself.FHTML_SetStr(fhtml0, "ParentCastle", gg.MakeFString(fstr_no_parent, "", "", "", "", ""));

}
myself.FHTML_SetStr(fhtml0, "time_remained", gg.MakeFString(fstr_own_time, gg.IntToStr(i1), gg.IntToStr(i2), "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}

}
	}


}