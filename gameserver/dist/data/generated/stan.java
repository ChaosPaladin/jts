package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class stan extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3813) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 252) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "It Smells Delicious!");

}
if (gg.HaveMemo(talker, 252) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "It Smells Delicious!");

}
if (gg.HaveMemo(talker, 252) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "It Smells Delicious! (Done)");

}
if (gg.HaveMemo(talker, 252) == 1 && gg.GetMemoState(talker, 252) == 1 && gg.OwnItemCount(talker, 15500) < 10 || gg.OwnItemCount(talker, 15501) < 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "It Smells Delicious! (In progress)");

}
if (gg.HaveMemo(talker, 252) == 1 && gg.GetMemoState(talker, 252) == 1 && gg.OwnItemCount(talker, 15500) >= 10 && gg.OwnItemCount(talker, 15501) >= 5) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "It Smells Delicious! (In progress)");

}
if (gg.HaveMemo(talker, 289) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && talker.level >= 82) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "No More Soup For You");

}
if (gg.HaveMemo(talker, 289) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 0 || talker.level < 82) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "No More Soup For You");

}
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) + gg.OwnItemCount(talker, 15713) * 2 < 100) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "No More Soup For You (In progress)");

}
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) + gg.OwnItemCount(talker, 15713) * 2 >= 100) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "No More Soup For You (In progress)");

}
if (gg.HaveMemo(talker, 461) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && gg.GetDailyQuestFlag(talker, 461) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Rumble in the Base");

}
if (gg.HaveMemo(talker, 461) == 0 && talker.level < 82 || myself.GetOneTimeQuestFlag(talker, 252) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Rumble in the Base");

}
if (gg.HaveMemo(talker, 461) == 0 && gg.GetDailyQuestFlag(talker, 461) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Rumble in the Base (Done)");

}
if (gg.HaveMemo(talker, 461) == 1 && gg.GetMemoState(talker, 461) == 1 && gg.OwnItemCount(talker, 16382) < 10 || gg.OwnItemCount(talker, 15503) < 5) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Rumble in the Base (In progress)");

}
if (gg.HaveMemo(talker, 461) == 1 && gg.GetMemoState(talker, 461) == 1 && gg.OwnItemCount(talker, 16382) >= 10 && gg.OwnItemCount(talker, 15503) >= 5) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Rumble in the Base (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3813) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
talker.weight_point = 0;
talker.param1 = 0;
talker.param2 = 0;
talker.param3 = 0;
talker.flag = 0;
myself.ShowPage(talker, "stan_q0336_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0336_54.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 4) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0192_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 4) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0192_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 252) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "stan_q0252_01.htm", 252);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 252) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "stan_q0252_02.htm", 252);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 252) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 1) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0252_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 252) == 1 && gg.GetMemoState(talker, 252) == 1 && gg.OwnItemCount(talker, 15500) < 10 || gg.OwnItemCount(talker, 15501) < 5) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0252_06.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 252) == 1 && gg.GetMemoState(talker, 252) == 1 && gg.OwnItemCount(talker, 15500) >= 10 && gg.OwnItemCount(talker, 15501) >= 5) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0252_07.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 289) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && talker.level >= 82) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "stan_q0289_01.htm", 289);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 289) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 0 || talker.level < 82) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "stan_q0289_02.htm", 289);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) + gg.OwnItemCount(talker, 15713) * 2 < 100) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0289_05.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) + gg.OwnItemCount(talker, 15713) * 2 >= 100) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 15713) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time >= 2) {
i9 = gg.OwnItemCount(talker, 15713);
i0 = i9 / 2;
i1 = i0 * 2;
if (i1 < i9) {
myself.DeleteItem1(talker, 15713, i1);

} else {
myself.DeleteItem1(talker, 15713, gg.OwnItemCount(talker, 15713));

}
myself.GiveItem1(talker, 15712, i0);

}

}
myself.ShowPage(talker, "stan_q0289_07.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 461) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && gg.GetDailyQuestFlag(talker, 461) == 1) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "stan_q0461_01.htm", 461);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 461) == 0 && talker.level < 82 || myself.GetOneTimeQuestFlag(talker, 252) == 0) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "stan_q0461_02.htm", 461);

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 461) == 0 && gg.GetDailyQuestFlag(talker, 461) == 0) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "stan_q0461_03.htm", 461);

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 461) == 1 && gg.GetMemoState(talker, 461) == 1 && gg.OwnItemCount(talker, 16382) < 10 || gg.OwnItemCount(talker, 15503) < 5) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "stan_q0461_06.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 461) == 1 && gg.GetMemoState(talker, 461) == 1 && gg.OwnItemCount(talker, 16382) >= 10 && gg.OwnItemCount(talker, 15503) >= 5) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 16382, gg.OwnItemCount(talker, 16382));
myself.DeleteItem1(talker, 15503, gg.OwnItemCount(talker, 15503));
myself.IncrementParam(talker, 0, 224784);
myself.IncrementParam(talker, 1, 342528);
myself.RemoveMemo(talker, 461);
gg.SetDailyQuestFlag(talker, 461);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 461);
gg.AddLog(3, talker, 461);
myself.ShowPage(talker, "stan_q0461_07.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 252) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 252) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 252);
myself.SetMemoState(talker, 252, 1);
myself.ShowQuestPage(talker, "stan_q0252_05.htm", 252);
myself.SetFlagJournal(talker, 252, 1);
myself.ShowQuestMark(talker, 252);

}

}
return;

}
if (quest_id == 289) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 15507, 500);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 289);
myself.SetMemoState(talker, 289, 1);
myself.ShowQuestPage(talker, "stan_q0289_04.htm", 289);
myself.SetFlagJournal(talker, 289, 1);
myself.ShowQuestMark(talker, 289);

}
return;

}
if (quest_id == 461) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 461) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && gg.GetDailyQuestFlag(talker, 461) == 1) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 461);
myself.SetMemoState(talker, 461, 1);
myself.ShowQuestPage(talker, "stan_q0461_05.htm", 461);
myself.SetFlagJournal(talker, 461, 1);
myself.ShowQuestMark(talker, 461);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "stan_q0336_02.htm");
talker.param2 = 11;

} else if (reply == 2) {
myself.ShowPage(talker, "stan_q0336_03.htm");
talker.param2 = 21;

} else if (reply == 3) {
myself.ShowPage(talker, "stan_q0336_04.htm");
talker.param2 = 31;

} else if (reply == 4) {
myself.ShowPage(talker, "stan_q0336_05.htm");
talker.param2 = 42;

} else if (reply == 5) {
myself.ShowPage(talker, "stan_q0336_06.htm");

} else if (reply == 6) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 3 && gg.OwnItemCount(talker, 3494) >= 3) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 3);
myself.DeleteItem1(talker, 3494, 3);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 3 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 3 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3483, 3 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 7) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 7 && gg.OwnItemCount(talker, 3494) >= 7) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 7);
myself.DeleteItem1(talker, 3494, 7);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 7 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 7 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3483, 7 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 8) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 9 && gg.OwnItemCount(talker, 3494) >= 9) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 9);
myself.DeleteItem1(talker, 3494, 9);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 9 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 9 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3483, 9 * 1);
myself.ShowPage(talker, "stan_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 9) {
myself.ShowPage(talker, "stan_q0336_53.htm");

} else if (reply == 10) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 2 && gg.OwnItemCount(talker, 3494) >= 5 * 2) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 2);
myself.DeleteItem1(talker, 3494, 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3497, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 1 && gg.OwnItemCount(talker, 3494) >= 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 1);
myself.DeleteItem1(talker, 3494, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 1 && gg.OwnItemCount(talker, 3475) >= 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 1);
myself.DeleteItem1(talker, 3475, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3474, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 5 * 1 && gg.OwnItemCount(talker, 3485) >= 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3483, 5 * 1);
myself.DeleteItem1(talker, 3485, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3484, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 11) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 5 * 2 && gg.OwnItemCount(talker, 3494) >= 5 * 5 * 2) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 5 * 2);
myself.DeleteItem1(talker, 3494, 5 * 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3497, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3494) >= 5 * 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 5 * 1);
myself.DeleteItem1(talker, 3494, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3475) >= 5 * 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 5 * 1);
myself.DeleteItem1(talker, 3475, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3474, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3485) >= 5 * 5 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3483, 5 * 5 * 1);
myself.DeleteItem1(talker, 3485, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3484, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 12) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 10 * 2 && gg.OwnItemCount(talker, 3494) >= 5 * 10 * 2) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 10 * 2);
myself.DeleteItem1(talker, 3494, 5 * 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3497, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3491) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3494) >= 5 * 10 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3491, 5 * 10 * 1);
myself.DeleteItem1(talker, 3494, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3475) >= 5 * 10 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 10 * 1);
myself.DeleteItem1(talker, 3475, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3474, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3483) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3485) >= 5 * 10 * 1) {
myself.ShowPage(talker, "stan_q0336_07.htm");
myself.DeleteItem1(talker, 3483, 5 * 10 * 1);
myself.DeleteItem1(talker, 3485, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3484, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "stan_q0336_10.htm");

}

}

} else if (reply == 13 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "stan_q0336_14.htm");
talker.flag = talker.flag + 4 * 4 * 1;

} else if (reply == 14 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "stan_q0336_15.htm");
talker.flag = talker.flag + 4 * 4 * 2;

} else if (reply == 15 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "stan_q0336_16.htm");
talker.flag = talker.flag + 4 * 4 * 3;

} else if (reply == 16) {
myself.ShowPage(talker, "stan_q0336_17.htm");
talker.flag = talker.flag + 4 * 1 * 1;

} else if (reply == 17) {
myself.ShowPage(talker, "stan_q0336_18.htm");
talker.flag = talker.flag + 4 * 1 * 2;

} else if (reply == 18) {
myself.ShowPage(talker, "stan_q0336_19.htm");
talker.flag = talker.flag + 4 * 1 * 3;

} else if (reply == 19) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 1;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "stan_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3497, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3474, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3484, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "stan_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "stan_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "stan_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "stan_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "stan_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "stan_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "stan_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "stan_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "stan_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "stan_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "stan_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "stan_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "stan_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "stan_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "stan_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "stan_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "stan_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "stan_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "stan_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "stan_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "stan_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "stan_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "stan_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "stan_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "stan_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "stan_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "stan_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "stan_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "stan_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "stan_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 20) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 2;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "stan_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3497, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3474, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3484, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "stan_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "stan_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "stan_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "stan_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "stan_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "stan_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "stan_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "stan_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "stan_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "stan_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "stan_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "stan_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "stan_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "stan_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "stan_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "stan_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "stan_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "stan_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "stan_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "stan_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "stan_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "stan_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "stan_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "stan_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "stan_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "stan_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "stan_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "stan_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "stan_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "stan_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 21) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 3;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "stan_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3497, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3474, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3484, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "stan_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "stan_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "stan_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "stan_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "stan_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "stan_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "stan_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "stan_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "stan_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "stan_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "stan_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "stan_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "stan_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "stan_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "stan_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "stan_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "stan_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "stan_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "stan_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "stan_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "stan_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "stan_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "stan_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "stan_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "stan_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "stan_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "stan_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "stan_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "stan_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "stan_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 22) {
myself.ShowPage(talker, "stan_q0336_01.htm");

}

}
if (ask == 192) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 192) {
if (reply == 1) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 4) {
myself.ShowPage(talker, "stan_q0192_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 4) {
myself.ShowPage(talker, "stan_q0192_03.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 4) {
myself.SetMemoState(talker, 192, 5);
myself.ShowPage(talker, "stan_q0192_04.htm");
myself.SetFlagJournal(talker, 192, 5);
myself.ShowQuestMark(talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 252) {
myself.SetCurrentQuestID(252);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 252) {
if (reply == 1) {
if (gg.HaveMemo(talker, 252) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 0) {
myself.FHTML_SetFileName(fhtml0, "stan_q0252_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 252);
myself.ShowQuestFHTML(talker, fhtml0, 252);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 252) == 1 && gg.GetMemoState(talker, 252) == 1 && gg.OwnItemCount(talker, 15500) >= 10 && gg.OwnItemCount(talker, 15501) >= 5) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 147656);
myself.IncrementParam(talker, 0, 716238);
myself.IncrementParam(talker, 1, 78324);
myself.DeleteItem1(talker, 15500, gg.OwnItemCount(talker, 15500));
myself.DeleteItem1(talker, 15501, gg.OwnItemCount(talker, 15501));
myself.RemoveMemo(talker, 252);
myself.SetOneTimeQuestFlag(talker, 252, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 252);
gg.AddLog(3, talker, 252);
myself.ShowPage(talker, "stan_q0252_08.htm");

}

}

}

}
if (ask == 289) {
myself.SetCurrentQuestID(289);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 289) {
if (reply == 1) {
if (gg.HaveMemo(talker, 289) == 0 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && talker.level >= 82) {
myself.FHTML_SetFileName(fhtml0, "stan_q0289_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 289);
myself.ShowQuestFHTML(talker, fhtml0, 289);

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1) {
myself.GiveItem1(talker, 15507, 500);
myself.ShowPage(talker, "stan_q0289_06.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) < 500) {
myself.ShowPage(talker, "stan_q0289_08.htm");

} else if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) >= 500) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 15712, 500);
i0 = gg.Rand(5);
switch (i0) {
case 0: {
myself.GiveItem1(talker, 10377, 1);
break;

}
case 1: {
myself.GiveItem1(talker, 10401, 3);
break;

}
case 2: {
myself.GiveItem1(talker, 10401, 4);
break;

}
case 3: {
myself.GiveItem1(talker, 10401, 5);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, 6);
break;

}

}
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(3, talker, 289);
myself.ShowPage(talker, "stan_q0289_09.htm");

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) < 100) {
myself.ShowPage(talker, "stan_q0289_10.htm");

} else if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) >= 100) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 15712, 100);
i0 = gg.Rand(10);
switch (i0) {
case 0: {
i1 = gg.Rand(10);
if (i1 < 4) {
myself.GiveItem1(talker, 15775, 1);

} else if (i1 >= 4 && i1 < 7) {
myself.GiveItem1(talker, 15778, 1);

} else {
myself.GiveItem1(talker, 15781, 1);

}
break;

}
case 1: {
myself.GiveItem1(talker, 15784, 1);
break;

}
case 2: {
myself.GiveItem1(talker, 15787, 1);
break;

}
case 3: {
myself.GiveItem1(talker, 15791, 1);
break;

}
case 4: {
i1 = gg.Rand(10);
if (i1 < 4) {
myself.GiveItem1(talker, 15812, 1);

} else if (i1 >= 4 && i1 < 8) {
myself.GiveItem1(talker, 15813, 1);

} else {
myself.GiveItem1(talker, 15814, 1);

}
break;

}
case 5: {
i1 = gg.Rand(10);
if (i1 < 4) {
myself.GiveItem1(talker, 15645, 3);

} else if (i1 >= 4 && i1 < 7) {
myself.GiveItem1(talker, 15648, 3);

} else {
myself.GiveItem1(talker, 15651, 3);

}
break;

}
case 6: {
myself.GiveItem1(talker, 15654, 3);
break;

}
case 7: {
myself.GiveItem1(talker, 15657, 3);
break;

}
case 8: {
myself.GiveItem1(talker, 15693, 3);
break;

}
case 9: {
i1 = gg.Rand(10);
if (i1 < 4) {
myself.GiveItem1(talker, 15772, 3);

} else if (i1 >= 4 && i1 < 8) {
myself.GiveItem1(talker, 15773, 3);

} else {
myself.GiveItem1(talker, 15774, 3);

}
break;

}

}
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(3, talker, 289);
myself.ShowPage(talker, "stan_q0289_11.htm");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1) {
myself.ShowPage(talker, "stan_q0289_12.htm");
myself.SetMemoState(talker, 289, 1);

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1 && gg.OwnItemCount(talker, 15712) >= 1 || gg.OwnItemCount(talker, 15713) >= 1) {
myself.ShowPage(talker, "stan_q0289_13.htm");

} else if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1) {
myself.DeleteItem1(talker, 15712, gg.OwnItemCount(talker, 15712));
myself.DeleteItem1(talker, 15713, gg.OwnItemCount(talker, 15713));
myself.DeleteItem1(talker, 15507, gg.OwnItemCount(talker, 15507));
myself.RemoveMemo(talker, 289);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 289);
myself.ShowPage(talker, "stan_q0289_14.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 289) == 1 && gg.GetMemoState(talker, 289) == 1) {
myself.DeleteItem1(talker, 15712, gg.OwnItemCount(talker, 15712));
myself.DeleteItem1(talker, 15713, gg.OwnItemCount(talker, 15713));
myself.DeleteItem1(talker, 15507, gg.OwnItemCount(talker, 15507));
myself.RemoveMemo(talker, 289);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 289);
myself.ShowPage(talker, "stan_q0289_15.htm");

}

}

}
if (ask == 461) {
myself.SetCurrentQuestID(461);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 461) {
if (reply == 1) {
if (gg.HaveMemo(talker, 461) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 252) == 1 && gg.GetDailyQuestFlag(talker, 461) == 1) {
myself.FHTML_SetFileName(fhtml0, "stan_q0461_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 461);
myself.ShowQuestFHTML(talker, fhtml0, 461);

}

}

}
super;
	}


}