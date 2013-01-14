package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_lamp extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 7 + gg.Rand(4));
myself.CastBuffForQuestReward(myself.master, 1518862337);
myself.CastBuffForQuestReward(myself.master, 1518993409);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.Suicide();

}
	}


}