package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jackpot_event_maker extends default_maker {
	protected int RandRate = -1;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0) {
super;
myself.AddTimerEx(47188, 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 47188) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
if (i0 == 1 || i0 == 7 || i0 == 13 || i0 == 19 && i1 == 10) {
myself.i_ai0 = gg.Rand(RandRate);
myself.AddTimerEx(2222, 5000);
myself.AddTimerEx(47188, 60 * 1000);

} else {
myself.AddTimerEx(47188, 100);

}

}
if (timer_id == 2222) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(7777777, myself.i_ai0, 0);

}

}
	}


}