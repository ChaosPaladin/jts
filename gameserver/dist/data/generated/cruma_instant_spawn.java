package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_instant_spawn extends cruma_default_maker {
	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam c0) {
if (died == 0) {
myself.i_ai0 = 0;

} else {
myself.i_ai0 = 1;

}
if (myself.i_ai0 == 1 && reply == 0) {
maker0 = gg.GetNpcMaker(myself.name);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}


}