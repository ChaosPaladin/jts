package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rainbow_maker extends default_maker {
	protected int CastleID = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.RegisterAgitSiegeEventEx(CastleID);
def0 = myself.GetSpawnDefine(0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
	}

	protected void ON_END_SIEGE_EVENT(HandlerParam def0, HandlerParam maker0, HandlerParam i0) {
for (i0 = 1; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(def0.total, 0, 0);

}

}
	}


}