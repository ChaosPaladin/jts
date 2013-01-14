package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tiat extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int Breath = 382664705;
	protected int Breath_Prob = 1000;
	protected int Fire_Breath = 382730241;
	protected int Fire_Breath_Prob = 500;
	protected int Multi_Defence = 382795777;
	protected int Multi_Defence_Prob = 500;
	protected int Spinning_Slasher = 382861313;
	protected int Spinning_Slasher_Prob = 2000;
	protected int Mass_Fear = 382926849;
	protected int Mass_Fear_Prob = 500;
	protected int Thunder_Storm = 382992385;
	protected int Thunder_Storm_Prob = 300;
	protected int ChangeWeapon = 13842;
	protected int ChangeSkill = 391512065;
	protected int FieldCycle = 2;
	protected int FieldCycle_Quantity = 10100;
	protected int Social1 = 0;
	protected int Social1_Frame = 0;
	protected String Privates = "draconian_rider:ai_destruct_warrior_debuff_self:1:60sec;draconian_rider:ai_destruct_warrior_debuff_self:1:60sec;draconian_rider:ai_destruct_warrior_debuff_self:1:60sec;draconian_rider:ai_destruct_warrior_debuff_self:1:60sec";
	protected String teleporter_maker_name = "";
	protected int Dispel_Debuff = 1;
	protected int Dispel_Debuff_Prob = 0;

	protected void CREATED() {
super;
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.CreatePrivates(Privates);
myself.AddTimerEx(1001, 1 * 1000);
myself.AddTimerEx(1002, 1 * 1000);
	}

	protected void NO_DESIRE() {
if (myself.i_ai1 == 1) {
if (myself.GetCurrentTick() - myself.i_ai2 > 15 * 60) {
myself.i_ai1 = 2;
myself.AddTimerEx(5912, 1);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && private.respawn_time != 0) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0) {
if (myself.sm.hp < myself.sm.max_hp * 0.200000 && myself.i_ai3 == 0) {
myself.i_ai3 = 1;
myself.InstantZone_MarkRestriction();

}
if (myself.i_ai1 == 0) {
myself.i_ai1 = 1;

}
myself.i_ai2 = myself.GetCurrentTick();
myself.BroadcastScriptEvent(1224008, gg.GetIndexFromCreature(attacker), 8000);
if (gg.Rand(100) > 1) {
myself.BroadcastScriptEvent(1224021, 0, 4000);

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (myself.i_ai0 == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.CanAttack(myself.top_desire_target) == 0) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
if (Breath != 458752001) {
if (gg.Rand(10000) < Breath_Prob) {
if (myself.DistFromMe(myself.top_desire_target) <= 900) {
if (myself.Skill_GetConsumeMP(Breath) < myself.sm.mp && myself.Skill_GetConsumeHP(Breath) < myself.sm.hp && myself.Skill_InReuseDelay(Breath) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Breath, 0, 0, 1000000);

}

}

}

}
if (Multi_Defence != 458752001) {
if (gg.Rand(10000) < Multi_Defence_Prob) {
if (myself.Skill_GetConsumeMP(Multi_Defence) < myself.sm.mp && myself.Skill_GetConsumeHP(Multi_Defence) < myself.sm.hp && myself.Skill_InReuseDelay(Multi_Defence) == 0) {
myself.AddUseSkillDesire(myself.sm, Multi_Defence, 1, 0, 1000000);

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.500000) {
myself.i_ai0 = 1;
myself.AddTimerEx(5812, 1000);
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(ChangeSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(ChangeSkill) < myself.sm.hp && myself.Skill_InReuseDelay(ChangeSkill) == 0) {
myself.AddUseSkillDesire(myself.sm, ChangeSkill, 1, 1, 10000000000);

}
myself.EquipItem(ChangeWeapon);
myself.AddAttackDesire(attacker, 1, damage * 2);
myself.AddTimerEx(5813, 1000);

}

} else if (myself.i_ai0 == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage * 2);

}
if (Breath != 458752001) {
if (gg.Rand(10000) < Breath_Prob) {
if (myself.Skill_GetConsumeMP(Breath) < myself.sm.mp && myself.Skill_GetConsumeHP(Breath) < myself.sm.hp && myself.Skill_InReuseDelay(Breath) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Breath, 0, 1, 1000000);

}

}

}
if (Fire_Breath != 458752001) {
if (gg.Rand(10000) < Fire_Breath_Prob) {
if (myself.Skill_GetConsumeMP(Fire_Breath) < myself.sm.mp && myself.Skill_GetConsumeHP(Fire_Breath) < myself.sm.hp && myself.Skill_InReuseDelay(Fire_Breath) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Fire_Breath, 0, 1, 1000000);

}

}

}
if (Multi_Defence != 458752001) {
if (gg.Rand(10000) < Multi_Defence_Prob) {
if (myself.Skill_GetConsumeMP(Multi_Defence) < myself.sm.mp && myself.Skill_GetConsumeHP(Multi_Defence) < myself.sm.hp && myself.Skill_InReuseDelay(Multi_Defence) == 0) {
myself.AddUseSkillDesire(myself.sm, Multi_Defence, 1, 1, 1000000);

}

}

}
if (Spinning_Slasher != 458752001) {
if (gg.Rand(10000) < Spinning_Slasher_Prob) {
if (myself.Skill_GetConsumeMP(Spinning_Slasher) < myself.sm.mp && myself.Skill_GetConsumeHP(Spinning_Slasher) < myself.sm.hp && myself.Skill_InReuseDelay(Spinning_Slasher) == 0) {
myself.AddUseSkillDesire(myself.sm, Spinning_Slasher, 0, 1, 1000000);

}

}

}
if (Mass_Fear != 458752001) {
if (gg.Rand(10000) < Mass_Fear_Prob) {
if (myself.Skill_GetConsumeMP(Mass_Fear) < myself.sm.mp && myself.Skill_GetConsumeHP(Mass_Fear) < myself.sm.hp && myself.Skill_InReuseDelay(Mass_Fear) == 0) {
myself.AddUseSkillDesire(myself.sm, Mass_Fear, 0, 1, 1000000);

}

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (myself.i_ai0 == 0) {
if (victim.hp < victim.max_hp * 0.700000) {
if (myself.DistFromMe(attacker) <= 900) {
if (Breath != 458752001) {
if (gg.Rand(10000) < Breath_Prob) {
myself.AddUseSkillDesire(attacker, Breath, 0, 0, 1000000);

}

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0) {

}
if (myself.i_ai0 == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
myself.MakeAttackEvent(creature, 200, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0) {
super;
if (timer_id == 1001) {
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(1001, 60 * 1000);

}
if (timer_id == 1002) {
if (gg.FloatToInt(myself.sm.y - myself.start_y) >= 6000) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(1002, 10 * 1000);

}
if (timer_id == 5812) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, teleporter_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800297, "", "", "", "", ""));
myself.AddTimerEx(5812, 3 * 60 * 1000);

}
if (timer_id == 5813) {
i1 = gg.Rand(60) + 60;
myself.AddTimerEx(5814, i1 * 1000);

}
if (timer_id == 5814) {
if (myself.sm.alive == 1 && myself.p_state == 3 || myself.p_state == 10) {
if (Thunder_Storm != 458752001) {
if (myself.Skill_GetConsumeMP(Thunder_Storm) < myself.sm.mp && myself.Skill_GetConsumeHP(Thunder_Storm) < myself.sm.hp && myself.Skill_InReuseDelay(Thunder_Storm) == 0) {
i2 = gg.Rand(3);
if (i2 == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800705, "", "", "", "", ""));

} else if (i2 == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800706, "", "", "", "", ""));

} else if (i2 == 2) {
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800707, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, Thunder_Storm, 0, 1, 100000000);

}

}

}
myself.AddTimerEx(5813, 1000);

}
if (timer_id == 5912) {
myself.StartScenePlayerAround(myself.sm, 7, 8000, -11972, -11772);
myself.BroadcastScriptEvent(1224009, 0, 8000);
myself.AddTimerEx(5913, 15700);

}
if (timer_id == 5913) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 250243, 4336, 100);
myself.InstantZone_Finish(5);
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam maker0, HandlerParam i2, HandlerParam c2) {
if (myself.i_ai1 != 2) {
myself.StartScenePlayerAround(myself.sm, 6, 8000, -11972, -11772);
myself.BroadcastScriptEvent(1224009, 0, 8000);
c2 = myself.GetLastAttacker();
if (myself.IsNullCreature(c2) == 0) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, c2);

} else {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, myself.sm);

}
if (myself.i_ai3 == 0) {
myself.InstantZone_MarkRestriction();

}
myself.InstantZone_Finish(15);
i2 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i2, "rumwarsha1224_955m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}


}