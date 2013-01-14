package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_labyrinth_d extends inzone_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0) {
switch (script_event_arg1) {
case 1624002: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1624002, 0, 0);

}
break;

}
case 1624003: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1624003, 0, 0);

}
break;

}
case 1624004: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1624004, 0, 0);

}
break;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam c0) {
	}


}