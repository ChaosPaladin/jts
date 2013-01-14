package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class newbie_guide extends citizen {
	protected String fnHi = "";
	protected String fnHighLevel = "";
	protected String fnRaceMisMatch = "";
	protected String fnGuideF05 = "";
	protected String fnGuideF10 = "";
	protected String fnGuideF15 = "";
	protected String fnGuideF20 = "";
	protected String fnGuideM07 = "";
	protected String fnGuideM14 = "";
	protected String fnGuideM20 = "";
	protected String ShopName = "";
	protected String fnCoupon1Ok = "newbie_guide002.htm";
	protected String fnCoupon1Not1 = "newbie_guide003.htm";
	protected String fnCoupon1Not2 = "newbie_guide004.htm";
	protected String fnCoupon1Not3 = "newbie_guide005.htm";
	protected String fnCoupon2Ok = "newbie_guide011.htm";
	protected String fnCoupon2Not1 = "newbie_guide012.htm";
	protected String fnCoupon2Not2 = "newbie_guide013.htm";
	protected String fnCoupon2Not3 = "newbie_guide014.htm";
	protected int num_coupon1 = 5;
	protected int num_coupon2 = 1;
	protected String fnNoSummonCreature = "blessing_list002b.htm";

protected Object[][] Position = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void CREATED() {
myself.RegisterTeleporterType(1, 0);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (ask == -7 && reply == 1) {
if (myself.sm.race == 5) {
if (talker.race != myself.sm.race) {
myself.ShowPage(talker, "guide_krenisk003.htm");

} else if (talker.level > 20 || myself.IsInCategory(62, talker.occupation) != 1) {
myself.ShowPage(talker, "guide_krenisk002.htm");

} else if (talker.occupation == 123) {
if (talker.level <= 5) {
myself.ShowPage(talker, "guide_krenisk_kmf05.htm");

} else if (talker.level <= 10) {
myself.ShowPage(talker, "guide_krenisk_kmf10.htm");

} else if (talker.level <= 15) {
myself.ShowPage(talker, "guide_krenisk_kmf15.htm");

} else {
myself.ShowPage(talker, "guide_krenisk_kmf20.htm");

}

} else if (talker.occupation == 124) {
if (talker.level <= 5) {
myself.ShowPage(talker, "guide_krenisk_kff05.htm");

} else if (talker.level <= 10) {
myself.ShowPage(talker, "guide_krenisk_kff10.htm");

} else if (talker.level <= 15) {
myself.ShowPage(talker, "guide_krenisk_kff15.htm");

} else {
myself.ShowPage(talker, "guide_krenisk_kff20.htm");

}

}

} else if (talker.race != myself.sm.race) {
myself.ShowPage(talker, fnRaceMisMatch);

} else if (talker.level > 20 || myself.IsInCategory(6, talker.occupation) == 0) {
myself.ShowPage(talker, fnHighLevel);

} else if (myself.IsInCategory(0, talker.occupation)) {
if (talker.level <= 5) {
myself.ShowPage(talker, fnGuideF05);

} else if (talker.level <= 10) {
myself.ShowPage(talker, fnGuideF10);

} else if (talker.level <= 15) {
myself.ShowPage(talker, fnGuideF15);

} else {
myself.ShowPage(talker, fnGuideF20);

}

} else if (talker.level <= 7) {
myself.ShowPage(talker, fnGuideM07);

} else if (talker.level <= 14) {
myself.ShowPage(talker, fnGuideM14);

} else {
myself.ShowPage(talker, fnGuideM20);

}

} else if (ask == -7 && reply == 2) {
if (talker.level <= 75) {
if (talker.level < 6) {
myself.ShowPage(talker, "guide_for_newbie002.htm");

} else if (myself.IsInCategory(66, talker.occupation)) {
myself.CastBuffForQuestReward(talker, 283246593);
myself.CastBuffForQuestReward(talker, 283312129);
myself.CastBuffForQuestReward(talker, 369426433);
myself.CastBuffForQuestReward(talker, 283377665);
myself.CastBuffForQuestReward(talker, 283443201);
myself.CastBuffForQuestReward(talker, 283508737);
if (talker.level >= 6 && talker.level <= 39) {
myself.CastBuffForQuestReward(talker, 283574273);

}
if (talker.level >= 40 && talker.level <= 75) {
myself.CastBuffForQuestReward(talker, 369098753);

}
if (talker.level >= 16 && talker.level <= 34) {
myself.CastBuffForQuestReward(talker, 284295169);

}

} else if (myself.IsInCategory(67, talker.occupation)) {
myself.CastBuffForQuestReward(talker, 283246593);
myself.CastBuffForQuestReward(talker, 283312129);
myself.CastBuffForQuestReward(talker, 369426433);
myself.CastBuffForQuestReward(talker, 283639809);
myself.CastBuffForQuestReward(talker, 283705345);
myself.CastBuffForQuestReward(talker, 283770881);
myself.CastBuffForQuestReward(talker, 283836417);
if (talker.level >= 16 && talker.level <= 34) {
myself.CastBuffForQuestReward(talker, 284295169);

}

}

} else {
myself.ShowPage(talker, "guide_for_newbie003.htm");

}

} else if (ask == -7 && reply == 3) {
if (talker.level <= 39 && myself.IsInCategory(6, talker.occupation) || myself.IsInCategory(7, talker.occupation)) {
myself.CastBuffForQuestReward(talker, 339607553);

} else {
myself.ShowPage(talker, "pk_protect002.htm");

}

} else if (ask == -7 && reply == 4) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && myself.IsInCategory(12, c0.npc_class_id) && myself.IsInCategory(35, c0.npc_class_id) == 0) {
if (talker.level < 6 || talker.level > 75) {
myself.ShowPage(talker, "guide_for_newbie003.htm");

} else {
myself.CastBuffForQuestReward(c0, 283246593);
myself.CastBuffForQuestReward(c0, 283312129);
myself.CastBuffForQuestReward(c0, 369426433);
myself.CastBuffForQuestReward(c0, 283377665);
myself.CastBuffForQuestReward(c0, 283443201);
myself.CastBuffForQuestReward(c0, 283508737);
myself.CastBuffForQuestReward(c0, 283639809);
myself.CastBuffForQuestReward(c0, 283705345);
myself.CastBuffForQuestReward(c0, 283770881);
myself.CastBuffForQuestReward(c0, 283836417);
if (talker.level >= 6 && talker.level <= 39) {
myself.CastBuffForQuestReward(c0, 283574273);

}
if (talker.level >= 40 && talker.level <= 75) {
myself.CastBuffForQuestReward(c0, 369098753);

}

}

} else {
myself.ShowPage(talker, fnNoSummonCreature);

}

}
if (ask == -1000) {
switch (reply) {
case 1: {
if (talker.level > 5) {
if (talker.level < 20 && myself.IsInCategory(6, talker.occupation)) {
if (myself.GetOneTimeQuestFlag(talker, 207) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 7832, num_coupon1);
myself.SetOneTimeQuestFlag(talker, 207, 1);
myself.ShowPage(talker, fnCoupon1Ok);
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 100);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4153, "", "", "", "", ""));

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
if (talker.level < 40) {
if (myself.GetOneTimeQuestFlag(talker, 208) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 7833, num_coupon2);
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
if (talker.level < 20 && myself.IsInCategory(6, talker.occupation)) {
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
myself.ShowPage(talker, fnCoupon1Not3);

}

} else {
myself.ShowPage(talker, fnCoupon1Not3);

}
break;

}
case 529: {

}
case 531: {
if (myself.IsInCategory(7, talker.occupation)) {
if (talker.level < 40) {
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
myself.ShowPage(talker, fnCoupon2Not3);

}

} else {
myself.ShowPage(talker, fnCoupon2Not3);

}
break;

}

}

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (talker.level >= 20) {
myself.ShowPage(talker, "guide_teleport_over001.htm");

} else if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position, ShopName, "", "", "", 57, "");

}
	}


}