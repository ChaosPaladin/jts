package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_santa_escape extends default_npc {
	protected int START_DELAY = 15501;
	protected int PHASE_SAY = 15502;
	protected int PHASE_BUFF = 15503;
	protected int PHASE_INVISIBLE = 15504;
	protected int PHASE_DESPAWN = 15505;
	protected int skill_XMAS_SANTA_REWARD = 401080321;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.AddTimerEx(START_DELAY, 3 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == START_DELAY) {
myself.AddTimerEx(PHASE_SAY, 2 * 1000);

}
if (timer_id == PHASE_SAY) {
myself.Shout(gg.MakeFString(1800738, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 2, 120, 10000000);
myself.AddTimerEx(PHASE_BUFF, 5 * 1000);

}
if (timer_id == PHASE_BUFF) {
myself.AddUseSkillDesire(myself.sm, skill_XMAS_SANTA_REWARD, 1, 0, 100000000);
myself.AddTimerEx(PHASE_INVISIBLE, 5 * 1000);

}
if (timer_id == PHASE_INVISIBLE) {
myself.SetVisible(0);
if (myself.IsNullCreature(gg.GetCreatureFromIndex(myself.sm.param2)) == 0) {
gg.SendScriptEvent(gg.GetCreatureFromIndex(myself.sm.param1), 2008124, myself.sm.param2);

} else {
gg.SendScriptEvent(gg.GetCreatureFromIndex(myself.sm.param1), 2008124, 0);

}
myself.AddTimerEx(PHASE_DESPAWN, 3 * 1000);

}
if (timer_id == PHASE_DESPAWN) {
myself.Despawn();

}
	}


}