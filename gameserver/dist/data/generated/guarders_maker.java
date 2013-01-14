package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guarders_maker extends inzone_maker {
	protected String control_maker = "default_control_maker_name";
	protected int script_event_enable = 1;

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0, HandlerParam i0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, control_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
super;
	}


}