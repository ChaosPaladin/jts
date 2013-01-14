package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_split extends warrior {
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED() {
myself.i_ai1 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0) {
i0 = gg.Skill_IsMagic(skill_name_id);
if (i0 == 0 && myself.i_ai1 == 0) {
if (skill_name_id != 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 40), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 40), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 60), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.i_ai1 = 1;
myself.Despawn();

}

}
super;
	}


}