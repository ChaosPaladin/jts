package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_hold_ddmagic extends warrior_hold_ddmagic {
	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(creature, DDMagic, 0, 1, 1000000);

}

}
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddAttackDesire(creature, 0, 1 * 50);

}
	}


}