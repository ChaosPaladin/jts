package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_zaykhan extends citizen {
	protected void CREATED() {
myself.i_quest9 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20091023) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.i_quest9) {
myself.Say("아 옙!");

}
myself.ChangeDir(myself.sm, c0.id, 0);

}
	}


}