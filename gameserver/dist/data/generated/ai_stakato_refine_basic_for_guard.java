package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_stakato_refine_basic_for_guard extends ai_stakato_refine_basic {
	protected int DESPAWN_TIMER = 1125;

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
if (myself.DistFromMe(myself.boss) > 300) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));

} else {
myself.AddFollowDesire(myself.boss, 5);

}

} else {
myself.Despawn();

}
	}

	protected void CREATED() {
myself.AddTimerEx(DESPAWN_TIMER, 5 * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == DESPAWN_TIMER) {
myself.Despawn();

}
super;
	}


}