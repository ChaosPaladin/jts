package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_banshee_raid extends teleport_air_monster {
	protected int dist = 300;
	protected int IsAggressive = 0;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s1) {
if (script_event_arg1 == 1424001) {
if (script_event_arg2 == 2) {
myself.CreateOnePrivateEx(1022508, "ai_boom_eye", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(myself.c_ai0), 0, 0);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
if (creature.is_pc) {
myself.ShowSystemMessageStr(creature, gg.MakeFString(1800294, myself.c_ai2.name, "", "", "", ""));

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = 0;
myself.c_ai2 = last_attacker;
super;
if (i2 == 1) {
myself.LookNeighbor(1000);
myself.i_ai0 = Death;

}
	}


}