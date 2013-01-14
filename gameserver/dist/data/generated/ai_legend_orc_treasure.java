package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_treasure extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(2114002, 5 * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2114002) {
myself.SetVisible(0);
myself.Suicide();

}
	}


}