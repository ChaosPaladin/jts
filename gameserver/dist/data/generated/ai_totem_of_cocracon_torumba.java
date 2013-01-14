package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_totem_of_cocracon_torumba extends default_npc {
	protected int display_skill = 417726465;
	protected int weak_skill = 417464321;
	protected int max_desire = 10000000;
	protected int DISPLAY_TIMER = 5507;
	protected int DESPAWN_TIMER = 5509;

	protected void CREATED() {
myself.AddTimerEx(DISPLAY_TIMER, 15 * 1000);
myself.AddTimerEx(DESPAWN_TIMER, 23 * 1000);
myself.c_ai4 = gg.GetNullCreature();
myself.i_quest9 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == DISPLAY_TIMER) {
myself.AddUseSkillDesire(myself.sm, display_skill, 0, 1, max_desire);

} else if (timer_id == DESPAWN_TIMER) {
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (skill_name_id == display_skill) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.AddUseSkillDesire(myself.c_ai4, weak_skill, 0, 1, max_desire);
if (myself.i_quest9 == 1) {
myself.Say("약화 스킬 스킬 사용 완료");

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 8) {
myself.c_ai4 = gg.GetCreatureFromIndex(script_event_arg2);

}
	}


}