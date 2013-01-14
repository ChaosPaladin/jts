package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dream_boundary_manager_maker extends inzone_maker {
	protected int inzone_type_param = 0;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;
	protected String battle_maker = "";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 9274147) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

} else if (script_event_arg1 == 9274148) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, 0, 0);

}

}
super;
	}


}