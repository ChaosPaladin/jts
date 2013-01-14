package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_castle_pailaka_invader extends inzone_maker {
	protected int my_spawn_time = -1;
	protected String my_private_maker = "c_pailaka_private_maker";
	protected String maker_name_invader1 = "maker_name_invader1";
	protected String maker_name_invader2 = "maker_name_invader2";
	protected String maker_name_invader3 = "maker_name_invader3";
	protected String maker_name_npc = "maker_name_npc";

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = 1;
if (reply == 1) {
myself.AddTimerEx(3130, 2 * 60 * 1000);
myself.i_ai0 = 1;
myself.i_ai1 = 0;
myself.i_ai2 = 0;

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
if (script_event_arg1 == 2117003 || script_event_arg1 == 2117007) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, my_private_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai1 = 1;

}
if (script_event_arg1 == 2117008) {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_ai2 == 4) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117009, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117009, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117009, 0, 0);

}
if (gg.IsSameString(maker_name_npc, "maker_name_npc") == 0) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_npc);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117009, 0, 0);

}

}

}

}
if (script_event_arg1 == 2117009) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, my_private_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 3130) {
if (myself.i_ai1 == 0) {
if (myself.i_ai0 == my_spawn_time) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.AddTimerEx(3131, 3 * 1000);

}

} else {
myself.i_ai0 = myself.i_ai0 + 1;
myself.AddTimerEx(3130, 8 * 60 * 1000);

}

}

}
if (timer_id == 3131) {
if (myself.i_ai1 == 0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, my_private_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam died) {
if (died == 1) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name_invader3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2117008, 0, 0);

}

}
	}


}