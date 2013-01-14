package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_ag_type3_anais extends raid_boss_ag_type3 {
	protected void NO_DESIRE() {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, 112800, -76160, 10);
myself.AddTimerEx(3001, 1000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, 112800, -76160, 10);
myself.AddTimerEx(3001, 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
myself.RemoveAllHateInfoIF(0, 0);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (myself.InMyTerritory(private) == 0 && myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, 112800, -76160, 10);
myself.AddTimerEx(3001, 1000);

}
if (myself.InMyTerritory(private) == 0) {
return;

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, 112800, -76160, 10);
myself.AddTimerEx(3001, 1000);

}
	}


}