package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_search_thing extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(1000, 60000);
myself.AddTimerEx(1001, 600000);
myself.i_ai0 = 1;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1000 && myself.i_ai0 == 1) {
if (gg.Rand(3) < 1) {
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600020, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600021, "", "", "", "", ""));

}

}
myself.AddTimerEx(1000, 60000);

} else if (timer_id == 1001) {
myself.Despawn();

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 41222145) {
myself.i_ai0 = 0;
myself.Suicide();
myself.CreateOnePrivateEx(1013098, "e_search_box", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y - 130), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013098, "e_search_box", 0, 0, gg.FloatToInt(myself.sm.x - 150), gg.FloatToInt(myself.sm.y + 120), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013098, "e_search_box", 0, 0, gg.FloatToInt(myself.sm.x + 150), gg.FloatToInt(myself.sm.y + 120), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}


}