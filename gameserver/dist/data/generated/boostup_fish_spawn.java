package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class boostup_fish_spawn extends warrior_basic {
	protected int fish_spawn_probability = 0;
	protected int ItemA = 13032;
	protected int ItemB = 13033;

	protected void CREATED() {
myself.i_ai0 = 1;
myself.SetVisible(0);
myself.AddTimerEx(1000, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1000) {
i0 = gg.Rand(3) + 1;
myself.AddTimerEx(2000, 1 + gg.Rand(i0) * 60 * 1000);

}
if (timer_id == 2000) {
if (myself.i_ai0 == 0) {
myself.SetVisible(1);
myself.i_ai0 = 1;

} else {
myself.SetVisible(0);
myself.i_ai0 = 0;

}
myself.AddTimerEx(1000, 5000);

}
	}

	protected void MY_DYING() {
if (gg.Rand(2) < 1) {
myself.DropItem1(myself.sm, ItemA, gg.Rand(7) + 1);

} else {
myself.DropItem1(myself.sm, ItemB, gg.Rand(7) + 1);

}
	}


}