package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_beres_camera02 extends default_npc {
	protected int GM_BERETH = 11;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0) {
if (timer_id == 1000) {
myself.SpecialCamera3(myself.sm, 600, 190, 0, 0, 10000, 3000, 0, 15, 1, 0, 1);
myself.AddTimerEx(1001, 1);

} else if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 0, 255, 0, 5000, 10000, 30000, 0, 15, 1, 0, 0);
myself.AddTimerEx(1002, 5000);

} else if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 0, 255, 0, 0, 10000, 30000, 0, 15, 1, 0, 0);
myself.CreateOnePrivateEx(1029125, "ai_boss09_beres_camera06", 0, 0, 16321, 215338, -9352, 0, 0, 0, 0);
myself.AddTimerEx(1003, 2000);

} else if (timer_id == 1003) {
myself.SpecialCamera3(myself.sm, 0, 255, 0, 7000, 10000, 20000, 0, 45, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109229, 10);

}
myself.AddTimerEx(1004, 9000);

} else if (timer_id == 1004) {
myself.SpecialCamera3(myself.sm, 0, 255, 0, 0, 10000, 20000, 0, 45, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109230, 10);

}
myself.AddTimerEx(1005, 7500);

} else if (timer_id == 1005) {
myself.SpecialCamera3(myself.sm, 350, 270, 45, 0, 10000, 4000, 0, 45, 1, 0, 0);
myself.AddTimerEx(1006, 100);

} else if (timer_id == 1006) {
myself.SpecialCamera3(myself.sm, 0, 270, 0, 2000, 10000, 8000, 0, 12, 1, 0, 0);
myself.AddTimerEx(1007, 2000);

} else if (timer_id == 1007) {
myself.SpecialCamera3(myself.sm, -50, 270, 0, 1500, 10000, 7000, 0, 18, 1, 0, 0);
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1109231, 10);

}
myself.AddTimerEx(1008, 5500);

} else if (timer_id == 1008) {
myself.SpecialCamera3(myself.sm, 500, 270, 5, 3000, 10000, 40000, 0, 12, 1, 0, 0);
myself.AddTimerEx(1009, 5000);

} else if (timer_id == 1009) {
myself.CreateOnePrivateEx(1029122, "ai_boss09_beres_camera03", 0, 0, 16323, 213139, -9352, 0, 0, 0, 0);
myself.AddTimerEx(1010, 10000);

} else if (timer_id == 1010) {
myself.Despawn();

}
	}


}