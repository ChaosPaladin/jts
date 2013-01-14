package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class calculain extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam fhtml1, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 167) == 0 && myself.GetOneTimeQuestFlag(talker, 167) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dwarven Kinship");

}
if (gg.HaveMemo(talker, 167) == 0 && myself.GetOneTimeQuestFlag(talker, 167) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dwarven Kinship (Done)");

}
if (gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1076) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dwarven Kinship (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 0 && myself.GetOneTimeQuestFlag(talker, 167) == 0) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml1, "calculain_q0323_03.htm");
myself.FHTML_SetInt(fhtml1, "quest_id", 167);
myself.ShowQuestFHTML(talker, fhtml1, 167);

} else {
myself.ShowQuestPage(talker, "calculain_q0323_02.htm", 167);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 0 && myself.GetOneTimeQuestFlag(talker, 167) == 1) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1076) == 1) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "calculain_q0323_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 167) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "calculain_q0323_04.htm", 167);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1076, 1);
myself.SetMemo(talker, 167);
myself.ShowQuestMark(talker, 167);
myself.SetFlagJournal(talker, 167, 1);
gg.AddLog(1, talker, 167);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}