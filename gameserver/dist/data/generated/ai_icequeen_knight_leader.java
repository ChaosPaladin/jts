package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_knight_leader extends default_npc {
	protected double HATE_SKILL_Weight_Point = 40.000000;
	protected int Skill01_ID = 412418049;
	protected int Skill01_Prob = 2500;
	protected int Skill02_ID = 412549121;
	protected int Skill02_Prob = 1500;
	protected int Skill03_ID = 412680193;
	protected int Skill03_Prob = 1500;
	protected int SelfRangeBuff = 412483585;
	protected int SelfRangeBuff_Timer = 30;
	protected int Skill_Summon = 412745729;
	protected int Skill_Summon_Prob = 500;
	protected int Dash = 412614657;
	protected int Dash_Prob = 2500;
	protected String TRR_FREYA_1F = "schuttgart29_2314_06";
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String MAKER_ice_knight = "schuttgart29_2314_03m1";
	protected String MAKER_event_elemental = "schuttgart29_2314_102m4";
	protected String MAKER_event_knight = "schuttgart29_2314_102m5";
	protected String MAKER_ice_castle = "schuttgart29_2314_06m1";
	protected int TIMER_leader_rangebuff = 2314009;
	protected int TIMER_leader_randomize = 2314010;
	protected int TIMER_dash = 2314015;
	protected int TIMER_broadcast = 2314021;
	protected int TIMER_despawn = 2314018;
	protected int TIMER_despawn2 = 2314029;
	protected int TIMER_destroy = 2314031;
	protected int TIMER_phase2_failed = 2314024;
	protected int TIMER_delay = 2314033;
	protected int Dispel_Debuff = 1;
	protected int is_hard_mode = 0;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
myself.i_ai0 = 0;
myself.i_ai2 = 0;
myself.i_ai5 = myself.GetCurrentTick();
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_ice_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140013, gg.GetIndexFromCreature(myself.sm), 0);

}
myself.AddTimerEx(TIMER_delay, 5 * 1000);
	}

	protected void NO_DESIRE() {
if (myself.GetCurrentTick() - myself.i_ai5 > 300) {
if (myself.i_ai6 == 0) {
if (debug_mode) {
myself.Shout("전투 시작 후 긴 시간 공격받지 않아 phase2 실패처리");

}
myself.i_ai6 = 1;
myself.AddTimerEx(TIMER_phase2_failed, 1);

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam skill_name_id, HandlerParam maker0) {
if (myself.sm.hp < myself.sm.max_hp * 0.020000) {
if (myself.i_ai7 == 0) {
myself.i_ai7 = 1;
myself.i_ai8 = 2;
myself.CastBuffForQuestReward(attacker, 302645249);
myself.StopMove();
myself.RemoveAllDesire();
myself.SetAbilityItemDrop(0);
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;
myself.AddUseSkillDesire(myself.sm, 422510593, 1, 0, 10000000000);
myself.ChangeStatus(2);
myself.AddTimerEx(TIMER_despawn, 3 * 1000);
if (debug_mode) {
myself.Shout("my_dying. phase2 성공.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140017, 1, 0);

}
myself.i_ai1 = 3;

} else if (myself.i_ai7 == 1) {
myself.CastBuffForQuestReward(attacker, 302645249);

}

} else if (myself.i_ai7 == 0 && myself.i_ai8 == 1) {
if (skill_name_id != 0) {
if (myself.Skill_GetAbnormalType(1835009) == myself.Skill_GetAbnormalType(skill_name_id)) {
if (debug_mode) {
myself.Say("HATE");

}
myself.AddAttackDesire(attacker, 1, damage * 10);

}

}
myself.i_ai5 = myself.GetCurrentTick();
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
i0 = gg.Rand(30) + 1;
myself.AddTimerEx(TIMER_leader_rangebuff, i0 * 1000);
myself.AddTimerEx(TIMER_leader_randomize, 25 * 1000);
myself.AddTimerEx(TIMER_dash, 5 * 1000);
myself.AddTimerEx(TIMER_broadcast, 5 * 1000);
myself.AddTimerEx(TIMER_destroy, 60 * 1000);

}
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddAttackDesire(attacker, 1, damage);
if (myself.i_ai2 == 0) {
myself.BroadcastScriptEvent(23140043, gg.GetIndexFromCreature(attacker), 3500);
myself.i_ai2 = 1;

}
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (gg.Rand(10000) < 2500) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

}

}
if (Skill02_ID != 458752001) {
if (gg.Rand(10000) < Skill02_Prob) {
if (gg.Rand(10000) < 5000) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, 1000000);

}

}

}
if (Skill03_ID != 458752001) {
if (gg.Rand(10000) < Skill03_Prob) {
if (gg.Rand(10000) < 5000) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (myself.i_ai7 == 0 && myself.i_ai8 == 1) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
myself.AddAttackDesire(attacker, 1, damage / 5);
if (Skill02_ID != 458752001) {
if (gg.Rand(10000) < Skill02_Prob / 2) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, 1000000);

}

}

}
if (Skill03_ID != 458752001) {
if (gg.Rand(10000) < Skill03_Prob) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam pos0) {
if (timer_id == TIMER_leader_rangebuff) {
if (SelfRangeBuff != 458752001) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}

}
myself.AddTimerEx(TIMER_leader_rangebuff, SelfRangeBuff_Timer * 1000);

} else if (timer_id == TIMER_leader_randomize) {
myself.RandomizeAttackDesire();
myself.AddTimerEx(TIMER_leader_randomize, 25 * 1000);

} else if (timer_id == TIMER_dash) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.alive == 1) {
if (gg.Rand(10000) < Dash_Prob * 2) {
myself.AddUseSkillDesire(myself.top_desire_target, Dash, 0, 1, 1000000000);

}

}

}
myself.AddTimerEx(TIMER_dash, 10 * 1000);

} else if (timer_id == TIMER_broadcast) {
myself.i_ai2 = 0;
myself.AddTimerEx(TIMER_broadcast, 5 * 1000);

} else if (timer_id == TIMER_phase2_failed) {
if (debug_mode) {
myself.Shout("phase2 실패.");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140017, 2, 0);

}
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

} else if (timer_id == TIMER_despawn) {
if (debug_mode) {
myself.Say("timer_despawn");

}
myself.EquipItem(15280);
myself.AddTimerEx(TIMER_despawn2, 4 * 1000);

} else if (timer_id == TIMER_despawn2) {
if (debug_mode) {
myself.Say("timer_despawn2");

}
myself.Despawn();

} else if (timer_id == TIMER_destroy) {
if (myself.i_ai7 == 0) {
if (debug_mode) {
myself.Say("timer_destroy!!!!!");

}
i0 = gg.Rand(3);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 1, 0, 0, 0, 1, 5000, 0, gg.MakeFString(1801124, "", "", "", "", ""));
switch (i0) {
case 0: {
if (debug_mode) {
myself.Say("[dbg] 숨결 스폰");

}
myself.Shout(gg.MakeFString(1801120, "", "", "", "", ""));
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_event_elemental);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1: {
if (debug_mode) {
myself.Say("[dbg] 빙궁기사 스폰");

}
myself.Shout(gg.MakeFString(1801121, "", "", "", "", ""));
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_event_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 2: {
if (debug_mode) {
myself.Say("[dbg] 결빙석 스폰");

}
myself.Shout(gg.MakeFString(1801122, "", "", "", "", ""));
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_ice_castle);
if (gg.IsNull(maker0) == 0) {
if (is_hard_mode == 1) {
for (i2 = 0; i2 < 7; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

} else {
for (i2 = 0; i2 < 5; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

}

}
break;

}
case 3: {
if (debug_mode) {
myself.Say("[dbg] 결빙석 + 숨결 혼합. 3+3");

}
myself.Shout(gg.MakeFString(1801123, "", "", "", "", ""));
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_ice_castle);
if (gg.IsNull(maker0) == 0) {
for (i2 = 0; i2 < 3; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

}
for (i2 = 0; i2 < 3; i2 = i2 + 1) {
pos0 = gg.GetRandomPosInCreature(myself.sm, 50, 500);
myself.CreateOnePrivateEx(1018854, "ai_icequeen_elemental", 0, 0, gg.FloatToInt(pos0.x), gg.FloatToInt(pos0.y), gg.FloatToInt(pos0.z), 0, gg.GetIndexFromCreature(myself.top_desire_target), 0, 0);

}

}

}

}

} else if (timer_id == TIMER_delay) {
if (myself.i_ai8 == 0) {
myself.i_ai8 = 1;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam pos0) {
if (skill_name_id == Skill02_ID && success == 1) {
if (debug_mode) {
myself.Say("대상지목 use_skill_finished");

}
if (myself.IsNullCreature(target) == 0) {
if (myself.DistFromMe(target) >= 300) {
myself.AddUseSkillDesire(target, Dash, 0, 1, 100000000000);

} else if (debug_mode) {
myself.Say("대상지목 상대가 너무 가까워 대쉬스킬 발동 안함.");

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai7 == 0 && myself.i_ai8 == 1) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 || myself.IsInCategory(123, creature.npc_class_id) == 1) {
myself.MakeAttackEvent(creature, 1000, 0);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 23140020) {
if (myself.i_ai7 != 1) {
myself.Despawn();

}

} else if (script_event_arg1 == 23140048) {
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam pos0, HandlerParam maker0) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1 : 숨결");

}
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_event_elemental);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (reply == 2) {
if (debug_mode) {
myself.Say("2 : 빙궁기사");

}
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_event_knight);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (reply == 3) {
if (debug_mode) {
myself.Say("3 : 결빙석");

}
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_ice_castle);
if (gg.IsNull(maker0) == 0) {
if (is_hard_mode == 1) {
for (i2 = 0; i2 < 7; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

} else {
for (i2 = 0; i2 < 5; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

}

}

} else if (reply == 4) {
if (debug_mode) {
myself.Say("4 : 결빙석 + 숨결 혼합. 3+3");

}
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MAKER_ice_castle);
if (gg.IsNull(maker0) == 0) {
for (i2 = 0; i2 < 3; i2 = i2 + 1) {
gg.SendMakerScriptEvent(maker0, 23140015, 0, 0);

}

}
for (i2 = 0; i2 < 3; i2 = i2 + 1) {
pos0 = gg.GetRandomPosInCreature(myself.sm, 50, 500);
myself.CreateOnePrivateEx(1018854, "ai_icequeen_elemental", 0, 0, gg.FloatToInt(pos0.x), gg.FloatToInt(pos0.y), gg.FloatToInt(pos0.z), 0, gg.GetIndexFromCreature(myself.top_desire_target), 0, 0);

}

}
	}


}