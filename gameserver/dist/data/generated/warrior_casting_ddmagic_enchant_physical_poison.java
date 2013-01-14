package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_ddmagic_enchant_physical_poison extends warrior_casting_enchant_physical_poison {
	protected int DDMagic = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && i0 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
i0 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100 && i0 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
super;
	}


}