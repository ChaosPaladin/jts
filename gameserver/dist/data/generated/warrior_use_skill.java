package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_use_skill extends warrior_behavior {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Probablity = 3333;
	protected int Skill01_Target = 0;
	protected int Skill01_Type = 0;
	protected int Skill01_AttackSplash = 0;
	protected double Skill01_Desire = 1000000000.000000;
	protected int Skill01_Check_Dist = 0;
	protected int Skill01_Dist_Min = 0;
	protected int Skill01_Dist_Max = 2000;
	protected int Skill01_HPTarget = 0;
	protected int Skill01_HighHP = 100;
	protected int Skill01_LowHP = 0;
	protected int Skill01_FString = 0;
	protected int Skill01_FStringRate = 0;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Probablity = 3333;
	protected int Skill02_Target = 0;
	protected int Skill02_Type = 0;
	protected int Skill02_AttackSplash = 0;
	protected double Skill02_Desire = 1000000000.000000;
	protected int Skill02_Check_Dist = 0;
	protected int Skill02_Dist_Min = 0;
	protected int Skill02_Dist_Max = 2000;
	protected int Skill02_HPTarget = 0;
	protected int Skill02_HighHP = 100;
	protected int Skill02_LowHP = 0;
	protected int Skill02_FString = 0;
	protected int Skill02_FStringRate = 0;
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

	protected void CREATED() {
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}
if (Skill05_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill05_HighHP || attacker.hp / attacker.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill05_Dist_Min || myself.DistFromMe(attacker) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}
if (Skill06_Target == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0) {
if (myself.GetLifeTime() < Aggressive_Time) {

} else {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

} else if (Skill03_Target == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill03_HighHP || attacker.hp / attacker.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill03_Dist_Min || myself.DistFromMe(attacker) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Target == 1 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill03_HighHP || victim.hp / victim.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(victim) < Skill03_Dist_Min || myself.DistFromMe(victim) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Target == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Target == 3 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill03_HighHP || victim.hp / victim.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(victim) < Skill03_Dist_Min || myself.DistFromMe(victim) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

} else if (Skill06_Target == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 1 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill06_HighHP || victim.hp / victim.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(victim) < Skill06_Dist_Min || myself.DistFromMe(victim) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 3 && Party_Type == 0 || Party_Type == 1 && Party_Loyalty == 0 || Party_Type == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && victim.hp / victim.max_hp * 100 > Skill06_HighHP || victim.hp / victim.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(victim) < Skill06_Dist_Min || myself.DistFromMe(victim) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && victim == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(victim, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (Party_Type == 0) {

} else {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(private, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(private, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(private, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(private, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(private, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == attacker) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

} else if (Skill06_Target == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && attacker.hp / attacker.max_hp * 100 > Skill06_HighHP || attacker.hp / attacker.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(attacker) < Skill06_Dist_Min || myself.DistFromMe(attacker) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && attacker == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 1) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill06_HighHP || private.hp / private.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(private) < Skill06_Dist_Min || myself.DistFromMe(private) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 3) {
if (Party_Type == 1 && Party_Loyalty == 0 || Party_Loyalty == 1 || Party_Type == 1 && Party_Loyalty == 2 && private == myself.boss || Party_Type == 2 && private != myself.boss) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && private.hp / private.max_hp * 100 > Skill06_HighHP || private.hp / private.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(private) < Skill06_Dist_Min || myself.DistFromMe(private) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && private == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(private, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0) {
if (IsAggressive == 0) {

} else if (myself.GetLifeTime() < Aggressive_Time) {

} else {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 0, Skill01_Desire);

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

} else if (Skill01_Target == 2) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill01_Dist_Min || myself.DistFromMe(myself.sm) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 0, Skill02_Desire);

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

} else if (Skill02_Target == 2) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill02_Dist_Min || myself.DistFromMe(myself.sm) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill03_ID, 0, 0, Skill03_Desire);

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

} else if (Skill03_Target == 2) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill03_Dist_Min || myself.DistFromMe(myself.sm) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill04_ID, 0, 0, Skill04_Desire);

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

} else if (Skill04_Target == 2) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill04_Dist_Min || myself.DistFromMe(myself.sm) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}
if (Skill05_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill05_HighHP || creature.hp / creature.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(creature) < Skill05_Dist_Min || myself.DistFromMe(creature) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill05_ID, 0, 0, Skill05_Desire);

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

} else if (Skill05_Target == 2) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill05_Dist_Min || myself.DistFromMe(myself.sm) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == creature) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}
if (Skill06_Target == 1) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && creature.hp / creature.max_hp * 100 > Skill06_HighHP || creature.hp / creature.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(creature) < Skill06_Dist_Min || myself.DistFromMe(creature) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && creature == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill06_ID, 0, 0, Skill06_Desire);

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

} else if (Skill06_Target == 2) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.sm) < Skill06_Dist_Min || myself.DistFromMe(myself.sm) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam f1) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill01_HighHP || speller.hp / speller.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(speller) < Skill01_Dist_Min || myself.DistFromMe(speller) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill02_HighHP || speller.hp / speller.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(speller) < Skill02_Dist_Min || myself.DistFromMe(speller) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill03_HighHP || speller.hp / speller.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(speller) < Skill03_Dist_Min || myself.DistFromMe(speller) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill04_HighHP || speller.hp / speller.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(speller) < Skill04_Dist_Min || myself.DistFromMe(speller) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}
if (Skill05_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill05_HighHP || speller.hp / speller.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(speller) < Skill05_Dist_Min || myself.DistFromMe(speller) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}
if (Skill06_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill06_HighHP || speller.hp / speller.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(speller) < Skill06_Dist_Min || myself.DistFromMe(speller) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 0, Skill06_Desire);

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

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
if (Skill01_ID != 458752001) {
if (Skill01_Probablity > 0) {
if (Skill01_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill01_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

}

}

}

} else if (Skill01_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill01_Probablity) {
if (Skill01_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill01_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill01_LowHP || Skill01_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill01_HighHP || speller.hp / speller.max_hp * 100 < Skill01_LowHP) {

} else if (Skill01_Check_Dist == 1 && myself.DistFromMe(speller) < Skill01_Dist_Min || myself.DistFromMe(speller) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

} else if (Skill01_Type == 1) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 2) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 1, Skill01_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 0, Skill01_Desire);

}

}

}

}

} else if (Skill01_Type == 3) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill01_ID, 1, 0, Skill01_Desire);

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

} else if (Skill01_Type == 0 || Skill01_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill01_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill01_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill01_Dist_Max) {

} else if (Skill01_Type == 0) {
if (Skill01_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, Skill01_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, Skill01_Desire);

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
if (Skill02_ID != 458752001) {
if (Skill02_Probablity > 0) {
if (Skill02_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill02_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

}

}

}

} else if (Skill02_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill02_Probablity) {
if (Skill02_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill02_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill02_LowHP || Skill02_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill02_HighHP || speller.hp / speller.max_hp * 100 < Skill02_LowHP) {

} else if (Skill02_Check_Dist == 1 && myself.DistFromMe(speller) < Skill02_Dist_Min || myself.DistFromMe(speller) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

} else if (Skill02_Type == 1) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 2) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 1, Skill02_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill02_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 0, Skill02_Desire);

}

}

}

}

} else if (Skill02_Type == 3) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill02_ID, 1, 0, Skill02_Desire);

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

} else if (Skill02_Type == 0 || Skill02_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill02_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill02_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill02_Dist_Max) {

} else if (Skill02_Type == 0) {
if (Skill02_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, Skill02_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, Skill02_Desire);

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
if (Skill03_ID != 458752001) {
if (Skill03_Probablity > 0) {
if (Skill03_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill03_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

}

}

}

} else if (Skill03_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill03_Probablity) {
if (Skill03_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill03_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill03_LowHP || Skill03_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill03_HighHP || speller.hp / speller.max_hp * 100 < Skill03_LowHP) {

} else if (Skill03_Check_Dist == 1 && myself.DistFromMe(speller) < Skill03_Dist_Min || myself.DistFromMe(speller) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

} else if (Skill03_Type == 1) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 2) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 1, Skill03_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill03_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 0, 0, Skill03_Desire);

}

}

}

}

} else if (Skill03_Type == 3) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill03_ID, 1, 0, Skill03_Desire);

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

} else if (Skill03_Type == 0 || Skill03_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill03_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill03_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill03_Dist_Max) {

} else if (Skill03_Type == 0) {
if (Skill03_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 1, Skill03_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, Skill03_Desire);

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
if (Skill04_ID != 458752001) {
if (Skill04_Probablity > 0) {
if (Skill04_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill04_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

}

}

}

} else if (Skill04_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill04_Probablity) {
if (Skill04_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill04_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill04_LowHP || Skill04_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill04_HighHP || speller.hp / speller.max_hp * 100 < Skill04_LowHP) {

} else if (Skill04_Check_Dist == 1 && myself.DistFromMe(speller) < Skill04_Dist_Min || myself.DistFromMe(speller) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

} else if (Skill04_Type == 1) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 2) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 1, Skill04_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill04_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 0, 0, Skill04_Desire);

}

}

}

}

} else if (Skill04_Type == 3) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill04_ID, 1, 0, Skill04_Desire);

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

} else if (Skill04_Type == 0 || Skill04_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill04_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill04_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill04_Dist_Max) {

} else if (Skill04_Type == 0) {
if (Skill04_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 1, Skill04_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_ID, 0, 0, Skill04_Desire);

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
if (Skill05_ID != 458752001) {
if (Skill05_Probablity > 0) {
if (Skill05_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill05_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

}

}

}

}
if (Skill05_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill05_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill05_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill05_Probablity) {
if (Skill05_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill05_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill05_LowHP || Skill05_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill05_HighHP || speller.hp / speller.max_hp * 100 < Skill05_LowHP) {

} else if (Skill05_Check_Dist == 1 && myself.DistFromMe(speller) < Skill05_Dist_Min || myself.DistFromMe(speller) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

} else if (Skill05_Type == 1) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 2) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 1, Skill05_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill05_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 0, 0, Skill05_Desire);

}

}

}

}

} else if (Skill05_Type == 3) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill05_ID, 1, 0, Skill05_Desire);

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

} else if (Skill05_Type == 0 || Skill05_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill05_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill05_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill05_Dist_Max) {

} else if (Skill05_Type == 0) {
if (Skill05_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 1, Skill05_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill05_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill05_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill05_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 0, 0, Skill05_Desire);

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
if (Skill06_ID != 458752001) {
if (Skill06_Probablity > 0) {
if (Skill06_Target == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == speller) {
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 > Skill06_HighHP || myself.top_desire_target.hp / myself.top_desire_target.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.top_desire_target == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

}

}

}

}
if (Skill06_Target == 1) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
if (gg.Skill_IsMagic(Skill06_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Skill_IsMagic(Skill06_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else if (gg.Rand(10000) < Skill06_Probablity) {
if (Skill06_HPTarget == 0 && myself.sm.hp / myself.sm.max_hp * 100 > Skill06_HighHP || myself.sm.hp / myself.sm.max_hp * 100 < Skill06_LowHP || Skill06_HPTarget == 1 && speller.hp / speller.max_hp * 100 > Skill06_HighHP || speller.hp / speller.max_hp * 100 < Skill06_LowHP) {

} else if (Skill06_Check_Dist == 1 && myself.DistFromMe(speller) < Skill06_Dist_Min || myself.DistFromMe(speller) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && speller == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

} else if (Skill06_Type == 1) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 2) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 1, Skill06_Desire);

}

}

} else if (MovingAttack == 0) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(Skill06_ID)) <= 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 0, 0, Skill06_Desire);

}

}

}

}

} else if (Skill06_Type == 3) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(speller, Skill06_ID, 1, 0, Skill06_Desire);

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

} else if (Skill06_Type == 0 || Skill06_Type == 2 && myself.IsNullCreature(myself.top_desire_target) == 0 && myself.sm == myself.sm && myself.top_desire_target != myself.sm && Skill06_Check_Dist == 1 && myself.DistFromMe(myself.top_desire_target) < Skill06_Dist_Min || myself.DistFromMe(myself.top_desire_target) >= Skill06_Dist_Max) {

} else if (Skill06_Type == 0) {
if (Skill06_Desire > 0.000000) {
if (MovingAttack == 1) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 1, Skill06_Desire);

}

} else if (MovingAttack == 0) {
if (myself.Skill_GetConsumeMP(Skill06_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill06_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill06_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill06_ID, 0, 0, Skill06_Desire);

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
super;
	}


}