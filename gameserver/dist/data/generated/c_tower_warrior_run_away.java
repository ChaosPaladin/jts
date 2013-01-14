package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_warrior_run_away extends warrior_use_skill {
	protected int flee_x = 0;
	protected int flee_y = 0;
	protected int flee_z = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 10 && flee_x != 0 && flee_y != 0 && flee_z != 0 && myself.i_ai0 == 0) {
myself.c_ai0 = attacker;
myself.Say(gg.MakeFString(1800132, "", "", "", "", ""));
myself.AddMoveToDesire(flee_x, flee_y, flee_z, 999999999999999999);
myself.i_ai0 = 1;

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam attacker, HandlerParam x, HandlerParam y, HandlerParam z) {
myself.Say(gg.MakeFString(1800133, "", "", "", "", ""));
myself.BroadcastScriptEvent(88001, gg.GetIndexFromCreature(myself.c_ai0), 600);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 88001 && myself.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000000);

}

}
	}


}