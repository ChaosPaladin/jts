package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class watcher_antaras_theodric extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) < 60000) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000 && gg.OwnItemCount(talker, 3861) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000 && gg.OwnItemCount(talker, 3861) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) >= 1 && talker.level >= 83) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Land Dragon Conqueror");

}
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && talker.level < 83) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Land Dragon Conqueror");

}
if (myself.GetOneTimeQuestFlag(talker, 10290) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Land Dragon Conqueror (Done)");

}
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) == 0 && talker.level >= 83) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Land Dragon Conqueror");

}
if (gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 1 && gg.OwnItemCount(talker, 15522) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Land Dragon Conqueror (In progress)");

}
if (gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 1 && gg.OwnItemCount(talker, 15522) == 0 && gg.OwnItemCount(talker, 15523) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Land Dragon Conqueror (In progress)");

}
if (gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Land Dragon Conqueror (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) < 60000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q0337_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q0337_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000 && gg.OwnItemCount(talker, 3861) == 0) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q0337_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000 && gg.OwnItemCount(talker, 3861) >= 1) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q0337_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) >= 1 && talker.level >= 83) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "watcher_antaras_theodric_q10290_01.htm", 10290);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && talker.level < 83) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "watcher_antaras_theodric_q10290_02.htm", 10290);

}
break;

}
case 6: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 10290) == 1) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q10290_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) == 0 && talker.level >= 83) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "watcher_antaras_theodric_q10290_04.htm", 10290);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 1 && gg.OwnItemCount(talker, 15522) >= 1) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_theodric_q10290_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 1 && gg.OwnItemCount(talker, 15522) == 0 && gg.OwnItemCount(talker, 15523) == 0) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 15522, 1);
myself.ShowPage(talker, "watcher_antaras_theodric_q10290_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10290) == 1 && gg.GetMemoState(talker, 10290) == 2) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 8568, 1);
myself.GiveItem1(talker, 57, 131236);
myself.IncrementParam(talker, 0, 702557);
myself.IncrementParam(talker, 1, 76334);
myself.DeleteItem1(talker, 15523, gg.OwnItemCount(talker, 15523));
myself.RemoveMemo(talker, 10290);
myself.SetOneTimeQuestFlag(talker, 10290, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10290);
gg.AddLog(3, talker, 10290);
myself.ShowPage(talker, "watcher_antaras_theodric_q10290_10.htm");

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
if (quest_id == 10290) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) >= 1 && talker.level >= 83) {
myself.GiveItem1(talker, 15522, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 10290);
myself.SetMemoState(talker, 10290, 1);
myself.ShowQuestPage(talker, "watcher_antaras_theodric_q10290_07.htm", 10290);
myself.SetFlagJournal(talker, 10290, 1);
myself.ShowQuestMark(talker, 10290);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {
if (reply == 1 && gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000 && gg.OwnItemCount(talker, 3861) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3865, 1);
myself.DeleteItem1(talker, 3861, gg.OwnItemCount(talker, 3861));
myself.DeleteItem1(talker, 3890, gg.OwnItemCount(talker, 3890));
myself.RemoveMemo(talker, 337);
gg.AddLog(2, talker, 337);
gg.AddLog(3, talker, 337);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "watcher_antaras_theodric_q0337_05.htm");

}

}

}
if (ask == 10290) {
myself.SetCurrentQuestID(10290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10290) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) >= 1 && talker.level >= 83) {
myself.ShowPage(talker, "watcher_antaras_theodric_q10290_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 10290) == 0 && myself.GetOneTimeQuestFlag(talker, 10290) == 0 && gg.OwnItemCount(talker, 3865) >= 1 && talker.level >= 83) {
myself.FHTML_SetFileName(fhtml0, "watcher_antaras_theodric_q10290_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10290);
myself.ShowQuestFHTML(talker, fhtml0, 10290);

}

}

}
super;
	}


}