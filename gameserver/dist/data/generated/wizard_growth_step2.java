package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_growth_step2 extends wizard_growh_basic {
	protected int SelfBuff = 264110083;

	protected void CREATED() {
myself.i_ai4 = 1;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.i_ai3 = myself.sm.param2;
if (myself.IsNullCreature(myself.c_ai0)) {
myself.Say("수정. 주인이 없습니다");

} else {
myself.AddHateInfo(myself.c_ai0, 100, 0, 1, 1);

}
myself.i_ai2 = 0;
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.c_ai0, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.c_ai0, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.c_ai0, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.c_ai0, 1, 1000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1) {
i0 = 0;
if (skill_name_id / 65536 == myself.i_ai3) {
if (TakeSocial != 0) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 200);

}
i0 = 1;

}
if (i0 == 1) {
if (gg.Rand(100) < 5) {
i0 = gg.Rand(Rand - 2014 + 1);
i0 = i0 + 2014;
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.c_ai0 == attacker) {
myself.i_ai2 = myself.i_ai2 + 1;
i1 = 0;
if (myself.i_ai4 == 1 && myself.c_ai0 == attacker) {
if (gg.Rand(100) <= myself.i_ai2 * 33) {
myself.AddTimerEx(2001, TakeSocial * 1000 / 30);
myself.i_ai4 = 3;

}

} else if (myself.i_ai4 != 3) {
myself.i_ai4 = 2;
i1 = 1;

}

}

}
if (i1 == 1) {

}
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

} else {
super;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001 && myself.i_ai4 == 1 || myself.i_ai4 == 3 && myself.sm.alive != 0) {
i0 = myself.GetDirection(myself.sm);
if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(silhouette1, ai_type2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 10018) {
if (gg.Rand(100) < 20) {
i0 = myself.GetDirection(myself.sm);
myself.CreateOnePrivateEx(silhouette_ex2, ai_type_ex2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);
myself.Despawn();

}

}
super;
	}


}