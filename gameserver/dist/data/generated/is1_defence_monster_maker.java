package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class is1_defence_monster_maker extends inzone_maker {
	protected int room_number = 0;
	protected int on_start_spawn = 0;
	protected String controller_maker = "rumwarsha13_1424_1701";
	protected String ct2_box_maker = "";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 1001) {
if (room_number == 1) {
myself.AddTimerEx(1001, 1 * 1);

} else if (room_number == 2) {
myself.AddTimerEx(1001, 10 * 1000);

} else if (room_number == 3) {
myself.AddTimerEx(1001, 15 * 1000);

} else if (room_number == 4) {
myself.AddTimerEx(1001, 25 * 1000);

} else if (room_number == 5) {
myself.AddTimerEx(1001, 30 * 1000);

} else if (room_number == 3001) {
myself.AddTimerEx(1001, 35 * 1000);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
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

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0, HandlerParam i0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, controller_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 989809, room_number, 0);

}
	}

	protected void ON_NPC_DELETED(HandlerParam maker0, HandlerParam i0) {
	}


}