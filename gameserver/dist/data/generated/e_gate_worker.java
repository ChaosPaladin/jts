package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_gate_worker extends default_npc {
	protected int gate_staff = 12814;
	protected int change1 = 370606081;

	protected void CREATED() {
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
myself.ShowPage(talker, "event_gate_worker001.htm");
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
if (ask == 1) {
if (reply == 1) {
myself.ShowPage(talker, "event_gate_worker_q01_03.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= 10000) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveEventItem(talker, 57, 10000, gate_staff, 1, 0, 24, 0, 0);

} else {
myself.ShowPage(talker, "event_gate_worker_q01_05.htm");

}

} else if (reply == 3) {
myself.ShowPage(talker, "event_gate_worker_q01_06.htm");

}

} else if (ask == 2) {
if (reply == 1) {
myself.ShowPage(talker, "event_gate_worker_q01_07.htm");

} else if (reply == 2) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
if (talker.transformID == 0) {
if (talker.yongma_type == 0) {
if (talker.stop_mode == 1) {
myself.CastBuffForQuestReward(talker, change1);

} else {
myself.ShowSystemMessage(talker, 2283);

}

} else {
myself.ShowSystemMessage(talker, 2063);

}

} else {
myself.ShowSystemMessage(talker, 2058);

}

} else {
myself.ShowSystemMessage(talker, 2062);

}

}

}
	}


}