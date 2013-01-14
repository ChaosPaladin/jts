package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_evil_of_shilen1 extends warrior_basic {
	protected int SceneID = 0;

	protected void CREATED() {
myself.AddTimerEx(9989, 2 * 1000);
myself.AddTimerEx(9969, 2 * 1000);
myself.AddTimerEx(9979, 5 * 60 * 1000);
if (myself.sm.param2 == 1) {
myself.CreateOnePrivateEx(1027399, "ai_evil_of_shilen2", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, myself.sm.param3);
myself.CreateOnePrivateEx(1027402, "ai_evil_of_shilen2", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, myself.sm.param3);

}
myself.Say(gg.MakeFString(19806, "", "", "", "", ""));
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
if (reply == 0) {
if (myself.i_quest9) {
myself.Say("Debug Mode : Off");

}
myself.i_quest9 = reply;

} else if (reply == 1) {
myself.Say("Debug Mode : On");
myself.i_quest9 = reply;

} else if (reply == 2) {
myself.Say("5초 후 디스폰되고, 실패처리 됩니다.");
myself.AddTimerEx(9979, 5 * 1000);

}
	}

	protected void MY_DYING(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (SceneID == 14) {
myself.StartScenePlayerAround(myself.sm, SceneID, 8000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

}
gg.SendScriptEvent(myself.boss, 20090502, 0);
myself.Say(gg.MakeFString(19306, c0.name, "", "", "", ""));
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9989) {
myself.AddTimerEx(9989, 2 * 1000);

} else if (timer_id == 9979) {
gg.SendScriptEvent(myself.boss, 20090503, gg.GetIndexFromCreature(myself.sm));
myself.Say(gg.MakeFString(19305, "", "", "", "", ""));
myself.AddTimerEx(9959, 10 * 1000);

} else if (timer_id == 9969) {
myself.AddAttackDesire(gg.GetCreatureFromIndex(myself.sm.param3), 1, 2000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 20090505) {
if (myself.i_quest9) {
myself.Say("디스폰 신호 받았음. 디스폰 함");

}
myself.Despawn();

}
	}


}