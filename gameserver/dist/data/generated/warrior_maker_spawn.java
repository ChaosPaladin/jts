package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_maker_spawn extends warrior_basic {
	protected String maker_name = "warrior_maker_spawn_maker_default";

	protected void CREATED() {
myself.i_ai3 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam maker0, HandlerParam i0) {
if (gg.IsSameString(maker_name, "warrior_maker_spawn_maker_default") == 0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0 && myself.i_ai3 == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai3 = 1;

}

}
super;
	}


}