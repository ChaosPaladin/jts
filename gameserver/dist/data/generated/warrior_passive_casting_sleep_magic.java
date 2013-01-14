package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_passive_casting_sleep_magic extends warrior_casting_sleep_magic {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.p_state == 1 && i6 < 2) {
if (myself.Skill_GetConsumeMP(SleepMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SleepMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SleepMagic) == 0) {
myself.AddUseSkillDesire(creature, SleepMagic, 0, 1, 1000000);

}

}
super;
	}


}