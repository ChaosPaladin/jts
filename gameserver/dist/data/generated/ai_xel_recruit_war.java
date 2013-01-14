package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_recruit_war extends warrior_basic {
	protected int trainer_id = 0;
	protected int direction = 0;

	protected void NO_DESIRE(HandlerParam i0) {
if (myself.i_ai5 == 1) {
return;

}
if (gg.FloatToInt(myself.sm.x) == myself.start_x && myself.start_y == gg.FloatToInt(myself.sm.y)) {
myself.ChangeDir(myself.sm, 0, direction);

} else if (myself.i_ai6 == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai6 == 1) {
return;

}
myself.BroadcastScriptEvent(BroadcastScriptEvent + trainer_id, gg.GetIndexFromCreature(attacker), 1000);
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (myself.i_ai6 == 1) {
return;

}
super;
	}

	protected void MY_DYING(HandlerParam last_attacker) {
myself.i_ai5 = 1;
super;
	}


}