package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class adventure_guild_master extends citizen {
	protected void CREATED() {
myself.AddTimerEx(1672, 60 * 60 * 1000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -303) {
if (reply == 544 || reply == 545) {
myself.ShowMultisell(reply, talker);

} else {
myself.ShowPage(talker, fnHi);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1672) {
myself.Despawn();

}
	}


}