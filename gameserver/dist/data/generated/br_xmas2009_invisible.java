package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_xmas2009_invisible extends default_npc {
	protected int event_stop = 0;
	protected int event_gift = 1;
	protected int escape_santa_x = 116198;
	protected int escape_santa_y = -173558;
	protected int escape_santa_z = -752;
	protected int default_gift_time = 60;
	protected int test_mode = 2;

	protected void CREATED() {
gg.LoadJackpotTime(20091225);
myself.c_quest0 = gg.GetNullCreature();
myself.RegisterGlobalMap(101, 0);
myself.i_ai1 = myself.sm.db_value;
myself.i_ai2 = 1;
myself.i_ai3 = event_gift;
myself.i_ai4 = 0;
if (test_mode < 2) {
gg.SetEventValue(4, 1);

} else {
gg.SetEventValue(4, default_gift_time);

}
myself.AddTimerEx(1223, 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 1223) {
if (test_mode < 2) {
myself.Say("1223, GetEventValue(4) =>");
myself.SayInt(gg.GetEventValue(4));

}
if (myself.i_ai3 == event_gift) {
myself.i_ai1 = 0;
myself.GetPlayingUserCount();
myself.i_ai3 = event_stop;
myself.i_ai4 = 0;
if (gg.GetEventValue(4) > 0) {
myself.AddTimerEx(1224, 1000 * 60 * gg.GetEventValue(4));

} else {
myself.AddTimerEx(1224, 1000 * 60 * default_gift_time);

}
myself.SetDBValue(myself.sm, myself.i_ai1);

}

} else if (timer_id == 1224) {
if (test_mode < 2) {
myself.Say("1224 Tick => ");
myself.SayInt(myself.GetCurrentTick());

}
myself.BroadcastSystemMessage(myself.sm, 0, 6030);
myself.i_ai3 = event_gift;
myself.AddTimerEx(1225, 100);

} else if (timer_id == 1225) {
if (myself.i_ai3 == event_gift) {
if (test_mode < 2) {
myself.Say("1225 Tick => ");
myself.SayInt(myself.GetCurrentTick());

}
if (test_mode == 0) {
myself.FindRandomUser(0, 0, 0, 0);

} else {
myself.FindRandomUser(1, 1, 1, 1);

}
myself.i_ai4 = myself.i_ai4 + 20;
if (gg.GetEventValue(4) > 0) {
i2 = gg.GetEventValue(4);

} else {
i2 = default_gift_time;

}
if (myself.i_ai4 < i2 * 60 * 4) {
myself.AddTimerEx(1225, 20000);

} else {
if (test_mode < 2) {
myself.Say("Time Over");

}
myself.AddTimerEx(1223, 100);
myself.BroadcastSystemMessage(myself.sm, 0, 6031);

}

}

}
super;
	}

	protected void GET_PLAYING_USER_COUNT(HandlerParam i0) {
myself.i_ai2 = i0 * 80 / 100;
if (myself.i_ai2 < 1) {
myself.i_ai2 = 1;

}
	}

	protected void FIND_RANDOM_USER(HandlerParam talker, HandlerParam i0) {
if (test_mode < 2) {
myself.Say("FIND_RANDOM_USER");

}
myself.c_quest0 = talker;
myself.RegisterGlobalMap(101, talker.id);
if (myself.IsNullCreature(talker) == 0) {
myself.CreateOnePrivateNearUser(talker, 1000030, "br_santa_white_gift", myself.sm.weight_point, 1, 90, 60);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 2) {
if (gg.IsJackpotTime(20091225) == 1) {
myself.GiveItem1(myself.c_quest0, 20754, 1);
myself.AddLogByNpc2(127, myself.master, "xmas_2009_gift", "jackpot", 20754, 1, 0, 0, 0, 0);

} else {
myself.GiveItem1(myself.c_quest0, 20753, 1);
myself.AddLogByNpc2(127, myself.master, "xmas_2009_gift", "basic", 20753, 1, 0, 0, 0, 0);

}
myself.i_ai1 = myself.i_ai1 + 1;
if (test_mode < 2) {
myself.Say("Gift Count -> ");
myself.SayInt(myself.i_ai1);
myself.SayInt(myself.i_ai2);

}
if (myself.i_ai1 >= myself.i_ai2) {
myself.AddTimerEx(1223, 100);
myself.BroadcastSystemMessage(myself.sm, 0, 6031);

}
myself.SetDBValue(myself.sm, myself.i_ai1);

}
	}


}