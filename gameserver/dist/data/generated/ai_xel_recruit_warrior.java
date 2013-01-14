package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_recruit_warrior extends ai_xel_recruit_war {
	protected int Skill01_Probablity = 100;
	protected int Skill02_Probablity = 100;

	protected void CREATED() {
if (gg.Rand(18) < 1) {
myself.i_ai0 = 1;
myself.i_quest0 = 1;
myself.AddTimerEx(2019999, 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam attacker) {
if (script_event_arg1 == 10016 + trainer_id) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.alive == 0) {
return;

}
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 100);

}
myself.AddAttackDesire(c0, 1, 5000);

}

}
if (script_event_arg1 == 2219023 + trainer_id) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai6 = 1;
myself.RemoveAllDesire();
myself.AddFleeDesire(c0, 50000000);
if (gg.Rand(4) < 1) {
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1801114, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801115, "", "", "", "", ""));

}

}
myself.c_ai1 = c0;
myself.AddTimerEx(2019777, 10);
myself.AddTimerEx(2019888, 5 * 1000);

}

}
if (script_event_arg2 == trainer_id && myself.i_ai6 == 0) {
switch (script_event_arg1) {
case 2219011: {
if (myself.i_ai0 == 1) {
break;

}
myself.i_ai2 = 70;
myself.i_ai3 = 4;
myself.i_ai4 = 2;
myself.AddTimerEx(22201, 100);
break;

}
case 2219012: {
if (myself.i_ai0 == 1) {
break;

}
myself.i_ai2 = 130;
myself.i_ai3 = 1;
myself.i_ai4 = 2;
myself.AddTimerEx(22201, 100);
break;

}
case 2219013: {
if (myself.i_ai0 != 1) {
myself.i_ai2 = 30;
myself.i_ai3 = 5;
myself.i_ai4 = 4;
myself.AddTimerEx(22201, 100);

} else {
myself.i_ai2 = 30;
myself.i_ai3 = 6;
myself.i_ai4 = 4;
myself.AddTimerEx(22201, 100);

}
break;

}
case 2219014: {
if (myself.i_ai0 == 1) {
break;

}
myself.i_ai2 = 30;
myself.i_ai3 = 7;
myself.i_ai4 = 2;
myself.AddTimerEx(22201, 100);
break;

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2019999) {
myself.AddTimerEx(2019999, 5000);

}
if (timer_id == 2019888) {
myself.i_ai6 = 0;

}
if (timer_id == 2019777) {
myself.AddFleeDesire(myself.c_ai1, 50000000);
if (myself.i_ai6 == 1) {
myself.AddTimerEx(2019777, 1000);

}

}
if (timer_id == 22201) {
myself.AddEffectActionDesire(myself.sm, myself.i_ai3, myself.i_ai2 * 1000 / 30, 500);
if (myself.i_ai4 != 0) {
myself.i_ai4 = myself.i_ai4 - 1;
myself.AddTimerEx(22201, myself.i_ai2 * 1000 / 30);

}

}
	}


}