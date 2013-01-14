package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_basic_first extends warrior_basic {
	protected void CREATED(HandlerParam maker0) {
if (myself.sm.class_id == 1022377) {
maker0 = gg.GetNpcMaker("gludio58_1926_trap01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam i1) {
i0 = gg.FloatToInt(attacker.z);
i1 = gg.FloatToInt(myself.sm.z);
if (i0 - i1 > 150 || i1 - i0 > 150) {
myself.RemoveAllDesire();
myself.InstantTeleport(attacker, gg.FloatToInt(myself.sm.x) + 50, gg.FloatToInt(myself.sm.y) - 50, gg.FloatToInt(myself.sm.z));

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
if (myself.sm.class_id == 1022377) {
maker0 = gg.GetNpcMaker("gludio58_1926_trap01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
super;
	}


}