package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_in_maintower extends default_npc {
	protected int zone_type = 2;
	protected int enter_type = 1;
	protected String fnHi = "";

	protected void CREATED() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, "tombstone_main_tower001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam party0, HandlerParam maker0, HandlerParam i1, HandlerParam c0) {
if (ask == -1006) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.i_ai3 == 0) {
if (gg.OwnItemCount(talker, 9714) >= 1) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) > 300) {
myself.i_ai4 = myself.i_ai4 + 1;

}

}
if (myself.i_ai4 == 0) {
myself.DeleteItem1(talker, 9714, 1);
myself.i_ai3 = 1;
myself.ShowPage(talker, "tombstone_main_tower002d.htm");
myself.InstantZone_Finish(5);

} else {
myself.ShowPage(talker, "tombstone_main_tower002b.htm");

}
myself.i_ai4 = 0;

} else {
myself.ShowPage(talker, "tombstone_main_tower002a.htm");

}

} else {
myself.ShowPage(talker, "tombstone_main_tower002c.htm");

}

} else {
myself.ShowPage(talker, "tombstone_main_tower002.htm");

}

}

}
	}


}