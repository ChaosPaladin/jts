package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_death_claw extends is_basic {
	protected int active_time = 30;
	protected int toggle_shield = 388694017;

	protected void CREATED() {
myself.AddTimerEx(7010, 1 * 1000);
myself.AddTimerEx(7011, 20 * 1000);
myself.i_ai1 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 7010) {
myself.AddUseSkillDesire(myself.sm, toggle_shield, 1, 0, 100000000);
myself.i_ai1 = 1;
myself.Say(gg.MakeFString(1800718, "", "", "", "", ""));

} else if (timer_id == 7011) {
if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.sm, toggle_shield, 1, 0, 500000000);
myself.i_ai1 = 0;
myself.Say(gg.MakeFString(1800719, "", "", "", "", ""));

}

}
super;
	}


}