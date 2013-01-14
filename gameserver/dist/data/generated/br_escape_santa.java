package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_escape_santa extends default_npc {
	protected int START_DELAY = 4400;
	protected int PHASE_BUFFSKILL = 4401;
	protected int PHASE_GO = 4402;

	protected void CREATED() {
myself.AddTimerEx(START_DELAY, 2000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == START_DELAY) {
myself.Shout(gg.MakeFString(1900018, "", "", "", "", ""));
myself.AddTimerEx(PHASE_BUFFSKILL, 5000);

}
if (timer_id == PHASE_BUFFSKILL) {
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(101));
myself.BroadcastSystemMessageStr(myself.sm, 0, gg.MakeFString(1900027, c0.name, "", "", "", ""));
myself.PlayAnimation(1, 600);
myself.AddTimerEx(PHASE_GO, 5000);

}
if (timer_id == PHASE_GO) {
myself.PlayAnimation(3, 600);
myself.AddTimerEx(4403, 1000);

} else if (timer_id == 4403) {
myself.SetVisible(0);
myself.AddTimerEx(4404, 5000);

} else if (timer_id == 4404) {
myself.Despawn();

}
	}


}