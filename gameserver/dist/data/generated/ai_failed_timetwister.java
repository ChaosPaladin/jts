package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_failed_timetwister extends warrior_basic {
	protected String my_maker_name = "gludio58_1926_last_standm1";

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 78010023) {
myself.i_ai0 = 1;

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0 && myself.i_ai0 == 0) {
if (gg.Rand(1000) >= 700) {
myself.Say(gg.MakeFString(1000004, "", "", "", "", "") + "!");
gg.SendMakerScriptEvent(maker0, 78010030, 0, 0);

} else {
myself.Say(gg.MakeFString(1800113, "", "", "", "", ""));
gg.SendMakerScriptEvent(maker0, 78010002, 0, 0);

}

}
super;
	}


}