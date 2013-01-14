package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_trap_spawner extends immo_basic_maker {
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 100;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010059 && myself.enabled == 1) {
gg.SendMakerScriptEvent(myself, 78010072, 0, 0);

} else if (script_event_arg1 == 78010072 && myself.enabled == 1) {
i0 = gg.Rand(myself.maximum_npc) + 1;
for (i1 = 1; i1 < i0; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(gg.Rand(3));
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}

}

} else if (script_event_arg1 == 1000) {
myself.enabled = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0, HandlerParam reply) {
if (myself.enabled == 1) {

}
	}


}