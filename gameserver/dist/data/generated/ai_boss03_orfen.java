package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss03_orfen extends party_leader_aggressive {
	protected int b03_x1 = 0;
	protected int b03_y1 = 0;
	protected int b03_z1 = 0;
	protected int b03_x2 = 0;
	protected int b03_y2 = 0;
	protected int b03_z2 = 0;
	protected int b03_x3 = 0;
	protected int b03_y3 = 0;
	protected int b03_z3 = 0;
	protected int b03_x4 = 0;
	protected int b03_y4 = 0;
	protected int b03_z4 = 0;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED(HandlerParam i6) {
myself.EffectMusic(myself.sm, 7000, "BS01_A");
myself.sm.flag = 0;
myself.i_ai0 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(3001, 10000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i6) {
if (timer_id == 3001) {
if (myself.i_ai5 == 1) {
return;

}
if (myself.i_ai0 == 1 && myself.sm.hp > myself.sm.max_hp * 0.950000) {
i6 = gg.Rand(100);
if (i6 < 33) {
myself.SetTeleportPosOnLost(b03_x2, b03_y2, b03_z2);
myself.InstantTeleport(myself.sm, b03_x2, b03_y2, b03_z2);

} else if (i6 < 66) {
myself.SetTeleportPosOnLost(b03_x3, b03_y3, b03_z3);
myself.InstantTeleport(myself.sm, b03_x3, b03_y3, b03_z3);

} else {
myself.SetTeleportPosOnLost(b03_x4, b03_y4, b03_z4);
myself.InstantTeleport(myself.sm, b03_x4, b03_y4, b03_z4);

}
myself.i_ai0 = 0;
myself.sm.flag = myself.sm.flag + 1;
myself.RemoveAllAttackDesire();

} else if (myself.i_ai0 == 1 && myself.InMyTerritory(myself.sm) == 0) {
myself.SetTeleportPosOnLost(b03_x1, b03_y1, b03_z1);
myself.InstantTeleport(myself.sm, b03_x1, b03_y1, b03_z1);

}
if (myself.GetCurrentTick() > myself.i_ai4 + 60 * 5 && myself.i_ai3 == 1) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800007, "", "", "", "", ""));
myself.int_list.Clear();
myself.i_ai3 = 0;

}
myself.AddTimerEx(3001, 10000);

}
super;
	}

	protected void OUT_OF_TERRITORY(HandlerParam i6) {
if (myself.i_ai0 > 0.500000) {
myself.SetTeleportPosOnLost(b03_x1, b03_y1, b03_z1);
myself.InstantTeleport(myself.sm, b03_x1, b03_y1, b03_z1);

} else if (myself.i_ai0 < 0.500000) {
i6 = gg.Rand(100);
if (i6 < 33) {
myself.SetTeleportPosOnLost(b03_x2, b03_y2, b03_z2);
myself.InstantTeleport(myself.sm, b03_x2, b03_y2, b03_z2);

} else if (i6 < 66) {
myself.SetTeleportPosOnLost(b03_x3, b03_y3, b03_z3);
myself.InstantTeleport(myself.sm, b03_x3, b03_y3, b03_z3);

} else {
myself.SetTeleportPosOnLost(b03_x4, b03_y4, b03_z4);
myself.InstantTeleport(myself.sm, b03_x4, b03_y4, b03_z4);

}

}
myself.RemoveAllAttackDesire();
myself.sm.flag = myself.sm.flag + 1;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c1, HandlerParam i1) {
if (myself.i_ai3 == 0) {
i1 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i1) >= 1) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));

} else if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i1) >= 36) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));

}
myself.i_ai3 = 1;

}
myself.i_ai4 = myself.GetCurrentTick();
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

} else {
if (myself.i_ai0 == 0 && myself.sm.max_hp * 0.500000 > myself.sm.hp) {
myself.SetTeleportPosOnLost(b03_x1, b03_y1, b03_z1);
myself.InstantTeleport(myself.sm, b03_x1, b03_y1, b03_z1);
myself.i_ai0 = 1;
myself.RemoveAllAttackDesire();
myself.sm.flag = myself.sm.flag + 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.DistFromMe(attacker) > 300 && gg.Rand(100) < 10 && myself.DistFromMe(attacker) < 1000) {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.Say(gg.MakeFString(1000028, attacker.name, "", "", "", ""));

} else if (i0 < 66) {
myself.Say(gg.MakeFString(1000029, attacker.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000030, attacker.name, "", "", "", ""));

}
myself.InstantTeleport(attacker, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
if (myself.Skill_GetConsumeMP(266272769) < myself.sm.mp && myself.Skill_GetConsumeHP(266272769) < myself.sm.hp && myself.Skill_InReuseDelay(266272769) == 0) {
myself.AddUseSkillDesire(attacker, 266272769, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(266338305) < myself.sm.mp && myself.Skill_GetConsumeHP(266338305) < myself.sm.hp && myself.Skill_InReuseDelay(266338305) == 0) {
myself.AddUseSkillDesire(myself.sm, 266338305, 0, 1, 1000000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 10000);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0) {
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
if (myself.sm.alive != 0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0 && gg.Rand(100) < 20 && myself.DistFromMe(speller) < 1000) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.Say(gg.MakeFString(1000028, speller.name, "", "", "", ""));

} else if (i0 < 50) {
myself.Say(gg.MakeFString(1000029, speller.name, "", "", "", ""));

} else if (i0 < 75) {
myself.Say(gg.MakeFString(1000030, speller.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000031, speller.name, "", "", "", ""));

}
myself.InstantTeleport(speller, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
if (myself.Skill_GetConsumeMP(266272769) < myself.sm.mp && myself.Skill_GetConsumeHP(266272769) < myself.sm.hp && myself.Skill_InReuseDelay(266272769) == 0) {
myself.AddUseSkillDesire(speller, 266272769, 0, 1, 1000000);

}

}
super;

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam c1, HandlerParam i1) {
if (myself.i_ai3 == 0) {
i1 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i1) >= 1) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));
myself.i_ai3 = 1;

}
if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i1) >= 36) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));
myself.i_ai3 = 1;

}

}
if (attacker.level <= myself.sm.level + 8) {
if (private != myself.sm) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * damage * private.weight_point * 1000);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c1, HandlerParam i1) {
if (myself.i_ai3 == 0) {
i1 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i1) >= 1) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));

}
if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i1) >= 36) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800003, c1.name, "", "", "", ""));

}
myself.i_ai3 = 1;

}
if (attacker.level <= myself.sm.level + 8) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 3000);

}

}
	}

	protected void MY_DYING() {
myself.i_ai5 = 1;
myself.EffectMusic(myself.sm, 7000, "BS02_D");
	}


}