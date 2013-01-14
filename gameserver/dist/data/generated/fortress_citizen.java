package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_citizen extends citizen {
	protected String fnHi = "fortress_wizard001.htm";
	protected String fnHi2 = "fortress_wizard002.htm";
	protected String fnHi3 = "fortress_wizard003.htm";
	protected String fnHi4 = "fortress_wizard004.htm";
	protected String fnHi5 = "fortress_wizard005.htm";
	protected String fnHi6 = "fortress_wizard006.htm";
	protected int fortress_id = 101;

	protected void TALKED(HandlerParam talker) {
if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnHi5);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.Castle_GetPledgeId() != talker.pledge_id) {
myself.ShowPage(talker, fnHi5);
return;

}
if (ask == -301) {
if (reply == 1) {
myself.ShowMultisell(613, talker);

} else if (reply == 2) {
myself.ShowMultisell(610, talker);

} else if (reply == 3) {
myself.ShowMultisell(609, talker);

} else if (reply == 4) {
myself.ShowPage(talker, fnHi2);

} else if (reply == 5) {
i0 = gg.Rand(100);
if (gg.OwnItemCount(talker, 9912) >= 10) {
myself.DeleteItem1(talker, 9912, 10);
if (i0 <= 5) {
if (gg.Rand(100) < 25) {
myself.GiveItem1(talker, 9931, 1);

} else if (i1 <= 50) {
myself.GiveItem1(talker, 9932, 1);

} else if (i1 <= 75) {
myself.GiveItem1(talker, 10416, 1);

} else {
myself.GiveItem1(talker, 10417, 1);

}

} else if (i0 <= 15) {
i1 = gg.Rand(100);
if (i1 <= 20) {
myself.GiveItem1(talker, 9917, 1);

} else if (i1 <= 40) {
myself.GiveItem1(talker, 9918, 1);

} else if (i1 <= 60) {
myself.GiveItem1(talker, 9928, 1);

} else if (i1 <= 80) {
myself.GiveItem1(talker, 9929, 1);

} else {
myself.GiveItem1(talker, 9920, 1);

}

} else if (i0 <= 30) {
i1 = gg.Rand(100);
if (i1 <= 12) {
myself.GiveItem1(talker, 9916, 1);

} else if (i1 <= 25) {
myself.GiveItem1(talker, 9923, 1);

} else if (i1 <= 37) {
myself.GiveItem1(talker, 9924, 1);

} else if (i1 <= 50) {
myself.GiveItem1(talker, 9925, 1);

} else if (i1 <= 62) {
myself.GiveItem1(talker, 9926, 1);

} else if (i1 <= 75) {
myself.GiveItem1(talker, 9927, 1);

} else if (i1 <= 87) {
myself.GiveItem1(talker, 10518, 1);

} else {
myself.GiveItem1(talker, 10424, 1);

}

} else {
i1 = gg.Rand(46);
if (i1 == 0) {
myself.GiveItem1(talker, 9914, 1);

} else if (i1 == 1) {
myself.GiveItem1(talker, 9915, 1);

} else if (i1 == 2) {
myself.GiveItem1(talker, 9920, 1);

} else if (i1 == 3) {
myself.GiveItem1(talker, 9920, 1);

} else if (i1 == 4) {
myself.GiveItem1(talker, 9921, 1);

} else if (i1 == 5) {
myself.GiveItem1(talker, 9922, 1);

} else if (i1 == 6) {
myself.GiveItem1(talker, 9933, 1);

} else if (i1 == 7) {
myself.GiveItem1(talker, 9934, 1);

} else if (i1 == 8) {
myself.GiveItem1(talker, 9935, 1);

} else if (i1 == 9) {
myself.GiveItem1(talker, 9936, 1);

} else if (i1 == 10) {
myself.GiveItem1(talker, 9937, 1);

} else if (i1 == 11) {
myself.GiveItem1(talker, 9938, 1);

} else if (i1 == 12) {
myself.GiveItem1(talker, 9939, 1);

} else if (i1 == 13) {
myself.GiveItem1(talker, 9940, 1);

} else if (i1 == 14) {
myself.GiveItem1(talker, 9941, 1);

} else if (i1 == 15) {
myself.GiveItem1(talker, 9942, 1);

} else if (i1 == 16) {
myself.GiveItem1(talker, 9943, 1);

} else if (i1 == 17) {
myself.GiveItem1(talker, 9944, 1);

} else if (i1 == 18) {
myself.GiveItem1(talker, 9945, 1);

} else if (i1 == 19) {
myself.GiveItem1(talker, 9946, 1);

} else if (i1 == 20) {
myself.GiveItem1(talker, 9947, 1);

} else if (i1 == 21) {
myself.GiveItem1(talker, 9948, 1);

} else if (i1 == 22) {
myself.GiveItem1(talker, 9949, 1);

} else if (i1 == 23) {
myself.GiveItem1(talker, 9950, 1);

} else if (i1 == 25) {
myself.GiveItem1(talker, 9952, 1);

} else if (i1 == 26) {
myself.GiveItem1(talker, 9953, 1);

} else if (i1 == 27) {
myself.GiveItem1(talker, 9954, 1);

} else if (i1 == 28) {
myself.GiveItem1(talker, 9955, 1);

} else if (i1 == 29) {
myself.GiveItem1(talker, 9956, 1);

} else if (i1 == 30) {
myself.GiveItem1(talker, 9957, 1);

} else if (i1 == 31) {
myself.GiveItem1(talker, 9958, 1);

} else if (i1 == 32) {
myself.GiveItem1(talker, 9959, 1);

} else if (i1 == 33) {
myself.GiveItem1(talker, 9960, 1);

} else if (i1 == 34) {
myself.GiveItem1(talker, 9961, 1);

} else if (i1 == 35) {
myself.GiveItem1(talker, 9962, 1);

} else if (i1 == 36) {
myself.GiveItem1(talker, 9963, 1);

} else if (i1 == 37) {
myself.GiveItem1(talker, 9964, 1);

} else if (i1 == 24) {
myself.GiveItem1(talker, 9965, 1);

} else if (i1 == 38) {
myself.GiveItem1(talker, 10418, 1);

} else if (i1 == 39) {
myself.GiveItem1(talker, 10420, 1);

} else if (i1 == 40) {
myself.GiveItem1(talker, 10519, 1);

} else if (i1 == 41) {
myself.GiveItem1(talker, 10422, 1);

} else if (i1 == 42) {
myself.GiveItem1(talker, 10423, 1);

} else if (i1 == 43) {
myself.GiveItem1(talker, 10419, 1);

} else {
myself.GiveItem1(talker, 10421, 1);

}

}
myself.ShowPage(talker, fnHi3);

} else {
myself.ShowPage(talker, fnHi6);

}

} else if (reply == 6) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowEtcSkillList(talker, 3, "");

} else {
myself.ShowPage(talker, fnHi4);

}

} else if (reply == 7) {
myself.ShowMultisell(627, talker);

} else {
myself.ShowPage(talker, fnHi4);

}

}
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, 3, "");
	}


}