package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_house_pathway_find_maker extends dark_house_stonehenge_maker {
	protected int maker_index = 0;
	protected int IncreaseTotal = 0;
	protected String DoorName = "island_of_oracle_e";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam def0) {
myself.i_ai0 = 0;
super;
	}

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (reply == 1) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);
myself.AddTimerEx(4001, 3000);

}

}

}
myself.AddTimerEx(4001, 3000);

} else if (reply == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
super;
if (timer_id == 4001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12533, maker_index, 0);

}

}

}
	}


}