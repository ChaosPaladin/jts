package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maestro_leorin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level >= 75) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fate's Whisper");

}
if (gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level < 75) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fate's Whisper");

}
if (gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fate's Whisper (Done)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 1 && gg.OwnItemCount(talker, 4666) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 1 && gg.OwnItemCount(talker, 4666) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4667) < 1 || gg.OwnItemCount(talker, 4668) < 1 || gg.OwnItemCount(talker, 4669) < 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4667) >= 1 && gg.OwnItemCount(talker, 4668) >= 1 && gg.OwnItemCount(talker, 4669) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 4 && gg.OwnItemCount(talker, 4672) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 4 && gg.OwnItemCount(talker, 4672) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 5 && gg.OwnItemCount(talker, 4670) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 5 && gg.OwnItemCount(talker, 4670) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) < 9 && gg.GetMemoState(talker, 234) >= 6) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 9 && gg.OwnItemCount(talker, 4671) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 10 && gg.OwnItemCount(talker, 1460) < 984) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 10 && gg.OwnItemCount(talker, 1460) >= 984) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) == 0 && gg.OwnItemCount(talker, 4717) == 0 && gg.OwnItemCount(talker, 4718) == 0 && gg.OwnItemCount(talker, 4719) == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) == 0 && gg.OwnItemCount(talker, 4829) == 0 && gg.OwnItemCount(talker, 4830) == 0 && gg.OwnItemCount(talker, 287) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) == 0 && gg.OwnItemCount(talker, 4859) == 0 && gg.OwnItemCount(talker, 4860) == 0 && gg.OwnItemCount(talker, 97) == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 175) == 0 && gg.OwnItemCount(talker, 4753) == 0 && gg.OwnItemCount(talker, 4754) == 0 && gg.OwnItemCount(talker, 4755) == 0) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 210) == 0 && gg.OwnItemCount(talker, 4900) == 0 && gg.OwnItemCount(talker, 4901) == 0 && gg.OwnItemCount(talker, 4902) == 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 234) == 0 && gg.OwnItemCount(talker, 4780) == 0 && gg.OwnItemCount(talker, 4781) == 0 && gg.OwnItemCount(talker, 4782) == 0 && gg.OwnItemCount(talker, 6359) == 0) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 268) == 0 && gg.OwnItemCount(talker, 4804) == 0 && gg.OwnItemCount(talker, 4805) == 0 && gg.OwnItemCount(talker, 4806) == 0) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 171) == 0 && gg.OwnItemCount(talker, 4750) == 0 && gg.OwnItemCount(talker, 4751) == 0 && gg.OwnItemCount(talker, 4752) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) == 0) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) == 0 && gg.OwnItemCount(talker, 8105) == 0 && gg.OwnItemCount(talker, 8106) == 0 && gg.OwnItemCount(talker, 8107) == 0) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) == 0 && gg.OwnItemCount(talker, 8117) == 0 && gg.OwnItemCount(talker, 8118) == 0 && gg.OwnItemCount(talker, 8119) == 0) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) == 0 && gg.OwnItemCount(talker, 8132) == 0 && gg.OwnItemCount(talker, 8133) == 0 && gg.OwnItemCount(talker, 8134) == 0) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
_choiceN = _choiceN + 1;
_code = 39;
myself.AddChoice(39, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) == 0 && gg.OwnItemCount(talker, 8144) == 0 && gg.OwnItemCount(talker, 8145) == 0 && gg.OwnItemCount(talker, 8146) == 0) {
_choiceN = _choiceN + 1;
_code = 40;
myself.AddChoice(40, "Fate's Whisper (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level >= 75) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "maestro_leorin_q0234_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 234);
myself.ShowQuestFHTML(talker, fhtml0, 234);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level < 75) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "maestro_leorin_q0234_01a.htm", 234);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 1 && gg.OwnItemCount(talker, 4666) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 1 && gg.OwnItemCount(talker, 4666) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4667) < 1 || gg.OwnItemCount(talker, 4668) < 1 || gg.OwnItemCount(talker, 4669) < 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4667) >= 1 && gg.OwnItemCount(talker, 4668) >= 1 && gg.OwnItemCount(talker, 4669) >= 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_13.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 4 && gg.OwnItemCount(talker, 4672) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_15.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 4 && gg.OwnItemCount(talker, 4672) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_16.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 5 && gg.OwnItemCount(talker, 4670) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_18.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 5 && gg.OwnItemCount(talker, 4670) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_19.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) < 9 && gg.GetMemoState(talker, 234) >= 6) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_21.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 9 && gg.OwnItemCount(talker, 4671) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_22.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 10 && gg.OwnItemCount(talker, 1460) < 984) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_24.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 10 && gg.OwnItemCount(talker, 1460) >= 984) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_25.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_35.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) == 0 && gg.OwnItemCount(talker, 4717) == 0 && gg.OwnItemCount(talker, 4718) == 0 && gg.OwnItemCount(talker, 4719) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_35a.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_36.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) == 0 && gg.OwnItemCount(talker, 4829) == 0 && gg.OwnItemCount(talker, 4830) == 0 && gg.OwnItemCount(talker, 287) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_36a.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_37.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) == 0 && gg.OwnItemCount(talker, 4859) == 0 && gg.OwnItemCount(talker, 4860) == 0 && gg.OwnItemCount(talker, 97) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_37a.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_38.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 175) == 0 && gg.OwnItemCount(talker, 4753) == 0 && gg.OwnItemCount(talker, 4754) == 0 && gg.OwnItemCount(talker, 4755) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_38a.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_39.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 210) == 0 && gg.OwnItemCount(talker, 4900) == 0 && gg.OwnItemCount(talker, 4901) == 0 && gg.OwnItemCount(talker, 4902) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_39a.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_40.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 234) == 0 && gg.OwnItemCount(talker, 4780) == 0 && gg.OwnItemCount(talker, 4781) == 0 && gg.OwnItemCount(talker, 4782) == 0 && gg.OwnItemCount(talker, 6359) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_40a.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_41.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 268) == 0 && gg.OwnItemCount(talker, 4804) == 0 && gg.OwnItemCount(talker, 4805) == 0 && gg.OwnItemCount(talker, 4806) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_41a.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_42.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 171) == 0 && gg.OwnItemCount(talker, 4750) == 0 && gg.OwnItemCount(talker, 4751) == 0 && gg.OwnItemCount(talker, 4752) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_42a.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43a.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43b.htm");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) == 0 && gg.OwnItemCount(talker, 8105) == 0 && gg.OwnItemCount(talker, 8106) == 0 && gg.OwnItemCount(talker, 8107) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43c.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43d.htm");

}
break;

}
case 36: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) == 0 && gg.OwnItemCount(talker, 8117) == 0 && gg.OwnItemCount(talker, 8118) == 0 && gg.OwnItemCount(talker, 8119) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43e.htm");

}
break;

}
case 37: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43f.htm");

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) == 0 && gg.OwnItemCount(talker, 8132) == 0 && gg.OwnItemCount(talker, 8133) == 0 && gg.OwnItemCount(talker, 8134) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43g.htm");

}
break;

}
case 39: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43h.htm");

}
break;

}
case 40: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) == 0 && gg.OwnItemCount(talker, 8144) == 0 && gg.OwnItemCount(talker, 8145) == 0 && gg.OwnItemCount(talker, 8146) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maestro_leorin_q0234_43i.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 234) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level >= 75) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 234, 1);
gg.AddLog(1, talker, 234);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "maestro_leorin_q0234_06.htm", 234);
myself.SetFlagJournal(talker, 234, 1);

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 234) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 234) {
if (reply == 1) {
myself.ShowQuestPage(talker, "maestro_leorin_q0234_02.htm", 234);

}
if (reply == 2) {
myself.ShowQuestPage(talker, "maestro_leorin_q0234_03.htm", 234);

}
if (reply == 3) {
myself.ShowQuestPage(talker, "maestro_leorin_q0234_04.htm", 234);

}
if (reply == 4) {
if (gg.HaveMemo(talker, 234) == 0 && myself.GetOneTimeQuestFlag(talker, 234) == 0 && talker.level >= 75) {
myself.FHTML_SetFileName(fhtml0, "maestro_leorin_q0234_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 234);
myself.ShowQuestFHTML(talker, fhtml0, 234);

}

}
if (reply == 5 && gg.GetMemoState(talker, 234) == 1 && gg.OwnItemCount(talker, 4666) == 1) {
myself.DeleteItem1(talker, 4666, 1);
myself.SetMemoState(talker, 234, 2);
myself.ShowPage(talker, "maestro_leorin_q0234_11.htm");
myself.SetFlagJournal(talker, 234, 2);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 6 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4667) >= 1 && gg.OwnItemCount(talker, 4668) >= 1 && gg.OwnItemCount(talker, 4669) >= 1) {
myself.DeleteItem1(talker, 4667, gg.OwnItemCount(talker, 4667));
myself.DeleteItem1(talker, 4668, gg.OwnItemCount(talker, 4668));
myself.DeleteItem1(talker, 4669, gg.OwnItemCount(talker, 4669));
myself.SetMemoState(talker, 234, 4);
myself.ShowPage(talker, "maestro_leorin_q0234_14.htm");
myself.SetFlagJournal(talker, 234, 3);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 7 && gg.GetMemoState(talker, 234) == 4 && gg.OwnItemCount(talker, 4672) > 0) {
myself.DeleteItem1(talker, 4672, 1);
myself.SetMemoState(talker, 234, 5);
myself.ShowPage(talker, "maestro_leorin_q0234_17.htm");
myself.SetFlagJournal(talker, 234, 4);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 8 && gg.GetMemoState(talker, 234) == 5 && gg.OwnItemCount(talker, 4670) > 0) {
myself.DeleteItem1(talker, 4670, 1);
myself.SetMemoState(talker, 234, 6);
myself.ShowPage(talker, "maestro_leorin_q0234_20.htm");
myself.SetFlagJournal(talker, 234, 5);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 9 && gg.GetMemoState(talker, 234) == 9 && gg.OwnItemCount(talker, 4671) > 0) {
myself.DeleteItem1(talker, 4671, 1);
myself.SetMemoState(talker, 234, 10);
myself.ShowPage(talker, "maestro_leorin_q0234_23.htm");
myself.SetFlagJournal(talker, 234, 11);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 10 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 11);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_26.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 11 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 19);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_26a.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 12 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 12);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_27.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 13 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 13);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_28.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 14 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 14);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_29.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 15 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 15);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_30.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 16 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 16);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_31.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 17 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 17);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_32.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 18 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 18);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_33.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 41 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 41);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_33a.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 42 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 42);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_33b.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 43 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 43);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_33c.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 44 && gg.GetMemoState(talker, 234) == 10) {
if (gg.OwnItemCount(talker, 1460) >= 984) {
myself.DeleteItem1(talker, 1460, 984);
myself.SetMemoState(talker, 234, 44);
myself.SetFlagJournal(talker, 234, 12);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "maestro_leorin_q0234_33d.htm");

} else {
myself.ShowPage(talker, "maestro_leorin_q0234_34.htm");

}

}
if (reply == 21) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 80, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_44.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 22) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 288, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_45.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 23) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 98, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_46.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 24) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 150, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_47.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 25) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 212, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_48.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 26) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 235, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_49.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 27) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 269, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_50.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 28) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2504, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_51.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 29) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 142 * kshanberk, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_52.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 30) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7884, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_53.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 31) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7894, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_54.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (reply == 32) {
if (gg.GetMemoState(talker, 234) == 11 && gg.OwnItemCount(talker, 79) > 0 || gg.OwnItemCount(talker, 4717) > 0 || gg.OwnItemCount(talker, 4718) > 0 || gg.OwnItemCount(talker, 4719) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 79)) {
myself.DeleteItem1(talker, 79, 1);

} else if (gg.OwnItemCount(talker, 4717)) {
myself.DeleteItem1(talker, 4717, 1);

} else if (gg.OwnItemCount(talker, 4718)) {
myself.DeleteItem1(talker, 4718, 1);

} else if (gg.OwnItemCount(talker, 4719)) {
myself.DeleteItem1(talker, 4719, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 12 && gg.OwnItemCount(talker, 4828) || gg.OwnItemCount(talker, 4829) || gg.OwnItemCount(talker, 4830) || gg.OwnItemCount(talker, 287) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 287)) {
myself.DeleteItem1(talker, 287, 1);

} else if (gg.OwnItemCount(talker, 4828)) {
myself.DeleteItem1(talker, 4828, 1);

} else if (gg.OwnItemCount(talker, 4829)) {
myself.DeleteItem1(talker, 4829, 1);

} else if (gg.OwnItemCount(talker, 4830)) {
myself.DeleteItem1(talker, 4830, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 13 && gg.OwnItemCount(talker, 4858) || gg.OwnItemCount(talker, 4859) || gg.OwnItemCount(talker, 4860) || gg.OwnItemCount(talker, 97) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 97)) {
myself.DeleteItem1(talker, 97, 1);

} else if (gg.OwnItemCount(talker, 4858)) {
myself.DeleteItem1(talker, 4858, 1);

} else if (gg.OwnItemCount(talker, 4859)) {
myself.DeleteItem1(talker, 4859, 1);

} else if (gg.OwnItemCount(talker, 4860)) {
myself.DeleteItem1(talker, 4860, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 14 && gg.OwnItemCount(talker, 4753) || gg.OwnItemCount(talker, 4754) || gg.OwnItemCount(talker, 4755) || gg.OwnItemCount(talker, 175) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 175)) {
myself.DeleteItem1(talker, 175, 1);

} else if (gg.OwnItemCount(talker, 4753)) {
myself.DeleteItem1(talker, 4753, 1);

} else if (gg.OwnItemCount(talker, 4754)) {
myself.DeleteItem1(talker, 4754, 1);

} else if (gg.OwnItemCount(talker, 4755)) {
myself.DeleteItem1(talker, 4755, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 15 && gg.OwnItemCount(talker, 4900) || gg.OwnItemCount(talker, 4901) || gg.OwnItemCount(talker, 4902) || gg.OwnItemCount(talker, 210) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 210)) {
myself.DeleteItem1(talker, 210, 1);

} else if (gg.OwnItemCount(talker, 4900)) {
myself.DeleteItem1(talker, 4900, 1);

} else if (gg.OwnItemCount(talker, 4901)) {
myself.DeleteItem1(talker, 4901, 1);

} else if (gg.OwnItemCount(talker, 4902)) {
myself.DeleteItem1(talker, 4902, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 16 && gg.OwnItemCount(talker, 4780) || gg.OwnItemCount(talker, 4781) || gg.OwnItemCount(talker, 4782) || gg.OwnItemCount(talker, 234) > 0 || gg.OwnItemCount(talker, 6359) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 234)) {
myself.DeleteItem1(talker, 234, 1);

} else if (gg.OwnItemCount(talker, 4780)) {
myself.DeleteItem1(talker, 4780, 1);

} else if (gg.OwnItemCount(talker, 4781)) {
myself.DeleteItem1(talker, 4781, 1);

} else if (gg.OwnItemCount(talker, 4782)) {
myself.DeleteItem1(talker, 4782, 1);

} else if (gg.OwnItemCount(talker, 6359)) {
myself.DeleteItem1(talker, 6359, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 17 && gg.OwnItemCount(talker, 4804) > 0 || gg.OwnItemCount(talker, 4805) > 0 || gg.OwnItemCount(talker, 4806) > 0 || gg.OwnItemCount(talker, 268) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 268)) {
myself.DeleteItem1(talker, 268, 1);

} else if (gg.OwnItemCount(talker, 4804)) {
myself.DeleteItem1(talker, 4804, 1);

} else if (gg.OwnItemCount(talker, 4805)) {
myself.DeleteItem1(talker, 4805, 1);

} else if (gg.OwnItemCount(talker, 4806)) {
myself.DeleteItem1(talker, 4806, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 18 && gg.OwnItemCount(talker, 4750) > 0 || gg.OwnItemCount(talker, 4751) > 0 || gg.OwnItemCount(talker, 4752) > 0 || gg.OwnItemCount(talker, 171) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 171)) {
myself.DeleteItem1(talker, 171, 1);

} else if (gg.OwnItemCount(talker, 4750)) {
myself.DeleteItem1(talker, 4750, 1);

} else if (gg.OwnItemCount(talker, 4751)) {
myself.DeleteItem1(talker, 4751, 1);

} else if (gg.OwnItemCount(talker, 4752)) {
myself.DeleteItem1(talker, 4752, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 19 && gg.OwnItemCount(talker, 135 * samurai_longsword) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
myself.DeleteItem1(talker, 135 * samurai_longsword, 1);
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 41 && gg.OwnItemCount(talker, 7883) > 0 || gg.OwnItemCount(talker, 8105) > 0 || gg.OwnItemCount(talker, 8106) > 0 || gg.OwnItemCount(talker, 8107) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7883)) {
myself.DeleteItem1(talker, 7883, 1);

} else if (gg.OwnItemCount(talker, 8105)) {
myself.DeleteItem1(talker, 8105, 1);

} else if (gg.OwnItemCount(talker, 8106)) {
myself.DeleteItem1(talker, 8106, 1);

} else if (gg.OwnItemCount(talker, 8107)) {
myself.DeleteItem1(talker, 8107, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 42 && gg.OwnItemCount(talker, 7889) > 0 || gg.OwnItemCount(talker, 8117) > 0 || gg.OwnItemCount(talker, 8118) > 0 || gg.OwnItemCount(talker, 8119) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7889)) {
myself.DeleteItem1(talker, 7889, 1);

} else if (gg.OwnItemCount(talker, 8117)) {
myself.DeleteItem1(talker, 8117, 1);

} else if (gg.OwnItemCount(talker, 8118)) {
myself.DeleteItem1(talker, 8118, 1);

} else if (gg.OwnItemCount(talker, 8119)) {
myself.DeleteItem1(talker, 8119, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 43 && gg.OwnItemCount(talker, 7901) > 0 || gg.OwnItemCount(talker, 8132) > 0 || gg.OwnItemCount(talker, 8133) > 0 || gg.OwnItemCount(talker, 8134) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7901)) {
myself.DeleteItem1(talker, 7901, 1);

} else if (gg.OwnItemCount(talker, 8132)) {
myself.DeleteItem1(talker, 8132, 1);

} else if (gg.OwnItemCount(talker, 8133)) {
myself.DeleteItem1(talker, 8133, 1);

} else if (gg.OwnItemCount(talker, 8134)) {
myself.DeleteItem1(talker, 8134, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (gg.GetMemoState(talker, 234) == 44 && gg.OwnItemCount(talker, 7893) > 0 || gg.OwnItemCount(talker, 8144) > 0 || gg.OwnItemCount(talker, 8145) > 0 || gg.OwnItemCount(talker, 8146) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7899, 1);
myself.GiveItem1(talker, 5011, 1);
if (gg.OwnItemCount(talker, 7893)) {
myself.DeleteItem1(talker, 7893, 1);

} else if (gg.OwnItemCount(talker, 8144)) {
myself.DeleteItem1(talker, 8144, 1);

} else if (gg.OwnItemCount(talker, 8145)) {
myself.DeleteItem1(talker, 8145, 1);

} else if (gg.OwnItemCount(talker, 8146)) {
myself.DeleteItem1(talker, 8146, 1);

}
myself.RemoveMemo(talker, 234);
myself.SetOneTimeQuestFlag(talker, 234, 1);
gg.AddLog(3, talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "maestro_leorin_q0234_55.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}

}
super;
	}


}