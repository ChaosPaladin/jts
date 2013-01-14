package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_beres_camera03 extends default_npc {
	protected int GM_BERETH = 11;
	protected String dummy_bereth_maker = "maker_default";

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
myself.AddTimerEx(1000, 10);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 50, 270, 15, 3000, 10000, 7000, 0, 5, 1, 0, 1);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109232, 10);

}
myself.AddTimerEx(1001, 4000);

} else if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 400, 270, 20, 2000, 10000, 6000, 0, -5, 1, 0, 0);
myself.AddTimerEx(1002, 5000);

} else if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 20, 263, 0, 0, 10000, 4000, -10, 15, 1, 0, 0);
myself.CreateOnePrivateEx(1029126, "ai_boss09_beres_minion_npc", 0, 0, 16404, 213053, -9352, -16384, 0, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109233, 10);

}
myself.AddTimerEx(1003, 3000);

} else if (timer_id == 1003) {
myself.SpecialCamera3(myself.sm, 20, 274, 0, 0, 10000, 6000, 9, 15, 1, 0, 0);
myself.CreateOnePrivateEx(1029127, "ai_boss09_beres_minion_npc", 0, 0, 16247, 213035, -9352, -16384, 0, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109233, 10);

}
myself.AddTimerEx(1004, 4000);

} else if (timer_id == 1004) {
myself.SpecialCamera3(myself.sm, 0, 260, 0, 0, 10000, 5000, 20, 35, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109234, 10);

}
myself.AddTimerEx(1005, 4000);

} else if (timer_id == 1005) {
myself.SpecialCamera3(myself.sm, 0, 260, 0, 0, 10000, 10000, 20, 35, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109235, 10);

}
myself.AddTimerEx(1006, 10000);

} else if (timer_id == 1006) {
myself.Despawn();

}
	}


}