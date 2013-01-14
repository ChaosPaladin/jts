package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_area extends warrior_physicalspecial {
	protected String AreaName = "warrior_physicalspecial_area_default";
	protected int physicalspecial = 458752001;

	protected void CREATED() {
gg.Area_SetOnOff(AreaName, 1);
super;
	}

	protected void MY_DYING() {
gg.Area_SetOnOff(AreaName, 0);
super;
	}


}