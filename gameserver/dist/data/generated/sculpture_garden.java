package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sculpture_garden extends default_npc {
	protected int buff = 293535745;
	protected int GM_ID = 7;

	protected void CREATED(HandlerParam i0) {
if (GM_ID != 0) {
i0 = myself.GetGlobalMap(GM_ID);
if (i0 == -1) {
myself.RegisterGlobalMap(GM_ID, gg.GetIndexFromCreature(myself.sm));

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0) {
myself.c_ai0 = creature;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (script_event_arg1 == 10027) {
myself.InstantTeleportInMyTerritory(115792, -125760, -3373, 200);

} else if (script_event_arg1 == 11038) {
myself.LookNeighbor(1000);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, buff);

}

}

}

}

}
	}


}