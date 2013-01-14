package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master_kamael_subjob extends subjob_comp {
	protected int gender = 1;
	protected int lv1_class1 = 123;
	protected int lv1_class2 = 124;
	protected int lv2_class11 = 125;
	protected int lv2_class21 = 126;
	protected int proof111 = 62;
	protected int proof112 = 9753;
	protected int proof121 = 63;
	protected int proof122 = 9772;
	protected int lv2_class1 = 125;
	protected int lv2_class2 = 126;
	protected int lv3_class11 = 127;
	protected int lv3_class12 = 128;
	protected int lv3_class21 = 129;
	protected int lv3_class22 = 130;
	protected int proof211 = 64;
	protected int proof212 = 9760;
	protected int proof221 = 65;
	protected int proof222 = 9806;
	protected int proof231 = 66;
	protected int proof232 = 9782;
	protected String fnClassList11 = "master_all_kamael003m.htm";
	protected String fnClassList12 = "master_all_kamael003f.htm";
	protected String fnLowLevelNoProof11 = "master_all_kamael008ma.htm";
	protected String fnLowLevelNoProof12 = "master_all_kamael008fa.htm";
	protected String fnLowLevel11 = "master_all_kamael009ma.htm";
	protected String fnLowLevel12 = "master_all_kamael009fa.htm";
	protected String fnNoProof11 = "master_all_kamael010ma.htm";
	protected String fnNoProof12 = "master_all_kamael010fa.htm";
	protected String fnAfterClassChange11 = "master_all_kamael011ma.htm";
	protected String fnAfterClassChange12 = "master_all_kamael011fa.htm";
	protected String fnClassList21 = "";
	protected String fnClassList22 = "";
	protected String fnClassList23 = "";
	protected String fnClassList24 = "";
	protected String fnLowLevelNoProof21 = "master_all_kamael008msa.htm";
	protected String fnLowLevelNoProof22 = "master_all_kamael008fsa.htm";
	protected String fnLowLevelNoProof23 = "master_all_kamael008fsa.htm";
	protected String fnLowLevelNoProof24 = "master_all_kamael008wa.htm";
	protected String fnLowLevel21 = "master_all_kamael009msa.htm";
	protected String fnLowLevel22 = "master_all_kamael009fsa.htm";
	protected String fnLowLevel23 = "master_all_kamael009fsa.htm";
	protected String fnLowLevel24 = "master_all_kamael009wa.htm";
	protected String fnNoProof21 = "master_all_kamael010msa.htm";
	protected String fnNoProof22 = "master_all_kamael010fsa.htm";
	protected String fnNoProof23 = "master_all_kamael010fsa.htm";
	protected String fnNoProof24 = "master_all_kamael010wa.htm";
	protected String fnAfterClassChange21 = "master_all_kamael011msa.htm";
	protected String fnAfterClassChange22 = "master_all_kamael011fsa.htm";
	protected String fnAfterClassChange23 = "master_all_kamael011fsa.htm";
	protected String fnAfterClassChange24 = "master_all_kamael011wa.htm";
	protected int weapon_ticket = 8869;
	protected int weapon_ticket_2 = 8870;
	protected int num_of_tickets = 15;
	protected int subjob_quest = 236;
	protected int fstr_subjob_renew = 1115000;
	protected int fstr_subjob_change = 1116000;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2) {
if (talker.race != 5 && reply >= 5) {
myself.ShowPage(talker, "subclass_kamael_05.htm");
return;

}
switch (reply) {
case 5: {
if (talker.transformID == 0) {
if (talker.race == 5) {
myself.ShowPage(talker, "subclass_kamael_01.htm");
return;

}

} else {
myself.ShowPage(talker, "subclass_kamael_06.htm");
return;

}
break;

}
case 10: {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0) {
myself.ShowPage(talker, "master_all_kamael_02.htm");
return;

} else {
myself.GetSubJobList(talker, 0, 0);

}
break;

}
case 11: {
myself.GetSubJobList(talker, 1, 0);
break;

}
case 12: {
myself.GetSubJobList(talker, 2, 0);
break;

}
case 13: {
myself.GetSubJobList(talker, 3, 0);
break;

}
case 14: {
myself.GetSubJobList(talker, 4, 0);
break;

}
case 30: {
myself.GetSubJobList(talker, 10, 0);
break;

}
case 40: {
if (talker.level < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
c0 = gg.GetNullCreature();
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0) {
myself.ShowPage(talker, "master_all_kamael_02.htm");
return;

} else {
myself.GetSubJobList(talker, 20, 0);

}
break;

}
case 41: {
if (talker.level < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
c0 = gg.GetNullCreature();
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0) {
myself.ShowPage(talker, "master_all_kamael_02.htm");
return;

} else if (state == 1) {
myself.ShowPage(talker, "master_all_kamael_01b.htm");

} else {
myself.ShowPage(talker, "master_all_kamael_20.htm");

}
break;

}
case 42: {
myself.GetSubJobList(talker, 1, state);
break;

}
case 43: {
myself.GetSubJobList(talker, 2, state);
break;

}
case 44: {
myself.GetSubJobList(talker, 3, state);
break;

}
case 45: {
break;

}
case 411: {
if (talker.occupation == 127) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 127);

}
break;

}
case 412: {
if (talker.occupation == 128) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 128);

}
break;

}
case 413: {
if (talker.occupation == 129) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 129);

}
break;

}
case 414: {
if (talker.occupation == 130) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 130);

}
break;

}
case 415: {
if (talker.occupation == 131) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 131);

}
break;

}
case 416: {
if (talker.occupation == 132) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 132);

}
break;

}
case 417: {
if (talker.occupation == 133) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 133);

}
break;

}
case 418: {
if (talker.occupation == 134) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 134);

}
break;

}
case 419: {
if (talker.occupation == 135) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 135);

}
break;

}
case 420: {
if (talker.occupation == 136) {
myself.ShowPage(talker, "master_all_kamael_16.htm");
return;

}
if (talker.alive) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
myself.ChangeSubJob(talker, 136);

}
break;

}

}

}
super;
	}

	protected void SUBJOB_CREATED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, "master_all_kamael_17.htm");

} else {
myself.ShowPage(talker, "master_all_kamael_06.htm");

}
	}

	protected void SUBJOB_RENEWED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == -1 && talker.alive == 0) {
myself.ShowPage(talker, "master_all_kamael_18.htm");

} else {
if (i0 == 97) {
myself.DeleteItem1(talker, 15307, gg.OwnItemCount(talker, 15307));

} else if (i0 == 105) {
myself.DeleteItem1(talker, 15308, gg.OwnItemCount(talker, 15308));

} else if (i0 == 112) {
myself.DeleteItem1(talker, 15309, gg.OwnItemCount(talker, 15309));

}
myself.ShowPage(talker, "master_all_kamael_05.htm");

}
	}

	protected void SUBJOB_CHANGED(HandlerParam talker, HandlerParam reply, HandlerParam level) {
if (reply == -1) {
myself.ShowPage(talker, "master_all_kamael_18.htm");

} else {
myself.ShowPage(talker, "master_all_kamael_05.htm");

}
	}

	protected void SUBJOB_LIST_INFORMED(HandlerParam talker, HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam fhtml0) {
switch (ask) {
case 0: {
if (i2 != -1 && i3 >= 75 && i4 != -1 && i5 >= 75) {
myself.ShowPage(talker, "master_all_kamael_01z.htm");
return;

} else {
myself.ShowPage(talker, "master_all_kamael_01.htm");
return;

}

}
case 1: {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, subjob_quest) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 127 && i0 != 131 && i2 != 127 && i2 != 131 && i4 != 127 && i4 != 131 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 127);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");
return;

}

} else {
myself.ShowPage(talker, "master_all_kamael_04.htm");
return;

}

} else if (i0 != 127 && i0 != 131 && i2 != 127 && i2 != 131 && i4 != 127 && i4 != 131) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 127);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}
break;

}
case 2: {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, subjob_quest) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 == 127 || i0 == 131 && i0 != 129 && i0 != 133 && i2 != 129 && i2 != 133 && i4 != 129 && i4 != 133 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 129);

} else if (i0 == 130 || i0 == 134 && i0 != 128 && i0 != 132 && i2 != 128 && i2 != 132 && i4 != 128 && i4 != 132 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 128);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");
return;

}

} else {
myself.ShowPage(talker, "master_all_kamael_04.htm");
return;

}

} else if (i0 == 127 || i0 == 131 && i0 != 129 && i0 != 133 && i2 != 129 && i2 != 133 && i4 != 129 && i4 != 133 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 129);

} else if (i0 == 130 || i0 == 134 && i0 != 129 && i0 != 133 && i2 != 129 && i2 != 133 && i4 != 129 && i4 != 133 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 128);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");
return;

}
break;

}
case 3: {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, subjob_quest) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 130 && i0 != 134 && i2 != 130 && i2 != 134 && i4 != 130 && i4 != 134 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 130);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");
return;

}

} else {
myself.ShowPage(talker, "master_all_kamael_04.htm");
return;

}

} else if (i0 != 130 && i0 != 134 && i2 != 130 && i2 != 134 && i4 != 130 && i4 != 134) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 130);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}
break;

}
case 4: {
if (i8 == 0) {
if (i2 == -1 && myself.GetOneTimeQuestFlag(talker, subjob_quest) || i2 != -1 && i3 >= 75 && i4 == -1 || i4 != -1 && i5 >= 75 && i6 == -1) {
if (i0 != 135 && i0 != 136 && i2 != 135 && i2 != 136 && i4 != 135 && i4 != 136 && i6 == -1 && myself.IsInCategory(8, i0) || myself.IsInCategory(9, i0)) {
myself.CreateSubJob(talker, 135);

} else {
myself.ShowPage(talker, "subclass_error_01.htm");
return;

}

} else {
myself.ShowPage(talker, "master_all_kamael_04.htm");
return;

}

} else if (i0 != 135 && i0 != 136 && i2 != 135 && i2 != 136 && i4 != 135 && i4 != 136) {
if (i8 == 1 && i3 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 2 && i5 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
if (i8 == 3 && i7 < 40) {
myself.ShowPage(talker, "master_all_kamael_19.htm");
return;

}
myself.RenewSubJob(talker, i8, 135);

} else {
myself.ShowPage(talker, "subclass_error_02.htm");

}
break;

}
case 10: {
if (i2 == -1) {
myself.ShowPage(talker, "master_all_kamael_07.htm");

} else {
i10 = 0;
myself.FHTML_SetFileName(fhtml0, "master_all_kamael_03.htm");
if (i0 > -1 && i0 >= 127 && i0 <= 136) {
i9 = i0 + fstr_subjob_change;
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i9, "", "", "", "", ""));
i9 = 0;

} else {
i10 = i10 + 1;

}
if (i2 > -1 && i2 >= 127 && i2 <= 136) {
i9 = i2 + fstr_subjob_change;
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i9, "", "", "", "", ""));
i9 = 0;

} else {
i10 = i10 + 1;

}
if (i4 > -1 && i4 >= 127 && i4 <= 136) {
i9 = i4 + fstr_subjob_change;
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i9, "", "", "", "", ""));
i9 = 0;

} else {
i10 = i10 + 1;

}
if (i6 > -1 && i6 >= 127 && i6 <= 136) {
i9 = i6 + fstr_subjob_change;
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i9, "", "", "", "", ""));
i9 = 0;

} else {
i10 = i10 + 1;

}
if (i10 != 4) {
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "master_lv3_hef_07a.htm");

}

}
break;

}
case 20: {
if (i2 != -1) {
if (i4 == -1) {
myself.FHTML_SetFileName(fhtml0, "master_all_kamael_01a.htm");
if (i2 >= 127) {
i9 = i2 + fstr_subjob_renew;
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i9, "", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml0);
return;

} else {
myself.ShowPage(talker, "master_all_kamael_20.htm");

}

} else {
myself.ShowPage(talker, "subclass_error_03.htm");

}
break;

}

}
super;
	}


}