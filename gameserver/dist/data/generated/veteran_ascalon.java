package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class veteran_ascalon extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 223) == 0 && myself.GetOneTimeQuestFlag(talker, 223) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Champion");

}
if (gg.HaveMemo(talker, 223) == 0 && myself.GetOneTimeQuestFlag(talker, 223) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Champion (Done)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3277)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3278)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3280)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3281)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3282)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3283)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) || gg.OwnItemCount(talker, 3285)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3286)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Champion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 0 && myself.GetOneTimeQuestFlag(talker, 223) == 0) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 1 || talker.occupation == 45 && talker.level >= 39) {
if (talker.occupation == 1) {
myself.ShowQuestPage(talker, "veteran_ascalon_q0223_03.htm", 223);

} else {
myself.ShowPage(talker, "veteran_ascalon_q0223_04.htm");

}

} else if (talker.occupation == 1 || talker.occupation == 45) {
myself.ShowPage(talker, "veteran_ascalon_q0223_02.htm");

} else {
myself.ShowPage(talker, "veteran_ascalon_q0223_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 0 && myself.GetOneTimeQuestFlag(talker, 223) == 1) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3277)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3278)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3280)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_11.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3281)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_12.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3282)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_13.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3283)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_15.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3284) || gg.OwnItemCount(talker, 3285)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "veteran_ascalon_q0223_16.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3286)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1270742);
myself.IncrementParam(talker, 1, 87200);
myself.GiveItem1(talker, 57, 229764);
myself.ShowPage(talker, "veteran_ascalon_q0223_17.htm");
myself.GiveItem1(talker, 3276, 1);
myself.DeleteItem1(talker, 3286, 1);
myself.RemoveMemo(talker, 223);
gg.AddLog(2, talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 223, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);

}

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
if (quest_id == 223) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 223) == 0 && myself.GetOneTimeQuestFlag(talker, 223) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 1 || talker.occupation == 45 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 223, 1);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 223);
myself.GiveItem1(talker, 3277, 1);
talker.flag = 0;
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);
myself.ShowQuestPage(talker, "veteran_ascalon_q0223_06a.htm", 223);

} else {
myself.ShowQuestPage(talker, "veteran_ascalon_q0223_06.htm", 223);

}

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
myself.FHTML_SetFileName(fhtml0, "veteran_ascalon_q0223_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 223);
myself.ShowQuestFHTML(talker, fhtml0, 223);

} else if (reply == 2 && gg.OwnItemCount(talker, 3278) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "veteran_ascalon_q0223_10.htm");
myself.GiveItem1(talker, 3280, 1);
myself.DeleteItem1(talker, 3278, 1);
myself.SetFlagJournal(talker, 223, 5);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 3 && gg.OwnItemCount(talker, 3282) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "veteran_ascalon_q0223_14.htm");
myself.GiveItem1(talker, 3283, 1);
myself.DeleteItem1(talker, 3282, 1);
myself.SetFlagJournal(talker, 223, 9);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}