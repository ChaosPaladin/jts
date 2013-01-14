package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harry extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 152) == 0 && myself.GetOneTimeQuestFlag(talker, 152) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shards of Golem");

}
if (gg.HaveMemo(talker, 152) == 0 && myself.GetOneTimeQuestFlag(talker, 152) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shards of Golem (Done)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1008) != 0 && gg.OwnItemCount(talker, 1011) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1011) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1011) != 0 && myself.GetOneTimeQuestFlag(talker, 152) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shards of Golem (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) == 0 && myself.GetOneTimeQuestFlag(talker, 152) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "harry_q0301_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 152);
myself.ShowQuestFHTML(talker, fhtml0, 152);

} else {
myself.ShowQuestPage(talker, "harry_q0301_02.htm", 152);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) == 0 && myself.GetOneTimeQuestFlag(talker, 152) == 1) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 152);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1008) != 0 && gg.OwnItemCount(talker, 1011) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harry_q0301_05a.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1011) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harry_q0301_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1011) != 0 && myself.GetOneTimeQuestFlag(talker, 152) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1011, gg.OwnItemCount(talker, 1011));
myself.DeleteItem1(talker, 1009, gg.OwnItemCount(talker, 1009));
myself.RemoveMemo(talker, 152);
gg.AddLog(2, talker, 152);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 152, 1);
myself.GiveItem1(talker, 23, 1);
myself.IncrementParam(talker, 0, 5000);
myself.ShowPage(talker, "harry_q0301_06.htm");

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
if (quest_id == 152) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 152);
gg.AddLog(1, talker, 152);
myself.SetFlagJournal(talker, 152, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1008) == 0) {
myself.GiveItem1(talker, 1008, 1);

}
myself.ShowPage(talker, "harry_q0301_04.htm");

}
return;

}
super;
	}


}