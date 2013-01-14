package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_monastery_level_burner extends default_npc {
	protected int BURNER_NUMBER = 1000;
	protected int CHECK_TIME = 1001;
	protected int CHECK_TIME_ANNOUNCE = 1002;
	protected int DSPAWN_TIME = 1003;
	protected int CHECK_TIME_ANNOUNCE2 = 1004;
	protected int SPAWN_TIME = 1005;
	protected String my_maker0 = "";
	protected String my_maker1 = "";
	protected String B_maker = "";
	protected String BURNER_NAME = "";

	protected void CREATED(HandlerParam maker0, HandlerParam maker1) {
myself.i_ai2 = 0;
maker0 = gg.GetNpcMaker(my_maker0);
switch (BURNER_NUMBER) {
case 1: {
myself.ChangeNickName(myself.sm, gg.MakeFString(60008, "", "", "", "", ""));
break;

}
case 2: {
myself.ChangeNickName(myself.sm, gg.MakeFString(60009, "", "", "", "", ""));
break;

}
case 3: {
myself.ChangeNickName(myself.sm, gg.MakeFString(60010, "", "", "", "", ""));
break;

}
case 4: {
myself.ChangeNickName(myself.sm, gg.MakeFString(60011, "", "", "", "", ""));
break;

}

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 21140013, BURNER_NUMBER, 0);

}
maker1 = gg.GetNpcMaker(my_maker1);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 21140013, BURNER_NUMBER, 0);

}
myself.UnblockTimer(CHECK_TIME_ANNOUNCE);
myself.AddTimerEx(CHECK_TIME_ANNOUNCE, 3 * 60 * 1000);
if (BURNER_NUMBER == 1) {
myself.i_ai0 = 1;
myself.ChangeNPCState(myself.sm, 1);

} else {
myself.i_ai0 = 0;
myself.ChangeNPCState(myself.sm, 2);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (skill_name_id <= 0) {
myself.i_ai0 = 1;
myself.ChangeNPCState(myself.sm, 1);
myself.BroadcastScriptEvent(21140011, BURNER_NUMBER, 600);
if (myself.i_ai2 == 0) {
myself.BlockTimer(CHECK_TIME_ANNOUNCE);
myself.i_ai2 = 1;
myself.AddTimerEx(CHECK_TIME_ANNOUNCE2, 1 * 100);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 21140011 && BURNER_NUMBER != script_event_arg2) {
myself.i_ai0 = 0;
myself.ChangeNPCState(myself.sm, 2);
if (myself.i_ai2 == 0) {
myself.BlockTimer(CHECK_TIME_ANNOUNCE);
myself.i_ai2 = 1;
myself.AddTimerEx(CHECK_TIME_ANNOUNCE2, 1 * 100);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam maker1) {
if (timer_id == CHECK_TIME_ANNOUNCE) {
myself.Say(gg.MakeFString(60012, "", "", "", "", ""));
myself.AddTimerEx(CHECK_TIME, 15 * 1000);

}
if (timer_id == CHECK_TIME_ANNOUNCE2) {
myself.Say(gg.MakeFString(60012, "", "", "", "", ""));
myself.AddTimerEx(CHECK_TIME, 15 * 1000);

}
if (timer_id == CHECK_TIME) {
if (myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(my_maker0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 21140012, BURNER_NUMBER, 0);
gg.SendMakerScriptEvent(maker0, 1001, BURNER_NUMBER, 0);

}
maker1 = gg.GetNpcMaker(my_maker1);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 21140012, BURNER_NUMBER, 0);
gg.SendMakerScriptEvent(maker1, 1001, BURNER_NUMBER, 0);

}
myself.AddTimerEx(DSPAWN_TIME, 1 * 1000);

} else if (myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(my_maker0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 21140013, BURNER_NUMBER, 0);
gg.SendMakerScriptEvent(maker0, 1000, BURNER_NUMBER, 0);

}
maker1 = gg.GetNpcMaker(my_maker1);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 21140013, BURNER_NUMBER, 0);
gg.SendMakerScriptEvent(maker1, 1000, BURNER_NUMBER, 0);

}
myself.AddTimerEx(DSPAWN_TIME, 1 * 1000);

}

}
if (timer_id == DSPAWN_TIME) {
myself.Suicide();
myself.AddTimerEx(SPAWN_TIME, 60 * 60 * 1000);

}
if (timer_id == SPAWN_TIME) {
maker0 = gg.GetNpcMaker(B_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, BURNER_NUMBER, 0);

}

}
	}


}