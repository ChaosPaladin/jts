package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_waterdragon_maker extends default_maker {
	protected int areadata_index = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
if (on_start_spawn == 0) {
return;

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
myself.i_ai0 = i0;
def0.Spawn2(def0.total, 0, 0);
myself.AddTimerEx(4001, 20000);

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
def0.SendScriptEvent(12564, areadata_index, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (deleted_def.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, 0);
myself.AddTimerEx(4001, 320 * 1000);

}

}
	}


}