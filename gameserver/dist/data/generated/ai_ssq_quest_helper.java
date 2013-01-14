package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_quest_helper extends citizen {
	protected int max_desire = 10000000;
	protected int npc_heal = 266403848;
	protected int npc_heal_timer_interval = 30;
	protected int npc_heal_distance = 600;
	protected int monster_x = 0;
	protected int monster_y = 0;
	protected int monster_z = 0;
	protected int type = 0;

	protected void CREATED() {
myself.i_quest9 = 0;
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0, HandlerParam talker) {
if (ask == 193 && reply == 10) {
if (myself.av_quest0.GetValue() == 1) {
myself.ShowPage(talker, "priest_kein_q0193_09b.htm");
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}

} else {
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
myself.ShowPage(talker, "priest_kein_q0193_09a.htm");
myself.c_ai0 = talker;
if (gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 4) {
myself.Say(gg.MakeFString(1800845, myself.c_ai0.name, "", "", "", ""));
i0 = 30000 - gg.Rand(20000);
myself.AddTimerEx(9999, i0);
myself.AddTimerEx(9998, 2 * 1000);
myself.CreateOnePrivateEx(1027343, "evil_of_shilen3", 0, 0, 82425, 47232, -3216, 0, 0, 0, gg.GetIndexFromCreature(myself.c_ai0));
myself.av_quest0.Exchange(1);

}

}

} else if (ask == 197 && reply == 3) {
if (myself.av_quest0.GetValue() == 1) {
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
myself.ShowPage(talker, "great_master_lawrence_q0197_04a.htm");

} else {
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
myself.ShowPage(talker, "great_master_lawrence_q0197_04.htm");
myself.c_ai0 = talker;
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 3) {
myself.CreateOnePrivateEx(1027396, "evil_of_shilen9", 0, 0, 152520, -57502, -3408, 0, 0, 0, gg.GetIndexFromCreature(myself.c_ai0));
myself.av_quest0.Exchange(1);

}

}

} else if (ask == 198 && reply == 4) {
if (myself.av_quest0.GetValue() == 1) {
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
myself.ShowPage(talker, "inzone_frantz_q0198_05a.htm");

} else {
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
myself.ShowPage(talker, "inzone_frantz_q0198_05.htm");
myself.c_ai0 = talker;
if (gg.HaveMemo(talker, 198) == 1 && gg.GetMemoState(talker, 198) == 1) {
myself.Say(gg.MakeFString(1800845, myself.c_ai0.name, "", "", "", ""));
i0 = 30000 - gg.Rand(20000);
myself.AddTimerEx(9999, i0);
myself.CreateOnePrivateEx(1027346, "evil_of_shilen6", 0, 0, -23734, -9184, -5384, 0, 0, 1, gg.GetIndexFromCreature(myself.c_ai0));
myself.av_quest0.Exchange(1);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam private) {
if (timer_id == 9999) {
if (myself.av_quest0.GetValue() == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) < 600) {
myself.AddUseSkillDesire(myself.c_ai0, npc_heal, 0, 1, max_desire);

} else {
myself.Say(gg.MakeFString(1800846, myself.c_ai0.name, "", "", "", ""));

}
i0 = 30000 - gg.Rand(20000);

}
myself.AddTimerEx(9999, i0);

}

}
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

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 20090502) {
if (myself.i_quest9) {
myself.Say("성공 신호 받았음");

}
myself.Say(gg.MakeFString(1800847, myself.c_ai0.name, "", "", "", ""));
myself.av_quest0.Exchange(0);
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
gg.SendScriptEvent(myself.sm, 0, 20090504);

} else if (script_event_arg1 == 20090503) {
if (myself.i_quest9) {
myself.Say("비정상 처리 신호 받았음, 실패 처리함");

}
myself.av_quest0.Exchange(0);
if (myself.i_quest9) {
myself.Say("락 값은 " + myself.av_quest0.GetValue() + " 입니다");

}
gg.SendScriptEvent(gg.GetCreatureFromIndex(script_event_arg2), 20090505, 0);
gg.SendScriptEvent(myself.sm, 0, 20090505);

}
super;
	}


}