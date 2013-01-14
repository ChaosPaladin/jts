package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class herald_wakan extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 605) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Alliance with Ketra Orcs");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1 && gg.OwnItemCount(talker, 7216) < 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1 && gg.OwnItemCount(talker, 7216) >= 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) > 0 && gg.OwnItemCount(talker, 7216) < 200 || gg.OwnItemCount(talker, 7217) < 100) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) > 0 && gg.OwnItemCount(talker, 7216) >= 200 && gg.OwnItemCount(talker, 7217) >= 100) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7212) > 0 && gg.OwnItemCount(talker, 7216) < 300 || gg.OwnItemCount(talker, 7217) < 200 || gg.OwnItemCount(talker, 7218) < 100) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7212) > 0 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 200 && gg.OwnItemCount(talker, 7218) >= 100) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7213) > 0 && gg.OwnItemCount(talker, 7216) < 300 || gg.OwnItemCount(talker, 7217) < 300 || gg.OwnItemCount(talker, 7218) < 200 || gg.OwnItemCount(talker, 7219) < 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7213) > 0 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 300 && gg.OwnItemCount(talker, 7218) >= 200 && gg.OwnItemCount(talker, 7219) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7214) > 0 && gg.OwnItemCount(talker, 7216) < 400 || gg.OwnItemCount(talker, 7217) < 400 || gg.OwnItemCount(talker, 7218) < 200 || gg.OwnItemCount(talker, 7220) < 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7214) > 0 && gg.OwnItemCount(talker, 7216) >= 400 && gg.OwnItemCount(talker, 7217) >= 400 && gg.OwnItemCount(talker, 7218) >= 200 && gg.OwnItemCount(talker, 7220) > 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7215) > 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Alliance with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 609) == 0 && talker.level >= 74) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Magical Power of Water - Part 1");

}
if (gg.HaveMemo(talker, 609) == 0 && talker.level < 74) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Magical Power of Water - Part 1");

}
if (gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Magical Power of Water - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 11) == 1 && gg.OwnItemCount(talker, 7231) >= 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Secret Meeting with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) >= 2 && gg.GetMemoState(talker, 77) <= 4 && gg.OwnItemCount(talker, 7539) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) >= 2 && gg.GetMemoState(talker, 77) <= 4 && gg.OwnItemCount(talker, 7539) >= 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 5) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Dominator (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 0) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 74) {
myself.FHTML_SetFileName(fhtml0, "herald_wakan_q0605_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 605);
myself.ShowQuestFHTML(talker, fhtml0, 605);

} else {
myself.ShowQuestPage(talker, "herald_wakan_q0605_03.htm", 605);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1 && gg.OwnItemCount(talker, 7216) < 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_10.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1 && gg.OwnItemCount(talker, 7216) >= 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_11.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) > 0 && gg.OwnItemCount(talker, 7216) < 200 || gg.OwnItemCount(talker, 7217) < 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_13.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7211) > 0 && gg.OwnItemCount(talker, 7216) >= 200 && gg.OwnItemCount(talker, 7217) >= 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_14.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7212) > 0 && gg.OwnItemCount(talker, 7216) < 300 || gg.OwnItemCount(talker, 7217) < 200 || gg.OwnItemCount(talker, 7218) < 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_16.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7212) > 0 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 200 && gg.OwnItemCount(talker, 7218) >= 100) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_17.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7213) > 0 && gg.OwnItemCount(talker, 7216) < 300 || gg.OwnItemCount(talker, 7217) < 300 || gg.OwnItemCount(talker, 7218) < 200 || gg.OwnItemCount(talker, 7219) < 1) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_19.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7213) > 0 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 300 && gg.OwnItemCount(talker, 7218) >= 200 && gg.OwnItemCount(talker, 7219) > 0) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_20.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7214) > 0 && gg.OwnItemCount(talker, 7216) < 400 || gg.OwnItemCount(talker, 7217) < 400 || gg.OwnItemCount(talker, 7218) < 200 || gg.OwnItemCount(talker, 7220) < 1) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_22.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7214) > 0 && gg.OwnItemCount(talker, 7216) >= 400 && gg.OwnItemCount(talker, 7217) >= 400 && gg.OwnItemCount(talker, 7218) >= 200 && gg.OwnItemCount(talker, 7220) > 0) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_23.htm");
myself.GiveItem1(talker, 7215, 1);
myself.DeleteItem1(talker, 7214, gg.OwnItemCount(talker, 7214));
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.DeleteItem1(talker, 7217, gg.OwnItemCount(talker, 7217));
myself.DeleteItem1(talker, 7218, gg.OwnItemCount(talker, 7218));
myself.DeleteItem1(talker, 7220, gg.OwnItemCount(talker, 7220));
myself.SetFlagJournal(talker, 605, 6);
myself.ShowQuestMark(talker, 605);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 605) == 1 && gg.OwnItemCount(talker, 7215) > 0) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0605_24.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 0 && talker.level >= 74) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7211) > 0 || gg.OwnItemCount(talker, 7212) > 0 || gg.OwnItemCount(talker, 7213) > 0 || gg.OwnItemCount(talker, 7214) > 0 || gg.OwnItemCount(talker, 7215) > 0) {
myself.FHTML_SetFileName(fhtml0, "herald_wakan_q0609_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 609);
myself.ShowQuestFHTML(talker, fhtml0, 609);

} else {
myself.ShowQuestPage(talker, "herald_wakan_q0609_01a.htm", 609);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 0 && talker.level < 74) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "herald_wakan_q0609_01b.htm", 609);

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 1) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0609_03.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 11) == 1 && gg.OwnItemCount(talker, 7231) >= 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 2 * 10 + 1) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 11, 2);
myself.ShowPage(talker, "herald_wakan_q0011_0201.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0077_0101.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) >= 2 && gg.GetMemoState(talker, 77) <= 4 && gg.OwnItemCount(talker, 7539) == 0) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0077_0102.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) >= 2 && gg.GetMemoState(talker, 77) <= 4 && gg.OwnItemCount(talker, 7539) >= 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0077_0103.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 5) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "herald_wakan_q0077_0104.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 605) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7221) > 0 || gg.OwnItemCount(talker, 7222) > 0 || gg.OwnItemCount(talker, 7223) > 0 || gg.OwnItemCount(talker, 7224) > 0 || gg.OwnItemCount(talker, 7225) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_02.htm", 605);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 605);
gg.AddLog(1, talker, 605);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_04.htm", 605);
myself.SetFlagJournal(talker, 605, 1);

} else if (gg.OwnItemCount(talker, 7211) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_05.htm", 605);
myself.SetFlagJournal(talker, 605, 2);
myself.ShowQuestMark(talker, 605);

} else if (gg.OwnItemCount(talker, 7212) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_06.htm", 605);
myself.SetFlagJournal(talker, 605, 3);
myself.ShowQuestMark(talker, 605);

} else if (gg.OwnItemCount(talker, 7213) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_07.htm", 605);
myself.SetFlagJournal(talker, 605, 4);
myself.ShowQuestMark(talker, 605);

} else if (gg.OwnItemCount(talker, 7214) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_08.htm", 605);
myself.SetFlagJournal(talker, 605, 5);
myself.ShowQuestMark(talker, 605);

} else if (gg.OwnItemCount(talker, 7215) > 0) {
myself.ShowQuestPage(talker, "herald_wakan_q0605_09.htm", 605);
myself.SetFlagJournal(talker, 605, 6);
myself.ShowQuestMark(talker, 605);

}

}
return;

}
if (quest_id == 609) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 609);
myself.SetMemoState(talker, 609, 1);
gg.AddLog(1, talker, 609);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "herald_wakan_q0609_02.htm", 609);
myself.SetFlagJournal(talker, 609, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 605) {
myself.SetCurrentQuestID(605);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 605) {
if (reply == 1 && gg.OwnItemCount(talker, 7211) < 1 && gg.OwnItemCount(talker, 7212) < 1 && gg.OwnItemCount(talker, 7213) < 1 && gg.OwnItemCount(talker, 7214) < 1 && gg.OwnItemCount(talker, 7215) < 1 && gg.OwnItemCount(talker, 7216) >= 100) {
myself.ShowPage(talker, "herald_wakan_q0605_12.htm");
myself.GiveItem1(talker, 7211, 1);
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.SetFlagJournal(talker, 605, 2);
myself.ShowQuestMark(talker, 605);

}
if (reply == 2 && gg.OwnItemCount(talker, 7211) > 0 && gg.OwnItemCount(talker, 7216) >= 200 && gg.OwnItemCount(talker, 7217) >= 100) {
myself.ShowPage(talker, "herald_wakan_q0605_15.htm");
myself.GiveItem1(talker, 7212, 1);
myself.DeleteItem1(talker, 7211, gg.OwnItemCount(talker, 7211));
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.DeleteItem1(talker, 7217, gg.OwnItemCount(talker, 7217));
myself.SetFlagJournal(talker, 605, 3);
myself.ShowQuestMark(talker, 605);

}
if (reply == 3 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 200 && gg.OwnItemCount(talker, 7218) >= 100) {
myself.ShowPage(talker, "herald_wakan_q0605_18.htm");
myself.GiveItem1(talker, 7213, 1);
myself.DeleteItem1(talker, 7212, gg.OwnItemCount(talker, 7212));
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.DeleteItem1(talker, 7217, gg.OwnItemCount(talker, 7217));
myself.DeleteItem1(talker, 7218, gg.OwnItemCount(talker, 7218));
myself.SetFlagJournal(talker, 605, 4);
myself.ShowQuestMark(talker, 605);

}
if (reply == 4 && gg.OwnItemCount(talker, 7216) >= 300 && gg.OwnItemCount(talker, 7217) >= 300 && gg.OwnItemCount(talker, 7218) >= 200 && gg.OwnItemCount(talker, 7219) > 0) {
myself.ShowPage(talker, "herald_wakan_q0605_21.htm");
myself.GiveItem1(talker, 7214, 1);
myself.DeleteItem1(talker, 7213, gg.OwnItemCount(talker, 7213));
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.DeleteItem1(talker, 7217, gg.OwnItemCount(talker, 7217));
myself.DeleteItem1(talker, 7218, gg.OwnItemCount(talker, 7218));
myself.DeleteItem1(talker, 7219, gg.OwnItemCount(talker, 7219));
myself.SetFlagJournal(talker, 605, 5);
myself.ShowQuestMark(talker, 605);

}
if (reply == 5) {
myself.ShowPage(talker, "herald_wakan_q0605_25.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "herald_wakan_q0605_26.htm");
myself.DeleteItem1(talker, 7215, gg.OwnItemCount(talker, 7215));
myself.DeleteItem1(talker, 7211, gg.OwnItemCount(talker, 7211));
myself.DeleteItem1(talker, 7212, gg.OwnItemCount(talker, 7212));
myself.DeleteItem1(talker, 7213, gg.OwnItemCount(talker, 7213));
myself.DeleteItem1(talker, 7214, gg.OwnItemCount(talker, 7214));
myself.DeleteItem1(talker, 7216, gg.OwnItemCount(talker, 7216));
myself.DeleteItem1(talker, 7217, gg.OwnItemCount(talker, 7217));
myself.DeleteItem1(talker, 7218, gg.OwnItemCount(talker, 7218));
myself.DeleteItem1(talker, 7219, gg.OwnItemCount(talker, 7219));
myself.DeleteItem1(talker, 7220, gg.OwnItemCount(talker, 7220));
myself.RemoveMemo(talker, 605);
gg.AddLog(2, talker, 605);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
if (ask == 11) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 11 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
i0 = myself.GetHTMLCookie(talker, 11, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
if (gg.OwnItemCount(talker, 7231) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7231, gg.OwnItemCount(talker, 7231));
myself.IncrementParam(talker, 0, 82045);
myself.IncrementParam(talker, 1, 6047);

}
gg.AddLog(2, talker, 11);
myself.RemoveMemo(talker, 11);
myself.SetOneTimeQuestFlag(talker, 11, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "herald_wakan_q0011_0301.htm");

} else {
myself.ShowPage(talker, "herald_wakan_q0011_0302.htm");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 1) {
myself.SetMemoState(talker, 77, 2);
myself.ShowPage(talker, "herald_wakan_q0077_0105.htm");
myself.SetFlagJournal(talker, 77, 2);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) >= 2 && gg.GetMemoState(talker, 77) <= 4 && gg.OwnItemCount(talker, 7539) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7275, 1);
myself.DeleteItem1(talker, 7539, gg.OwnItemCount(talker, 7539));
myself.SetMemoState(talker, 77, 5);
myself.ShowPage(talker, "herald_wakan_q0077_0106.htm");
myself.SetFlagJournal(talker, 77, 5);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}