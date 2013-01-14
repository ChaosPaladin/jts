package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentry_jenine extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 168) == 0 && myself.GetOneTimeQuestFlag(talker, 168) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Deliver Supplies");

}
if (gg.HaveMemo(talker, 168) == 0 && myself.GetOneTimeQuestFlag(talker, 168) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Supplies (Done)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1153)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) == 1 && gg.OwnItemCount(talker, 1155) == 1 && gg.OwnItemCount(talker, 1156) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) == 0 && gg.OwnItemCount(talker, 1155) == 1 || gg.OwnItemCount(talker, 1156) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1157) == 2 && myself.GetOneTimeQuestFlag(talker, 168) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Deliver Supplies (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 0 && myself.GetOneTimeQuestFlag(talker, 168) == 0) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "sentry_jenine_q0325_00.htm", 168);

} else if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "sentry_jenine_q0325_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 168);
myself.ShowQuestFHTML(talker, fhtml0, 168);

} else {
myself.ShowQuestPage(talker, "sentry_jenine_q0325_01.htm", 168);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 0 && myself.GetOneTimeQuestFlag(talker, 168) == 1) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1153)) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentry_jenine_q0325_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) == 1 && gg.OwnItemCount(talker, 1155) == 1 && gg.OwnItemCount(talker, 1156) == 1) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentry_jenine_q0325_05.htm");
myself.DeleteItem1(talker, 1154, 1);
myself.SetFlagJournal(talker, 168, 3);
myself.ShowQuestMark(talker, 168);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) == 0 && gg.OwnItemCount(talker, 1155) == 1 || gg.OwnItemCount(talker, 1156) == 1) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentry_jenine_q0325_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1157) == 2 && myself.GetOneTimeQuestFlag(talker, 168) == 0) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentry_jenine_q0325_06.htm");
myself.DeleteItem1(talker, 1157, 2);
myself.RemoveMemo(talker, 168);
gg.AddLog(2, talker, 168);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 168, 1);
myself.GiveItem1(talker, 57, 820);

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
if (quest_id == 168) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 168);
myself.ShowQuestMark(talker, 168);
gg.AddLog(1, talker, 168);
myself.SetFlagJournal(talker, 168, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentry_jenine_q0325_03.htm", 168);
myself.GiveItem1(talker, 1153, 1);

}
return;

}
super;
	}


}