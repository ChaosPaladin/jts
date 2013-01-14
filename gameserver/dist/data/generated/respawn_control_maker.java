package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class respawn_control_maker extends default_maker {
	protected int RESPAWN_STEP_MAX = 5;
	protected int VALID_DEATH_COUNT = 100;
	protected int VALID_LIFE_TIME = 600;
	protected int INITIALIZING_TIME = 3600;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
super;
	}

	protected void ON_DEBUG_MAKER_EVENT(HandlerParam reply, HandlerParam creature) {
if (reply == 0) {
myself.i_quest9 = reply;
gg.Announce("Debug Mode Off");

} else if (reply == 1) {
myself.i_quest9 = reply;
gg.Announce("Debug Mode On");

} else if (reply == 2) {
gg.Announce("단계를 상승시킵니다.");
if (myself.i_ai0 < RESPAWN_STEP_MAX) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_quest9) {
gg.Announce("단계 상승 : " + myself.i_ai0 + " 단계!!");

}
myself.i_ai1 = 0;

} else {
gg.Announce("상승시킬 수 있는 최대 단계이므로 상승이 불가능합니다.");

}

} else if (reply == 3) {
gg.Announce("단계를 하락시킵니다.");
if (myself.i_ai0 > 0) {
myself.i_ai0 = myself.i_ai0 - 1;
if (myself.i_quest9) {
gg.Announce("단계 하락 : " + myself.i_ai0 + " 단계!!");

}
myself.i_ai1 = 0;

} else {
gg.Announce("0 단계이므로 더 이상 하락시킬 수 없습니다.");

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1) {
if (deleted_def.respawn_time != 0) {
if (myself.maximum_npc >= myself.npc_count + 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
i0 = 10 - myself.i_ai0 * deleted_def.respawn_time;
i1 = gg.FloatToInt(i0 / 10);
if (myself.i_quest9) {
gg.Announce("계산된 리스폰 타임은 " + i1 + " + 랜덤 " + deleted_def.respawn_rand + " 초 입니다.");

}
if (i1 == 0) {
if (myself.i_quest9) {
gg.Announce("리스폰 타임이 0으로 책정되어 원래의 리스폰 타임으로 스폰됩니다.");

}
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

} else {
if (myself.i_quest9) {
gg.Announce(myself.i_ai0 + "단계 이므로 " + i1 + " 초 후에 스폰됩니다.");

}
deleted_def.Spawn2(1, i1, deleted_def.respawn_rand);

}

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 20090501) {
if (myself.i_quest9) {
gg.Announce("생존 시간 받음" + script_event_arg2 + " 초");

}
if (myself.i_ai2 != 0) {
i0 = script_event_arg3 - myself.i_ai2;
if (i0 > INITIALIZING_TIME) {
myself.i_ai0 = 0;
if (myself.i_quest9) {
gg.Announce("0 단계로 귀환!!");

}

}
myself.i_ai2 = script_event_arg3;

} else {
myself.i_ai2 = script_event_arg3;

}
if (script_event_arg2 < VALID_LIFE_TIME) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_quest9) {
gg.Announce("유효 사망  " + myself.i_ai1 + " 카운트!!");

}
if (myself.i_ai1 >= VALID_DEATH_COUNT) {
if (myself.i_ai0 < RESPAWN_STEP_MAX) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_quest9) {
gg.Announce("단계 상승 : " + myself.i_ai0 + " 단계!!");

}
myself.i_ai1 = 0;

}

}

}

}
super;
	}


}