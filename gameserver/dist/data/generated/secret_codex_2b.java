package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_2b extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6 && gg.OwnItemCount(talker, 7300) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6 && gg.OwnItemCount(talker, 7300) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6 && gg.OwnItemCount(talker, 7303) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6 && gg.OwnItemCount(talker, 7303) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6 && gg.OwnItemCount(talker, 7306) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6 && gg.OwnItemCount(talker, 7306) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 7) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6 && gg.OwnItemCount(talker, 7309) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6 && gg.OwnItemCount(talker, 7309) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6 && gg.OwnItemCount(talker, 7312) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6 && gg.OwnItemCount(talker, 7312) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6 && gg.OwnItemCount(talker, 7315) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6 && gg.OwnItemCount(talker, 7315) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6 && gg.OwnItemCount(talker, 7318) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6 && gg.OwnItemCount(talker, 7318) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6 && gg.OwnItemCount(talker, 7321) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6 && gg.OwnItemCount(talker, 7321) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6 && gg.OwnItemCount(talker, 7323) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6 && gg.OwnItemCount(talker, 7323) >= 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6 && gg.OwnItemCount(talker, 7326) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6 && gg.OwnItemCount(talker, 7326) >= 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6 && gg.OwnItemCount(talker, 7329) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6 && gg.OwnItemCount(talker, 7329) >= 1) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 7) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6 && gg.OwnItemCount(talker, 9726) == 0) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6 && gg.OwnItemCount(talker, 9726) >= 1) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "Saga of the Soul Hound (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6 && gg.OwnItemCount(talker, 7300) == 0) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0071_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6 && gg.OwnItemCount(talker, 7300) >= 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0071_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0071_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6 && gg.OwnItemCount(talker, 7303) == 0) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0074_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6 && gg.OwnItemCount(talker, 7303) >= 1) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0074_0102.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0074_0104.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6 && gg.OwnItemCount(talker, 7306) == 0) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0077_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6 && gg.OwnItemCount(talker, 7306) >= 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0077_0102.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 7) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0077_0104.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6 && gg.OwnItemCount(talker, 7309) == 0) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0080_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6 && gg.OwnItemCount(talker, 7309) >= 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0080_0102.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0080_0104.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6 && gg.OwnItemCount(talker, 7312) == 0) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0083_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6 && gg.OwnItemCount(talker, 7312) >= 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0083_0102.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0083_0104.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6 && gg.OwnItemCount(talker, 7315) == 0) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0086_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6 && gg.OwnItemCount(talker, 7315) >= 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0086_0102.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0086_0104.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6 && gg.OwnItemCount(talker, 7318) == 0) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0089_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6 && gg.OwnItemCount(talker, 7318) >= 1) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0089_0102.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0089_0104.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6 && gg.OwnItemCount(talker, 7321) == 0) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0092_0101.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6 && gg.OwnItemCount(talker, 7321) >= 1) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0092_0102.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0092_0104.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6 && gg.OwnItemCount(talker, 7323) == 0) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0094_0101.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6 && gg.OwnItemCount(talker, 7323) >= 1) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0094_0102.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0094_0104.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6 && gg.OwnItemCount(talker, 7326) == 0) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0097_0101.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6 && gg.OwnItemCount(talker, 7326) >= 1) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0097_0102.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0097_0104.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6 && gg.OwnItemCount(talker, 7329) == 0) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0100_0101.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6 && gg.OwnItemCount(talker, 7329) >= 1) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0100_0102.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 7) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0100_0104.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6 && gg.OwnItemCount(talker, 9726) == 0) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0068_0101.htm");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6 && gg.OwnItemCount(talker, 9726) >= 1) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0068_0102.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2b_q0068_0104.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 1) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6 && gg.OwnItemCount(talker, 7300) >= 1) {
myself.DeleteItem1(talker, 7300, gg.OwnItemCount(talker, 7300));
myself.SetMemoState(talker, 71, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0071_0103.htm");
myself.SetFlagJournal(talker, 71, 8);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6 && gg.OwnItemCount(talker, 7303) >= 1) {
myself.DeleteItem1(talker, 7303, gg.OwnItemCount(talker, 7303));
myself.SetMemoState(talker, 74, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0074_0103.htm");
myself.SetFlagJournal(talker, 74, 8);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 77) {
if (reply == 1) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6 && gg.OwnItemCount(talker, 7306) >= 1) {
myself.DeleteItem1(talker, 7306, gg.OwnItemCount(talker, 7306));
myself.SetMemoState(talker, 77, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0077_0103.htm");
myself.SetFlagJournal(talker, 77, 8);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 80) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 80) {
if (reply == 1) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6 && gg.OwnItemCount(talker, 7309) >= 1) {
myself.DeleteItem1(talker, 7309, gg.OwnItemCount(talker, 7309));
myself.SetMemoState(talker, 80, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0080_0103.htm");
myself.SetFlagJournal(talker, 80, 8);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 83) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 83) {
if (reply == 1) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6 && gg.OwnItemCount(talker, 7312) >= 1) {
myself.DeleteItem1(talker, 7312, gg.OwnItemCount(talker, 7312));
myself.SetMemoState(talker, 83, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0083_0103.htm");
myself.SetFlagJournal(talker, 83, 8);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 86) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 86) {
if (reply == 1) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6 && gg.OwnItemCount(talker, 7315) >= 1) {
myself.DeleteItem1(talker, 7315, gg.OwnItemCount(talker, 7315));
myself.SetMemoState(talker, 86, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0086_0103.htm");
myself.SetFlagJournal(talker, 86, 8);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 89) {
if (reply == 1) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6 && gg.OwnItemCount(talker, 7318) >= 1) {
myself.DeleteItem1(talker, 7318, gg.OwnItemCount(talker, 7318));
myself.SetMemoState(talker, 89, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0089_0103.htm");
myself.SetFlagJournal(talker, 89, 8);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 92) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 92) {
if (reply == 1) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6 && gg.OwnItemCount(talker, 7321) >= 1) {
myself.DeleteItem1(talker, 7321, gg.OwnItemCount(talker, 7321));
myself.SetMemoState(talker, 92, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0092_0103.htm");
myself.SetFlagJournal(talker, 92, 8);
myself.ShowQuestMark(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 94) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 94) {
if (reply == 1) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6 && gg.OwnItemCount(talker, 7323) >= 1) {
myself.DeleteItem1(talker, 7323, gg.OwnItemCount(talker, 7323));
myself.SetMemoState(talker, 94, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0094_0103.htm");
myself.SetFlagJournal(talker, 94, 8);
myself.ShowQuestMark(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 97) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 97) {
if (reply == 1) {
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6 && gg.OwnItemCount(talker, 7326) >= 1) {
myself.DeleteItem1(talker, 7326, gg.OwnItemCount(talker, 7326));
myself.SetMemoState(talker, 97, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0097_0103.htm");
myself.SetFlagJournal(talker, 97, 8);
myself.ShowQuestMark(talker, 97);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 100) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 100) {
if (reply == 1) {
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6 && gg.OwnItemCount(talker, 7329) >= 1) {
myself.DeleteItem1(talker, 7329, gg.OwnItemCount(talker, 7329));
myself.SetMemoState(talker, 100, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0100_0103.htm");
myself.SetFlagJournal(talker, 100, 8);
myself.ShowQuestMark(talker, 100);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 68) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 68) {
if (reply == 1) {
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6 && gg.OwnItemCount(talker, 9726) >= 1) {
myself.DeleteItem1(talker, 9726, gg.OwnItemCount(talker, 9726));
myself.SetMemoState(talker, 68, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2b_q0068_0103.htm");
myself.SetFlagJournal(talker, 68, 8);
myself.ShowQuestMark(talker, 68);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}