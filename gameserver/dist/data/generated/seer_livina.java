package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_livina extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 272) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Wrath of Ancestors");

}
if (gg.HaveMemo(talker, 272)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Wrath of Ancestors (In Progress)");

}
if (talker.level >= 20 && gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Walk of Fate");

}
if (talker.level < 20 && gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Walk of Fate");

}
if (gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Walk of Fate (Done)");

}
if (gg.HaveMemo(talker, 112) == 1 && myself.GetOneTimeQuestFlag(talker, 112) == 0 && gg.GetMemoState(talker, 112) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Walk of Fate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 272) == 0) {
myself.SetCurrentQuestID(272);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "seer_livina_q0272_00.htm", 272);

} else if (talker.level < 5) {
myself.ShowQuestPage(talker, "seer_livina_q0272_01.htm", 272);

} else {
myself.FHTML_SetFileName(fhtml0, "seer_livina_q0272_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 272);
myself.ShowQuestFHTML(talker, fhtml0, 272);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 272)) {
myself.SetCurrentQuestID(272);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1474) < 50) {
myself.ShowPage(talker, "seer_livina_q0272_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_livina_q0272_05.htm");
myself.RemoveMemo(talker, 272);
gg.AddLog(2, talker, 272);
gg.AddLog(3, talker, 272);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, 1500);
myself.DeleteItem1(talker, 1474, gg.OwnItemCount(talker, 1474));

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level >= 20 && gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 0) {
myself.SetCurrentQuestID(112);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "seer_livina_q0112_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 112);
myself.ShowQuestFHTML(talker, fhtml0, 112);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level < 20 && gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 0) {
myself.SetCurrentQuestID(112);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "seer_livina_q0112_0103.htm", 112);

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 112) == 0 && myself.GetOneTimeQuestFlag(talker, 112) == 1) {
myself.SetCurrentQuestID(112);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 112) == 1 && myself.GetOneTimeQuestFlag(talker, 112) == 0 && gg.GetMemoState(talker, 112) == 1 * 10 + 1) {
myself.SetCurrentQuestID(112);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_livina_q0112_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 272) {
myself.SetCurrentQuestID(272);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 272);
myself.ShowQuestMark(talker, 272);
gg.AddLog(1, talker, 272);
myself.SetFlagJournal(talker, 272, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "seer_livina_q0272_03.htm", 272);

}
return;

}
if (quest_id == 112) {
myself.SetCurrentQuestID(112);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.level >= 20 && myself.GetOneTimeQuestFlag(talker, 112) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 112);
myself.SetMemoState(talker, 112, 1 * 10 + 1);
gg.AddLog(1, talker, 112);
myself.SetFlagJournal(talker, 112, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "seer_livina_q0112_0104.htm", 112);
myself.ShowQuestMark(talker, 112);

}
return;

}
super;
	}


}