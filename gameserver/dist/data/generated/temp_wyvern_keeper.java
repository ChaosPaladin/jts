package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class temp_wyvern_keeper extends wyvern_keeper {
	protected String fnMyLord = "wkeeper001_temp.htm";
	protected String fnSSQDusk = "wkeeper001_dusk.htm";
	protected String fnNotMyLord = "wkeeper002.htm";
	protected String fnStriderHelp = "wkeeper003_temp.htm";
	protected String fnAfterRide = "wkeeper004.htm";
	protected String fnStriderNotReady = "wkeeper005.htm";
	protected String fnNotEnoughFee = "wkeeper006.htm";

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0, HandlerParam c0) {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);
myself.ShowFHTML(talker, fhtml0);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 0) {
myself.FHTML_SetFileName(fhtml0, fnMyLord);
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.FHTML_SetInt(fhtml0, "ride_wyvern_level", ride_wyvern_level);
myself.FHTML_SetInt(fhtml0, "ride_wyvern_fee", ride_wyvern_fee);
myself.ShowFHTML(talker, fhtml0);

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
	}


}