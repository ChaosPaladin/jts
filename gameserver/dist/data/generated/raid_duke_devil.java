package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_duke_devil extends warrior_basic {
	protected int Buff = 458752001;
	protected int silhouette = 1025541;
	protected String ai_type = "duke_devil_s_explosion";

	protected void CREATED(HandlerParam maker0) {
myself.i_ai3 = 0;
myself.i_ai2 = 0;
myself.EffectMusic(myself.sm, 8000, "Rm01_A");
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_ai3 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, 1000000);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = 1;

} else if (myself.sm.hp < myself.sm.max_hp * 0.100000 && myself.i_ai3 == 1) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, 1000000);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = 2;

}
if (gg.Rand(10000) < 10) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 200, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) - 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) + 140, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(10);
super;
	}


}