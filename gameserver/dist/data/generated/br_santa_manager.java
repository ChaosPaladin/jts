package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_santa_manager extends default_npc {
	protected int turkey_x = 0;
	protected int turkey_y = 0;
	protected int turkey_z = 0;
	protected int event_stop = 0;
	protected int event_fighting = 1;
	protected int event_gift = 2;
	protected int escape_santa_x = 116198;
	protected int escape_santa_y = -173558;
	protected int escape_santa_z = -752;
	protected int test_mode = 2;

	protected void CREATED() {
gg.LoadJackpotTime(20081225);
myself.c_quest0 = gg.GetNullCreature();
myself.RegisterGlobalMap(100, event_stop);
myself.RegisterGlobalMap(101, 0);
myself.i_ai3 = 4 * 60;
switch (test_mode) {
case 0: {
myself.i_ai3 = 5;
break;

}
case 1: {
myself.i_ai3 = 20;
break;

}

}
myself.AddTimerEx(1225, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 1224) {
myself.FindRandomUser(0, 0, 0, 0);
myself.AddTimerEx(1224, 25000);

} else if (timer_id == 1225) {
myself.AddTimerEx(1225, 60000);
if (myself.i_ai3 < 5) {
return;

}
i1 = gg.GetDateTime(0, 3) * 60 + gg.GetDateTime(0, 4);
if (i1 == 0) {
i1 = 24 * 60;

}
if (i1 % myself.i_ai3 != 0) {
return;

}
myself.RegisterGlobalMap(100, event_stop);
myself.AddTimerEx(1226, 60000);

} else if (timer_id == 1226) {
myself.RegisterGlobalMap(100, event_fighting);
myself.i_ai1 = 0;
myself.SetDBValue(myself.sm, myself.i_ai1);
i0 = 3;
i1 = 4;
switch (test_mode) {
case 0: {
i0 = 1;
i1 = 2;
break;

}
case 1: {
i0 = 2;
i1 = 3;
break;

}

}
if (myself.i_ai3 >= 30) {
i2 = 30;

} else {
i2 = myself.i_ai3 - 1;

}
myself.CreateOnePrivateEx(1000001, "ai_br_xmas_turkey", 0, 0, turkey_x, turkey_y, turkey_z, 0, i0, i1, i2);

} else if (timer_id == 1227) {
if (myself.GetGlobalMap(100) == event_gift) {
if (test_mode == 0) {
myself.FindRandomUser(0, 0, 0, 0);

} else {
myself.FindRandomUser(1, 1, 1, 1);

}
myself.AddTimerEx(1227, 20000);

}

}
if (timer_id == 2227) {
myself.CreateOnePrivateEx(1000006, "ai_br_xmas_sled", 0, 0, turkey_x - 100, turkey_y - 200, turkey_z + 100, 47000, 1, 0, 0);

}
super;
	}

	protected void GET_PLAYING_USER_COUNT(HandlerParam i0) {
myself.i_ai2 = i0 * 80 / 100;
if (i0 == 1) {
myself.i_ai2 = 1;

}
	}

	protected void FIND_RANDOM_USER(HandlerParam talker, HandlerParam i0) {
myself.c_quest0 = talker;
myself.RegisterGlobalMap(101, talker.id);
if (myself.IsNullCreature(talker) == 0) {
myself.CreateOnePrivateNearUser(talker, 1000005, "br_santa", myself.sm.weight_point, 1, 90, 60);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 1) {
myself.RegisterGlobalMap(100, event_gift);
myself.AddTimerEx(2227, 5000);
myself.CreateOnePrivateEx(1000006, "ai_br_xmas_sled", 0, 0, 81549, 154725, -3432, gg.Rand(65535), 0, 81505, 141709);
myself.GetPlayingUserCount();
myself.AddTimerEx(1227, 20000);

} else if (script_event_arg1 == 2) {
if (gg.IsJackpotTime(20081225) == 1) {
myself.GiveItem1(myself.c_quest0, 20102, 1);

} else {
myself.GiveItem1(myself.c_quest0, 20101, 1);

}
myself.i_ai1 = myself.i_ai1 + 1;
myself.SetDBValue(myself.sm, myself.i_ai1);
if (myself.i_ai1 >= myself.i_ai2) {
myself.RegisterGlobalMap(100, event_stop);

}

}
	}


}