package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wizard_saint extends party_leader_wizard {
	protected int W_LongRangeDDMagic1 = 272039937;
	protected int W_LongRangeDDMagic2 = 272039937;
	protected int SelfRangeBuff = 263979009;
	protected int RangeDeBuff = 272039937;

	protected void CREATED() {
myself.AddTimerEx(1005, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1005) {
if (myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}

} else if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}

}
myself.AddTimerEx(1005, 1000 * 60 * 2);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam party0, HandlerParam skill_name_id) {
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
if (myself.i_ai0 == 0) {
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
if (gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0 || myself.top_desire_target != attacker) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic2) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic2, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(RangeDeBuff) == 0) {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

} else if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
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
myself.AddAttackDesire(attacker, 1, f0 * 100);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(W_LongRangeDDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic2, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDeBuff) == 0) {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0, HandlerParam party0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
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
if (myself.DistFromMe(h0.creature) < 100) {
myself.AddFleeDesire(h0.creature, 1000000);

} else if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic1) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic1) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic1, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}
	}


}