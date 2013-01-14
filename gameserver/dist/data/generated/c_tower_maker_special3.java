package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_maker_special3 extends abstract_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam def0, HandlerParam i0) {
switch (script_event_arg1) {
case 88008: {
myself.i_ai0 = script_event_arg2;
myself.i_ai1 = 0;
myself.i_ai4 = 0;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
break;

}
case 88002: {
if (myself.i_ai1 == 0) {
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
myself.i_ai1 = 1;
break;

} else if (myself.i_ai1 == 1) {
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
break;

}

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

	protected void ON_ALL_NPC_DELETED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai0);
if (gg.IsNull(c0) == 0 && myself.i_ai4 == 0) {
gg.SendScriptEvent(c0, 88009, 0);

}
	}


}