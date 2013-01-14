package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class keep_damage_trap extends default_trap {
	protected String AreaName = "keep_damage_trap_default";
	protected int IsDetected = 0;
	protected int IsDefused = 0;

	protected void CREATED() {
if (gg.IsSameString(AreaName, "") == 0) {
myself.AddTimerEx(2001, timer * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
gg.Area_SetOnOff(AreaName, 1);
myself.AddTimerEx(2002, timer * 1000 + gg.Rand(60) * 1000);

} else if (timer_id == 2002) {
gg.Area_SetOnOff(AreaName, 0);
myself.AddTimerEx(2001, timer * 1000 + gg.Rand(60) * 1000);

}
super;
	}


}