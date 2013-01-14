package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class olympiad_manager extends citizen {
	protected int buff1 = 71172098;
	protected int buff2 = 78905346;
	protected int buff3 = 69402627;
	protected int buff4 = 71106563;
	protected int buff5 = 70647814;
	protected int buff6 = 69992451;
	protected int buff7 = 81264643;
	protected int buff8 = 70582275;
	protected int buff9 = 81395715;
	protected int buff10 = 69599234;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 < 5) {
myself.ShowPage(talker, "Olympiad_master001.htm");
myself.c_ai0 = talker;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -301) {
if (reply == 1) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff1);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 2) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff2);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 3) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff3);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 4) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff4);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 5) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff5);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 6) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff6);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 7) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff7);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 8) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff8);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 9) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff9);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

} else if (reply == 10) {
if (myself.i_ai0 < 5) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.CastBuffForQuestReward(talker, buff10);
myself.ShowPage(talker, "Olympiad_master002.htm");

}

}
if (myself.i_ai0 >= 5) {
myself.ShowPage(talker, "Olympiad_master003.htm");
myself.AddTimerEx(2001, 5000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == 2001) {
myself.Despawn();

}
	}


}