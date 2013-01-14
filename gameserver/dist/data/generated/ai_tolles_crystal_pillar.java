package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tolles_crystal_pillar extends default_npc {
	protected String fnHI = "";
	protected int Skill01_ID = 458752001;
	protected int Skill02_ID = 458752001;

	protected void CREATED() {
myself.i_ai0 = 1;
if (myself.GetGlobalMap(12) != -1 && myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 10000000000);

}
myself.AddTimerEx(780001, 30 * 60 * 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 10000000000);

}
super;
	}

	protected void MY_DYING() {
myself.CreateOnePrivateEx(1032370, "ghost_tolles", 0, 0, gg.FloatToInt(myself.sm.x) + 30, gg.FloatToInt(myself.sm.y) - 30, gg.FloatToInt(myself.sm.z), 0, 5, 0, 0);
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (myself.i_ai0 == 0) {

} else if (myself.i_ai0 == 1) {

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 780001) {
if (myself.GetGlobalMap(12) != -1 && myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 10000000000);

} else if (myself.GetGlobalMap(12) == -1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 10000000000);

}
myself.AddTimerEx(780001, 30 * 60 * 1000);

}
super;
	}


}