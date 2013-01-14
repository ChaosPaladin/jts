package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class velociraptor_maker extends default_maker {
	protected int TM_RESET_TIMER = 78001;
	protected int TIME_RESET_TIMER = 3600;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 1001: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, script_event_arg2, 0);
myself.AddTimerEx(1001, 5000);

}

}

}

}
break;

}
case 11052: {
myself.i_ai0 = 1;
break;

}
case 11053: {
myself.i_ai0 = 0;
break;

}

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 1001) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(11049, 0, 0);

}

}
myself.AddTimerEx(TM_RESET_TIMER, TIME_RESET_TIMER * 1000);

} else if (timer_id == TM_RESET_TIMER && myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker("rune20_mb2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11050, 0, 0);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0, HandlerParam reply) {
maker0 = gg.GetNpcMaker("rune20_mb2017_02m1");
if (gg.IsNull(maker0) == 0) {
if (reply == 0) {
if (myself.i_ai0 == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}


}