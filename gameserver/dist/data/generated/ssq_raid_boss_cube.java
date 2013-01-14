package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_raid_boss_cube extends instant_teleporter {
	protected void CREATED() {
myself.AddTimerEx(2001, 900000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "spirit_gate002.htm");
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (myself.sm.param1 == 0) {
myself.InstantTeleport(talker, 182960 + gg.Rand(50), -11904 + gg.Rand(50), -4897);

} else {
myself.InstantTeleport(talker, 182960 + gg.Rand(50), -11904 + gg.Rand(50), -4897);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.Despawn();

}
	}


}