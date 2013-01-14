package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_approach_revival extends warrior_casting_3skill_approach {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED() {
myself.i_ai4 = -1;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 1) {
myself.i_ai4 = gg.GetIndexFromCreature(myself.top_desire_target);

} else if (myself.IsInCategory(12, myself.top_desire_target.npc_class_id) && myself.IsNullCreature(myself.top_desire_target.master) == 0) {
myself.i_ai4 = gg.GetIndexFromCreature(myself.top_desire_target);

}

}
	}

	protected void MY_DYING(HandlerParam i0) {
if (myself.i_ai4 != -1) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, myself.i_ai4, 0);

}
	}


}