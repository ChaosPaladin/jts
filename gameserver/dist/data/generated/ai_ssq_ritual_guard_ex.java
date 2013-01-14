package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_guard_ex extends default_npc {
	protected String SuperPointName = "-1";
	protected int SearchType = 0;
	protected int SKILL_ssq_teleport = 391774209;
	protected int TIMER_ssq_teleport = 27333;
	protected int TIMER_set_focus = 27334;
	protected int TIMER_roamer_delay = 27335;
	protected int Fstring_Num = -1;
	protected int max_delay = -1;
	protected int my_agro_range = 150;
	protected int my_position = -1;
	protected int Pos_X1 = -75775;
	protected int Pos_Y1 = 213415;
	protected int Pos_Z1 = -7120;
	protected int Pos_X2 = -74959;
	protected int Pos_Y2 = 209240;
	protected int Pos_Z2 = -7472;
	protected int Pos_X3 = -77699;
	protected int Pos_Y3 = 208905;
	protected int Pos_Z3 = -7640;
	protected int Pos_X4 = -79939;
	protected int Pos_Y4 = 205857;
	protected int Pos_Z4 = -7888;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
gg.SetAsNull(myself.c_ai0);
myself.ChangeMoveType(0);
if (gg.IsSameString(SuperPointName, "-1") == 0) {
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 10000);

}
	}

	protected void NO_DESIRE() {
if (gg.IsSameString(SuperPointName, "-1") == 0) {
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 10000);

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam success, HandlerParam i0) {
if (max_delay > 0) {
i0 = gg.Rand(max_delay) + 1;
myself.RemoveAllDesire();
myself.StopMove();
myself.AddTimerEx(TIMER_roamer_delay, i0 * 1000);

} else {
i0 = 0;
myself.AddTimerEx(TIMER_roamer_delay, 1);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.i_ai1 = myself.GetCurrentTick();
myself.c_ai0 = creature;
myself.AddTimerEx(TIMER_set_focus, 1);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (debug_mode) {
myself.Say("use_skill_finished");

}
if (skill_name_id == SKILL_ssq_teleport) {
myself.AddTimerEx(TIMER_ssq_teleport, 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_set_focus) {
if (myself.GetCurrentTick() - myself.i_ai1 < 30 && myself.i_ai0 == 1) {
if (myself.DistFromMe(myself.c_ai0) <= my_agro_range) {
myself.i_ai0 = 0;
myself.RemoveAllDesire();
myself.StopMove();
myself.Say(gg.MakeFString(Fstring_Num, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.c_ai0, SKILL_ssq_teleport, 0, 1, 10000000);

} else {
myself.AddTimerEx(TIMER_set_focus, 500);

}

} else if (myself.DistFromMe(myself.c_ai0) <= 1000) {
myself.i_ai1 = myself.GetCurrentTick();
myself.AddTimerEx(TIMER_set_focus, 500);

} else {
myself.i_ai0 = 0;

}

} else if (timer_id == TIMER_roamer_delay) {
if (gg.IsSameString(SuperPointName, "-1") == 0) {
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, 10000);

}

} else if (timer_id == TIMER_ssq_teleport) {
switch (my_position) {
case 1: {
myself.InstantTeleport(myself.c_ai0, Pos_X1, Pos_Y1, Pos_Z1);
break;

}
case 2: {
myself.InstantTeleport(myself.c_ai0, Pos_X2, Pos_Y2, Pos_Z2);
break;

}
case 3: {
myself.InstantTeleport(myself.c_ai0, Pos_X3, Pos_Y3, Pos_Z3);
break;

}
case 4: {
myself.InstantTeleport(myself.c_ai0, Pos_X4, Pos_Y4, Pos_Z4);
break;

}

}
myself.Despawn();

}
	}


}