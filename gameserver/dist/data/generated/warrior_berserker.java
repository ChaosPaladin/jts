package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_berserker extends warrior {
	protected int Fury = 264568833;
	protected int MaxRoarCount = 1;

	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void CLAN_DIED(HandlerParam victim, HandlerParam i0) {
if (myself.i_ai1 < MaxRoarCount && victim != myself.sm) {
i0 = Fury + myself.i_ai1;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.AddUseSkillDesire(myself.sm, i0, 1, 1, 1000000);

}
myself.i_ai1 = myself.i_ai1 + 1;

}
super;
	}


}