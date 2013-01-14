package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_rematan_privates extends abstract_npc {
	protected int RespawnTime = 0;
	protected int Skill01_id = 374341633;

	protected void CREATED() {
myself.i_ai1 = 2;
myself.AddTimerEx(200, 10);
myself.AddTimerEx(100, 4 * 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (gg.IsSameString(creature.name, "rematan")) {
myself.c_ai0 = creature;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100) {
if (myself.i_ai1 == 2) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_id, 1, 0, 800000);

}
myself.AddTimerEx(100, 15 * 1000);

}
if (timer_id == 200) {
myself.LookNeighbor(2000);
myself.AddTimerEx(200, 10000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2211001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

}
if (script_event_arg1 == 2211004) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}
myself.i_ai1 = 1;

}
if (script_event_arg1 == 2211003) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}
myself.i_ai1 = 2;

}
	}


}