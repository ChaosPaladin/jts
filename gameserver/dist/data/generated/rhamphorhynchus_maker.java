package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rhamphorhynchus_maker extends velociraptor_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0, HandlerParam reply) {
if (reply == 0) {
if (myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker("rune20_mb2017_03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}


}