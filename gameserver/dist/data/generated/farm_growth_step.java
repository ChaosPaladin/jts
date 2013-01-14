package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class farm_growth_step extends warrior_growh_basic {
	protected int FeedID1 = 57;
	protected int SelfBuff = 263979009;
	protected int PhysicalSpecial = 264241153;
	protected int SelfRangeDDMagic = 264306689;
	protected int W_LongRangeDDMagic = 299237382;
	protected int W_ShortRangeDDMagic = 272629766;

	protected void CREATED() {
myself.i_ai4 = 0;
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1) {
if (skill_name_id / 256 * 256 == FeedID1 / 256 * 256) {
myself.i_ai3 = skill_name_id / 256 * 256;
if (myself.i_ai4 == 0) {
myself.AddTimerEx(2001, TakeSocial * 1000 / 30);
myself.i_ai4 = 1;
myself.c_ai0 = attacker;
i0 = 0;
if (skill_name_id / 65536 == myself.i_ai3) {
if (TakeSocial != 0) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 200);

}
i0 = 1;

}
if (gg.Rand(100) < 5) {
i0 = gg.Rand(Rand - 2004 + 1);
i0 = i0 + 2004;
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

}

}

} else {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
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
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001 && myself.i_ai4 == 1 || myself.i_ai4 == 3 && myself.sm.alive != 0) {
i0 = myself.GetDirection(myself.sm);
if (gg.Rand(100) > 50) {
if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(silhouette1, ai_type2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}

} else if (myself.IsInCategory(0, myself.c_ai0.occupation)) {
myself.CreateOnePrivateEx(silhouette_ex, ai_type_ex, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(silhouette_ex2, ai_type_ex2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}
myself.Despawn();

}
	}


}