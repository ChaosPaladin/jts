package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_ddmagic_physicalspecial extends warrior {
	protected int W_LongRangeDDMagic = 272039937;
	protected int PhysicalSpecialRange = 264241153;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) > 200 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker && myself.DistFromMe(attacker) < 200) {
if (myself.Skill_GetConsumeMP(PhysicalSpecialRange) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecialRange) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecialRange) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecialRange, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecialRange) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecialRange) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecialRange) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecialRange, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED() {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) > 200 && myself.top_desire_target.is_pc == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, W_LongRangeDDMagic, 0, 1, 1000000);

}

}

}
super;
	}


}