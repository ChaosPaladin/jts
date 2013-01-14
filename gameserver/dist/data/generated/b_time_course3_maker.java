package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class b_time_course3_maker extends inzone_maker {
	protected String maker_name = "innadril22_2422_038m2";
	protected int on_start_spawn = 0;

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 3, 0);

}
	}


}