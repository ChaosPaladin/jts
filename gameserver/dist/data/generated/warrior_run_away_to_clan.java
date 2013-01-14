package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_run_away_to_clan extends warrior {
	protected int flee_x = 0;
	protected int flee_y = 0;
	protected int flee_z = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam i5) {
i6 = gg.Rand(100);
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;

} else if (myself.sm.hp < myself.sm.max_hp / 2.000000 && myself.sm.hp > myself.sm.max_hp / 3.000000 && attacker.hp > attacker.max_hp / 4.000000 && i6 < 10 && myself.i_ai0 == 0 && flee_x != 0 && flee_y != 0 && flee_z != 0) {
i5 = gg.Rand(100);
if (i5 < 7) {
myself.Say(gg.MakeFString(1000007, "", "", "", "", ""));

} else if (i5 < 14) {
myself.Say(gg.MakeFString(1000008, "", "", "", "", ""));

} else if (i5 < 21) {
myself.Say(gg.MakeFString(1000009, "", "", "", "", ""));

} else if (i5 < 28) {
myself.Say(gg.MakeFString(1000010, "", "", "", "", ""));

} else if (i5 < 35) {
myself.Say(gg.MakeFString(1000011, "", "", "", "", ""));

} else if (i5 < 42) {
myself.Say(gg.MakeFString(1000012, "", "", "", "", ""));

} else if (i5 < 49) {
myself.Say(gg.MakeFString(1000013, "", "", "", "", ""));

} else if (i5 < 56) {
myself.Say(gg.MakeFString(1000014, "", "", "", "", ""));

} else if (i5 < 63) {
myself.Say(gg.MakeFString(1000015, "", "", "", "", ""));

} else if (i5 < 70) {
myself.Say(gg.MakeFString(1000016, "", "", "", "", ""));

} else if (i5 < 77) {
myself.Say(gg.MakeFString(1000017, "", "", "", "", ""));

} else if (i5 < 79) {
myself.Say(gg.MakeFString(1000018, "", "", "", "", ""));

} else if (i5 < 81) {
myself.Say(gg.MakeFString(1000019, "", "", "", "", ""));

} else if (i5 < 83) {
myself.Say(gg.MakeFString(1000020, "", "", "", "", ""));

} else if (i5 < 85) {
myself.Say(gg.MakeFString(1000021, "", "", "", "", ""));

} else if (i5 < 87) {
myself.Say(gg.MakeFString(1000022, "", "", "", "", ""));

} else if (i5 < 89) {
myself.Say(gg.MakeFString(1000023, "", "", "", "", ""));

} else if (i5 < 91) {
myself.Say(gg.MakeFString(1000024, "", "", "", "", ""));

} else if (i5 < 93) {
myself.Say(gg.MakeFString(1000025, "", "", "", "", ""));

} else if (i5 < 95) {
myself.Say(gg.MakeFString(1000026, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000027, "", "", "", "", ""));

}
myself.AddMoveToDesire(flee_x, flee_y, flee_z, 100000000);
myself.i_ai0 = 1;
myself.c_ai0 = attacker;

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai0 == 1) {
if (x == flee_x && y == flee_y && z == flee_z) {
myself.AddTimerEx(2001, 15000);
myself.AddMoveToDesire(flee_x, flee_y, flee_z, -100000000);
myself.AddMoveAroundDesire(100, 50);
myself.i_ai0 = 2;
myself.BroadcastScriptEvent(10000, gg.GetIndexFromCreature(myself.c_ai0), 400);

} else {
myself.AddMoveToDesire(flee_x, flee_y, flee_z, 100000000);

}

}
if (myself.i_ai0 == 3) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.AddMoveAroundDesire(100, 1000);
myself.i_ai0 = 0;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.sm.hp / myself.sm.max_hp * 100.000000 > 70.000000 && myself.i_ai0 == 2 && myself.p_state != 3) {
myself.AddMoveAroundDesire(100, -1000);
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);
myself.i_ai0 = 3;

} else if (myself.p_state != 3) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 50);
myself.i_ai0 = 0;

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 10000 && myself.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000000);
myself.i_ai0 = 3;

}

}
	}


}