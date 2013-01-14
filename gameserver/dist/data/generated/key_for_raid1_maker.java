package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class key_for_raid1_maker extends inzone_maker {
	protected String maker_name1 = "innadril22_2422_017m2";
	protected String maker_name2 = "innadril22_2422_018m2";
	protected String maker_name3 = "innadril22_2422_019m2";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 12549) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddTimerEx(3000, 1000);

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 3000) {
if (myself.i_ai0 == 2) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12551, 0, 0);

}

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
i2 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i2, myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12549, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12549, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12549, 0, 0);

}
	}


}