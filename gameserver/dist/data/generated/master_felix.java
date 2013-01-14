package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_felix extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) >= 2 && gg.GetMemoState(talker, 70) <= 4 && gg.OwnItemCount(talker, 7534) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) >= 2 && gg.GetMemoState(talker, 70) <= 4 && gg.OwnItemCount(talker, 7534) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 11) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 12) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Duelist (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) >= 2 && gg.GetMemoState(talker, 70) <= 4 && gg.OwnItemCount(talker, 7534) == 0) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) >= 2 && gg.GetMemoState(talker, 70) <= 4 && gg.OwnItemCount(talker, 7534) >= 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 5) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 11) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 12) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0070_0132.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 11) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0073_0131.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 12) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_felix_q0073_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 1) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 1) {
myself.SetMemoState(talker, 70, 2);
myself.ShowPage(talker, "master_felix_q0070_0105.htm");
myself.SetFlagJournal(talker, 70, 2);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) >= 2 && gg.GetMemoState(talker, 70) <= 4 && gg.OwnItemCount(talker, 7534) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7268, 1);
myself.DeleteItem1(talker, 7534, gg.OwnItemCount(talker, 7534));
myself.SetMemoState(talker, 70, 5);
myself.ShowPage(talker, "master_felix_q0070_0106.htm");
myself.SetFlagJournal(talker, 70, 5);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 9) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 11) {
myself.SetMemoState(talker, 70, 12);
myself.ShowPage(talker, "master_felix_q0070_0133.htm");
myself.SetFlagJournal(talker, 70, 15);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 73) {
if (reply == 9) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 11) {
myself.SetMemoState(talker, 73, 12);
myself.ShowPage(talker, "master_felix_q0073_0133.htm");
myself.SetFlagJournal(talker, 73, 15);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}