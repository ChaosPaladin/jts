package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_trainer_mage extends ai_xel_trainer_wiz {
	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2219001) {
if (myself.p_state != 3) {
switch (gg.Rand(6)) {
case 0: {
myself.AddEffectActionDesire(myself.sm, 1, 130 * 1000 / 30, 50);
myself.BroadcastScriptEvent(2219011, trainer_id, trainning_range);
break;

}
case 1: {
myself.AddEffectActionDesire(myself.sm, 4, 70 * 1000 / 30, 50);
myself.BroadcastScriptEvent(2219012, trainer_id, trainning_range);
break;

}
case 2: {
myself.AddEffectActionDesire(myself.sm, 5, 30 * 1000 / 30, 50);
myself.BroadcastScriptEvent(2219013, trainer_id, trainning_range);
break;

}
case 3: {

}
case 4: {

}
case 5: {
myself.AddEffectActionDesire(myself.sm, 7, 130 * 1000 / 30, 50);
myself.BroadcastScriptEvent(2219014, trainer_id, trainning_range);
break;

}

}

}
myself.AddTimerEx(2219001, 15 * 1000);

}
super;
	}


}