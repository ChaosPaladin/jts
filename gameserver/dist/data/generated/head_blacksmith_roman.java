package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class head_blacksmith_roman extends master_lv3_black {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 351) == 1 || gg.HaveMemo(talker, 345) && gg.OwnItemCount(talker, 4407) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Black Swan (In Progress)");

}
if (gg.HaveMemo(talker, 351) == 1 || gg.HaveMemo(talker, 345) && gg.OwnItemCount(talker, 4407) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Black Swan (In Progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Winds of Change (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 1 || gg.HaveMemo(talker, 345) && gg.OwnItemCount(talker, 4407) >= 1) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_roman_q0351_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 1 || gg.HaveMemo(talker, 345) && gg.OwnItemCount(talker, 4407) == 0) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_roman_q0351_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_roman_q0237_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 3) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_roman_q0237_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 351) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 351) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) > 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 700);
myself.DeleteItem1(talker, 4407, 1);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 3) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1867, 20);
myself.DeleteItem1(talker, 4407, 3);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 3) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1872, 20);
myself.DeleteItem1(talker, 4407, 3);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 2) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1870, 10);
myself.DeleteItem1(talker, 4407, 2);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 2) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1871, 10);
myself.DeleteItem1(talker, 4407, 2);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 9) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1882, 10);
myself.DeleteItem1(talker, 4407, 9);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 5) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1879, 6);
myself.DeleteItem1(talker, 4407, 5);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 3) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1881, 2);
myself.DeleteItem1(talker, 4407, 3);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 3) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1874, 1);
myself.DeleteItem1(talker, 4407, 3);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 3) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1875, 1);
myself.DeleteItem1(talker, 4407, 3);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 11) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 6) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1894, 1);
myself.GiveItem1(talker, 57, 210);
myself.DeleteItem1(talker, 4407, 6);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 12) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && gg.OwnItemCount(talker, 4407) >= 7) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1888, 1);
myself.GiveItem1(talker, 57, 280);
myself.DeleteItem1(talker, 4407, 7);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 13) {
if (gg.OwnItemCount(talker, 4407) >= 9 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1887, 1);
myself.GiveItem1(talker, 57, 630);
myself.DeleteItem1(talker, 4407, 9);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_03.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 15) {
if (gg.OwnItemCount(talker, 4407) >= 5 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5220, 1);
myself.DeleteItem1(talker, 4407, 5);
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "head_blacksmith_roman_q0351_05.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_04.htm");

}

}
if (reply == 14) {
myself.ShowPage(talker, "head_blacksmith_roman_q0351_05.htm");

}

}
if (ask == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 237) {
if (reply == 1) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
myself.ShowPage(talker, "head_blacksmith_roman_q0237_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
myself.SetMemoState(talker, 237, 4);
myself.ShowPage(talker, "head_blacksmith_roman_q0237_03.htm");
myself.SetFlagJournal(talker, 237, 3);
myself.ShowQuestMark(talker, 237);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}