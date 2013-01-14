package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class air_3rd_raid_maker extends default_air_maker {
	protected String NormalMakerName = "defalut_maker_name_3";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
myself.AddTimerEx(1424001, 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1424001) {
i0 = gg.GetL2Time(2);
i2 = 0;
if (i0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
i2 = 1;
myself.i_ai0 = 1;

} else if (myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
i2 = 1;
myself.i_ai0 = 0;

}
myself.AddTimerEx(1424001, 10000);

}
	}


}