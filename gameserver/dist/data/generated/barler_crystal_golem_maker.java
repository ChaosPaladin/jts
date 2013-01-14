package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_crystal_golem_maker extends inzone_maker {
	protected void ON_START(HandlerParam i0, HandlerParam def0, HandlerParam i1) {
i1 = gg.Rand(7);
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(13002, i0, 0);

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 3001) {
i1 = gg.Rand(7);
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(13002, i0, 0);

}

}
	}


}