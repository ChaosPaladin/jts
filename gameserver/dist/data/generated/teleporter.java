package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleporter extends announce_raid_boss_position {
	protected String ShopName = "";
	protected String fnHi = "thi.htm";
	protected String fnYouAreChaotic = "tcm.htm";
	protected String fnNobless = "";
	protected String fnNoNobless = "";
	protected String fnNoNoblessItem = "";
	protected String fnFlagMan = "flagman.htm";
	protected int IsGateKeeperForCoreTime = 0;
	protected int siegeStatusChecker = 0;

protected Object[][] Position = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNeedItemTown = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNoItemTown = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNeedItemSSQ = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNoblessNoItemSSQ = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionNewbie = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionPoint = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void CREATED() {
myself.RegisterTeleporterType(1, 0);
myself.RegisterTeleporterType(2, 0);
myself.RegisterTeleporterType(3, 40);
	}

	protected void TALKED(HandlerParam talker) {
if (myself.sm.class_id == 1031210) {
if (myself.CanLotto() == 1) {
if (talker.karma > 0) {
myself.ShowPage(talker, fnYouAreChaotic);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, "server_15_under001.htm");

}

} else if (gg.OwnItemCount(talker, 13560) > 0 || gg.OwnItemCount(talker, 13561) > 0 || gg.OwnItemCount(talker, 13562) > 0 || gg.OwnItemCount(talker, 13563) > 0 || gg.OwnItemCount(talker, 13564) > 0 || gg.OwnItemCount(talker, 13565) > 0 || gg.OwnItemCount(talker, 13566) > 0 || gg.OwnItemCount(talker, 13567) > 0 || gg.OwnItemCount(talker, 13568) > 0) {
myself.ShowPage(talker, fnFlagMan);

} else if (talker.karma > 0) {
myself.ShowPage(talker, fnYouAreChaotic);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam quest_id, HandlerParam maker0) {
if (ask == 255) {
i3 = myself.sm.class_id;
if (myself.CanLotto() == 1) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i0 = i0 % 100;
if (i0 >= 95 || i0 < 0) {
i0 = 0;

}
if (reply == 1 && i3 == 1030256) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 100);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 2 && i3 == 1030320) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 200);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 3 && i3 == 1030059) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 300);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 4 && i3 == 1030080) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 400);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 5 && i3 == 1030177) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 500);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 6 && i3 == 1030233) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 600);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 7 && i3 == 1030848) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 700);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 8 && i3 == 1030899) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 800);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 9 && i3 == 1031210) {
myself.i_ai4 = i0;
myself.CheckCursedUser(talker);

} else if (reply == 10 && i3 == 1031275) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 1000);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 11 && i3 == 1031320) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 1100);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

} else if (reply == 12 && i3 == 1031964) {
myself.SetMemoStateEx(talker, 255, 1, i0 + 1200);
myself.InstantTeleport(talker, 12661, 181687, -3540);
return;

}

} else if (reply == 9 && i3 == 1031210) {
myself.CheckCursedUser(talker);

} else {
myself.ShowPage(talker, "race_cant_teleport001.htm");

}

} else if (ask == -19) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, fnNobless);

} else {
myself.ShowPage(talker, fnNoNobless);

}

} else if (ask == -20) {
if (reply == 1) {
if (talker.nobless_type == 1) {
if (gg.OwnItemCount(talker, 13722) != 0) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionNoblessNeedItemTown, ShopName, "", "", "", 13722, gg.MakeFString(1000528, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNoNoblessItem);

}

} else {
myself.ShowPage(talker, fnNoNobless);

}

} else if (reply == 2) {
if (talker.nobless_type == 1) {
if (gg.OwnItemCount(talker, 13722) != 0) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionNoblessNeedItemField, ShopName, "", "", "", 13722, gg.MakeFString(1000528, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNoNoblessItem);

}

} else {
myself.ShowPage(talker, fnNoNobless);

}

} else if (reply == 3) {
if (talker.nobless_type == 1) {
if (gg.OwnItemCount(talker, 13722) != 0) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionNoblessNeedItemSSQ, ShopName, "", "", "", 13722, gg.MakeFString(1000528, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNoNoblessItem);

}

} else {
myself.ShowPage(talker, fnNoNobless);

}

}

} else if (ask == -21) {
if (talker.nobless_type == 1) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
if (reply == 1 && talker.nobless_type == 1) {
myself.Teleport(talker, PositionNoblessNoItemTown, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}
if (reply == 2 && talker.nobless_type == 1) {
myself.Teleport(talker, PositionNoblessNoItemField, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}
if (reply == 3 && talker.nobless_type == 1) {
myself.Teleport(talker, PositionNoblessNoItemSSQ, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

}

} else {
myself.ShowPage(talker, fnNoNobless);

}

} else if (ask == -22) {
myself.ShowPage(talker, myself.sm.name + "001.htm");

} else if (ask == 30) {
if (gg.OwnItemCount(talker, 8542) == 0) {
myself.ShowPage(talker, myself.sm.name + "010.htm");

} else if (talker.level >= 20) {
myself.ShowPage(talker, myself.sm.name + "011.htm");

} else if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionNewbie, ShopName, "", "", "", 8542, gg.MakeFString(1000518, "", "", "", "", ""));

}

} else if (ask == -31) {
if (talker.level >= 20 || myself.IsInCategory(6, talker.occupation) == 0) {
myself.ShowPage(talker, myself.sm.name + "005.htm");

} else if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionPoint, ShopName, "", "", "", 57, gg.MakeFString(1000308, "", "", "", "", ""));

}

} else if (ask == -1816) {
if (reply == 3) {
i3 = myself.sm.class_id;
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 / 1000000;
if (i1 >= 99 || i1 < 0) {
i1 = 0;

}
if (i3 == 1030256) {
i1 = 1000000;

}
if (i3 == 1030320) {
i1 = 2000000;

}
if (i3 == 1030059) {
i1 = 3000000;

}
if (i3 == 1030080) {
i1 = 4000000;

}
if (i3 == 1030177) {
i1 = 5000000;

}
if (i3 == 1030233) {
i1 = 6000000;

}
if (i3 == 1030848) {
i1 = 7000000;

}
if (i3 == 1030899) {
i1 = 8000000;

}
if (i3 == 1031210) {
i1 = 9000000;

}
if (i3 == 1031275) {
i1 = 10000000;

}
if (i3 == 1031320) {
i1 = 11000000;

}
if (i3 == 1031964) {
i1 = 12000000;

}
i2 = 0;
i2 = i0 / 1000000;
if (i2 > 0) {
i2 = i2 % 100;
i2 = i2 * 1000000;

} else {
i2 = 0;

}
if (i0 < 0) {
myself.SetMemoStateEx(talker, 255, 1, i1);

} else {
myself.SetMemoStateEx(talker, 255, 1, i0 - i2 + i1);

}
if (gg.Rand(3) < 1) {
myself.InstantTeleport(talker, -58752, -56898, -2032);

} else if (gg.Rand(2) < 1) {
myself.InstantTeleport(talker, -59722, -57866, -2032);

} else {
myself.InstantTeleport(talker, -60695, -56894, -2032);

}

}

}
if (ask == -1055) {
if (reply == 0) {
myself.InstantTeleport(talker, -149406, 255247, -85);

}

}
if (ask == -1056) {
if (reply == 0) {
myself.InstantTeleport(talker, -84752, 243122, -3728);

}

}
if (ask == 20003) {
if (reply == 1) {
if (gg.IsCreateDate(talker) == 1) {
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count >= 1) {
if (gg.FloatToInt(myself.sm.x - talker.x * myself.sm.x - talker.x + myself.sm.y - talker.y * myself.sm.y - talker.y) > 640) {
if (gg.CanGetBirthdayGift(talker) == 1) {
myself.CreateOnePrivateEx(1032600, "event_ai_alegria", 0, 0, gg.FloatToInt(myself.sm.x + talker.x / 2), gg.FloatToInt(myself.sm.y + talker.y / 2), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(talker) * 182, 0, 0, talker.id);

} else {
myself.ShowPage(talker, "nobirthday002.htm");

}

} else {
myself.ShowPage(talker, "event_alegria007.htm");

}

} else {
myself.ShowPage(talker, "event_alegria008.htm");

}

} else {
myself.ShowPage(talker, "nobirthday001.htm");

}

}

}
super;
	}

	protected void CHECK_CURSED_USER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
if (myself.i_ai4 < 100) {
myself.SetMemoStateEx(talker, 255, 1, myself.i_ai4 + 900);
myself.InstantTeleport(talker, 12661, 181687, -3540);
myself.i_ai4 = 0;
return;

}

} else {
myself.ShowPage(talker, "race_gatekeeper1010.htm");

}
	}


}