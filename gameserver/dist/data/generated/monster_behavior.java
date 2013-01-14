package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class monster_behavior extends monster_ai {
	protected int IsAggressive = 0;
	protected double Aggressive_Time = 7.000000;
	protected int AttackRange = 0;
	protected int IsHealer = 0;
	protected int MovingAttack = 1;
	protected int MoveArounding = 1;
	protected int SoulShot = 0;
	protected int SoulShotRate = 0;
	protected int SpiritShot = 0;
	protected int SpiritShotRate = 0;
	protected int SpiritShotSpeedBonus = 0;
	protected int SpiritShotHealBonus = 0;
	protected int LongRangeGuardRate = -1;
	protected String SuperPointName = "-1";
	protected int SuperPointMethod = 0;
	protected int SuperPointDesire = 2000;
	protected int FreewayID = -1;
	protected int FreewayMethod = 0;
	protected int FreewayDesire = 2000;
	protected int FieldCycle = -1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 0;
	protected int Threshold_Level_Min = -1;
	protected int Threshold_Level_Max = 100;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;
	protected int InzoneRestriction = 0;
	protected int InzoneFinish = 0;
	protected int PrivateFollowBoss = 1;
	protected int SeeCreatureAttackerTime = -1;

	protected void NO_DESIRE() {
if (MoveArounding == 0) {

} else if (MovingAttack == 1) {
if (Party_Type == 1 && myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (OutOfTerritory == 0) {

} else if (OutOfTerritory == 1) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 10000000);

} else if (OutOfTerritory == 2) {
myself.Despawn();

}
	}

	protected void CREATED() {
if (ShoutMsg1 == 1 && ShoutMsg1_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg1_FString, "", "", "", "", ""));

}
if (ShoutMsg2 == 1 && ShoutMsg2_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg2_FString, "", "", "", "", ""));

}
if (ShoutMsg3 == 1 && ShoutMsg3_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg3_FString, "", "", "", "", ""));

}
if (ShoutMsg4 == 1 && ShoutMsg4_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg4_FString, "", "", "", "", ""));

}
if (gg.IsSameString(SuperPointName, "-1") == 0 && SuperPointDesire > 0) {
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);

}
if (FreewayID > -1 && FreewayDesire > 0) {
myself.AddMoveFreewayDesire(FreewayID, FreewayMethod, FreewayDesire);

}
if (MoveAroundSocial > 0 && myself.sm.hp > 0) {
myself.AddTimerEx(1101, Social0_Timer);

}
if (MoveAroundSocial1 > 0 && myself.sm.hp > 0) {
myself.AddTimerEx(1102, Social1_Timer);

}
if (MoveAroundSocial2 > 0 && myself.sm.hp > 0) {
myself.AddTimerEx(1103, Social2_Timer);

}
if (Party_Type == 2) {
myself.CreatePrivates(Privates);

} else if (Party_Type == 1 && PrivateFollowBoss == 1) {
if (myself.IsMyBossAlive()) {
myself.AddTimerEx(1005, 120 * 1000);
myself.AddTimerEx(1006, 20000);

}

}
if (AttackRange == 1) {
myself.i_ai4 = 0;
myself.c_ai4 = gg.GetNullCreature();

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_id, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i11) {
if (ShoutMsg1 == 2 && ShoutMsg1_FString > 0 && ShoutMsg1_Probablity > gg.Rand(10000)) {
myself.Say(gg.MakeFString(ShoutMsg1_FString, "", "", "", "", ""));

}
if (ShoutMsg2 == 2 && ShoutMsg2_FString > 0 && ShoutMsg2_Probablity > gg.Rand(10000)) {
myself.Say(gg.MakeFString(ShoutMsg2_FString, "", "", "", "", ""));

}
if (ShoutMsg3 == 2 && ShoutMsg3_FString > 0 && ShoutMsg3_Probablity > gg.Rand(10000)) {
myself.Say(gg.MakeFString(ShoutMsg3_FString, "", "", "", "", ""));

}
if (ShoutMsg4 == 2 && ShoutMsg4_FString > 0 && ShoutMsg4_Probablity > gg.Rand(10000)) {
myself.Say(gg.MakeFString(ShoutMsg4_FString, "", "", "", "", ""));

}
if (AttackRange == 1) {
if (myself.DistFromMe(attacker) < 100 && myself.i_ai4 == 0) {
myself.i_ai4 = 1;
myself.c_ai4 = attacker;
myself.AddTimerEx(5001, 10000);

}

}
if (SoulShot != 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6553601)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(269811713))) {
if (gg.Rand(100) < SoulShotRate) {
myself.UseSoulShot(SoulShot);

}

}

}
if (SpiritShot != 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6553601)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(269811713))) {
if (gg.Rand(100) < SpiritShotRate) {
myself.UseSpiritShot(SpiritShot, SpiritShotSpeedBonus, SpiritShotHealBonus);

}

}

}
i11 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(330563587));
if (LongRangeGuardRate == -1 || skill_id == 28 || skill_id == 680 || skill_id == 51 || skill_id == 511 || skill_id == 15 || skill_id == 254 || skill_id == 1069 || skill_id == 1097 || skill_id == 1042 || skill_id == 1072 || skill_id == 1170 || skill_id == 352 || skill_id == 358 || skill_id == 1394 || skill_id == 695 || skill_id == 115 || skill_id == 1083 || skill_id == 1160 || skill_id == 1164 || skill_id == 1201 || skill_id == 1206 || skill_id == 1222 || skill_id == 1223 || skill_id == 1224 || skill_id == 1092 || skill_id == 65 || skill_id == 106 || skill_id == 122 || skill_id == 127 || skill_id == 1049 || skill_id == 1064 || skill_id == 1071 || skill_id == 1074 || skill_id == 1169 || skill_id == 1263 || skill_id == 1269 || skill_id == 352 || skill_id == 353 || skill_id == 1336 || skill_id == 1337 || skill_id == 1338 || skill_id == 1358 || skill_id == 1359 || skill_id == 402 || skill_id == 403 || skill_id == 412 || skill_id == 1386 || skill_id == 1394 || skill_id == 1396 || skill_id == 485 || skill_id == 501 || skill_id == 1445 || skill_id == 1446 || skill_id == 1447 || skill_id == 522 || skill_id == 531 || skill_id == 1481 || skill_id == 1482 || skill_id == 1483 || skill_id == 1484 || skill_id == 1485 || skill_id == 1486 || skill_id == 695 || skill_id == 696 || skill_id == 716 || skill_id == 775 || skill_id == 1511 || skill_id == 792 || skill_id == 1524 || skill_id == 1529) {

} else if (LongRangeGuardRate > 0) {
if (myself.DistFromMe(attacker) > 150) {
if (i11 <= 0 && gg.Rand(100) < LongRangeGuardRate) {
myself.AddUseSkillDesire(myself.sm, 330563587, 1, 1, 10000000000);

}

} else if (i11 <= 0) {

} else {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(330563587));

}

}
if (attacker.is_pc != 0) {
if (FieldCycle == 1) {
if (myself.GetOneTimeQuestFlag(attacker, 133) == 1 || myself.GetOneTimeQuestFlag(attacker, 130) == 1) {

} else {
myself.InstantTeleport(attacker, -16434, 208803, -3691);

}

}

} else if (myself.IsInCategory(12, attacker.npc_class_id)) {
if (FieldCycle == 1) {
if (myself.IsNullCreature(attacker.master) == 0) {
if (myself.GetOneTimeQuestFlag(attacker.master, 133) == 1 || myself.GetOneTimeQuestFlag(attacker.master, 130) == 1) {

} else {
myself.InstantTeleport(attacker.master, -16434, 208803, -3691);

}

} else {
myself.InstantTeleport(attacker.master, -16434, 208803, -3691);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1005) {
if (Party_Type == 1 && PrivateFollowBoss == 1) {
if (myself.IsMyBossAlive() == 0) {
if (myself.IsInCombatMode(myself.sm) == 0 && myself.p_state != 10) {
myself.Despawn();
return;

}

}
if (myself.InMyTerritory(myself.sm) == 0 && myself.IsMyBossAlive() != 0 && myself.p_state != 3) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));
myself.RemoveAllAttackDesire();

}

}
myself.AddTimerEx(1005, 120 * 1000);

} else if (timer_id == 1006) {
if (Party_Type == 1 && PrivateFollowBoss == 1) {
if (myself.IsMyBossAlive() == 0) {
if (myself.IsInCombatMode(myself.sm) == 0 && myself.p_state != 10) {
myself.Despawn();
return;

}

}

}

}
if (timer_id == 1004) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();

} else {
myself.AddTimerEx(1004, 20000);

}

}
if (timer_id == 1101) {
if (MoveAroundSocial > 0) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 9 && myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0) {
if (Social0_Probablity > gg.Rand(10000)) {
myself.AddEffectActionDesire(myself.sm, Social0, MoveAroundSocial, 10000000);

}

}
myself.AddTimerEx(1101, Social0_Timer);

}

}
if (timer_id == 1102) {
if (MoveAroundSocial1 > 0) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 9 && myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0) {
if (Social1_Probablity > gg.Rand(10000)) {
myself.AddEffectActionDesire(myself.sm, Social1, MoveAroundSocial1, 10000000);

}

}
myself.AddTimerEx(1102, Social1_Timer);

}

}
if (timer_id == 1103) {
if (MoveAroundSocial2 > 0) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 9 && myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0) {
if (Social2_Probablity > gg.Rand(10000)) {
myself.AddEffectActionDesire(myself.sm, Social2, MoveAroundSocial2, 10000000);

}

}
myself.AddTimerEx(1103, Social2_Timer);

}

}
if (timer_id == 5001) {
if (myself.i_ai4 == 1) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.AddFleeDesire(myself.c_ai4, 10000000);
myself.i_ai4 = 0;
myself.c_ai4 = gg.GetNullCreature();

}

}

}
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam state, HandlerParam success, HandlerParam s0) {
if (gg.IsSameString(SuperPointName, "") == 0 && SuperPointDesire > 0) {
if (success == 1) {
if (SuperPointMethod == 0) {

}

}
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, 50);

}
if (FreewayID > -1 && FreewayDesire > 0) {
if (success == 1) {
if (SuperPointMethod == 0) {

}

}
myself.AddMoveFreewayDesire(FreewayID, FreewayMethod, 50);

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (Party_Type == 0) {
return;

} else if (Party_Type == 1) {
if (PrivateFollowBoss == 1) {
if (myself.IsMyBossAlive() == 0) {
if (private == myself.boss) {
myself.AddTimerEx(1006, 20000);

}

}

}

} else if (Party_Type == 2) {
if (private != myself.sm && private.respawn_time != 0) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1) {
if (FieldCycle != -1 && FieldCycle_Condition == 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
c1 = myself.GetLastAttacker();
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
if (i1 >= Threshold_Point_Min && i1 <= Threshold_Point_Max) {
if (myself.IsNullCreature(c1) == 0) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, c1);

} else {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, myself.sm);

}

}
if (myself.sm.class_id == 1018465) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
i2 = gg.GetStep_FieldCycle(FieldCycle);
if (i1 < 1010000 || i2 < 5) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
gg.SetStep_FieldCycle(FieldCycle, 5, 1, c0);

} else {
gg.SetStepWithoutActor_FieldCycle(FieldCycle, 5, 1);

}

}

}

}

}
if (ShoutMsg1 == 3 && ShoutMsg1_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg1_FString, "", "", "", "", ""));

}
if (ShoutMsg2 == 3 && ShoutMsg2_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg2_FString, "", "", "", "", ""));

}
if (ShoutMsg3 == 3 && ShoutMsg3_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg3_FString, "", "", "", "", ""));

}
if (ShoutMsg4 == 3 && ShoutMsg4_FString > 0) {
myself.Say(gg.MakeFString(ShoutMsg4_FString, "", "", "", "", ""));

}
if (InzoneRestriction == 1) {
myself.InstantZone_MarkRestriction();

}
if (InzoneFinish == 1) {
myself.InstantZone_Finish(5);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0) {
if (FieldCycle == 1) {
if (myself.GetOneTimeQuestFlag(creature, 133) == 1 || myself.GetOneTimeQuestFlag(creature, 130) == 1) {

} else {
myself.InstantTeleport(creature, -16434, 208803, -3691);

}

}

} else if (myself.IsInCategory(12, creature.npc_class_id)) {
if (FieldCycle == 1) {
if (myself.IsNullCreature(creature.master) == 0) {
if (myself.GetOneTimeQuestFlag(creature.master, 133) == 1 || myself.GetOneTimeQuestFlag(creature.master, 130) == 1) {

} else {
myself.InstantTeleport(creature.master, -16434, 208803, -3691);

}

} else {
myself.InstantTeleport(creature.master, -16434, 208803, -3691);

}

}

}
super;
	}


}