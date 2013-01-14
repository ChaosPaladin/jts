package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_divine_anais extends wizard_use_skill {
	protected int Skill01_ID = 414449665;
	protected int Skill02_ID = 414384129;
	protected int Skill03_ID = 414515201;
	protected int Skill03_AttackSplash = 1;
	protected int Skill03_Target = 1;
	protected int TIME_FOR_ANAIS_INFO = 901;
	protected int MoveArounding = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_quest9 = 0;
myself.AddTimerEx(TIME_FOR_ANAIS_INFO, 3 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIME_FOR_ANAIS_INFO) {

}
myself.BroadcastScriptEvent(2114008, myself.sm.id, 2000);
myself.AddTimerEx(TIME_FOR_ANAIS_INFO, 30 * 1000);
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.Say("첫번째 화로 활성화");
myself.BroadcastScriptEvent(2114006, 1, 2000);

} else if (reply == 2) {
myself.Say("두번째 화로 활성화");
myself.BroadcastScriptEvent(2114006, 2, 2000);

} else if (reply == 3) {
myself.Say("세번째 화로 활성화");
myself.BroadcastScriptEvent(2114006, 3, 2000);

} else if (reply == 4) {
myself.Say("네번째 화로 활성화");
myself.BroadcastScriptEvent(2114006, 4, 2000);

} else if (reply == 4) {
myself.Say("몽땅 활성화");
myself.BroadcastScriptEvent(2114006, 1, 2000);
myself.BroadcastScriptEvent(2114006, 2, 2000);
myself.BroadcastScriptEvent(2114006, 3, 2000);
myself.BroadcastScriptEvent(2114006, 4, 2000);

}
myself.i_quest9 = 1;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai0 == 0) {
myself.BroadcastScriptEvent(2114006, 1, 2000);
myself.i_ai0 = 1;

} else if (myself.sm.hp <= myself.sm.max_hp * 0.750000 && myself.i_ai0 == 1) {
myself.BroadcastScriptEvent(2114006, 2, 2000);
myself.i_ai0 = 2;

} else if (myself.sm.hp <= myself.sm.max_hp * 0.500000 && myself.i_ai0 == 2) {
myself.BroadcastScriptEvent(2114006, 3, 2000);
myself.i_ai0 = 3;

} else if (myself.sm.hp <= myself.sm.max_hp * 0.250000 && myself.i_ai0 == 3) {
myself.BroadcastScriptEvent(2114006, 4, 2000);
myself.i_ai0 = 4;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam c0) {
if (script_event_arg1 == 21140010) {
c0 = gg.GetCreatureFromID(script_event_arg2);
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 2114009, h0.creature.id);
if (myself.i_quest9 == 1) {

}

}

}

}
super;
	}

	protected void MY_DYING() {
myself.BroadcastScriptEvent(2114007, 1, 3000);
super;
	}


}