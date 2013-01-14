package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_deco_ksoldier_follow extends citizen {
	protected int OHS_Weapon1 = 13524;
	protected int OHS_Weapon2 = 14606;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1525010) {
myself.AddTimerEx(1525003, 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1525003) {
myself.EquipItem(OHS_Weapon2);
myself.AddTimerEx(1525004, 2000);

}
if (timer_id == 1525004) {
myself.AddEffectActionDesire(myself.sm, 4, 54 * 1000 / 30, 1000);
myself.AddTimerEx(1525005, 4000);

}
if (timer_id == 1525005) {
myself.AddEffectActionDesire(myself.sm, 4, 54 * 1000 / 30, 1000);
myself.AddTimerEx(1525006, 4000);

}
if (timer_id == 1525006) {
myself.AddEffectActionDesire(myself.sm, 4, 54 * 1000 / 30, 1000);
myself.AddTimerEx(1525007, 4000);

}
if (timer_id == 1525007) {
myself.EquipItem(OHS_Weapon1);

}
	}


}