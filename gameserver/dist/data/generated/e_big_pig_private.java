package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_big_pig_private extends default_npc {
	protected int event_animal = 12;
	protected int event_coin = 9142;

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(40, 20);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (myself.IsMyBossAlive()) {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
gg.SendScriptEvent(myself.boss, 12501, 0);
myself.Despawn();
	}


}