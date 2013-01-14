package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_hold_ddmagic extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int DDMagic = 262209537;
	protected int SkillRange = 500;

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker != myself.top_desire_target && myself.DistFromMe(myself.top_desire_target) > SkillRange) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1 * 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1 * 50);

}

}
	}

	protected void USE_SKILL_FINISHED() {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (SkillRange < myself.DistFromMe(myself.top_desire_target)) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
myself.AddTimerEx(2001, 1000);
return;

}
if (myself.top_desire_target.is_pc == 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 1, 1000000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (SkillRange < myself.DistFromMe(myself.top_desire_target)) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
myself.AddTimerEx(2001, 1000);
return;

}
if (myself.top_desire_target.is_pc == 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 1, 1000000);

}

}

}

}
	}


}