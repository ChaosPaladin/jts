package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_3a extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 8) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 8) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Doombringer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) == 0) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0070_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) >= 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0070_0105.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0070_0107.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) == 0) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0074_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) >= 1) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0074_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 8) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0074_0107.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) == 0) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0078_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) >= 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0078_0105.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0078_0107.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) == 0) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0082_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) >= 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0082_0105.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 8) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0082_0107.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) == 0) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0088_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) >= 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0088_0105.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0088_0107.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) == 0) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0094_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) >= 1) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0094_0105.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 8) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0094_0107.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) == 0) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0099_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) >= 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0099_0105.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0099_0107.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) == 0) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0067_0101.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) >= 1) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0067_0105.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 8) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3a_q0067_0107.htm");

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
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0070_0102.htm");
myself.CreateOnePrivateEx(1027286, "lost_knight_adhil", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0070_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0070_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 7 && gg.OwnItemCount(talker, 7330) >= 1) {
myself.DeleteItem1(talker, 7330, gg.OwnItemCount(talker, 7330));
myself.SetMemoState(talker, 70, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0070_0106.htm");
myself.SetFlagJournal(talker, 70, 10);
myself.ShowQuestMark(talker, 70);
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
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0074_0102.htm");
myself.CreateOnePrivateEx(1027290, "whitewing_commander", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0074_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0074_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 7 && gg.OwnItemCount(talker, 7334) >= 1) {
myself.DeleteItem1(talker, 7334, gg.OwnItemCount(talker, 7334));
myself.SetMemoState(talker, 74, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0074_0106.htm");
myself.SetFlagJournal(talker, 74, 10);
myself.ShowQuestMark(talker, 74);
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
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0078_0102.htm");
myself.CreateOnePrivateEx(1027295, "mouth_of_saruhi_mudaha", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0078_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0078_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 7 && gg.OwnItemCount(talker, 7338) >= 1) {
myself.DeleteItem1(talker, 7338, gg.OwnItemCount(talker, 7338));
myself.SetMemoState(talker, 78, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0078_0106.htm");
myself.SetFlagJournal(talker, 78, 10);
myself.ShowQuestMark(talker, 78);
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
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0082_0102.htm");
myself.CreateOnePrivateEx(1027296, "guardian_ejekiel1", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0082_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0082_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 7 && gg.OwnItemCount(talker, 7342) >= 1) {
myself.DeleteItem1(talker, 7342, gg.OwnItemCount(talker, 7342));
myself.SetMemoState(talker, 82, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0082_0106.htm");
myself.SetFlagJournal(talker, 82, 10);
myself.ShowQuestMark(talker, 82);
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
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0088_0102.htm");
myself.CreateOnePrivateEx(1027250, "fallenangel_allector_1", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0088_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0088_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 7 && gg.OwnItemCount(talker, 7348) >= 1) {
myself.DeleteItem1(talker, 7348, gg.OwnItemCount(talker, 7348));
myself.SetMemoState(talker, 88, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0088_0106.htm");
myself.SetFlagJournal(talker, 88, 10);
myself.ShowQuestMark(talker, 88);
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
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0094_0102.htm");
myself.CreateOnePrivateEx(1027257, "angel_iconoclasis_1", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0094_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0094_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 7 && gg.OwnItemCount(talker, 7354) >= 1) {
myself.DeleteItem1(talker, 7354, gg.OwnItemCount(talker, 7354));
myself.SetMemoState(talker, 94, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0094_0106.htm");
myself.SetFlagJournal(talker, 94, 10);
myself.ShowQuestMark(talker, 94);
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
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0099_0102.htm");
myself.CreateOnePrivateEx(1027260, "angel_iconoclasis_4", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0099_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0099_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 7 && gg.OwnItemCount(talker, 7359) >= 1) {
myself.DeleteItem1(talker, 7359, gg.OwnItemCount(talker, 7359));
myself.SetMemoState(talker, 99, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0099_0106.htm");
myself.SetFlagJournal(talker, 99, 10);
myself.ShowQuestMark(talker, 99);
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
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3a_q0067_0102.htm");
myself.CreateOnePrivateEx(1027324, "eranus_the_guard", 0, 0, 191046, -40640, -3042, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3a_q0067_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3a_q0067_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 7 && gg.OwnItemCount(talker, 9728) >= 1) {
myself.DeleteItem1(talker, 9728, gg.OwnItemCount(talker, 9728));
myself.SetMemoState(talker, 67, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3a_q0067_0106.htm");
myself.SetFlagJournal(talker, 67, 10);
myself.ShowQuestMark(talker, 67);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}