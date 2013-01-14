package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_cratae_npc0 extends default_maker {
	protected String maker_name_70 = "etc10_1717_026m1";
	protected String maker_name_75 = "etc10_1715_026m1";
	protected String maker_name_80 = "etc10_1815_026m1";
	protected String cratae_lotto_70 = "etc10_1717_001m6";
	protected String cratae_lotto_75 = "etc10_1715_001m6";
	protected String cratae_lotto_80 = "etc10_1815_001m6";

	protected void ON_START() {
super;
myself.AddTimerEx(1300, 3000);
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1300) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717001, 0, 0);

} else {
myself.AddTimerEx(1300, 3000);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
switch (script_event_arg1) {
case 1717070: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717070, script_event_arg2, 0);

}
break;

}
case 1717075: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717075, script_event_arg2, 0);

}
break;

}
case 1717080: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717080, script_event_arg2, 0);

}
break;

}
case 2114002: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2114002, script_event_arg2, 0);

}
break;

}
case 1717006: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717006, script_event_arg2, 0);

}
break;

}

}
super;
	}


}