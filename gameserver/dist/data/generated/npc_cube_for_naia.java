package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_cube_for_naia extends instant_teleporter {
	protected int GM_BERETH = 11;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "cube_for_naia001.htm");
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i1 = gg.OwnItemCount(attacker, 57);
i2 = gg.OwnItemCount(attacker, 6651);
if (i1 == 1980 && i2 == 1980) {
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) != 0) {
return;

}
gg.SendScriptEventEx(c0, 1109227, 0, 0);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam i1, HandlerParam i2, HandlerParam c3, HandlerParam c4, HandlerParam c5, HandlerParam c6, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8) {
if (ask == -1006 && reply == 1) {
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
myself.ShowPage(talker, "cube_for_naia002.htm");
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) != 0) {
myself.ShowPage(talker, "cube_for_naia002.htm");
return;

}
i1 = myself.MPCC_GetMPCCId(talker);
i2 = myself.MPCC_GetMemberCount(i1);
if (c0.alive == 1) {
if (c0.db_value == 0) {
c1 = myself.MPCC_GetMaster(i1);
if (talker != c1) {
myself.ShowPage(talker, "cube_for_naia002a.htm");

} else {
i2 = myself.MPCC_GetMemberCount(i1);
myself.InstantTeleportMPCC(talker, 16342, 209557, -9352, 3000, 0, 300, 57, 0);

}

} else {
myself.ShowPage(talker, "cube_for_naia004.htm");

}

} else {
myself.ShowPage(talker, "cube_for_naia003.htm");

}

}
	}

	protected void MPCC_TELEPORTED(HandlerParam talker, HandlerParam reply, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam c2, HandlerParam c3, HandlerParam c4) {
i0 = myself.GetGlobalMap(GM_BERETH);
if (i0 == -1) {
myself.ShowPage(talker, "cube_for_naia002.htm");
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) != 0) {
myself.ShowPage(talker, "cube_for_naia002.htm");
return;

}
i1 = myself.MPCC_GetMPCCId(talker);
c1 = myself.MPCC_GetMaster(i1);
if (talker != c1) {
myself.ShowPage(talker, "cube_for_naia002a.htm");
return;

} else {
gg.SendScriptEvent(c0, 99999999, i1);
gg.SendScriptEvent(c0, 1109228, 0);
gg.Castle_GateOpenClose2("beres_door_003", 0);

}
	}


}