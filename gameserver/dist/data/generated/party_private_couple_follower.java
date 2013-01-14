package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_couple_follower extends party_private {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm.master.alive == 0 && myself.i_ai0 == 0) {
if (myself.sm.hp > myself.sm.max_hp * 0.700000) {
if (gg.IsNull(myself.top_desire_target) == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z + 10), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 1);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z + 10), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 2);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 5), gg.FloatToInt(myself.sm.y + 5), gg.FloatToInt(myself.sm.z + 10), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 3);
myself.i_ai0 = 1;

}

}

}
	}


}