package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mouen extends inzone_raid_controller {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3283)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) && gg.OwnItemCount(talker, 3291) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) && gg.OwnItemCount(talker, 3291) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3285) && gg.OwnItemCount(talker, 3292) < 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3285) && gg.OwnItemCount(talker, 3292) >= 10) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3286)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Mutated Kaneus - Oren");

}
if (gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Mutated Kaneus - Oren (Done)");

}
if (gg.HaveMemo(talker, 10279) == 1 && gg.GetMemoState(talker, 10279) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Mutated Kaneus - Oren (In progress)");

}
if (gg.HaveMemo(talker, 249) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Poisoned Plains of the Lizardmen");

}
if (gg.HaveMemo(talker, 249) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Poisoned Plains of the Lizardmen");

}
if (gg.HaveMemo(talker, 249) == 1 && gg.GetMemoState(talker, 249) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Poisoned Plains of the Lizardmen (In progress)");

}
if (gg.HaveMemo(talker, 249) == 0 && myself.GetOneTimeQuestFlag(talker, 249) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Poisoned Plains of the Lizardmen (Done)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3283)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0223_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) && gg.OwnItemCount(talker, 3291) < 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0223_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) && gg.OwnItemCount(talker, 3291) >= 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0223_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3285) && gg.OwnItemCount(talker, 3292) < 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0223_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3285) && gg.OwnItemCount(talker, 3292) >= 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mouen_q0223_08.htm");
myself.GiveItem1(talker, 3286, 1);
myself.DeleteItem1(talker, 3285, 1);
myself.DeleteItem1(talker, 3292, gg.OwnItemCount(talker, 3292));
myself.SetFlagJournal(talker, 223, 14);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3286)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0223_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
myself.SetCurrentQuestID(10279);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 48) {
myself.ShowQuestPage(talker, "mouen_q10279_01.htm", 10279);

} else {
myself.ShowQuestPage(talker, "mouen_q10279_04.htm", 10279);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 1) {
myself.SetCurrentQuestID(10279);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q10279_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10279) == 1 && gg.GetMemoState(talker, 10279) == 1) {
myself.SetCurrentQuestID(10279);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13836) >= 1 && gg.OwnItemCount(talker, 13837) >= 1) {
myself.ShowPage(talker, "mouen_q10279_07.htm");

} else {
myself.ShowPage(talker, "mouen_q10279_06.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 249) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "mouen_q0249_01.htm", 249);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 249) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "mouen_q0249_02.htm", 249);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 249) == 1 && gg.GetMemoState(talker, 249) == 1) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0249_05.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 249) == 0 && myself.GetOneTimeQuestFlag(talker, 249) == 1) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mouen_q0249_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10279) {
myself.SetCurrentQuestID(10279);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 10279) == 0 && talker.level >= 48 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
myself.SetMemoState(talker, 10279, 1);
myself.SetMemo(talker, 10279);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "mouen_q10279_05.htm", 10279);
myself.SetFlagJournal(talker, 10279, 1);
myself.ShowQuestMark(talker, 10279);
gg.AddLog(1, talker, 10279);

}
return;

}
if (quest_id == 249) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 249) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 249);
myself.SetMemoState(talker, 249, 1);
myself.ShowQuestPage(talker, "mouen_q0249_04.htm", 249);
myself.SetFlagJournal(talker, 249, 1);
myself.ShowQuestMark(talker, 249);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 223) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 223) {
if (reply == 1) {
myself.ShowPage(talker, "mouen_q0223_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 3283) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mouen_q0223_03.htm");
myself.GiveItem1(talker, 3284, 1);
myself.DeleteItem1(talker, 3283, 1);
myself.SetFlagJournal(talker, 223, 10);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 3 && gg.OwnItemCount(talker, 3284) && gg.OwnItemCount(talker, 3291) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mouen_q0223_06.htm");
myself.GiveItem1(talker, 3285, 1);
myself.DeleteItem1(talker, 3284, 1);
myself.DeleteItem1(talker, 3291, gg.OwnItemCount(talker, 3291));
myself.SetFlagJournal(talker, 223, 12);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 10279) {
myself.SetCurrentQuestID(10279);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10279) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
if (talker.level >= 48) {
myself.FHTML_SetFileName(fhtml0, "mouen_q10279_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10279);
myself.ShowQuestFHTML(talker, fhtml0, 10279);

}

}

}

}
if (ask == 249) {
myself.SetCurrentQuestID(249);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 249) {
if (reply == 1) {
if (gg.HaveMemo(talker, 249) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 249) == 0) {
myself.FHTML_SetFileName(fhtml0, "mouen_q0249_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 249);
myself.ShowQuestFHTML(talker, fhtml0, 249);

}

}

}
super;
	}


}