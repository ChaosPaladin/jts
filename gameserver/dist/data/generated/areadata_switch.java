package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class areadata_switch extends default_npc {
	protected String AreaName = "areadata_switch_default";

	protected void CREATED() {
gg.Area_SetOnOff(AreaName, 1);
myself.Say(gg.MakeFString(1010472, "", "", "", "", ""));
super;
	}

	protected void MY_DYING() {
gg.Area_SetOnOff(AreaName, 0);
super;
	}


}