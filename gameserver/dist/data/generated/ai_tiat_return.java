package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tiat_return extends default_npc {
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
	protected String servant_maker_name = "rumwarsha1225_002m1";

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
if (myself.Skill_GetConsumeMP(ChangeSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(ChangeSkill) < myself.sm.hp && myself.Skill_InReuseDelay(ChangeSkill) == 0) {
myself.AddUseSkillDesire(myself.sm, ChangeSkill, 1, 1, 10000000000);

}
myself.EquipItem(ChangeWeapon);
myself.CreatePrivates(Privates);
myself.AddMoveSuperPointDesire("invasion_center", 0, 10000);
myself.AddTimerEx(5813, 1000);
myself.AddTimerEx(1001, 60 * 1000);
myself.Shout(gg.MakeFString(1800749, "", "", "", "", ""));
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 20) {
myself.RemoveAllDesire();
myself.i_ai2 = 1;

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && private.respawn_time != 0) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}
	}

	protected void NO_DESIRE() {
if (myself.i_ai1 == 1 && myself.i_ai2 == 0) {
myself.AddMoveSuperPointDesire("invasion_center", 0, 50);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0) {
if (myself.i_ai1 == 0) {
myself.RemoveAllDesire();
myself.i_ai1 = 1;

}
myself.BroadcastScriptEvent(1224008, gg.GetIndexFromCreature(attacker), 8000);
if (gg.Rand(100) > 1) {
myself.BroadcastScriptEvent(1224021, 0, 4000);

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
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

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.i_ai1 == 0) {
myself.RemoveAllDesire();
myself.MakeAttackEvent(creature, 1000, 0);
myself.i_ai1 = 1;

} else {
myself.MakeAttackEvent(creature, 200, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i1, HandlerParam i2) {
if (timer_id == 1001) {
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}

} else if (timer_id == 5813) {
if (myself.i_ai1 == 0) {
myself.AddTimerEx(5813, 20 * 1000);

} else {
i1 = gg.Rand(60) + 60;
myself.AddTimerEx(5814, i1 * 1000);

}

} else if (timer_id == 5814) {
if (myself.i_ai1 == 0) {
myself.AddTimerEx(5813, 20 * 1000);

} else {
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

}
	}

	protected void MY_DYING(HandlerParam maker0) {
myself.BroadcastScriptEvent(1224022, 0, 8000);
maker0 = gg.GetNpcMaker(servant_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1224006) {
if (script_event_arg2 != 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 300, 0);

}

}

}
if (script_event_arg1 == 1224014 || script_event_arg1 == 1224013) {
myself.Despawn();

}
	}


}