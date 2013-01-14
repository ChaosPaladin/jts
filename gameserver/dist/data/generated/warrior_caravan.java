package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_caravan extends warrior_basic {
	protected int drop_map = 1;

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0 && c0.is_pc == 1) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 0) {
i0 = gg.Rand(gg.Party_GetCount(c0));
c1 = gg.Party_GetCreature(c0, i0);
if (gg.Rand(10000) < drop_map) {
myself.GiveItem1(c1, 9994, 1);

}

} else if (gg.Rand(10000) < drop_map) {
myself.GiveItem1(c0, 9994, 1);

}

}
super;
	}


}