package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class donath extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 4) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 3) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 4) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 3) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 4) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 2) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 3) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 4) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 2) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 3) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 4) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 2) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 3) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 4) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 2) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 3) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 4) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 2) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 3) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 4) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 2) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 3) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 4) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Saga of the Ghost Hunter (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 2) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0070_0111.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 3) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
myself.ShowPage(talker, "donath_q0070_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0070_0112.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 4) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0070_0114.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 2) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0071_0111.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 3) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
myself.ShowPage(talker, "donath_q0071_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0071_0112.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 4) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0071_0114.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 2) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0072_0111.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 3) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
myself.ShowPage(talker, "donath_q0072_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0072_0112.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 4) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0072_0114.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 2) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0073_0111.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 3) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 7546) >= 1) {
myself.ShowPage(talker, "donath_q0073_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0073_0112.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 4) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0073_0114.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 2) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0074_0111.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 3) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6480) >= 1) {
myself.ShowPage(talker, "donath_q0074_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0074_0112.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 4) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0074_0114.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 2) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0075_0111.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 3) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0075_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0075_0112.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 4) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0075_0114.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 2) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0076_0111.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 3) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0076_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0076_0112.htm");

}

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 4) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0076_0114.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 2) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0077_0111.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 3) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0077_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0077_0112.htm");

}

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 4) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0077_0114.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 2) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0078_0111.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 3) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0078_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0078_0112.htm");

}

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 4) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0078_0114.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 2) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0080_0111.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 3) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0080_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0080_0112.htm");

}

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 4) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0080_0114.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 2) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0081_0111.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 3) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "donath_q0081_0113.htm");

} else {
myself.ShowPage(talker, "donath_q0081_0112.htm");

}

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 4) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "donath_q0081_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 3) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 2) {
myself.SetMemoState(talker, 70, 3);
myself.ShowPage(talker, "donath_q0070_0115.htm");
myself.SetFlagJournal(talker, 70, 3);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 3 && gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7534, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.DeleteItem1(talker, 6482, 1);
myself.SetMemoState(talker, 70, 4);
myself.ShowPage(talker, "donath_q0070_0116.htm");
myself.SetFlagJournal(talker, 70, 4);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 3) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 2) {
myself.SetMemoState(talker, 71, 3);
myself.ShowPage(talker, "donath_q0071_0115.htm");
myself.SetFlagJournal(talker, 71, 3);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 3 && gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7535, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.DeleteItem1(talker, 6482, 1);
myself.SetMemoState(talker, 71, 4);
myself.ShowPage(talker, "donath_q0071_0116.htm");
myself.SetFlagJournal(talker, 71, 4);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 3) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 2) {
myself.SetMemoState(talker, 72, 3);
myself.ShowPage(talker, "donath_q0072_0115.htm");
myself.SetFlagJournal(talker, 72, 3);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 3 && gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6482) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7536, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.DeleteItem1(talker, 6482, 1);
myself.SetMemoState(talker, 72, 4);
myself.ShowPage(talker, "donath_q0072_0116.htm");
myself.SetFlagJournal(talker, 72, 4);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 73) {
if (reply == 3) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 2) {
myself.SetMemoState(talker, 73, 3);
myself.ShowPage(talker, "donath_q0073_0115.htm");
myself.SetFlagJournal(talker, 73, 3);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 3 && gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 7546) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7537, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.DeleteItem1(talker, 7546, 1);
myself.SetMemoState(talker, 73, 4);
myself.ShowPage(talker, "donath_q0073_0116.htm");
myself.SetFlagJournal(talker, 73, 4);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (reply == 3) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 2) {
myself.SetMemoState(talker, 74, 3);
myself.ShowPage(talker, "donath_q0074_0115.htm");
myself.SetFlagJournal(talker, 74, 3);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 3 && gg.OwnItemCount(talker, 7080) >= 1 && gg.OwnItemCount(talker, 6480) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7538, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.DeleteItem1(talker, 6480, 1);
myself.SetMemoState(talker, 74, 4);
myself.ShowPage(talker, "donath_q0074_0116.htm");
myself.SetFlagJournal(talker, 74, 4);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 2) {
myself.SetMemoState(talker, 75, 3);
myself.ShowPage(talker, "donath_q0075_0115.htm");
myself.SetFlagJournal(talker, 75, 3);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7539, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 75, 4);
myself.ShowPage(talker, "donath_q0075_0116.htm");
myself.SetFlagJournal(talker, 75, 4);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 2) {
myself.SetMemoState(talker, 76, 3);
myself.ShowPage(talker, "donath_q0076_0115.htm");
myself.SetFlagJournal(talker, 76, 3);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7539, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 76, 4);
myself.ShowPage(talker, "donath_q0076_0116.htm");
myself.SetFlagJournal(talker, 76, 4);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 2) {
myself.SetMemoState(talker, 77, 3);
myself.ShowPage(talker, "donath_q0077_0115.htm");
myself.SetFlagJournal(talker, 77, 3);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7539, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 77, 4);
myself.ShowPage(talker, "donath_q0077_0116.htm");
myself.SetFlagJournal(talker, 77, 4);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 2) {
myself.SetMemoState(talker, 78, 3);
myself.ShowPage(talker, "donath_q0078_0115.htm");
myself.SetFlagJournal(talker, 78, 3);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7539, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 78, 4);
myself.ShowPage(talker, "donath_q0078_0116.htm");
myself.SetFlagJournal(talker, 78, 4);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 2) {
myself.SetMemoState(talker, 80, 3);
myself.ShowPage(talker, "donath_q0080_0115.htm");
myself.SetFlagJournal(talker, 80, 3);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7517, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 80, 4);
myself.ShowPage(talker, "donath_q0080_0116.htm");
myself.SetFlagJournal(talker, 80, 4);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

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
if (reply == 3) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 2) {
myself.SetMemoState(talker, 81, 3);
myself.ShowPage(talker, "donath_q0081_0115.htm");
myself.SetFlagJournal(talker, 81, 3);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7518, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 81, 4);
myself.ShowPage(talker, "donath_q0081_0116.htm");
myself.SetFlagJournal(talker, 81, 4);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}