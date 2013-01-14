package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_wunded_gracia_soldier extends citizen {
	protected int TIME_LIMIT1 = 1114;
	protected int TIME_LIMIT2 = 1115;
	protected int TIME_LIMIT3 = 1116;
	protected int TIME_LIMIT4 = 1117;
	protected int TIME_LIMIT5 = 1118;
	protected int TIME_LIMIT6 = 1119;
	protected int TIME_LIMIT7 = 1120;
	protected int EXPIRED_TIMER = 1301;
	protected int CHECK_TIMER = 1302;
	protected int SAY_TIMER1 = 1303;
	protected int SAY_TIMER2 = 1304;
	protected int pos_x = -180219;
	protected int pos_y = 186341;
	protected int pos_z = -10600;

	protected void CREATED() {
myself.SetAttackable(myself.sm, 1);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.i_quest9 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.AddAttackDesire(creature, 1, 10);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai0 == 0) {

}
myself.ChangeStatus(2);
myself.i_ai0 = 1;
if (myself.IsAttackable(myself.sm)) {
myself.SetAttackable(myself.sm, 0);

}
myself.RemoveAllAttackDesire();
myself.AddEffectActionDesire(myself.sm, 2, 120 * 1000 / 30, 50);
myself.AddTimerEx(SAY_TIMER1, 2 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam f0, HandlerParam c0) {
if (timer_id == SAY_TIMER1) {
myself.ChangeStatus(3);
myself.Say(gg.MakeFString(1801168, "", "", "", "", ""));

} else if (timer_id == TIME_LIMIT1) {
myself.AddTimerEx(TIME_LIMIT2, 150 * 1000);
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Whisper(myself.c_quest0, gg.MakeFString(1801169, "", "", "", "", ""));

}

} else if (timer_id == TIME_LIMIT2) {
myself.AddTimerEx(TIME_LIMIT3, 150 * 1000);
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Whisper(myself.c_quest0, gg.MakeFString(1801170, "", "", "", "", ""));

}

} else if (timer_id == TIME_LIMIT3) {
myself.AddTimerEx(TIME_LIMIT4, 150 * 1000);
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Whisper(myself.c_quest0, gg.MakeFString(1801171, "", "", "", "", ""));

}

} else if (timer_id == TIME_LIMIT4) {
myself.AddTimerEx(TIME_LIMIT5, 150 * 1000);
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Whisper(myself.c_quest0, gg.MakeFString(1801172, "", "", "", "", ""));

}

} else if (timer_id == TIME_LIMIT5) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
myself.Whisper(myself.c_quest0, gg.MakeFString(1801173, "", "", "", "", ""));

}
gg.SendScriptEvent(myself.sm, 20091027, 0);
myself.AddTimerEx(EXPIRED_TIMER, 2 * 1000);

} else if (timer_id == EXPIRED_TIMER) {
myself.Despawn();

} else if (timer_id == CHECK_TIMER) {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
f0 = myself.DistFromMe(myself.c_quest0);
c0 = myself.c_quest0;
if (f0 > 1000) {
if (f0 > 5000 && f0 < 6900) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));

} else if (f0 > 31000 && f0 < 32000) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));

} else if (myself.i_ai1 == 0) {
myself.Whisper(c0, gg.MakeFString(1801174, "", "", "", "", ""));
myself.i_ai1 = 1;

} else if (myself.i_ai1 == 1) {
myself.Whisper(c0, gg.MakeFString(1801175, "", "", "", "", ""));
myself.i_ai1 = 2;

} else if (myself.i_ai1 == 2) {
myself.Whisper(c0, gg.MakeFString(1801176, "", "", "", "", ""));
if (myself.i_quest9) {
myself.Whisper(c0, "거리값 : " + f0 + "");

}
gg.SendScriptEvent(myself.sm, 20091030, 0);

}

}

}
myself.AddTimerEx(CHECK_TIMER, 2 * 1000);

} else if (timer_id == SAY_TIMER2) {
myself.Say(gg.MakeFString(1801177, "", "", "", "", ""));
myself.AddTimerEx(EXPIRED_TIMER, 2 * 1000);

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.Whisper(creature, "퀘스트 시작!!");
myself.c_quest0 = creature;
gg.SendScriptEvent(myself.sm, 20091028, 0);

} else if (reply > 0) {
myself.AddEffectActionDesire(myself.sm, reply, 120 * 1000 / 30, 10000);

}
super;
	}

	protected void NO_DESIRE() {
if (myself.i_ai0 == 0) {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 20091028) {
myself.AddFollowDesire2(myself.c_quest0, 10, 1, 100, 0);
myself.AddTimerEx(CHECK_TIMER, 1 * 1000);
myself.AddTimerEx(TIME_LIMIT1, 60 * 1000);
myself.i_ai0 = 2;

} else if (script_event_arg1 == 20091027) {
gg.SendScriptEvent(myself.sm, 20091030, 0);

} else if (script_event_arg1 == 20091031) {
if (myself.i_quest9) {
myself.Say("에르미안 신호 접수");

}
if (myself.i_ai0 == 2) {
myself.i_ai0 = 3;
myself.RemoveAllDesire();
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg2);
f0 = myself.DistFromMe(myself.c_ai1);
if (myself.i_quest9) {
myself.Say("에르미안과의 거리는 " + gg.FloatToInt(f0) + " 입니다");

}
myself.AddMoveToDesire(pos_x, pos_y, pos_z, 10000000);
gg.SendScriptEvent(myself.sm, 20091029, 0);

}

} else if (script_event_arg1 == 20091030) {
if (myself.i_quest9) {
myself.Say("퀘스트 실패!");

}

} else if (script_event_arg1 == 20091029) {
if (myself.i_quest9) {
myself.Say("퀘스트 성공!");

}

}
super;
	}

	protected void MOVE_TO_FINISHED() {
myself.ChangeDir(myself.sm, myself.c_ai1.id, 0);
myself.AddTimerEx(SAY_TIMER2, 2 * 1000);
	}


}