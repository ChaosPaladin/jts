package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_private_demonic_jail extends warrior_use_skill {
	protected void CREATED(HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0) {
myself.i_ai1 = myself.GetTick();
myself.i_ai2 = 1;
myself.AddTimerEx(1100, 60 * 1000);
myself.BroadcastScriptEventEx(13026, gg.GetIndexFromCreature(attacker), 0, 3000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai2 == 0) {
myself.i_ai1 = myself.GetTick();
myself.i_ai2 = 1;
myself.AddTimerEx(1100, 60 * 1000);
myself.BroadcastScriptEventEx(13026, gg.GetIndexFromCreature(creature), 0, 3000);

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1100) {
if (myself.GetTick() - myself.i_ai1 >= 60 * 1000) {
myself.BroadcastScriptEvent(13021, 0, 3000);
i0 = gg.Rand(100);
if (i0 < 25) {
myself.InstantTeleportInMyTerritory(153565, 141290, -12736, 500);

} else if (i0 < 50) {
myself.InstantTeleportInMyTerritory(153570, 142853, -12736, 500);

} else if (i0 < 75) {
myself.InstantTeleportInMyTerritory(152793, 142080, -12736, 500);

} else {
myself.InstantTeleportInMyTerritory(154359, 142077, -12736, 500);

}
myself.Despawn();

} else {
myself.AddTimerEx(1100, 10 * 1000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 13020) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm != c0) {
myself.i_ai0 = 1;

}

}

}
	}

	protected void MY_DYING(HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
myself.BroadcastScriptEvent(13021, 0, 3000);
myself.BroadcastScriptEvent(13020, gg.GetIndexFromCreature(myself.sm), 1000);
if (myself.i_ai0 == 1) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.InstantTeleportInMyTerritory(153565, 141290, -12736, 500);

} else if (i0 < 50) {
myself.InstantTeleportInMyTerritory(153570, 142853, -12736, 500);

} else if (i0 < 75) {
myself.InstantTeleportInMyTerritory(152793, 142080, -12736, 500);

} else {
myself.InstantTeleportInMyTerritory(154359, 142077, -12736, 500);

}

}
super;
	}


}