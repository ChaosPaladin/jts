package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_rim_gift_giver extends default_npc {
	protected int Level = 0;
	protected int required_PCCafePoint = 1000;
	protected int AverageScore_GradeG = 9000;
	protected int AverageScore_GradeS = 7000;
	protected int AverageScore_GradeA = 5500;
	protected int AverageScore_GradeB = 4500;
	protected int AverageScore_GradeC = 2500;
	protected int AverageScore_GradeD = 500;
	protected int ScoreMod_1st_Class = 9;
	protected int ScoreMod_2nd_Attacker = 9;
	protected int ScoreMod_2nd_Wizard = 8;
	protected int ScoreMod_2nd_Cleric = 9;
	protected int ScoreMod_M_Defensive = 9;
	protected int ScoreMod_M_Offensive = 9;
	protected int ScoreMod_Rogue = 9;
	protected int ScoreMod_W_Offensive = 8;
	protected int ScoreMod_W_Defensive = 8;
	protected int GotRankG = 110;
	protected int GotRankS = 100;
	protected int GotRankA = 90;
	protected int GotRankB = 80;
	protected int GotRankC = 70;
	protected int GotRankD = 60;
	protected int GotRankF = 50;
	protected int gift_25_GradeD = 12824;
	protected int gift_25_GradeC = 10836;
	protected int gift_25_GradeB = 10837;
	protected int gift_25_GradeA = 10838;
	protected int gift_25_GradeS = 10844;
	protected int gift_30_GradeD = 12825;
	protected int gift_30_GradeC = 10837;
	protected int gift_30_GradeB = 10838;
	protected int gift_30_GradeA = 10841;
	protected int gift_30_GradeS = 12827;
	protected int gift_35_GradeD = 10840;
	protected int gift_35_GradeC = 10841;
	protected int gift_35_GradeB = 10842;
	protected int gift_35_GradeA = 10843;
	protected int gift_35_GradeS = 10844;
	protected int gift_40_GradeD = 12826;
	protected int gift_40_GradeC = 10842;
	protected int gift_40_GradeB = 10843;
	protected int gift_40_GradeA = 10846;
	protected int gift_40_GradeS = 12829;
	protected int gift_45_GradeD = 10845;
	protected int gift_45_GradeC = 10846;
	protected int gift_45_GradeB = 10847;
	protected int gift_45_GradeA = 10848;
	protected int gift_45_GradeS = 10849;
	protected int gift_50_GradeD = 12828;
	protected int gift_50_GradeC = 10847;
	protected int gift_50_GradeB = 10848;
	protected int gift_50_GradeA = 10851;
	protected int gift_50_GradeS = 12831;
	protected int gift_55_GradeD = 10850;
	protected int gift_55_GradeC = 10851;
	protected int gift_55_GradeB = 10852;
	protected int gift_55_GradeA = 10853;
	protected int gift_55_GradeS = 10854;
	protected int gift_60_GradeD = 12830;
	protected int gift_60_GradeC = 10852;
	protected int gift_60_GradeB = 10853;
	protected int gift_60_GradeA = 10856;
	protected int gift_60_GradeS = 12833;
	protected int gift_65_GradeD = 10855;
	protected int gift_65_GradeC = 10856;
	protected int gift_65_GradeB = 10857;
	protected int gift_65_GradeA = 10858;
	protected int gift_65_GradeS = 10859;
	protected int gift_70_GradeD = 12832;
	protected int gift_70_GradeC = 10857;
	protected int gift_70_GradeB = 10858;
	protected int gift_70_GradeA = 10861;
	protected int gift_70_GradeS = 12834;
	protected int gift_75_GradeD = 10860;
	protected int gift_75_GradeC = 10861;
	protected int gift_75_GradeB = 10862;
	protected int gift_75_GradeA = 10863;
	protected int gift_75_GradeS = 10864;
	protected int gift_75_GradeG = 10865;
	protected int rim_ticket = 13002;
	protected int Ticket_25Lv = 4;
	protected int Ticket_30Lv = 4;
	protected int Ticket_35Lv = 4;
	protected int Ticket_40Lv = 5;
	protected int Ticket_45Lv = 5;
	protected int Ticket_50Lv = 5;
	protected int Ticket_55Lv = 6;
	protected int Ticket_60Lv = 6;
	protected int Ticket_65Lv = 7;
	protected int Ticket_70Lv = 8;
	protected int Ticket_75Lv = 8;
	protected int Ticket_75GLv = 10;
	protected int TM_GiftAvailableTIme = 78001;
	protected int GiftAvailableTIme = 300;
	protected String fnHi = "npc_rim_gift_giver001.htm";
	protected String fnGrade = "npc_rim_gift_giver002.htm";
	protected String fnGift = "npc_rim_gift_giver003.htm";
	protected String fnNoGiftLeft = "npc_rim_gift_giver004.htm";
	protected String fnNoGradeYet = "npc_rim_gift_giver002a.htm";
	protected String fnFailedGrade = "npc_rim_gift_giver002b.htm";
	protected int Log_FinalScore = 1018;
	protected String MyMakerName = "rim25_trr_testm1";
	protected int pccafe_pass_mode = 0;
	protected int babble_mode = 0;
	protected int log_mode = 1;
	protected int Inven_Check_SysMsg = 1118;

	protected void CREATED() {
myself.i_ai0 = -9999;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 10;
myself.i_ai4 = 0;
myself.BroadcastScriptEvent(1000, 0, 5000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010045) {
myself.BroadcastScriptEvent(1000, 0, 5000);
myself.i_ai0 = script_event_arg2;
if (script_event_arg3 != 0) {
myself.i_ai3 = script_event_arg3;

}
if (babble_mode == 1) {
myself.Shout("SCE_KANABION_MAKER_REPORT 받음: 득점" + gg.IntToStr(myself.i_ai0) + ", 스케일" + gg.IntToStr(myself.i_ai3));

}
myself.AddTimerEx(TM_GiftAvailableTIme, GiftAvailableTIme * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TM_GiftAvailableTIme) {
if (babble_mode == 1) {
myself.Shout("시간 초과: 인존 닫음");

}
myself.InstantZone_Finish(5);

}
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam fhtml0, HandlerParam fhtml1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (ask == -7801) {
if (reply == 1) {
if (myself.i_ai0 == -9999) {
if (babble_mode == 1) {
myself.Say("아직 결과를 받지 못함");

}
myself.ShowPage(talker, fnNoGradeYet);
return;

} else if (myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
if (babble_mode == 1) {
myself.Say("결과 받았음. 보상 보겠는가?");

}
if (myself.i_ai1 == 0 && myself.i_ai4 == 0) {
if (talker.is_pc == 1) {
if (myself.IsInCategory(6, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 초보 직업군");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_1st_Class / 10;

} else if (myself.IsInCategory(7, talker.occupation)) {
if (myself.IsInCategory(112, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 2차 격수(근접 딜러)");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_2nd_Attacker / 10;

} else if (myself.IsInCategory(2, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 2차 위자(원거리 딜러)");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_2nd_Wizard / 10;

} else if (myself.IsInCategory(3, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 2차 클레 (버퍼)");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_2nd_Cleric / 10;

}

} else if (myself.IsInCategory(84, talker.occupation) || myself.IsInCategory(85, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 3차 탱커, 바드");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_M_Defensive / 10;

} else if (myself.IsInCategory(86, talker.occupation) || myself.IsInCategory(87, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 3차 워리어, 오크, 드워프, 카마엘");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_M_Offensive / 10;

} else if (myself.IsInCategory(88, talker.occupation) || myself.IsInCategory(89, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 3~4차 궁수, 단검");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_Rogue / 10;

} else if (myself.IsInCategory(91, talker.occupation) || myself.IsInCategory(12, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 3~4차 A위자, 소환사");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_W_Offensive / 10;

} else if (myself.IsInCategory(90, talker.occupation) || myself.IsInCategory(92, talker.occupation)) {
if (babble_mode == 1) {
myself.Say("PC직업: 3~4차 D위자");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_W_Defensive / 10;

} else {
if (babble_mode == 1) {
myself.Say("PC직업: 클래스 정보 오류");

}
myself.i_ai0 = myself.i_ai0 * ScoreMod_W_Offensive / 10;

}

}
i5 = gg.FloatToInt(AverageScore_GradeG * myself.i_ai3 / 10);
i4 = gg.FloatToInt(AverageScore_GradeS * myself.i_ai3 / 10);
i3 = gg.FloatToInt(AverageScore_GradeA * myself.i_ai3 / 10);
i2 = gg.FloatToInt(AverageScore_GradeB * myself.i_ai3 / 10);
i1 = gg.FloatToInt(AverageScore_GradeC * myself.i_ai3 / 10);
i0 = gg.FloatToInt(AverageScore_GradeD * myself.i_ai3 / 10);
if (babble_mode == 1) {
if (Level == 75) {
myself.Say("**G등급: " + gg.IntToStr(i5) + "~");

}
myself.Say("**S등급: " + gg.IntToStr(i4) + "~");
myself.Say("**A등급: " + gg.IntToStr(i3) + "~");
myself.Say("**B등급: " + gg.IntToStr(i2) + "~");
myself.Say("**C등급: " + gg.IntToStr(i1) + "~");
myself.Say("**D등급: " + gg.IntToStr(i0) + "~");

}
if (Level == 75 && myself.i_ai0 >= i5) {
myself.i_ai1 = GotRankG;

} else if (myself.i_ai0 >= i4) {
myself.i_ai1 = GotRankS;

} else if (myself.i_ai0 >= i3) {
myself.i_ai1 = GotRankA;

} else if (myself.i_ai0 >= i2) {
myself.i_ai1 = GotRankB;

} else if (myself.i_ai0 >= i1) {
myself.i_ai1 = GotRankC;

} else if (myself.i_ai0 >= i0) {
myself.i_ai1 = GotRankD;

} else {
myself.i_ai1 = GotRankF;

}
if (babble_mode == 1) {
myself.Shout("결정 등급:" + gg.IntToStr(myself.i_ai1));

}
if (babble_mode == 1) {
myself.Shout("포인트 저장: " + gg.IntToStr(myself.i_ai0));

}
gg.SetPoint_RimKamaroka(talker, myself.i_ai0, myself.InstantZone_GetId());
if (log_mode == 1) {
gg.AddLogEx(Log_FinalScore, talker, myself.i_ai0, 0);

}
myself.i_ai4 = 1;

}
if (myself.i_ai1 == GotRankG) {
if (babble_mode == 1) {
myself.Shout("G등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800162, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800163, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankS) {
if (babble_mode == 1) {
myself.Shout("S등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800164, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800170, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankA) {
if (babble_mode == 1) {
myself.Shout("A등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800165, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800171, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankB) {
if (babble_mode == 1) {
myself.Shout("B등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800166, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800172, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankC) {
if (babble_mode == 1) {
myself.Shout("C등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800167, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800173, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankD) {
if (babble_mode == 1) {
myself.Shout("D등급");

}
myself.FHTML_SetFileName(fhtml0, fnGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800168, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800174, "", "", "", "", ""));

} else if (myself.i_ai1 == GotRankF) {
if (babble_mode == 1) {
myself.Shout("F등급 - 보상: 없음");

}
myself.FHTML_SetFileName(fhtml0, fnFailedGrade);
myself.FHTML_SetStr(fhtml0, "grade", gg.MakeFString(1800169, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "desc", gg.MakeFString(1800175, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "ticket", gg.MakeFString(1800189, "", "", "", "", ""));

}
if (myself.i_ai1 == GotRankG || myself.i_ai1 == GotRankS) {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800190, "", "", "", "", ""));

} else {
switch (gg.Rand(7)) {
case 0: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800191, "", "", "", "", ""));
break;

}
case 1: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800192, "", "", "", "", ""));
break;

}
case 2: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800193, "", "", "", "", ""));
break;

}
case 3: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800194, "", "", "", "", ""));
break;

}
case 4: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800195, "", "", "", "", ""));
break;

}
case 5: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800196, "", "", "", "", ""));
break;

}
case 6: {
myself.FHTML_SetStr(fhtml0, "hint", gg.MakeFString(1800201, "", "", "", "", ""));
break;

}

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowSystemMessage(talker, 1710);

}

} else if (reply == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (myself.i_ai2 != 0) {
if (babble_mode == 1) {
myself.Say("이미 보상을 받았음");

}
myself.ShowPage(talker, fnNoGiftLeft);
return;

} else if (myself.UpdatePCCafePoint(talker, -1000) == 1 || pccafe_pass_mode == 2) {
myself.InstantZone_MarkRestriction();
if (myself.i_ai1 == GotRankG) {
myself.GiveItem1(talker, gift_75_GradeG, 1);

} else if (myself.i_ai1 == GotRankS) {
if (Level == 25) {
myself.GiveItem1(talker, gift_25_GradeS, 1);

} else if (Level == 30) {
myself.GiveItem1(talker, gift_30_GradeS, 1);

} else if (Level == 35) {
myself.GiveItem1(talker, gift_35_GradeS, 1);

} else if (Level == 40) {
myself.GiveItem1(talker, gift_40_GradeS, 1);

} else if (Level == 45) {
myself.GiveItem1(talker, gift_45_GradeS, 1);

} else if (Level == 50) {
myself.GiveItem1(talker, gift_50_GradeS, 1);

} else if (Level == 55) {
myself.GiveItem1(talker, gift_55_GradeS, 1);

} else if (Level == 60) {
myself.GiveItem1(talker, gift_60_GradeS, 1);

} else if (Level == 65) {
myself.GiveItem1(talker, gift_65_GradeS, 1);

} else if (Level == 70) {
myself.GiveItem1(talker, gift_70_GradeS, 1);

} else if (Level == 75) {
myself.GiveItem1(talker, gift_75_GradeS, 1);

} else if (babble_mode == 1) {
myself.Say("아이템 정보 오류!");

}

} else if (myself.i_ai1 == GotRankA) {
if (Level == 25) {
myself.GiveItem1(talker, gift_25_GradeA, 1);

} else if (Level == 30) {
myself.GiveItem1(talker, gift_30_GradeA, 1);

} else if (Level == 35) {
myself.GiveItem1(talker, gift_35_GradeA, 1);

} else if (Level == 40) {
myself.GiveItem1(talker, gift_40_GradeA, 1);

} else if (Level == 45) {
myself.GiveItem1(talker, gift_45_GradeA, 1);

} else if (Level == 50) {
myself.GiveItem1(talker, gift_50_GradeA, 1);

} else if (Level == 55) {
myself.GiveItem1(talker, gift_55_GradeA, 1);

} else if (Level == 60) {
myself.GiveItem1(talker, gift_60_GradeA, 1);

} else if (Level == 65) {
myself.GiveItem1(talker, gift_65_GradeA, 1);

} else if (Level == 70) {
myself.GiveItem1(talker, gift_70_GradeA, 1);

} else if (Level == 75) {
myself.GiveItem1(talker, gift_75_GradeA, 1);

} else if (babble_mode == 1) {
myself.Say("아이템 정보 오류!");

}

} else if (myself.i_ai1 == GotRankB) {
if (Level == 25) {
myself.GiveItem1(talker, gift_25_GradeB, 1);

} else if (Level == 30) {
myself.GiveItem1(talker, gift_30_GradeB, 1);

} else if (Level == 35) {
myself.GiveItem1(talker, gift_35_GradeB, 1);

} else if (Level == 40) {
myself.GiveItem1(talker, gift_40_GradeB, 1);

} else if (Level == 45) {
myself.GiveItem1(talker, gift_45_GradeB, 1);

} else if (Level == 50) {
myself.GiveItem1(talker, gift_50_GradeB, 1);

} else if (Level == 55) {
myself.GiveItem1(talker, gift_55_GradeB, 1);

} else if (Level == 60) {
myself.GiveItem1(talker, gift_60_GradeB, 1);

} else if (Level == 65) {
myself.GiveItem1(talker, gift_65_GradeB, 1);

} else if (Level == 70) {
myself.GiveItem1(talker, gift_70_GradeB, 1);

} else if (Level == 75) {
myself.GiveItem1(talker, gift_75_GradeB, 1);

} else if (babble_mode == 1) {
myself.Say("아이템 정보 오류!");

}

} else if (myself.i_ai1 == GotRankC) {
if (Level == 25) {
myself.GiveItem1(talker, gift_25_GradeC, 1);

} else if (Level == 30) {
myself.GiveItem1(talker, gift_30_GradeC, 1);

} else if (Level == 35) {
myself.GiveItem1(talker, gift_35_GradeC, 1);

} else if (Level == 40) {
myself.GiveItem1(talker, gift_40_GradeC, 1);

} else if (Level == 45) {
myself.GiveItem1(talker, gift_45_GradeC, 1);

} else if (Level == 50) {
myself.GiveItem1(talker, gift_50_GradeC, 1);

} else if (Level == 55) {
myself.GiveItem1(talker, gift_55_GradeC, 1);

} else if (Level == 60) {
myself.GiveItem1(talker, gift_60_GradeC, 1);

} else if (Level == 65) {
myself.GiveItem1(talker, gift_65_GradeC, 1);

} else if (Level == 70) {
myself.GiveItem1(talker, gift_70_GradeC, 1);

} else if (Level == 75) {
myself.GiveItem1(talker, gift_75_GradeC, 1);

} else if (babble_mode == 1) {
myself.Say("아이템 정보 오류!");

}

} else if (myself.i_ai1 == GotRankD) {
if (Level == 25) {
myself.GiveItem1(talker, gift_25_GradeD, 1);

} else if (Level == 30) {
myself.GiveItem1(talker, gift_30_GradeD, 1);

} else if (Level == 35) {
myself.GiveItem1(talker, gift_35_GradeD, 1);

} else if (Level == 40) {
myself.GiveItem1(talker, gift_40_GradeD, 1);

} else if (Level == 45) {
myself.GiveItem1(talker, gift_45_GradeD, 1);

} else if (Level == 50) {
myself.GiveItem1(talker, gift_50_GradeD, 1);

} else if (Level == 55) {
myself.GiveItem1(talker, gift_55_GradeD, 1);

} else if (Level == 60) {
myself.GiveItem1(talker, gift_60_GradeD, 1);

} else if (Level == 65) {
myself.GiveItem1(talker, gift_65_GradeD, 1);

} else if (Level == 70) {
myself.GiveItem1(talker, gift_70_GradeD, 1);

} else if (Level == 75) {
myself.GiveItem1(talker, gift_75_GradeD, 1);

} else if (babble_mode == 1) {
myself.Say("아이템 정보 오류!");

}

} else if (babble_mode == 1) {
myself.Say("등급 정보 오류!");

}
myself.FHTML_SetFileName(fhtml1, fnGift);
if (Level == 25) {
myself.GiveItem1(talker, rim_ticket, Ticket_25Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 30) {
myself.GiveItem1(talker, rim_ticket, Ticket_30Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 35) {
myself.GiveItem1(talker, rim_ticket, Ticket_35Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 40) {
myself.GiveItem1(talker, rim_ticket, Ticket_40Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 45) {
myself.GiveItem1(talker, rim_ticket, Ticket_45Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 50) {
myself.GiveItem1(talker, rim_ticket, Ticket_50Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 55) {
myself.GiveItem1(talker, rim_ticket, Ticket_55Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 60) {
myself.GiveItem1(talker, rim_ticket, Ticket_60Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 65) {
myself.GiveItem1(talker, rim_ticket, Ticket_65Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 70) {
myself.GiveItem1(talker, rim_ticket, Ticket_70Lv);
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else if (Level == 75) {
if (myself.i_ai1 == GotRankG) {
myself.GiveItem1(talker, rim_ticket, Ticket_75GLv);

} else {
myself.GiveItem1(talker, rim_ticket, Ticket_75Lv);

}
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800187, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml1, "ticket", gg.MakeFString(1800189, "", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml1);
myself.i_ai2 = 1;

} else {
myself.ShowSystemMessage(talker, 1710);

}

} else if (reply == 3) {
if (babble_mode == 1) {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 3000, 0, "인존 내보냄");

}
myself.InstantZone_Leave(talker);
myself.i_ai0 = 0;
myself.InstantZone_Finish(5);

}

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (babble_mode == 1 && gg.OwnItemCount(attacker, 57) > 1) {
if (babble_mode == 1) {
myself.Shout("[테스트용]포인트 저장: " + gg.IntToStr(gg.OwnItemCount(attacker, 57)));

}
gg.SetPoint_RimKamaroka(attacker, myself.i_ai0, myself.InstantZone_GetId());

}
	}


}