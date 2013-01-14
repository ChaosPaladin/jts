package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_flame_trap_manager extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(9919, 13000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 9919) {
i0 = gg.Rand(3) + 100001;
i1 = gg.Rand(3) + 100001;
i2 = gg.Rand(3) + 100001;
if (i0 == i1 || i1 == i2 || i0 == i2) {
i0 = gg.Rand(3) + 100001;
i1 = 3 + gg.Rand(3) + 100001;
i2 = 6 + gg.Rand(3) + 100001;

}
myself.BroadcastScriptEvent(88011, i0, 900);
myself.BroadcastScriptEvent(88011, i1, 900);
myself.BroadcastScriptEvent(88011, i2, 900);
myself.AddTimerEx(9919, 20000);

}
	}


}