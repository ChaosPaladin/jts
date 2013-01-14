package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_knight extends lv3_monster {
	protected int DefenceMode = 65601546;
	protected int CrazyMode = 65601546;
	protected int PhysicalSpecial1 = 264241153;
	protected int PhysicalSpecial2 = 264241154;
	protected int PhysicalSpecial3 = 264241155;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (skill_name_id / 256 * 256 == 1835009 / 256 * 256 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}
myself.AddTimerEx(4000, 5000 + 1000 * gg.Rand(6));

}
if (skill_name_id / 256 * 256 == 1179649 / 256 * 256 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}
myself.AddTimerEx(4000, 5000 + 1000 * gg.Rand(6));

}
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
if (myself.i_ai0 == 1 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && myself.i_ai1 == 0) {
if (gg.Rand(100) < 80) {
myself.i_ai0 = 2;
myself.i_ai1 = 1;
if (myself.Skill_GetConsumeMP(CrazyMode) < myself.sm.mp && myself.Skill_GetConsumeHP(CrazyMode) < myself.sm.hp && myself.Skill_InReuseDelay(CrazyMode) == 0) {
myself.AddUseSkillDesire(myself.sm, CrazyMode, 1, 1, 1000000);

}
myself.AddTimerEx(4001, 5000 + 1000 * gg.Rand(6));

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4000) {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}

}

}
if (timer_id == 4001) {
if (myself.i_ai0 == 2) {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(CrazyMode) < myself.sm.mp && myself.Skill_GetConsumeHP(CrazyMode) < myself.sm.hp && myself.Skill_InReuseDelay(CrazyMode) == 0) {
myself.AddUseSkillDesire(myself.sm, CrazyMode, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}

}

}
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire, HandlerParam skill_name_id) {
return;
if (gg.Rand(100) < 90 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(DefenceMode) < myself.sm.mp && myself.Skill_GetConsumeHP(DefenceMode) < myself.sm.hp && myself.Skill_InReuseDelay(DefenceMode) == 0) {
myself.AddUseSkillDesire(myself.sm, DefenceMode, 1, 1, 1000000);

}
myself.AddTimerEx(4000, 5000 + 1000 * gg.Rand(6));

}
	}


}