package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dorothy_the_locksmith extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 345) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Method to Raise the Dead");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 1 && gg.OwnItemCount(talker, 4274) == 0 || gg.OwnItemCount(talker, 4275) == 0 || gg.OwnItemCount(talker, 4276) == 0 || gg.OwnItemCount(talker, 4277) == 0 || gg.OwnItemCount(talker, 4278) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 1 && gg.OwnItemCount(talker, 4274) >= 1 && gg.OwnItemCount(talker, 4275) >= 1 && gg.OwnItemCount(talker, 4276) >= 1 && gg.OwnItemCount(talker, 4277) >= 1 && gg.OwnItemCount(talker, 4278) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8 && gg.GetMemoStateEx(talker, 345, 1) == 1 || gg.GetMemoStateEx(talker, 345, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8 && gg.GetMemoStateEx(talker, 345, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Seal Removal (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Vain Conclusion");

}
if (myself.GetOneTimeQuestFlag(talker, 191) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Vain Conclusion (Done)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) >= 1 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Vain Conclusion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 0) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 35) {
myself.ShowQuestPage(talker, "dorothy_the_locksmith_q0345_01.htm", 345);

} else if (talker.level >= 35) {
myself.FHTML_SetFileName(fhtml0, "dorothy_the_locksmith_q0345_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 345);
myself.ShowQuestFHTML(talker, fhtml0, 345);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 0) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_04.htm");
myself.SetMemoState(talker, 345, 1);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 1 && gg.OwnItemCount(talker, 4274) == 0 || gg.OwnItemCount(talker, 4275) == 0 || gg.OwnItemCount(talker, 4276) == 0 || gg.OwnItemCount(talker, 4277) == 0 || gg.OwnItemCount(talker, 4278) == 0) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 1 && gg.OwnItemCount(talker, 4274) >= 1 && gg.OwnItemCount(talker, 4275) >= 1 && gg.OwnItemCount(talker, 4276) >= 1 && gg.OwnItemCount(talker, 4277) >= 1 && gg.OwnItemCount(talker, 4278) >= 1) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 2) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 3) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_12.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8 && gg.GetMemoStateEx(talker, 345, 1) == 1 || gg.GetMemoStateEx(talker, 345, 1) == 2) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4407, 3);
myself.GiveItem1(talker, 57, 5390 + 70 * gg.OwnItemCount(talker, 4280));
myself.DeleteItem1(talker, 4280, gg.OwnItemCount(talker, 4280));
myself.RemoveMemo(talker, 345);
gg.AddLog(2, talker, 345);
gg.AddLog(3, talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_13.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8 && gg.GetMemoStateEx(talker, 345, 1) == 3) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 92) {
myself.GiveItem1(talker, 4407, 5);

} else {
myself.GiveItem1(talker, 3456, 1);

}
myself.GiveItem1(talker, 57, 3040 + 70 * gg.OwnItemCount(talker, 4280));
myself.DeleteItem1(talker, 4280, gg.OwnItemCount(talker, 4280));
myself.RemoveMemo(talker, 345);
gg.AddLog(2, talker, 345);
gg.AddLog(3, talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_14.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0188_01.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 1) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 42) {
myself.ShowQuestPage(talker, "dorothy_the_locksmith_q0191_01.htm", 191);

} else {
myself.ShowQuestPage(talker, "dorothy_the_locksmith_q0191_02.htm", 191);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 191) == 1) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) >= 1 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dorothy_the_locksmith_q0191_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 345) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 345);
myself.SetMemoState(talker, 345, 0);
gg.AddLog(1, talker, 345);
myself.SetFlagJournal(talker, 345, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dorothy_the_locksmith_q0345_03.htm", 345);

}
return;

}
if (quest_id == 191) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 191) == 0 && talker.level >= 42 && myself.GetOneTimeQuestFlag(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 1) {
myself.GiveItem1(talker, 10371, 1);
myself.SetMemoState(talker, 191, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dorothy_the_locksmith_q0191_04.htm", 191);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 191, 1);
myself.ShowQuestMark(talker, 191);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 345) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 345) {
if (reply == 1) {
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_04.htm");
myself.SetMemoState(talker, 345, 1);

}
if (reply == 2) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 1 && gg.OwnItemCount(talker, 4274) >= 1 && gg.OwnItemCount(talker, 4275) >= 1 && gg.OwnItemCount(talker, 4276) >= 1 && gg.OwnItemCount(talker, 4277) >= 1 && gg.OwnItemCount(talker, 4278) >= 1) {
myself.SetMemoState(talker, 345, 2);
myself.SetFlagJournal(talker, 345, 2);
myself.ShowQuestMark(talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "dorothy_the_locksmith_q0345_07.htm");

}

}

}
if (ask == 188) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 188) {
if (reply == 1) {
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.ShowPage(talker, "dorothy_the_locksmith_q0188_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 188) == 1 && gg.GetMemoState(talker, 188) == 2 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.DeleteItem1(talker, 10369, gg.OwnItemCount(talker, 10369));
myself.RemoveMemo(talker, 188);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dorothy_the_locksmith_q0188_03.htm");
gg.AddLog(2, talker, 188);
myself.SetOneTimeQuestFlag(talker, 188, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 47) {
myself.GiveItem1(talker, 57, 98583);
myself.IncrementParam(talker, 0, 285935);
myself.IncrementParam(talker, 1, 18711);

} else {
myself.GiveItem1(talker, 57, 98583);

}
gg.AddLog(3, talker, 188);

}

}

}

}
if (ask == 191) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 191) {
if (reply == 1) {
if (gg.HaveMemo(talker, 191) == 0 && talker.level >= 42 && myself.GetOneTimeQuestFlag(talker, 191) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 1) {
myself.FHTML_SetFileName(fhtml0, "dorothy_the_locksmith_q0191_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 191);
myself.ShowQuestFHTML(talker, fhtml0, 191);

}

}

}
super;
	}


}