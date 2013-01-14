package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_rudolf_turkey extends default_npc {
	protected void CREATED() {
myself.Say(gg.MakeFString(1900131, "", "", "", "", ""));
myself.AddTimerEx(6000, 10 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (timer_id == 6000) {
myself.Say(gg.MakeFString(1900132, "", "", "", "", ""));
myself.AddTimerEx(6001, 5 * 1000);

}
if (timer_id == 6001) {
myself.Say(gg.MakeFString(1900133, "", "", "", "", ""));
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.CastBuffForQuestReward(c0, 1518010369);
myself.AddTimerEx(6002, 5 * 1000);

}
if (timer_id == 6002) {
myself.Despawn();

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (ask == 50010) {
switch (reply) {
case 1: {

}

}

}
	}


}