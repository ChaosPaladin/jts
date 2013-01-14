package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_zerian extends citizen {
	protected int Pass_Skill = 154468353;
	protected int pos_x = -22204;
	protected int pos_y = 277056;
	protected int pos_z = -15023;

	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void TALKED() {
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == -1006) {
if (reply == 1) {
i2 = gg.GetStep_FieldCycle(1);
if (i2 >= 11) {
party0 = gg.GetParty(talker);
i0 = gg.Party_GetCount(talker);
if (talker != myself.GetLeaderOfParty(party0)) {
myself.ShowPage(talker, "zerian002a.htm");

} else {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(Pass_Skill)) < 0 || myself.DistFromMe(c0) > 300) {
myself.i_ai4 = myself.i_ai4 + 1;

}

}
if (myself.i_ai4 == 0) {
myself.TeleportParty(party0.id, pos_x, pos_y, pos_z, 300, 0);

} else {
myself.ShowPage(talker, "zerian002.htm");

}
myself.i_ai4 = 0;

}

} else {
myself.ShowPage(talker, "zerian002b.htm");

}

}

}
	}


}