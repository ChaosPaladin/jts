package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class black_judge_basic extends citizen {
	protected int s_penaltyoff = 458752001;
	protected int cost_penaltyoffS = 0;
	protected int cost_penaltyoffA = 0;
	protected int cost_penaltyoffB = 0;
	protected int cost_penaltyoffC = 0;
	protected int cost_penaltyoffD = 0;
	protected int cost_penaltyoff0 = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -505) {
if (reply == 1) {
if (talker.level >= 76) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoffS) {
myself.DeleteItem1(talker, 57, cost_penaltyoffS);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

} else if (reply == 2) {
if (talker.level >= 61 && talker.level < 76) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoffA) {
myself.DeleteItem1(talker, 57, cost_penaltyoffA);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

} else if (reply == 3) {
if (talker.level >= 52 && talker.level < 61) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoffB) {
myself.DeleteItem1(talker, 57, cost_penaltyoffB);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

} else if (reply == 4) {
if (talker.level >= 40 && talker.level < 52) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoffC) {
myself.DeleteItem1(talker, 57, cost_penaltyoffC);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

} else if (reply == 5) {
if (talker.level >= 20 && talker.level < 40) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoffD) {
myself.DeleteItem1(talker, 57, cost_penaltyoffD);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

} else if (reply == 6) {
if (talker.level >= 1 && talker.level < 20) {
if (talker.death_penalty_level > 0) {
if (gg.OwnItemCount(talker, 57) >= cost_penaltyoff0) {
myself.DeleteItem1(talker, 57, cost_penaltyoff0);
myself.CastBuffForQuestReward(talker, s_penaltyoff);

} else {
myself.ShowPage(talker, "black_judge008.htm");

}

} else {
myself.ShowPage(talker, "black_judge009.htm");

}

}

}

} else if (ask == -506) {
if (reply == 1) {
if (talker.level >= 76) {
myself.ShowPage(talker, "black_judge007.htm");

} else if (talker.level >= 61 && talker.level < 76) {
myself.ShowPage(talker, "black_judge006.htm");

} else if (talker.level >= 52 && talker.level < 61) {
myself.ShowPage(talker, "black_judge005.htm");

} else if (talker.level >= 40 && talker.level < 52) {
myself.ShowPage(talker, "black_judge004.htm");

} else if (talker.level >= 20 && talker.level < 40) {
myself.ShowPage(talker, "black_judge003.htm");

} else if (talker.level >= 1 && talker.level < 20) {
myself.ShowPage(talker, "black_judge002.htm");

}

}

}
super;
	}


}