package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alberryus extends chief_guard {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 102) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sea of Spores Fever");

}
if (gg.HaveMemo(talker, 102) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sea of Spores Fever (Done)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 964) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 0 && gg.OwnItemCount(talker, 1130) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1130) == 1 || gg.OwnItemCount(talker, 1131) == 1 || gg.OwnItemCount(talker, 1132) == 1 || gg.OwnItemCount(talker, 1133) == 1 || gg.OwnItemCount(talker, 1134) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.GetMemoState(talker, 102) == 1 && gg.OwnItemCount(talker, 1130) == 0 && gg.OwnItemCount(talker, 1131) == 0 && gg.OwnItemCount(talker, 1132) == 0 && gg.OwnItemCount(talker, 1133) == 0 && gg.OwnItemCount(talker, 1134) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Sea of Spores Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 0) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1) {
myself.ShowQuestPage(talker, "alberryus_q0102_00.htm", 102);

} else if (talker.level >= 12) {
myself.FHTML_SetFileName(fhtml0, "alberryus_q0102_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 102);
myself.ShowQuestFHTML(talker, fhtml0, 102);

} else {
myself.ShowQuestPage(talker, "alberryus_q0102_08.htm", 102);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 964) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alberryus_q0102_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alberryus_q0102_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 0 && gg.OwnItemCount(talker, 1130) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1130, 1);
myself.GiveItem1(talker, 746, 1);
myself.ShowPage(talker, "alberryus_q0102_04.htm");
myself.SetFlagJournal(talker, 102, 5);
myself.ShowQuestMark(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1130) == 1 || gg.OwnItemCount(talker, 1131) == 1 || gg.OwnItemCount(talker, 1132) == 1 || gg.OwnItemCount(talker, 1133) == 1 || gg.OwnItemCount(talker, 1134) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alberryus_q0102_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.GetMemoState(talker, 102) == 1 && gg.OwnItemCount(talker, 1130) == 0 && gg.OwnItemCount(talker, 1131) == 0 && gg.OwnItemCount(talker, 1132) == 0 && gg.OwnItemCount(talker, 1133) == 0 && gg.OwnItemCount(talker, 1134) == 0 && myself.GetOneTimeQuestFlag(talker, 102) == 0) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 746, 1);
myself.RemoveMemo(talker, 102);
gg.AddLog(2, talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "alberryus_q0102_06.htm");
myself.SetOneTimeQuestFlag(talker, 102, 1);
myself.GiveItem1(talker, 1060, 100);
myself.GiveItem1(talker, 4414, 10);
myself.GiveItem1(talker, 4415, 10);
myself.GiveItem1(talker, 4416, 10);
myself.GiveItem1(talker, 4413, 10);
myself.GiveItem1(talker, 4412, 10);
myself.IncrementParam(talker, 0, 30202);
myself.IncrementParam(talker, 1, 1339);
myself.GiveItem1(talker, 57, 6331);
if (myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 743, 1);
myself.GiveItem1(talker, 1835, 1000);

} else {
myself.GiveItem1(talker, 744, 1);
myself.GiveItem1(talker, 2509, 500);

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
if (quest_id == 102) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "alberryus_q0102_02.htm", 102);
myself.GiveItem1(talker, 964, 1);
myself.SetMemo(talker, 102);
myself.ShowQuestMark(talker, 102);
myself.SetFlagJournal(talker, 102, 1);
gg.AddLog(1, talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}