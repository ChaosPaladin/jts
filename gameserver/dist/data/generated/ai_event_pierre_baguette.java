package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_pierre_baguette extends default_npc {
	protected int Buff1 = 402325505;

	protected void CREATED() {
myself.AddTimerEx(6000, 60 * 1000);
myself.AddTimerEx(6001, 5 * 60 * 1000);
myself.AddTimerEx(6002, 30 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 6000) {
switch (gg.Rand(5)) {
case 0: {
myself.Say(gg.MakeFString(1800823, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1800824, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1800825, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1800826, "", "", "", "", ""));
break;

}
case 4: {
myself.Say(gg.MakeFString(1800827, "", "", "", "", ""));
break;

}

}
if (myself.InMyTerritory(myself.sm)) {

} else {
myself.InstantRandomTeleportInMyTerritory();

}
myself.AddTimerEx(6000, 60 * 1000);

}
if (timer_id == 6001) {
myself.Despawn();

}
if (timer_id == 6002) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 10000000);
myself.AddTimerEx(6002, 30 * 1000);

}
	}


}