package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_special_bloody_queen extends warrior_aggressive_casting_curse {
	protected int DDMagic = 262209537;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i1 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 300 && myself.i_ai0 == 0) {
if (i1 < 80) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

} else if (myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && i1 < 70 || i1 < 30) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

} else if (i1 < 10) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i1) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i1 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (i1 < 40) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i1) {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm)) {
i1 = gg.Rand(100);
if (myself.DistFromMe(creature) > 100 && myself.i_ai0 == 0) {
if (i1 < 20) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(creature, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
super;
	}


}