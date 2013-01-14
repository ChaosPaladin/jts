package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_see_skill extends warrior {
	protected int PhysicalSpecial = 264241153;
	protected int SelfBuff = 263979009;

	protected void CREATED(HandlerParam c0) {
myself.AddTimerEx(2001, 10000);
if (IsTransform == 0) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

} else {
myself.AddTimerEx(2002, 3000);
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, 305594369, 0, 1, 10000);
myself.AddAttackDesire(c0, 1, 500);

}

}
super;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff)) <= 0 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
myself.AddTimerEx(2001, 10000);

}
if (timer_id == 2002) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam skill_name_id) {
if (skill_name_id != 0) {
super;

}
	}


}