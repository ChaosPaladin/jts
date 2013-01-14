package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_fighter_night_dorian extends raid_fighter {
	protected void CREATED() {
myself.AddTimerEx(2001, 10000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.LookNeighbor(400);
myself.AddTimerEx(2001, 10000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (gg.HaveMemo(creature, 24) && gg.OwnItemCount(creature, 7153) > 0) {
myself.DeleteItem1(creature, 7153, 1);
myself.GiveItem1(creature, 7154, 1);
myself.Say(gg.MakeFString(2450, "", "", "", "", ""));
myself.SetFlagJournal(creature, 24, 4);

}
super;
	}


}