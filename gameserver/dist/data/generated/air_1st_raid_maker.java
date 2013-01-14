package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class air_1st_raid_maker extends default_air_maker {
	protected String NormalMakerName = "default_maker_name_1";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0) {
myself.AddTimerEx(1425001, 1000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1425001) {
i0 = gg.GetL2Time(0);
i1 = gg.GetL2Time(1);
i2 = 0;
if (i0 == 1 || i0 == 13 && i1 == 10) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
i2 = 1;

}
if (i0 == 7 || i0 == 19 && i1 == 10) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
i2 = 1;

}
if (i2 == 1) {
myself.AddTimerEx(1425001, 60 * 1000);

} else {
myself.AddTimerEx(1425001, 100);

}

}
	}


}