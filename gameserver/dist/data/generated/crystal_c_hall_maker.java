package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crystal_c_hall_maker extends inzone_door_open_maker {
	protected String open_door_name1 = "crystal_c_hall_open_door_name1_default";
	protected String open_door_name2 = "crystal_c_hall_open_door_name2_default";
	protected String c_hall_first_door_name = "cyratal_cave_c_6";
	protected String treasure_door_name = "cyratal_cave_c_13";
	protected int room_index = 0;
	protected String alarm_maker_name = "innadril22_2422_049m1";

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 2001) {
gg.Castle_GateOpenCloseEx(open_door_name1, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(open_door_name2, 0, myself.GetInZoneID());
myself.AddTimerEx(2002, 20 * 1000);

} else if (timer_id == 2002) {
gg.Castle_GateOpenCloseEx(open_door_name1, 1, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(open_door_name2, 1, myself.GetInZoneID());

} else if (timer_id == 2003) {
i0 = gg.Rand(11);
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12568, 0, 0);

}

} else if (timer_id == 2004) {
gg.Castle_GateOpenCloseEx(c_hall_first_door_name, 1, myself.GetInZoneID());

}
	}

	protected void ON_DOOR_EVENT(HandlerParam enabled, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0) {
if (enabled) {
if (myself.enabled) {
return;

}
myself.enabled = 1;
if (room_index == 1) {
i2 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i2, alarm_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
gg.SendMakerScriptEvent(maker0, 12566, room_index, 0);

}
myself.AddTimerEx(2004, 20 * 1000);

}
if (room_index == 8) {
myself.AddTimerEx(2003, 3000);

}
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}

}
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
myself.AddTimerEx(2001, 2000);
if (room_index < 8) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, alarm_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12566, room_index + 1, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, alarm_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
if (room_index == 7) {
gg.Castle_GateOpenCloseEx(c_hall_first_door_name, 0, myself.GetInZoneID());
gg.Castle_GateOpenCloseEx(treasure_door_name, 0, myself.GetInZoneID());

}

}
	}


}