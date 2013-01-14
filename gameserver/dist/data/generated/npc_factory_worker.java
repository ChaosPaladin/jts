package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_factory_worker extends default_npc {
	protected int lower_monster = 1020130;
	protected int higher_monster = 33;
	protected String factory_main_maker_name = "gludio56_2025_malignant99m1";

	protected void CREATED() {
myself.i_ai0 = gg.FloatToInt(myself.sm.x);
myself.i_ai1 = gg.FloatToInt(myself.sm.y);
myself.i_ai2 = gg.FloatToInt(myself.sm.z);
myself.i_ai3 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id)) {
if (gg.Rand(10000) < 2000) {
myself.BroadcastScriptEvent(78010015, gg.GetIndexFromCreature(creature), 500);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam maker0) {
if (myself.i_ai3 == 0) {
myself.Say(gg.MakeFString(1800109, "", "", "", "", ""));
maker0 = gg.GetNpcMaker(factory_main_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010015, 0, 0);

}
myself.AddTimerEx(78001, 1 * 60 * 1000);

}
if (gg.Rand(10000) < 2000) {
myself.i_ai3 = myself.i_ai3 + 1;
myself.BroadcastScriptEvent(78010015, gg.GetIndexFromCreature(attacker), myself.i_ai3 * 1000);

}
myself.AddFleeDesire(attacker, 10);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 11 || myself.p_state == 0) {
if (myself.i_ai3 >= 0) {
myself.AddMoveToDesire(myself.i_ai0, myself.i_ai1, myself.i_ai2, 10000000);
myself.i_ai3 = 0;

} else {
myself.i_ai3 = myself.i_ai3 - 1;
myself.AddTimerEx(78001, 1 * 60 * 1000);

}

} else {
myself.AddTimerEx(78001, 1 * 60 * 1000);

}

}
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(factory_main_maker_name);
if (gg.IsNull(maker0) == 0) {
if (gg.Rand(10000) < 8000) {
myself.Say(gg.MakeFString(1800110, "", "", "", "", ""));
gg.SendMakerScriptEvent(maker0, 78010014, 0, 0);

}

}
	}


}