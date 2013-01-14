package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_corpse_necro_long extends warrior {
	protected int DDMagic1 = 262209537;
	protected int DDMagic2 = 262209537;
	protected int PhysicalSpecial = 262209537;

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (creature.alive == 0) {
if (myself.p_state == 3 && gg.Rand(100) < 33 && myself.DistFromMe(creature) < 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(creature, DDMagic2, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) > 100) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 40) {
if (myself.Skill_GetConsumeMP(DDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic1, 0, 1, 1000000);

}

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (myself.DistFromMe(attacker) > 100) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}


}