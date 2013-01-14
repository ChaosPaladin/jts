package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_ret_npc extends default_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
super;
if (script_event_arg1 == 1224012) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (script_event_arg1 == 1224013 || script_event_arg1 == 1224014) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}
myself.AddTimerEx(5618, 3000);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 5618) {
myself.i_ai0 = 0;
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
	}

	protected void ON_NPC_DELETED() {
	}


}