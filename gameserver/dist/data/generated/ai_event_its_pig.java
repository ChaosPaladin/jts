package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_its_pig extends default_npc {
	protected void CREATED(HandlerParam i0) {
i0 = gg.Rand(2);
myself.AddTimerEx(20000, 10000);
myself.Say(gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0) {
i0 = gg.Rand(3);
myself.AddMoveAroundDesire(40, 20);
if (skill_name_id == 187891713 || skill_name_id == 187957249) {
myself.Say(gg.MakeFString(MakeFString + i0, "", "", "", "", ""));

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 20000) {
myself.Despawn();

}
	}


}