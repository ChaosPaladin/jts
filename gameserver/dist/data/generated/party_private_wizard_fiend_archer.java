package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_wizard_fiend_archer extends party_private_wizard {
	protected int W_FiendArcher = 272039937;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam skill_name_id) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100 + 300), 0, 1, 1);

} else {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100), 0, 1, 1);

}

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam skill_name_id) {
super;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100 + 300), 0, 1, 1);

} else {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100), 0, 1, 1);

}

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
	}


}