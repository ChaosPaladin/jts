package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class b_time_renew2_maker extends inzone_maker {
	protected int on_start_spawn = 0;
	protected String maker_name = "innadril22_2422_038m2";

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
if (script_event_arg1 == 12544) {
myself.i_ai0 = script_event_arg2 - 1;

} else if (script_event_arg1 == 1001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
if (myself.i_ai0 != i0) {
def0.Spawn2(i1, script_event_arg2, 0);
myself.AddTimerEx(2001, 3000);

}

}

}

}

}
i2 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12545, myself.i_ai0, 0);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 2001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12543, 2, 0);

}

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
myself.i_ai0 = 0;
	}


}