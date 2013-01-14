package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_yellow_big_cow extends event_ai_milk_big_cow {
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
myself.i_quest2 = 0;
myself.AddTimerEx(20000, 360000);
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
i0 = 1 + gg.Rand(2);
myself.i_quest0 = 1;
i5 = gg.Rand(3);
c0 = gg.GetCreatureFromID(myself.i_ai0);
party0 = gg.GetParty(c0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
if (myself.i_ai2 == 1) {
i3 = gg.FloatToInt(i0 * i1 * 0.200000 * 2);
myself.Say(gg.MakeFString(ev_massage2 + i5, c0.name, "", "", "", ""));
if (myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, 14720, i3);
myself.GiveItem1(c0, 14721, i3);

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) <= 1500) {
myself.GiveItem1(c1, 14720, i0 * 2);
myself.GiveItem1(c1, 14721, i0 * 2);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

}

}

}

} else if (myself.i_ai2 == 0) {
i4 = gg.FloatToInt(i0 * i1 * 0.200000);
myself.Say(gg.MakeFString(ev_massage3 + i5, "", "", "", "", ""));
if (myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, 14720, i4);
myself.GiveItem1(c0, 14721, i4);

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) <= 1500) {
myself.GiveItem1(c1, 14720, i0);
myself.GiveItem1(c1, 14721, i0);

}

}

}

}

} else {
myself.GiveItem1(c0, 14720, i0);
myself.GiveItem1(c0, 14721, i0);
myself.Say(gg.MakeFString(1800821, "", "", "", "", ""));

}

}
	}


}