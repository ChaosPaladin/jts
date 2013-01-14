package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_controller extends citizen {
	protected int inzone_id1 = -1;
	protected int inzone_id2 = -1;
	protected int inzone_id3 = -1;
	protected int inzone_id4 = -1;
	protected int enter_type = 1;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0) {
if (ask == -588) {
if (reply == 9981) {
myself.InstantZone_Enter(talker, inzone_id1, enter_type);

} else if (reply == 9982) {
myself.InstantZone_Enter(talker, inzone_id2, enter_type);

} else if (reply == 9983) {
myself.InstantZone_Enter(talker, inzone_id3, enter_type);

} else if (reply == 9984) {
myself.InstantZone_Enter(talker, inzone_id4, enter_type);

} else if (reply == -1000) {
myself.InstantZone_Leave(talker);

} else if (reply == -1001) {
myself.InstantZone_Finish(5);

}

}
super;
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {

} else if (reply == 1) {

}
	}


}