package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_ranger extends lv3_monster {
	protected int ArrowDefenceMode = 65601546;
	protected int ArrowNormalMode = 0;
	protected int PhysicalSpecial1 = 264241153;
	protected int PhysicalSpecial2 = 264241154;
	protected int PhysicalSpecial3 = 264241155;
	protected int CheckSkill1 = 0;
	protected int CheckSkill2 = 0;
	protected int CheckSkill3 = 0;
	protected int CheckSkill4 = 0;
	protected int CheckSkill5 = 0;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
myself.i_ai0 = 1;
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
i0 = gg.Rand(3);
switch (i0) {
case 0: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000);

}
break;

}
case 1: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000);

}
break;

}
case 2: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial3) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial3) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial3) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial3, 0, 1, 1000);

}
break;

}

}

}

}

}
if (skill_name_id / 256 * 256 == CheckSkill1 / 256 * 256 && myself.i_ai0 == 1 && CheckSkill1 != 0) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}
myself.i_ai1 = 5;

}
if (skill_name_id / 256 * 256 == CheckSkill2 / 256 * 256 && myself.i_ai0 == 1 && CheckSkill2 != 0) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}
myself.i_ai1 = 3;

}
if (skill_name_id / 256 * 256 == CheckSkill3 / 256 * 256 && myself.i_ai0 == 1 && CheckSkill3 != 0) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}
myself.i_ai1 = 3;

}
if (skill_name_id / 256 * 256 == CheckSkill4 / 256 * 256 && myself.i_ai0 == 1 && CheckSkill4 != 0) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}
myself.i_ai1 = 3;

}
if (skill_name_id / 256 * 256 == CheckSkill5 / 256 * 256 && myself.i_ai0 == 1 && CheckSkill5 != 0) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}
myself.i_ai1 = 3;

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
i0 = skill_name_id / 256 * 256;
if (i0 == ArrowDefenceMode / 256 * 256) {
if (myself.i_ai0 == 0) {
if (myself.i_ai1 != 0) {
myself.AddTimerEx(4004, 1000 * myself.i_ai1);

} else {
myself.AddTimerEx(4004, 1000 * 3);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4000 || timer_id == 4001 || timer_id == 4002 || timer_id == 4003 || timer_id == 4004 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(ArrowDefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowDefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowDefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowDefenceMode, 1, 1, 1000000);

}
if (ArrowNormalMode) {
if (myself.Skill_GetConsumeMP(ArrowNormalMode) < myself.sm.mp && myself.Skill_GetConsumeHP(ArrowNormalMode) < myself.sm.hp && myself.Skill_InReuseDelay(ArrowNormalMode) == 0) {
myself.AddUseSkillDesire(myself.sm, ArrowNormalMode, 1, 1, 1000000);

}

}

}
super;
	}


}