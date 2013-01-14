package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gcbt_viewer extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2222) {
switch (reply) {
case 1: {
if (myself.IsNullCreature(myself.GetSummon(talker)) == 0) {
myself.ShowSystemMessage(talker, 782);

} else {
myself.ObserveEventMatch(talker, 8);

}
break;

}

}

}
	}


}