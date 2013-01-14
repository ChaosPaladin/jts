package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class knight_room extends default_maker {
	protected String maker_name = "rune13_2315_06m2";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
myself.i_ai0 = myself.i_ai0 + 1;
if (gg.Rand(100) > 70 && 1000 <= myself.i_ai0 && myself.i_ai0 < 2000) {
maker0 = gg.GetNpcMaker(maker_name);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 0;

} else if (gg.Rand(100) < 80 && 2000 <= myself.i_ai0 && myself.i_ai0 < 3000) {
maker0 = gg.GetNpcMaker(maker_name);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 0;

} else if (gg.Rand(100) < 90 && 3000 <= myself.i_ai0) {
maker0 = gg.GetNpcMaker(maker_name);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 0;

}
super;
	}


}