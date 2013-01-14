package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class naia_main_maker extends default_maker {
	protected String area_naia_floor = "18_25_core_naia";
	protected String area_naia_pillar_1 = "18_25_naia_pillar_green";
	protected String area_naia_pillar_2 = "18_25_naia_pillar_red";
	protected String naia_door_name = "c_tower_xxx";
	protected int death_count_positive = 120;
	protected int death_count_negative = -120;
	protected int reset_count = 600;
	protected int babble_mode = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
def0 = myself.GetSpawnDefine(10);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam i0, HandlerParam maker0, HandlerParam def0) {
if (babble_mode == 1) {
gg.Announce("DB 이벤트 받음");

}
if (record0.is_alive) {
if (babble_mode == 1) {
gg.Announce("보스 DB 생존 상태 - 엘피 스폰");

}
loaded_def.SetDBLoaded(1);
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (loaded_def.respawn_time != 0) {
if (record0.death_time == 0) {
if (babble_mode == 1) {
gg.Announce("보스 DB 사망 시간 만료 상태(" + gg.IntToStr(record0.death_time) + ") - 엘피 스폰");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else {
if (babble_mode == 1) {
gg.Announce("보스 DB 사망 상태(" + gg.IntToStr(record0.death_time) + ") - 보스 리스폰 타임에 따라 엘피 스폰 등록");

}
i0 = record0.death_time + loaded_def.respawn_time + loaded_def.respawn_rand;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
if (babble_mode == 1) {
gg.Announce(gg.IntToStr(i0) + "에 엘피 리스폰");

}
def0.RegToRespawnTimer(i0);

}

}

}

} else if (babble_mode == 1) {
gg.Announce("DB확인 오류(" + gg.IntToStr(record0.death_time) + ")");

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam def0, HandlerParam reply, HandlerParam died, HandlerParam i0) {
if (myself.i_ai2 < 3 && myself.i_ai4 == 0) {
if (deleted_def == myself.GetSpawnDefine(0)) {
if (babble_mode == 1) {
gg.Announce("보스전 0단계 - 문 닫고 에리어 켬");

}
gg.Castle_GateOpenClose2(naia_door_name, 1);
gg.Area_SetOnOff(area_naia_floor, 1);
myself.i_ai2 = 1;
if (babble_mode == 1) {
gg.Announce("보스전 1단계 - spore 기본형 스폰");

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (deleted_def == myself.GetSpawnDefine(1)) {
myself.i_ai2 = 2;
if (babble_mode == 1) {
gg.Announce("보스전 2단계 - spore 원소형 스폰");

}
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

} else if (deleted_def == myself.GetSpawnDefine(2)) {
if (died == 0) {
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 + 1;
if (babble_mode == 1) {
gg.Announce("스포어 비전투 디스폰:" + gg.IntToStr(myself.i_ai3) + "/ " + gg.IntToStr(reset_count));

}
if (myself.i_ai3 >= reset_count) {
gg.SendMakerScriptEvent(myself, 78010035, 0, 0);
myself.i_ai2 = 5;

}

}

} else {
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 - 1;

}
myself.i_ai0 = myself.i_ai0 + 2;
if (myself.i_ai1 > 0) {
myself.i_ai1 = myself.i_ai1 - 1;

} else if (myself.i_ai1 < 0) {
myself.i_ai1 = myself.i_ai1 + 1;

}
if (babble_mode == 1) {
gg.Announce("fire-water counter: " + myself.i_ai0 + "/ wind-earth counter: " + myself.i_ai1);

}
if (myself.i_ai0 == 20 || myself.i_ai0 == 40 || myself.i_ai0 == 60 || myself.i_ai0 == 80 || myself.i_ai0 == 100) {
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, 0, 2);

}

}
if (myself.i_ai0 >= death_count_positive) {
if (babble_mode == 1) {
gg.Announce("보스전 3단계 - 쉠블러 워터 스폰");

}
myself.i_ai0 = 0;
myself.i_ai2 = 3;
myself.i_ai4 = 2;
for (i0 = 1; i0 <= 5; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, myself.i_ai4, 0);

}

}

} else {
if (myself.i_ai0 >= 0 && gg.Rand(1000) > 200) {
def0 = myself.GetSpawnDefine(3);

} else {
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}

} else if (deleted_def == myself.GetSpawnDefine(3)) {
if (died == 0) {
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 + 1;
if (babble_mode == 1) {
gg.Announce("스포어 비전투 디스폰:" + gg.IntToStr(myself.i_ai3) + "/ " + gg.IntToStr(reset_count));

}
if (myself.i_ai3 >= reset_count) {
gg.SendMakerScriptEvent(myself, 78010035, 0, 0);
myself.i_ai2 = 5;

}

}

} else {
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 - 1;

}
myself.i_ai0 = myself.i_ai0 - 2;
if (myself.i_ai1 > 0) {
myself.i_ai1 = myself.i_ai1 - 1;

} else if (myself.i_ai1 < 0) {
myself.i_ai1 = myself.i_ai1 + 1;

}
if (babble_mode == 1) {
gg.Announce("fire-water counter: " + myself.i_ai0 + "/ wind-earth counter: " + myself.i_ai1);

}
if (myself.i_ai0 == -20 || myself.i_ai0 == -40 || myself.i_ai0 == -60 || myself.i_ai0 == -80 || myself.i_ai0 == -100) {
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, 0, 3);

}

}
if (myself.i_ai0 <= death_count_negative) {
if (babble_mode == 1) {
gg.Announce("보스전 3단계 - 쉠블러 파이어 스폰");

}
myself.i_ai0 = 0;
myself.i_ai2 = 3;
myself.i_ai4 = 1;
for (i0 = 1; i0 <= 5; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, myself.i_ai4, 0);

}

}

} else {
if (myself.i_ai0 <= 0 && gg.Rand(1000) > 200) {
def0 = myself.GetSpawnDefine(2);

} else {
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}

} else if (deleted_def == myself.GetSpawnDefine(4)) {
if (died == 0) {
def0 = myself.GetSpawnDefine(5);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 + 1;
if (babble_mode == 1) {
gg.Announce("스포어 비전투 디스폰:" + gg.IntToStr(myself.i_ai3) + "/ " + gg.IntToStr(reset_count));

}
if (myself.i_ai3 >= reset_count) {
gg.SendMakerScriptEvent(myself, 78010035, 0, 0);
myself.i_ai2 = 5;

}

}

} else {
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 - 1;

}
myself.i_ai1 = myself.i_ai1 + 2;
if (myself.i_ai0 > 0) {
myself.i_ai0 = myself.i_ai0 - 1;

} else if (myself.i_ai0 < 0) {
myself.i_ai0 = myself.i_ai0 + 1;

}
if (babble_mode == 1) {
gg.Announce("fire-water counter: " + myself.i_ai0 + "/ wind-earth counter: " + myself.i_ai1);

}
if (myself.i_ai1 == 20 || myself.i_ai1 == 40 || myself.i_ai1 == 60 || myself.i_ai1 == 80 || myself.i_ai1 == 100) {
def0 = myself.GetSpawnDefine(5);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, 0, 4);

}

}
if (myself.i_ai1 >= death_count_positive) {
if (babble_mode == 1) {
gg.Announce("보스전 3단계 - 쉠블러 어스 스폰");

}
myself.i_ai0 = 0;
myself.i_ai2 = 3;
myself.i_ai4 = 4;
for (i0 = 1; i0 <= 5; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, myself.i_ai4, 0);

}

}

} else {
if (myself.i_ai1 >= 0 && gg.Rand(1000) > 200) {
def0 = myself.GetSpawnDefine(5);

} else {
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}

} else if (deleted_def == myself.GetSpawnDefine(5)) {
if (died == 0) {
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 + 1;
if (babble_mode == 1) {
gg.Announce("스포어 비전투 디스폰:" + gg.IntToStr(myself.i_ai3) + "/ " + gg.IntToStr(reset_count));

}
if (myself.i_ai3 >= reset_count) {
gg.SendMakerScriptEvent(myself, 78010035, 0, 0);
myself.i_ai2 = 5;

}

}

} else {
if (myself.i_ai2 == 2) {
myself.i_ai3 = myself.i_ai3 - 1;

}
myself.i_ai1 = myself.i_ai1 - 2;
if (myself.i_ai0 > 0) {
myself.i_ai0 = myself.i_ai0 - 1;

} else if (myself.i_ai0 < 0) {
myself.i_ai0 = myself.i_ai0 + 1;

}
if (babble_mode == 1) {
gg.Announce("fire-water counter: " + myself.i_ai0 + "/ wind-earth counter: " + myself.i_ai1);

}
if (myself.i_ai1 == -20 || myself.i_ai1 == -40 || myself.i_ai1 == -60 || myself.i_ai1 == -80 || myself.i_ai1 == -100) {
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, 0, 5);

}

}
if (myself.i_ai1 <= death_count_negative) {
if (babble_mode == 1) {
gg.Announce("보스전 3단계 시작 - 쉠블러 윈드 스폰");

}
myself.i_ai0 = 0;
myself.i_ai2 = 3;
myself.i_ai4 = 3;
for (i0 = 1; i0 <= 5; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010012, myself.i_ai4, 0);

}

}

} else {
if (myself.i_ai1 <= 0 && gg.Rand(1000) > 200) {
def0 = myself.GetSpawnDefine(4);

} else {
def0 = myself.GetSpawnDefine(gg.Rand(4) + 2);

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

}

}

} else if (myself.i_ai2 >= 4 && myself.i_ai4 != 0 && deleted_def == myself.GetSpawnDefine(6) || deleted_def == myself.GetSpawnDefine(7) || deleted_def == myself.GetSpawnDefine(8) || deleted_def == myself.GetSpawnDefine(9)) {
if (died == 1) {
if (babble_mode == 1) {
gg.Announce("쉠블러 사망 - 사망 시간 기록 엘피 스폰");

}
def0 = myself.GetSpawnDefine(10);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

} else if (myself.i_ai2 >= 4 && myself.i_ai4 != 0 && deleted_def == myself.GetSpawnDefine(10)) {
if (died == 1) {
if (babble_mode == 1) {
gg.Announce("사망 기록 엘피 사망");

}
deleted_def.SetDBLoaded(0);

}
myself.AddTimerEx(78002, 1 * 60 * 1000);

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0) {
if (script_event_arg1 == 78010031) {
myself.i_ai0 = myself.i_ai0 + 1;
if (babble_mode == 1) {
gg.Announce("스포어 도착: " + myself.i_ai0);

}
if (myself.i_ai0 >= 10) {
if (babble_mode == 1) {
gg.Announce("스포어 10마리 이상 도착");

}
for (i0 = 1; i0 <= 5; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
def0 = myself.GetSpawnDefine(myself.i_ai4 + 5);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);
myself.AddTimerEx(78001, 3 * 1000);

}

}
myself.i_ai0 = 0;

}

} else if (script_event_arg1 == 78010035) {
if (babble_mode == 1) {
gg.Announce("비전투 장기화 - 1 분 후 리셋");

}
myself.AddTimerEx(78003, 60 * 1000);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam i0) {
if (timer_id == 78001) {
if (babble_mode == 1) {
gg.Announce("보스전 4단계 - 쉠블러에 텔 사인 보냄");

}
myself.i_ai2 = 4;
def0 = myself.GetSpawnDefine(myself.i_ai4 + 5);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(78010031, myself.i_ai4, 0);

}

} else if (timer_id == 78002) {
if (babble_mode == 1) {
gg.Announce("나이아전 리셋 - 에리어 끔");

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
gg.Area_SetOnOff(area_naia_floor, 0);
gg.Area_SetOnOff(area_naia_pillar_1, 0);
gg.Area_SetOnOff(area_naia_pillar_2, 1);
def0 = myself.GetSpawnDefine(10);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}

} else if (timer_id == 78003) {
if (babble_mode == 1) {
gg.Announce("보스전 5단계 - 디스폰");

}
myself.i_ai3 = 0;
myself.i_ai2 = 5;
for (i0 = 1; i0 <= 9; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
myself.AddTimerEx(78002, 1 * 60 * 1000);

}
	}


}