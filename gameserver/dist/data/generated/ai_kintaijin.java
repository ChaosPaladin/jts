package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kintaijin extends citizen {
	protected int telpos_1_x = 80456;
	protected int telpos_1_y = -52322;
	protected int telpos_1_z = -5640;
	protected int telpos_2_x = 88718;
	protected int telpos_2_y = -46214;
	protected int telpos_2_z = -4640;
	protected int telpos_3_x = 87464;
	protected int telpos_3_y = -54221;
	protected int telpos_3_z = -5120;
	protected int telpos_4_x = 80848;
	protected int telpos_4_y = -49426;
	protected int telpos_4_z = -5128;
	protected int telpos_5_x = 87682;
	protected int telpos_5_y = -43291;
	protected int telpos_5_z = -4128;

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0) {
if (reply == 101) {
myself.Whisper(creature, "** Direction : " + myself.GetDirectionToTarget(creature) * 182 + "  ");

}
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam party0, HandlerParam talker) {
if (ask == -240) {
if (myself.GetOneTimeQuestFlag(talker, 240) == 1) {
switch (reply) {
case 1: {
myself.ShowPage(talker, "kintaijin002.htm");
break;

}
case 10: {
party0 = gg.GetParty(talker);
i2 = gg.Party_GetCount(talker);
if (myself.IsNullParty(party0) == 1) {
myself.InstantTeleport(talker, telpos_1_x, telpos_1_y, telpos_1_z);

} else {
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, telpos_1_x, telpos_1_y, telpos_1_z);

}

}

}
break;

}
case 11: {
party0 = gg.GetParty(talker);
i2 = gg.Party_GetCount(talker);
if (myself.IsNullParty(party0) == 1) {
myself.InstantTeleport(talker, telpos_2_x, telpos_2_y, telpos_2_z);

} else {
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, telpos_2_x, telpos_2_y, telpos_2_z);

}

}

}
break;

}
case 12: {
party0 = gg.GetParty(talker);
i2 = gg.Party_GetCount(talker);
if (myself.IsNullParty(party0) == 1) {
myself.InstantTeleport(talker, telpos_3_x, telpos_3_y, telpos_3_z);

} else {
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, telpos_3_x, telpos_3_y, telpos_3_z);

}

}

}
break;

}
case 13: {
party0 = gg.GetParty(talker);
i2 = gg.Party_GetCount(talker);
if (myself.IsNullParty(party0) == 1) {
myself.InstantTeleport(talker, telpos_4_x, telpos_4_y, telpos_4_z);

} else {
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, telpos_4_x, telpos_4_y, telpos_4_z);

}

}

}
break;

}
case 14: {
party0 = gg.GetParty(talker);
i2 = gg.Party_GetCount(talker);
if (myself.IsNullParty(party0) == 1) {
myself.InstantTeleport(talker, telpos_5_x, telpos_5_y, telpos_5_z);

} else {
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, telpos_5_x, telpos_5_y, telpos_5_z);

}

}

}
break;

}

}

} else if (myself.GetOneTimeQuestFlag(talker, 240) == 0 && reply == 1) {
myself.ShowPage(talker, "kintaijin002a.htm");

}

}
	}


}