package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class musicbox_npc extends default_npc {
	protected int spawnLocation = 1;

	protected void CREATED(HandlerParam i0) {
if (spawnLocation == 1 || spawnLocation == 3) {
i0 = gg.GetL2Time(2);
if (i0) {
myself.AddTimerEx(3001, 1000);

} else {
myself.AddTimerEx(2001, 1000);

}

}
myself.i_ai0 = 0;
myself.AddTimerEx(1000, 15 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.BroadcastScriptEvent(10, myself.i_ai0, 1000);
if (myself.i_ai0 > 350 + 60 * spawnLocation && spawnLocation != 0) {
myself.Despawn();
return;

}
myself.AddTimerEx(1000, 1 * 1000);

}
if (timer_id == 2001) {
myself.EffectMusic(myself.sm, 3000, "TP01_F");
myself.AddTimerEx(2002, 131000);

}
if (timer_id == 2002) {
myself.EffectMusic(myself.sm, 3000, "TP02_F");
myself.AddTimerEx(2003, 101000);

}
if (timer_id == 2003) {
myself.EffectMusic(myself.sm, 3000, "TP03_F");
myself.AddTimerEx(2001, 114000);

}
if (timer_id == 3001) {
myself.EffectMusic(myself.sm, 3000, "TP04_F");
myself.AddTimerEx(3001, 105000);

}
	}


}