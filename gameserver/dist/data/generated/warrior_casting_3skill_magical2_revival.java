package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_magical2_revival extends warrior_casting_3skill_magical2 {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 1) {
myself.c_ai0 = myself.top_desire_target;

}

}
	}

	protected void MY_DYING() {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.c_ai0), 0);
	}


}