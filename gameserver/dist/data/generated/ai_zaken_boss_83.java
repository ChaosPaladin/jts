package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_zaken_boss_83 extends default_npc {
	protected int GlobalMap_ID = 40;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int SeeCreatureAttackerTime = -1;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam maker0) {
myself.EffectMusic(myself.sm, 10000, "BS01_A");
myself.i_ai0 = 1;
myself.i_quest0 = 0;
if (reply == 0) {
myself.i_quest2 = 3;

}
myself.i_quest1 = 0;
myself.AddTimerEx(1001, 1 * 1000);
myself.i_quest3 = 0;
myself.i_quest4 = 0;
i0 = gg.Rand(15);
myself.RegisterGlobalMap(GlobalMap_ID, i0);
if (i0 == 0) {
i1 = 54237;
i2 = 218135;
i3 = -3496;

} else if (i0 == 1) {
i1 = 56288;
i2 = 218087;
i3 = -3496;

} else if (i0 == 2) {
i1 = 55273;
i2 = 219140;
i3 = -3496;

} else if (i0 == 3) {
i1 = 54232;
i2 = 220184;
i3 = -3496;

} else if (i0 == 4) {
i1 = 56259;
i2 = 220168;
i3 = -3496;

} else if (i0 == 5) {
i1 = 54250;
i2 = 218122;
i3 = -3224;

} else if (i0 == 6) {
i1 = 56308;
i2 = 218125;
i3 = -3224;

} else if (i0 == 7) {
i1 = 55243;
i2 = 219064;
i3 = -3224;

} else if (i0 == 8) {
i1 = 54255;
i2 = 220156;
i3 = -3224;

} else if (i0 == 9) {
i1 = 56255;
i2 = 220161;
i3 = -3224;

} else if (i0 == 10) {
i1 = 54261;
i2 = 218095;
i3 = -2952;

} else if (i0 == 11) {
i1 = 56258;
i2 = 218086;
i3 = -2952;

} else if (i0 == 12) {
i1 = 55258;
i2 = 219080;
i3 = -2952;

} else if (i0 == 13) {
i1 = 54292;
i2 = 220096;
i3 = -2952;

} else if (i0 == 14) {
i1 = 56258;
i2 = 220135;
i3 = -2952;

}
if (i1 != 0 && i2 != 0 & i3 != 0) {
myself.InstantTeleport(myself.sm, i1, i2, i3);

}
myself.SetVisible(0);
myself.i_quest2 = 3;
myself.AddTimerEx(1050, 10 * 1000);
myself.AddTimerEx(1051, 30 * 1000);
myself.i_ai0 = myself.GetCurrentTick();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9) {
if (timer_id == 1050) {
myself.i_ai1 = gg.FloatToInt(myself.sm.x);
myself.i_ai2 = gg.FloatToInt(myself.sm.y);

}
if (timer_id == 1051) {
if (myself.i_ai1 - gg.FloatToInt(myself.sm.x) * myself.i_ai1 - gg.FloatToInt(myself.sm.x) + myself.i_ai2 - gg.FloatToInt(myself.sm.y) * myself.i_ai2 - gg.FloatToInt(myself.sm.y) > 1500 * 1500) {
myself.RemoveAllDesire();
i6 = myself.GetGlobalMap(GlobalMap_ID);
if (i6 == 0) {
i7 = 54237;
i8 = 218135;
i9 = -3496;

} else if (i6 == 1) {
i7 = 56288;
i8 = 218087;
i9 = -3496;

} else if (i6 == 2) {
i7 = 55273;
i8 = 219140;
i9 = -3496;

} else if (i6 == 3) {
i7 = 54232;
i8 = 220184;
i9 = -3496;

} else if (i6 == 4) {
i7 = 56259;
i8 = 220168;
i9 = -3496;

} else if (i6 == 5) {
i7 = 54250;
i8 = 218122;
i9 = -3224;

} else if (i6 == 6) {
i7 = 56308;
i8 = 218125;
i9 = -3224;

} else if (i6 == 7) {
i7 = 55243;
i8 = 219064;
i9 = -3224;

} else if (i6 == 8) {
i7 = 54255;
i8 = 220156;
i9 = -3224;

} else if (i6 == 9) {
i7 = 56255;
i8 = 220161;
i9 = -3224;

} else if (i6 == 10) {
i7 = 54261;
i8 = 218095;
i9 = -2952;

} else if (i6 == 11) {
i7 = 56258;
i8 = 218086;
i9 = -2952;

} else if (i6 == 12) {
i7 = 55258;
i8 = 219080;
i9 = -2952;

} else if (i6 == 13) {
i7 = 54292;
i8 = 220096;
i9 = -2952;

} else if (i6 == 14) {
i7 = 56258;
i8 = 220135;
i9 = -2952;

}
if (i7 != 0 && i8 != 0 & i9 != 0) {
myself.InstantTeleport(myself.sm, i7, i8, i9);

}
myself.AddTimerEx(1052, 1000);

}
myself.AddTimerEx(1051, 30 * 1000);

}
if (timer_id == 1052) {
myself.LookNeighbor(1000);

}
if (timer_id == 9999) {
myself.AddTimerEx(9999, 60 * 1000);

}
if (timer_id == 1001) {
if (myself.p_state == 1) {
myself.i_quest1 = 0;

}
if (myself.i_quest1 > 5) {
myself.RemoveAttackDesire(myself.c_ai0.id);
myself.i_quest1 = 0;

}
if (myself.i_quest3 == 1 && myself.GetCurrentTick() > myself.i_quest4 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800008, "", "", "", "", ""));
myself.i_quest3 = 0;

}
myself.AddTimerEx(1001, 30 * 1000);

}
if (timer_id == 1002) {
i0 = gg.FloatToInt(myself.sm.x) + gg.Rand(200);
i1 = gg.FloatToInt(myself.sm.y) + gg.Rand(200);
i2 = gg.FloatToInt(myself.sm.z);
myself.CreateOnePrivateEx(1029184, "ai_boss05_pirates_zombie_c_b_83", 0, 0, i0, i1, i2, gg.Rand(360), 0, 0, 0);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (myself.i_ai4 != 1) {
return;

}
if (creature.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);
myself.RemoveAttackDesire(creature.id);
return;

} else {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);

}

}

}
if (creature.z > myself.sm.z - 100 && creature.z < myself.sm.z + 100) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
if (myself.i_quest0 < 5 && gg.Rand(3) < 1) {
if (myself.i_quest0 == 0) {
myself.c_quest0 = creature;

} else if (myself.i_quest0 == 1) {
myself.c_quest1 = creature;

} else if (myself.i_quest0 == 2) {
myself.c_quest2 = creature;

} else if (myself.i_quest0 == 3) {
myself.c_quest3 = creature;

} else if (myself.i_quest0 == 4) {
myself.c_quest4 = creature;

}
myself.i_quest0 = myself.i_quest0 + 1;

}
if (gg.Rand(15) < 1) {
if (gg.Rand(3) < 2) {
if (creature == myself.top_desire_target) {
myself.AddUseSkillDesire(creature, 438501377, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(creature, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(creature, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(creature, 438435841, 0, 1, 1000000);

} else if (i0 < 13) {
myself.AddUseSkillDesire(creature, 438370305, 0, 1, 1000000);

} else if (i0 < 45) {
if (creature != myself.top_desire_target && myself.DistFromMe(creature) < 100) {
myself.AddUseSkillDesire(myself.sm, 438566913, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam c1, HandlerParam i1) {
myself.i_quest4 = myself.GetCurrentTick();
if (myself.i_quest3 == 0) {
i1 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i1) >= 36) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800004, c1.name, "", "", "", ""));

}
myself.i_quest3 = 1;

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

} else if (gg.Rand(10) < 1 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(3) < 2) {
if (attacker == myself.top_desire_target) {
myself.AddUseSkillDesire(attacker, 438501377, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(attacker, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(attacker, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(attacker, 438435841, 0, 1, 1000000);

} else if (i0 < 13) {
myself.AddUseSkillDesire(attacker, 438370305, 0, 1, 1000000);

} else if (i0 < 45) {
if (attacker != myself.top_desire_target && myself.DistFromMe(attacker) < 100) {
myself.AddUseSkillDesire(myself.sm, 438566913, 0, 1, 1000000);

}

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0) {
if (myself.i_ai4 != 1) {
return;

}
if (speller.level > myself.sm.level + 8) {
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
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp * 10 * 150);

}
if (gg.Rand(12) < 1) {
if (gg.Rand(3) < 2) {
if (speller == myself.top_desire_target) {
myself.AddUseSkillDesire(speller, 438501377, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(speller, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(speller, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(speller, 438435841, 0, 1, 1000000);

} else if (i0 < 13) {
myself.AddUseSkillDesire(speller, 438370305, 0, 1, 1000000);

} else if (i0 < 45) {
if (speller != myself.top_desire_target && myself.DistFromMe(speller) < 100) {
myself.AddUseSkillDesire(myself.sm, 438566913, 0, 1, 1000000);

}

}

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.AddTimerEx(1002, 60 * 1000 + gg.Rand(60) * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 2124001) {
myself.SetVisible(1);
myself.i_ai4 = 1;
i0 = gg.FloatToInt(myself.sm.x);
i1 = gg.FloatToInt(myself.sm.y);
i2 = gg.FloatToInt(myself.sm.z);
myself.CreateOnePrivateEx(1029184, "ai_boss05_pirates_zombie_c_b_83", 0, 0, i0 + 200, i1 + 200, i2, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029184, "ai_boss05_pirates_zombie_c_b_83", 0, 0, i0 + 200, i1 - 200, i2, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029184, "ai_boss05_pirates_zombie_c_b_83", 0, 0, i0 - 200, i1 + 200, i2, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029184, "ai_boss05_pirates_zombie_c_b_83", 0, 0, i0 - 200, i1 - 200, i2, gg.Rand(360), 0, 0, 0);

}
if (script_event_arg1 == 2124006) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 0, 10000, 0, gg.MakeFString(1800868, "", "", "", "", ""));

}
if (script_event_arg1 == 2124007) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 0, 10000, 0, gg.MakeFString(1800869, "", "", "", "", ""));

}
if (script_event_arg1 == 2124008) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 0, 10000, 0, gg.MakeFString(1800870, "", "", "", "", ""));

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam party0, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
myself.EffectMusic(myself.sm, 10000, "BS02_D");
myself.UnregisterGlobalMap(GlobalMap_ID);
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(10);
i4 = myself.GetCurrentTick();
i5 = i4 - myself.i_ai0;
c0 = last_attacker;
if (myself.IsNullCreature(c0) == 0) {
i0 = myself.MPCC_GetMPCCId(c0);
if (i0 > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(i0); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(i0, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
gg.SendUIEvent(c1, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");
if (i5 <= 5 * 60) {
if (gg.Rand(100) < 50) {
myself.GiveItem1(c1, 15763, 1);

}

} else if (i5 <= 10 * 60) {
if (gg.Rand(100) < 30) {
myself.GiveItem1(c1, 15764, 1);

}

} else if (i5 <= 15 * 60) {
if (gg.Rand(100) < 25) {
myself.GiveItem1(c1, 15763, 1);

}

}

}

}

}

} else {
party0 = gg.GetParty(c0);
if (gg.IsNull(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
gg.SendUIEvent(c1, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");
if (i5 <= 5 * 60) {
if (gg.Rand(100) < 50) {
myself.GiveItem1(c1, 15763, 1);

}

} else if (i5 <= 10 * 60) {
if (gg.Rand(100) < 30) {
myself.GiveItem1(c1, 15764, 1);

}

} else if (i5 <= 15 * 60) {
if (gg.Rand(100) < 25) {
myself.GiveItem1(c1, 15763, 1);

}

}

}

}

}

}
	}


}