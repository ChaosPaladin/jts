package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss04_antaras extends default_npc {
	protected int GM_ID = 10;
	protected int ultra_respawn_time = 5;
	protected int TID_RESTART_CHECK = 2005;
	protected int TID_ANTARAS_ENGAGE = 1001;
	protected int TID_COMBAT_COOLTIME = 1002;
	protected int TID_IDLE_TOO_LONG = 1003;
	protected int TID_ULTRALISK_COOLTIME = 1100;
	protected int TID_TARASQUE_COOLTIME = 1101;
	protected int TID_USED_FEAR_LONG = 2000;
	protected int TID_USED_FEAR_SHORT = 2002;
	protected int TID_FEAR_COOLTIME = 2001;
	protected int TID_ZERGLING_DESPAWN = 2003;
	protected int TID_ANTARAS_ADVENT_STEP_1 = 1201;
	protected int TID_ANTARAS_ADVENT_STEP_2 = 1202;
	protected int TID_ANTARAS_ADVENT_STEP_3 = 1203;
	protected int TID_ANTARAS_ADVENT_STEP_4 = 1204;
	protected int TID_ANTARAS_ADVENT_STEP_5 = 1205;
	protected int TID_ANTARAS_ADVENT_STEP_6 = 1206;
	protected int TID_ENGAGE_TIMEOVER = 78001;
	protected int TID_FEAR_SHORT_MOVE_TIMEOVER = 78002;
	protected int TID_FEAR_LONG_MOVE_TIMEOVER = 78003;
	protected int TIME_TARASQUE_COOLTIME = 5;
	protected int babble_mode = 2;
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c1, HandlerParam c2, HandlerParam c3) {
myself.i_ai0 = 0;
myself.i_ai1 = myself.GetTick();
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = myself.GetTick();
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
if (GM_ID != 0 && myself.GetGlobalMap(GM_ID) == -1) {
myself.RegisterGlobalMap(GM_ID, gg.GetIndexFromCreature(myself.sm));

}
if (reply == 0) {
myself.SetDBValue(myself.sm, 0);
myself.EarthQuakeByNPC(myself.sm, 20, 10, 1, 0, 0, 0);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "CREATED: respawned after death", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else {
myself.AddTimerEx(TID_RESTART_CHECK, 3000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "CREATED: spawned after server restart", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}
if (babble_mode == 1) {
myself.Shout(myself.sm.name + "의 DB:" + myself.sm.db_value);

}
	}

	protected void NO_DESIRE() {
if (myself.sm.db_value == 3) {
myself.AddMoveAroundDesire(5, 5);

} else if (myself.sm.db_value == 0) {
myself.RemoveAllDesire();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c1, HandlerParam c2, HandlerParam c3) {
if (script_event_arg1 == 12013 || script_event_arg1 == 12015) {
return;

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: event accepted", myself.sm.db_value, script_event_arg1, 0, 0, myself.i_quest0, 1);

}
if (script_event_arg1 == 99999999) {
myself.MPCC_SetMasterPartyRouting(script_event_arg2, myself.sm, 1);
myself.int_list.Add(script_event_arg2);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: admitting loot permission for alliance", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}
if (myself.sm.db_value == 0 && script_event_arg1 == 78010088) {
myself.SetDBValue(myself.sm, 1);
if (babble_mode == 1) {
myself.AddTimerEx(TID_ANTARAS_ENGAGE, 60 * 1000);

} else {
myself.AddTimerEx(TID_ANTARAS_ENGAGE, 20 * 60 * 1000);

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: PC counter initialized", myself.sm.db_value, myself.i_quest0, 0, 0, myself.i_quest0, script_event_arg2);

}

}
if (script_event_arg1 == 12010) {
if (script_event_arg2 != -1) {
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg2);

}
if (myself.IsNullCreature(myself.c_ai1) == 0 && myself.c_ai1.is_pc != 0 || myself.IsInCategory(12, myself.c_ai1.npc_class_id)) {
myself.AddUseSkillDesire(myself.c_ai1, 269352962, 0, 1, 2000000);

} else if (myself.IsNullCreature(myself.c_ai2) == 0 && myself.c_ai2.is_pc != 0 || myself.IsInCategory(12, myself.c_ai2.npc_class_id)) {
myself.AddUseSkillDesire(myself.c_ai2, 269352962, 0, 1, 2000000);

} else if (myself.IsNullCreature(myself.c_ai3) == 0 && myself.c_ai3.is_pc != 0 || myself.IsInCategory(12, myself.c_ai3.npc_class_id)) {
myself.AddUseSkillDesire(myself.c_ai3, 269352962, 0, 1, 2000000);

} else if (myself.IsNullCreature(myself.c_ai4) == 0 && myself.c_ai4.is_pc != 0 || myself.IsInCategory(12, myself.c_ai4.npc_class_id)) {
myself.AddUseSkillDesire(myself.c_ai4, 269352962, 0, 1, 2000000);

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: target PC acknowledged", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 0);

}

}
if (script_event_arg1 == 12001) {
myself.i_quest2 = myself.i_quest2 + 1;
i0 = 0;
if (myself.i_quest1 == 0) {
myself.i_quest1 = script_event_arg2;
if (script_event_arg3 != -1) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

}

} else {
i0 = script_event_arg2;

}
if (i0 >= myself.i_quest1) {
myself.i_quest1 = script_event_arg2;
if (script_event_arg3 != -1) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

}

}
if (myself.i_quest2 == 19) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEventEx(12002, gg.GetIndexFromCreature(myself.c_ai0), 0, 8000);

}
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.c_ai0 = gg.GetNullCreature();

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: PC density data received", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 0);

}

}
if (script_event_arg1 == 12019) {
myself.i_quest2 = myself.i_quest2 + 1;
i0 = 0;
if (myself.i_quest1 == 0) {
myself.i_quest1 = script_event_arg2;
if (script_event_arg3 != -1) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

}

} else {
i0 = script_event_arg2;

}
if (i0 >= myself.i_quest1) {
myself.i_quest1 = script_event_arg2;
if (script_event_arg3 != -1) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

}

}
if (myself.i_quest2 == 19) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEventEx(12020, gg.GetIndexFromCreature(myself.c_ai0), 0, 8000);

}
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.c_ai0 = gg.GetNullCreature();

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "SCRIPT_EVENT: PC dense area selected", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam private) {
i5 = myself.GetGlobalMap(10);
if (i5 != -1) {
c2 = gg.GetCreatureFromIndex(i5);

} else {
c2 = gg.GetNullCreature();

}
if (timer_id == TID_ANTARAS_ENGAGE) {
myself.SetDBValue(myself.sm, 2);
myself.InstantTeleport(myself.sm, 185452, 114835, -8221);
myself.AddMoveToDesire(181911, 114835, -7678, 1000000000000);
myself.AddTimerEx(TID_ENGAGE_TIMEOVER, 30 * 1000);
myself.EffectMusic(myself.sm, 10000, "BS02_A");
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: condition satisfied, starting movement", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ANTARAS_ADVENT_STEP_1) {
myself.SpecialCamera(myself.sm, 700, 13, -19, 0, 10000, 20000, 0, 0, 0, 0, 0);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_2, 3000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: scene 1 finished", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ANTARAS_ADVENT_STEP_2) {
myself.SpecialCamera(myself.sm, 700, 13, 0, 6000, 10000, 20000, 0, 0, 0, 0, 0);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_3, 10000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: scene 2 finished", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ANTARAS_ADVENT_STEP_3) {
myself.SpecialCamera(myself.sm, 3700, 0, -3, 0, 10000, 10000, 0, 0, 0, 0, 0);
myself.AddEffectActionDesire(myself.sm, 1, 8000, 10000000);
myself.AddEffectActionDesire(myself.sm, 2, 6000, 5000000);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_4, 200);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: scene 3 finished", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ANTARAS_ADVENT_STEP_4) {
myself.SpecialCamera(myself.sm, 1100, 0, -3, 22000, 10000, 30000, 0, 0, 0, 0, 0);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_5, 10800);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: scene 4 finished", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ANTARAS_ADVENT_STEP_5) {
myself.SetDBValue(myself.sm, 3);
myself.SpecialCamera(myself.sm, 1100, 0, -3, 300, 10000, 7000, 0, 0, 0, 0, 0);
myself.AddTimerEx(TID_COMBAT_COOLTIME, 1 * 60 * 1000);
myself.i_ai1 = myself.GetTick();
myself.i_quest4 = myself.GetTick();
c3 = myself.FindNeighborHero(4000);
if (myself.IsNullCreature(c3) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 1, 0, 0, 0, 0, 0, 3000, 0, gg.MakeFString(1000520, c3.name, "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, 270336001, 1, 1, 4000000);
myself.AddMoveToDesire(179011, 114871, -7704, 3000000);
if (myself.IsNullCreature(myself.c_ai2) || myself.DistFromMe(myself.c_ai2) > 9000 || myself.c_ai2.alive == 0) {
myself.i_ai2 = 0;

}
if (myself.IsNullCreature(myself.c_ai3) || myself.DistFromMe(myself.c_ai3) > 9000 || myself.c_ai3.alive == 0) {
myself.i_ai3 = 0;

}
if (myself.IsNullCreature(myself.c_ai4) || myself.DistFromMe(myself.c_ai4) > 9000 || myself.c_ai4.alive == 0) {
myself.i_ai4 = 0;

}
if (myself.i_ai2 > myself.i_ai3) {
i1 = 2;
i2 = myself.i_ai2;
c2 = myself.c_ai2;

} else if (myself.i_ai3 > 0) {
i1 = 3;
i2 = myself.i_ai3;
c2 = myself.c_ai3;

}
if (myself.i_ai4 > i2) {
i1 = 4;
i2 = myself.i_ai4;
c2 = myself.c_ai4;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 2: {
myself.i_ai2 = 500;
break;

}
case 3: {
myself.i_ai3 = 500;
break;

}
case 4: {
myself.i_ai4 = 500;
break;

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c2, 269352961, 0, 1, 1000000);

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 7) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 3) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

}
myself.AddMoveAroundDesire(5, 5);
myself.AddTimerEx(TID_ULTRALISK_COOLTIME, ultra_respawn_time * 60 * 1000);
myself.AddTimerEx(TID_TARASQUE_COOLTIME, TIME_TARASQUE_COOLTIME * 60 * 1000);
myself.i_quest3 = 1;
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: starting combat", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (timer_id == TID_ULTRALISK_COOLTIME && myself.sm.db_value == 3) {
if (myself.i_quest3 >= 4 && myself.Maker_GetNpcCount() < 96) {
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_quest3 >= 3 && myself.Maker_GetNpcCount() < 97) {
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_quest3 >= 2 && myself.Maker_GetNpcCount() < 98) {
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.Maker_GetNpcCount() < 99) {
myself.CreateOnePrivateEx(1029069, "antaras_ultrarisk", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (gg.Rand(100) > 10 && myself.i_quest3 < 4) {
myself.i_quest3 = myself.i_quest3 + 1;

}
myself.AddTimerEx(TID_ULTRALISK_COOLTIME, ultra_respawn_time * 60 * 1000);

} else if (timer_id == TID_TARASQUE_COOLTIME && myself.sm.db_value == 3) {
if (myself.i_quest3 >= 4 && myself.Maker_GetNpcCount() < 96) {
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: spawing tarasque(" + myself.i_quest3 + "/" + myself.Maker_GetNpcCount() + ")", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_quest3 >= 3 && myself.Maker_GetNpcCount() < 97) {
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: spawing tarasque(" + myself.i_quest3 + "/" + myself.Maker_GetNpcCount() + ")", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_quest3 >= 2 && myself.Maker_GetNpcCount() < 98) {
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: spawing tarasque(" + myself.i_quest3 + "/" + myself.Maker_GetNpcCount() + ")", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.Maker_GetNpcCount() < 99) {
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: spawing tarasque(" + myself.i_quest3 + "/" + myself.Maker_GetNpcCount() + ")", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
myself.CreateOnePrivateEx(1029190, "antaras_tarasque", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
myself.AddTimerEx(TID_TARASQUE_COOLTIME, TIME_TARASQUE_COOLTIME * 60 * 1000);

} else if (timer_id == TID_COMBAT_COOLTIME && myself.sm.db_value == 3) {
if (myself.GetTick() - myself.i_ai1 > 15 * 60 * 1000 || babble_mode == 1 && myself.GetTick() - myself.i_ai1 > 3 * 60 * 1000) {
myself.BroadcastScriptEventEx(12015, 0, 0, 8000);
myself.BroadcastScriptEventEx(12013, 0, 0, 8000);
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
myself.RemoveAllDesire();
myself.StopMove();
myself.InstantTeleportInMyTerritory(80464, 152294, -3534, 100);
myself.InstantTeleport(myself.sm, 185708, 114298, -8221);
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;
myself.i_ai1 = myself.GetTick();
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = myself.GetTick();
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.AddTimerEx(TID_IDLE_TOO_LONG, 5 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: too long non-aggressiveness, initializing", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else {
myself.BroadcastScriptEventEx(12021, 0, 0, 8000);
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(277938177)) < 14) {
myself.AddUseSkillDesire(myself.sm, 277938177, 0, 1, 4000000);

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(277872641)) < 13) {
myself.AddUseSkillDesire(myself.sm, 277872641, 0, 1, 4000000);

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(277807105)) < 12) {
myself.AddUseSkillDesire(myself.sm, 277807105, 0, 1, 4000000);

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(270336001)) < 11) {
myself.AddUseSkillDesire(myself.sm, 270336001, 0, 1, 4000000);

}
if (myself.i_ai2 > 10) {
myself.i_ai2 = myself.i_ai2 - gg.Rand(9) + 1;

}
if (myself.i_ai3 > 10) {
myself.i_ai3 = myself.i_ai3 - gg.Rand(9) + 1;

}
if (myself.i_ai4 > 10) {
myself.i_ai4 = myself.i_ai4 - gg.Rand(9) + 1;

}
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
if (myself.IsNullCreature(myself.c_ai2) || myself.DistFromMe(myself.c_ai2) > 9000 || myself.c_ai2.alive == 0) {
myself.i_ai2 = 0;

}
if (myself.IsNullCreature(myself.c_ai3) || myself.DistFromMe(myself.c_ai3) > 9000 || myself.c_ai3.alive == 0) {
myself.i_ai3 = 0;

}
if (myself.IsNullCreature(myself.c_ai4) || myself.DistFromMe(myself.c_ai4) > 9000 || myself.c_ai4.alive == 0) {
myself.i_ai4 = 0;

}
if (myself.i_ai2 > myself.i_ai3) {
i1 = 2;
i2 = myself.i_ai2;
c2 = myself.c_ai2;

} else if (myself.i_ai3 > 0) {
i1 = 3;
i2 = myself.i_ai3;
c2 = myself.c_ai3;

}
if (myself.i_ai4 > i2) {
i1 = 4;
i2 = myself.i_ai4;
c2 = myself.c_ai4;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 2: {
myself.i_ai2 = 500;
break;

}
case 3: {
myself.i_ai3 = 500;
break;

}
case 4: {
myself.i_ai4 = 500;
break;

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c2, 269352961, 0, 1, 1000000);

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 7) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 3) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

}

}
myself.AddTimerEx(TID_COMBAT_COOLTIME, 1 * 60 * 1000);

}

} else if (timer_id == TID_IDLE_TOO_LONG) {
myself.BroadcastScriptEventEx(12015, 0, 0, 8000);

} else if (timer_id == TID_USED_FEAR_LONG) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddMoveToDesire(177648, 114816, -7735, 3000000);
myself.AddTimerEx(TID_FEAR_LONG_MOVE_TIMEOVER, 10 * 1000);
if (myself.IsNullCreature(c0) == 0 && myself.sm == c0) {
myself.AddTimerEx(TID_FEAR_COOLTIME, ultra_respawn_time + 2 * 60 * 1000);

} else if (myself.IsNullCreature(c1) == 0 && myself.sm == c1) {
myself.AddTimerEx(TID_FEAR_COOLTIME, ultra_respawn_time * 60 * 1000);

} else {
myself.AddTimerEx(TID_FEAR_COOLTIME, ultra_respawn_time - 2 * 60 * 1000);

}

}

} else if (timer_id == TID_USED_FEAR_SHORT) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddMoveToDesire(177777, 114816, -7735, 3000000);
myself.AddTimerEx(TID_FEAR_SHORT_MOVE_TIMEOVER, 10 * 1000);
myself.AddTimerEx(TID_FEAR_COOLTIME, ultra_respawn_time * 60 * 1000);

}

} else if (timer_id == TID_FEAR_COOLTIME && myself.i_ai0 > 0) {
myself.i_ai0 = 0;

} else if (timer_id == TID_ZERGLING_DESPAWN) {
myself.BroadcastScriptEventEx(12013, 0, 0, 8000);

} else if (timer_id == TID_RESTART_CHECK) {
if (myself.sm.db_value == 1) {
if (babble_mode == 1) {
myself.AddTimerEx(TID_ANTARAS_ENGAGE, 30 * 1000);

} else {
myself.AddTimerEx(TID_ANTARAS_ENGAGE, 30 * 60 * 1000);

}
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: resuming recorded status - waiting for entering PCs (1)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (myself.sm.db_value == 2) {
myself.InstantTeleport(myself.sm, 185452, 114835, -8221);
myself.AddMoveToDesire(181911, 114835, -7678, 1000000000000);
myself.AddTimerEx(TID_ENGAGE_TIMEOVER, 30 * 1000);
myself.EffectMusic(myself.sm, 10000, "BS02_A");
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: resuming recorded status - approach 1 (2)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (myself.sm.db_value == 4) {
myself.InstantTeleport(myself.sm, 181911, 114835, -7678);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_1, 2 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: resuming recorded status - approach 2 (4)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (myself.sm.db_value == 3) {
myself.AddTimerEx(TID_COMBAT_COOLTIME, 1 * 60 * 1000);
myself.AddTimerEx(TID_ULTRALISK_COOLTIME, 2 * 60 * 1000);
myself.i_quest3 = 1;
myself.AddMoveAroundDesire(5, 5);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: resuming recorded status - combat (3)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else {
myself.InstantTeleport(myself.sm, 185708, 114298, -8221);
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;
myself.i_ai1 = myself.GetTick();
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = myself.GetTick();
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: initializing recorded status - standby (0)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}

} else if (timer_id == TID_ENGAGE_TIMEOVER) {
if (myself.sm.db_value == 2 && gg.FloatToInt(myself.sm.x) < 181811 || gg.FloatToInt(myself.sm.x) > 182011 || gg.FloatToInt(myself.sm.y) < 114735 || gg.FloatToInt(myself.sm.y) > 114935) {
myself.RemoveAllDesire();
myself.SetDBValue(myself.sm, 4);
myself.InstantTeleport(myself.sm, 181911, 114835, -7678);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_1, 2 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: time exceeded (approach) - position fixed", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}

} else if (timer_id == TID_FEAR_SHORT_MOVE_TIMEOVER) {
if (myself.sm.db_value == 3 && myself.i_ai0 == 1 && gg.FloatToInt(myself.sm.x) < 177677 || gg.FloatToInt(myself.sm.x) > 177877) {
myself.i_ai0 = 2;
myself.InstantTeleport(myself.sm, 177777, 114816, -7735);
myself.BroadcastScriptEventEx(12000, i0, 0, 8000);
myself.RemoveAllDesire();
myself.AddTimerEx(TID_ZERGLING_DESPAWN, 30 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: time exceeded (short fear move) - position fixed", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}

} else if (timer_id == TID_FEAR_LONG_MOVE_TIMEOVER) {
if (myself.sm.db_value == 3 && myself.i_ai0 == 1 && gg.FloatToInt(myself.sm.x) < 177548 || gg.FloatToInt(myself.sm.x) > 177748) {
myself.i_ai0 = 2;
myself.InstantTeleport(myself.sm, 177648, 114816, -7735);
myself.BroadcastScriptEventEx(12016, 0, 0, 8000);
myself.RemoveAllDesire();
myself.AddTimerEx(TID_ZERGLING_DESPAWN, 30 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: time exceeded (long fear move) - position fixed", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.sm.db_value == 2) {
myself.SetDBValue(myself.sm, 4);
myself.AddTimerEx(TID_ANTARAS_ADVENT_STEP_1, 2 * 1000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "MOVE_TO_FINISHED: approach accomplished", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}

} else if (myself.sm.db_value == 3 && myself.i_ai0 == 1 && gg.FloatToInt(myself.sm.x) >= 177548 && gg.FloatToInt(myself.sm.x) <= 177748 || gg.FloatToInt(myself.sm.x) >= 177677 && gg.FloatToInt(myself.sm.x) <= 177877) {
myself.i_ai0 = 2;
if (gg.FloatToInt(myself.sm.x) >= 177548 && gg.FloatToInt(myself.sm.x) <= 177748) {
myself.BroadcastScriptEventEx(12016, 0, 0, 8000);

} else {
myself.BroadcastScriptEventEx(12000, i0, 0, 8000);

}
myself.RemoveAllDesire();
myself.AddTimerEx(TID_ZERGLING_DESPAWN, 30 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.sm.db_value == 3 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetTick() - myself.i_quest4 < 2 * 60 * 1000 && myself.sm.hp < myself.sm.max_hp * 0.900000 && myself.i_quest3 < 2) {
myself.i_quest3 = 2;

} else if (myself.GetTick() - myself.i_quest4 < 4 * 60 * 1000 && myself.sm.hp < myself.sm.max_hp * 0.700000 && myself.i_quest3 < 3) {
myself.i_quest3 = 3;

} else if (myself.GetTick() - myself.i_quest4 < 7 * 60 * 1000 && myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_quest3 < 4) {
if (myself.i_ai0 > 0) {
myself.i_ai0 = 0;

}
myself.i_quest3 = 4;
myself.AddUseSkillDesire(attacker, 269221889, 0, 1, 1000000);

}
myself.i_ai1 = myself.GetTick();
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (skill_name_id == 0) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && attacker == myself.c_ai2) {
if (myself.i_ai2 < damage * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && attacker == myself.c_ai3) {
if (myself.i_ai3 < damage * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && attacker == myself.c_ai4) {
if (myself.i_ai4 < damage * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_ai2 = attacker;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_ai3 = attacker;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_ai4 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && attacker == myself.c_ai2) {
if (myself.i_ai2 < damage / 30.000000 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && attacker == myself.c_ai3) {
if (myself.i_ai3 < damage / 30.000000 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && attacker == myself.c_ai4) {
if (myself.i_ai4 < damage / 30.000000 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_ai2 = attacker;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_ai3 = attacker;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_ai4 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && attacker == myself.c_ai2) {
if (myself.i_ai2 < damage / 50.000000 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && attacker == myself.c_ai3) {
if (myself.i_ai3 < damage / 50.000000 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && attacker == myself.c_ai4) {
if (myself.i_ai4 < damage / 50.000000 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_ai2 = attacker;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_ai3 = attacker;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_ai4 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && attacker == myself.c_ai2) {
if (myself.i_ai2 < damage / 100.000000 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && attacker == myself.c_ai3) {
if (myself.i_ai3 < damage / 100.000000 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && attacker == myself.c_ai4) {
if (myself.i_ai4 < damage / 100.000000 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_ai2 = attacker;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_ai3 = attacker;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_ai4 = attacker;
break;

}

}

}

} else if (myself.IsNullCreature(myself.c_ai2) != 0 && attacker == myself.c_ai2) {
if (myself.i_ai2 < damage / 150.000000 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && attacker == myself.c_ai3) {
if (myself.i_ai3 < damage / 150.000000 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && attacker == myself.c_ai4) {
if (myself.i_ai4 < damage / 150.000000 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_ai2 = attacker;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_ai3 = attacker;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_ai4 = attacker;
break;

}

}

}
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
if (myself.IsNullCreature(myself.c_ai2) || myself.DistFromMe(myself.c_ai2) > 9000 || myself.c_ai2.alive == 0) {
myself.i_ai2 = 0;

}
if (myself.IsNullCreature(myself.c_ai3) || myself.DistFromMe(myself.c_ai3) > 9000 || myself.c_ai3.alive == 0) {
myself.i_ai3 = 0;

}
if (myself.IsNullCreature(myself.c_ai4) || myself.DistFromMe(myself.c_ai4) > 9000 || myself.c_ai4.alive == 0) {
myself.i_ai4 = 0;

}
if (myself.i_ai2 > myself.i_ai3) {
i1 = 2;
i2 = myself.i_ai2;
c2 = myself.c_ai2;

} else if (myself.i_ai3 > 0) {
i1 = 3;
i2 = myself.i_ai3;
c2 = myself.c_ai3;

}
if (myself.i_ai4 > i2) {
i1 = 4;
i2 = myself.i_ai4;
c2 = myself.c_ai4;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 2: {
myself.i_ai2 = 500;
break;

}
case 3: {
myself.i_ai3 = 500;
break;

}
case 4: {
myself.i_ai4 = 500;
break;

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c2, 269352961, 0, 1, 1000000);

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 7) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 3) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

}

}

} else if (myself.sm.db_value == 0 || myself.sm.db_value == 1 && myself.sm.alive == 1 && myself.InMyTerritory(myself.sm) == 1) {
myself.InstantTeleportInMyTerritory(80464, 152294, -3534, 100);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "ATTACKED: aggressiveness during noncombat status (in territory)", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
if (gg.FloatToInt(myself.sm.x) < 185608 || gg.FloatToInt(myself.sm.x) > 185808 || gg.FloatToInt(myself.sm.y) < 114198 || gg.FloatToInt(myself.sm.y) > 114398) {
myself.InstantTeleport(myself.sm, 185708, 114298, -8221);

}

} else if (myself.sm.db_value == 0 || myself.sm.db_value == 1 && myself.sm.alive == 1) {
myself.InstantTeleport(attacker, 80464, 152294, -3534);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "ATTACKED: aggressiveness during noncombat status", myself.sm.db_value, 0, 0, 0, myself.i_quest0, 1);

}
if (gg.FloatToInt(myself.sm.x) < 185608 || gg.FloatToInt(myself.sm.x) > 185808 || gg.FloatToInt(myself.sm.y) < 114198 || gg.FloatToInt(myself.sm.y) > 114398) {
myself.InstantTeleport(myself.sm, 185708, 114298, -8221);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.sm.db_value == 3 && creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.sm.db_value == 3 && myself.IsInCategory(3, creature.occupation)) {
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && creature == myself.c_ai2) {
if (myself.i_ai2 < 10 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && creature == myself.c_ai3) {
if (myself.i_ai3 < 10 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && creature == myself.c_ai4) {
if (myself.i_ai4 < 10 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai2 = creature;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai3 = creature;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai4 = creature;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && creature == myself.c_ai2) {
if (myself.i_ai2 < 6 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && creature == myself.c_ai3) {
if (myself.i_ai3 < 6 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && creature == myself.c_ai4) {
if (myself.i_ai4 < 6 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai2 = creature;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai3 = creature;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai4 = creature;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (myself.IsNullCreature(myself.c_ai2) != 0 && creature == myself.c_ai2) {
if (myself.i_ai2 < 3 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && creature == myself.c_ai3) {
if (myself.i_ai3 < 3 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && creature == myself.c_ai4) {
if (myself.i_ai4 < 3 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai2 = creature;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai3 = creature;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai4 = creature;
break;

}

}

}

} else if (myself.IsNullCreature(myself.c_ai2) != 0 && creature == myself.c_ai2) {
if (myself.i_ai2 < 2 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && creature == myself.c_ai3) {
if (myself.i_ai3 < 2 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && creature == myself.c_ai4) {
if (myself.i_ai4 < 2 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai2 = creature;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai3 = creature;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai4 = creature;
break;

}

}

}

} else if (myself.IsNullCreature(myself.c_ai2) != 0 && creature == myself.c_ai2) {
if (myself.i_ai2 < 1 * 1000 + 1000) {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai3) != 0 && creature == myself.c_ai3) {
if (myself.i_ai3 < 1 * 1000 + 1000) {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (myself.IsNullCreature(myself.c_ai4) != 0 && creature == myself.c_ai4) {
if (myself.i_ai4 < 1 * 1000 + 1000) {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_ai2 > myself.i_ai3) {
i1 = 3;

} else if (myself.i_ai2 == myself.i_ai3) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_ai2 < myself.i_ai3) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_ai2 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai2 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_ai2 < myself.i_ai4) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_ai3 > myself.i_ai4) {
i1 = 4;

} else if (myself.i_ai3 == myself.i_ai4) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_ai3 < myself.i_ai4) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_ai2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai2 = creature;
break;

}
case 3: {
myself.i_ai3 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai3 = creature;
break;

}
case 4: {
myself.i_ai4 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_ai4 = creature;
break;

}

}

}
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
if (myself.IsNullCreature(myself.c_ai2) || myself.DistFromMe(myself.c_ai2) > 9000 || myself.c_ai2.alive == 0) {
myself.i_ai2 = 0;

}
if (myself.IsNullCreature(myself.c_ai3) || myself.DistFromMe(myself.c_ai3) > 9000 || myself.c_ai3.alive == 0) {
myself.i_ai3 = 0;

}
if (myself.IsNullCreature(myself.c_ai4) || myself.DistFromMe(myself.c_ai4) > 9000 || myself.c_ai4.alive == 0) {
myself.i_ai4 = 0;

}
if (myself.i_ai2 > myself.i_ai3) {
i1 = 2;
i2 = myself.i_ai2;
c2 = myself.c_ai2;

} else if (myself.i_ai3 > 0) {
i1 = 3;
i2 = myself.i_ai3;
c2 = myself.c_ai3;

}
if (myself.i_ai4 > i2) {
i1 = 4;
i2 = myself.i_ai4;
c2 = myself.c_ai4;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 2: {
myself.i_ai2 = 500;
break;

}
case 3: {
myself.i_ai3 = 500;
break;

}
case 4: {
myself.i_ai4 = 500;
break;

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c2, 269352961, 0, 1, 1000000);

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 7) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 3) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (skill_name_id == 269221889) {
myself.AddTimerEx(TID_USED_FEAR_LONG, 7 * 1000);

} else if (skill_name_id == 333709313) {
myself.AddTimerEx(TID_USED_FEAR_SHORT, 7 * 1000);

}
if (myself.IsNullCreature(myself.c_ai2) || myself.DistFromMe(myself.c_ai2) > 9000 || myself.c_ai2.alive == 0) {
myself.i_ai2 = 0;

}
if (myself.IsNullCreature(myself.c_ai3) || myself.DistFromMe(myself.c_ai3) > 9000 || myself.c_ai3.alive == 0) {
myself.i_ai3 = 0;

}
if (myself.IsNullCreature(myself.c_ai4) || myself.DistFromMe(myself.c_ai4) > 9000 || myself.c_ai4.alive == 0) {
myself.i_ai4 = 0;

}
if (myself.i_ai2 > myself.i_ai3) {
i1 = 2;
i2 = myself.i_ai2;
c2 = myself.c_ai2;

} else if (myself.i_ai3 > 0) {
i1 = 3;
i2 = myself.i_ai3;
c2 = myself.c_ai3;

}
if (myself.i_ai4 > i2) {
i1 = 4;
i2 = myself.i_ai4;
c2 = myself.c_ai4;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 2: {
myself.i_ai2 = 500;
break;

}
case 3: {
myself.i_ai3 = 500;
break;

}
case 4: {
myself.i_ai4 = 500;
break;

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c2, 269352961, 0, 1, 1000000);

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 40 && myself.DistFromMe(c2) < 850 && myself.GetDirection(c2) < 180 + 30 && myself.GetDirection(c2) > 180 - 30 || myself.DistFromMe(c2) < 425 && myself.GetDirection(c2) < 180 + 90 && myself.GetDirection(c2) > 180 - 90) {
myself.AddUseSkillDesire(myself.sm, 269287425, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 7) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 10 && myself.DistFromMe(c2) < 1100) {
myself.AddUseSkillDesire(myself.sm, 269090817, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 80 && myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
myself.AddUseSkillDesire(myself.sm, 269156353, 0, 1, 1000000);

} else if (gg.Rand(100) < 3) {
myself.AddUseSkillDesire(c2, 333774849, 0, 1, 1000000);

} else if (gg.Rand(100) < 6) {
myself.AddUseSkillDesire(c2, 269418497, 0, 1, 1000000);

} else if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269484033, 0, 1, 1000000);

} else if (gg.Rand(100) < 5) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(c2, 269221889, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, 333709313, 0, 1, 1000000);

}

} else {
myself.AddUseSkillDesire(c2, 269549569, 0, 1, 1000000);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_quest4 = myself.i_quest4 - 1;

}
	}

	protected void MY_DYING(HandlerParam private, HandlerParam last_attacker, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0) {
myself.SpecialCamera(myself.sm, 1200, 20, -10, 0, 10000, 13000, 0, 0, 0, 0, 0);
myself.EffectMusic(myself.sm, 10000, "BS01_D");
myself.SetDBValue(myself.sm, 0);
myself.UnregisterGlobalMap(GM_ID);
myself.BroadcastScriptEventEx(12013, 0, 0, 8000);
myself.BroadcastScriptEventEx(12015, 0, 0, 8000);
if (babble_mode > 0) {
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "MY_DYING: dead and combat terminated", 0, 0, 0, 0, 0, 1);

}
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
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 8000) {
if (gg.HaveMemo(c1, 10290) == 1 && gg.GetMemoState(c1, 10290) == 1 && gg.OwnItemCount(c1, 15522) > 0) {
myself.DeleteItem1(c1, 15522, gg.OwnItemCount(c1, 15522));
myself.GiveItem1(c1, 15523, 1);
myself.SetMemoState(c1, 10290, 2);
myself.SetFlagJournal(c1, 10290, 2);
myself.ShowQuestMark(c1, 10290);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}

}

}

}
	}


}