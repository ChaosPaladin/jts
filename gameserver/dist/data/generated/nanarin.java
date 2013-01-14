package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class nanarin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 4 && gg.OwnItemCount(talker, 4317) > 0 && gg.OwnItemCount(talker, 4316) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sorrowful Sound of Flute");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 4) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 5) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 6) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Sorrowful Sound of Flute (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 4 && gg.OwnItemCount(talker, 4317) > 0 && gg.OwnItemCount(talker, 4316) > 0) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetFlagJournal(talker, 362, 5);
myself.ShowQuestMark(talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 4317, 1);
myself.DeleteItem1(talker, 4316, 1);
myself.SetMemoState(talker, 362, 5);
myself.ShowPage(talker, "nanarin_q0362_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 5) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nanarin_q0362_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 0) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "nanarin_q0363_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 363);
myself.ShowQuestFHTML(talker, fhtml0, 363);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nanarin_q0363_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 4) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nanarin_q0363_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 5) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4420, 1);
myself.ShowPage(talker, "nanarin_q0363_09.htm");
myself.RemoveMemo(talker, 363);
gg.AddLog(3, talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 6) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4318) > 0) {
myself.DeleteItem1(talker, 4318, 1);

}
if (gg.OwnItemCount(talker, 4319) > 0) {
myself.DeleteItem1(talker, 4319, 1);

}
if (gg.OwnItemCount(talker, 4320) > 0) {
myself.DeleteItem1(talker, 4320, 1);

}
myself.ShowPage(talker, "nanarin_q0363_10.htm");
myself.RemoveMemo(talker, 363);
gg.AddLog(3, talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_giveup");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 363) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level >= 15) {
myself.SetMemoState(talker, 363, 2);
myself.SetJournal(talker, 363, 1);
myself.ShowQuestPage(talker, "nanarin_q0363_02.htm", 363);
gg.AddLog(1, talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_accept");

} else {
myself.ShowQuestPage(talker, "nanarin_q0363_03.htm", 363);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 363) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 363) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4318, 1);
myself.SetMemoState(talker, 363, 4);
myself.SetJournal(talker, 363, 3);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "nanarin_q0363_05.htm");

}

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4319, 1);
myself.SetMemoState(talker, 363, 4);
myself.SetJournal(talker, 363, 3);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "nanarin_q0363_06.htm");

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4320, 1);
myself.SetMemoState(talker, 363, 4);
myself.SetJournal(talker, 363, 3);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "nanarin_q0363_07.htm");

}

}

}
super;
	}


}