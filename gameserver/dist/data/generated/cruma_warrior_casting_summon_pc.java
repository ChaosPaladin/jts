package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_warrior_casting_summon_pc extends warrior_pa_casting_summon_pc {
	protected void USE_SKILL_FINISHED(HandlerParam success) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 15 && myself.top_desire_target == myself.c_ai0) {
if (PhysicalSpecial != 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}


}