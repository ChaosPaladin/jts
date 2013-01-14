package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class adventure_helper extends citizen {
	protected String fnHi = "adventure_helper_01001.htm";
	protected String fnCoupon1Ok = "adventure_helper_01002.htm";
	protected String fnCoupon1Not1 = "adventure_helper_01003.htm";
	protected String fnCoupon1Not2 = "adventure_helper_01004.htm";
	protected String fnCoupon2Ok = "adventure_helper_01011.htm";
	protected String fnCoupon2Not1 = "adventure_helper_01012.htm";
	protected String fnCoupon2Not2 = "adventure_helper_01013.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1000) {
switch (reply) {
case 1: {
if (talker.level > 5) {
if (myself.IsNewbie(talker)) {
if (myself.GetOneTimeQuestFlag(talker, 207) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 7832, 1);
myself.SetOneTimeQuestFlag(talker, 207, 1);
myself.ShowPage(talker, fnCoupon1Ok);

} else {
myself.ShowPage(talker, fnCoupon1Not2);

}

} else {
myself.ShowPage(talker, fnCoupon1Not1);

}

} else {
myself.ShowPage(talker, fnCoupon1Not1);

}
break;

}
case 2: {
if (myself.IsInCategory(7, talker.occupation)) {
if (myself.IsNewbie(talker)) {
if (myself.GetOneTimeQuestFlag(talker, 208) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 7833, 1);
myself.SetOneTimeQuestFlag(talker, 208, 1);
myself.ShowPage(talker, fnCoupon2Ok);

} else {
myself.ShowPage(talker, fnCoupon2Not2);

}

} else {
myself.ShowPage(talker, fnCoupon2Not1);

}

} else {
myself.ShowPage(talker, fnCoupon2Not1);

}
break;

}

}

}
if (ask == -303) {
switch (reply) {
case 528: {

}
case 530: {
if (talker.level > 5) {
if (myself.IsNewbie(talker)) {
if (reply != 532 || reply != 549) {
myself.ShowMultisell(reply, talker);

}

} else if (reply >= 557 && reply <= 562) {
if (myself.sm.class_id == 1032103) {
myself.ShowMultisell(reply, talker);

}

} else if (reply == 567) {
if (myself.sm.class_id == 1032091) {
myself.ShowMultisell(reply, talker);

}

} else {
myself.ShowPage(talker, fnCoupon1Not1);

}

} else {
myself.ShowPage(talker, fnCoupon1Not1);

}
break;

}
case 529: {

}
case 531: {
if (myself.IsInCategory(7, talker.occupation)) {
if (myself.IsNewbie(talker)) {
if (reply != 532 || reply != 549) {
myself.ShowMultisell(reply, talker);

}

} else if (reply >= 557 && reply <= 562) {
if (myself.sm.class_id == 1032103) {
myself.ShowMultisell(reply, talker);

}

} else if (reply == 567) {
if (myself.sm.class_id == 1032091) {
myself.ShowMultisell(reply, talker);

}

} else {
myself.ShowPage(talker, fnCoupon2Not1);

}

} else {
myself.ShowPage(talker, fnCoupon2Not1);

}
break;

}

}

}
	}


}