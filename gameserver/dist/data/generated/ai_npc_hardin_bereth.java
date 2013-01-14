package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_npc_hardin_bereth extends citizen {
	protected void CREATED() {
myself.AddTimerEx(3940, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3940) {
myself.Say(gg.MakeFString(1801003, "", "", "", "", ""));
myself.AddTimerEx(3941, 7000);

} else if (timer_id == 3941) {
myself.Despawn();

}
	}


}