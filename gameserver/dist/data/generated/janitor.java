package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class janitor extends pet_manager {
	protected String fnHi = "defaultAgitInfo.htm";
	protected String fnFeudInfo = "defaultAgitInfo.htm";
	protected String fnNoFeudInfo = "noAgitInfo.htm";
	protected String fnOwner = "AgitJanitorHi.htm";
	protected String fnWyvernOwner = "WyvernAgitJanitorHi.htm";
	protected String fnNoAuthority = "noAuthority.htm";
	protected String fnDoor = "AgitDoor.htm";
	protected String fnAfterDoorOpen = "AgitJanitorAfterDoorOpen.htm";
	protected String fnAfterDoorClose = "AgitJanitorAfterDoorClose.htm";
	protected String fnMyLord = "wkeeper001_temp.htm";
	protected String fnNotMyLord = "wkeeper002_Agit.htm";
	protected String fnStriderHelp = "wkeeper003_temp.htm";
	protected String fnAfterRide = "wkeeper004.htm";
	protected String fnStriderNotReady = "wkeeper005.htm";
	protected String fnNotEnoughFee = "wkeeper006.htm";
	protected int ride_wyvern_level = 55;
	protected int ride_wyvern_fee = 25;
	protected int Is_Wyvern = 0;

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 11) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (Is_Wyvern == 1) {
myself.FHTML_SetFileName(fhtml0, fnWyvernOwner);

} else {
myself.FHTML_SetFileName(fhtml0, fnOwner);

}
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.ShowFHTML(talker, fhtml0);

} else {
if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnFeudInfo);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.FHTML_SetInt(fhtml0, "current_tax_rate", myself.Residence_GetTaxRateCurrent());

} else {
myself.FHTML_SetFileName(fhtml0, fnNoFeudInfo);

}

}
myself.ShowFHTML(talker, fhtml0);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0, HandlerParam s1) {
if (ask == 0 || ask == -201 && reply == 0) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 11) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (Is_Wyvern == 1) {
myself.FHTML_SetFileName(fhtml0, fnWyvernOwner);

} else {
myself.FHTML_SetFileName(fhtml0, fnOwner);

}
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.ShowFHTML(talker, fhtml0);

} else {
if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnFeudInfo);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.FHTML_SetInt(fhtml0, "current_tax_rate", myself.Residence_GetTaxRateCurrent());

} else {
myself.FHTML_SetFileName(fhtml0, fnNoFeudInfo);

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (ask == -203) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 11) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
switch (reply) {
case 1: {
myself.Castle_GateOpenClose(0);
myself.ShowPage(talker, fnAfterDoorOpen);
break;

}
case 2: {
myself.Castle_GateOpenClose(1);
myself.ShowPage(talker, fnAfterDoorClose);
break;

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

}
if (ask == -204) {
if (myself.IsMyLord(talker)) {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

}
if (ask == -17) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, fnStriderHelp);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

} else if (reply == 2) {
if (talker.yongma_type == 1 && talker.strider_level >= ride_wyvern_level) {
if (myself.IsMyLord(talker) && gg.OwnItemCount(talker, 1460) >= ride_wyvern_fee) {
myself.DeleteItem1(talker, 1460, ride_wyvern_fee);
myself.RideWyvern(talker, 1012621);
myself.FHTML_SetFileName(fhtml0, fnAfterRide);

} else {
myself.FHTML_SetFileName(fhtml0, fnNotEnoughFee);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnStriderNotReady);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

}
myself.ShowFHTML(talker, fhtml0);

}
super;
	}


}