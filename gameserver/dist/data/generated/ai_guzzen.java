package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_guzzen extends warrior_use_skill {
	protected void MY_DYING() {
myself.CreateOnePrivateEx(1032301, "npc_wanderingghost_kendal", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
super;
	}


}