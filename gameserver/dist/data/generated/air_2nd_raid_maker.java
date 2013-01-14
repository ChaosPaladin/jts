package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class air_2nd_raid_maker extends default_air_maker {
	protected String NormalMakerName = "default_maker_name_2";
	protected int IM_fieldCycle_ID = 3;

	protected void ON_START() {
myself.AddTimerEx(2000, 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 2000) {
i0 = gg.GetStep_FieldCycle(IM_fieldCycle_ID);
i1 = 0;
if (i0 == 3 || i0 == 4 || i0 == 5 && myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai0 = 1;
i1 = 1;

}
if (i0 != 3 && i0 != 4 && i0 != 5) {
if (myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
myself.i_ai0 = 0;

}

}
if (i1 == 1) {
myself.AddTimerEx(2000, 30 * 1000);

} else {
myself.AddTimerEx(2000, 1000);

}

}
	}


}