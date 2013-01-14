package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_observer extends default_npc {
	protected int my_buff_type = -1;
	protected int TIMER_CHECK_20SEC = 33120;
	protected int TIMER_CHECK_30MIN = 33130;
	protected int TIMER_DESPAWN = 33122;
	protected int limit_count = 10;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.i_ai5 = 0;
myself.i_ai8 = 0;
myself.i_ai9 = limit_count;
myself.i_ai6 = myself.sm.param1;
myself.i_ai7 = myself.sm.param2;
if (debug_mode) {
myself.Say("Created : " + myself.sm.param1 + " , " + myself.sm.param2 + " , buff_type : " + my_buff_type + " , reset_min : " + myself.i_ai9);

}
gg.SendScriptEvent(myself.boss, 2214010, my_buff_type);
myself.AddTimerEx(TIMER_CHECK_30MIN, 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TIMER_CHECK_30MIN) {
myself.i_ai5 = myself.i_ai5 + 1;
if (debug_mode) {
myself.Say("변경이 없는채로 " + myself.i_ai5 + "분 되었음");

}
myself.BroadcastScriptEventEx(2214002, myself.i_ai6, myself.i_ai9 - myself.i_ai5, 4000);
if (myself.i_ai5 == myself.i_ai9) {
myself.i_ai8 = 1;
myself.AddTimerEx(TIMER_DESPAWN, 3 * 1000);

}
if (myself.i_ai8 == 0) {
myself.AddTimerEx(TIMER_CHECK_30MIN, 60 * 1000);

}

} else if (timer_id == TIMER_DESPAWN) {
if (debug_mode) {
myself.Say("나 자살함!");

}
myself.SetAbilityItemDrop(0);
myself.Suicide();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 2214003) {
if (myself.i_ai6 == script_event_arg2) {
if (myself.i_ai8 == 0) {
myself.AddTimerEx(TIMER_DESPAWN, 3 * 1000);

}

}

} else if (script_event_arg1 == 2214011) {
if (myself.i_ai6 == script_event_arg3) {
myself.i_ai5 = 0;

}

}
	}

	protected void SOCIAL_ACTION_EVENT(HandlerParam talker, HandlerParam action_id) {
if (debug_mode) {
if (myself.IsNullCreature(talker) == 0) {
if (action_id == 14) {
myself.i_ai5 = myself.i_ai9 - 1;
myself.Say("유혹 소셜 - 곧 야영지 내 디버프");

} else if (action_id == 15) {
myself.i_ai5 = myself.i_ai9 - 4;
myself.Say("부끄러움 소셜 - 3분 카운팅 후 야영지 내 디버프");

}

}

}
	}

	protected void MY_DYING() {
gg.SendScriptEventEx(myself.boss, 2214004, myself.i_ai6, myself.i_ai7);
myself.BroadcastScriptEventEx(2214011, my_buff_type, myself.i_ai6, 4000);
	}


}