package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_dispatcher_maker extends immo_basic_maker {
	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (reply == 1) {
myself.i_ai0 = 0;
if (zone == 2) {
if (tide == 0) {
if (babble_mode == 1) {
gg.Announce("***2지역 공격 인존 생성 성공***");

}

} else if (tide == 1) {
if (babble_mode == 1) {
gg.Announce("***2지역 방어 인존 생성 성공***");

}

}
gg.SendMakerScriptEvent(myself, 78010067, 0, 0);

} else if (zone == 3) {
if (tide == 0) {
if (babble_mode == 1) {
gg.Announce("***보스 지역 공격 인존 생성 성공***");

}

} else if (tide == 1) {
if (babble_mode == 1) {
gg.Announce("***보스 지역 방어 인존 생성 성공***");

}
gg.SendMakerScriptEvent(myself, 78010067, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010067 && myself.i_ai0 == 0) {
if (babble_mode == 1) {
gg.Announce("디스패쳐 스폰");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
myself.i_ai0 = 1;

} else if (script_event_arg1 == 1000 && myself.i_ai0 == 1) {
if (babble_mode == 1) {
gg.Announce("전체 디스폰 이벤트 중계");

}
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);
myself.i_ai0 = 0;

} else {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (babble_mode == 1) {
gg.Announce("디스패쳐 이벤트 중계");

}
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

}
	}


}