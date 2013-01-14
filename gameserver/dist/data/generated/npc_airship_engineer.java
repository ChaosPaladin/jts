package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_airship_engineer extends citizen {
	protected String engineerSay1 = "engineer_recon003.htm";
	protected String engineerSay2 = "engineer_recon004.htm";
	protected String engineerSay3 = "engineer_recon005.htm";
	protected int EnergyStone = 13277;
	protected int AirshipConfirm = 13559;

	protected void CREATED() {
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0, HandlerParam pledge0) {
if (ask == -1724) {
if (reply == 2) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
i0 = pledge0.skill_level;
if (talker.is_pledge_master != 1 || i0 < 5) {
myself.ShowPage(talker, "engineer_recon003.htm");

} else if (gg.OwnItemCount(talker, AirshipConfirm) > 0) {
myself.ShowPage(talker, "engineer_recon005.htm");

} else if (pledge0.airship_count > 0) {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800276, "", "", "", "", ""));

} else if (gg.OwnItemCount(talker, EnergyStone) >= 10) {
myself.DeleteItem1(talker, EnergyStone, 10);
myself.GiveItem1(talker, AirshipConfirm, 1);

} else {
myself.ShowPage(talker, "engineer_recon004.htm");

}

} else {
myself.ShowPage(talker, "engineer_recon003.htm");

}

}

}
	}


}