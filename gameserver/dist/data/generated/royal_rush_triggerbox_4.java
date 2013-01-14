package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_triggerbox_4 extends royal_rush_triggerbox_base {
	protected String room_event_1 = "1rd_type1_d";
	protected String room_event_2 = "1rd_type2_d";
	protected String room_event_3 = "1rd_type3_d";

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam maker0) {
i0 = gg.GetDateTime(0, 4);
if (i0 > 49 && i0 < 60) {
myself.Say(gg.MakeFString(1010552, "", "", "", "", ""));
return;

}
if (myself.i_ai0 == 1) {
return;

} else {
myself.i_ai0 = 1;

}
i0 = gg.Rand(2);
switch (i0) {
case 0: {
maker0 = gg.GetNpcMaker(room_event_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 1: {
maker0 = gg.GetNpcMaker(room_event_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 2: {
maker0 = gg.GetNpcMaker(room_event_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}

}
super;
	}


}