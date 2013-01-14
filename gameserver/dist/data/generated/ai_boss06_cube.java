package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss06_cube extends instant_teleporter {
	protected void CREATED() {
myself.AddTimerEx(2001, 900000);
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
i0 = gg.Rand(3);
if (i0 == 0) {
i1 = 108784 + gg.Rand(100);
i2 = 16000 + gg.Rand(100);
i3 = -4928;

} else if (i0 == 1) {
i1 = 113824 + gg.Rand(100);
i2 = 10448 + gg.Rand(100);
i3 = -5164;

} else {
i1 = 115488 + gg.Rand(100);
i2 = 22096 + gg.Rand(100);
i3 = -5168;

}
myself.InstantTeleport(talker, i1, i2, i3);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.Despawn();

}
	}


}