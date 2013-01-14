package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class named_a1_caller_maker extends inzone_maker {
	protected String maker_name1 = "innadril22_2422_017m1";
	protected String maker_name2 = "innadril22_2422_017m2";
	protected String maker_name3 = "innadril22_2422_018m1";
	protected String maker_name4 = "innadril22_2422_018m2";
	protected String maker_name5 = "innadril22_2422_019m1";
	protected String maker_name6 = "innadril22_2422_019m2";
	protected String secretdoor_maker_name1 = "innadril22_2422_844m1";
	protected String secretdoor_maker_name2 = "innadril22_2422_845m1";
	protected String secretdoor_maker_name3 = "innadril22_2422_846m1";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 12546) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (script_event_arg1 == 12547) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (script_event_arg1 == 12548) {
myself.i_ai0 = myself.i_ai0 + 1;

}
if (myself.i_ai0 == 3) {
i2 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, secretdoor_maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12550, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, secretdoor_maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12550, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i2, secretdoor_maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12550, 0, 0);

}

}
super;
	}


}