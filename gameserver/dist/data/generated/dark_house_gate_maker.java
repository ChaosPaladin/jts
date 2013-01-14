package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_house_gate_maker extends inzone_maker {
	protected String DoorName = "island_of_oracle_a";
	protected String a_doorname = "island_of_oracle_b";
	protected String b_doorname = "island_of_oracle_c";

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (reply == 0) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.GetInZoneID());

}
	}


}