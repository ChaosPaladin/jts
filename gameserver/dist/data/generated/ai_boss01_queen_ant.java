package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss01_queen_ant extends default_npc {
	protected String Privates = "nurse_ant:nurse_ant:2:10sec;nurse_ant:nurse_ant:2:10sec;nurse_ant:nurse_ant:2:10sec
		;royal_guard_ant:royal_guard_ant:1:20sec;royal_guard_ant:royal_guard_ant:1:20sec
		;royal_guard_ant:royal_guard_ant:1:20sec;royal_guard_ant:royal_guard_ant:1:20sec";
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 5);
	}

	protected void CREATED() {
if (gg.Rand(100) < 33) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 187344, -5600, 200);

} else if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 180912, -5520, 200);

} else {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 182368, -5600, 200);

}
myself.EffectMusic(myself.sm, 10000, "BS01_A");
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.sm.weight_point = 10;
myself.CreatePrivates(Privates);
myself.CreateOnePrivateEx(1029002, "ai_boss01_queen_ant_larva", 0, 0, -21600, 179482, -5846, gg.Rand(360), 0, 0, 0);
myself.AddTimerEx(1001, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
if (timer_id == 1001) {
if (gg.Rand(100) < 30 && myself.p_state == 1) {
if (gg.Rand(100) < 50) {
myself.AddEffectActionDesire(myself.sm, 3, 50 * 1000 / 30, 30);

} else {
myself.AddEffectActionDesire(myself.sm, 4, 50 * 1000 / 30, 30);

}

}
if (myself.i_ai0 == 1 && myself.GetCurrentTick() > myself.i_ai1 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800005, "", "", "", "", ""));
myself.int_list.Clear();
myself.i_ai0 = 0;

}
myself.AddTimerEx(1001, 10000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (private.npc_class_id == 1029003) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 10);

} else {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 280 + gg.Rand(40));

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam c0, HandlerParam i0) {
myself.i_ai1 = myself.GetCurrentTick();
if (myself.i_ai0 == 0) {
i0 = myself.MPCC_GetMPCCId(attacker);
c0 = myself.MPCC_GetMaster(i0);
if (myself.IsNullCreature(c0) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i0) >= 1) {
myself.MPCC_SetMasterPartyRouting(i0, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800001, c0.name, "", "", "", ""));

} else if (myself.IsNullCreature(c0) == 0 && myself.MPCC_GetMemberCount(i0) >= 36) {
myself.MPCC_SetMasterPartyRouting(i0, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800001, c0.name, "", "", "", ""));

}
myself.i_ai0 = 1;

}
if (attacker.z - myself.sm.z > 500 || attacker.z - myself.sm.z < -500) {

} else if (attacker.level > myself.sm.level + 8) {
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
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(295895041)) == -1) {
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (skill_name_id > 0 && myself.Skill_HaveAttribute(skill_name_id, 0) && gg.Rand(100) < 70 && myself.InMyTerritory(attacker)) {
if (myself.Skill_GetConsumeMP(263323649) < myself.sm.mp && myself.Skill_GetConsumeHP(263323649) < myself.sm.hp && myself.Skill_InReuseDelay(263323649) == 0) {
myself.AddUseSkillDesire(attacker, 263323649, 0, 1, 1000000);

}

} else if (myself.DistFromMe(attacker) > 500 && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (myself.DistFromMe(attacker) > 150 && gg.Rand(100) < 10) {
if (gg.Rand(100) < 80 && myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(263323649) < myself.sm.mp && myself.Skill_GetConsumeHP(263323649) < myself.sm.hp && myself.Skill_InReuseDelay(263323649) == 0) {
myself.AddUseSkillDesire(attacker, 263323649, 0, 0, 1000000);

}

} else if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (gg.Rand(100) < 5 && myself.DistFromMe(attacker) < 250) {
if (myself.Skill_GetConsumeMP(263258113) < myself.sm.mp && myself.Skill_GetConsumeHP(263258113) < myself.sm.hp && myself.Skill_InReuseDelay(263258113) == 0) {
myself.AddUseSkillDesire(myself.sm, 263258113, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 1) {
myself.AddEffectActionDesire(myself.sm, 1, 60 * 1000 / 30, 3000000);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * damage * myself.sm.weight_point * 100);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 0) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && private != myself.sm) {
if (myself.DistFromMe(attacker) > 500 && gg.Rand(100) < 5) {
if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (myself.DistFromMe(attacker) > 150 && gg.Rand(100) < 5) {
if (gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(263323649) < myself.sm.mp && myself.Skill_GetConsumeHP(263323649) < myself.sm.hp && myself.Skill_InReuseDelay(263323649) == 0) {
myself.AddUseSkillDesire(attacker, 263323649, 0, 0, 1000000);

}

} else if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (gg.Rand(100) < 2 && myself.DistFromMe(attacker) < 250) {
if (myself.Skill_GetConsumeMP(263258113) < myself.sm.mp && myself.Skill_GetConsumeHP(263258113) < myself.sm.hp && myself.Skill_InReuseDelay(263258113) == 0) {
myself.AddUseSkillDesire(myself.sm, 263258113, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * damage * private.weight_point * 1000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.DistFromMe(attacker) > 500 && gg.Rand(100) < 3) {
if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (myself.DistFromMe(attacker) > 150 && gg.Rand(100) < 3) {
if (gg.Rand(100) < 80) {
if (myself.Skill_GetConsumeMP(263323649) < myself.sm.mp && myself.Skill_GetConsumeHP(263323649) < myself.sm.hp && myself.Skill_InReuseDelay(263323649) == 0) {
myself.AddUseSkillDesire(attacker, 263323649, 0, 0, 1000000);

}

} else if (myself.Skill_GetConsumeMP(263389185) < myself.sm.mp && myself.Skill_GetConsumeHP(263389185) < myself.sm.hp && myself.Skill_InReuseDelay(263389185) == 0) {
myself.AddUseSkillDesire(attacker, 263389185, 0, 0, 1000000);

}

} else if (gg.Rand(100) < 2 && myself.DistFromMe(attacker) < 250) {
if (myself.Skill_GetConsumeMP(263258113) < myself.sm.mp && myself.Skill_GetConsumeHP(263258113) < myself.sm.hp && myself.Skill_InReuseDelay(263258113) == 0) {
myself.AddUseSkillDesire(myself.sm, 263258113, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 500);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (speller.z - myself.sm.z > 500 || speller.z - myself.sm.z < -500) {

} else if (speller.level > myself.sm.level + 8) {
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
if (myself.Skill_GetEffectPoint(skill_name_id) > 0 && gg.Rand(100) < 15) {
if (myself.Skill_GetConsumeMP(263323649) < myself.sm.mp && myself.Skill_GetConsumeHP(263323649) < myself.sm.hp && myself.Skill_InReuseDelay(263323649) == 0) {
myself.AddUseSkillDesire(speller, 263323649, 0, 0, 1000000);

}

}
	}

	protected void OUT_OF_TERRITORY() {
myself.RemoveAllAttackDesire();
	}

	protected void MY_DYING() {
myself.EffectMusic(myself.sm, 10000, "BS02_D");
	}


}