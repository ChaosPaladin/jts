package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_castle_steel_a_basic extends wizard_basic {
	protected int Up_x = 0;
	protected int Up_y = 0;
	protected int Up_z = 0;
	protected int Up_Rate = 0;
	protected int Up_Raid_Enter = -1;
	protected int Down_x = 0;
	protected int Down_y = 0;
	protected int Down_z = 0;
	protected int Down_Rate = 0;
	protected int Down_Raid_Enter = -1;

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam c1) {
if (gg.Rand(100000) < Up_Rate) {
if (Up_Raid_Enter == -1) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Up_x, Up_y, Up_z, 4000, 0);

}

}

}

} else {
i0 = myself.GetGlobalMap(14);
if (i0 == -1) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Up_x, Up_y, Up_z, 4000, 0);

}

}

}

} else {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.db_value == 0) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Up_x, Up_y, Up_z, 4000, 0);
gg.SendScriptEventEx(c0, 192834489, 0, 0);

}

}

}

}

}

}

}

} else if (gg.Rand(100000) < Down_Rate) {
if (Down_Raid_Enter == -1) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Down_x, Down_y, Down_z, 4000, 0);

}

}

}

} else {
i0 = myself.GetGlobalMap(15);
if (i0 == -1) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Down_x, Down_y, Down_z, 4000, 0);

}

}

}

} else {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.db_value == 0) {
party0 = gg.GetParty(attacker);
if (gg.IsNull(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 4000) {
myself.TeleportParty(party0.id, Down_x, Down_y, Down_z, 4000, 0);
gg.SendScriptEventEx(c0, 192834489, 0, 0);

}

}

}

}

}

}

}

}
super;
	}


}