package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class subjob_comp extends guild_master {
	protected int chk_my_cat = -1;
	protected int chk_cat1 = 95;
	protected int chk_cat2 = 96;
	protected int chk_cat3 = 97;
	protected int chk_cat4 = 98;
	protected int chk_cat5 = 99;
	protected int chk_cat6 = 100;
	protected int chk_cat7 = 101;
	protected int lv_1st_chk = 65;
	protected int lv_2nd_chk = 70;
	protected int lv_3rd_chk = 75;
	protected int lv_4th_chk = 80;
	protected int sb_id1 = 10280;
	protected int sb_id2 = 10280;
	protected int sb_id3_cat0 = 10612;
	protected int sb_id3_cat1 = 10281;
	protected int sb_id3_cat2 = 10283;
	protected int sb_id3_cat3 = 10282;
	protected int sb_id3_cat4 = 10286;
	protected int sb_id3_cat5 = 10284;
	protected int sb_id3_cat6 = 10285;
	protected int sb_id3_cat7 = 10287;
	protected int sb_id4_cat1 = 10289;
	protected int sb_id4_cat2 = 10290;
	protected int sb_id4_cat3 = 10288;
	protected int sb_id4_cat4 = 10294;
	protected int sb_id4_cat5 = 10292;
	protected int sb_id4_cat6 = 10291;
	protected int sb_id4_cat7 = 10293;
	protected int quest_num11 = 10255;
	protected int quest_num21 = 10258;
	protected int quest_num31 = 10261;
	protected int quest_num41 = 10264;
	protected int quest_num12 = 10256;
	protected int quest_num22 = 10259;
	protected int quest_num32 = 10262;
	protected int quest_num42 = 10265;
	protected int quest_num13 = 10257;
	protected int quest_num23 = 10260;
	protected int quest_num33 = 10263;
	protected int quest_num43 = 10266;
	protected int fstr_base = 1811000;
	protected String fnHi001 = "subclass_comp_03.htm";
	protected String fnHi002 = "subclass_comp_04.htm";
	protected String fnHi003 = "subclass_comp_06.htm";
	protected String fnHi004 = "subclass_comp_05.htm";
	protected String fnHi005 = "subclass_comp_08.htm";
	protected String fnHi070e = "subclass_comp_09.htm";
	protected String fnHi075e = "subclass_comp_10.htm";
	protected String fnHi080e = "subclass_comp_11.htm";
	protected String fnHi008 = "subclass_comp_07.htm";
	protected String fnHi065 = "subclass_comp_65.htm";
	protected String fnHi070 = "subclass_comp_70.htm";
	protected String fnHi075 = "subclass_comp_75.htm";
	protected String fnHi080 = "subclass_comp_80.htm";
	protected String fnHi065s = "subclass_comp_651.htm";
	protected String fnHi070s = "subclass_comp_701.htm";
	protected String fnHi075s = "subclass_comp_751.htm";
	protected String fnHi080s = "subclass_comp_801.htm";
	protected int no_use = 0;
	protected String fnHi009 = "";
	protected int Inven_Check_SysMsg = 2033;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam state, HandlerParam i0, HandlerParam i1, HandlerParam fhtml0) {
if (ask == -281) {
if (no_use == 1) {
myself.ShowPage(talker, fnHi009);
return;

}
if (talker.subjob_id == 0) {
myself.ShowPage(talker, fnHi001);
return;

}
if (myself.IsInCategory(chk_my_cat, talker.occupation) != 1) {
myself.ShowPage(talker, fnHi002);
return;

}
if (talker.level < lv_1st_chk) {
myself.ShowPage(talker, fnHi003);
return;

}
if (talker.subjob_id == 1) {
if (myself.GetOneTimeQuestFlag(talker, quest_num11) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num21) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num31) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num41) == 1) {
myself.ShowPage(talker, fnHi004);
return;

}

} else if (talker.subjob_id == 2) {
if (myself.GetOneTimeQuestFlag(talker, quest_num12) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num22) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num32) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num42) == 1) {
myself.ShowPage(talker, fnHi004);
return;

}

} else if (talker.subjob_id == 3) {
if (myself.GetOneTimeQuestFlag(talker, quest_num13) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num23) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num33) == 1 && myself.GetOneTimeQuestFlag(talker, quest_num43) == 1) {
myself.ShowPage(talker, fnHi004);
return;

}

}
if (talker.transformID != 0) {
myself.ShowPage(talker, "subclass_06.htm");
return;

}
if (reply == 0) {
myself.ShowPage(talker, fnHi008);
return;

} else if (reply == 1) {
if (talker.level >= lv_1st_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num11) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num11, 1);
myself.GiveItem1(talker, sb_id1, 1);
myself.ShowPage(talker, fnHi065s);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num12) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num12, 1);
myself.GiveItem1(talker, sb_id1, 1);
myself.ShowPage(talker, fnHi065s);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num13) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num13, 1);
myself.GiveItem1(talker, sb_id1, 1);
myself.ShowPage(talker, fnHi065s);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi003);
return;

}

} else if (reply == 2) {
if (talker.level >= lv_2nd_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num21) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num21, 1);
myself.GiveItem1(talker, sb_id2, 1);
myself.ShowPage(talker, fnHi070s);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num22) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num22, 1);
myself.GiveItem1(talker, sb_id2, 1);
myself.ShowPage(talker, fnHi070s);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num23) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
myself.SetOneTimeQuestFlag(talker, quest_num23, 1);
myself.GiveItem1(talker, sb_id2, 1);
myself.ShowPage(talker, fnHi070s);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi070e);
return;

}

} else if (reply == 3) {
if (talker.level >= lv_3rd_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num31) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
if (state == 1) {
myself.GiveItem1(talker, sb_id3_cat0, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

}
if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num31, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num32) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
if (state == 1) {
myself.GiveItem1(talker, sb_id3_cat0, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

}
if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num32, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num33) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
if (state == 1) {
myself.GiveItem1(talker, sb_id3_cat0, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

}
if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id3_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num33, 1);
myself.ShowPage(talker, fnHi075s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}

}

}

} else {
myself.ShowPage(talker, fnHi075e);
return;

}

} else if (reply == 4) {
if (talker.level >= lv_4th_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num41) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num41, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num42) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num42, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num43) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else if (myself.IsInCategory(chk_cat1, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat1, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat2, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat2, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat3, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat3, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat4, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat4, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat5, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat5, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat6, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat6, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else if (myself.IsInCategory(chk_cat7, talker.occupation) == 1) {
myself.GiveItem1(talker, sb_id4_cat7, 1);
myself.SetOneTimeQuestFlag(talker, quest_num43, 1);
myself.ShowPage(talker, fnHi080s);
return;

} else {
myself.ShowPage(talker, fnHi002);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi080e);
return;

}

} else if (reply == 65) {
if (talker.level >= lv_1st_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num11) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob1_class;
myself.FHTML_SetFileName(fhtml0, fnHi065);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num12) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob2_class;
myself.FHTML_SetFileName(fhtml0, fnHi065);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num13) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob3_class;
myself.FHTML_SetFileName(fhtml0, fnHi065);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi003);
return;

}

} else if (reply == 70) {
if (talker.level >= lv_2nd_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num21) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob1_class;
myself.FHTML_SetFileName(fhtml0, fnHi070);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num22) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob2_class;
myself.FHTML_SetFileName(fhtml0, fnHi070);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num23) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob3_class;
myself.FHTML_SetFileName(fhtml0, fnHi070);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi070e);
return;

}

} else if (reply == 75) {
if (talker.level >= lv_3rd_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num31) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob1_class;
myself.FHTML_SetFileName(fhtml0, fnHi075);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num32) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob2_class;
myself.FHTML_SetFileName(fhtml0, fnHi075);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num33) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob3_class;
myself.FHTML_SetFileName(fhtml0, fnHi075);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi075e);
return;

}

} else if (reply == 80) {
if (talker.level >= lv_4th_chk) {
switch (talker.subjob_id) {
case 0: {
myself.ShowPage(talker, fnHi001);
return;

}
case 1: {
if (myself.GetOneTimeQuestFlag(talker, quest_num41) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob1_class;
myself.FHTML_SetFileName(fhtml0, fnHi080);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 2: {
if (myself.GetOneTimeQuestFlag(talker, quest_num42) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob2_class;
myself.FHTML_SetFileName(fhtml0, fnHi080);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}
case 3: {
if (myself.GetOneTimeQuestFlag(talker, quest_num43) == 1) {
myself.ShowPage(talker, fnHi005);
return;

} else {
i0 = fstr_base + talker.subjob3_class;
myself.FHTML_SetFileName(fhtml0, fnHi080);
myself.FHTML_SetStr(fhtml0, "job", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}

} else {
myself.ShowPage(talker, fnHi080e);
return;

}

}

}
super;
	}


}