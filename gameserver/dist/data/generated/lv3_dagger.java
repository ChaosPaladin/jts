package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_dagger extends lv3_monster {
	protected int WeakModeTrue = 263979009;
	protected int WeakModeFalse = 263979009;
	protected int Buff = 263979009;
	protected int PhysicalSpecial1 = 264241153;
	protected int PhysicalSpecial2 = 264241154;
	protected int PhysicalSpecial3 = 264241155;

	protected void CREATED() {
myself.AddTimerEx(4000, 15000);
if (myself.sm.param1) {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff, 0, 1, 1000000);

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam f0) {
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
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4000) {
if (gg.Rand(100) < 33) {
if (gg.Rand(100) < 60) {
if (myself.Skill_GetConsumeMP(WeakModeFalse) < myself.sm.mp && myself.Skill_GetConsumeHP(WeakModeFalse) < myself.sm.hp && myself.Skill_InReuseDelay(WeakModeFalse) == 0) {
myself.AddUseSkillDesire(myself.sm, WeakModeFalse, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(WeakModeTrue) < myself.sm.mp && myself.Skill_GetConsumeHP(WeakModeTrue) < myself.sm.hp && myself.Skill_InReuseDelay(WeakModeTrue) == 0) {
myself.AddUseSkillDesire(myself.sm, WeakModeTrue, 1, 1, 1000000);

}

}
myself.AddTimerEx(4000, 15000);

}
super;
	}


}