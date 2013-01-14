package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_boss_maker extends immo_basic_maker {
	protected String ech_atk_seq0_maker = "rumwarsha15_1424_echmusm1";
	protected String ech_atk_expel_maker = "rumwarsha15_1424_expelm1";
	protected String ech_def_seq0_maker = "rumwarsha15_1424_ech_dummy1m1";
	protected String ech_def_seq1_maker = "rumwarsha15_1424_ech_dummy2m1";
	protected String ech_def_seq2_maker = "rumwarsha15_1424_ech_dummy2m2";
	protected String ech_def_seq3_maker = "rumwarsha15_1424_defwagonm1";
	protected String ech_def_seq4_maker = "rumwarsha15_1424_veinm1";
	protected int TM_boss_wagon_default_delay = 780001;
	protected int TIME_boss_wagon_delay_default = 40;
	protected int TIME_boss_wagon_delay_min = 20;
	protected int TIME_boss_wagon_delay_max = 60;
	protected int TM_challanger_notify_delay = 780002;
	protected int TIME_challanger_notify_delay = 10;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.enabled = reply;
if (reply == 1) {
myself.i_ai4 = TIME_boss_wagon_delay_default;
myself.i_quest0 = 1;
if (zone == 3 && seq == 0 || seq == 1) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def) {
if (zone == 3 && tide == 0 && seq == 0 && myself.GetSpawnDefine(1) == created_def) {
if (gg.IsNull(created_def) == 0) {
myself.i_ai0 = 1;
if (myself.i_ai1 != 0) {
created_def.SendScriptEvent(78010067, myself.i_ai1, myself.i_ai2);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam died, HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (zone == 3 && tide == 0 && seq == 0 && deleted_def == myself.GetSpawnDefine(1) && died == 1 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("에키무스 사망");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010071, died, 0);

}

} else if (zone == 3 && tide == 0 && seq == 0 && deleted_def == myself.GetSpawnDefine(1) && died == 0 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("에키무스 디스폰");

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010067 && myself.enabled == 1) {
if (zone == 3 && tide == 0 && seq == 0 && script_event_arg2 == 0 && script_event_arg3 == 0) {
if (babble_mode == 1) {
gg.Announce("더미 디스폰");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

} else if (zone == 3 && tide == 0 && seq == 0 && script_event_arg2 == 1 && script_event_arg3 == 0) {
if (babble_mode == 1) {
gg.Announce("에키무스 스폰");

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

} else if (zone == 3 && tide == 0 && seq == 0) {
if (babble_mode == 1) {
gg.Announce("에키무스에게 도전자 전달");

}
if (myself.i_ai0 == 1) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

} else {
myself.i_ai1 = script_event_arg2;
myself.i_ai2 = script_event_arg3;

}

} else if (tide == 1 && zone == 3 && seq == 3) {
if (babble_mode == 1) {
gg.Announce("포식자 스폰 시작");

}
myself.AddTimerEx(TM_boss_wagon_default_delay, 1000);

}

}
if (zone == 3 && tide == 0 && seq == 0 && script_event_arg1 == 78010068 || script_event_arg1 == 78010070 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("에키무스 상태 변화");

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

}
if (zone == 3 && tide == 1 && seq == 3 && script_event_arg1 == 78010068 || script_event_arg1 == 78010070 && myself.enabled == 1) {
if (script_event_arg1 == 78010070) {
if (myself.i_quest0 > 2) {
myself.i_quest0 = myself.i_quest0 - 1;

}
if (myself.i_ai4 - 5 > TIME_boss_wagon_delay_min) {
myself.i_ai4 = myself.i_ai4 - 5;

} else {
myself.i_ai4 = TIME_boss_wagon_delay_min;

}
if (babble_mode == 1) {
gg.Announce("포식자 생성 간격 감소: " + gg.IntToStr(myself.i_ai4) + "초당 " + gg.IntToStr(myself.i_quest0) + " 마리");

}

} else {
if (myself.i_quest0 < 4) {
myself.i_quest0 = myself.i_quest0 + 1;

}
if (myself.i_ai4 + 5 < TIME_boss_wagon_delay_max) {
myself.i_ai4 = myself.i_ai4 + 5;

} else {
myself.i_ai4 = TIME_boss_wagon_delay_max;

}
if (babble_mode == 1) {
gg.Announce("포식자 생성 간격 증가: " + gg.IntToStr(myself.i_ai4) + "초당 " + gg.IntToStr(myself.i_quest0) + " 마리");

}

}

} else if (zone == 3 && tide == 1 && seq == 3 && script_event_arg1 == 78010073 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("포식자 목표 도달 이벤트 받음");

}
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), ech_def_seq4_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010073, 0, 0);

}

} else if (zone == 3 && tide == 1 && seq == 4 && script_event_arg1 == 78010073 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("베인 스폰");

}
i0 = gg.Rand(3);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc > myself.npc_count) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010073, 0, 0);

}

} else if (zone == 3 && tide == 1 && seq == 2 && script_event_arg1 == 78010070 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("마견 스폰");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

} else if (zone == 3 && tide == 1 && seq == 0 && script_event_arg1 == 78010070 && myself.enabled == 1) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

} else if (script_event_arg1 == 1000) {
myself.enabled = 0;
if (babble_mode == 1) {
gg.Announce("NPC제거");

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == TM_boss_wagon_default_delay && zone == 3 && tide == 1 && seq == 3 && myself.enabled == 1) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc >= myself.def_count + myself.i_quest0 && myself.AtomicIncreaseTotal(def0, myself.i_quest0, 1)) {
if (babble_mode == 1) {
gg.Announce("포식자 스폰");

}
def0.Spawn2(myself.i_quest0, 0, 0);

}

}
myself.AddTimerEx(TM_boss_wagon_default_delay, myself.i_ai4 * 1000);

}
	}


}