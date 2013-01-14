package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_standard extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected String RaidSpawnMusic = "Rm01_A";
	protected int doSummonNPC = 0;
	protected int RootingManage = 1;
	protected int SSQLoserTeleport = 0;
	protected int SSQTelPosX = 0;
	protected int SSQTelPosY = 0;
	protected int SSQTelPosZ = 0;
	protected String AdvMakerGludio = "gludio08_npc1921_101m1";
	protected String AdvMakerDion = "dion09_npc2022_101m1";
	protected String AdvMakerGiran = "giran11_npc2222_101m1";
	protected String AdvMakerOren = "oren17_npc2219_101m1";
	protected String AdvMakerAden = "aden13_npc2418_101m1";
	protected String AdvMakerInnadril = "innadril09_npc2324_101m1";
	protected String AdvMakerGodard = "godard02_npc2416_101m1";
	protected String AdvMakerRune = "rune02_npc2116_101m1";
	protected String AdvMakerSchuttgart = "schuttgart20_npc2213_101m1";
	protected int InzoneRestriction = 0;
	protected int InzoneFinish = 0;
	protected int CouldDespawn = 0;
	protected int DespawnTime = 15;
	protected int attack_weight_value = 20000;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;
	protected int SeeCreatureAttackerTime = -1;
	protected int DBPosCheck = 0;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED(HandlerParam reply) {
if (DBPosCheck == 1 && reply == 1 && myself.InMyTerritory(myself.sm) == 0) {
myself.InstantRandomTeleportInMyTerritory();

}
myself.EffectMusic(myself.sm, 8000, RaidSpawnMusic);
myself.i_quest3 = 0;
myself.i_quest4 = myself.GetCurrentTick();
myself.AddTimerEx(1001, 1000);
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.AddAttackDesire(target.master, 1, 500);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
if (myself.InMyTerritory(myself.sm) == 0 && gg.Rand(2) < 1 && myself.p_state != 3) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
if (RootingManage == 1) {
if (myself.i_quest3 == 1 && myself.GetCurrentTick() > myself.i_quest4 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800010, "", "", "", "", ""));
myself.i_quest3 = 0;

}

}
if (CouldDespawn == 1) {
i0 = myself.GetCurrentTick() - myself.i_quest4;
if (i0 > DespawnTime * 60) {
if (InzoneRestriction == 1 || InzoneFinish == 1) {
myself.InstantZone_Finish(5);

}
myself.Despawn();

}

}
myself.AddTimerEx(1001, 60 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam c0, HandlerParam c1, HandlerParam i9, HandlerParam i10) {
myself.i_quest4 = myself.GetCurrentTick();
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (attacker.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (attacker.is_pc == 1) {
if (i0 == 0 && gg.GetSSQPart(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(attacker) != 1) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(attacker) != 2) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (i0 == 0 && gg.GetSSQPart(attacker.master) == 0) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(attacker.master) != 1) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(attacker.master) != 2) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (attacker.is_pc == 1) {
if (gg.GetSSQPart(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (gg.GetSSQPart(attacker.master) == 0) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (RootingManage == 1) {
if (myself.i_quest3 == 0) {
i9 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i9);
if (myself.IsNullCreature(c1) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i9) >= 1) {
myself.MPCC_SetMasterPartyRouting(i9, myself.sm, 1);
myself.int_list.Add(i9);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1800009, c1.name, "", "", "", ""));

} else if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i9) >= 18) {
myself.MPCC_SetMasterPartyRouting(i9, myself.sm, 1);
myself.int_list.Add(i9);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1800009, c1.name, "", "", "", ""));

}
myself.i_quest3 = 1;

}

}
c0 = attacker;
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (attacker.level > myself.sm.level + 8) {
i10 = 0;
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(295895041)) == -1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * attack_weight_value);

}

}
if (myself.GetPathfindFailCount() > 10) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) < 1000) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.top_desire_target.x), gg.FloatToInt(myself.top_desire_target.y), gg.FloatToInt(myself.top_desire_target.z));

} else {
myself.RemoveAllAttackDesire();
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * attack_weight_value);

}
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (creature.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (creature.is_pc == 1) {
if (i0 == 0 && gg.GetSSQPart(creature) == 0) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(creature) != 1) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(creature) != 2) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (i0 == 0 && gg.GetSSQPart(creature.master) == 0) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(creature.master) != 1) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(creature.master) != 2) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (creature.is_pc == 1) {
if (gg.GetSSQPart(creature) == 0) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (gg.GetSSQPart(creature.master) == 0) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2) {
c0 = speller;
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (c0.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i1 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (c0.is_pc == 1) {
if (i1 == 0 && gg.GetSSQPart(c0) == 0) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 1 && gg.GetSSQPart(c0) != 1) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 2 && gg.GetSSQPart(c0) != 2) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, c0.npc_class_id) == 1) {
if (i1 == 0 && gg.GetSSQPart(c0.master) == 0) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 1 && gg.GetSSQPart(c0.master) != 1) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 2 && gg.GetSSQPart(c0.master) != 2) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i1 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (c0.is_pc == 1) {
if (gg.GetSSQPart(c0) == 0) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, c0.npc_class_id) == 1) {
if (gg.GetSSQPart(c0.master) == 0) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (speller.level > myself.sm.level + 8) {
i2 = 0;
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.p_state == 3 && myself.top_desire_target != speller) {
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp * 4000 * 150);

}

}

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam pledge0, HandlerParam maker0, HandlerParam i0) {
if (InzoneRestriction == 1) {
myself.InstantZone_MarkRestriction();

}
if (InzoneFinish == 1) {
myself.InstantZone_Finish(5);

}
if (doSummonNPC == 1) {
pledge0 = myself.GetPledge(last_attacker);
if (gg.IsNull(pledge0) == 1) {
return;

}
i0 = pledge0.castle_id;
if (i0 == 1) {
maker0 = gg.GetNpcMaker(AdvMakerGludio);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 2) {
maker0 = gg.GetNpcMaker(AdvMakerDion);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 3) {
maker0 = gg.GetNpcMaker(AdvMakerGiran);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 4) {
maker0 = gg.GetNpcMaker(AdvMakerOren);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 5) {
maker0 = gg.GetNpcMaker(AdvMakerAden);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 6) {
maker0 = gg.GetNpcMaker(AdvMakerInnadril);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 7) {
maker0 = gg.GetNpcMaker(AdvMakerGodard);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 8) {
maker0 = gg.GetNpcMaker(AdvMakerRune);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (i0 == 9) {
maker0 = gg.GetNpcMaker(AdvMakerSchuttgart);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam i1) {
if (speller.level > myself.sm.level + 8) {
i1 = 1;
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_attacked);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_attacked);

}

}

}
super;
	}


}