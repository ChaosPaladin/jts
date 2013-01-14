package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_clear_npc5 extends default_npc {
	protected void CREATED() {
myself.CreateOnePrivateEx(1029103, "ai_boss09_barler_d", 0, 0, 153580, 142077, -12736, 120000, 0, 0, 0);
myself.AddTimerEx(6001, 500);
myself.BroadcastScriptEvent(13013, 0, 500);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 6001) {
myself.SpecialCamera3(myself.sm, 100, 0, 25, 0, 5000, 4000, 0, 0, 1, 0, 1);
myself.AddTimerEx(6002, 1500);

} else if (timer_id == 6002) {
myself.SpecialCamera3(myself.sm, 900, 180, 20, 2500, 5000, 7000, 0, 0, 1, 0, 0);
myself.AddTimerEx(6003, 2500);

} else if (timer_id == 6003) {
myself.SpecialCamera3(myself.sm, 500, 30, 15, 2500, 5000, 6000, 0, 0, 1, 0, 0);
myself.BroadcastScriptEvent(13015, 0, 3000);
myself.AddTimerEx(6004, 2500);

} else if (timer_id == 6004) {
myself.BroadcastScriptEvent(13014, 0, 2000);
myself.BroadcastScriptEvent(13016, 0, 2000);
myself.SpecialCamera3(myself.sm, 500, 220, 30, 2500, 5000, 5000, 0, 0, 1, 0, 0);
myself.AddTimerEx(6005, 2500);

} else if (timer_id == 6005) {
myself.BroadcastScriptEvent(13017, 0, 3000);
myself.SpecialCamera3(myself.sm, 500, 220, 30, 2000, 5000, 6000, 0, 0, 1, 0, 0);
myself.AddTimerEx(6006, 2000);

} else if (timer_id == 6006) {
myself.SpecialCamera3(myself.sm, 50, 190, 30, 5000, 5000, 8000, 0, 25, 1, 0, 0);
myself.AddTimerEx(6007, 7000);

} else if (timer_id == 6007) {
myself.BroadcastScriptEvent(13018, 0, 3000);
myself.SpecialCamera3(myself.sm, 800, 185, 50, 3000, 5000, 6000, 0, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1032279, "ai_telecube_balor", 0, 0, 153575, 142253, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029117, "default_npc", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.AddTimerEx(6008, 5000);

} else if (timer_id == 6008) {
myself.Despawn();

}
	}


}