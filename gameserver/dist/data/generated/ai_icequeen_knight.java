package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_knight extends warrior_use_skill {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 2000;
	protected int SelfRangeDD = 458752001;
	protected int SelfRangeDD_Prob = 1500;
	protected int Dash = 458752001;
	protected int Dash_Prob = 2000;
	protected int Skill_Freya_Buff = 411828225;
	protected int first_spawner = -1;
	protected int second_spawner = -1;
	protected int third_spawner = -1;
	protected int my_position = -1;
	protected String SuperPointName = "-1";
	protected int SuperPointMethod = 0;
	protected int PosX = -1;
	protected int PosY = -1;
	protected int PosZ = -1;
	protected int IsAggressive = 1;
	protected int TIMER_knight_state = 2314011;
	protected int TIMER_knight_state2 = 2314012;
	protected int TIMER_dash = 2314014;
	protected int TIMER_superpoint_delay = 2314028;
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";
	protected int Dispel_Debuff_Prob = 7000;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
myself.SetMaxHateListSize(50);
myself.ChangeNPCState(myself.sm, 1);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
if (my_position > 0) {
if (debug_mode) {
myself.Shout("my_position : " + my_position);

}

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140064, gg.GetIndexFromCreature(myself.sm), 0);

}
myself.AddTimerEx(TIMER_dash, 5 * 1000);
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (myself.sm.instant_zone_type_id == 139) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

}

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

}

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

}

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

}

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

}

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

}

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

}

} else if (myself.sm.instant_zone_type_id == 144) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

}
	}

	protected void NO_DESIRE() {
if (myself.i_ai0 == 1) {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam maker0, HandlerParam h0) {
if (myself.i_ai2 == 1) {
if (creature.is_pc == 1) {
h0 = myself.GetHateInfoByCreature(creature);
if (myself.IsNullHateInfo(h0) == 1) {
myself.AddHateInfo(creature, 1, 0, 1, 1);
myself.ChangeNPCState(myself.sm, 3);

}

}

}
if (myself.i_ai0 == 0) {
if (third_spawner == 1) {
myself.AddTimerEx(TIMER_knight_state, 1);
myself.i_ai0 = 1;
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140042, gg.GetIndexFromCreature(creature), 0);

}

} else {
return;

}

}
super;
	}

	protected void CLAN_ATTACKED() {
if (myself.i_ai0 == 0) {
return;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 23140010) {
if (myself.i_ai0 != 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}
if (first_spawner == 1) {
myself.AddTimerEx(TIMER_knight_state, 1);
if (script_event_arg2 == 1) {
myself.i_ai0 = 1;

} else {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}

}

} else if (script_event_arg1 == 23140042) {
if (debug_mode) {
myself.Say("SCE_KNIGHT_FIRST_ATTACK");

}
myself.AddTimerEx(TIMER_knight_state, 1);
myself.i_ai0 = 1;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

} else if (script_event_arg1 == 23140045) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(TIMER_knight_state, 1);
myself.i_ai0 = 1;
if (debug_mode) {
myself.Shout("ice_knight moving start. my_pos : " + my_position);

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140056, my_position, 5);

}

} else if (myself.i_ai0 == 1) {
if (debug_mode) {
myself.Say("활동중 빙궁기사에게 moving_knight, " + my_position);

}

}
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai1 = script_event_arg2;

}
if (my_position <= 18) {
myself.AddMoveToDesire(114730, -114805, -11200, 50);
if (myself.i_ai1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140046, gg.GetIndexFromCreature(myself.sm));

}

}

} else if (my_position >= 21) {
myself.AddMoveToDesire(PosX, PosY, PosZ, 10000);
myself.AddTimerEx(TIMER_superpoint_delay, 2000);

}

} else if (script_event_arg1 == 23140047) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.StopMove();
myself.AddAttackDesire(c0, 1, 3000);

}

} else if (script_event_arg1 == 23140043) {
if (myself.i_ai0 == 1) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 100);

}

} else if (second_spawner == 1 && myself.i_ai0 == 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 1000, 0);

}

}

} else if (script_event_arg1 == 23140020) {
myself.AddTimerEx(TIMER_knight_state, 1);
myself.Suicide();

} else if (script_event_arg1 == 23140048) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_ON");

}
myself.RemoveAllDesire();
myself.StopMove();
myself.Despawn();
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

} else if (script_event_arg1 == 23140049) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_OFF");

}
myself.LookNeighbor(2000);
myself.sm.absolute_defence = 0;
myself.sm.no_attack_damage = 0;

} else if (script_event_arg1 == 23140051) {
if (myself.i_ai0 != 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.z <= c0.z) {
gg.SendScriptEvent(c0, 23140052, gg.GetIndexFromCreature(myself.sm));

}

}

}

} else if (script_event_arg1 == 23140062) {
if (myself.i_ai3 != 3) {
myself.AddUseSkillDesire(myself.sm, Skill_Freya_Buff, 1, 0, 10000000);
myself.i_ai3 = 3;

}

} else if (script_event_arg1 == 23140062) {
if (myself.i_ai3 != 3) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 200) {
myself.AddUseSkillDesire(myself.sm, Skill_Freya_Buff, 1, 0, 10000000);
myself.i_ai3 = 3;

}

}

}

} else if (script_event_arg1 == 23140065) {
if (debug_mode) {
myself.Shout("is not able spawn");

}
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0, HandlerParam c0) {
if (timer_id == TIMER_knight_state) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.ChangeNPCState(myself.sm, 2);
myself.AddTimerEx(TIMER_knight_state2, 1500);

}

} else if (timer_id == TIMER_knight_state2) {
myself.ChangeNPCState(myself.sm, 3);

} else if (timer_id == TIMER_dash) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.alive == 1) {
if (gg.Rand(10000) < Dash_Prob * 2) {
myself.AddUseSkillDesire(myself.top_desire_target, Dash, 0, 1, 100000000);

}

}

}
if (myself.i_ai3 == 1) {
if (myself.i_ai1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 150) {
myself.i_ai3 = 2;
if (debug_mode) {
myself.Say("broadcast 프레야의 축복");

}
myself.RemoveAllDesire();
myself.BroadcastScriptEvent(23140062, 0, 1000);

}

}

}

}
myself.AddTimerEx(TIMER_dash, 5 * 1000);

} else if (timer_id == TIMER_superpoint_delay) {
if (gg.IsSameString(SuperPointName, "-1") == 0) {
myself.RemoveAllDesire();
if (debug_mode) {
myself.Shout("Move Superpoint. " + my_position);

}
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, 5000000);
myself.i_ai3 = 1;

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam maker0) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (debug_mode) {
myself.Shout("first attack");

}
if (myself.i_ai2 == 0) {
myself.AddTimerEx(TIMER_knight_state, 1);

}
if (first_spawner == 1) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140042, gg.GetIndexFromCreature(attacker), 0);

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140014, 0, 0);

}

} else if (second_spawner == 1) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140042, gg.GetIndexFromCreature(attacker), 0);

}

} else {
if (debug_mode) {
myself.Say("얼어붙은 빙궁기사의 first_attack.");

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140056, my_position, 10);

}

}

}
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddAttackDesire(attacker, 1, damage);
myself.BroadcastScriptEvent(23140043, gg.GetIndexFromCreature(attacker), 2000);
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(10000) < 8000) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}

}
if (SelfRangeDD != 458752001) {
if (gg.Rand(10000) < SelfRangeDD_Prob) {
if (myself.Skill_GetConsumeMP(SelfRangeDD) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDD) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDD) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDD, 0, 1, 1000000);

}

}

}
if (Dash != 458752001) {
if (gg.Rand(10000) < Dash_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(10000) < 8000) {
if (myself.Skill_GetConsumeMP(Dash) < myself.sm.mp && myself.Skill_GetConsumeHP(Dash) < myself.sm.hp && myself.Skill_InReuseDelay(Dash) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Dash, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Dash) < myself.sm.mp && myself.Skill_GetConsumeHP(Dash) < myself.sm.hp && myself.Skill_InReuseDelay(Dash) == 0) {
myself.AddUseSkillDesire(attacker, Dash, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Dash) < myself.sm.mp && myself.Skill_GetConsumeHP(Dash) < myself.sm.hp && myself.Skill_InReuseDelay(Dash) == 0) {
myself.AddUseSkillDesire(attacker, Dash, 0, 1, 1000000);

}

}

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam state, HandlerParam success, HandlerParam s0, HandlerParam c0) {
if (debug_mode) {
myself.Say("node_arr : " + script_event_arg1);

}
if (script_event_arg1 == 8) {
if (debug_mode) {
myself.Say("8번 노드 도착. 절대디자이어 해제");

}
myself.RemoveAllDesire();
myself.i_ai3 = 1;
myself.AddMoveToDesire(114707, -114797, -11199, 2000);
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (debug_mode) {
myself.Say("프레야를 향해서 이동");

}
myself.AddFollowDesire(c0, 1000);

}

} else if (script_event_arg1 == 9) {
if (debug_mode) {
myself.Say("마지막 노드 도착");

}
myself.RemoveAllDesire();

} else {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 300 && gg.FloatToInt(myself.sm.z) - gg.FloatToInt(c0.z) < 50) {
if (debug_mode) {
myself.Say("프레야가 가까워서 슈퍼포인트 해제");

}
myself.RemoveAllDesire();
myself.i_ai3 = 1;

}

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1");

}
gg.SendScriptEvent(myself.sm, 23140045, 0);

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
if (first_spawner == 1) {
i0 = myself.InstantZone_GetId();
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140044, 0, 0);

}

}
if (second_spawner == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140069, 0, 0);

}

}
	}


}