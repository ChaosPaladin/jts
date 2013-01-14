package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_weisz extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 340) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Subjugation of Lizardmen");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 1 && gg.OwnItemCount(talker, 4255) < 30) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 1 && gg.OwnItemCount(talker, 4255) >= 30) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) >= 3 && gg.GetMemoState(talker, 340) < 7) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Subjugation of Lizardmen (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 0) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 17) {
myself.ShowQuestPage(talker, "guard_weisz_q0340_01.htm", 340);

} else if (talker.level >= 17) {
myself.FHTML_SetFileName(fhtml0, "guard_weisz_q0340_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 340);
myself.ShowQuestFHTML(talker, fhtml0, 340);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 1 && gg.OwnItemCount(talker, 4255) < 30) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_weisz_q0340_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 1 && gg.OwnItemCount(talker, 4255) >= 30) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_weisz_q0340_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 2) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_weisz_q0340_11.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) >= 3 && gg.GetMemoState(talker, 340) < 7) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_weisz_q0340_12.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 7) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 14700);
myself.RemoveMemo(talker, 340);
gg.AddLog(2, talker, 340);
gg.AddLog(3, talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "guard_weisz_q0340_13.htm");

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
if (quest_id == 340) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 340);
myself.SetMemoState(talker, 340, 1);
gg.AddLog(1, talker, 340);
myself.SetFlagJournal(talker, 340, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_weisz_q0340_03.htm", 340);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 340) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 340) {
if (reply == 1) {
myself.ShowPage(talker, "guard_weisz_q0340_04.htm");

}
if (reply == 2) {
myself.DeleteItem1(talker, 4255, gg.OwnItemCount(talker, 4255));
myself.SetMemoState(talker, 340, 2);
myself.SetFlagJournal(talker, 340, 2);
myself.ShowQuestMark(talker, 340);
myself.ShowPage(talker, "guard_weisz_q0340_07.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "guard_weisz_q0340_08.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 4255) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 4090);
myself.DeleteItem1(talker, 4255, gg.OwnItemCount(talker, 4255));
gg.AddLog(3, talker, 340);
myself.SetMemoState(talker, 340, 1);
myself.ShowPage(talker, "guard_weisz_q0340_09.htm");

}

}

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 4255) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 4090);
myself.DeleteItem1(talker, 4255, gg.OwnItemCount(talker, 4255));
myself.RemoveMemo(talker, 340);
gg.AddLog(2, talker, 340);
gg.AddLog(3, talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "guard_weisz_q0340_10.htm");

}

}

}

}
super;
	}


}