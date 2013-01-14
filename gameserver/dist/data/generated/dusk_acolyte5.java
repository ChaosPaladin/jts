package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dusk_acolyte5 extends ssq_main_event_acolyte {
	protected void QUEST_ACCEPTED(HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 505) {
myself.SetCurrentQuestID(505);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
party0 = gg.GetParty(talker);
c0 = gg.Party_GetLeader(talker);
i1 = gg.Party_GetCount(talker);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
c2 = myself.GetSummon(c1);
myself.DeleteItem1(c1, 5901, gg.OwnItemCount(c1, 5901));
if (gg.GetSSQPart(c1) != 1) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_01.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
myself.RemoveMemo(talker, 505);
return;

} else if (myself.GetMemoCount(c1) > 41 - 1) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_04e.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
myself.RemoveMemo(talker, 505);
return;

} else if (c2) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_31.htm");
myself.RemoveMemo(talker, 505);
return;

}

}

}
i0 = gg.GetDateTime(0, 4);
if (i0 >= 0 && i0 < 18 || i0 >= 20 && i0 < 38 || i0 >= 40 && i0 < 58 || myself.GetTimeOfSSQ(1) - gg.GetTimeOfDay() <= 120) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_22.htm");
myself.RemoveMemo(talker, 505);
return;

}
i0 = gg.GetTimeOfDay();
if (myself.IsNullParty(party0) || i1 < 5 && gg.OwnItemCount(talker, 214) == 0) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_30.htm");
myself.RemoveMemo(talker, 505);
return;

} else if (myself.GetMemoCount(talker) < 41) {
if (gg.GetSSQPart(talker) == 1 && myself.GetSSQStatus() == 1 && c0 == talker) {
if (gg.GetMemoStateEx(talker, 505, 1) == 6000) {
if (gg.OwnItemCount(talker, 6360) < 6000) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

}

}
if (gg.GetMemoStateEx(talker, 505, 1) == 3600) {
if (gg.OwnItemCount(talker, 6361) < 3600) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

}

}
if (gg.GetMemoStateEx(talker, 505, 1) == 1800) {
if (gg.OwnItemCount(talker, 6362) < 1800) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

}

}
if (gg.AddPartyToEventRoom(5, 1, party0.id)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.GetMemoStateEx(talker, 505, 1) == 6000) {
if (gg.OwnItemCount(talker, 6360) < 6000) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

} else {
myself.DeleteItem1(talker, 6360, 6000);

}

}
if (gg.GetMemoStateEx(talker, 505, 1) == 3600) {
if (gg.OwnItemCount(talker, 6361) < 3600) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

} else {
myself.DeleteItem1(talker, 6361, 3600);

}

}
if (gg.GetMemoStateEx(talker, 505, 1) == 1800) {
if (gg.OwnItemCount(talker, 6362) < 1800) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_21b.htm");
return;

} else {
myself.DeleteItem1(talker, 6362, 1800);

}

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(talker, i2);
myself.SetMemo(c1, 505);
myself.ShowQuestMark(talker, 505);
myself.SetMemoState(c1, 505, i0);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 505);
myself.ShowQuestMark(talker, 505);
myself.SetMemoState(talker, 505, i0);
myself.SetJournal(talker, 505, 1);
myself.SetMemoStateEx(talker, 505, 1, 5);
gg.AddPartyToEventRoom(5, 1, party0.id);
if (myself.Skill_GetConsumeMP(284033025) < myself.sm.mp && myself.Skill_GetConsumeHP(284033025) < myself.sm.hp && myself.Skill_InReuseDelay(284033025) == 0) {
myself.AddUseSkillDesire(talker, 284033025, 0, 0, 1000000);

}
myself.AddTimeAttackFee(5, 18000, party0.id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, quest_id);
myself.SetHTMLCookie(talker, 505, 1);

}

} else {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_05.htm");

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 505) {
myself.SetCurrentQuestID(505);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 505) {
if (reply == 1) {
i3 = gg.GetDateTime(0, 4);
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_02.htm");
return;

}
if (i3 >= 0 && i3 < 18 || i3 >= 20 && i3 < 38 || i3 >= 40 && i3 < 58 || myself.GetTimeOfSSQ(1) - gg.GetTimeOfDay() <= 120) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_22.htm");
return;

} else {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_20e.htm");

}

}
if (reply == 2) {
i1 = gg.Party_GetCount(talker);
party0 = gg.GetParty(talker);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
if (gg.GetMemoState(c1, 505) != gg.GetMemoState(talker, 505)) {
return;

}

}
if (gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_08.htm");

} else if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_02.htm");

} else if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_10.htm");

} else if (gg.GetTimeOfDay() - gg.GetMemoState(talker, 505) / 60 > 40) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_11.htm");

} else if (gg.GetMemoStateEx(talker, 505, 1) != 5) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_28.htm");

} else if (gg.StrToInt(gg.GetTimeAttackRecordInfo(5, 1, 4, 0)) > gg.OwnItemCount(talker, 5901)) {
i1 = gg.Party_GetCount(talker);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
myself.RemoveMemo(c1, 505);

}
i2 = gg.OwnItemCount(talker, 5901);
gg.AddLog(4, talker, 505);
if (i2 >= 3000) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_12a.htm");
myself.SetHTMLCookie(talker, 505, 2);

} else {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_12.htm");

}
myself.Shout(gg.MakeFString(50504, talker.name, gg.IntToStr(i2), "", "", ""));
myself.DeleteItem1(talker, 5901, gg.OwnItemCount(talker, 5901));

} else {
i1 = gg.Party_GetCount(talker);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
myself.RemoveMemo(c1, 505);

}
gg.AddLog(4, talker, 505);
i2 = gg.OwnItemCount(talker, 5901);
myself.Shout(gg.MakeFString(50504, talker.name, gg.IntToStr(i2), "", "", ""));
if (i2 >= 3000) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_13a.htm");
myself.SetHTMLCookie(talker, 505, 2);

} else {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_13.htm");

}
myself.AddTimeAttackRecord(5, 1, party0.id, gg.OwnItemCount(talker, 5901), gg.GetTimeOfDay(), gg.GetMemoState(talker, 505));
myself.SoundEffect(talker, "SkillSound2.jewel.celebrate");
myself.DeleteItem1(talker, 5901, gg.OwnItemCount(talker, 5901));

}

}
if (reply == 6) {
if (myself.GetSSQStatus() != 3) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_23.htm");
return;

}
if (gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_08.htm");
return;

}
if (gg.GetSSQPart(talker) != myself.GetSSQWinner()) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_24.htm");
return;

}
if (gg.IsWinnerOfTimeAttackEvent(talker, 5) == 0) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_17.htm");
return;

}
if (gg.GetTimeAttackRewardFlag(talker, 5)) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_19.htm");
return;

}
i0 = gg.StrToInt(gg.GetTimeAttackRecordInfo(5, gg.GetSSQPart(talker), 2, 0));
i1 = myself.GetTimeAttackFee(5) / i0;
myself.GiveTimeAttackReward(talker, 5, 5575, i1);
myself.UpdatePVPPoint(talker, 1080);
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_18.htm");

}
if (reply == 7) {
i1 = gg.Party_GetCount(talker);
party0 = gg.GetParty(talker);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
if (gg.GetSSQPart(c0) != 1) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_01.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_02.htm");

} else if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_03.htm");

} else {
myself.SetMemoStateEx(talker, 505, 1, 6000);
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 505);
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 8) {
i1 = gg.Party_GetCount(talker);
party0 = gg.GetParty(talker);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
if (gg.GetSSQPart(c0) != 1) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_01.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_02.htm");

} else if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_03.htm");

} else {
myself.SetMemoStateEx(talker, 505, 1, 3600);
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 505);
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 9) {
i1 = gg.Party_GetCount(talker);
party0 = gg.GetParty(talker);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
if (gg.GetSSQPart(c0) != 1) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_01.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_02.htm");

} else if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_03.htm");

} else {
myself.SetMemoStateEx(talker, 505, 1, 1800);
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 505);
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 12 && myself.GetHTMLCookie(talker, 505, 2) != -1) {
i3 = myself.GetCurrentTick();
party0 = gg.GetParty(talker);
i1 = gg.Party_GetCount(talker);
i2 = 0;
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
if (myself.GetMemoCount(c1) >= 41 && gg.HaveMemo(c1, 635) == 0) {
i2 = 0;
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_13e.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);

} else {
i2 = 1;

}

}
if (i2 == 1) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
myself.SetMemo(c1, 635);
myself.SetMemoState(c1, 635, 2);
myself.SetMemoStateEx(c1, 635, 1, i3);
gg.AddLog(1, c1, 635);

}

}
myself.SetHTMLCookie(talker, 505, 12);
myself.TeleportParty(party0.id, -114787, -180935, -6752, 1000, 0);
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_13b.htm");

}
if (reply == 13 && myself.GetHTMLCookie(talker, 505, 2) != -1) {
i3 = myself.GetCurrentTick();
party0 = gg.GetParty(talker);
i1 = gg.Party_GetCount(talker);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(talker, i0);
myself.GiveItem1(c1, 7079, 7);

}
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_13c.htm");
myself.SetHTMLCookie(talker, 505, 13);

}
if (reply == 14) {
myself.InstantTeleport(talker, -114796, -179334, -6752);
myself.ShowPage(talker, "ssq_main_event_acolyte_q0505_13d.htm");

}

}
if (ask == 507) {
myself.SetCurrentQuestID(507);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 507) {
if (reply == 2) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0507_28.htm");

}
if (reply == 3) {
if (gg.HaveMemo(talker, 505)) {
myself.RemoveMemo(talker, 505);

}
myself.DeleteItem1(talker, 5901, gg.OwnItemCount(talker, 5901));
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 10000;
i2 = i0 - i1 + 5 / 10000;
if (i1 >= 95 && i1 < 195) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, -82340, 151575, -3120);
break;

}
case 1: {
myself.InstantTeleport(talker, -82392, 151584, -3120);
break;

}

}
return;

} else if (i1 >= 195 && i1 < 295) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, -14727, 124002, -3112);
break;

}
case 1: {
myself.InstantTeleport(talker, -14727, 124012, -3112);
break;

}

}
return;

} else if (i1 >= 295 && i1 < 395) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 18501, 144673, -3056);
break;

}
case 1: {
myself.InstantTeleport(talker, 18523, 144624, -3056);
break;

}

}
return;

} else if (i1 >= 395 && i1 < 495) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 81572, 148580, -3464);
break;

}
case 1: {
myself.InstantTeleport(talker, 81571, 148641, -3464);
break;

}

}
return;

} else if (i1 >= 495 && i1 < 595) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 112441, 220149, -3544);
break;

}
case 1: {
myself.InstantTeleport(talker, 112452, 220204, -3592);
break;

}

}
return;

} else if (i1 >= 595 && i1 < 695) {
myself.RemoveMemo(talker, quest_id);
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 82842, 54613, -1520);
break;

}
case 1: {
myself.InstantTeleport(talker, 82791, 54616, -1520);
break;

}

}
return;

} else if (i1 >= 695 && i1 < 795) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 147528, 28899, -2264);
break;

}
case 1: {
myself.InstantTeleport(talker, 147528, 28962, -2264);
break;

}

}
return;

} else if (i1 >= 795 && i1 < 895) {
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(talker, 116651, 77512, -2688);
break;

}
case 1: {
myself.InstantTeleport(talker, 116597, 77539, -2688);
break;

}

}
return;

} else if (i1 >= 995 && i1 < 1095) {
myself.InstantTeleport(talker, 149968, -56645, -2976);
return;

} else if (gg.GetMemoStateEx(talker, 255, 1) >= 1095 && gg.GetMemoStateEx(talker, 255, 1) < 1195) {
myself.InstantTeleport(talker, 44505, -48331, -792);
return;

} else if (i1 >= 1195 && i1 < 1295) {
myself.InstantTeleport(talker, 85048, -142046, -1536);
return;

} else if (i2 == 1) {
myself.InstantTeleport(talker, -41443, 210030, -5080);

} else if (i2 == 2) {
myself.InstantTeleport(talker, -53034, -250421, -7935);

} else if (i2 == 3) {
myself.InstantTeleport(talker, 45160, 123605, -5408);

} else if (i2 == 4) {
myself.InstantTeleport(talker, 46488, 170184, -4976);

} else if (i2 == 5) {
myself.InstantTeleport(talker, 111521, 173905, -5432);

} else if (i2 == 6) {
myself.InstantTeleport(talker, -20395, -250930, -8191);

} else if (i2 == 7) {
myself.InstantTeleport(talker, -21482, 77253, -5168);

} else if (i2 == 8) {
myself.InstantTeleport(talker, 140688, 79565, -5424);

} else if (i2 == 9) {
myself.InstantTeleport(talker, -52007, 78986, -4736);

} else if (i2 == 10) {
myself.InstantTeleport(talker, 118547, 132669, -4824);

} else if (i2 == 11) {
myself.InstantTeleport(talker, 172562, -17730, -4896);

} else if (i2 == 12) {
myself.InstantTeleport(talker, 83344, 209110, -5432);

} else if (i2 == 13) {
myself.InstantTeleport(talker, -19154, 13415, -4896);

} else if (i2 == 14) {
myself.InstantTeleport(talker, 12747, -248614, -9607);

} else if (i1 < 95) {
myself.ShowPage(talker, "ssq_main_event_acolyte_q0507_29.htm");

}

}

}
super;
	}


}