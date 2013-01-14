package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_tombstone_evil_factory extends default_npc {
	protected String fnHi = "tombstone_evil_factory001.htm";
	protected String fnHi2 = "tombstone_evil_factory001a.htm";
	protected String fnHi3 = "tombstone_evil_factory002.htm";
	protected String fnHi4 = "tombstone_evil_factory003.htm";
	protected int item_1 = 10427;
	protected int item_2 = 10428;
	protected int item_3 = 10429;
	protected int item_4 = 10430;
	protected int item_5 = 10431;
	protected int factory_x = 26612;
	protected int factory_y = 248567;
	protected int factory_z = -2856;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
if (myself.GetGlobalMap(16) == -1 || myself.GetGlobalMap(16) == 0) {
myself.AddTimerEx(78001, 5 * 60 * 1000);

} else {
myself.Despawn();

}
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
if (gg.OwnItemCount(talker, item_1) == 1 || gg.OwnItemCount(talker, item_2) == 1 || gg.OwnItemCount(talker, item_3) == 1 || gg.OwnItemCount(talker, item_4) == 1 || gg.OwnItemCount(talker, item_5) == 1) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
if (myself.GetGlobalMap(16) == -1 || myself.GetGlobalMap(16) == 0) {
myself.AddTimerEx(78001, 5 * 60 * 1000);

} else {
myself.Despawn();

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam party0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
i0 = gg.Party_GetCount(talker);
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, item_1) == 1 && myself.DistFromMe(c0) <= 300) {
myself.i_ai0 = 1;

}
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, item_2) == 1 && myself.DistFromMe(c0) <= 300) {
myself.i_ai1 = 1;

}
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, item_3) == 1 && myself.DistFromMe(c0) <= 300) {
myself.i_ai2 = 1;

}
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, item_4) == 1 && myself.DistFromMe(c0) <= 300) {
myself.i_ai3 = 1;

}
if (myself.IsNullCreature(c0) == 0 && gg.OwnItemCount(c0, item_5) == 1 && myself.DistFromMe(c0) <= 300) {
myself.i_ai4 = 1;

}

}
if (myself.i_ai0 == 1 && myself.i_ai1 == 1 && myself.i_ai2 == 1 && myself.i_ai3 == 1 && myself.i_ai4 == 1) {
myself.TeleportParty(party0.id, factory_x, factory_y, factory_z, 6000, 0);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;

} else if (myself.i_ai0 == 1 || myself.i_ai1 == 1 || myself.i_ai2 == 1 || myself.i_ai3 == 1 || myself.i_ai4 == 1) {
myself.ShowPage(talker, fnHi3);

} else if (myself.i_ai0 == 0 && myself.i_ai1 == 0 && myself.i_ai2 == 0 && myself.i_ai3 == 0 && myself.i_ai4 == 0) {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.ShowPage(talker, fnHi4);

}

}

}
	}


}