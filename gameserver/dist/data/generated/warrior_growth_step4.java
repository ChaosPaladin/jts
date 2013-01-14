package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_growth_step4 extends warrior_growh_basic {
	protected int SelfBuff = 263979009;
	protected int PhysicalSpecial = 264241153;
	protected int DDMagic = 264306689;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai4 = 1;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.i_ai3 = myself.sm.param2;
if (myself.IsNullCreature(myself.c_ai0)) {
myself.Say("수정. 주인이 없습니다");

} else {
myself.AddAttackDesire(myself.c_ai0, 1, 100);

}
myself.i_ai2 = 0;
myself.BroadcastScriptEvent(10018, gg.GetIndexFromCreature(myself.sm), 700);
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (myself.i_ai1 == 1) {
if (myself.top_desire_target == attacker) {
myself.i_ai2 = 1;

}

} else {
myself.AddTimerEx(2001, 5000);
myself.i_ai1 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.i_ai1 = 0;
myself.i_ai2 = 0;

} else {
if (myself.i_ai2 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && gg.Rand(100) < 50) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(DDMagic)) <= 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 1, 1000000);

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