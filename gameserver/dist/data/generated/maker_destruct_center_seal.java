package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_center_seal extends inzone_maker {
	protected String obelisk_maker = "rumwarsha1224_010m1";

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam maker0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, obelisk_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224004, 0, 0);

}
	}


}