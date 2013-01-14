package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_annihilation_pot extends default_npc {
	protected int type = 0;
	protected int POT_TIMER = 1111;

	protected void CREATED() {
myself.AddTimerEx(POT_TIMER, 5 * 1000);
myself.ChangeStatus(0);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == POT_TIMER) {
if (type == 0) {
i0 = gg.GetDBSavingMap(34);

} else if (type == 1) {
i0 = gg.GetDBSavingMap(35);

} else if (type == 2) {
i0 = gg.GetDBSavingMap(36);

}
if (i0 != -1) {
myself.ChangeNPCState(myself.sm, i0);

}
myself.AddTimerEx(POT_TIMER, 5 * 1000);

}
	}


}