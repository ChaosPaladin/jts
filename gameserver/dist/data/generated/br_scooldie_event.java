package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_scooldie_event extends default_npc {
	protected String fnHi = "br_halloween_scooldie000.htm";
	protected int HALLOWEEN_EVENT_ID = 20091031;

	protected void CREATED() {
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50001) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 20706) >= 10) {
myself.GiveItem1(talker, 20710, 1);
myself.DeleteItem1(talker, 20706, 10);
myself.ShowPage(talker, "br_halloween_scooldie002.htm");

} else {
myself.ShowPage(talker, "br_halloween_scooldie003.htm");

}

} else if (reply == 2) {
myself.GetEventRankerInfo(HALLOWEEN_EVENT_ID, talker, 10);

} else if (reply == 3) {
if (gg.OwnItemCount(talker, 20711) > 0 && gg.OwnItemCount(talker, 20709) > 0) {
myself.ShowPage(talker, "br_halloween_scooldie008.htm");

} else {
if (gg.OwnItemCount(talker, 20711) == 0) {
myself.GiveItem1(talker, 20711, 1);

}
if (gg.OwnItemCount(talker, 20709) == 0) {
myself.GiveItem1(talker, 20709, 1);

}
myself.ShowPage(talker, "br_halloween_scooldie004.htm");

}

}

}
	}

	protected void GET_EVENT_RANKER_INFO(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (i0 == 1) {
myself.GiveItem1(talker, 20725, 1);
myself.GiveItem1(talker, 57, i1);
myself.AddLogByNpc2(127, myself.master, "br_scooldie_event", "1st reward", myself.i_ai3, i0, i1, i2, 0, 0);
myself.DecreaseEventTopRankerReward(HALLOWEEN_EVENT_ID, i2, talker);
myself.ShowPage(talker, "br_halloween_scooldie006.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "br_halloween_scooldie009.htm");

} else {
myself.ShowPage(talker, "br_halloween_scooldie007.htm");

}
	}


}