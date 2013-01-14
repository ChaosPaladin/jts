package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_cow_summoner1 extends default_npc {
	protected int ev_monster1 = 1013191;
	protected String ev_monster1_ai = "event_ai_glommy_cow";

	protected void CREATED(HandlerParam i0, HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.sm.summoner_id);
myself.i_ai0 = c0.id;
i0 = gg.Rand(100);
if (i0 <= 75) {
myself.CreateOnePrivateEx(ev_monster1, ev_monster1_ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(myself.sm) * 182, myself.i_ai0, 0, 0);

} else {
myself.CreateOnePrivateEx(1013196, "ai_event_its_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(myself.sm) * 182, myself.i_ai0, 0, 0);

}
myself.AddTimerEx(20000, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
if (timer_id == 20000) {
myself.Despawn();

}
	}


}