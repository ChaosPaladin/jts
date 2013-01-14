package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_2a extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6 && gg.OwnItemCount(talker, 7299) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6 && gg.OwnItemCount(talker, 7299) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6 && gg.OwnItemCount(talker, 7302) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6 && gg.OwnItemCount(talker, 7302) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6 && gg.OwnItemCount(talker, 7305) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6 && gg.OwnItemCount(talker, 7305) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6 && gg.OwnItemCount(talker, 7308) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6 && gg.OwnItemCount(talker, 7308) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6 && gg.OwnItemCount(talker, 7311) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6 && gg.OwnItemCount(talker, 7311) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6 && gg.OwnItemCount(talker, 7314) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6 && gg.OwnItemCount(talker, 7314) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6 && gg.OwnItemCount(talker, 7317) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6 && gg.OwnItemCount(talker, 7317) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6 && gg.OwnItemCount(talker, 7320) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6 && gg.OwnItemCount(talker, 7320) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6 && gg.OwnItemCount(talker, 7324) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6 && gg.OwnItemCount(talker, 7324) >= 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 7) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6 && gg.OwnItemCount(talker, 7327) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6 && gg.OwnItemCount(talker, 7327) >= 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6 && gg.OwnItemCount(talker, 9725) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6 && gg.OwnItemCount(talker, 9725) >= 1) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Saga of the Doombringer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6 && gg.OwnItemCount(talker, 7299) == 0) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0070_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6 && gg.OwnItemCount(talker, 7299) >= 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0070_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0070_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6 && gg.OwnItemCount(talker, 7302) == 0) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0073_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6 && gg.OwnItemCount(talker, 7302) >= 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0073_0102.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 7) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0073_0104.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6 && gg.OwnItemCount(talker, 7305) == 0) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0076_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6 && gg.OwnItemCount(talker, 7305) >= 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0076_0102.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 7) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0076_0104.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6 && gg.OwnItemCount(talker, 7308) == 0) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0079_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6 && gg.OwnItemCount(talker, 7308) >= 1) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0079_0102.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0079_0104.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6 && gg.OwnItemCount(talker, 7311) == 0) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0082_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6 && gg.OwnItemCount(talker, 7311) >= 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0082_0102.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0082_0104.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6 && gg.OwnItemCount(talker, 7314) == 0) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0085_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6 && gg.OwnItemCount(talker, 7314) >= 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0085_0102.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0085_0104.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6 && gg.OwnItemCount(talker, 7317) == 0) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0088_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6 && gg.OwnItemCount(talker, 7317) >= 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0088_0102.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0088_0104.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6 && gg.OwnItemCount(talker, 7320) == 0) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0091_0101.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6 && gg.OwnItemCount(talker, 7320) >= 1) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0091_0102.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0091_0104.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6 && gg.OwnItemCount(talker, 7324) == 0) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0095_0101.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6 && gg.OwnItemCount(talker, 7324) >= 1) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0095_0102.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 7) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0095_0104.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6 && gg.OwnItemCount(talker, 7327) == 0) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0098_0101.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6 && gg.OwnItemCount(talker, 7327) >= 1) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0098_0102.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0098_0104.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6 && gg.OwnItemCount(talker, 9725) == 0) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0067_0101.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6 && gg.OwnItemCount(talker, 9725) >= 1) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0067_0102.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_2a_q0067_0104.htm");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6 && gg.OwnItemCount(talker, 7299) >= 1) {
myself.DeleteItem1(talker, 7299, gg.OwnItemCount(talker, 7299));
myself.SetMemoState(talker, 70, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0070_0103.htm");
myself.SetFlagJournal(talker, 70, 8);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6 && gg.OwnItemCount(talker, 7302) >= 1) {
myself.DeleteItem1(talker, 7302, gg.OwnItemCount(talker, 7302));
myself.SetMemoState(talker, 73, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0073_0103.htm");
myself.SetFlagJournal(talker, 73, 8);
myself.ShowQuestMark(talker, 73);
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
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6 && gg.OwnItemCount(talker, 7305) >= 1) {
myself.DeleteItem1(talker, 7305, gg.OwnItemCount(talker, 7305));
myself.SetMemoState(talker, 76, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0076_0103.htm");
myself.SetFlagJournal(talker, 76, 8);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 1) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6 && gg.OwnItemCount(talker, 7308) >= 1) {
myself.DeleteItem1(talker, 7308, gg.OwnItemCount(talker, 7308));
myself.SetMemoState(talker, 79, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0079_0103.htm");
myself.SetFlagJournal(talker, 79, 8);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 1) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6 && gg.OwnItemCount(talker, 7311) >= 1) {
myself.DeleteItem1(talker, 7311, gg.OwnItemCount(talker, 7311));
myself.SetMemoState(talker, 82, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0082_0103.htm");
myself.SetFlagJournal(talker, 82, 8);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 1) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6 && gg.OwnItemCount(talker, 7314) >= 1) {
myself.DeleteItem1(talker, 7314, gg.OwnItemCount(talker, 7314));
myself.SetMemoState(talker, 85, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0085_0103.htm");
myself.SetFlagJournal(talker, 85, 8);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 1) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6 && gg.OwnItemCount(talker, 7317) >= 1) {
myself.DeleteItem1(talker, 7317, gg.OwnItemCount(talker, 7317));
myself.SetMemoState(talker, 88, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0088_0103.htm");
myself.SetFlagJournal(talker, 88, 8);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 91) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 91) {
if (reply == 1) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6 && gg.OwnItemCount(talker, 7320) >= 1) {
myself.DeleteItem1(talker, 7320, gg.OwnItemCount(talker, 7320));
myself.SetMemoState(talker, 91, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0091_0103.htm");
myself.SetFlagJournal(talker, 91, 8);
myself.ShowQuestMark(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 95) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 95) {
if (reply == 1) {
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6 && gg.OwnItemCount(talker, 7324) >= 1) {
myself.DeleteItem1(talker, 7324, gg.OwnItemCount(talker, 7324));
myself.SetMemoState(talker, 95, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0095_0103.htm");
myself.SetFlagJournal(talker, 95, 8);
myself.ShowQuestMark(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 98) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 98) {
if (reply == 1) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6 && gg.OwnItemCount(talker, 7327) >= 1) {
myself.DeleteItem1(talker, 7327, gg.OwnItemCount(talker, 7327));
myself.SetMemoState(talker, 98, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0098_0103.htm");
myself.SetFlagJournal(talker, 98, 8);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 67) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 67) {
if (reply == 1) {
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6 && gg.OwnItemCount(talker, 9725) >= 1) {
myself.DeleteItem1(talker, 9725, gg.OwnItemCount(talker, 9725));
myself.SetMemoState(talker, 67, 7);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_2a_q0067_0103.htm");
myself.SetFlagJournal(talker, 67, 8);
myself.ShowQuestMark(talker, 67);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}