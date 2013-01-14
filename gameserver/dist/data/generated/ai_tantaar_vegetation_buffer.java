package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_vegetation_buffer extends default_npc {
	protected int Normal_Desire = 1000000;
	protected int Max_Desire = 1000000000000000000;
	protected int TID_DESPAWN = 78001;
	protected int TIME_DESPAWN = 5;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam c0, HandlerParam c1) {
if (myself.sm.param1 != 0) {
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (babble_mode) {
myself.Say(myself.c_ai0.name + ":" + myself.sm.param2);

}
switch (myself.sm.param2) {
case 0: {
if (babble_mode) {
myself.Say("skill01 out");

}
myself.AddUseSkillDesire(myself.c_ai0, 421265409, 0, 0, Max_Desire);
break;

}
case 1: {
if (babble_mode) {
myself.Say("skill01 out");

}
myself.AddUseSkillDesire(myself.c_ai0, 421396481, 0, 0, Max_Desire);
break;

}
case 2: {
if (babble_mode) {
myself.Say("skill01 out");

}
myself.AddUseSkillDesire(myself.c_ai0, 435683329, 0, 0, Max_Desire);
break;

}
case 3: {
if (babble_mode) {
myself.Say("skill01 out");

}
myself.AddUseSkillDesire(myself.c_ai0, 421330945, 0, 0, Max_Desire);
break;

}

}

} else if (babble_mode) {
myself.Say("target unavailable");

}

}
myself.AddTimerEx(TID_DESPAWN, TIME_DESPAWN * 1000);
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (babble_mode) {
myself.Say("USE_SKILL_FINISHED:" + skill_name_id / 256 * 256);

}
myself.Suicide();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_DESPAWN) {
myself.Suicide();

}
	}


}