package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_wdragon_camera02 extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 450, 200, 3, 0, 15000, 10000, -15, 20, 1, 1, 1);
myself.AddTimerEx(1001, 100);

}
if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 350, 200, 5, 5600, 15000, 10000, -15, 10, 1, 1, 0);
myself.AddTimerEx(1002, 5600);

}
if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 360, 200, 5, 1000, 15000, 2000, -15, 10, 1, 1, 0);
myself.AddTimerEx(9999, 10000);

}
if (timer_id == 9999) {
myself.Despawn();

}
	}


}