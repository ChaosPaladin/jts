package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_hanellin extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 348) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.OwnItemCount(talker, 4394) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "An Arrogant Search");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.OwnItemCount(talker, 4394) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "An Arrogant Search");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) == 0 && gg.OwnItemCount(talker, 14857) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) > 0 || gg.OwnItemCount(talker, 14857) > 0 || gg.GetMemoState(talker, 348) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "An Arrogant Search (In Progress)");

}
if (gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 1 || gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4396) == 1 || gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 3 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.GetMemoState(talker, 348) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 && gg.GetMemoState(talker, 348) == 3) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1 && gg.GetMemoState(talker, 348) == 3) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 6 || gg.GetMemoState(talker, 348) == 7) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.OwnItemCount(talker, 4397) == 1 && gg.OwnItemCount(talker, 4398) == 1 && gg.OwnItemCount(talker, 4399) == 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4397) == 0 || gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.OwnItemCount(talker, 1831) < 5 || gg.OwnItemCount(talker, 1061) == 0) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 1831) >= 5 && gg.OwnItemCount(talker, 1061) > 0) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 10 && gg.OwnItemCount(talker, 4294) == 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4294) == 1) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4294) == 1) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 12 && gg.OwnItemCount(talker, 4294) == 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 13 && gg.OwnItemCount(talker, 4294) == 1) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 1 && gg.OwnItemCount(talker, 4398) == 1 && gg.OwnItemCount(talker, 4397) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 2 && gg.OwnItemCount(talker, 4397) == 1 && gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 3 && gg.OwnItemCount(talker, 4399) == 1 && gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4397) == 0) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 1 && gg.OwnItemCount(talker, 4398) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 2 && gg.OwnItemCount(talker, 4397) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 3 && gg.OwnItemCount(talker, 4399) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.GetMemoStateEx(talker, 348, 1) != 0 && gg.OwnItemCount(talker, 1831) >= 5 && gg.OwnItemCount(talker, 1061) > 0) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 10 || gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4400) > 1) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 || gg.GetMemoState(talker, 348) == 10 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4397) == 0 && gg.OwnItemCount(talker, 4398) == 0 && gg.OwnItemCount(talker, 4399) == 0 && gg.OwnItemCount(talker, 4400) == 1) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 14) {
_choiceN = _choiceN + 1;
_code = 39;
myself.AddChoice(39, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 15) {
_choiceN = _choiceN + 1;
_code = 40;
myself.AddChoice(40, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 16) {
_choiceN = _choiceN + 1;
_code = 41;
myself.AddChoice(41, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4294) > 0) {
_choiceN = _choiceN + 1;
_code = 42;
myself.AddChoice(42, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4295) >= 10 && gg.OwnItemCount(talker, 4294) == 0) {
_choiceN = _choiceN + 1;
_code = 43;
myself.AddChoice(43, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4295) < 10 && gg.OwnItemCount(talker, 4294) == 0) {
_choiceN = _choiceN + 1;
_code = 44;
myself.AddChoice(44, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 19) {
_choiceN = _choiceN + 1;
_code = 45;
myself.AddChoice(45, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 10 < 7) {
_choiceN = _choiceN + 1;
_code = 46;
myself.AddChoice(46, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 10 == 7) {
_choiceN = _choiceN + 1;
_code = 47;
myself.AddChoice(47, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.OwnItemCount(talker, 4394) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1000) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4396, 1);
myself.DeleteItem1(talker, 4395, 1);
myself.DeleteItem1(talker, 4394, 1);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.OwnItemCount(talker, 4394) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "magister_hanellin_q0348_02.htm", 348);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) == 0 && gg.OwnItemCount(talker, 14857) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) > 0 || gg.OwnItemCount(talker, 14857) > 0 || gg.GetMemoState(talker, 348) == 2) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 14857) > 0) {
myself.DeleteItem1(talker, 14857, 1);

}
if (gg.OwnItemCount(talker, 4287) > 0) {
myself.DeleteItem1(talker, 4287, 1);

}
myself.SetMemoState(talker, 348, 2);
myself.ShowPage(talker, "magister_hanellin_q0348_07.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 1 || gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4396) == 1 || gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 3 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 && gg.GetMemoState(talker, 348) == 3) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4394, 1);
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 1);
myself.ShowPage(talker, "magister_hanellin_q0348_12.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 && gg.GetMemoState(talker, 348) == 3) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4395, 1);
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 2);
myself.ShowPage(talker, "magister_hanellin_q0348_12.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1 && gg.GetMemoState(talker, 348) == 3) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4396, 1);
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 3);
myself.ShowPage(talker, "magister_hanellin_q0348_12.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "magister_hanellin_q0348_13.htm", 348);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0 || gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "magister_hanellin_q0348_14.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 348);
myself.ShowQuestFHTML(talker, fhtml0, 348);

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 348, 5);
myself.ShowPage(talker, "magister_hanellin_q0348_17.htm");
myself.GiveItem1(talker, 4288, 1);
myself.GiveItem1(talker, 4289, 1);
myself.GiveItem1(talker, 4290, 1);
myself.SetFlagJournal(talker, 348, 5);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 348, 5);
myself.ShowPage(talker, "magister_hanellin_q0348_18.htm");
myself.GiveItem1(talker, 4288, 1);
myself.SetFlagJournal(talker, 348, 6);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 2) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 348, 5);
myself.ShowPage(talker, "magister_hanellin_q0348_19.htm");
myself.GiveItem1(talker, 4289, 1);
myself.SetFlagJournal(talker, 348, 7);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 3) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 348, 5);
myself.ShowPage(talker, "magister_hanellin_q0348_20.htm");
myself.GiveItem1(talker, 4290, 1);
myself.SetFlagJournal(talker, 348, 8);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_24.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_25.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 2) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_26.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 5 && gg.GetMemoStateEx(talker, 348, 1) == 3) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_27.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 6 || gg.GetMemoState(talker, 348) == 7) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_28.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.OwnItemCount(talker, 4397) == 1 && gg.OwnItemCount(talker, 4398) == 1 && gg.OwnItemCount(talker, 4399) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4397, 1);
myself.DeleteItem1(talker, 4398, 1);
myself.DeleteItem1(talker, 4399, 1);
myself.SetMemoState(talker, 348, 9);
myself.ShowPage(talker, "magister_hanellin_q0348_29.htm");
myself.SetFlagJournal(talker, 348, 22);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4397) == 0 || gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_29t.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.OwnItemCount(talker, 1831) < 5 || gg.OwnItemCount(talker, 1061) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_30.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 1831) >= 5 && gg.OwnItemCount(talker, 1061) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_hanellin_q0348_31.htm");
myself.GiveItem1(talker, 4294, 1);
myself.SetMemoState(talker, 348, 10);
myself.DeleteItem1(talker, 1831, 5);
myself.DeleteItem1(talker, 1061, 1);

}

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 10 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_32.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.GetMemoStateEx(talker, 348, 1);
if (i0 == 1) {
myself.GiveItem1(talker, 57, 43000);
gg.AddLog(2, talker, 348);

} else if (i0 == 2) {
myself.GiveItem1(talker, 57, 4000);
gg.AddLog(2, talker, 348);

} else if (i0 == 3) {
myself.GiveItem1(talker, 57, 13000);
gg.AddLog(2, talker, 348);

}
myself.SetMemoStateEx(talker, 348, 0, 12);
myself.SetMemoStateEx(talker, 348, 1, 100);
myself.SetFlagJournal(talker, 348, 24);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_hanellin_q0348_34.htm");

}

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_35.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 12 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_38.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 13 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_39.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 1 && gg.OwnItemCount(talker, 4398) == 1 && gg.OwnItemCount(talker, 4397) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_40.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 2 && gg.OwnItemCount(talker, 4397) == 1 && gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4399) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_41.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 3 && gg.OwnItemCount(talker, 4399) == 1 && gg.OwnItemCount(talker, 4398) == 0 || gg.OwnItemCount(talker, 4397) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_42.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 1 && gg.OwnItemCount(talker, 4398) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_43.htm");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 2 && gg.OwnItemCount(talker, 4397) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_44.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) == 3 && gg.OwnItemCount(talker, 4399) == 0 && gg.OwnItemCount(talker, 4400) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_45.htm");

}
break;

}
case 36: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 9 && gg.GetMemoStateEx(talker, 348, 1) != 0 && gg.OwnItemCount(talker, 1831) >= 5 && gg.OwnItemCount(talker, 1061) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4400, 3);
myself.DeleteItem1(talker, 1831, 5);
myself.DeleteItem1(talker, 1061, 1);
myself.SetMemoState(talker, 348, 10);
myself.SetFlagJournal(talker, 348, 23);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_hanellin_q0348_46.htm");

}

}
break;

}
case 37: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 10 || gg.GetMemoState(talker, 348) == 8 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4400) > 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_47.htm");

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 8 || gg.GetMemoState(talker, 348) == 10 && gg.GetMemoStateEx(talker, 348, 1) > 0 && gg.OwnItemCount(talker, 4397) == 0 && gg.OwnItemCount(talker, 4398) == 0 && gg.OwnItemCount(talker, 4399) == 0 && gg.OwnItemCount(talker, 4400) == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4294, 1);
myself.DeleteItem1(talker, 4400, 1);
myself.SetMemoState(talker, 348, 10);
myself.ShowPage(talker, "magister_hanellin_q0348_48.htm");

}

}
break;

}
case 39: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 14) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.occupation == 8 || talker.occupation == 23 || talker.occupation == 36 || talker.occupation == 93 || talker.occupation == 101 || talker.occupation == 108 || talker.occupation == 128 || talker.occupation == 129 || talker.occupation == 132 || talker.occupation == 133 || talker.occupation == 135 || talker.occupation == 136) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4109, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4119, 1);
myself.GiveItem1(talker, 1879, 2);

}

} else if (talker.occupation == 48 || talker.occupation == 114) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4111, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4120, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 5 || talker.occupation == 6 || talker.occupation == 17 || talker.occupation == 20 || talker.occupation == 21 || talker.occupation == 33 || talker.occupation == 34 || talker.occupation == 43 || talker.occupation == 90 || talker.occupation == 91 || talker.occupation == 98 || talker.occupation == 99 || talker.occupation == 100 || talker.occupation == 106 || talker.occupation == 107 || talker.occupation == 112) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4107, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4114, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 9 || talker.occupation == 24 || talker.occupation == 37 || talker.occupation == 92 || talker.occupation == 102 || talker.occupation == 109 || talker.occupation == 130 || talker.occupation == 134) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4112, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4121, 1);
myself.GiveItem1(talker, 1881, 9);

}

} else if (talker.occupation == 2 || talker.occupation == 16 || talker.occupation == 30 || talker.occupation == 88 || talker.occupation == 97 || talker.occupation == 105) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4105, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4117, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 3 || talker.occupation == 55 || talker.occupation == 57 || talker.occupation == 89 || talker.occupation == 117 || talker.occupation == 118) {
if (talker.level < 63) {
myself.GiveItem1(talker, 4113, 1);
myself.GiveItem1(talker, 4042, 1);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 63) {
myself.GiveItem1(talker, 4115, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 12 || talker.occupation == 27 || talker.occupation == 51 || talker.occupation == 94 || talker.occupation == 103 || talker.occupation == 115) {
if (talker.level < 63) {
myself.GiveItem1(talker, 4106, 1);
myself.GiveItem1(talker, 1874, 4);
myself.GiveItem1(talker, 1881, 1);

} else if (talker.level >= 63) {
myself.GiveItem1(talker, 4118, 1);
myself.GiveItem1(talker, 1872, 5);

}

} else if (talker.occupation == 13 || talker.occupation == 40 || talker.occupation == 95 || talker.occupation == 110) {
myself.GiveItem1(talker, 4110, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1872, 2);

} else if (talker.occupation == 13 || talker.occupation == 40 || talker.occupation == 95 || talker.occupation == 110) {
myself.GiveItem1(talker, 4110, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1872, 2);

} else if (talker.occupation == 46 || talker.occupation == 113 || talker.occupation == 127 || talker.occupation == 131) {
myself.GiveItem1(talker, 4104, 1);
myself.GiveItem1(talker, 1887, 2);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.occupation == 28 || talker.occupation == 41 || talker.occupation == 104 || talker.occupation == 111) {
myself.GiveItem1(talker, 4114, 1);
myself.GiveItem1(talker, 4042, 1);

} else if (talker.occupation == 52 || talker.occupation == 116) {
myself.GiveItem1(talker, 4108, 1);
myself.GiveItem1(talker, 1874, 1);
myself.GiveItem1(talker, 1887, 1);

} else if (talker.occupation == 14 || talker.occupation == 96) {
myself.GiveItem1(talker, 4117, 1);
myself.GiveItem1(talker, 4042, 1);

} else {
myself.GiveItem1(talker, 57, 49000);

}
myself.SetMemoState(talker, 348, 15);
myself.ShowPage(talker, "magister_hanellin_q0348_49.htm");

}

}
break;

}
case 40: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 15) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_50.htm");

}
break;

}
case 41: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 16) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4295) > 0) {
myself.GiveItem1(talker, 4294, 9);

} else {
myself.GiveItem1(talker, 4294, 10);

}
myself.SetMemoStateEx(talker, 348, 0, 17);
myself.SetMemoStateEx(talker, 348, 1, 0);
myself.SetFlagJournal(talker, 348, 26);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_hanellin_q0348_51.htm");

}
break;

}
case 42: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4294) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_52.htm");

}
break;

}
case 43: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4295) >= 10 && gg.OwnItemCount(talker, 4294) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_53.htm");

}
break;

}
case 44: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17 && gg.OwnItemCount(talker, 4295) < 10 && gg.OwnItemCount(talker, 4294) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 4295) * 1000 + 4000);
myself.DeleteItem1(talker, 4295, gg.OwnItemCount(talker, 4295));
myself.ShowPage(talker, "magister_hanellin_q0348_54.htm");
myself.RemoveMemo(talker, 348);
gg.AddLog(3, talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
break;

}
case 45: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 19) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_55.htm");

}
break;

}
case 46: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 10 < 7) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i1 = 0;
i2 = 0;
i0 = gg.GetMemoStateEx(talker, 348, 1) % 10;
if (i0 >= 4) {
i1 = i1 + 6;
i0 = i0 - 4;
i2 = i2 + 1;

}
if (i0 >= 2) {
i0 = i0 - 2;
i1 = i1 + 1;
i2 = i2 + 1;

}
if (i0 >= 1) {
i1 = i1 + 3;
i2 = i2 + 1;
i0 = i0 - 1;

}
if (i0 == 0 && gg.OwnItemCount(talker, 4295) + i1 >= 10) {
myself.ShowPage(talker, "magister_hanellin_q0348_59.htm");

} else if (i0 == 0 && gg.OwnItemCount(talker, 4295) + i1 < 10) {
myself.ShowPage(talker, "magister_hanellin_q0348_61.htm");
if (i2 == 2) {
myself.GiveItem1(talker, 57, 24000);

} else if (i2 == 1) {
myself.GiveItem1(talker, 57, 12000);

}
myself.RemoveMemo(talker, 348);
gg.AddLog(3, talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
break;

}
case 47: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 10 == 7) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_hanellin_q0348_60.htm");
myself.SetFlagJournal(talker, 348, 28);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.occupation == 8 || talker.occupation == 23 || talker.occupation == 36 || talker.occupation == 93 || talker.occupation == 101 || talker.occupation == 108 || talker.occupation == 128 || talker.occupation == 129 || talker.occupation == 132 || talker.occupation == 133 || talker.occupation == 135 || talker.occupation == 136) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4109, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4119, 1);
myself.GiveItem1(talker, 1879, 2);

}

} else if (talker.occupation == 48 || talker.occupation == 114) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4111, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4120, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 5 || talker.occupation == 6 || talker.occupation == 17 || talker.occupation == 20 || talker.occupation == 21 || talker.occupation == 33 || talker.occupation == 34 || talker.occupation == 43 || talker.occupation == 90 || talker.occupation == 91 || talker.occupation == 98 || talker.occupation == 99 || talker.occupation == 100 || talker.occupation == 106 || talker.occupation == 107 || talker.occupation == 112) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4107, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4114, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 9 || talker.occupation == 24 || talker.occupation == 37 || talker.occupation == 92 || talker.occupation == 102 || talker.occupation == 109 || talker.occupation == 130 || talker.occupation == 134) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4112, 1);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4121, 1);
myself.GiveItem1(talker, 1881, 9);

}

} else if (talker.occupation == 2 || talker.occupation == 16 || talker.occupation == 30 || talker.occupation == 88 || talker.occupation == 97 || talker.occupation == 105) {
if (talker.level < 69) {
myself.GiveItem1(talker, 4105, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 69) {
myself.GiveItem1(talker, 4117, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 3 || talker.occupation == 55 || talker.occupation == 57 || talker.occupation == 89 || talker.occupation == 117 || talker.occupation == 118) {
if (talker.level < 63) {
myself.GiveItem1(talker, 4113, 1);
myself.GiveItem1(talker, 4042, 1);
myself.GiveItem1(talker, 1879, 1);

} else if (talker.level >= 63) {
myself.GiveItem1(talker, 4115, 1);
myself.GiveItem1(talker, 1874, 2);

}

} else if (talker.occupation == 12 || talker.occupation == 27 || talker.occupation == 51 || talker.occupation == 94 || talker.occupation == 103 || talker.occupation == 115) {
if (talker.level < 63) {
myself.GiveItem1(talker, 4106, 1);
myself.GiveItem1(talker, 1874, 4);
myself.GiveItem1(talker, 1881, 1);

} else if (talker.level >= 63) {
myself.GiveItem1(talker, 4118, 1);
myself.GiveItem1(talker, 1872, 5);

}

} else if (talker.occupation == 13 || talker.occupation == 40 || talker.occupation == 95 || talker.occupation == 110) {
myself.GiveItem1(talker, 4110, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1872, 2);

} else if (talker.occupation == 13 || talker.occupation == 40 || talker.occupation == 95 || talker.occupation == 110) {
myself.GiveItem1(talker, 4110, 1);
myself.GiveItem1(talker, 1888, 2);
myself.GiveItem1(talker, 1872, 2);

} else if (talker.occupation == 46 || talker.occupation == 113 || talker.occupation == 127 || talker.occupation == 131) {
myself.GiveItem1(talker, 4104, 1);
myself.GiveItem1(talker, 1887, 2);
myself.GiveItem1(talker, 1888, 2);

} else if (talker.occupation == 28 || talker.occupation == 41 || talker.occupation == 104 || talker.occupation == 111) {
myself.GiveItem1(talker, 4114, 1);
myself.GiveItem1(talker, 4042, 1);

} else if (talker.occupation == 52 || talker.occupation == 116) {
myself.GiveItem1(talker, 4108, 1);
myself.GiveItem1(talker, 1874, 1);
myself.GiveItem1(talker, 1887, 1);

} else if (talker.occupation == 14 || talker.occupation == 96) {
myself.GiveItem1(talker, 4117, 1);
myself.GiveItem1(talker, 4042, 1);

} else {
myself.GiveItem1(talker, 57, 49000);

}

}
myself.SetMemoState(talker, 348, 19);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 348) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 4394) == 1 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 0) {
myself.DeleteItem1(talker, 4394, 1);
if (gg.OwnItemCount(talker, 4395) > 0) {
myself.DeleteItem1(talker, 4395, 1);

}
if (gg.OwnItemCount(talker, 4396) > 0) {
myself.DeleteItem1(talker, 4396, 1);

}
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 1);
gg.AddLog(1, talker, 348);
myself.ShowQuestPage(talker, "magister_hanellin_q0348_15.htm", 348);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 348, 1);

} else if (gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 1 && gg.OwnItemCount(talker, 4396) == 0) {
myself.DeleteItem1(talker, 4395, 1);
if (gg.OwnItemCount(talker, 4394) > 0) {
myself.DeleteItem1(talker, 4394, 1);

}
if (gg.OwnItemCount(talker, 4396) > 0) {
myself.DeleteItem1(talker, 4396, 1);

}
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 2);
gg.AddLog(1, talker, 348);
myself.ShowQuestPage(talker, "magister_hanellin_q0348_15.htm", 348);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 348, 1);

} else if (gg.OwnItemCount(talker, 4394) == 0 && gg.OwnItemCount(talker, 4395) == 0 && gg.OwnItemCount(talker, 4396) == 1) {
myself.DeleteItem1(talker, 4396, 1);
if (gg.OwnItemCount(talker, 4394) > 0) {
myself.DeleteItem1(talker, 4394, 1);

}
if (gg.OwnItemCount(talker, 4395) > 0) {
myself.DeleteItem1(talker, 4395, 1);

}
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 3);
gg.AddLog(1, talker, 348);
myself.ShowQuestPage(talker, "magister_hanellin_q0348_15.htm", 348);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 348, 1);

} else {
gg.AddLog(1, talker, 348);
myself.SetMemoState(talker, 348, 1);
myself.ShowQuestPage(talker, "magister_hanellin_q0348_05.htm", 348);
myself.SetFlagJournal(talker, 348, 2);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 348) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 348) {
if (reply == 1) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) > 0 || gg.OwnItemCount(talker, 14857) > 0 || gg.GetMemoState(talker, 348) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4394, 1);
myself.GiveItem1(talker, 4395, 1);
myself.GiveItem1(talker, 4396, 1);
myself.SetMemoState(talker, 348, 3);
myself.SetFlagJournal(talker, 348, 3);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_08.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 1 && gg.OwnItemCount(talker, 4287) > 0 || gg.OwnItemCount(talker, 14857) > 0 || gg.GetMemoState(talker, 348) == 2) {
myself.SetMemoStateEx(talker, 348, 0, 4);
myself.SetMemoStateEx(talker, 348, 1, 0);
myself.SetFlagJournal(talker, 348, 4);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_09.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4 && gg.GetMemoStateEx(talker, 348, 1) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4288, 1);
myself.GiveItem1(talker, 4289, 1);
myself.GiveItem1(talker, 4290, 1);
myself.SetMemoState(talker, 348, 5);
myself.SetFlagJournal(talker, 348, 5);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_17.htm");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 4) {
if (gg.GetMemoStateEx(talker, 348, 1) == 2 && gg.OwnItemCount(talker, 4289) == 0) {
myself.GiveItem1(talker, 4289, 1);
myself.SetMemoState(talker, 348, 5);
myself.SetFlagJournal(talker, 348, 7);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_19.htm");

} else if (gg.GetMemoStateEx(talker, 348, 1) == 1 && gg.OwnItemCount(talker, 4288) == 0) {
myself.GiveItem1(talker, 4288, 1);
myself.SetMemoState(talker, 348, 5);
myself.SetFlagJournal(talker, 348, 6);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_18.htm");

} else if (gg.GetMemoStateEx(talker, 348, 1) == 3 && gg.OwnItemCount(talker, 4290) == 0) {
myself.GiveItem1(talker, 4290, 1);
myself.SetMemoState(talker, 348, 5);
myself.SetFlagJournal(talker, 348, 8);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_20.htm");

}

}

}
if (reply == 5) {
myself.ShowPage(talker, "magister_hanellin_q0348_21.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "magister_hanellin_q0348_22.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "magister_hanellin_q0348_23.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "magister_hanellin_q0348_32.htm");

}
if (reply == 9) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 10 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetMemoState(talker, 348, 11);
myself.ShowPage(talker, "magister_hanellin_q0348_33.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.OwnItemCount(talker, 4294) == 1 && gg.GetMemoStateEx(talker, 348, 1) > 0 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.GetMemoStateEx(talker, 348, 1);
if (i0 == 1) {
myself.GiveItem1(talker, 57, 43000);
gg.AddLog(2, talker, 348);

} else if (i0 == 2) {
myself.GiveItem1(talker, 57, 4000);
gg.AddLog(2, talker, 348);

} else if (i0 == 3) {
myself.GiveItem1(talker, 57, 13000);
gg.AddLog(2, talker, 348);

}
myself.SetMemoStateEx(talker, 348, 0, 12);
myself.SetMemoStateEx(talker, 348, 1, 100);
myself.SetFlagJournal(talker, 348, 24);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_34.htm");

} else {
myself.ShowPage(talker, "magister_hanellin_q0348_35.htm");

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4294) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 49000);
gg.AddLog(2, talker, 348);
myself.SetMemoStateEx(talker, 348, 0, 12);
myself.SetMemoStateEx(talker, 348, 1, 20000);
myself.SetFlagJournal(talker, 348, 24);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_36.htm");

}

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 11 && gg.GetMemoStateEx(talker, 348, 1) == 0 && gg.OwnItemCount(talker, 4294) == 1) {
myself.SetMemoStateEx(talker, 348, 0, 13);
myself.SetMemoStateEx(talker, 348, 1, 20000);
myself.SetFlagJournal(talker, 348, 25);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_37.htm");

}

}
if (reply == 13) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 15) {
myself.SetMemoState(talker, 348, 16);
myself.ShowPage(talker, "magister_hanellin_q0348_50.htm");

}

}
if (reply == 14) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 15 || gg.GetMemoState(talker, 348) == 16) {
if (gg.OwnItemCount(talker, 4295) > 0) {
myself.GiveItem1(talker, 4294, 9);

} else {
myself.GiveItem1(talker, 4294, 10);

}
myself.SetMemoStateEx(talker, 348, 0, 17);
myself.SetMemoStateEx(talker, 348, 1, 0);
myself.SetFlagJournal(talker, 348, 26);
myself.ShowQuestMark(talker, 348);
myself.ShowPage(talker, "magister_hanellin_q0348_51.htm");

}

}
if (reply == 15) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 19) {
myself.GiveItem1(talker, 4294, 10);
myself.SetMemoStateEx(talker, 348, 0, 17);
myself.SetMemoStateEx(talker, 348, 1, 0);
myself.ShowPage(talker, "magister_hanellin_q0348_56.htm");
myself.SetFlagJournal(talker, 348, 29);
myself.ShowQuestMark(talker, 348);

}

}
if (reply == 16) {
myself.ShowPage(talker, "magister_hanellin_q0348_57.htm");
myself.RemoveMemo(talker, 348);
gg.AddLog(3, talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (reply == 17 && gg.OwnItemCount(talker, 4295) >= 10 && gg.OwnItemCount(talker, 4294) == 0) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) == 17) {
myself.ShowPage(talker, "magister_hanellin_q0348_58.htm");
myself.SetMemoStateEx(talker, 348, 0, 18);
myself.SetMemoStateEx(talker, 348, 1, 0);
myself.SetFlagJournal(talker, 348, 27);
myself.ShowQuestMark(talker, 348);

}

}
if (reply == 18) {
myself.ShowQuestPage(talker, "magister_hanellin_q0348_03.htm", 348);

}
if (reply == 19) {
myself.FHTML_SetFileName(fhtml0, "magister_hanellin_q0348_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 348);
myself.ShowQuestFHTML(talker, fhtml0, 348);

}

}
super;
	}


}