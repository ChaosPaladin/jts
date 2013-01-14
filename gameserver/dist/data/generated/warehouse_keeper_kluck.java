package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_kluck extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 354) == 0 && talker.level < 38) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Conquest of Alligator Island");

}
if (gg.HaveMemo(talker, 354) == 0 && talker.level > 37) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Conquest of Alligator Island");

}
if (gg.HaveMemo(talker, 354) == 1 && gg.OwnItemCount(talker, 5864) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Conquest of Alligator Island (In Progress)");

}
if (gg.HaveMemo(talker, 354) == 1 && gg.OwnItemCount(talker, 5864) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Conquest of Alligator Island (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 0 && myself.GetOneTimeQuestFlag(talker, 140) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shadow Fox - 2");

}
if (myself.GetOneTimeQuestFlag(talker, 140) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Shadow Fox - 2 (Done)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) >= 2 && gg.GetMemoState(talker, 140) <= 4 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 5 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Shadow Fox - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 6 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Shadow Fox - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 354) == 0 && talker.level < 38) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 354) == 0 && talker.level > 37) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_kluck_q0354_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 354);
myself.ShowQuestFHTML(talker, fhtml0, 354);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 354) == 1 && gg.OwnItemCount(talker, 5864) == 0) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 354) == 1 && gg.OwnItemCount(talker, 5864) >= 1) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 0 && myself.GetOneTimeQuestFlag(talker, 140) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 1) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 37) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_kluck_q0140_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 140);
myself.ShowQuestFHTML(talker, fhtml0, 140);

} else {
myself.ShowQuestPage(talker, "warehouse_keeper_kluck_q0140_02.htm", 140);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 140) == 1) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_05.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) >= 2 && gg.GetMemoState(talker, 140) <= 4 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_10.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 5 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10349, gg.OwnItemCount(talker, 10349));
myself.SetMemoState(talker, 140, 6);
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_11.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 6 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 354) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 354);
myself.SetJournal(talker, 354, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_kluck_q0354_03.htm", 354);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
if (quest_id == 140) {
myself.SetCurrentQuestID(140);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 140) == 0 && talker.level >= 37 && myself.GetOneTimeQuestFlag(talker, 140) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 1) {
myself.SetMemoState(talker, 140, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_kluck_q0140_04.htm", 140);
myself.SetFlagJournal(talker, 140, 1);
myself.ShowQuestMark(talker, 140);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 354) {
myself.SetCurrentQuestID(354);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 354) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5863) >= 100) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5863) * 220 + 10700);
myself.DeleteItem1(talker, 5863, gg.OwnItemCount(talker, 5863));
gg.AddLog(3, talker, 354);
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_06b.htm");

} else if (gg.OwnItemCount(talker, 5863) > 0 && gg.OwnItemCount(talker, 5863) < 100) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5863) * 220 + 3100);
myself.DeleteItem1(talker, 5863, gg.OwnItemCount(talker, 5863));
gg.AddLog(3, talker, 354);
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_06a.htm");

} else if (gg.OwnItemCount(talker, 5863) == 0) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_06.htm");

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_07.htm");

}
if (reply == 3) {
myself.RemoveMemo(talker, 354);
gg.AddLog(2, talker, 354);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_08.htm");

}
if (reply == 4 && gg.OwnItemCount(talker, 5864) > 0 && gg.OwnItemCount(talker, 5864) < 10) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_09.htm");

}
if (reply == 4 && gg.OwnItemCount(talker, 5864) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5915, 1);
myself.DeleteItem1(talker, 5864, 10);
gg.AddLog(3, talker, 354);
myself.ShowPage(talker, "warehouse_keeper_kluck_q0354_10.htm");

}

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
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_06.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_07.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_08.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 1 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.SetMemoState(talker, 140, 2);
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 140, 2);
myself.ShowQuestMark(talker, 140);

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 6 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_12.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 140) == 1 && gg.GetMemoState(talker, 140) == 6 && myself.GetOneTimeQuestFlag(talker, 140) == 0) {
myself.RemoveMemo(talker, 140);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_kluck_q0140_14.htm");
myself.SetOneTimeQuestFlag(talker, 140, 1);
gg.AddLog(2, talker, 140);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 43) {
myself.GiveItem1(talker, 57, 18775);
myself.IncrementParam(talker, 0, 30000);
myself.IncrementParam(talker, 1, 2000);

} else {
myself.GiveItem1(talker, 57, 18775);

}
gg.AddLog(3, talker, 140);

}

}

}

}
super;
	}


}