package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class level_switch extends default_maker {
	protected int on_start_spawn = 0;
	protected int spawn_time = 1000;

	protected void ON_ALL_NPC_DELETED() {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddTimerEx(spawn_time, 60 * 60 * 1000);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
maker0 = gg.GetNpcMaker(myself.name);
if (timer_id == spawn_time && gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 0;

}
	}


}