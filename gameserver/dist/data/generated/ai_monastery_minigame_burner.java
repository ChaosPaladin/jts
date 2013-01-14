package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_monastery_minigame_burner extends citizen {
	protected int POT_NUMBER = 0;
	protected int OFF_TIMER = 5567;
	protected int off_time = 2;

	protected void CREATED() {
myself.ChangeStatus(2);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 593690625) {
myself.ChangeNPCState(myself.sm, 1);
myself.ChangeStatus(2);
myself.AddUseSkillDesire(attacker, 337117185, 0, 0, 1000000);
myself.BroadcastScriptEvent(2114005, POT_NUMBER, 1000);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);
myself.ChangeStatus(3);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2114001) {
myself.ChangeStatus(2);
if (script_event_arg2 == POT_NUMBER) {
myself.ChangeNPCState(myself.sm, 1);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);

}

} else if (script_event_arg1 == 2114002) {
myself.ChangeStatus(2);
myself.ChangeNPCState(myself.sm, 1);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);

} else if (script_event_arg1 == 2114003) {
myself.ChangeNPCState(myself.sm, 1);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);
myself.ChangeStatus(2);

} else if (script_event_arg1 == 2114004) {
myself.ChangeStatus(2);
myself.ChangeNPCState(myself.sm, 1);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);

} else if (script_event_arg1 == 21140015) {
myself.ChangeNPCState(myself.sm, 1);
myself.AddTimerEx(OFF_TIMER, off_time * 1000);
myself.ChangeStatus(3);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == OFF_TIMER) {
myself.ChangeNPCState(myself.sm, 2);

}
	}


}