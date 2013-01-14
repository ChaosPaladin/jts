package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_disguise extends warrior {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED() {
myself.i_ai2 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.i_ai2 = 1;
myself.Despawn();

}
	}


}