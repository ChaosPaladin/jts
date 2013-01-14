package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_berserker extends party_leader {
	protected int Fury = 264568833;
	protected int MaxRoarCount = 1;

	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.i_ai1 < MaxRoarCount && private != myself.sm) {
if (myself.Skill_GetConsumeMP(myself.i_ai1) < myself.sm.mp && myself.Skill_GetConsumeHP(myself.i_ai1) < myself.sm.hp && myself.Skill_InReuseDelay(myself.i_ai1) == 0) {
myself.AddUseSkillDesire(myself.sm, myself.i_ai1, 1, 1, 1000000);

}
myself.i_ai1 = myself.i_ai1 + 1;

}
super;
	}


}