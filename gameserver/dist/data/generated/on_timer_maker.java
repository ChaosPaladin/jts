package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class on_timer_maker extends default_maker {
	protected int spawn_type = 0;
	protected int l2_time = 0;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
if (i0 == l2_time && i1 == 0) {
if (spawn_type == 0) {
super;

}

}
myself.AddTimerEx(3000, 1000);
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (timer_id == 3000) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
if (i0 == l2_time && i1 == 0) {
if (spawn_type == 0) {
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
myself.AddTimerEx(3000, 1000);

}
	}


}