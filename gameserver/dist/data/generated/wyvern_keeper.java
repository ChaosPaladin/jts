package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wyvern_keeper extends citizen {
	protected String fnMyLord = "wkeeper001.htm";
	protected String fnSSQDusk = "wkeeper001_dusk.htm";
	protected String fnNotMyLord = "wkeeper002.htm";
	protected String fnStriderHelp = "wkeeper003.htm";
	protected String fnAfterRide = "wkeeper004.htm";
	protected String fnStriderNotReady = "wkeeper005.htm";
	protected String fnNotEnoughFee = "wkeeper006.htm";
	protected int ride_wyvern_level = 55;
	protected int ride_wyvern_fee = 25;
	protected int SsqEffect = 1;

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0, HandlerParam c0) {
if (myself.IsMyLord(talker)) {
if (SsqEffect == 1) {
if (myself.GetSSQSealOwner(3) == 1 && myself.GetSSQStatus() == 3) {
myself.FHTML_SetFileName(fhtml0, fnSSQDusk);

} else {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnNotMyLord);

}
myself.ShowFHTML(talker, fhtml0);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 0) {
if (myself.IsMyLord(talker)) {
if (SsqEffect == 1) {
if (myself.GetSSQSealOwner(3) == 1 && myself.GetSSQStatus() == 3) {
myself.FHTML_SetFileName(fhtml0, fnSSQDusk);

} else {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnNotMyLord);

}
myself.ShowFHTML(talker, fhtml0);

}
if (ask == -17) {
if (reply == 1) {
if (SsqEffect == 0) {
myself.FHTML_SetFileName(fhtml0, "hephaeston003.htm");

} else {
myself.FHTML_SetFileName(fhtml0, fnStriderHelp);

}
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);

} else if (reply == 2) {
if (myself.GetSSQSealOwner(3) == 1 && myself.GetSSQStatus() == 3) {
myself.FHTML_SetFileName(fhtml0, fnSSQDusk);

} else if (talker.yongma_type == 1 && talker.strider_level >= ride_wyvern_level) {
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
	}


}