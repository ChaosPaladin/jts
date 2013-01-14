package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_yellow_cow extends event_ai_milk_cow {
	protected int ev_massage2 = 1800818;
	protected int ev_massage3 = 1800759;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.sm.param1);
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.i_ai0 = c0.id;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.AddTimerEx(200001, 360000);
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
i0 = 1 + gg.Rand(2);
i1 = gg.Rand(3);
i2 = gg.Rand(2);
myself.i_quest0 = 1;
c0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) <= 1500) {
if (myself.i_ai2 == 1) {
myself.GiveItem1(c0, 14720, i0 * 2);
myself.GiveItem1(c0, 14721, i2 * 2);
myself.Say(gg.MakeFString(ev_massage2 + i1, c0.name, "", "", "", ""));
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

} else if (myself.i_ai2 == 0) {
myself.GiveItem1(c0, 14720, i0);
myself.GiveItem1(c0, 14721, i2);
myself.Say(gg.MakeFString(ev_massage3 + i1, "", "", "", "", ""));

}

}

}
	}


}