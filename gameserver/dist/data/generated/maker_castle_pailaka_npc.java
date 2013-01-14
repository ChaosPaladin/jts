package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_castle_pailaka_npc extends inzone_maker {
	protected String maker_name_invader1 = "c_pailaka_invader1";
	protected String maker_name_invader2 = "c_pailaka_invader2";
	protected String maker_name_invader3 = "c_pailaka_invader3";

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (reply == 1) {
myself.AddTimerEx(3029, 1);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.AddTimerEx(3030, 2 * 60 * 1000);

} else if (reply == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
super;
if (script_event_arg1 == 2117009) {
if (myself.i_ai4 == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2117009, 0, 0);

}

}
myself.i_ai4 = 1;

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 3030) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (timer_id == 3029) {
if (myself.i_ai0 == 26 && myself.i_ai1 == 0) {
i0 = myself.GetInZoneID();
if (myself.i_ai4 == 0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2117007, 0, 0);

}

}
myself.i_ai4 = 1;

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117007, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117007, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117007, 0, 0);

}

} else if (myself.i_ai0 != 26 && myself.i_ai1 == 0) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddTimerEx(3029, 1 * 60 * 1000);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam died, HandlerParam def0) {
if (died == 1 && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117003, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117003, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117003, 0, 0);

}

}
	}


}