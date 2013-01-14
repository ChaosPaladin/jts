package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_keym_pavion extends warrior_basic {
	protected int WaterDeBuff = 378273793;

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void NO_DESIRE() {
if (myself.GetLifeTime() > 9) {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(3000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.c_ai0 = creature;
if (gg.GetMemoState(myself.c_ai0, 128) < 4) {
myself.SetVisible(0);

} else {
myself.SetVisible(1);
myself.AddTimerEx(6000, 1000);
myself.i_ai0 = 1;

}

}
super;
	}

	protected void ATTACKED() {
myself.LookNeighbor(2000);
if (myself.i_ai0 == 0) {
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1000) {
myself.LookNeighbor(3000);
myself.AddTimerEx(1000, 30 * 1000);

}
if (timer_id == 6000) {
if (myself.Skill_GetConsumeMP(WaterDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WaterDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WaterDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, WaterDeBuff, 0, 1, 1000000);

}
myself.AddTimerEx(6000, 60000);

}
	}


}