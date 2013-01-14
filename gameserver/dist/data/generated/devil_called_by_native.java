package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class devil_called_by_native extends warrior_basic {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 3) {
myself.Despawn();

}
if (script_event_arg1 == 0) {
myself.Despawn();

}
	}


}