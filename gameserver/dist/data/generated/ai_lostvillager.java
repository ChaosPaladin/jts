package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_lostvillager extends citizen {
	protected int TIME_LIMIT1 = 1111;
	protected int CHECK_TIMER = 1113;
	protected int TALK_TIME = 1114;
	protected int TALK_TIME2 = 1115;
	protected int TALK_TIME3 = 1116;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 45703) {
myself.AddFollowDesire2(myself.c_quest0, 10, 1, 100, 180);
myself.AddTimerEx(CHECK_TIMER, 1 * 1000);
myself.AddTimerEx(TIME_LIMIT1, 10 * 60 * 1000);
myself.AddTimerEx(TALK_TIME, 2 * 60 * 1000);
myself.AddTimerEx(TALK_TIME2, 30 * 1000);

} else if (script_event_arg1 == 45704) {
gg.SendScriptEvent(myself.sm, 45702, 0);

} else if (script_event_arg1 == 45702) {

} else if (script_event_arg1 == 45701) {

} else if (script_event_arg1 == 45705 && myself.i_ai0 == 0) {
myself.RemoveAllDesire();
myself.i_ai0 = 1;
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg2);
f0 = myself.DistFromMe(myself.c_ai1);
myself.Say(gg.MakeFString(60022, "", "", "", "", ""));
gg.SendScriptEvent(myself.sm, 45701, 0);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam f0, HandlerParam c0) {
if (timer_id == TIME_LIMIT1) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
gg.SendScriptEvent(myself.sm, 45704, 0);

}

} else if (timer_id == CHECK_TIMER) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
f0 = myself.DistFromMe(myself.c_quest0);
c0 = myself.c_quest0;
if (f0 > 1000) {
if (f0 > 5000) {
gg.SendScriptEvent(myself.sm, 45702, 0);

} else if (myself.i_ai1 == 0) {
myself.Whisper(c0, gg.MakeFString(60018, "", "", "", "", ""));
myself.i_ai1 = 1;

} else if (myself.i_ai1 == 1) {
myself.Whisper(c0, gg.MakeFString(60019, "", "", "", "", ""));
myself.i_ai1 = 2;

} else if (myself.i_ai1 == 2) {
myself.Whisper(c0, gg.MakeFString(60020, "", "", "", "", ""));
gg.SendScriptEvent(myself.sm, 45702, 0);

}

}

}
myself.AddTimerEx(CHECK_TIMER, 2 * 1000);

} else if (timer_id == TALK_TIME) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Say(gg.MakeFString(60021, "", "", "", "", ""));

}

} else if (timer_id == TALK_TIME2) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Say(gg.MakeFString(60023, "", "", "", "", ""));

}
myself.AddTimerEx(TALK_TIME3, 10 * 1000);

} else if (timer_id == TALK_TIME3) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Say(gg.MakeFString(60024, "", "", "", "", ""));

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.c_quest0 = creature;
gg.SendScriptEvent(myself.sm, 45703, 0);

}
if (reply == 1) {
myself.c_quest0 = creature;
gg.SendScriptEvent(myself.sm, 45701, 0);

}
super;
	}

	protected void NO_DESIRE() {
if (myself.i_ai0 == 0) {
myself.AddMoveAroundDesire(5, 5);

}
	}


}