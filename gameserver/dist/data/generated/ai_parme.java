package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_parme extends citizen {
	protected void CREATED() {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = myself.sm.param2;
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.sm, 79822849, 1, 1, 1000000);
if (myself.i_ai1 == 1) {
myself.Shout(gg.MakeFString(1800069, "", "", "", "", ""));

}

}
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 1) {
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1500) {
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 79822849) {
if (myself.i_ai1 == 1) {
myself.Shout(gg.MakeFString(1800070, "", "", "", "", ""));

}
myself.AddTimerEx(1500, 2000);

}
	}


}