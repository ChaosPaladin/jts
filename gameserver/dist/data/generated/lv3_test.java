package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_test extends default_npc {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.sm.param1 = gg.GetIndexFromCreature(attacker);
myself.CreateOnePrivateEx(1020218, "lv3_orc", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.sm.param1, 0, gg.GetIndexFromCreature(myself.sm));
myself.CreateOnePrivateEx(1020218, "lv3_song_dance", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.sm.param1, 0, gg.GetIndexFromCreature(myself.sm));
	}

	protected void PARTY_DIED(HandlerParam private) {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 1000) {

}
	}


}