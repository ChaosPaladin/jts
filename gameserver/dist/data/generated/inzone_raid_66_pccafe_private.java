package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_66_pccafe_private extends default_npc {
	protected int self_explosion = 271253510;

	protected void CREATED() {
myself.AddTimerEx(9984, 10 * 1000);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(2, 5);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9984) {
myself.AddUseSkillDesire(myself.sm, self_explosion, 1, 0, 999999999999999);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == 271253510) {
if (success == 1) {
myself.Despawn();

} else {
myself.AddUseSkillDesire(myself.sm, self_explosion, 1, 0, 999999999999999);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}


}