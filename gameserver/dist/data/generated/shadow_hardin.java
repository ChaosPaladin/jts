package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shadow_hardin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth");

}
if (gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (Done)");

}
if (gg.HaveMemo(talker, 21) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 11 && gg.OwnItemCount(talker, 7151) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 12) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 13) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 14) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1 && gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Inhabitants of the Forest of the Dead (Done)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 6 && gg.OwnItemCount(talker, 7157)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 == 7) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 9 && gg.OwnItemCount(talker, 7066) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 16) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 19) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 20) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 11) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 12) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Dreadnought (In Progress)");

}
if (talker.level >= 63 && gg.HaveMemo(talker, 632) == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Necromancer's Request");

}
if (talker.level < 63 && gg.HaveMemo(talker, 632) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Necromancer's Request");

}
if (gg.HaveMemo(talker, 632) == 1 && gg.GetMemoState(talker, 632) >= 1 * 10 + 1 && gg.GetMemoState(talker, 632) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Necromancer's Request (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 1) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 2 && gg.OwnItemCount(talker, 9745) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 2 && gg.OwnItemCount(talker, 9745) >= 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 6) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 20 && gg.GetMemoStateEx(talker, 236, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 7 && gg.OwnItemCount(talker, 9744) == 0) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 7 && gg.OwnItemCount(talker, 9744) >= 1) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 11) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Seeds of Chaos (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 0) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "shadow_hardin_q0021_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 21);
myself.ShowQuestFHTML(talker, fhtml0, 21);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0021_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 11 && gg.OwnItemCount(talker, 7151) >= 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0024_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 12) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0024_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 13) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0024_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 14) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0024_18.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 1 && gg.HaveMemo(talker, 25) == 0 && myself.GetOneTimeQuestFlag(talker, 25) == 0) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0024_22.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) == 0) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7156, 1);
myself.ShowPage(talker, "shadow_hardin_q0025_01.htm");
myself.SetFlagJournal(talker, 25, 3);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 1 && gg.OwnItemCount(talker, 7156) >= 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_02.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 6 && gg.OwnItemCount(talker, 7157)) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_03.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 == 7) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_05.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 9 && gg.OwnItemCount(talker, 7066) >= 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_06.htm");
myself.SetFlagJournal(talker, 25, 10);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 16) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_06a.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 19) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_12.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 20) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_14.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_15.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0025_15a.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 11) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0074_0131.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 12) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0074_0132.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || talker.level >= 63 && gg.HaveMemo(talker, 632) == 0) {
myself.SetCurrentQuestID(632);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "shadow_hardin_q0632_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 632);
myself.ShowQuestFHTML(talker, fhtml0, 632);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 21: {
if (_from_choice == 0 || talker.level < 63 && gg.HaveMemo(talker, 632) == 0) {
myself.SetCurrentQuestID(632);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "shadow_hardin_q0632_0103.htm", 632);

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 632) == 1 && gg.GetMemoState(talker, 632) >= 1 * 10 + 1 && gg.GetMemoState(talker, 632) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(632);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 632, 1);
if (gg.GetMemoState(talker, 632) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7542) >= 200) {
myself.ShowPage(talker, "shadow_hardin_q0632_0105.htm");

} else {
myself.ShowPage(talker, "shadow_hardin_q0632_0106.htm");

}

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 1) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_01.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 2 && gg.OwnItemCount(talker, 9745) == 0) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_06a.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 2 && gg.OwnItemCount(talker, 9745) >= 1) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_07a.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 6) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_10a.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 20 && gg.GetMemoStateEx(talker, 236, 1) == 0) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_15a.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 0) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 236, 1, 1);
myself.ShowPage(talker, "shadow_hardin_q0236_06b.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 1) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 236, 1, 2);
myself.ShowPage(talker, "shadow_hardin_q0236_07b.htm");
myself.SetFlagJournal(talker, 236, 7);
myself.ShowQuestMark(talker, 236);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 2) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_08b.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 7 && gg.OwnItemCount(talker, 9744) == 0) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_12b.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 7 && gg.OwnItemCount(talker, 9744) >= 1) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_13b.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 11) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shadow_hardin_q0236_16b.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 63 && gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 21);
myself.SetMemoState(talker, 21, 1);
myself.SetFlagJournal(talker, 21, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "shadow_hardin_q0021_02.htm", 21);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowQuestPage(talker, "shadow_hardin_q0021_03.htm", 21);

}
return;

}
if (quest_id == 632) {
myself.SetCurrentQuestID(632);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 632);
myself.ShowQuestMark(talker, 632);
myself.SetMemoState(talker, 632, 1 * 10 + 1);
gg.AddLog(1, talker, 632);
myself.SetFlagJournal(talker, 632, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "shadow_hardin_q0632_0104.htm", 632);

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(236);
if (timer_id == 23610) {
if (myself.i_quest0 == 1) {
myself.i_quest0 = 0;

}

}
if (timer_id == 23613) {
if (myself.i_quest0 == 1) {
myself.i_quest0 = 0;

}

}
if (timer_id == 23614) {
if (myself.i_quest0 == 1) {
myself.i_quest0 = 0;

}

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam npc0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 21) {
if (reply == 1001) {
if (gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 0) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "shadow_hardin_q0021_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 21);
myself.ShowQuestFHTML(talker, fhtml0, 21);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

} else if (gg.HaveMemo(talker, 21) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1) {
myself.ShowPage(talker, "finishedquest.htm");

}

}

}
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 13) {
myself.ShowPage(talker, "shadow_hardin_q0024_02.htm");

}
if (reply == 14) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 11 && gg.OwnItemCount(talker, 7151) >= 1) {
myself.DeleteItem1(talker, 7151, gg.OwnItemCount(talker, 7151));
myself.SetMemoState(talker, 24, 12);
myself.ShowPage(talker, "shadow_hardin_q0024_03.htm");

}

}
if (reply == 15) {
myself.ShowPage(talker, "shadow_hardin_q0024_05.htm");

}
if (reply == 16) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 12) {
myself.SetMemoState(talker, 24, 13);
myself.ShowPage(talker, "shadow_hardin_q0024_08.htm");
myself.SetFlagJournal(talker, 24, 11);
myself.ShowQuestMark(talker, 24);

}

}
if (reply == 17) {
myself.ShowPage(talker, "shadow_hardin_q0024_16.htm");

}
if (reply == 18) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 13) {
myself.SetMemoState(talker, 24, 14);
myself.ShowPage(talker, "shadow_hardin_q0024_17.htm");

}

}
if (reply == 19) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 14) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7156, 1);
myself.IncrementParam(talker, 0, 242105);
myself.IncrementParam(talker, 1, 22529);
myself.RemoveMemo(talker, 24);
gg.AddLog(2, talker, 24);
myself.SetOneTimeQuestFlag(talker, 24, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "shadow_hardin_q0024_21.htm");

}

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 7) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 6 && gg.OwnItemCount(talker, 7157)) {
myself.SetMemoState(talker, 25, 7);
myself.SetMemoStateEx(talker, 25, 1, 20);
myself.ShowPage(talker, "shadow_hardin_q0025_04.htm");
myself.SetFlagJournal(talker, 25, 6);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 17) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 16) {
myself.SetMemoState(talker, 25, 19);
myself.ShowPage(talker, "shadow_hardin_q0025_10.htm");

}

}
if (reply == 18) {
myself.ShowPage(talker, "shadow_hardin_q0025_11.htm");

}
if (reply == 19) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 19) {
myself.SetMemoState(talker, 25, 20);
myself.ShowPage(talker, "shadow_hardin_q0025_13.htm");
myself.SetFlagJournal(talker, 25, 16);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 23) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 874, 1);
myself.GiveItem1(talker, 936, 1);
myself.DeleteItem1(talker, 7063, gg.OwnItemCount(talker, 7063));
myself.IncrementParam(talker, 0, 572277);
myself.IncrementParam(talker, 1, 53750);
myself.ShowPage(talker, "shadow_hardin_q0025_16.htm");
myself.RemoveMemo(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 25, 1);
gg.AddLog(2, talker, 25);

}

}

}

}
if (ask == 74) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 74) {
if (reply == 9) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 11) {
myself.SetMemoState(talker, 74, 12);
myself.ShowPage(talker, "shadow_hardin_q0074_0133.htm");
myself.SetFlagJournal(talker, 74, 15);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 632) {
myself.SetCurrentQuestID(632);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 632) {
i0 = myself.GetHTMLCookie(talker, 632, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 632) == 1) {
myself.ShowPage(talker, "shadow_hardin_q0632_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 632) == 1) {
if (gg.OwnItemCount(talker, 7542) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7542, gg.OwnItemCount(talker, 7542));
myself.GiveItem1(talker, 57, 120000);

}
myself.SetMemoState(talker, 632, 2 - 1 * 10 + 1);
gg.AddLog(3, talker, 632);
myself.ShowPage(talker, "shadow_hardin_q0632_0202.htm");

} else {
myself.ShowPage(talker, "shadow_hardin_q0632_0203.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7542, gg.OwnItemCount(talker, 7542));
gg.AddLog(2, talker, 632);
myself.RemoveMemo(talker, 632);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "shadow_hardin_q0632_0204.htm");

}

}

}

}
if (ask == 236) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 236) {
if (reply == 1) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 1) {
myself.ShowPage(talker, "shadow_hardin_q0236_04a.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 1) {
myself.SetMemoState(talker, 236, 2);
myself.ShowPage(talker, "shadow_hardin_q0236_05a.htm");
myself.SetFlagJournal(talker, 236, 2);
myself.ShowQuestMark(talker, 236);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
myself.ShowPage(talker, "shadow_hardin_q0236_04b.htm");

}
if (reply == 4) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 1) {
myself.SetMemoState(talker, 236, 3);
myself.SetMemoStateEx(talker, 236, 1, 0);
myself.ShowPage(talker, "shadow_hardin_q0236_05b.htm");
myself.SetFlagJournal(talker, 236, 6);
myself.ShowQuestMark(talker, 236);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 2 && gg.OwnItemCount(talker, 9745) >= 1) {
myself.DeleteItem1(talker, 9745, gg.OwnItemCount(talker, 9745));
myself.SetMemoState(talker, 236, 6);
myself.ShowPage(talker, "shadow_hardin_q0236_09a.htm");
myself.SetFlagJournal(talker, 236, 4);
myself.ShowQuestMark(talker, 236);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 6) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "shadow_hardin_q0236_12a.htm");
myself.CreateOnePrivateEx(1032235, "keitnat_q0236", 0, 0, gg.FloatToInt(myself.sm.x) + 10, gg.FloatToInt(myself.sm.y) + 10, gg.FloatToInt(myself.sm.z) + 10, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "shadow_hardin_q0236_13a.htm");

} else {
myself.ShowPage(talker, "shadow_hardin_q0236_14a.htm");

}

}

}

}
if (ask == 236) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 236) {
if (reply == 101) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 3 && gg.GetMemoStateEx(talker, 236, 1) == 2) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "shadow_hardin_q0236_09b.htm");
myself.CreateOnePrivateEx(1032332, "keitnat_q0236a", 0, 0, gg.FloatToInt(myself.sm.x) + 10, gg.FloatToInt(myself.sm.y) + 10, gg.FloatToInt(myself.sm.z) + 10, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "shadow_hardin_q0236_10b.htm");

} else {
myself.ShowPage(talker, "shadow_hardin_q0236_11b.htm");

}

}

}

}
if (ask == 236) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 236) {
if (reply == 201) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 7 && gg.OwnItemCount(talker, 9744) >= 1) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "shadow_hardin_q0236_14b.htm");
myself.CreateOnePrivateEx(1032333, "keitnat_q0236b", 0, 0, gg.FloatToInt(myself.sm.x) + 10, gg.FloatToInt(myself.sm.y) + 10, gg.FloatToInt(myself.sm.z) + 10, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "shadow_hardin_q0236_15b.htm");

} else {
myself.ShowPage(talker, "shadow_hardin_q0236_15bz.htm");

}

}

}

}
super;
	}


}