package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_lv3_de extends guild_master_lv3 {
	protected int lv2_class1 = 32;
	protected int lv2_class2 = 35;
	protected int lv2_class3 = 39;
	protected int lv2_class4 = 42;
	protected int lv3_class11 = 33;
	protected int lv3_class12 = 34;
	protected int lv3_class21 = 36;
	protected int lv3_class22 = 37;
	protected int lv3_class31 = 40;
	protected int lv3_class32 = 41;
	protected int lv3_class41 = 43;
	protected int proof11x = 2633;
	protected int proof11y = 3172;
	protected int proof11z = 3307;
	protected int proof12x = 2627;
	protected int proof12y = 3172;
	protected int proof12z = 2762;
	protected int proof21x = 2673;
	protected int proof21y = 3172;
	protected int proof21z = 2809;
	protected int proof22x = 2673;
	protected int proof22y = 3172;
	protected int proof22z = 3293;
	protected int proof31x = 2674;
	protected int proof31y = 3172;
	protected int proof31z = 2840;
	protected int proof32x = 2674;
	protected int proof32y = 3172;
	protected int proof32z = 3336;
	protected int proof41x = 2721;
	protected int proof41y = 3172;
	protected int proof41z = 2821;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(9, talker.occupation) && myself.IsInCategory(53, talker.occupation) || myself.IsInCategory(52, talker.occupation)) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else if (myself.IsInCategory(53, talker.occupation) || myself.IsInCategory(52, talker.occupation)) {
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
myself.ShowPage(talker, "master_lv3_de_02.htm");

} else {
myself.ShowPage(talker, "master_lv3_de_01.htm");

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
if (ask == -2 && reply == 30) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_de_02.htm");

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
myself.ShowPage(talker, "master_lv3_de_02.htm");

} else {
myself.GetSubJobList(talker, 20, 0);

}

}
if (ask == -2 && reply == 41) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "master_lv3_de_02.htm");

} else if (state == 1) {
myself.ShowPage(talker, "master_lv3_de_01b.htm");

} else if (state == 2) {
myself.ShowPage(talker, "master_lv3_de_01c.htm");

} else if (state == 3) {
myself.ShowPage(talker, "master_lv3_de_01d.htm");

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
if (ask == -2 && reply == 355) {
if (talker.occupation == 33) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 33);

}

}
if (ask == -2 && reply == 356) {
if (talker.occupation == 34) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 34);

}

}
if (ask == -2 && reply == 358) {
if (talker.occupation == 36) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 36);

}

}
if (ask == -2 && reply == 359) {
if (talker.occupation == 37) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 37);

}

}
if (ask == -2 && reply == 362) {
if (talker.occupation == 40) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 40);

}

}
if (ask == -2 && reply == 363) {
if (talker.occupation == 41) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 41);

}

}
if (ask == -2 && reply == 365) {
if (talker.occupation == 43) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 43);

}

}
if (ask == -2 && reply == 398) {
if (talker.occupation == 106) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 106);

}

}
if (ask == -2 && reply == 399) {
if (talker.occupation == 107) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 107);

}

}
if (ask == -2 && reply == 400) {
if (talker.occupation == 108) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 108);

}

}
if (ask == -2 && reply == 401) {
if (talker.occupation == 109) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 109);

}

}
if (ask == -2 && reply == 402) {
if (talker.occupation == 110) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 110);

}

}
if (ask == -2 && reply == 403) {
if (talker.occupation == 111) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 111);

}

}
if (ask == -2 && reply == 404) {
if (talker.occupation == 112) {
myself.ShowPage(talker, "master_lv3_de_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 112);

}

}
super;
	}

	protected void SUBJOB_CHANGED(HandlerParam talker, HandlerParam reply, HandlerParam level) {
if (reply == -1) {
myself.ShowPage(talker, "master_lv3_hef_18.htm");

} else {
myself.ShowPage(talker, "master_lv3_de_05.htm");

}
	}

	protected void SUBJOB_LIST_INFORMED(HandlerParam talker, HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam fhtml0) {
if (ask == 1) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_de_10.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(39, i4) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_de_10.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i6) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_de_10.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(39, i2) || myself.IsInCategory(39, i4) || myself.IsInCategory(39, i0)) {
myself.ShowPage(talker, "master_lv3_de_10.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 33 && i0 != 106 && i2 != 33 && i2 != 106 && i4 != 33 && i4 != 106 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 33);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 33 && i0 != 106 && i2 != 33 && i2 != 106 && i4 != 33 && i4 != 106 && i6 != 33 && i6 != 106) {
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
myself.RenewSubJob(talker, i8, 33);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 2) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i4) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_de_13.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(42, i4) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_de_13.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i6) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_de_13.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(42, i2) || myself.IsInCategory(42, i4) || myself.IsInCategory(42, i0)) {
myself.ShowPage(talker, "master_lv3_de_13.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 34 && i0 != 107 && i2 != 34 && i2 != 107 && i4 != 34 && i4 != 107 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 34);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 34 && i0 != 107 && i2 != 34 && i2 != 107 && i4 != 34 && i4 != 107 && i6 != 34 && i6 != 107) {
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
myself.RenewSubJob(talker, i8, 34);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 3) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_de_08.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(37, i4) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_de_08.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i6) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_de_08.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(37, i2) || myself.IsInCategory(37, i4) || myself.IsInCategory(37, i0)) {
myself.ShowPage(talker, "master_lv3_de_08.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 36 && i0 != 108 && i2 != 36 && i2 != 108 && i4 != 36 && i4 != 108 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 36);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 36 && i0 != 108 && i2 != 36 && i2 != 108 && i4 != 36 && i4 != 108 && i6 != 36 && i6 != 108) {
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
myself.RenewSubJob(talker, i8, 36);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 4) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_de_09.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(38, i4) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_de_09.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i6) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_de_09.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(38, i2) || myself.IsInCategory(38, i4) || myself.IsInCategory(38, i0)) {
myself.ShowPage(talker, "master_lv3_de_09.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 37 && i0 != 109 && i2 != 37 && i2 != 109 && i4 != 37 && i4 != 109 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 37);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 37 && i0 != 109 && i2 != 37 && i2 != 109 && i4 != 37 && i4 != 109 && i6 != 37 && i6 != 109) {
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
myself.RenewSubJob(talker, i8, 37);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 5) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_de_14.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(43, i4) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_de_14.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i6) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_de_14.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(43, i2) || myself.IsInCategory(43, i4) || myself.IsInCategory(43, i0)) {
myself.ShowPage(talker, "master_lv3_de_14.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 40 && i0 != 110 && i2 != 40 && i2 != 110 && i4 != 40 && i4 != 110 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 40);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 40 && i0 != 110 && i2 != 40 && i2 != 110 && i4 != 40 && i4 != 110 && i6 != 40 && i6 != 110) {
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
myself.RenewSubJob(talker, i8, 40);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 6) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_de_11.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(40, i4) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_de_11.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i6) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_de_11.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(40, i2) || myself.IsInCategory(40, i4) || myself.IsInCategory(40, i0)) {
myself.ShowPage(talker, "master_lv3_de_11.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 41 && i0 != 111 && i2 != 41 && i2 != 111 && i4 != 41 && i4 != 111 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 41);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 41 && i0 != 111 && i2 != 41 && i2 != 111 && i4 != 41 && i4 != 111 && i6 != 41 && i6 != 111) {
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
myself.RenewSubJob(talker, i8, 41);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 7) {
if (talker.race == 1) {
myself.ShowPage(talker, "master_lv3_de_15.htm");
return;

}
if (i8 == 0) {
if (myself.IsInCategory(41, i2) || myself.IsInCategory(41, i4) || myself.IsInCategory(41, i6) || myself.IsInCategory(41, i0)) {
myself.ShowPage(talker, "master_lv3_de_12.htm");
return;

}

}
if (i8 == 1) {
if (myself.IsInCategory(41, i4) || myself.IsInCategory(41, i6) || myself.IsInCategory(41, i0)) {
myself.ShowPage(talker, "master_lv3_de_12.htm");
return;

}

}
if (i8 == 2) {
if (myself.IsInCategory(41, i2) || myself.IsInCategory(41, i6) || myself.IsInCategory(41, i0)) {
myself.ShowPage(talker, "master_lv3_de_12.htm");
return;

}

}
if (i8 == 3) {
if (myself.IsInCategory(41, i2) || myself.IsInCategory(41, i4) || myself.IsInCategory(41, i0)) {
myself.ShowPage(talker, "master_lv3_de_12.htm");
return;

}

}
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, 235) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 43 && i0 != 112 && i2 != 43 && i2 != 112 && i4 != 43 && i4 != 112 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 43);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");

}

} else {
myself.ShowPage(talker, "master_lv3_hef_04.htm");

}

} else if (i0 != 43 && i0 != 112 && i2 != 43 && i2 != 112 && i4 != 43 && i4 != 112 && i6 != 43 && i6 != 112) {
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
myself.RenewSubJob(talker, i8, 43);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}

}
if (ask == 10) {
if (i2 == -1) {
myself.ShowPage(talker, "master_lv3_de_07.htm");

} else {
i8 = 0;
myself.FHTML_SetFileName(fhtml0, "master_lv3_de_03.htm");
if (i0 == 33 || i0 == 34 || i0 == 36 || i0 == 37 || i0 == 40 || i0 == 41 || i0 == 43 || i0 == 106 || i0 == 107 || i0 == 108 || i0 == 109 || i0 == 110 || i0 == 111 || i0 == 112) {
if (i0 > 87) {
i0 = i0 + 1114000;

} else {
i0 = i0 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i2 != -1 && i2 == 33 || i2 == 34 || i2 == 36 || i2 == 37 || i2 == 40 || i2 == 41 || i2 == 43 || i2 == 106 || i2 == 107 || i2 == 108 || i2 == 109 || i2 == 110 || i2 == 111 || i2 == 112) {
if (i2 > 87) {
i2 = i2 + 1114000;

} else {
i2 = i2 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i2, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i4 != -1 && i4 == 33 || i4 == 34 || i4 == 36 || i4 == 37 || i4 == 40 || i4 == 41 || i4 == 43 || i4 == 106 || i4 == 107 || i4 == 108 || i4 == 109 || i4 == 110 || i4 == 111 || i4 == 112) {
if (i4 > 87) {
i4 = i4 + 1114000;

} else {
i4 = i4 + 1000322;

}
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i4, "", "", "", "", ""));

} else {
i8 = i8 + 1;

}
if (i6 != -1 && i6 == 33 || i6 == 34 || i6 == 36 || i6 == 37 || i6 == 40 || i6 == 41 || i6 == 43 || i6 == 106 || i6 == 107 || i6 == 108 || i6 == 109 || i6 == 110 || i6 == 111 || i6 == 112) {
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
myself.FHTML_SetFileName(fhtml0, "master_lv3_hew_01a.htm");
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
myself.ShowPage(talker, "master_lv3_de_06.htm");

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
myself.ShowPage(talker, "master_lv3_de_05.htm");

}
	}


}