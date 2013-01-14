package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class swan extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 2 || gg.GetMemoState(talker, 364) == 3 && gg.OwnItemCount(talker, 4324) == 1 || gg.OwnItemCount(talker, 4323) == 1 || gg.OwnItemCount(talker, 4322) == 1 || gg.OwnItemCount(talker, 4321) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 4 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4321) == 0 && gg.OwnItemCount(talker, 4322) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 3 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4321) == 0 && gg.OwnItemCount(talker, 4322) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 2 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4322) == 0 && gg.OwnItemCount(talker, 4321) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) >= 5) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Bard's Mandolin");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 1 && gg.GetMemoState(talker, 362) < 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 3 || gg.GetMemoState(talker, 362) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 5) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Bard's Mandolin (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 1) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 2 || gg.GetMemoState(talker, 364) == 3 && gg.OwnItemCount(talker, 4324) == 1 || gg.OwnItemCount(talker, 4323) == 1 || gg.OwnItemCount(talker, 4322) == 1 || gg.OwnItemCount(talker, 4321) == 1) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 4 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4321) == 0 && gg.OwnItemCount(talker, 4322) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_04.htm");
myself.SetMemoState(talker, 364, 5);
myself.SetFlagJournal(talker, 364, 3);
myself.ShowQuestMark(talker, 364);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 57, 100);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 3 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4321) == 0 && gg.OwnItemCount(talker, 4322) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_05.htm");
myself.SetMemoState(talker, 364, 5);
myself.SetFlagJournal(talker, 364, 3);
myself.ShowQuestMark(talker, 364);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 2 && gg.OwnItemCount(talker, 4324) == 0 && gg.OwnItemCount(talker, 4323) == 0 && gg.OwnItemCount(talker, 4322) == 0 && gg.OwnItemCount(talker, 4321) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_06.htm");
myself.SoundEffect(talker, "ItemSound.quest_giveup");
myself.RemoveMemo(talker, 364);
gg.AddLog(3, talker, 364);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) >= 5) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0364_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 0) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "swan_q0362_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 362);
myself.ShowQuestFHTML(talker, fhtml0, 362);

} else {
myself.ShowPage(talker, "swan_q0362_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 1 && gg.GetMemoState(talker, 362) < 3) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0362_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 3 || gg.GetMemoState(talker, 362) == 4) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 362) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetFlagJournal(talker, 362, 4);
myself.ShowQuestMark(talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 4317, 1);
myself.SetMemoState(talker, 362, 4);
myself.ShowPage(talker, "swan_q0362_05.htm");

}

} else {
myself.ShowPage(talker, "swan_q0362_05.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 5) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "swan_q0362_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 362) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetFlagJournal(talker, 362, 1);
myself.SetMemoState(talker, 362, 1);
gg.AddLog(1, talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "swan_q0362_03.htm", 362);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 364) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 364) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4323, 1);
myself.GiveItem1(talker, 4324, 1);
myself.SetMemoState(talker, 364, 2);
myself.SetFlagJournal(talker, 364, 2);
myself.ShowQuestMark(talker, 364);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "swan_q0364_02.htm");

}

}

}
if (ask == 362) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 362) {
if (reply == 3 && gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 10000);
myself.GiveItem1(talker, 4410, 1);
myself.ShowPage(talker, "swan_q0362_07.htm");
myself.RemoveMemo(talker, 362);
gg.AddLog(3, talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
if (reply == 4 && gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 10000);
myself.GiveItem1(talker, 4410, 1);
myself.ShowPage(talker, "swan_q0362_08.htm");
myself.RemoveMemo(talker, 362);
gg.AddLog(3, talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
super;
	}


}