package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tower_of_kerthang extends default_npc {
	protected void CREATED() {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = myself.sm.param2;
myself.RegisterResurrectionTower(myself.i_ai0, myself.i_ai1);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0, HandlerParam i0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 1) {
i0 = gg.Rand(4);
if (i0 == 0) {
gg.InstantTeleportEx(attacker, -81472, -49190, -10352, 0);

} else if (i0 == 1) {
gg.InstantTeleportEx(attacker, -81887, -49586, -10352, 0);

} else if (i0 == 2) {
gg.InstantTeleportEx(attacker, -82314, -49167, -10352, 0);

} else if (i0 == 3) {
gg.InstantTeleportEx(attacker, -81903, -48773, -10352, 0);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 13102) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam party1) {
if (timer_id == 1001) {
myself.Despawn();

}
	}


}