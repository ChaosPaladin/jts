package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_66_normal_private extends inzone_combat_monster {
	protected int less_heal = 266403846;

	protected void CREATED() {
myself.AddTimerEx(9984, 60 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam i0, HandlerParam i1) {
i0 = gg.Rand(100);
i1 = gg.Rand(100);
if (i1 < 10) {
myself.Say(gg.MakeFString(1800185, "", "", "", "", ""));

}
if (i0 < 3) {
myself.Say(gg.MakeFString(1800186, "", "", "", "", ""));
myself.Suicide();

} else if (i0 > 3 && i0 < 10) {

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == less_heal) {
myself.AddTimerEx(9984, 9 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9984) {
myself.AddUseSkillDesire(myself.boss, less_heal, 0, 1, 999999999999999);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}


}