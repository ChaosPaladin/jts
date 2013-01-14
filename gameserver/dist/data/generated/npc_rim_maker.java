package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_rim_maker extends default_npc {
	protected int Level = 0;
	protected int Buff1 = 377618433;
	protected int Buff2 = 378470401;
	protected int rim_multisell = 642;
	protected int inzone25_inzone_type = 46;
	protected int inzone30_inzone_type = 47;
	protected int inzone35_inzone_type = 48;
	protected int inzone40_inzone_type = 49;
	protected int inzone45_inzone_type = 50;
	protected int inzone50_inzone_type = 51;
	protected int inzone55_inzone_type = 52;
	protected int inzone60_inzone_type = 53;
	protected int inzone65_inzone_type = 54;
	protected int inzone70_inzone_type = 55;
	protected int inzone75_inzone_type = 56;
	protected int enter_type = 0;
	protected int required_PCCafePoint = 1000;
	protected String fnHi = "npc_rim_maker001.htm";
	protected String fnInZoneList4 = "npc_rim_maker002.htm";
	protected String fnInZoneList3 = "npc_rim_maker002a.htm";
	protected String fnInZoneList2 = "npc_rim_maker002b.htm";
	protected String fnInZoneList1 = "npc_rim_maker002c.htm";
	protected String fnNotCafeUser = "npc_rim_maker003.htm";
	protected String fnEnterFailed = "npc_rim_maker004.htm";
	protected String fnCafeButPartyUser = "npc_rim_maker005.htm";
	protected String fnEnlistedUser = "npc_rim_maker006.htm";
	protected String fnRimInfo = "npc_rim_maker007.htm";
	protected int rim_ticket = 13002;
	protected int RewardD = 13003;
	protected int RewardC = 13004;
	protected int RewardB = 13005;
	protected int RewardA = 13006;
	protected int RewardS = 13007;
	protected int RewardD_Price = 10;
	protected int RewardC_Price = 20;
	protected int RewardB_Price = 50;
	protected int RewardA_Price = 100;
	protected int RewardS_Price = 200;
	protected String fnRankingBoard = "npc_rim_maker010.htm";
	protected int AverageScore_GradeG = 9000;
	protected int AverageScore_GradeS = 7000;
	protected int AverageScore_GradeA = 5500;
	protected int AverageScore_GradeB = 4500;
	protected int AverageScore_GradeC = 2500;
	protected int AverageScore_GradeD = 500;
	protected int TM_Broadcast = 78001;
	protected int Time_Broadcast = 600;
	protected int pccafe_pass_mode = 0;
	protected int babble_mode = 0;
	protected int ScaleModValue = 10;
	protected int Inven_Check_SysMsg = 1118;
	protected int TelTown = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
switch (Level) {
case 20: {
myself.i_ai0 = inzone25_inzone_type;
myself.i_ai1 = inzone30_inzone_type;
break;

}
case 30: {
myself.i_ai0 = inzone25_inzone_type;
myself.i_ai1 = inzone30_inzone_type;
myself.i_ai2 = inzone35_inzone_type;
break;

}
case 40: {
myself.i_ai0 = inzone35_inzone_type;
myself.i_ai1 = inzone40_inzone_type;
myself.i_ai2 = inzone45_inzone_type;
break;

}
case 50: {
myself.i_ai0 = inzone40_inzone_type;
myself.i_ai1 = inzone45_inzone_type;
myself.i_ai2 = inzone50_inzone_type;
myself.i_ai3 = inzone55_inzone_type;
break;

}
case 60: {
myself.i_ai0 = inzone50_inzone_type;
myself.i_ai1 = inzone55_inzone_type;
myself.i_ai2 = inzone60_inzone_type;
myself.i_ai3 = inzone65_inzone_type;
break;

}
case 70: {
myself.i_ai0 = inzone60_inzone_type;
myself.i_ai1 = inzone65_inzone_type;
myself.i_ai2 = inzone70_inzone_type;
myself.i_ai3 = inzone75_inzone_type;
break;

}

}
myself.AddTimerEx(TM_Broadcast, Time_Broadcast * 1000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i9, HandlerParam i10, HandlerParam i11, HandlerParam s0) {
if (ask == -7801) {
if (reply == 1117) {
myself.FHTML_SetFileName(fhtml0, fnRankingBoard);
myself.FHTML_SetStr(fhtml0, "rim_title1", gg.MakeFString(1800199, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim_title2", gg.MakeFString(1800200, "", "", "", "", ""));
for (i6 = 1; i6 <= 10; i6 = i6 + 1) {
if (gg.IsSameString(gg.GetRank_RimKamaroka(i6, 2), "") == 1) {
myself.FHTML_SetStr(fhtml0, "rim_name" + i6, gg.MakeFString(1000322, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim_score" + i6, gg.MakeFString(1000322, "", "", "", "", ""));

} else {
i5 = gg.FloatToInt(AverageScore_GradeG * ScaleModValue / 10);
i4 = gg.FloatToInt(AverageScore_GradeS * ScaleModValue / 10);
i3 = gg.FloatToInt(AverageScore_GradeA * ScaleModValue / 10);
i2 = gg.FloatToInt(AverageScore_GradeB * ScaleModValue / 10);
i1 = gg.FloatToInt(AverageScore_GradeC * ScaleModValue / 10);
i0 = gg.FloatToInt(AverageScore_GradeD * ScaleModValue / 10);
if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i5) {
s0 = "S +++++ (G)";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i4 + i5 - i4 * 8 / 10) {
s0 = "S ++++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i4 + i5 - i4 * 6 / 10) {
s0 = "S +++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i4 + i5 - i4 * 4 / 10) {
s0 = "S ++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i4 + i5 - i4 * 2 / 10) {
s0 = "S +";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i4) {
s0 = "S";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i3 + i4 - i3 * 8 / 10) {
s0 = "A ++++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i3 + i4 - i3 * 6 / 10) {
s0 = "A +++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i3 + i4 - i3 * 4 / 10) {
s0 = "A ++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i3 + i4 - i3 * 2 / 10) {
s0 = "A +";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i3) {
s0 = "A";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i2 + i3 - i2 * 8 / 10) {
s0 = "B ++++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i2 + i3 - i2 * 6 / 10) {
s0 = "B +++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i2 + i3 - i2 * 4 / 10) {
s0 = "B ++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i2 + i3 - i2 * 2 / 10) {
s0 = "B +";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i2) {
s0 = "B";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i1 + i2 - i1 * 8 / 10) {
s0 = "C ++++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i1 + i2 - i1 * 6 / 10) {
s0 = "C +++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i1 + i2 - i1 * 4 / 10) {
s0 = "C ++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i1 + i2 - i1 * 2 / 10) {
s0 = "C +";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i1) {
s0 = "C";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i0 + i1 - i0 * 8 / 10) {
s0 = "D ++++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i0 + i1 - i0 * 6 / 10) {
s0 = "D +++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i0 + i1 - i0 * 4 / 10) {
s0 = "D ++";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i0 + i1 - i0 * 2 / 10) {
s0 = "D +";

} else if (gg.StrToInt(gg.GetRank_RimKamaroka(i6, 4)) >= i0) {
s0 = "D";

} else {
s0 = "F";

}
if (babble_mode == 1) {
s0 = s0 + " / " + gg.GetRank_RimKamaroka(i6, 4);

}
myself.FHTML_SetStr(fhtml0, "rim_name" + i6, gg.GetRank_RimKamaroka(i6, 2));
myself.FHTML_SetStr(fhtml0, "rim_score" + i6, s0);

}
if (gg.IsSameString(talker.name, gg.GetRank_RimKamaroka(i6, 2)) == 1) {
if (i6 == 1) {
if (babble_mode == 1) {
myself.Say("강한 버프 준다");

}
myself.AddUseSkillDesire(talker, Buff2, 1, 0, 1000000);

} else {
if (babble_mode == 1) {
myself.Say("약한 버프 준다");

}
myself.AddUseSkillDesire(talker, Buff1, 1, 0, 1000000);

}

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 99) {
if (pccafe_pass_mode == 0 && myself.IsPCCafeUser(talker) == 1 || pccafe_pass_mode == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0)) {
if (babble_mode == 1 && talker.instant_zone_id != 0) {
myself.Say("점유 채널: " + gg.IntToStr(talker.instant_zone_id));

}
if (talker.instant_zone_id > 0 && talker.instant_zone_id == inzone25_inzone_type || talker.instant_zone_id == inzone30_inzone_type || talker.instant_zone_id == inzone35_inzone_type || talker.instant_zone_id == inzone40_inzone_type || talker.instant_zone_id == inzone45_inzone_type || talker.instant_zone_id == inzone50_inzone_type || talker.instant_zone_id == inzone55_inzone_type || talker.instant_zone_id == inzone60_inzone_type || talker.instant_zone_id == inzone65_inzone_type || talker.instant_zone_id == inzone70_inzone_type || talker.instant_zone_id == inzone75_inzone_type) {
if (babble_mode == 1) {
myself.Say("이미 채널을 점유 하고 있음");

}
myself.ShowPage(talker, fnEnlistedUser);

} else if (myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
if (babble_mode == 1) {
myself.Say("PC방 유저 중 파티에 속하지 않고 채널을 점유하지 않은 자");

}
if (babble_mode == 1) {
myself.Say("가능한 림 리스트를 보여준다");

}
if (Level == 20) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList2);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800151, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800152, "", "", "", "", ""));

} else if (Level == 30) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList3);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800151, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800152, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim3", gg.MakeFString(1800153, "", "", "", "", ""));

} else if (Level == 40) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList3);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800153, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800154, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim3", gg.MakeFString(1800155, "", "", "", "", ""));

} else if (Level == 50) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList4);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800154, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800155, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim3", gg.MakeFString(1800156, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim4", gg.MakeFString(1800157, "", "", "", "", ""));

} else if (Level == 60) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList4);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800156, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800157, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim3", gg.MakeFString(1800158, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim4", gg.MakeFString(1800159, "", "", "", "", ""));

} else if (Level == 70) {
myself.FHTML_SetFileName(fhtml0, fnInZoneList4);
myself.FHTML_SetStr(fhtml0, "rim1", gg.MakeFString(1800158, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim2", gg.MakeFString(1800159, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim3", gg.MakeFString(1800160, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "rim4", gg.MakeFString(1800161, "", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowSystemMessage(talker, 1710);

}

} else {
if (babble_mode == 1) {
myself.Say("파티에 속한 PC방 유저");

}
myself.ShowPage(talker, fnCafeButPartyUser);

}

} else {
if (babble_mode == 1) {
myself.Say("PC방 유저 아님");

}
myself.ShowPage(talker, fnNotCafeUser);

}

} else if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (myself.i_ai0 > -1 && enter_type > -1 && myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
myself.InstantZone_Enter(talker, myself.i_ai0, enter_type);

}

} else if (reply == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (myself.i_ai1 > -1 && enter_type > -1 && myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
myself.InstantZone_Enter(talker, myself.i_ai1, enter_type);

}

} else if (reply == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (myself.i_ai2 > -1 && enter_type > -1 && myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
myself.InstantZone_Enter(talker, myself.i_ai2, enter_type);

}

} else if (reply == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (myself.i_ai3 > -1 && enter_type > -1 && myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
myself.InstantZone_Enter(talker, myself.i_ai3, enter_type);

}

} else if (reply == 98) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(talker, Inven_Check_SysMsg);

}
return;

}
if (talker.instant_zone_id > -1 && enter_type > -1 && myself.GetPCCafePoint(talker) >= required_PCCafePoint || pccafe_pass_mode == 2) {
myself.InstantZone_Enter(talker, talker.instant_zone_id, enter_type);

}

} else if (reply == 97) {
myself.ShowPage(talker, fnRimInfo);

}

} else if (ask == -303) {
if (reply == rim_multisell) {
myself.ShowMultisell(rim_multisell, talker);

}

} else if (ask == -7802) {
if (reply == 1) {
i11 = myself.sm.class_id;
i10 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i10 / 100000000;
if (i1 >= 99 || i1 < 0) {
i1 = 0;

}
if (Level == 20) {
i11 = 100000000;

}
if (Level == 30) {
i11 = 200000000;

}
if (Level == 50) {
i11 = 300000000;

}
if (Level == 40) {
i11 = 400000000;

}
if (Level == 70) {
i11 = 500000000;

}
if (Level == 60) {
i11 = 600000000;

}
i9 = 0;
i9 = i0 / 100000000;
if (i9 > 0) {
i9 = i9 % 100;
i9 = i9 * 1000000000;

} else {
i2 = 0;

}
if (i0 < 0) {
myself.SetMemoStateEx(talker, 255, 1, i11);

} else {
myself.SetMemoStateEx(talker, 255, 1, i10 - i9 + i11);

}
if (gg.Rand(2) < 1) {
myself.InstantTeleport(talker, -114597, -152501, -6750);

} else {
myself.InstantTeleport(talker, -114589, -154162, -6750);

}

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, fnEnterFailed);

} else if (reply == 1) {

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i6, HandlerParam s0) {
if (timer_id == TM_Broadcast) {
i6 = gg.Rand(100) + 1;
if (i6 <= 6 && gg.IsSameString(gg.GetRank_RimKamaroka(1, 2), "") != 1) {
if (babble_mode == 1) {
myself.Shout("순위 전파 1등");

}
s0 = gg.MakeFString(1800199, "", "", "", "", "");
myself.Say(gg.MakeFString(1800202, gg.GetRank_RimKamaroka(1, 2), s0, "", "", ""));

} else if (i6 >= 7 && i6 <= 14 && gg.IsSameString(gg.GetRank_RimKamaroka(i6 - 5, 2), "") != 1) {
if (babble_mode == 1) {
myself.Shout("순위 전파 " + gg.IntToStr(i6 - 5) + "등");

}
s0 = gg.MakeFString(1800200, "", "", "", "", "");
myself.Say(gg.MakeFString(1800202, gg.GetRank_RimKamaroka(i6 - 5, 2), s0, "", "", ""));

} else if (babble_mode == 1) {
myself.Shout("순위 전파 실패");

}
myself.AddTimerEx(TM_Broadcast, Time_Broadcast * 1000);

}
	}


}