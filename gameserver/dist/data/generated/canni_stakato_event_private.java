package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class canni_stakato_event_private extends ai_stakato_refine_cannibal_private {
	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
myself.i_quest9 = 0;
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_quest9) {
myself.Say("공격할 대상은 " + c0.name + " 입니다");

}
myself.c_ai4 = c0;
myself.AddTimerEx(2009, 1);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam c0, HandlerParam party0) {
if (timer_id == 2009) {
myself.MakeAttackEvent(myself.c_ai4, 100, 0);

}
	}


}