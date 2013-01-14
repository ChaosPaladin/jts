package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rim_overseer extends abstract_maker {
	protected int inzone_type_param = 0;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;
	protected int inzone_cluster_id = 0;
	protected int Level = 0;
	protected int TimeLimit = 1200;
	protected int KillCountForD = 1;
	protected int KillCountForC = 2;
	protected int KillCountForB = 3;
	protected int KillCountForA = 4;
	protected int KillCountForS = 5;
	protected int KillCountForG = 7;
	protected int Bonus_ChainSpawnSuccess = 10;
	protected int Bonus_MobClearing = 50;
	protected int Bonus_KillCount = 2;
	protected int KillCountTime = 10;
	protected int TM_EntireTimeCheck = 78001;
	protected int TM_EntireTimeCheck2 = 78003;
	protected int TM_KillCountTimeCheck = 78002;
	protected int TM_GiftgiverEventDelay = 78004;
	protected int GiftgiverEventDelayTime = 5;
	protected int Log_ChainSpawnSuccess = 1013;
	protected int Log_MobClearing = 1014;
	protected int Log_NoKilling = 1015;
	protected int ScaleModValue = 10;
	protected int babble_mode = 0;
	protected int log_mode = 1;

	protected void ON_START() {
if (script_event_enable == 1) {
myself.enabled = script_event_enable;

} else {
myself.enabled = 0;

}
myself.RegisterInstantZoneEventEx(inzone_type_param, inzone_cluster_id, spawn_event_id, 1);
	}

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.enabled = reply;
if (myself.enabled == 1) {
myself.i_ai4 = 1;
myself.AddTimerEx(TM_EntireTimeCheck, TimeLimit * ScaleModValue / 10 * 1000);
myself.AddTimerEx(TM_KillCountTimeCheck, KillCountTime * ScaleModValue / 10 * 1000);
if (babble_mode == 1) {
gg.Announce("전체 타이머 개시:" + gg.IntToStr(gg.FloatToInt(TimeLimit * ScaleModValue / 10)) + "초");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn(def0.total, 0);

}

}

} else if (myself.enabled == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_npc, HandlerParam created_def) {
if (babble_mode == 1) {
gg.Announce("npc 스폰수:" + gg.IntToStr(created_def.npc_count));

}
if (myself.enabled == 0 || myself.i_ai4 == 0 && created_def != myself.GetSpawnDefine(1)) {
created_npc.Despawn();

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0) {
if (myself.enabled == 0 || myself.i_ai4 == 0) {
return;

}
if (script_event_arg1 == 78010044) {
if (babble_mode == 1) {
gg.Announce("NPC사망 점수: " + gg.IntToStr(script_event_arg2));

}
myself.i_ai0 = myself.i_ai0 + script_event_arg2;

} else if (script_event_arg1 == 78010046) {
if (script_event_arg2 < 0 && script_event_arg2 != -99) {
if (myself.i_ai1 > 0 && myself.i_ai1 < 10) {
myself.i_ai1 = myself.i_ai1 + script_event_arg2 + 3;
if (babble_mode == 1) {
gg.Announce("체인 스폰 - " + gg.IntToStr(myself.i_ai1) + "콤보");

}

} else {
myself.i_ai1 = 0 + script_event_arg2 + 3;
if (babble_mode == 1) {
gg.Announce("체인 스폰 - 콤보 시작 " + gg.IntToStr(myself.i_ai1));

}

}
i0 = myself.i_ai1 * Bonus_ChainSpawnSuccess;
if (i0 > 0) {
myself.i_ai0 = myself.i_ai0 + i0;
if (babble_mode == 1) {
gg.Announce("체인 스폰 점수: " + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogExWithoutCreature(Log_ChainSpawnSuccess, i0, 0);

}

}

} else {
if (babble_mode == 1) {
gg.Announce("체인 스폰 실패: 초기화");

}
myself.i_ai1 = 0;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0) {
if (myself.enabled == 0 || myself.i_ai4 == 0) {
return;

}
if (died != 0) {
myself.i_ai2 = myself.i_ai2 + 1;
if (gg.IsNull(deleted_def) == 0 && deleted_def == myself.GetSpawnDefine(0) && deleted_def.respawn_time != 0) {
if (myself.npc_count < myself.maximum_npc) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn(1, deleted_def.respawn_time);

}

}

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0) {
if (myself.enabled == 0 || myself.i_ai4 == 0) {
return;

}
i0 = gg.FloatToInt(Bonus_MobClearing);
if (i0 > 0) {
myself.i_ai0 = myself.i_ai0 + i0;
if (babble_mode == 1) {
gg.Announce("NPC 전체 사망:" + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogExWithoutCreature(Log_MobClearing, i0, 0);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam i0) {
if (timer_id == TM_EntireTimeCheck) {
if (babble_mode == 1) {
gg.Announce("**전체 시간 종료: 클래스 무관 득점" + gg.IntToStr(myself.i_ai0));

}
myself.i_ai4 = 0;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}
myself.AddTimerEx(TM_EntireTimeCheck2, 1 * 1000);

} else if (timer_id == TM_EntireTimeCheck2) {
if (myself.npc_count < myself.maximum_npc) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
if (babble_mode == 1) {
gg.Announce("기프트기버 스폰");

}
def0.Spawn(1, 0);
myself.AddTimerEx(TM_GiftgiverEventDelay, GiftgiverEventDelayTime * 1000);

}

} else if (babble_mode == 1) {
gg.Announce("rim_gift_giver 메이커 이상");

}

} else {
myself.AddTimerEx(TM_EntireTimeCheck2, 10 * 1000);

}

} else if (timer_id == TM_GiftgiverEventDelay && myself.i_ai4 == 0) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (babble_mode == 1) {
gg.Announce("기프트기버에게 점수 보냄");

}
def0.SendScriptEvent(78010045, myself.i_ai0, ScaleModValue);

}

} else if (timer_id == TM_KillCountTimeCheck && myself.i_ai4 > 0) {
if (myself.i_ai2 != 0) {
if (myself.i_ai2 >= KillCountForG) {
i0 = myself.i_ai2 * Bonus_KillCount * KillCountForG;

} else if (myself.i_ai2 >= KillCountForS) {
i0 = Bonus_KillCount * KillCountForS;

} else if (myself.i_ai2 >= KillCountForA) {
i0 = Bonus_KillCount * KillCountForA;

} else if (myself.i_ai2 >= KillCountForB) {
i0 = Bonus_KillCount * KillCountForB;

} else if (myself.i_ai2 >= KillCountForC) {
i0 = Bonus_KillCount * KillCountForC;

} else if (myself.i_ai2 >= KillCountForD) {
i0 = Bonus_KillCount * KillCountForD;

} else {
i0 = myself.i_ai2 * Bonus_KillCount;

}
if (babble_mode == 1) {
gg.Announce("킬카운트 점수: " + gg.IntToStr(i0));

}
myself.i_ai0 = myself.i_ai0 + i0;
myself.i_ai2 = 0;
if (log_mode == 1) {
gg.AddLogExWithoutCreature(Log_NoKilling, i0, 0);

}

}
myself.AddTimerEx(TM_KillCountTimeCheck, KillCountTime * ScaleModValue / 10 * 1000);

}
	}


}