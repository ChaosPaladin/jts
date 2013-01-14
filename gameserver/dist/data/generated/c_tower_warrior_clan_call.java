package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_warrior_clan_call extends warrior_basic {
	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 20 && myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1800134, "", "", "", "", ""));
myself.BroadcastScriptEvent(88001, gg.GetIndexFromCreature(myself.top_desire_target), 2000);
myself.i_ai0 = 1;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 88001 && myself.i_ai0 == 0) {
myself.RemoveAllAttackDesire();
myself.i_ai0 = 1;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 9999999);

}

}
	}


}