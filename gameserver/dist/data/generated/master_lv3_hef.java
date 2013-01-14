package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_lv3_hef extends guild_master_lv3 {
	protected int lv2_class1 = 1;
	protected int lv2_class2 = 4;
	protected int lv2_class3 = 7;
	protected int lv2_class4 = 19;
	protected int lv2_class5 = 22;
	protected int lv3_class11 = 2;
	protected int lv3_class12 = 3;
	protected int lv3_class21 = 5;
	protected int lv3_class22 = 6;
	protected int lv3_class31 = 8;
	protected int lv3_class32 = 9;
	protected int lv3_class41 = 20;
	protected int lv3_class42 = 21;
	protected int lv3_class51 = 23;
	protected int lv3_class52 = 24;
	protected int proof11x = 2627;
	protected int proof11y = 2734;
	protected int proof11z = 2762;
	protected int proof12x = 2627;
	protected int proof12y = 2734;
	protected int proof12z = 3276;
	protected int proof21x = 2633;
	protected int proof21y = 2734;
	protected int proof21z = 2820;
	protected int proof22x = 2633;
	protected int proof22y = 2734;
	protected int proof22z = 3307;
	protected int proof31x = 2673;
	protected int proof31y = 2734;
	protected int proof31z = 2809;
	protected int proof32x = 2673;
	protected int proof32y = 2734;
	protected int proof32z = 3293;
	protected int proof41x = 2633;
	protected int proof41y = 3140;
	protected int proof41z = 2820;
	protected int proof42x = 2627;
	protected int proof42y = 3140;
	protected int proof42z = 2762;
	protected int proof51x = 2673;
	protected int proof51y = 3140;
	protected int proof51z = 2809;
	protected int proof52x = 2673;
	protected int proof52y = 3140;
	protected int proof52z = 3293;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(0, talker.occupation) && myself.IsInCategory(9, talker.occupation) && myself.IsInCategory(44, talker.occupation) || myself.IsInCategory(48, talker.occupation)) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else if (myself.IsInCategory(0, talker.occupation) && myself.IsInCategory(44, talker.occupation) || myself.IsInCategory(48, talker.occupation)) {
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
myself.ShowPage(talker, "master_lv3_hef_02.htm");

} else {
myself.ShowPage(talker, "master_lv3_hef_01.htm");

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
if (ask == -2 && reply == 15) {
myself.GetSubJobList(talker, 5, 0);

}
if (ask == -2 && reply == 16) {
myself.GetSubJobList(talker, 6, 0);

}
if (ask == -2 && reply == 17) {
myself.GetSubJobList(talker, 7, 0);

}
if (ask == -2 && reply == 18) {
myself.GetSubJobList(talker, 8, 0);

}
if (ask == -2 && reply == 19) {
myself.GetSubJobList(talker, 9, 0);

}
if (ask == -2 && reply == 20) {
myself.GetSubJobList(talker, 10, 0);

}
if (ask == -2 && reply == 30) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_hef_02.htm");

} else if (talker.transformID > 0) {
myself.ShowPage(talker, "subclass_06.htm");

} else {
myself.GetSubJobList(talker, 11, 0);

}

}
if (ask == -2 && reply == 40) {
if (talker.level < 40) {
myself.ShowPage(talker, "master_lv3_hef_19.htm");
return;

}
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_hef_02.htm");

} else {
myself.GetSubJobList(talker, 20, 0);

}

}
if (ask == -2 && reply == 41) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_hef_02.htm");

} else if (state == 1) {
myself.ShowPage(talker, "master_lv3_hef_01b.htm");

} else if (state == 2) {
myself.ShowPage(talker, "master_lv3_hef_01c.htm");

} else if (state == 3) {
myself.ShowPage(talker, "master_lv3_hef_01d.htm");

}

}
if (ask == -2 && reply == 42) {
myself.GetSubJobList(talker, 1, state);

}
if (ask == -2 && reply == 43) {
myself.GetSubJobList(talker, 2, state);

}
if (ask == -2 && reply == 44) {
myself.GetSubJobList(talker, 3, state);

}
if (ask == -2 && reply == 45) {
myself.GetSubJobList(talker, 4, state);

}
if (ask == -2 && reply == 46) {
myself.GetSubJobList(talker, 5, state);

}
if (ask == -2 && reply == 47) {
myself.GetSubJobList(talker, 6, state);

}
if (ask == -2 && reply == 48) {
myself.GetSubJobList(talker, 7, state);

}
if (ask == -2 && reply == 49) {
myself.GetSubJobList(talker, 8, state);

}
if (ask == -2 && reply == 50) {
myself.GetSubJobList(talker, 9, state);

}
if (ask == -2 && reply == 51) {
myself.GetSubJobList(talker, 10, state);

}
if (ask == -2 && reply == 324) {
if (talker.occupation == 2) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 2);

}

}
if (ask == -2 && reply == 325) {
if (talker.occupation == 3) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 3);

}

}
if (ask == -2 && reply == 327) {
if (talker.occupation == 5) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 5);

}

}
if (ask == -2 && reply == 328) {
if (talker.occupation == 6) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 6);

}

}
if (ask == -2 && reply == 330) {
if (talker.occupation == 8) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 8);

}

}
if (ask == -2 && reply == 331) {
if (talker.occupation == 9) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 9);

}

}
if (ask == -2 && reply == 342) {
if (talker.occupation == 20) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 20);

}

}
if (ask == -2 && reply == 343) {
if (talker.occupation == 21) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 21);

}

}
if (ask == -2 && reply == 345) {
if (talker.occupation == 23) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 23);

}

}
if (ask == -2 && reply == 346) {
if (talker.occupation == 24) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 24);

}

}
if (ask == -2 && reply == 380) {
if (talker.occupation == 88) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 88);

}

}
if (ask == -2 && reply == 381) {
if (talker.occupation == 89) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 89);

}

}
if (ask == -2 && reply == 382) {
if (talker.occupation == 90) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 90);

}

}
if (ask == -2 && reply == 383) {
if (talker.occupation == 91) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 91);

}

}
if (ask == -2 && reply == 384) {
if (talker.occupation == 92) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 92);

}

}
if (ask == -2 && reply == 385) {
if (talker.occupation == 93) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 93);

}

}
if (ask == -2 && reply == 391) {
if (talker.occupation == 99) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 99);

}

}
if (ask == -2 && reply == 392) {
if (talker.occupation == 100) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 100);

}

}
if (ask == -2 && reply == 393) {
if (talker.occupation == 101) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 101);

}

}
if (ask == -2 && reply == 394) {
if (talker.occupation == 102) {
myself.ShowPage(talker, "master_lv3_hef_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 102);

}

}
super;
	}

	protected void SUBJOB_CHANGED(HandlerParam talker, HandlerParam reply, HandlerParam level) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
myself.ShowPage(talker, "master_lv3_hef_05.htm");

}
	}

	protected void SUBJOB_LIST_INFORMED(HandlerParam talker, HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam fhtml0, HandlerParam i_ai0, HandlerParam c0, HandlerParam state) {
if (ask == 1) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 2 && i0 != 88 && i2 != 2 && i2 != 88 && i4 != 2 && i4 != 88 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 2);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 2 && i0 != 88 && i2 != 2 && i2 != 88 && i4 != 2 && i4 != 88 && i6 != 2 && i6 != 88) {
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
myself.RenewSubJob(talker, i8, 2);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 2) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 3 && i0 != 89 && i2 != 3 && i2 != 89 && i4 != 3 && i4 != 89 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 3);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}
if (i0 != 3 && i0 != 89 && i2 != 3 && i2 != 89 && i4 != 3 && i4 != 89 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 3 && i0 != 89 && i2 != 3 && i2 != 89 && i4 != 3 && i4 != 89 && i6 != 3 && i6 != 89) {
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
myself.RenewSubJob(talker, i8, 3);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 3) {
if (i8 == 0) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 5 && i0 != 90 && i2 != 5 && i2 != 90 && i4 != 5 && i4 != 90 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 5);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 5 && i0 != 90 && i2 != 5 && i2 != 90 && i4 != 5 && i4 != 90 && i6 != 5 && i6 != 90) {
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
myself.RenewSubJob(talker, i8, 5);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 4) {
if (i8 == 0) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 6 && i0 != 91 && i2 != 6 && i2 != 91 && i4 != 6 && i4 != 91 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 6);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 6 && i0 != 91 && i2 != 6 && i2 != 91 && i4 != 6 && i4 != 91 && i6 != 6 && i6 != 91) {
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
myself.RenewSubJob(talker, i8, 6);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 5) {
if (i8 == 0) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 8 && i0 != 93 && i2 != 8 && i2 != 93 && i4 != 8 && i4 != 93 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 8);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 8 && i0 != 93 && i2 != 8 && i2 != 93 && i4 != 8 && i4 != 93 && i6 != 8 && i6 != 93) {
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
myself.RenewSubJob(talker, i8, 8);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 6) {
if (i8 == 0) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 9 && i0 != 92 && i2 != 9 && i2 != 92 && i4 != 9 && i4 != 92 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 9);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 9 && i0 != 92 && i2 != 9 && i2 != 92 && i4 != 9 && i4 != 92 && i6 != 9 && i6 != 92) {
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
myself.RenewSubJob(talker, i8, 9);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 7) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hef_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_hef_10.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 20 && i0 != 99 && i2 != 20 && i2 != 99 && i4 != 20 && i4 != 99 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 20);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 20 && i0 != 99 && i2 != 20 && i2 != 99 && i4 != 20 && i4 != 99 && i6 != 20 && i6 != 99) {
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
myself.RenewSubJob(talker, i8, 20);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 8) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hef_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i4) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_hef_13.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(42, i4) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_hef_13.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_hef_13.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i4) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_hef_13.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 21 && i0 != 100 && i2 != 21 && i2 != 100 && i4 != 21 && i4 != 100 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 21);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 21 && i0 != 100 && i2 != 21 && i2 != 100 && i4 != 21 && i4 != 100 && i6 != 21 && i6 != 100) {
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
myself.RenewSubJob(talker, i8, 21);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 9) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hef_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_hef_08.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 23 && i0 != 101 && i2 != 23 && i2 != 101 && i4 != 23 && i4 != 101 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 23);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 23 && i0 != 101 && i2 != 23 && i2 != 101 && i4 != 23 && i4 != 101 && i6 != 23 && i6 != 101) {
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
myself.RenewSubJob(talker, i8, 23);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 10) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hef_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_hef_09.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 24 && i0 != 102 && i2 != 24 && i2 != 102 && i4 != 24 && i4 != 102 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 24);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 24 && i0 != 102 && i2 != 24 && i2 != 102 && i4 != 24 && i4 != 102 && i6 != 24 && i6 != 102) {
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
myself.RenewSubJob(talker, i8, 24);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 11) {
if (i2 == -1) {
myself.ShowPage(talker, "master_lv3_hef_07.htm");

} else {
i8 = 0;
myself.FHTML_SetFileName(fhtml0, "master_lv3_hef_03.htm");
if (i0 == 2 || i0 == 3 || i0 == 5 || i0 == 6 || i0 == 8 || i0 == 9 || i0 == 20 || i0 == 21 || i0 == 23 || i0 == 24 || i0 == 88 || i0 == 89 || i0 == 90 || i0 == 91 || i0 == 92 || i0 == 93 || i0 == 99 || i0 == 100 || i0 == 101 || i0 == 102) {
if (i0 > 87) {
i0 = i0 + 1114000;

} else {
i0 = i0 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i2 != -1 && i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 9 || i2 == 20 || i2 == 21 || i2 == 23 || i2 == 24 || i2 == 88 || i2 == 89 || i2 == 90 || i2 == 91 || i2 == 92 || i2 == 93 || i2 == 99 || i2 == 100 || i2 == 101 || i2 == 102) {
if (i2 > 87) {
i2 = i2 + 1114000;

} else {
i2 = i2 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i2, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i4 != -1 && i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 8 || i4 == 9 || i4 == 20 || i4 == 21 || i4 == 23 || i4 == 24 || i4 == 88 || i4 == 89 || i4 == 90 || i4 == 91 || i4 == 92 || i4 == 93 || i4 == 99 || i4 == 100 || i4 == 101 || i4 == 102) {
if (i4 > 87) {
i4 = i4 + 1114000;

} else {
i4 = i4 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i4, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i6 != -1 && i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 8 || i6 == 9 || i6 == 20 || i6 == 21 || i6 == 23 || i6 == 24 || i6 == 88 || i6 == 89 || i6 == 90 || i6 == 91 || i6 == 92 || i6 == 93 || i6 == 99 || i6 == 100 || i6 == 101 || i6 == 102) {
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
myself.FHTML_SetFileName(fhtml0, "master_lv3_hef_01a.htm");
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
myself.ShowPage(talker, "master_lv3_hef_06.htm");

}
	}

	protected void SUBJOB_RENEWED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == -1 && talker.alive == 0) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
if (i0 == 97) {
myself.DeleteItem1(talker, 15307, gg.OwnItemCount(talker, 15307));

} else if (i0 == 105) {
myself.DeleteItem1(talker, 15308, gg.OwnItemCount(talker, 15308));

} else if (i0 == 112) {
myself.DeleteItem1(talker, 15309, gg.OwnItemCount(talker, 15309));

}
myself.ShowPage(talker, "master_lv3_hef_05.htm");

}
	}


}