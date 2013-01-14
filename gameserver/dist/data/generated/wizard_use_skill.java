package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_use_skill extends wizard_behavior {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Probablity = 10000;
	protected int Skill01_Target = 0;
	protected int Skill01_Type = 0;
	protected int Skill01_AttackSplash = 0;
	protected double Skill01_Desire = 1000000000.000000;
	protected int Skill01_Check_Dist = 1;
	protected int Skill01_Dist_Min = 300;
	protected int Skill01_Dist_Max = 2000;
	protected int Skill01_HPTarget = 0;
	protected int Skill01_HighHP = 100;
	protected int Skill01_LowHP = 0;
	protected int Skill01_FString = 0;
	protected int Skill01_FStringRate = 0;
	protected int Skill01_MainAttack = 1;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Probablity = 10000;
	protected int Skill02_Target = 0;
	protected int Skill02_Type = 0;
	protected int Skill02_AttackSplash = 0;
	protected double Skill02_Desire = 1000000000.000000;
	protected int Skill02_Check_Dist = 1;
	protected int Skill02_Dist_Min = 0;
	protected int Skill02_Dist_Max = 300;
	protected int Skill02_HPTarget = 0;
	protected int Skill02_HighHP = 100;
	protected int Skill02_LowHP = 0;
	protected int Skill02_FString = 0;
	protected int Skill02_FStringRate = 0;
	protected int Skill02_MainAttack = 1;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Probablity = 3333;
	protected int Skill03_Target = 0;
	protected int Skill03_Type = 0;
	protected int Skill03_AttackSplash = 0;
	protected double Skill03_Desire = 1000000000.000000;
	protected int Skill03_Check_Dist = 0;
	protected int Skill03_Dist_Min = 0;
	protected int Skill03_Dist_Max = 2000;
	protected int Skill03_HPTarget = 0;
	protected int Skill03_HighHP = 100;
	protected int Skill03_LowHP = 0;
	protected int Skill03_FString = 0;
	protected int Skill03_FStringRate = 0;
	protected int Skill03_MainAttack = 0;
	protected int Skill04_ID = 458752001;
	protected int Skill04_Probablity = 3333;
	protected int Skill04_Target = 0;
	protected int Skill04_Type = 0;
	protected int Skill04_AttackSplash = 0;
	protected double Skill04_Desire = 1000000000.000000;
	protected int Skill04_Check_Dist = 0;
	protected int Skill04_Dist_Min = 0;
	protected int Skill04_Dist_Max = 2000;
	protected int Skill04_HPTarget = 0;
	protected int Skill04_HighHP = 100;
	protected int Skill04_LowHP = 0;
	protected int Skill04_FString = 0;
	protected int Skill04_FStringRate = 0;
	protected int Skill04_MainAttack = 0;
	protected int Skill05_ID = 458752001;
	protected int Skill05_Probablity = 3333;
	protected int Skill05_Target = 0;
	protected int Skill05_Type = 0;
	protected int Skill05_AttackSplash = 0;
	protected double Skill05_Desire = 1000000000.000000;
	protected int Skill05_Check_Dist = 0;
	protected int Skill05_Dist_Min = 0;
	protected int Skill05_Dist_Max = 2000;
	protected int Skill05_HPTarget = 0;
	protected int Skill05_HighHP = 100;
	protected int Skill05_LowHP = 0;
	protected int Skill05_FString = 0;
	protected int Skill05_FStringRate = 0;
	protected int Skill05_MainAttack = 0;
	protected int Skill06_ID = 458752001;
	protected int Skill06_Probablity = 3333;
	protected int Skill06_Target = 0;
	protected int Skill06_Type = 0;
	protected int Skill06_AttackSplash = 0;
	protected double Skill06_Desire = 1000000000.000000;
	protected int Skill06_Check_Dist = 0;
	protected int Skill06_Dist_Min = 0;
	protected int Skill06_Dist_Max = 2000;
	protected int Skill06_HPTarget = 0;
	protected int Skill06_HighHP = 100;
	protected int Skill06_LowHP = 0;
	protected int Skill06_FString = 0;
	protected int Skill06_FStringRate = 0;
	protected int Skill06_MainAttack = 0;

	protected void CREATED() {
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam skill_name_id, HandlerParam f0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (myself.i_ai4 == 0) {
if (IsHealer == 1) {

} else {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill01_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill01_HighHP || attacker.hp / attacker.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill01_Dist_Min || myself.DistFromMe(attacker) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 2 || Skill01_Target == 3) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

}
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill02_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill02_HighHP || attacker.hp / attacker.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill02_Dist_Min || myself.DistFromMe(attacker) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 2 || Skill02_Target == 3) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill03_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill03_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill03_HighHP || attacker.hp / attacker.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill03_Dist_Min || myself.DistFromMe(attacker) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

} else if (Skill03_Target == 2 || Skill03_Target == 3) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

}
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill04_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill04_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill04_HighHP || attacker.hp / attacker.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill04_Dist_Min || myself.DistFromMe(attacker) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

} else if (Skill04_Target == 2 || Skill04_Target == 3) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill04_Dist_Min || myself.DistFromMe(myself.sm) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

}
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill05_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill05_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

} else if (Skill05_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill05_HighHP || attacker.hp / attacker.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill05_Dist_Min || myself.DistFromMe(attacker) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

} else if (Skill05_Target == 2 || Skill05_Target == 3) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill05_Dist_Min || myself.DistFromMe(myself.sm) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

}
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill06_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill06_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

} else if (Skill06_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

} else if (Skill06_Target == 2 || Skill06_Target == 3) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

}

} else if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (myself.i_ai4 == 0) {
if (IsHealer == 1) {

} else {
if (myself.GetLifeTime() > Aggressive_Time) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill01_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill01_HighHP || attacker.hp / attacker.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill01_Dist_Min || myself.DistFromMe(attacker) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill01_HighHP || victim.hp / victim.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(victim) < Skill01_Dist_Min || myself.DistFromMe(victim) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

} else if (Skill01_Target == 3) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

} else if (Skill01_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill01_HighHP || victim.hp / victim.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(victim) < Skill01_Dist_Min || myself.DistFromMe(victim) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

}
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill02_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill02_HighHP || attacker.hp / attacker.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill02_Dist_Min || myself.DistFromMe(attacker) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill02_HighHP || victim.hp / victim.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(victim) < Skill02_Dist_Min || myself.DistFromMe(victim) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

} else if (Skill02_Target == 3) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

} else if (Skill02_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill02_HighHP || victim.hp / victim.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(victim) < Skill02_Dist_Min || myself.DistFromMe(victim) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill03_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill03_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill03_HighHP || attacker.hp / attacker.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill03_Dist_Min || myself.DistFromMe(attacker) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

} else if (Skill03_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill03_HighHP || victim.hp / victim.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(victim) < Skill03_Dist_Min || myself.DistFromMe(victim) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

} else if (Skill03_Target == 3) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

} else if (Skill03_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill03_HighHP || victim.hp / victim.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(victim) < Skill03_Dist_Min || myself.DistFromMe(victim) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

}
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill04_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill04_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill04_HighHP || attacker.hp / attacker.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill04_Dist_Min || myself.DistFromMe(attacker) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

} else if (Skill04_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill04_HighHP || victim.hp / victim.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(victim) < Skill04_Dist_Min || myself.DistFromMe(victim) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

} else if (Skill04_Target == 3) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill04_Dist_Min || myself.DistFromMe(myself.sm) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

} else if (Skill04_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill04_HighHP || victim.hp / victim.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(victim) < Skill04_Dist_Min || myself.DistFromMe(victim) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

}
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill05_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill05_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

} else if (Skill05_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill05_HighHP || attacker.hp / attacker.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill05_Dist_Min || myself.DistFromMe(attacker) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

} else if (Skill05_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill05_HighHP || victim.hp / victim.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(victim) < Skill05_Dist_Min || myself.DistFromMe(victim) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

} else if (Skill05_Target == 3) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill05_Dist_Min || myself.DistFromMe(myself.sm) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

} else if (Skill05_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill05_HighHP || victim.hp / victim.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(victim) < Skill05_Dist_Min || myself.DistFromMe(victim) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

}
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill06_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill06_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

} else if (Skill06_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

} else if (Skill06_Target == 2 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill06_HighHP || victim.hp / victim.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(victim) < Skill06_Dist_Min || myself.DistFromMe(victim) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

} else if (Skill06_Target == 3) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

} else if (Skill06_Target == 4 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill06_HighHP || victim.hp / victim.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(victim) < Skill06_Dist_Min || myself.DistFromMe(victim) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && victim == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(victim, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

}

}

} else if (myself.GetLifeTime() < Aggressive_Time) {

} else if (Party_Type == 0) {
if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0, HandlerParam h0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (Party_Type == 0) {

} else if (myself.i_ai4 == 0) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill01_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill01_HighHP || attacker.hp / attacker.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill01_Dist_Min || myself.DistFromMe(attacker) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill01_HighHP || private.hp / private.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(private) < Skill01_Dist_Min || myself.DistFromMe(private) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 3) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

} else if (Skill01_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill01_HighHP || private.hp / private.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(private) < Skill01_Dist_Min || myself.DistFromMe(private) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill02_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill02_HighHP || attacker.hp / attacker.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill02_Dist_Min || myself.DistFromMe(attacker) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill02_HighHP || private.hp / private.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(private) < Skill02_Dist_Min || myself.DistFromMe(private) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 3) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

} else if (Skill02_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill02_HighHP || private.hp / private.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(private) < Skill02_Dist_Min || myself.DistFromMe(private) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill03_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill03_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill03_HighHP || attacker.hp / attacker.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill03_Dist_Min || myself.DistFromMe(attacker) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

} else if (Skill03_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill03_HighHP || private.hp / private.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(private) < Skill03_Dist_Min || myself.DistFromMe(private) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

} else if (Skill03_Target == 3) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

} else if (Skill03_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill03_HighHP || private.hp / private.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(private) < Skill03_Dist_Min || myself.DistFromMe(private) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill04_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill04_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill04_HighHP || attacker.hp / attacker.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill04_Dist_Min || myself.DistFromMe(attacker) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

} else if (Skill04_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill04_HighHP || private.hp / private.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(private) < Skill04_Dist_Min || myself.DistFromMe(private) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

} else if (Skill04_Target == 3) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill04_Dist_Min || myself.DistFromMe(myself.sm) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

} else if (Skill04_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill04_HighHP || private.hp / private.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(private) < Skill04_Dist_Min || myself.DistFromMe(private) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill05_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill05_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

} else if (Skill05_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill05_HighHP || attacker.hp / attacker.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill05_Dist_Min || myself.DistFromMe(attacker) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

} else if (Skill05_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill05_HighHP || private.hp / private.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(private) < Skill05_Dist_Min || myself.DistFromMe(private) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

} else if (Skill05_Target == 3) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill05_Dist_Min || myself.DistFromMe(myself.sm) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

} else if (Skill05_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill05_HighHP || private.hp / private.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(private) < Skill05_Dist_Min || myself.DistFromMe(private) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

}

}
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (Skill06_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == attacker) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill06_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

} else if (Skill06_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && attacker == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

} else if (Skill06_Target == 2) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill06_HighHP || private.hp / private.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(private) < Skill06_Dist_Min || myself.DistFromMe(private) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

} else if (Skill06_Target == 3) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

} else if (Skill06_Target == 4) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill06_HighHP || private.hp / private.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(private) < Skill06_Dist_Min || myself.DistFromMe(private) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && private == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(private, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(private, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

}

}

} else if (Party_Type == 0) {

} else if (Party_Loyalty == 1 || Party_Loyalty == 2 && private == myself.boss) {
if (IsHealer == 1) {

} else if (MovingAttack == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 1, f0 * ATTACKED_Weight_Point);

}

}

}

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == attacker.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == attacker.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (attacker.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (attacker.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (attacker.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddAttackDesire(attacker, 0, f0 * ATTACKED_Weight_Point);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (IsAggressive == 0) {

} else if (myself.GetLifeTime() >= Aggressive_Time) {
if (myself.i_ai4 == 0) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill01_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill01_HighHP || creature.hp / creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(creature) < Skill01_Dist_Min || myself.DistFromMe(creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 2 || Skill01_Target == 3) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

}
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill02_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill02_HighHP || creature.hp / creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(creature) < Skill02_Dist_Min || myself.DistFromMe(creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 2 || Skill02_Target == 3) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

}
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill03_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == creature) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill03_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill03_HighHP || creature.hp / creature.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(creature) < Skill03_Dist_Min || myself.DistFromMe(creature) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

} else if (Skill03_Target == 2 || Skill03_Target == 3) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill03_Type == 0 || Skill03_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill03_Dist_Min || myself.DistFromMe(h0.creature) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (Skill03_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

}

}
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill04_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == creature) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill04_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill04_HighHP || creature.hp / creature.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(creature) < Skill04_Dist_Min || myself.DistFromMe(creature) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

} else if (Skill04_Target == 2 || Skill04_Target == 3) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill04_Dist_Min || myself.DistFromMe(myself.sm) >= Skill04_Dist_Max) {

} else if (Skill04_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill04_Type == 0 || Skill04_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill04_Dist_Min || myself.DistFromMe(h0.creature) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (Skill04_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

}

}
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill05_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == creature) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill05_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

} else if (Skill05_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill05_HighHP || creature.hp / creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(creature) < Skill05_Dist_Min || myself.DistFromMe(creature) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

} else if (Skill05_Target == 2 || Skill05_Target == 3) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill05_Dist_Min || myself.DistFromMe(myself.sm) >= Skill05_Dist_Max) {

} else if (Skill05_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill05_Type == 0 || Skill05_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill05_Dist_Min || myself.DistFromMe(h0.creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (Skill05_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}

}
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (Skill06_Target == 0) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0 && h0.creature == creature) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill06_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

} else if (Skill06_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill06_HighHP || creature.hp / creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(creature) < Skill06_Dist_Min || myself.DistFromMe(creature) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

} else if (Skill06_Target == 2 || Skill06_Target == 3) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill06_Type == 0 || Skill06_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill06_Dist_Min || myself.DistFromMe(h0.creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (Skill06_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}

}

}

} else {
if (IsAggressive == 0) {

} else if (MovingAttack == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

} else if (myself.InMyTerritory(myself.sm) == 0) {

} else if (myself.GetLifeTime() >= Aggressive_Time) {
myself.AddAttackDesire(creature, 1, 300);

}

} else if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

} else if (myself.InMyTerritory(myself.sm) == 0) {

} else if (myself.GetLifeTime() > Aggressive_Time) {
myself.AddAttackDesire(creature, 0, 300);

}
super;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
c0 = h0.creature;
if (myself.i_ai4 == 0) {
if (Skill02_Check_Dist == 1 && myself.DistFromMe(c0) > Skill02_Dist_Min && myself.DistFromMe(c0) < Skill02_Dist_Max) {
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill02_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

} else if (Skill02_Target == 2 || Skill02_Target == 3) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill02_Type == 0 || Skill02_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill02_Dist_Min || myself.DistFromMe(h0.creature) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (Skill02_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

}

} else if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && h0.creature.hp / h0.creature.max_hp * 100 > Skill01_HighHP || h0.creature.hp / h0.creature.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && h0.creature == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

} else if (Skill01_Target == 2 || Skill01_Target == 3) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Check_Dist == 1 && myself.sm == myself.sm && myself.IsNullCreature(h0.creature) == 0 && Skill01_Type == 0 || Skill01_Type == 2 && h0.creature != myself.sm && myself.DistFromMe(h0.creature) < Skill01_Dist_Min || myself.DistFromMe(h0.creature) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.AddTimerEx(5001, 10000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (Skill01_MainAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

} else {
myself.i_ai4 = 1;
myself.AddAttackDesire(myself.sm, 0, 1000);
myself.AddTimerEx(5001, 10000);

}

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

}

}

}

}
	}


}