package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tyrannosaurus_maker extends velociraptor_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0, HandlerParam reply) {
if (reply == 0) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1002, 3 * 60 * 1000);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1002) {
maker0 = gg.GetNpcMaker("rune20_mb2017_04m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11042, 0, 0);

}

}
super;
	}


}