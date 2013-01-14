package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class on_day_night_spawn extends default_maker {
	protected int IsNight = 0;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0) {
i0 = gg.GetL2Time(2);
if (i0) {
if (IsNight == 1) {
myself.i_ai0 = 1;
super;

} else {
myself.i_ai0 = 0;

}

} else if (IsNight == 0) {
myself.i_ai0 = 1;
super;

} else {
myself.i_ai0 = 0;

}
myself.AddTimerEx(3000, 1000);
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam i0) {
i0 = gg.GetL2Time(2);
if (i0 == 1) {
if (myself.i_ai0 == 0) {
if (IsNight == 0) {
created_npc.Despawn();

}

}

} else if (myself.i_ai0 == 0) {
if (IsNight == 1) {
created_npc.Despawn();

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
i0 = gg.GetL2Time(2);
if (i0 == 1) {
if (IsNight == 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}

} else if (IsNight == 0) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (timer_id == 3000) {
i0 = gg.GetL2Time(2);
if (i0 == 1) {
if (myself.i_ai0 == 0) {
if (IsNight == 1) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 1;

}

}

} else if (IsNight == 0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai0 = 0;

}

} else if (myself.i_ai0 == 0) {
if (IsNight == 0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai0 = 1;

}

}

} else if (IsNight == 1) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai0 = 0;

}
myself.AddTimerEx(3000, 1000);

}
	}


}