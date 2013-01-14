package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_xenovia extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 || gg.GetMemoState(talker, 345) == 8 || gg.OwnItemCount(talker, 4281) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) < 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 3 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 4 && myself.GetOneTimeQuestFlag(talker, 140) == 0 && gg.OwnItemCount(talker, 10348) < 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) >= 5 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Shadow Fox - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 2) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0345_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 || gg.GetMemoState(talker, 345) == 8 || gg.OwnItemCount(talker, 4281) >= 1) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0345_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) < 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0140_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0140_02.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 3 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0140_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 4 && myself.GetOneTimeQuestFlag(talker, 140) == 0 && gg.OwnItemCount(talker, 10348) < 3) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10347) < 5) {
myself.ShowPage(talker, "magister_xenovia_q0140_10.htm");

} else if (gg.OwnItemCount(talker, 10347) >= 5) {
myself.ShowPage(talker, "magister_xenovia_q0140_11.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) >= 5 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_xenovia_q0140_15.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam reply, HandlerParam talker) {
if (ask == 345) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 345) {
if (reply == 1) {
myself.ShowPage(talker, "magister_xenovia_q0345_02.htm");

}
if (reply == 2) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 2) {
if (gg.OwnItemCount(talker, 57) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4281, 1);
myself.DeleteItem1(talker, 57, 1000);
myself.SetMemoState(talker, 345, 3);
myself.SetFlagJournal(talker, 345, 3);
myself.ShowQuestMark(talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "magister_xenovia_q0345_03.htm");

}

} else {
myself.ShowPage(talker, "magister_xenovia_q0345_04.htm");

}

}

}
if (reply == 4) {
myself.ShowPage(talker, "magister_xenovia_q0345_06.htm");

}

}
if (ask == 140) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 140) {
if (reply == 1) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "magister_xenovia_q0140_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "magister_xenovia_q0140_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "magister_xenovia_q0140_05.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 2 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetMemoState(talker, 140, 3);
myself.ShowPage(talker, "magister_xenovia_q0140_06.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 3 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "magister_xenovia_q0140_08.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 3 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetMemoState(talker, 140, 4);
myself.ShowPage(talker, "magister_xenovia_q0140_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 140, 3);
myself.ShowQuestMark(talker, 140);

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 4 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
i0 = gg.Rand(10);
if (i0 <= 8) {
if (gg.OwnItemCount(talker, 10348) < 2) {
myself.GiveItem1(talker, 10348, 1);
myself.DeleteItem1(talker, 10347, 5);
myself.ShowPage(talker, "magister_xenovia_q0140_12.htm");

} else {
myself.GiveItem1(talker, 10349, 1);
myself.DeleteItem1(talker, 10347, gg.OwnItemCount(talker, 10347));
myself.DeleteItem1(talker, 10348, gg.OwnItemCount(talker, 10348));
myself.SetMemoState(talker, 140, 5);
myself.ShowPage(talker, "magister_xenovia_q0140_13.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 140, 4);
myself.ShowQuestMark(talker, 140);

}

} else {
myself.DeleteItem1(talker, 10347, 5);
myself.ShowPage(talker, "magister_xenovia_q0140_14.htm");

}

}

}

}
super;
	}


}