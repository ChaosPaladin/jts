package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_frintessa_control extends inzone_maker {
	protected int inzone_type_param = 136;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.i_ai9 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10001011) {
if (myself.i_ai9 == 1) {
gg.Announce("프린테사 ID 받음");

}
myself.i_ai5 = script_event_arg2;

} else if (script_event_arg1 == 10001012) {
if (myself.i_ai9 == 1) {
gg.Announce("스칼렛 반 할리샤 초기형 ID 받음");

}
myself.i_ai6 = script_event_arg2;

} else if (script_event_arg1 == 10001013) {
if (myself.i_ai9 == 1) {
gg.Announce("스칼렛 반 할리샤 최종형 ID 받음");

}
myself.i_ai7 = script_event_arg2;

} else if (script_event_arg1 == 10001021) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (gg.IsNull(c0) == 0) {
if (myself.i_ai9 == 1) {
gg.Announce("프린테사 ID 줌");

}
gg.SendScriptEvent(c0, 10001031, myself.i_ai5);

}

} else if (script_event_arg1 == 10001022) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (gg.IsNull(c0) == 0) {
if (myself.i_ai9 == 1) {
gg.Announce("스칼렛 반 할리샤 ID 줌");

}
gg.SendScriptEvent(c0, 10001032, myself.i_ai6);

}

} else if (script_event_arg1 == 10001023) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (gg.IsNull(c0) == 0) {
if (myself.i_ai9 == 1) {
gg.Announce("스칼렛 반 할리샤 최종형 ID 줌");

}
gg.SendScriptEvent(c0, 10001033, myself.i_ai7);

}

} else if (script_event_arg1 == 2) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
if (myself.i_ai9 == 1) {
gg.Announce("전투준비");

}
def0 = myself.GetSpawnDefine(i0);
def0.SendScriptEvent(script_event_arg1, script_event_arg2, 0);

}

}
super;
	}


}