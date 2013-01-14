package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_lv3_orc extends guild_master_lv3 {
	protected int lv2_class1 = 45;
	protected int lv2_class2 = 47;
	protected int lv2_class3 = 50;
	protected int lv3_class11 = 46;
	protected int lv3_class21 = 48;
	protected int lv3_class31 = 51;
	protected int lv3_class32 = 52;
	protected int proof11x = 2627;
	protected int proof11y = 3203;
	protected int proof11z = 3276;
	protected int proof21x = 2627;
	protected int proof21y = 3203;
	protected int proof21z = 2762;
	protected int proof31x = 2721;
	protected int proof31y = 3203;
	protected int proof31z = 3390;
	protected int proof32x = 2721;
	protected int proof32y = 3203;
	protected int proof32z = 2879;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(9, talker.occupation) && myself.IsInCategory(57, talker.occupation) || myself.IsInCategory(56, talker.occupation)) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else if (myself.IsInCategory(57, talker.occupation) || myself.IsInCategory(56, talker.occupation)) {
if (talker.occupation == lv2_class1 || talker.occupation == lv3_class11 || talker.occupation == lv3_class12 || talker.occupation == lv3_class13) {
myself.ShowPage(talker, fnClassList1);

} else if (talker.occupation == lv2_class2 || talker.occupation == lv3_class21 || talker.occupation == lv3_class22 || talker.occupation == lv3_class23) {
myself.ShowPage(talker, fnClassList2);

} else if (talker.occupation == lv2_class3 || talker.occupation == lv3_class31 || talker.occupation == lv3_class32 || talker.occupation == lv3_class33) {
myself.ShowPage(talker, fnClassList3);

} else if (talker.occupation == lv2_class4 || talker.occupation == lv3_class41 || talker.occupation == lv3_class42 || talker.occupation == lv3_class43) {
myself.ShowPage(talker, fnClassList4);

} else if (talker.occupation == lv2_class5 || talker.occupation == lv3_class51 || talker.occupation == lv3_class52 || talker.occupation == lv3_class53) {
myself.ShowPage(talker, fnClassList5);

} else {
myself.ShowPage(talker, fnYouAreFirstClass);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
if (ask == -2 && reply == 5) {
if (talker.transformID == 0) {
if (talker.race != 5) {
myself.ShowPage(talker, "subclass_01.htm");

} else {
myself.ShowPage(talker, "subclass_05.htm");

}

} else {
myself.ShowPage(talker, "subclass_06.htm");

}

}
if (ask == -2 && reply == 10) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_orc_02.htm");

} else {
myself.ShowPage(talker, "master_lv3_orc_01.htm");

}

}
if (ask == -2 && reply == 11) {
myself.GetSubJobList(talker, 1, 0);

}
if (ask == -2 && reply == 12) {
myself.GetSubJobList(talker, 2, 0);

}
if (ask == -2 && reply == 13) {
myself.GetSubJobList(talker, 3, 0);

}
if (ask == -2 && reply == 14) {
myself.GetSubJobList(talker, 4, 0);

}
if (ask == -2 && reply == 30) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_orc_02.htm");

} else if (talker.transformID > 0) {
myself.ShowPage(talker, "subclass_06.htm");

} else {
myself.GetSubJobList(talker, 10, 0);

}

}
if (ask == -2 && reply == 40) {
if (talker.level < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_orc_02.htm");

} else {
myself.GetSubJobList(talker, 20, 0);

}

}
if (ask == -2 && reply == 41) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_orc_02.htm");

} else if (state == 1) {
myself.ShowPage(talker, "master_lv3_orc_01b.htm");

} else if (state == 2) {
myself.ShowPage(talker, "master_lv3_orc_01c.htm");

} else if (state == 3) {
myself.ShowPage(talker, "master_lv3_orc_01d.htm");

}

}
if (ask == -2 && reply == 42) {
myself.GetSubJobList(talker, 1, state);

}
if (ask == -2 && reply == 43) {
myself.GetSubJobList(talker, 2, state);

}
if (ask == -2 && reply == 44) {
myself.GetSubJobList(talker, 4, state);

}
if (ask == -2 && reply == 368) {
if (talker.occupation == 46) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 46);

}

}
if (ask == -2 && reply == 370) {
if (talker.occupation == 48) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 48);

}

}
if (ask == -2 && reply == 373) {
if (talker.occupation == 51) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 51);

}

}
if (ask == -2 && reply == 374) {
if (talker.occupation == 52) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 52);

}

}
if (ask == -2 && reply == 405) {
if (talker.occupation == 113) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 113);

}

}
if (ask == -2 && reply == 406) {
if (talker.occupation == 114) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 114);

}

}
if (ask == -2 && reply == 407) {
if (talker.occupation == 115) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 115);

}

}
if (ask == -2 && reply == 408) {
if (talker.occupation == 116) {
myself.ShowPage(talker, "master_lv3_orc_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 116);

}

}
super;
	}

	protected void SUBJOB_CHANGED(HandlerParam talker, HandlerParam reply, HandlerParam level) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
myself.ShowPage(talker, "master_lv3_orc_05.htm");

}
	}

	protected void SUBJOB_LIST_INFORMED(HandlerParam talker, HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam fhtml0) {
if (ask == 1) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 46 && i0 != 113 && i2 != 46 && i2 != 113 && i4 != 46 && i4 != 113 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 46);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 46 && i0 != 113 && i2 != 46 && i2 != 113 && i4 != 46 && i4 != 113 && i6 != 46 && i6 != 113) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 46);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 2) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 48 && i0 != 114 && i2 != 48 && i2 != 114 && i4 != 48 && i4 != 114 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 48);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 48 && i0 != 114 && i2 != 48 && i2 != 114 && i4 != 48 && i4 != 114 && i6 != 48 && i6 != 114) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 48);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 3) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 51 && i0 != 115 && i2 != 51 && i2 != 115 && i4 != 51 && i4 != 115 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 51);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 51 && i0 != 115 && i2 != 51 && i2 != 115 && i4 != 51 && i4 != 115 && i6 != 51 && i6 != 115) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 51);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 4) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 52 && i0 != 116 && i2 != 52 && i2 != 116 && i4 != 52 && i4 != 116 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 52);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 52 && i0 != 116 && i2 != 52 && i2 != 116 && i4 != 52 && i4 != 116 && i6 != 52 && i6 != 116) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 52);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 10) {
if (i2 == -1) {
myself.ShowPage(talker, "master_lv3_orc_07.htm");

} else {
i8 = 0;
myself.FHTML_SetFileName(fhtml0, "master_lv3_orc_03.htm");
if (i0 == 46 || i0 == 48 || i0 == 51 || i0 == 52 || i0 == 113 || i0 == 114 || i0 == 115 || i0 == 116) {
if (i0 > 87) {
i0 = i0 + 1114000;

} else {
i0 = i0 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i2 != -1 && i2 == 46 || i2 == 48 || i2 == 51 || i2 == 52 || i2 == 113 || i2 == 114 || i2 == 115 || i2 == 116) {
if (i2 > 87) {
i2 = i2 + 1114000;

} else {
i2 = i2 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i2, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i4 != -1 && i4 == 46 || i4 == 48 || i4 == 51 || i4 == 52 || i4 == 113 || i4 == 114 || i4 == 115 || i4 == 116) {
if (i4 > 87) {
i4 = i4 + 1114000;

} else {
i4 = i4 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i4, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i6 != -1 && i6 == 46 || i6 == 48 || i6 == 51 || i6 == 52 || i6 == 113 || i6 == 114 || i6 == 115 || i6 == 116) {
if (i6 > 87) {
i6 = i6 + 1114000;

} else {
i6 = i6 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i6, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i8 != 4) {
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "master_lv3_hef_07a.htm");

}

}

}
if (ask == 20) {
myself.FHTML_SetFileName(fhtml0, "master_lv3_orc_01a.htm");
if (i2 > 87) {
i2 = i2 + 1110970;

} else if (i2 != -1) {
i2 = i2 + 1111000;

} else {
i2 = 1119999;

}
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i2, "", "", "", "", ""));
if (i4 > 87) {
i4 = i4 + 1111970;

} else if (i4 != -1) {
i4 = i4 + 1112000;

} else {
i4 = 1119999;

}
myself.FHTML_SetStr(fhtml0, "reply6", gg.MakeFString(i4, "", "", "", "", ""));
if (i6 > 87) {
i6 = i6 + 1112970;

} else if (i6 != -1) {
i6 = i6 + 1113000;

} else {
i6 = 1119999;

}
myself.FHTML_SetStr(fhtml0, "reply7", gg.MakeFString(i6, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}
super;
	}

	protected void SUBJOB_CREATED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_17.htm");

} else {
myself.ShowPage(talker, "master_lv3_orc_06.htm");

}
	}

	protected void SUBJOB_RENEWED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
if (i0 == 97) {
myself.DeleteItem1(talker, 15307, gg.OwnItemCount(talker, 15307));

} else if (i0 == 105) {
myself.DeleteItem1(talker, 15308, gg.OwnItemCount(talker, 15308));

} else if (i0 == 112) {
myself.DeleteItem1(talker, 15309, gg.OwnItemCount(talker, 15309));

}
myself.ShowPage(talker, "master_lv3_orc_05.htm");

}
	}


}