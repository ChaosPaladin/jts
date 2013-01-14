package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_saint_transform extends warrior_physicalspecial {
	protected int PhysicalSpecial = 264241153;
	protected int SelfRangeDDMagic = 263979009;
	protected int Dispell = 272039937;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(100) < 90 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 90 && myself.i_ai0 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Dispell) < myself.sm.mp && myself.Skill_GetConsumeHP(Dispell) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(Dispell) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Dispell, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.top_desire_target, Dispell, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.top_desire_target, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(Dispell) < myself.sm.mp && myself.Skill_GetConsumeHP(Dispell) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(Dispell) == 0) {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}
myself.i_ai0 = 1;

} else if (gg.Rand(100) < 80 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 40 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && myself.i_ai0 < 1) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Dispell) < myself.sm.mp && myself.Skill_GetConsumeHP(Dispell) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(Dispell) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Dispell, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.top_desire_target, Dispell, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.top_desire_target, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(Dispell) < myself.sm.mp && myself.Skill_GetConsumeHP(Dispell) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(Dispell) == 0) {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}
myself.i_ai0 = 2;

}

}
super;
	}


}