package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_beres_camera01 extends default_npc {
	protected int GM_BERETH = 11;
	protected String interdoor = "beres_door_003";

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
gg.Castle_GateOpenClose2(interdoor, 0);
myself.EffectMusic(myself.sm, 10000, "BS07_A");
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 1500, 0, 90, 2500, 10000, 30000, 0, 180, 1, 0, 1);
myself.AddTimerEx(1001, 2500);

} else if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 900, 180, 0, 15000, 10000, 30000, 50, 20, 1, 0, 0);
myself.AddTimerEx(1002, 15000);

} else if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 20, 180, 0, 1500, 10000, 15000, 80, 15, 1, 0, 0);
myself.AddTimerEx(1003, 1500);

} else if (timer_id == 1003) {
if (interdoor == "door_default") {
return;

} else {
gg.Castle_GateOpenClose2(interdoor, 1);
myself.SpecialCamera3(myself.sm, 20, 180, 0, 0, 10000, 4000, 80, 15, 1, 0, 0);
myself.AddTimerEx(1004, 1500);

}

} else if (timer_id == 1004) {
myself.CreateOnePrivateEx(1029121, "ai_boss09_beres_camera02", 0, 0, 16321, 214835, -9352, 0, 0, 0, 0);
myself.AddTimerEx(1005, 10000);

} else if (timer_id == 1005) {
myself.Despawn();

}
	}


}