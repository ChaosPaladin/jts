package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_sled extends default_npc {
	protected int PHASE_SAY = 14404;
	protected int PHASE_MOVE = 14405;
	protected int PHASE_DESPAWN = 14406;
	protected int PHASE_MUSIC = 14407;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.AddTimerEx(PHASE_SAY, 3 * 1000);
myself.AddTimerEx(PHASE_MUSIC, 2 * 1000);
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = myself.sm.param2;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param3);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == PHASE_MUSIC) {
myself.EffectMusic(myself.sm, 10000, "EV_01");

}
if (timer_id == PHASE_SAY) {
if (myself.IsNullCreature(myself.c_ai0)) {
if (debug_mode) {
myself.Say("막타 정보가 넘어오지 않았다. ");

}

} else {
myself.BroadcastSystemMessageStr(myself.sm, 8000, gg.MakeFString(1800747, myself.c_ai0.name, "", "", "", ""));

}
myself.AddTimerEx(PHASE_MOVE, 5 * 1000);

}
if (timer_id == PHASE_MOVE) {
myself.AddEffectActionDesire(myself.sm, 1, 18, 1000000);
myself.AddMoveToDesire(myself.i_ai0, myself.i_ai1, myself.start_z + 50, 100000000);
myself.AddTimerEx(PHASE_DESPAWN, 11 * 1000);

}
if (timer_id == PHASE_DESPAWN) {
myself.Despawn();

}
	}


}