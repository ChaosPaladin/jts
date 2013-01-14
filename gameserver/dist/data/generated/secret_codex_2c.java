package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_2c extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6 && gg.OwnItemCount(talker, 7301) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6 && gg.OwnItemCount(talker, 7301) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6 && gg.OwnItemCount(talker, 7304) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6 && gg.OwnItemCount(talker, 7304) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6 && gg.OwnItemCount(talker, 7307) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6 && gg.OwnItemCount(talker, 7307) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6 && gg.OwnItemCount(talker, 7310) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6 && gg.OwnItemCount(talker, 7310) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 7) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6 && gg.OwnItemCount(talker, 7313) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6 && gg.OwnItemCount(talker, 7313) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6 && gg.OwnItemCount(talker, 7316) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6 && gg.OwnItemCount(talker, 7316) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 7) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6 && gg.OwnItemCount(talker, 7319) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6 && gg.OwnItemCount(talker, 7319) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6 && gg.OwnItemCount(talker, 7322) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6 && gg.OwnItemCount(talker, 7322) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 7) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6 && gg.OwnItemCount(talker, 7325) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6 && gg.OwnItemCount(talker, 7325) >= 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 7) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6 && gg.OwnItemCount(talker, 7328) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6 && gg.OwnItemCount(talker, 7328) >= 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6 && gg.OwnItemCount(talker, 9727) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6 && gg.OwnItemCount(talker, 9727) >= 1) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 7) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Saga of the Trickster (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6 && gg.OwnItemCount(talker, 7301) == 0) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0072_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6 && gg.OwnItemCount(talker, 7301) >= 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0072_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0072_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6 && gg.OwnItemCount(talker, 7304) == 0) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0075_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6 && gg.OwnItemCount(talker, 7304) >= 1) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0075_0102.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0075_0104.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6 && gg.OwnItemCount(talker, 7307) == 0) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0078_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6 && gg.OwnItemCount(talker, 7307) >= 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0078_0102.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0078_0104.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6 && gg.OwnItemCount(talker, 7310) == 0) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0081_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6 && gg.OwnItemCount(talker, 7310) >= 1) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0081_0102.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 7) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0081_0104.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6 && gg.OwnItemCount(talker, 7313) == 0) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0084_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6 && gg.OwnItemCount(talker, 7313) >= 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0084_0102.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0084_0104.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6 && gg.OwnItemCount(talker, 7316) == 0) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0087_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6 && gg.OwnItemCount(talker, 7316) >= 1) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0087_0102.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 7) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0087_0104.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6 && gg.OwnItemCount(talker, 7319) == 0) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0090_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6 && gg.OwnItemCount(talker, 7319) >= 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0090_0102.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0090_0104.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6 && gg.OwnItemCount(talker, 7322) == 0) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0093_0101.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6 && gg.OwnItemCount(talker, 7322) >= 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0093_0102.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 7) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0093_0104.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6 && gg.OwnItemCount(talker, 7325) == 0) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0096_0101.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6 && gg.OwnItemCount(talker, 7325) >= 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0096_0102.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 7) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0096_0104.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6 && gg.OwnItemCount(talker, 7328) == 0) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0099_0101.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6 && gg.OwnItemCount(talker, 7328) >= 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0099_0102.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0099_0104.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6 && gg.OwnItemCount(talker, 9727) == 0) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0069_0101.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6 && gg.OwnItemCount(talker, 9727) >= 1) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0069_0102.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 7) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2c_q0069_0104.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 1) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6 && gg.OwnItemCount(talker, 7301) >= 1) {
myself.DeleteItem1(talker, 7301, gg.OwnItemCount(talker, 7301));
myself.SetMemoState(talker, 72, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0072_0103.htm");
myself.SetFlagJournal(talker, 72, 8);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 75) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 75) {
if (reply == 1) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6 && gg.OwnItemCount(talker, 7304) >= 1) {
myself.DeleteItem1(talker, 7304, gg.OwnItemCount(talker, 7304));
myself.SetMemoState(talker, 75, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0075_0103.htm");
myself.SetFlagJournal(talker, 75, 8);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 78) {
if (reply == 1) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6 && gg.OwnItemCount(talker, 7307) >= 1) {
myself.DeleteItem1(talker, 7307, gg.OwnItemCount(talker, 7307));
myself.SetMemoState(talker, 78, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0078_0103.htm");
myself.SetFlagJournal(talker, 78, 8);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 81) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 81) {
if (reply == 1) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6 && gg.OwnItemCount(talker, 7310) >= 1) {
myself.DeleteItem1(talker, 7310, gg.OwnItemCount(talker, 7310));
myself.SetMemoState(talker, 81, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0081_0103.htm");
myself.SetFlagJournal(talker, 81, 8);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 84) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 84) {
if (reply == 1) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6 && gg.OwnItemCount(talker, 7313) >= 1) {
myself.DeleteItem1(talker, 7313, gg.OwnItemCount(talker, 7313));
myself.SetMemoState(talker, 84, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0084_0103.htm");
myself.SetFlagJournal(talker, 84, 8);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 87) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 87) {
if (reply == 1) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6 && gg.OwnItemCount(talker, 7316) >= 1) {
myself.DeleteItem1(talker, 7316, gg.OwnItemCount(talker, 7316));
myself.SetMemoState(talker, 87, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0087_0103.htm");
myself.SetFlagJournal(talker, 87, 8);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 1) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6 && gg.OwnItemCount(talker, 7319) >= 1) {
myself.DeleteItem1(talker, 7319, gg.OwnItemCount(talker, 7319));
myself.SetMemoState(talker, 90, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0090_0103.htm");
myself.SetFlagJournal(talker, 90, 8);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 1) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6 && gg.OwnItemCount(talker, 7322) >= 1) {
myself.DeleteItem1(talker, 7322, gg.OwnItemCount(talker, 7322));
myself.SetMemoState(talker, 93, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0093_0103.htm");
myself.SetFlagJournal(talker, 93, 8);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 1) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6 && gg.OwnItemCount(talker, 7325) >= 1) {
myself.DeleteItem1(talker, 7325, gg.OwnItemCount(talker, 7325));
myself.SetMemoState(talker, 96, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0096_0103.htm");
myself.SetFlagJournal(talker, 96, 8);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 99) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 99) {
if (reply == 1) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6 && gg.OwnItemCount(talker, 7328) >= 1) {
myself.DeleteItem1(talker, 7328, gg.OwnItemCount(talker, 7328));
myself.SetMemoState(talker, 99, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0099_0103.htm");
myself.SetFlagJournal(talker, 99, 8);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 69) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 69) {
if (reply == 1) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6 && gg.OwnItemCount(talker, 9727) >= 1) {
myself.DeleteItem1(talker, 9727, gg.OwnItemCount(talker, 9727));
myself.SetMemoState(talker, 69, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2c_q0069_0103.htm");
myself.SetFlagJournal(talker, 69, 8);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}