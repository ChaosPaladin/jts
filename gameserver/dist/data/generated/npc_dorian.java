package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_dorian extends citizen {
	protected int Pass_Skill = 154468353;
	protected int pos_x = -13400;
	protected int pos_y = 272827;
	protected int pos_z = -15300;

	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void TALKED() {
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam c0, HandlerParam i1) {
if (ask == -1006) {
if (reply == 1) {
party0 = gg.GetParty(talker);
i0 = gg.Party_GetCount(talker);
if (talker != myself.GetLeaderOfParty(party0)) {
myself.ShowPage(talker, "dorian002a.htm");

} else {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) > 300) {
myself.i_ai4 = myself.i_ai4 + 1;

}

}
if (myself.i_ai4 == 0) {
myself.TeleportParty(party0.id, pos_x, pos_y, pos_z, 300, 0);

} else {
myself.ShowPage(talker, "dorian002.htm");

}
myself.i_ai4 = 0;

}

}

}
	}


}