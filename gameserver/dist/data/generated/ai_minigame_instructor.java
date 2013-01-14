package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_minigame_instructor extends citizen {
	protected int TIMER_0 = 3344;
	protected int TIMER_1 = 3345;
	protected int TIMER_2 = 3346;
	protected int TIMER_3 = 3347;
	protected int TIMER_4 = 3348;
	protected int TIMER_5 = 3349;
	protected int TIMER_6 = 3350;
	protected int TIMER_7 = 3351;
	protected int TIMER_8 = 3352;
	protected int TIMER_9 = 3356;
	protected int PC_TURN = 3357;
	protected int GAME_TIME_EXPIRED = 3354;
	protected int PosX = 113187;
	protected int PosY = -85388;
	protected int PosZ = -3424;
	protected String fnHi = "minigame_instructor001.htm";
	protected int HURRY_UP = 3358;
	protected int HURRY_UP2 = 3359;
	protected int GAME_TIME = 3360;
	protected int interval_time = 3;
	protected int PosX1 = 118833;
	protected int PosY1 = -80589;
	protected int PosZ1 = -2688;
	protected int PosX2 = 118833;
	protected int PosY2 = -80589;
	protected int PosZ2 = -2688;
	protected int Inven_Check_SysMsg = 1118;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest0 = 0;
myself.i_quest9 = 0;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.i_quest9 = 1;

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsNullCreature(myself.c_ai0) == 1 && myself.i_quest2 == 0) {
myself.ShowPage(talker, "minigame_instructor001.htm");
myself.c_ai1 = talker;

} else if (myself.IsNullCreature(myself.c_ai0) == 1 && myself.i_quest2 == 1) {
myself.ShowPage(talker, "minigame_instructor008.htm");

} else if (myself.c_ai0 == talker && myself.i_quest0 == 1 && myself.i_quest1 == 0) {
myself.ShowPage(talker, "minigame_instructor002.htm");

} else if (myself.c_ai0 == talker && myself.i_quest0 == 2 && myself.i_quest1 == 0) {
myself.ShowPage(talker, "minigame_instructor003.htm");

} else if (myself.c_ai0 != talker) {
myself.ShowPage(talker, "minigame_instructor004.htm");

} else if (myself.c_ai0 == talker && myself.i_quest1 == 1) {
myself.ShowPage(talker, "minigame_instructor007.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -1) {
if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (gg.OwnItemCount(talker, 15540) == 0) {
myself.ShowPage(talker, "minigame_instructor005.htm");

} else if (myself.c_ai1 != talker) {
myself.ShowPage(talker, "minigame_instructor004.htm");

} else if (myself.c_ai1 == talker) {
myself.i_quest1 = 1;
myself.i_quest2 = 1;
myself.UnblockTimer(HURRY_UP);
myself.UnblockTimer(HURRY_UP2);
myself.DeleteItem1(talker, 15540, 1);
myself.GiveItem1(talker, 15485, 1);
myself.Say(gg.MakeFString(60000, "", "", "", "", ""));
myself.i_ai1 = gg.Rand(9) + 1;
myself.i_ai2 = gg.Rand(9) + 1;
myself.i_ai3 = gg.Rand(9) + 1;
myself.i_ai4 = gg.Rand(9) + 1;
myself.i_ai5 = gg.Rand(9) + 1;
myself.i_ai6 = gg.Rand(9) + 1;
myself.i_ai7 = gg.Rand(9) + 1;
myself.i_ai8 = gg.Rand(9) + 1;
myself.i_ai9 = gg.Rand(9) + 1;
myself.c_ai0 = talker;
if (myself.i_quest9 == 1) {
myself.Whisper(talker, "Debug mode on : Game Start");
myself.Whisper(talker, "1st = " + myself.i_ai1 + " ");
myself.Whisper(talker, "2nd = " + myself.i_ai2 + " ");
myself.Whisper(talker, "3rd = " + myself.i_ai3 + " ");
myself.Whisper(talker, "4th = " + myself.i_ai4 + " ");
myself.Whisper(talker, "5th = " + myself.i_ai5 + " ");
myself.Whisper(talker, "6th = " + myself.i_ai6 + " ");
myself.Whisper(talker, "7th = " + myself.i_ai7 + " ");
myself.Whisper(talker, "8th = " + myself.i_ai8 + " ");
myself.Whisper(talker, "9th = " + myself.i_ai9 + " ");

}
myself.AddTimerEx(HURRY_UP, 2 * 60 * 1000);
myself.AddTimerEx(GAME_TIME, 3 * 60 * 1000 + 10 * 1000);
myself.AddTimerEx(TIMER_0, 1 * 1000);

}

}

} else if (ask <= -2 && ask >= -4) {
if (reply == 2) {
myself.i_quest1 = 1;
myself.i_ai1 = gg.Rand(9) + 1;
myself.i_ai2 = gg.Rand(9) + 1;
myself.i_ai3 = gg.Rand(9) + 1;
myself.i_ai4 = gg.Rand(9) + 1;
myself.i_ai5 = gg.Rand(9) + 1;
myself.i_ai6 = gg.Rand(9) + 1;
myself.i_ai7 = gg.Rand(9) + 1;
myself.i_ai8 = gg.Rand(9) + 1;
myself.i_ai9 = gg.Rand(9) + 1;
myself.c_ai0 = talker;
if (myself.i_quest9 == 1) {
myself.Whisper(talker, "Debug mode on : Game Start");
myself.Whisper(talker, "1st = " + myself.i_ai1 + " ");
myself.Whisper(talker, "2nd = " + myself.i_ai2 + " ");
myself.Whisper(talker, "3rd = " + myself.i_ai3 + " ");
myself.Whisper(talker, "4th = " + myself.i_ai4 + " ");
myself.Whisper(talker, "5th = " + myself.i_ai5 + " ");
myself.Whisper(talker, "6th = " + myself.i_ai6 + " ");
myself.Whisper(talker, "7th = " + myself.i_ai7 + " ");
myself.Whisper(talker, "8th = " + myself.i_ai8 + " ");
myself.Whisper(talker, "9th = " + myself.i_ai9 + " ");

}
myself.AddTimerEx(TIMER_0, 1 * 1000);

}

}
if (ask == -7801) {
if (reply == 2) {
myself.InstantTeleport(talker, PosX1, PosY1, PosZ1);

}

}
if (ask == -7801) {
if (reply == 1) {
myself.InstantTeleport(talker, PosX2, PosY2, PosZ2);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_0) {
myself.BroadcastScriptEvent(2114002, 0, 1200);
myself.AddTimerEx(TIMER_1, interval_time * 2000);

} else if (timer_id == TIMER_1) {
myself.BroadcastScriptEvent(2114001, myself.i_ai1, 1200);
myself.AddTimerEx(TIMER_2, interval_time * 1000);

} else if (timer_id == TIMER_2) {
myself.BroadcastScriptEvent(2114001, myself.i_ai2, 1200);
myself.AddTimerEx(TIMER_3, interval_time * 1000);

} else if (timer_id == TIMER_3) {
myself.BroadcastScriptEvent(2114001, myself.i_ai3, 1200);
myself.AddTimerEx(TIMER_4, interval_time * 1000);

} else if (timer_id == TIMER_4) {
myself.BroadcastScriptEvent(2114001, myself.i_ai4, 1200);
myself.AddTimerEx(TIMER_5, interval_time * 1000);

} else if (timer_id == TIMER_5) {
myself.BroadcastScriptEvent(2114001, myself.i_ai5, 1200);
myself.AddTimerEx(TIMER_6, interval_time * 1000);

} else if (timer_id == TIMER_6) {
myself.BroadcastScriptEvent(2114001, myself.i_ai6, 1200);
myself.AddTimerEx(TIMER_7, interval_time * 1000);

} else if (timer_id == TIMER_7) {
myself.BroadcastScriptEvent(2114001, myself.i_ai7, 1200);
myself.AddTimerEx(TIMER_8, interval_time * 1000);

} else if (timer_id == TIMER_8) {
myself.BroadcastScriptEvent(2114001, myself.i_ai8, 1200);
myself.AddTimerEx(TIMER_9, interval_time * 1000);

} else if (timer_id == TIMER_9) {
myself.BroadcastScriptEvent(2114001, myself.i_ai9, 1200);
myself.AddTimerEx(PC_TURN, interval_time * 1000);

} else if (timer_id == HURRY_UP) {
myself.Say(gg.MakeFString(60001, "", "", "", "", ""));
myself.AddTimerEx(HURRY_UP2, 60 * 1000);

} else if (timer_id == HURRY_UP2) {
myself.Say(gg.MakeFString(60002, "", "", "", "", ""));
myself.AddTimerEx(GAME_TIME_EXPIRED, 10 * 1000);

} else if (timer_id == PC_TURN) {
myself.Say(gg.MakeFString(60003, "", "", "", "", ""));
myself.BroadcastScriptEvent(21140015, 0, 1200);
myself.i_ai0 = 1;

} else if (timer_id == GAME_TIME_EXPIRED) {
myself.BroadcastScriptEvent(2114003, 0, 1200);
myself.Say(gg.MakeFString(60004, "", "", "", "", ""));
myself.c_ai0 = gg.GetNullCreature();
myself.i_quest0 = 0;
myself.i_quest1 = 0;

} else if (timer_id == GAME_TIME) {
myself.i_quest2 = 0;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2114005) {
if (script_event_arg2 == myself.i_ai1 && myself.i_ai0 == 1) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 2;

} else if (script_event_arg2 == myself.i_ai2 && myself.i_ai0 == 2) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 3;

} else if (script_event_arg2 == myself.i_ai3 && myself.i_ai0 == 3) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 4;

} else if (script_event_arg2 == myself.i_ai4 && myself.i_ai0 == 4) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 5;

} else if (script_event_arg2 == myself.i_ai5 && myself.i_ai0 == 5) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 6;

} else if (script_event_arg2 == myself.i_ai6 && myself.i_ai0 == 6) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 7;

} else if (script_event_arg2 == myself.i_ai7 && myself.i_ai0 == 7) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 8;

} else if (script_event_arg2 == myself.i_ai8 && myself.i_ai0 == 8) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.i_ai0 = 9;

} else if (script_event_arg2 == myself.i_ai9 && myself.i_ai0 == 9) {
if (myself.i_quest9 == 1) {
myself.Say("성공하였습니다");

}
myself.BroadcastScriptEvent(2114003, 0, 1200);
myself.CreateOnePrivateEx(1018934, "ai_treasurebox", 0, 0, PosX, PosY, PosZ, 0, 0, 0, 0);
myself.Say(gg.MakeFString(60005, "", "", "", "", ""));
myself.BlockTimer(HURRY_UP);
myself.BlockTimer(HURRY_UP2);
myself.c_ai0 = gg.GetNullCreature();
myself.i_quest0 = 0;
myself.i_quest1 = 0;

} else {
myself.BroadcastScriptEvent(2114004, 0, 1200);
if (myself.i_quest9 == 1) {
myself.Say("실패!");
myself.Say("script_event_arg2 : " + script_event_arg2 + "");
myself.Say("script_event_arg1 : " + script_event_arg1 + "");
myself.Say("myself.i_ai1 : " + myself.i_ai1 + "");
myself.Say("myself.i_ai2 : " + myself.i_ai2 + "");
myself.Say("myself.i_ai3 : " + myself.i_ai3 + "");
myself.Say("myself.i_ai4 : " + myself.i_ai4 + "");
myself.Say("myself.i_ai5 : " + myself.i_ai5 + "");
myself.Say("myself.i_ai6 : " + myself.i_ai6 + "");
myself.Say("myself.i_ai7 : " + myself.i_ai7 + "");
myself.Say("myself.i_ai8 : " + myself.i_ai8 + "");
myself.Say("myself.i_ai9 : " + myself.i_ai9 + "");

} else if (myself.i_quest0 < 2) {
myself.i_quest0 = myself.i_quest0 + 1;
myself.Say(gg.MakeFString(60006, "", "", "", "", ""));
myself.i_quest1 = 0;

} else {
myself.BlockTimer(HURRY_UP);
myself.BlockTimer(HURRY_UP2);
myself.Say(gg.MakeFString(60007, "", "", "", "", ""));
myself.c_ai0 = gg.GetNullCreature();
myself.i_quest0 = 0;
myself.i_quest1 = 0;

}

}

}
	}


}