package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_orc extends lv3_monster {
	protected int DeBuff1 = 262209537;
	protected int DeBuff2 = 262209537;
	protected int DeBuff3 = 262209537;
	protected int PhysicalSpecial1 = 264241153;
	protected int PhysicalSpecial2 = 264241154;
	protected int PhysicalSpecial3 = 264241155;
	protected int BigBodySkill = 5636097;
	protected int NormalBodySkill = 5636097;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.SetEnchantOfWeapon(10);
if (myself.Skill_GetConsumeMP(BigBodySkill) < myself.sm.mp && myself.Skill_GetConsumeHP(BigBodySkill) < myself.sm.hp && myself.Skill_InReuseDelay(BigBodySkill) == 0) {
myself.AddUseSkillDesire(myself.sm, BigBodySkill, 1, 1, 1000000);

}
myself.AddTimerEx(4000, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam f0) {
if (timer_id == 4000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(17039361)) < 0) {
if (myself.i_ai0 == 1) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff1, 1, 1, 1000000);

}
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddAttackDesire(myself.c_ai0, 1, 200);

}
if (myself.i_ai0 == 3) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff2, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(NormalBodySkill) < myself.sm.mp && myself.Skill_GetConsumeHP(NormalBodySkill) < myself.sm.hp && myself.Skill_InReuseDelay(NormalBodySkill) == 0) {
myself.AddUseSkillDesire(myself.sm, NormalBodySkill, 1, 1, 1000000);

}
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddAttackDesire(myself.c_ai0, 1, 200);

}
if (myself.i_ai0 == 5) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(DeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff3) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff3, 1, 1, 1000000);

}
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddAttackDesire(myself.c_ai0, 1, 200);

}

}
myself.AddTimerEx(4000, 1000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(17039361)) >= 0) {
if (myself.Skill_GetAbnormalType(81592321) == myself.Skill_GetAbnormalType(skill_name_id)) {
switch (myself.i_ai0) {
case 0: {
myself.i_ai0 = myself.i_ai0 + 1;
myself.SetEnchantOfWeapon(0);
break;

}
case 1: {
break;

}
case 2: {
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 3: {
break;

}
case 4: {
myself.i_ai0 = myself.i_ai0 + 1;
break;

}
case 5: {
break;

}

}

}

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


}