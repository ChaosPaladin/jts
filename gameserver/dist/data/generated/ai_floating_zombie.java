package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_floating_zombie extends teleport_air_monster {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s1) {
if (script_event_arg1 == 1424001) {
if (script_event_arg2 == 1) {
if (myself.sm.class_id == 1025630) {
myself.CreateOnePrivateEx(1022507, "ai_boom_eye", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(myself.c_ai0), 0, 0);

} else {
myself.CreateOnePrivateEx(1022506, "ai_boom_eye", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(myself.c_ai0), 0, 0);

}

}

}
	}


}