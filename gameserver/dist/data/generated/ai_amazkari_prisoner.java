package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_amazkari_prisoner extends warrior_basic {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = -15;
	protected int Threshold_Level_Min = 10;
	protected int Threshold_Level_Max = 100;

	protected void CREATED() {
myself.AddTimerEx(78002, gg.Rand(3) + 1 * 30 * 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 78010001) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.AddTimerEx(78001, 26 * 1000);

} else if (script_event_arg1 == 78010028 && gg.Rand(10) == 1) {
myself.Say(gg.MakeFString(1800126, "", "", "", "", ""));
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.hp / 5);

} else if (script_event_arg1 == 78010029) {
if (gg.Rand(1000) > 300) {
myself.Say(gg.MakeFString(1000503, "", "", "", "", "") + "!");

}
gg.AddPoint_FieldCycle(FieldCycle, 30, 1, myself.sm);
myself.Despawn();

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 78001) {
c0 = myself.c_ai0;
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));

}

} else if (timer_id == 78002) {
if (gg.Rand(100) > 20) {
myself.Say(gg.MakeFString(1000138, "", "", "", "", "") + "!");

} else if (gg.Rand(100) > 40) {
myself.Say(gg.MakeFString(1010451, "", "", "", "", ""));

}
myself.AddTimerEx(78002, gg.Rand(8) + 1 * 30 * 1000);

}
super;
	}


}