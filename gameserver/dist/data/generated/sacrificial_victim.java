package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sacrificial_victim extends default_npc {
	protected String spawnAI = "royal_rush_heretic_bomb2";
	protected int spawnSilhouette = 1022145;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 3) {
myself.AddTimerEx(998, 10 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 998) {
myself.AddEffectActionDesire(myself.sm, 1, 7000, 1000);
myself.AddTimerEx(999, 5 * 1000);

} else if (timer_id == 999) {
myself.CreateOnePrivateEx(spawnSilhouette, spawnAI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.AddTimerEx(997, 10 * 1000);
myself.Despawn();

} else if (timer_id == 997) {

}
	}


}