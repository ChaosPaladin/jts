package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maestro_nikola extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 15 && gg.OwnItemCount(talker, 2759)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 16 && gg.OwnItemCount(talker, 2761) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 16 && gg.OwnItemCount(talker, 2761) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 17) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3270) >= 1 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3271) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3245) == 0 && gg.OwnItemCount(talker, 3030) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3030) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3245) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Relics Exploration (In Progress)");

}
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Nikola's Cooperation");

}
if (myself.GetOneTimeQuestFlag(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Art of Persuasion (Done)");

}
if (gg.HaveMemo(talker, 184) == 1 && gg.GetMemoState(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Art of Persuasion (In Progress)");

}
if (myself.GetOneTimeQuestFlag(talker, 185) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Nikola's Cooperation (Done)");

}
if (gg.HaveMemo(talker, 185) == 1 && gg.GetMemoState(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Nikola's Cooperation (In Progress)");

}
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Contract Execution (In Progress)");

}
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Contract Execution (In Progress)");

}
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Nikola's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Nikola's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Seal Removal (In Progress)");

}
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Seal Removal (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 5 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Lost Dream (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 15 && gg.OwnItemCount(talker, 2759)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0217_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 16 && gg.OwnItemCount(talker, 2761) < 1) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0217_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 16 && gg.OwnItemCount(talker, 2761) == 1) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0217_04.htm");
myself.DeleteItem1(talker, 2761, gg.OwnItemCount(talker, 2761));
myself.DeleteItem1(talker, 2760, gg.OwnItemCount(talker, 2760));
myself.SetMemoState(talker, 217, 17);
myself.SetFlagJournal(talker, 217, 21);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 17) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0217_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0221_01.htm");
myself.DeleteItem1(talker, 3269, gg.OwnItemCount(talker, 3269));

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3270) >= 1 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0221_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3271) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3272) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "maestro_nikola_q0221_06.htm");
myself.DeleteItem1(talker, 3271, 1);
myself.GiveItem1(talker, 3272, 1);
myself.GiveItem1(talker, 3023, 1);
myself.SetFlagJournal(talker, 221, 7);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3245) == 0 && gg.OwnItemCount(talker, 3030) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0221_07.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3030) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3245) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0221_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3245) >= 1 && gg.OwnItemCount(talker, 3270) == 0 && gg.OwnItemCount(talker, 3271) == 0 && gg.OwnItemCount(talker, 3272) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0221_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 2) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0183_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 40) {
myself.ShowQuestPage(talker, "maestro_nikola_q0184_01.htm", 184);

} else {
myself.ShowQuestPage(talker, "maestro_nikola_q0184_02.htm", 184);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 1 && gg.GetMemoState(talker, 184) == 1) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0184_07.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 185) == 1) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 185) == 1 && gg.GetMemoState(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0185_07.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0186_01.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0186_04.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0187_01.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 2 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0187_04.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0188_01.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0188_05.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 190, 5);
myself.ShowPage(talker, "maestro_nikola_q0190_01.htm");
myself.SetFlagJournal(talker, 190, 5);
myself.ShowQuestMark(talker, 190);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 5 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_nikola_q0190_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 184) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
myself.SetMemoState(talker, 184, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "maestro_nikola_q0184_06.htm", 184);
myself.GiveItem1(talker, 10361, 1);
myself.SetFlagJournal(talker, 184, 1);
myself.ShowQuestMark(talker, 184);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 185) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 0) {
myself.GiveItem1(talker, 10365, 1);
myself.SetMemoState(talker, 185, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "maestro_nikola_q0185_06.htm", 185);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 185, 1);
myself.ShowQuestMark(talker, 185);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1 && gg.OwnItemCount(talker, 2759) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "maestro_nikola_q0217_02.htm");
myself.GiveItem1(talker, 2760, 1);
myself.DeleteItem1(talker, 2759, 1);
myself.SetMemoState(talker, 217, 16);
myself.SetFlagJournal(talker, 217, 19);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
myself.ShowPage(talker, "maestro_nikola_q0221_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "maestro_nikola_q0221_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "maestro_nikola_q0221_04.htm");
myself.GiveItem1(talker, 3270, 1);
myself.SetFlagJournal(talker, 221, 5);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 183) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 183) {
if (reply == 1) {
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 2) {
myself.ShowPage(talker, "maestro_nikola_q0183_02.htm");
myself.RemoveMemo(talker, 183);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 183);
myself.SetOneTimeQuestFlag(talker, 183, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 46) {
myself.GiveItem1(talker, 57, 18100);
myself.IncrementParam(talker, 0, 60000);
myself.IncrementParam(talker, 1, 3000);

} else {
myself.GiveItem1(talker, 57, 18100);

}
gg.AddLog(3, talker, 183);

}

}

}

}
if (ask == 184) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 184) {
if (reply == 1) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
if (talker.level >= 40) {
myself.ShowQuestPage(talker, "maestro_nikola_q0184_03.htm", 184);

} else {
myself.ShowQuestPage(talker, "maestro_nikola_q0184_03a.htm", 184);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
myself.ShowQuestPage(talker, "maestro_nikola_q0184_04.htm", 184);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 0) {
myself.FHTML_SetFileName(fhtml0, "maestro_nikola_q0184_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 184);
myself.ShowQuestFHTML(talker, fhtml0, 184);

}

}

}
if (ask == 185) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 185) {
if (reply == 1) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 0) {
if (talker.level >= 40) {
myself.ShowQuestPage(talker, "maestro_nikola_q0185_03.htm", 185);

} else {
myself.ShowQuestPage(talker, "maestro_nikola_q0185_03a.htm", 185);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 0) {
myself.ShowQuestPage(talker, "maestro_nikola_q0185_04.htm", 185);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 184) == 0 && gg.HaveMemo(talker, 185) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 0) {
myself.FHTML_SetFileName(fhtml0, "maestro_nikola_q0185_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 185);
myself.ShowQuestFHTML(talker, fhtml0, 185);

}

}

}
if (ask == 186) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 186) {
if (reply == 1) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
myself.ShowPage(talker, "maestro_nikola_q0186_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
myself.SetMemoState(talker, 186, 2);
myself.ShowPage(talker, "maestro_nikola_q0186_03.htm");
myself.SetFlagJournal(talker, 186, 2);
myself.ShowQuestMark(talker, 186);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 187) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 187) {
if (reply == 1) {
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.ShowPage(talker, "maestro_nikola_q0187_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) == 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.SetMemoState(talker, 187, 2);
myself.ShowPage(talker, "maestro_nikola_q0187_03.htm");
myself.SetFlagJournal(talker, 187, 2);
myself.ShowQuestMark(talker, 187);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 188) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 188) {
if (reply == 1) {
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.ShowPage(talker, "maestro_nikola_q0188_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.SetMemoState(talker, 188, 2);
myself.ShowPage(talker, "maestro_nikola_q0188_03.htm");
myself.SetFlagJournal(talker, 188, 2);
myself.ShowQuestMark(talker, 188);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.ShowPage(talker, "maestro_nikola_q0188_04.htm");

}

}

}
super;
	}


}