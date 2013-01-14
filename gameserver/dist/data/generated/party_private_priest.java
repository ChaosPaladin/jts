package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_priest extends party_private {
	protected int Buff = 263979009;

	protected void CREATED() {
myself.AddTimerEx(5001, 20000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 1 && myself.IsInCategory(12, creature.npc_class_id) == 0 && creature == myself.boss) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(creature, Buff, 1, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5001) {
myself.LookNeighbor(300);
myself.AddTimerEx(5001, 20000);

}
super;
	}


}