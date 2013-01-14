package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_fav_8_sub extends default_maker {
	protected String my_main_maker_name = "gludio58_1926_800m1";
	protected int room_no = 0;
	protected int sinmaster_def = 1;

	protected void ON_START(HandlerParam def0) {
myself.i_ai0 = 0;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
def0 = myself.GetSpawnDefine(sinmaster_def);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam def0) {
def0 = myself.GetSpawnDefine(sinmaster_def);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
maker0 = gg.GetNpcMaker(my_main_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010019, 0, room_no);
if (myself.AtomicIncreaseTotal(def0, 1, 1) && def0.respawn_time != 0) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}

}

}
def0 = myself.GetSpawnDefine(sinmaster_def + 1);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
maker0 = gg.GetNpcMaker(my_main_maker_name);
if (gg.IsNull(maker0) == 0) {
if (died == 0) {
gg.SendMakerScriptEvent(maker0, 78010040, 1, room_no);

} else {
gg.SendMakerScriptEvent(maker0, 78010016, 1, room_no);

}

}

}

}
def0 = myself.GetSpawnDefine(sinmaster_def + 2);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
maker0 = gg.GetNpcMaker(my_main_maker_name);
if (gg.IsNull(maker0) == 0) {
if (died == 0) {
gg.SendMakerScriptEvent(maker0, 78010040, 2, room_no);

} else {
gg.SendMakerScriptEvent(maker0, 78010016, 2, room_no);

}

}

}

}
def0 = myself.GetSpawnDefine(sinmaster_def + 3);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
maker0 = gg.GetNpcMaker(my_main_maker_name);
if (gg.IsNull(maker0) == 0) {
if (died == 0) {
gg.SendMakerScriptEvent(maker0, 78010040, 3, room_no);

} else {
gg.SendMakerScriptEvent(maker0, 78010016, 3, room_no);

}

}

}

}
def0 = myself.GetSpawnDefine(sinmaster_def - 1);
if (gg.IsNull(def0) == 0) {
if (deleted_def == def0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (room_no == script_event_arg3) {
if (script_event_arg1 == 78010018) {
def0 = myself.GetSpawnDefine(sinmaster_def + script_event_arg2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);
myself.i_ai1 = 0;

}

}

} else if (script_event_arg1 == 78010003) {
def0 = myself.GetSpawnDefine(sinmaster_def + 4);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

} else if (script_event_arg1 == 78010039) {
myself.i_ai1 = 1;

}

}
	}


}