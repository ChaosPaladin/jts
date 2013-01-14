package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_growth_step4 extends wizard_growh_basic {
	protected int HoldMagic = 265224193;
	protected int SelfRangeDDMagic = 264306689;
	protected int SelfBuff = 263979009;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai4 = 1;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.i_ai3 = myself.sm.param2;
if (myself.IsNullCreature(myself.c_ai0)) {
myself.Say("수정. 주인이 없습니다");

} else {
myself.AddHateInfo(myself.c_ai0, 100, 0, 1, 1);

}
myself.i_ai2 = 0;
myself.BroadcastScriptEvent(10018, gg.GetIndexFromCreature(myself.sm), 700);
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam h0) {
super;
if (myself.i_ai1 == 1) {
if (myself.top_desire_target == attacker) {
myself.i_ai2 = 1;

}

} else {
myself.AddTimerEx(2001, 5000);
myself.i_ai1 = 1;

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature != attacker) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.i_ai1 = 0;
myself.i_ai2 = 0;

} else {
if (myself.i_ai2 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && gg.Rand(100) < 50) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(HoldMagic)) <= 0) {
if (myself.Skill_GetConsumeMP(HoldMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HoldMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HoldMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, HoldMagic, 0, 1, 1000000);

}

}

}

}
myself.AddTimerEx(2001, 5000);
myself.i_ai2 = 0;

}

}
super;
	}


}