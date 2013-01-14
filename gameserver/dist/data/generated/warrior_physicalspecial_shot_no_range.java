package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_shot_no_range extends warrior_physicalspecial_shot_range {
	protected String AreaName1 = "warrior_physicalspecial_shot_no_range_default_1";
	protected String AreaName2 = "warrior_physicalspecial_shot_no_range_default_2";
	protected String AreaName3 = "warrior_physicalspecial_shot_no_range_default_3";
	protected String AreaName4 = "warrior_physicalspecial_shot_no_range_default_4";

	protected void CREATED() {
gg.Area_SetOnOff(AreaName1, 1);
gg.Area_SetOnOff(AreaName2, 1);
gg.Area_SetOnOff(AreaName3, 1);
gg.Area_SetOnOff(AreaName4, 1);
super;
	}

	protected void MY_DYING() {
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 0);
gg.Area_SetOnOff(AreaName4, 0);
super;
	}


}