package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_beres_camera04 extends default_npc {
	protected int GM_BERETH = 11;
	protected String secret_door = "beres_door_001";

	protected void CREATED() {
gg.Castle_GateOpenClose2(secret_door, 1);
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 0, 275, 30, 0, 10000, 3000, 0, 5, 1, 0, 1);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109236, 10);

}
myself.AddTimerEx(1001, 1000);

} else if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 0, 100, 30, 2500, 10000, 4000, 0, 5, 1, 0, 0);
myself.AddTimerEx(1002, 2500);

} else if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 0, 281, 30, 2500, 10000, 4000, 0, 5, 1, 0, 0);
myself.AddTimerEx(1003, 2500);

} else if (timer_id == 1003) {
myself.SpecialCamera3(myself.sm, 150, 281, 0, 3000, 10000, 12000, 0, 35, 1, 0, 0);
myself.AddTimerEx(1004, 9000);

} else if (timer_id == 1004) {
myself.SpecialCamera3(myself.sm, -45, 281, 30, 0, 10000, 4000, 0, 10, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109237, 10);

}
myself.AddTimerEx(1005, 3500);

} else if (timer_id == 1005) {
myself.SpecialCamera3(myself.sm, 700, 0, 0, 0, 10000, 3000, 180, 15, 1, 0, 0);
if (secret_door == "door_default") {

} else {
gg.Castle_GateOpenClose2(secret_door, 0);

}

}
	}


}