package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_default_air_monster extends default_air_monster {
	protected int IsAggressive = 0;

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
if (creature.is_pc && myself.i_ai0 == Death) {
myself.ShowSystemMessageStr(creature, gg.MakeFString(1800294, myself.c_ai2.name, "", "", "", ""));

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = 0;
myself.c_ai2 = last_attacker;
super;
if (i2 == 1) {
myself.LookNeighbor(1000);
myself.i_ai0 = Death;

}
	}


}