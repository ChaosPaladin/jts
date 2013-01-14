package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_destruct_ret_teleporter extends default_maker {
	protected String enter_maker_name = "destruct_ret_tel_enter_maker_name";
	protected String invasion_maker_name = "destruct_ret_tel_invasion_maker_name";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 1224012) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (script_event_arg1 == 1224014) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_npc, HandlerParam maker0, HandlerParam died) {
if (deleted_npc.sm.class_id == 1018702 && died == 1) {
myself.i_ai1 = myself.i_ai1 + 1;

}
if (myself.i_ai1 == 3) {
myself.i_ai1 = 0;
maker0 = gg.GetNpcMaker(enter_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}