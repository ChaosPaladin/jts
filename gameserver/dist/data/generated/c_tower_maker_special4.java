package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_maker_special4 extends abstract_maker {
	protected void ON_START() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam def0) {
switch (script_event_arg1) {
case 88008: {
myself.i_ai0 = script_event_arg2;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
myself.i_ai1 = myself.i_ai1 + 1;

}
break;

}
case 88004: {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_ai1 == myself.i_ai2) {
c0 = gg.GetCreatureFromIndex(myself.i_ai0);
if (gg.IsNull(c0) == 0 && myself.i_ai4 == 0) {
gg.SendScriptEvent(c0, 88009, 0);

}

}
break;

}
case 88005: {
i1 = script_event_arg2;
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 5, 0);

}

}
break;

}
case 1000: {
myself.i_ai4 = 1;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}

}
	}


}