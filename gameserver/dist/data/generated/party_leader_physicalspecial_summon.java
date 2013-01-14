package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_physicalspecial_summon extends party_leader {
	protected int Buff = 458752001;
	protected int PhysicalSpecial = 458752001;
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i1, HandlerParam i2) {
if (myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_ai0 < 2 && myself.i_ai1 == 0) {
i1 = gg.Rand(50) - 25;
i2 = gg.Rand(50) - 25;
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + i1), gg.FloatToInt(myself.sm.y + i2), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.i_ai0 = myself.i_ai0 + 1;
myself.i_ai1 = 1;
myself.AddTimerEx(6006, 5 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 6006) {
myself.i_ai1 = 0;

}
super;
	}


}