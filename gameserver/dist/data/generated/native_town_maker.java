package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class native_town_maker extends fieldcycle_maker {
	protected int on_start_spawn = 0;

	protected void ON_START() {
myself.i_ai1 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0) {
if (script_event_arg1 == 1298384) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
myself.i_ai1 = 1;
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (script_event_arg1 == 1298385) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
myself.i_ai1 = 0;
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam i3, HandlerParam i4) {
if (deleted_def.respawn_time != 0) {
i3 = gg.GetStep_FieldCycle(FieldCycle);
if (i3 >= Threshold_Min && i3 <= Threshold_Max && myself.i_ai1 == 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

}
	}


}