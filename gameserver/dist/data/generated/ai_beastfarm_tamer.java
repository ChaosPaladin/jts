package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_tamer extends citizen {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 21150002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
switch (script_event_arg3) {
case 11: {
i0 = 1018869;
i1 = 1;
break;

}
case 12: {
i0 = 1018869;
i1 = 2;
break;

}
case 21: {
i0 = 1018870;
i1 = 1;
break;

}
case 22: {
i0 = 1018870;
i1 = 2;
break;

}
case 31: {
i0 = 1018871;
i1 = 1;
break;

}
case 32: {
i0 = 1018871;
i1 = 2;
break;

}
case 41: {
i0 = 1018872;
i1 = 1;
break;

}
case 42: {
i0 = 1018872;
i1 = 2;
break;

}

}
if (myself.IsNullCreature(c0) == 0) {
myself.CreateOnePrivateEx(i0, "ai_beastfarm_tamed", 0, 0, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), myself.GetDirection(c0) * 182, gg.GetIndexFromCreature(c0), i1, 0);

}

}
	}


}