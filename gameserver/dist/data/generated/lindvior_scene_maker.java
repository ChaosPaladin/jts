package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lindvior_scene_maker extends default_maker {
	protected int babble_mode = 0;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010057) {
switch (script_event_arg2) {
case 1: {
def0 = myself.GetSpawnDefine(0);
break;

}
case 2: {
def0 = myself.GetSpawnDefine(1);
break;

}
case 3: {
def0 = myself.GetSpawnDefine(2);
break;

}

}
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(script_event_arg1, script_event_arg2, script_event_arg3);

} else if (babble_mode == 1) {
gg.Announce("def 설정 이상!");

}

}
super;
	}


}