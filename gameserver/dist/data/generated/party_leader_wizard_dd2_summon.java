package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wizard_dd2_summon extends party_leader_wizard_dd2 {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";
	protected int silhouette2 = 1020130;
	protected String ai_type2 = "warrior";
	protected int silhouette3 = 1020130;
	protected String ai_type3 = "warrior";

	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i1, HandlerParam i2) {
super;
if (myself.i_ai1 == 0) {
i1 = gg.Rand(50) - 25;
i2 = gg.Rand(50) - 25;
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + i1), gg.FloatToInt(myself.sm.y + i2), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
i1 = gg.Rand(100) - 50;
i2 = gg.Rand(100) - 50;
myself.CreateOnePrivateEx(silhouette2, ai_type2, 0, 0, gg.FloatToInt(myself.sm.x + i1), gg.FloatToInt(myself.sm.y + i2), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
i1 = gg.Rand(100) - 50;
i2 = gg.Rand(100) - 50;
myself.CreateOnePrivateEx(silhouette3, ai_type3, 0, 0, gg.FloatToInt(myself.sm.x + i1), gg.FloatToInt(myself.sm.y + i2), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.i_ai1 = 1;

}
	}


}