package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_3c extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 8) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) >= 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 8) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) >= 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 8) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Soul Hound (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) == 0) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0072_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) >= 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0072_0105.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0072_0107.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) == 0) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0076_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) >= 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0076_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0076_0107.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) == 0) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0080_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) >= 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0080_0105.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 8) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0080_0107.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) == 0) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0083_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) >= 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0083_0105.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 8) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0083_0107.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) == 0) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0084_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) >= 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0084_0105.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 8) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0084_0107.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) == 0) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0086_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) >= 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0086_0105.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0086_0107.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) == 0) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0090_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) >= 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0090_0105.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0090_0107.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) == 0) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0092_0101.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) >= 1) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0092_0105.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 8) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0092_0107.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) == 0) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0097_0101.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) >= 1) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0097_0105.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 8) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0097_0107.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) == 0) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0068_0101.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) >= 1) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0068_0105.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 8) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3c_q0068_0107.htm");

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
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0072_0102.htm");
myself.CreateOnePrivateEx(1027288, "swordplayer_baiel", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0072_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0072_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 7 && gg.OwnItemCount(talker, 7332) >= 1) {
myself.DeleteItem1(talker, 7332, gg.OwnItemCount(talker, 7332));
myself.SetMemoState(talker, 72, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0072_0106.htm");
myself.SetFlagJournal(talker, 72, 10);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 76) {
if (reply == 1) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0076_0102.htm");
myself.CreateOnePrivateEx(1027293, "kavatari_uruz", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0076_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0076_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7 && gg.OwnItemCount(talker, 7336) >= 1) {
myself.DeleteItem1(talker, 7336, gg.OwnItemCount(talker, 7336));
myself.SetMemoState(talker, 76, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0076_0106.htm");
myself.SetFlagJournal(talker, 76, 10);
myself.ShowQuestMark(talker, 76);
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
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0080_0102.htm");
myself.CreateOnePrivateEx(1027300, "guardian_ejekiel5", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0080_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0080_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 7 && gg.OwnItemCount(talker, 7340) >= 1) {
myself.DeleteItem1(talker, 7340, gg.OwnItemCount(talker, 7340));
myself.SetMemoState(talker, 80, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0080_0106.htm");
myself.SetFlagJournal(talker, 80, 10);
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
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0083_0102.htm");
myself.CreateOnePrivateEx(1027297, "guardian_ejekiel2", 0, 0, 161719, -92833, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0083_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0083_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 7 && gg.OwnItemCount(talker, 7343) >= 1) {
myself.DeleteItem1(talker, 7343, gg.OwnItemCount(talker, 7343));
myself.SetMemoState(talker, 83, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0083_0106.htm");
myself.SetFlagJournal(talker, 83, 10);
myself.ShowQuestMark(talker, 83);
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
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0084_0102.htm");
myself.CreateOnePrivateEx(1027298, "guardian_ejekiel3", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0084_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0084_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 7 && gg.OwnItemCount(talker, 7344) >= 1) {
myself.DeleteItem1(talker, 7344, gg.OwnItemCount(talker, 7344));
myself.SetMemoState(talker, 84, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0084_0106.htm");
myself.SetFlagJournal(talker, 84, 10);
myself.ShowQuestMark(talker, 84);
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
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0086_0102.htm");
myself.CreateOnePrivateEx(1027269, "fallenangel_naverius_1", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0086_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0086_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 7 && gg.OwnItemCount(talker, 7346) >= 1) {
myself.DeleteItem1(talker, 7346, gg.OwnItemCount(talker, 7346));
myself.SetMemoState(talker, 86, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0086_0106.htm");
myself.SetFlagJournal(talker, 86, 10);
myself.ShowQuestMark(talker, 86);
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
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0090_0102.htm");
myself.CreateOnePrivateEx(1027252, "fallenangel_allector_3", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0090_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0090_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 7 && gg.OwnItemCount(talker, 7350) >= 1) {
myself.DeleteItem1(talker, 7350, gg.OwnItemCount(talker, 7350));
myself.SetMemoState(talker, 90, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0090_0106.htm");
myself.SetFlagJournal(talker, 90, 10);
myself.ShowQuestMark(talker, 90);
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
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0092_0102.htm");
myself.CreateOnePrivateEx(1027314, "secret_keeper_shakiel2", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0092_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0092_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 7 && gg.OwnItemCount(talker, 7352) >= 1) {
myself.DeleteItem1(talker, 7352, gg.OwnItemCount(talker, 7352));
myself.SetMemoState(talker, 92, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0092_0106.htm");
myself.SetFlagJournal(talker, 92, 10);
myself.ShowQuestMark(talker, 92);
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
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0097_0102.htm");
myself.CreateOnePrivateEx(1027271, "kimera_golem", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0097_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0097_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 7 && gg.OwnItemCount(talker, 7357) >= 1) {
myself.DeleteItem1(talker, 7357, gg.OwnItemCount(talker, 7357));
myself.SetMemoState(talker, 97, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0097_0106.htm");
myself.SetFlagJournal(talker, 97, 10);
myself.ShowQuestMark(talker, 97);
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
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3c_q0068_0102.htm");
myself.CreateOnePrivateEx(1027327, "executor_of_zapkiel", 0, 0, 161719, -92823, -1893, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3c_q0068_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3c_q0068_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 7 && gg.OwnItemCount(talker, 9729) >= 1) {
myself.DeleteItem1(talker, 9729, gg.OwnItemCount(talker, 9729));
myself.SetMemoState(talker, 68, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3c_q0068_0106.htm");
myself.SetFlagJournal(talker, 68, 10);
myself.ShowQuestMark(talker, 68);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}