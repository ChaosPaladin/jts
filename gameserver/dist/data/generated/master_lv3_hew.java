package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_lv3_hew extends guild_master_lv3 {
	protected int lv2_class1 = 11;
	protected int lv2_class2 = 26;
	protected int lv3_class11 = 12;
	protected int lv3_class12 = 13;
	protected int lv3_class13 = 14;
	protected int lv3_class21 = 27;
	protected int lv3_class22 = 28;
	protected int proof11x = 2674;
	protected int proof11y = 2734;
	protected int proof11z = 2840;
	protected int proof12x = 2674;
	protected int proof12y = 2734;
	protected int proof12z = 3307;
	protected int proof13x = 2674;
	protected int proof13y = 2734;
	protected int proof13z = 3336;
	protected int proof21x = 2674;
	protected int proof21y = 3140;
	protected int proof21z = 2840;
	protected int proof22x = 2674;
	protected int proof22y = 3140;
	protected int proof22z = 3336;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(2, talker.occupation) && myself.IsInCategory(9, talker.occupation) && myself.IsInCategory(46, talker.occupation) || myself.IsInCategory(49, talker.occupation)) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else if (myself.IsInCategory(2, talker.occupation) && myself.IsInCategory(46, talker.occupation) || myself.IsInCategory(49, talker.occupation)) {
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
myself.ShowPage(talker, "master_lv3_hew_02.htm");

} else {
myself.ShowPage(talker, "master_lv3_hew_01.htm");

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
if (ask == -2 && reply == 30) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_hew_02.htm");

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
myself.ShowPage(talker, "master_lv3_hew_02.htm");

} else {
myself.GetSubJobList(talker, 20, 0);

}

}
if (ask == -2 && reply == 41) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_hew_02.htm");

} else if (state == 1) {
myself.ShowPage(talker, "master_lv3_hew_01b.htm");

} else if (state == 2) {
myself.ShowPage(talker, "master_lv3_hew_01c.htm");

} else if (state == 3) {
myself.ShowPage(talker, "master_lv3_hew_01d.htm");

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
if (ask == -2 && reply == 334) {
if (talker.occupation == 12) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 12);

}

}
if (ask == -2 && reply == 335) {
if (talker.occupation == 13) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 13);

}

}
if (ask == -2 && reply == 336) {
if (talker.occupation == 14) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 14);

}

}
if (ask == -2 && reply == 349) {
if (talker.occupation == 27) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 27);

}

}
if (ask == -2 && reply == 350) {
if (talker.occupation == 28) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 28);

}

}
if (ask == -2 && reply == 386) {
if (talker.occupation == 94) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 94);

}

}
if (ask == -2 && reply == 387) {
if (talker.occupation == 95) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 95);

}

}
if (ask == -2 && reply == 388) {
if (talker.occupation == 96) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 96);

}

}
if (ask == -2 && reply == 395) {
if (talker.occupation == 103) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 103);

}

}
if (ask == -2 && reply == 396) {
if (talker.occupation == 104) {
myself.ShowPage(talker, "master_lv3_hew_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 104);

}

}
super;
	}

	protected void SUBJOB_CHANGED(HandlerParam talker, HandlerParam reply, HandlerParam level) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
myself.ShowPage(talker, "master_lv3_hew_05.htm");

}
	}

	protected void SUBJOB_LIST_INFORMED(HandlerParam talker, HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam fhtml0) {
if (ask == 1) {
if (i8 == 0) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 12 && i0 != 94 && i2 != 12 && i2 != 94 && i4 != 12 && i4 != 94 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 12);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 12 && i0 != 94 && i2 != 12 && i2 != 94 && i4 != 12 && i4 != 94 && i6 != 12 && i6 != 94) {
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
myself.RenewSubJob(talker, i8, 12);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 2) {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 13 && i0 != 95 && i2 != 13 && i2 != 95 && i4 != 13 && i4 != 95 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 13);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 13 && i0 != 95 && i2 != 13 && i2 != 95 && i4 != 13 && i4 != 95 && i6 != 13 && i6 != 95) {
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
myself.RenewSubJob(talker, i8, 13);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 3) {
if (i8 == 0) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 14 && i0 != 96 && i2 != 14 && i2 != 96 && i4 != 14 && i4 != 96 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 14);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 14 && i0 != 96 && i2 != 14 && i2 != 96 && i4 != 14 && i4 != 96 && i6 != 14 && i6 != 96) {
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
myself.RenewSubJob(talker, i8, 14);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 4) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hew_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_hew_14.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 27 && i0 != 103 && i2 != 27 && i2 != 103 && i4 != 27 && i4 != 103 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 27);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 27 && i0 != 103 && i2 != 27 && i2 != 103 && i4 != 27 && i4 != 103 && i6 != 27 && i6 != 103) {
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
myself.RenewSubJob(talker, i8, 27);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 5) {
if (talker.race == 2) {
myself.ShowPage(talker, "master_lv3_hew_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_hew_11.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 28 && i0 != 104 && i2 != 28 && i2 != 104 && i4 != 28 && i4 != 104 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 28);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 28 && i0 != 104 && i2 != 28 && i2 != 104 && i4 != 28 && i4 != 104 && i6 != 28 && i6 != 104) {
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
myself.RenewSubJob(talker, i8, 28);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 10) {
if (i2 == -1) {
myself.ShowPage(talker, "master_lv3_hew_07.htm");

} else {
i8 = 0;
myself.FHTML_SetFileName(fhtml0, "master_lv3_hew_03.htm");
if (i0 == 12 || i0 == 13 || i0 == 14 || i0 == 27 || i0 == 28 || i0 == 94 || i0 == 95 || i0 == 95 || i0 == 96 || i0 == 103 || i0 == 104) {
if (i0 > 87) {
i0 = i0 + 1114000;

} else {
i0 = i0 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i2 != -1 && i2 == 12 || i2 == 13 || i2 == 14 || i2 == 27 || i2 == 28 || i2 == 94 || i2 == 95 || i2 == 96 || i2 == 103 || i2 == 104) {
if (i2 > 87) {
i2 = i2 + 1114000;

} else {
i2 = i2 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i2, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i4 != -1 && i4 == 12 || i4 == 13 || i4 == 14 || i4 == 27 || i4 == 28 || i4 == 94 || i4 == 95 || i4 == 95 || i4 == 96 || i4 == 103 || i4 == 104) {
if (i4 > 87) {
i4 = i4 + 1114000;

} else {
i4 = i4 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i4, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i6 != -1 && i6 == 12 || i6 == 13 || i6 == 14 || i6 == 27 || i6 == 28 || i6 == 94 || i6 == 95 || i6 == 95 || i6 == 96 || i6 == 103 || i6 == 104) {
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
myself.ShowPage(talker, "master_lv3_hew_06.htm");

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
myself.ShowPage(talker, "master_lv3_hew_05.htm");

}
	}


}