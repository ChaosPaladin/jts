package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_inzone_maker extends inzone_maker {
	protected String maker_name = "fortress_inzone_maker_default";
	protected int timer = 0;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0, HandlerParam i1) {
myself.enabled = reply;
if (reply == 1 && timer > 0) {
myself.AddTimerEx(1991, timer * 1000);
return;

}
if (reply == 1) {
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam i2) {
if (died == 0) {
return;

}
if (myself.enabled) {
if (gg.IsSameString(maker_name, "fortress_inzone_maker_default") == 1) {
return;

}
i2 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i2, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1003, 0, 0);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (myself.enabled == 0) {
return;

}
switch (script_event_arg1) {
case 1003: {
if (myself.enabled == 1 && timer > 0) {
myself.AddTimerEx(1991, timer * 1000);
return;

}
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}
break;

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1991) {
i0 = gg.Rand(myself.def_count);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}
	}


}