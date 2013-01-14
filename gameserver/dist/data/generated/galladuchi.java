package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class galladuchi extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 3 && gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "To Talking Island");

}
if (talker.level < 3 && gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "To Talking Island");

}
if (gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "To Talking Island (Done)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "To Talking Island (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Once More In the Arms of the Mother Tree");

}
if (talker.level < 3 && gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Once More In the Arms of the Mother Tree");

}
if (gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Once More In the Arms of the Mother Tree (Done)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Into the Dark Elven Forest");

}
if (talker.level < 3 && gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Into the Dark Elven Forest");

}
if (gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Into the Dark Elven Forest (Done)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Into the Dark Elven Forest (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "To the Immortal Plateau");

}
if (talker.level < 3 && gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "To the Immortal Plateau");

}
if (gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 1) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "To the Immortal Plateau (Done)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "To the Immortal Plateau (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "The Road Home");

}
if (talker.level < 3 && gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "The Road Home");

}
if (gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 1) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "The Road Home (Done)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 39;
myself.AddChoice(39, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 40;
myself.AddChoice(40, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 41;
myself.AddChoice(41, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 42;
myself.AddChoice(42, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 43;
myself.AddChoice(43, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 44;
myself.AddChoice(44, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 43) == 1 && gg.OwnItemCount(talker, 7551) >= 1 && gg.GetMemoState(talker, 43) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 45;
myself.AddChoice(45, "Help the Sister! (In Progress)");

}
if (gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 46;
myself.AddChoice(46, "Help the Sister! (In Progress)");

}
if (gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 0 && talker.race == 5 && myself.GetOneTimeQuestFlag(talker, 172) == 1) {
_choiceN = _choiceN + 1;
_code = 47;
myself.AddChoice(47, "To the Isle of Souls");

}
if (gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 0 && talker.race != 5 || myself.GetOneTimeQuestFlag(talker, 172) == 0) {
_choiceN = _choiceN + 1;
_code = 48;
myself.AddChoice(48, "To the Isle of Souls");

}
if (gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 1) {
_choiceN = _choiceN + 1;
_code = 49;
myself.AddChoice(49, "To the Isle of Souls (Done)");

}
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 1) {
_choiceN = _choiceN + 1;
_code = 50;
myself.AddChoice(50, "To the Isle of Souls (In Progress)");

}
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 2) {
_choiceN = _choiceN + 1;
_code = 51;
myself.AddChoice(51, "To the Isle of Souls (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7570) >= 1 && myself.GetOneTimeQuestFlag(talker, 6) == 1) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0045_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 45);
myself.ShowQuestFHTML(talker, fhtml0, 45);

} else {
myself.ShowQuestPage(talker, "galladuchi_q0045_0102.htm", 45);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0045_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 0 && myself.GetOneTimeQuestFlag(talker, 45) == 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 1 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0045_0105.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 2 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 2);
myself.ShowPage(talker, "galladuchi_q0045_0201.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 3 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0045_0303.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 4 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 4);
myself.ShowPage(talker, "galladuchi_q0045_0401.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 5 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0045_0503.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 6 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 6);
myself.ShowPage(talker, "galladuchi_q0045_0601.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7570) >= 1 && myself.GetOneTimeQuestFlag(talker, 7) == 1) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0046_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 46);
myself.ShowQuestFHTML(talker, fhtml0, 46);

} else {
myself.ShowQuestPage(talker, "galladuchi_q0046_0102.htm", 46);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0046_0103.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 0 && myself.GetOneTimeQuestFlag(talker, 46) == 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 1 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0046_0105.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 2 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 2);
myself.ShowPage(talker, "galladuchi_q0046_0201.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 3 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0046_0303.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 4 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 4);
myself.ShowPage(talker, "galladuchi_q0046_0401.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 5 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0046_0503.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 6 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 6);
myself.ShowPage(talker, "galladuchi_q0046_0601.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7570) >= 1 && myself.GetOneTimeQuestFlag(talker, 8) == 1) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0047_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 47);
myself.ShowQuestFHTML(talker, fhtml0, 47);

} else {
myself.ShowPage(talker, "galladuchi_q0047_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 19: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0047_0103.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 0 && myself.GetOneTimeQuestFlag(talker, 47) == 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 1 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0047_0105.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 2 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 2);
myself.ShowPage(talker, "galladuchi_q0047_0201.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 3 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0047_0303.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 4 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 4);
myself.ShowPage(talker, "galladuchi_q0047_0401.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 5 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0047_0503.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 6 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 6);
myself.ShowPage(talker, "galladuchi_q0047_0601.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7570) >= 1 && myself.GetOneTimeQuestFlag(talker, 9) == 1) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0048_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 48);
myself.ShowQuestFHTML(talker, fhtml0, 48);

} else {
myself.ShowPage(talker, "galladuchi_q0048_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 28: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0048_0103.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 0 && myself.GetOneTimeQuestFlag(talker, 48) == 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 1 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0048_0105.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 2 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 2);
myself.ShowPage(talker, "galladuchi_q0048_0201.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 3 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0048_0303.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 4 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 4);
myself.ShowPage(talker, "galladuchi_q0048_0401.htm");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 5 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0048_0503.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 6 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 6);
myself.ShowPage(talker, "galladuchi_q0048_0601.htm");

}
break;

}
case 36: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7570) >= 1 && myself.GetOneTimeQuestFlag(talker, 10) == 1) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0049_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 49);
myself.ShowQuestFHTML(talker, fhtml0, 49);

} else {
myself.ShowPage(talker, "galladuchi_q0049_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 37: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0049_0103.htm");

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 0 && myself.GetOneTimeQuestFlag(talker, 49) == 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 39: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 1 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0049_0105.htm");

}
break;

}
case 40: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7568) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 2 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 2);
myself.ShowPage(talker, "galladuchi_q0049_0201.htm");

}
break;

}
case 41: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 3 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0049_0303.htm");

}
break;

}
case 42: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7567) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 4 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 4);
myself.ShowPage(talker, "galladuchi_q0049_0401.htm");

}
break;

}
case 43: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 5 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0049_0503.htm");

}
break;

}
case 44: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7566) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 6 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 6);
myself.ShowPage(talker, "galladuchi_q0049_0601.htm");

}
break;

}
case 45: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && gg.OwnItemCount(talker, 7551) >= 1 && gg.GetMemoState(talker, 43) == 3 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 43, 3);
myself.ShowPage(talker, "galladuchi_q0043_0301.htm");

}
break;

}
case 46: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 4 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0043_0403.htm");

}
break;

}
case 47: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 0 && talker.race == 5 && myself.GetOneTimeQuestFlag(talker, 172) == 1) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "galladuchi_q0173_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 173);
myself.ShowQuestFHTML(talker, fhtml0, 173);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 48: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 0 && talker.race != 5 || myself.GetOneTimeQuestFlag(talker, 172) == 0) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "galladuchi_q0173_02.htm", 173);

}
break;

}
case 49: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 1) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 50: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 1) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0173_04.htm");

}
break;

}
case 51: {
if (_from_choice == 0 || gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 2) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galladuchi_q0173_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 45);
myself.ShowQuestMark(talker, 45);
myself.SetMemoState(talker, 45, 1 * 10 + 1);
gg.AddLog(1, talker, 45);
myself.SetFlagJournal(talker, 45, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0045_0104.htm", 45);
myself.GiveItem1(talker, 7563, 1);

}
return;

}
if (quest_id == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 46);
myself.ShowQuestMark(talker, 46);
myself.SetMemoState(talker, 46, 1 * 10 + 1);
gg.AddLog(1, talker, 46);
myself.SetFlagJournal(talker, 46, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0046_0104.htm", 46);
myself.GiveItem1(talker, 7563, 1);

}
return;

}
if (quest_id == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 47);
myself.ShowQuestMark(talker, 47);
myself.SetMemoState(talker, 47, 1 * 10 + 1);
gg.AddLog(1, talker, 47);
myself.SetFlagJournal(talker, 47, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0047_0104.htm", 47);
myself.GiveItem1(talker, 7563, 1);

}
return;

}
if (quest_id == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 48);
myself.ShowQuestMark(talker, 48);
myself.SetMemoState(talker, 48, 1 * 10 + 1);
gg.AddLog(1, talker, 48);
myself.SetFlagJournal(talker, 48, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0048_0104.htm", 48);
myself.GiveItem1(talker, 7563, 1);

}
return;

}
if (quest_id == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 49);
myself.ShowQuestMark(talker, 49);
myself.SetMemoState(talker, 49, 1 * 10 + 1);
gg.AddLog(1, talker, 49);
myself.SetFlagJournal(talker, 49, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0049_0104.htm", 49);
myself.GiveItem1(talker, 7563, 1);

}
return;

}
if (quest_id == 173) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 173) == 0 && myself.GetOneTimeQuestFlag(talker, 173) == 0 && talker.race == 5 && myself.GetOneTimeQuestFlag(talker, 172) == 1) {
myself.GiveItem1(talker, 7563, 1);
myself.SetMemoState(talker, 173, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "galladuchi_q0173_03.htm", 173);

}
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45) {
i0 = myself.GetHTMLCookie(talker, 45, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7568) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7568, 1);
myself.GiveItem1(talker, 7564, 1);
myself.ShowPage(talker, "galladuchi_q0045_0301.htm");
myself.SetMemoState(talker, 45, 3 * 10 + 1);
myself.SetFlagJournal(talker, 45, 3);
myself.ShowQuestMark(talker, 45);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0045_0302.htm");

}

}

}

}
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45) {
i0 = myself.GetHTMLCookie(talker, 45, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7567) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7567, 1);
myself.GiveItem1(talker, 7565, 1);
myself.ShowPage(talker, "galladuchi_q0045_0501.htm");
myself.SetMemoState(talker, 45, 5 * 10 + 1);
myself.SetFlagJournal(talker, 45, 5);
myself.ShowQuestMark(talker, 45);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0045_0502.htm");

}

}

}

}
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
i0 = myself.GetHTMLCookie(talker, 45, 7 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7566) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7566, gg.OwnItemCount(talker, 7566));
myself.GiveItem1(talker, 7554, 1);

}
gg.AddLog(2, talker, 45);
myself.RemoveMemo(talker, 45);
myself.SetOneTimeQuestFlag(talker, 45, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0045_0701.htm");

} else {
myself.ShowPage(talker, "galladuchi_q0045_0702.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46) {
i0 = myself.GetHTMLCookie(talker, 46, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7568) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7568, 1);
myself.GiveItem1(talker, 7564, 1);
myself.ShowPage(talker, "galladuchi_q0046_0301.htm");
myself.SetMemoState(talker, 46, 3 * 10 + 1);
myself.SetFlagJournal(talker, 46, 3);
myself.ShowQuestMark(talker, 46);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0046_0302.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46) {
i0 = myself.GetHTMLCookie(talker, 46, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7567) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7567, 1);
myself.GiveItem1(talker, 7565, 1);
myself.ShowPage(talker, "galladuchi_q0046_0501.htm");
myself.SetMemoState(talker, 46, 5 * 10 + 1);
myself.SetFlagJournal(talker, 46, 5);
myself.ShowQuestMark(talker, 46);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0046_0502.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
i0 = myself.GetHTMLCookie(talker, 46, 7 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7566) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7566, gg.OwnItemCount(talker, 7566));
myself.GiveItem1(talker, 7555, 1);

}
gg.AddLog(2, talker, 46);
myself.RemoveMemo(talker, 46);
myself.SetOneTimeQuestFlag(talker, 46, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0046_0701.htm");

} else {
myself.ShowPage(talker, "galladuchi_q0046_0702.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47) {
i0 = myself.GetHTMLCookie(talker, 47, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7568) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7568, 1);
myself.GiveItem1(talker, 7564, 1);
myself.ShowPage(talker, "galladuchi_q0047_0301.htm");
myself.SetMemoState(talker, 47, 3 * 10 + 1);
myself.SetFlagJournal(talker, 47, 3);
myself.ShowQuestMark(talker, 47);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0047_0302.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47) {
i0 = myself.GetHTMLCookie(talker, 47, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7567) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7567, 1);
myself.GiveItem1(talker, 7565, 1);
myself.ShowPage(talker, "galladuchi_q0047_0501.htm");
myself.SetMemoState(talker, 47, 5 * 10 + 1);
myself.SetFlagJournal(talker, 47, 5);
myself.ShowQuestMark(talker, 47);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0047_0502.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
i0 = myself.GetHTMLCookie(talker, 47, 7 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7566) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7566, gg.OwnItemCount(talker, 7566));
myself.GiveItem1(talker, 7556, 1);

}
gg.AddLog(2, talker, 47);
myself.RemoveMemo(talker, 47);
myself.SetOneTimeQuestFlag(talker, 47, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0047_0701.htm");

} else {
myself.ShowPage(talker, "galladuchi_q0047_0702.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48) {
i0 = myself.GetHTMLCookie(talker, 48, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7568) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7568, 1);
myself.GiveItem1(talker, 7564, 1);
myself.ShowPage(talker, "galladuchi_q0048_0301.htm");
myself.SetMemoState(talker, 48, 3 * 10 + 1);
myself.SetFlagJournal(talker, 48, 3);
myself.ShowQuestMark(talker, 48);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0048_0302.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48) {
i0 = myself.GetHTMLCookie(talker, 48, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7567) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7567, 1);
myself.GiveItem1(talker, 7565, 1);
myself.ShowPage(talker, "galladuchi_q0048_0501.htm");
myself.SetMemoState(talker, 48, 5 * 10 + 1);
myself.SetFlagJournal(talker, 48, 5);
myself.ShowQuestMark(talker, 48);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0048_0502.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
i0 = myself.GetHTMLCookie(talker, 48, 7 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7566) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7566, gg.OwnItemCount(talker, 7566));
myself.GiveItem1(talker, 7557, 1);

}
gg.AddLog(2, talker, 48);
myself.RemoveMemo(talker, 48);
myself.SetOneTimeQuestFlag(talker, 48, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0048_0701.htm");

} else {
myself.ShowPage(talker, "galladuchi_q0048_0702.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49) {
i0 = myself.GetHTMLCookie(talker, 49, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7568) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7568, 1);
myself.GiveItem1(talker, 7564, 1);
myself.ShowPage(talker, "galladuchi_q0049_0301.htm");
myself.SetMemoState(talker, 49, 3 * 10 + 1);
myself.SetFlagJournal(talker, 49, 3);
myself.ShowQuestMark(talker, 49);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0049_0302.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49) {
i0 = myself.GetHTMLCookie(talker, 49, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7567) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7567, 1);
myself.GiveItem1(talker, 7565, 1);
myself.ShowPage(talker, "galladuchi_q0049_0501.htm");
myself.SetMemoState(talker, 49, 5 * 10 + 1);
myself.SetFlagJournal(talker, 49, 5);
myself.ShowQuestMark(talker, 49);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0049_0502.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
i0 = myself.GetHTMLCookie(talker, 49, 7 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7566) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7566, gg.OwnItemCount(talker, 7566));
myself.GiveItem1(talker, 7558, 1);

}
gg.AddLog(2, talker, 49);
myself.RemoveMemo(talker, 49);
myself.SetOneTimeQuestFlag(talker, 49, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0049_0701.htm");

} else {
myself.ShowPage(talker, "galladuchi_q0049_0702.htm");

}

}

}

}
if (ask == 43) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 43) {
i0 = myself.GetHTMLCookie(talker, 43, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 43) == 1) {
if (gg.OwnItemCount(talker, 7551) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7551, 1);
myself.ShowPage(talker, "galladuchi_q0043_0401.htm");
myself.SetMemoState(talker, 43, 4 * 10 + 1);
myself.SetFlagJournal(talker, 43, 5);
myself.ShowQuestMark(talker, 43);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "galladuchi_q0043_0402.htm");

}

}

}

}
if (ask == 173) {
myself.SetCurrentQuestID(173);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 173) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 173) == 1 && gg.GetMemoState(talker, 173) == 2) {
myself.GiveItem1(talker, 9716, 1);
myself.DeleteItem1(talker, 7568, gg.OwnItemCount(talker, 7568));
myself.DeleteItem1(talker, 7570, gg.OwnItemCount(talker, 7570));
myself.RemoveMemo(talker, 173);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "galladuchi_q0173_06.htm");
myself.SetFlagJournal(talker, 173, 1);
gg.AddLog(2, talker, 173);
myself.SetOneTimeQuestFlag(talker, 173, 1);

}

}

}

}
super;
	}


}