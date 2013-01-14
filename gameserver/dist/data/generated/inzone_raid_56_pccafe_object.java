package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_56_pccafe_object extends default_npc {
	protected int weak_skill = 368508929;

	protected void CREATED() {
myself.AddTimerEx(5507, 10 * 1000);
myself.AddTimerEx(5508, 20 * 1000);
myself.AddTimerEx(5509, 30 * 1000);
myself.c_ai4 = gg.GetNullCreature();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5507 || timer_id == 5508) {
myself.AddUseSkillDesire(myself.c_ai4, weak_skill, 0, 0, 999999999999999999);

} else if (timer_id == 5509) {
myself.Despawn();

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 8) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.c_ai4 = c0;

}
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}


}