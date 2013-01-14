package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_for_teleport_dungeon extends raid_boss_type1 {
	protected int CreviceOfDiminsion = 0;

	protected void CREATED(HandlerParam maker0) {
myself.AddTimerEx(2003, 60 * 1000 * 3);
maker0 = myself.GetMyMaker();
gg.SendMakerScriptEvent(maker0, 2, 0, 0);
myself.i_ai0 = myself.GetCurrentTick();
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantRandomTeleportInMyTerritory();
return;

}
myself.i_ai0 = myself.GetCurrentTick();
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 2003) {
maker0 = myself.GetMyMaker();
if (myself.GetCurrentTick() - myself.i_ai0 > 60 * 3) {
gg.SendMakerScriptEvent(maker0, 3, 0, 0);

} else {
gg.SendMakerScriptEvent(maker0, 2, 0, 0);

}
myself.AddTimerEx(2003, 60000);

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = myself.GetMyMaker();
gg.SendMakerScriptEvent(maker0, 3, 0, 0);
	}


}