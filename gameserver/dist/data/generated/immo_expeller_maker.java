package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_expeller_maker extends immo_basic_maker {
	protected String ech_atk_seq0_maker = "rumwarsha15_1424_echmusm1";

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (reply == 1) {
if (babble_mode == 1) {
gg.Announce("익스펠러 스폰");

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010069 || script_event_arg1 == 78010066) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

}

}
	}


}