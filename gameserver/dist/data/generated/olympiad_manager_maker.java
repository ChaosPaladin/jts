package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class olympiad_manager_maker extends default_maker {
	protected int maker_event_id = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.RegisterOlympiadFieldEventEx();
	}

	protected void ON_OLYMPIAD_FIELD_STEP_CHANGED_EVENT(HandlerParam event_id, HandlerParam state, HandlerParam maker0, HandlerParam def0) {
if (maker_event_id == event_id) {
if (state == 0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}


}