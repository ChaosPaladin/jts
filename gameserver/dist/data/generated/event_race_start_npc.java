package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_race_start_npc extends citizen {
	protected String fnHi = "";
	protected int stamp_fisinh_item = 9694;
	protected int stamp_item = 10013;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (myself.i_ai0 == 0 && talker.level >= 78) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, "race_start002.htm");

}
if (gg.OwnItemCount(talker, stamp_item) >= 4) {
myself.ShowPage(talker, "race_start001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam c0) {
if (ask == -1005) {
if (reply == 1) {
if (myself.i_ai0 == 0) {
myself.AddLogByNpc(326, talker, 0, 0);
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, 343343109);

}
myself.CastBuffForQuestReward(talker, 343343109);
myself.i_ai0 = 1;
myself.AddTimerEx(2001, 30 * 60 * 1000);
if (gg.OwnItemCount(talker, stamp_item) >= 1) {
i0 = gg.OwnItemCount(talker, stamp_item);
myself.DeleteItem1(talker, stamp_item, i0);

}

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, stamp_item) >= 4) {
i0 = gg.OwnItemCount(talker, stamp_item);
myself.GiveItem1(talker, stamp_fisinh_item, 3);
myself.DeleteItem1(talker, stamp_item, i0);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.i_ai0 = 0;

}
	}


}