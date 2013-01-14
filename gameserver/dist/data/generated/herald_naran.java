package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class herald_naran extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 611) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Alliance with Varka Silenos");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1 && gg.OwnItemCount(talker, 7226) < 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1 && gg.OwnItemCount(talker, 7226) >= 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) > 0 && gg.OwnItemCount(talker, 7226) < 200 || gg.OwnItemCount(talker, 7227) < 100) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) > 0 && gg.OwnItemCount(talker, 7226) >= 200 && gg.OwnItemCount(talker, 7227) >= 100) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7222) > 0 && gg.OwnItemCount(talker, 7226) < 300 || gg.OwnItemCount(talker, 7227) < 200 || gg.OwnItemCount(talker, 7228) < 100) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7222) > 0 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 200 && gg.OwnItemCount(talker, 7228) >= 100) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7223) > 0 && gg.OwnItemCount(talker, 7226) < 300 || gg.OwnItemCount(talker, 7227) < 300 || gg.OwnItemCount(talker, 7228) < 200 || gg.OwnItemCount(talker, 7229) < 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7223) > 0 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 300 && gg.OwnItemCount(talker, 7228) >= 200 && gg.OwnItemCount(talker, 7229) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7224) > 0 && gg.OwnItemCount(talker, 7226) < 400 || gg.OwnItemCount(talker, 7227) < 400 || gg.OwnItemCount(talker, 7228) < 200 || gg.OwnItemCount(talker, 7230) < 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7224) > 0 && gg.OwnItemCount(talker, 7226) >= 400 && gg.OwnItemCount(talker, 7227) >= 400 && gg.OwnItemCount(talker, 7228) >= 200 && gg.OwnItemCount(talker, 7230) > 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7225) > 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Alliance with Varka Silenos (In Progress)");

}
if (gg.HaveMemo(talker, 615) == 0 && talker.level >= 74) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Magical Power of Fire - Part 1");

}
if (gg.HaveMemo(talker, 615) == 0 && talker.level < 74) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Magical Power of Fire - Part 1");

}
if (gg.HaveMemo(talker, 615) == 1 && gg.GetMemoState(talker, 615) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Magical Power of Fire - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 12) == 1 && gg.OwnItemCount(talker, 7232) >= 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0 && gg.GetMemoState(talker, 12) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Secret Meeting with Varka Silenos");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 0) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 74) {
myself.FHTML_SetFileName(fhtml0, "herald_naran_q0611_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 611);
myself.ShowQuestFHTML(talker, fhtml0, 611);

} else {
myself.ShowQuestPage(talker, "herald_naran_q0611_03.htm", 611);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1 && gg.OwnItemCount(talker, 7226) < 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_10.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1 && gg.OwnItemCount(talker, 7226) >= 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_11.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) > 0 && gg.OwnItemCount(talker, 7226) < 200 || gg.OwnItemCount(talker, 7227) < 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_13.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7221) > 0 && gg.OwnItemCount(talker, 7226) >= 200 && gg.OwnItemCount(talker, 7227) >= 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_14.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7222) > 0 && gg.OwnItemCount(talker, 7226) < 300 || gg.OwnItemCount(talker, 7227) < 200 || gg.OwnItemCount(talker, 7228) < 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_16.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7222) > 0 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 200 && gg.OwnItemCount(talker, 7228) >= 100) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_17.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7223) > 0 && gg.OwnItemCount(talker, 7226) < 300 || gg.OwnItemCount(talker, 7227) < 300 || gg.OwnItemCount(talker, 7228) < 200 || gg.OwnItemCount(talker, 7229) < 1) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_19.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7223) > 0 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 300 && gg.OwnItemCount(talker, 7228) >= 200 && gg.OwnItemCount(talker, 7229) > 0) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_20.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7224) > 0 && gg.OwnItemCount(talker, 7226) < 400 || gg.OwnItemCount(talker, 7227) < 400 || gg.OwnItemCount(talker, 7228) < 200 || gg.OwnItemCount(talker, 7230) < 1) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_22.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7224) > 0 && gg.OwnItemCount(talker, 7226) >= 400 && gg.OwnItemCount(talker, 7227) >= 400 && gg.OwnItemCount(talker, 7228) >= 200 && gg.OwnItemCount(talker, 7230) > 0) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_23.htm");
myself.GiveItem1(talker, 7225, 1);
myself.DeleteItem1(talker, 7224, gg.OwnItemCount(talker, 7224));
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.DeleteItem1(talker, 7227, gg.OwnItemCount(talker, 7227));
myself.DeleteItem1(talker, 7228, gg.OwnItemCount(talker, 7228));
myself.DeleteItem1(talker, 7230, gg.OwnItemCount(talker, 7230));
myself.SetFlagJournal(talker, 611, 6);
myself.ShowQuestMark(talker, 611);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 611) == 1 && gg.OwnItemCount(talker, 7225) > 0) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0611_24.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 615) == 0 && talker.level >= 74) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7221) > 0 || gg.OwnItemCount(talker, 7222) > 0 || gg.OwnItemCount(talker, 7223) > 0 || gg.OwnItemCount(talker, 7224) > 0 || gg.OwnItemCount(talker, 7225) > 0) {
myself.FHTML_SetFileName(fhtml0, "herald_naran_q0615_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 615);
myself.ShowQuestFHTML(talker, fhtml0, 615);

} else {
myself.ShowQuestPage(talker, "herald_naran_q0615_01a.htm", 615);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 615) == 0 && talker.level < 74) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "herald_naran_q0615_01b.htm", 615);

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 615) == 1 && gg.GetMemoState(talker, 615) == 1) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_naran_q0615_03.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 12) == 1 && gg.OwnItemCount(talker, 7232) >= 0 && myself.GetOneTimeQuestFlag(talker, 12) == 0 && gg.GetMemoState(talker, 12) == 2 * 10 + 1) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 12, 2);
myself.ShowPage(talker, "herald_naran_q0012_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 611) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7211) > 0 || gg.OwnItemCount(talker, 7212) > 0 || gg.OwnItemCount(talker, 7213) > 0 || gg.OwnItemCount(talker, 7214) > 0 || gg.OwnItemCount(talker, 7215) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_02.htm", 611);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 611);
gg.AddLog(1, talker, 611);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1) {
myself.ShowQuestPage(talker, "herald_naran_q0611_04.htm", 611);
myself.SetFlagJournal(talker, 611, 1);

} else if (gg.OwnItemCount(talker, 7221) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_05.htm", 611);
myself.SetFlagJournal(talker, 611, 2);
myself.ShowQuestMark(talker, 611);

} else if (gg.OwnItemCount(talker, 7222) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_06.htm", 611);
myself.SetFlagJournal(talker, 611, 3);
myself.ShowQuestMark(talker, 611);

} else if (gg.OwnItemCount(talker, 7223) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_07.htm", 611);
myself.SetFlagJournal(talker, 611, 4);
myself.ShowQuestMark(talker, 611);

} else if (gg.OwnItemCount(talker, 7224) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_08.htm", 611);
myself.SetFlagJournal(talker, 611, 5);
myself.ShowQuestMark(talker, 611);

} else if (gg.OwnItemCount(talker, 7225) > 0) {
myself.ShowQuestPage(talker, "herald_naran_q0611_09.htm", 611);
myself.SetFlagJournal(talker, 611, 6);
myself.ShowQuestMark(talker, 611);

}

}
return;

}
if (quest_id == 615) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 615);
myself.SetMemoState(talker, 615, 1);
gg.AddLog(1, talker, 615);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "herald_naran_q0615_02.htm", 615);
myself.SetFlagJournal(talker, 615, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 611) {
myself.SetCurrentQuestID(611);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 611) {
if (reply == 1 && gg.OwnItemCount(talker, 7221) < 1 && gg.OwnItemCount(talker, 7222) < 1 && gg.OwnItemCount(talker, 7223) < 1 && gg.OwnItemCount(talker, 7224) < 1 && gg.OwnItemCount(talker, 7225) < 1 && gg.OwnItemCount(talker, 7226) >= 100) {
myself.ShowPage(talker, "herald_naran_q0611_12.htm");
myself.GiveItem1(talker, 7221, 1);
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.SetFlagJournal(talker, 611, 2);
myself.ShowQuestMark(talker, 611);

}
if (reply == 2 && gg.OwnItemCount(talker, 7221) > 0 && gg.OwnItemCount(talker, 7226) >= 200 && gg.OwnItemCount(talker, 7227) >= 100) {
myself.ShowPage(talker, "herald_naran_q0611_15.htm");
myself.GiveItem1(talker, 7222, 1);
myself.DeleteItem1(talker, 7221, gg.OwnItemCount(talker, 7221));
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.DeleteItem1(talker, 7227, gg.OwnItemCount(talker, 7227));
myself.SetFlagJournal(talker, 611, 3);
myself.ShowQuestMark(talker, 611);

}
if (reply == 3 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 200 && gg.OwnItemCount(talker, 7228) >= 100) {
myself.ShowPage(talker, "herald_naran_q0611_18.htm");
myself.GiveItem1(talker, 7223, 1);
myself.DeleteItem1(talker, 7222, gg.OwnItemCount(talker, 7222));
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.DeleteItem1(talker, 7227, gg.OwnItemCount(talker, 7227));
myself.DeleteItem1(talker, 7228, gg.OwnItemCount(talker, 7228));
myself.SetFlagJournal(talker, 611, 4);
myself.ShowQuestMark(talker, 611);

}
if (reply == 4 && gg.OwnItemCount(talker, 7226) >= 300 && gg.OwnItemCount(talker, 7227) >= 300 && gg.OwnItemCount(talker, 7228) >= 200 && gg.OwnItemCount(talker, 7229) > 0) {
myself.ShowPage(talker, "herald_naran_q0611_21.htm");
myself.GiveItem1(talker, 7224, 1);
myself.DeleteItem1(talker, 7222, gg.OwnItemCount(talker, 7222));
myself.DeleteItem1(talker, 7223, gg.OwnItemCount(talker, 7223));
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.DeleteItem1(talker, 7227, gg.OwnItemCount(talker, 7227));
myself.DeleteItem1(talker, 7228, gg.OwnItemCount(talker, 7228));
myself.DeleteItem1(talker, 7229, gg.OwnItemCount(talker, 7229));
myself.SetFlagJournal(talker, 611, 5);
myself.ShowQuestMark(talker, 611);

}
if (reply == 5) {
myself.ShowPage(talker, "herald_naran_q0611_25.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "herald_naran_q0611_26.htm");
myself.DeleteItem1(talker, 7221, gg.OwnItemCount(talker, 7221));
myself.DeleteItem1(talker, 7222, gg.OwnItemCount(talker, 7222));
myself.DeleteItem1(talker, 7223, gg.OwnItemCount(talker, 7223));
myself.DeleteItem1(talker, 7224, gg.OwnItemCount(talker, 7224));
myself.DeleteItem1(talker, 7225, gg.OwnItemCount(talker, 7225));
myself.DeleteItem1(talker, 7226, gg.OwnItemCount(talker, 7226));
myself.DeleteItem1(talker, 7227, gg.OwnItemCount(talker, 7227));
myself.DeleteItem1(talker, 7228, gg.OwnItemCount(talker, 7228));
myself.DeleteItem1(talker, 7229, gg.OwnItemCount(talker, 7229));
myself.DeleteItem1(talker, 7230, gg.OwnItemCount(talker, 7230));
myself.RemoveMemo(talker, 611);
gg.AddLog(2, talker, 611);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
if (ask == 12) {
myself.SetCurrentQuestID(12);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 12 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
i0 = myself.GetHTMLCookie(talker, 12, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 12) == 1 && myself.GetOneTimeQuestFlag(talker, 12) == 0) {
if (gg.OwnItemCount(talker, 7232) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7232, gg.OwnItemCount(talker, 7232));
myself.IncrementParam(talker, 0, 233125);
myself.IncrementParam(talker, 1, 18142);

}
gg.AddLog(2, talker, 12);
myself.RemoveMemo(talker, 12);
myself.SetOneTimeQuestFlag(talker, 12, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "herald_naran_q0012_0301.htm");

} else {
myself.ShowPage(talker, "herald_naran_q0012_0302.htm");

}

}

}

}
super;
	}


}