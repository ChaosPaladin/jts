package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crystalcave_zone_controller extends zone_controller {
	protected int zone_type = 0;
	protected int enter_type = 0;
	protected String fnHi = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam s0, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0) {
if (ask == -1005) {
if (reply == 1) {
if (zone_type > -1 && enter_type > -1) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

}

} else if (reply == 0) {
myself.InstantZone_Leave(talker);

} else if (reply == -1) {
myself.InstantZone_Finish(5);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam state, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0) {
if (state == 0) {

} else if (state == 1) {

}
if (reply == 0) {

} else if (reply == 1) {
if (state == 0) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
i2 = gg.OwnItemCount(c0, 9698);
i3 = gg.OwnItemCount(c0, 9699);
i4 = gg.OwnItemCount(c0, 10015);
i5 = gg.OwnItemCount(c0, 10016);
if (i2 >= 1) {
myself.DeleteItem1(c0, 9698, i2);

}
if (i3 >= 1) {
myself.DeleteItem1(c0, 9699, i3);

}
if (i4 >= 1) {
myself.DeleteItem1(c0, 10015, i4);

}
if (i5 >= 1) {
myself.DeleteItem1(c0, 10016, i5);

}

}

}

}

}

}
	}


}