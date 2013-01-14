package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rockswell extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 154) == 0 && myself.GetOneTimeQuestFlag(talker, 154) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sacrifice to the Sea");

}
if (gg.HaveMemo(talker, 154) == 0 && myself.GetOneTimeQuestFlag(talker, 154) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sacrifice to the Sea (Done)");

}
if (gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1033) == 0 && gg.OwnItemCount(talker, 1034) == 0 && gg.OwnItemCount(talker, 1032) < 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sacrifice to the Sea (In Progress)");

}
if (gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1032) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sacrifice to the Sea (In Progress)");

}
if (gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1033) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sacrifice to the Sea (In Progress)");

}
if (gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1034) >= 1 && myself.GetOneTimeQuestFlag(talker, 154) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Sacrifice to the Sea (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 0 && myself.GetOneTimeQuestFlag(talker, 154) == 0) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 2) {
myself.FHTML_SetFileName(fhtml0, "rockswell_q0304_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 154);
myself.ShowQuestFHTML(talker, fhtml0, 154);

} else {
myself.ShowQuestPage(talker, "rockswell_q0304_02.htm", 154);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 0 && myself.GetOneTimeQuestFlag(talker, 154) == 1) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1033) == 0 && gg.OwnItemCount(talker, 1034) == 0 && gg.OwnItemCount(talker, 1032) < 10) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rockswell_q0304_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1032) >= 10) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rockswell_q0304_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1033) >= 1) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rockswell_q0304_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 154) == 1 && gg.OwnItemCount(talker, 1034) >= 1 && myself.GetOneTimeQuestFlag(talker, 154) == 0) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "rockswell_q0304_07.htm");
myself.DeleteItem1(talker, 1034, gg.OwnItemCount(talker, 1034));
myself.DeleteItem1(talker, 1032, gg.OwnItemCount(talker, 1032));
myself.GiveItem1(talker, 113, 1);
myself.IncrementParam(talker, 0, 100);
myself.RemoveMemo(talker, 154);
gg.AddLog(2, talker, 154);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 154, 1);

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
if (quest_id == 154) {
myself.SetCurrentQuestID(154);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "rockswell_q0304_04.htm", 154);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 154);
gg.AddLog(1, talker, 154);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 154, 1);

}
return;

}
super;
	}


}