package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class abel extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 155) == 0 && myself.GetOneTimeQuestFlag(talker, 155) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Find Sir Windawood");

}
if (gg.HaveMemo(talker, 155) == 0 && myself.GetOneTimeQuestFlag(talker, 155) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Find Sir Windawood (Done)");

}
if (gg.HaveMemo(talker, 155) == 1 && gg.OwnItemCount(talker, 1019) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Find Sir Windawood (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 155) == 0 && myself.GetOneTimeQuestFlag(talker, 155) == 0) {
myself.SetCurrentQuestID(155);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "abel_q0305_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 155);
myself.ShowQuestFHTML(talker, fhtml0, 155);

} else {
myself.ShowQuestPage(talker, "abel_q0305_02.htm", 155);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 155) == 0 && myself.GetOneTimeQuestFlag(talker, 155) == 1) {
myself.SetCurrentQuestID(155);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 155) == 1 && gg.OwnItemCount(talker, 1019) == 1) {
myself.SetCurrentQuestID(155);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "abel_q0305_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 155) {
myself.SetCurrentQuestID(155);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 155);
gg.AddLog(1, talker, 155);
myself.GiveItem1(talker, 1019, 1);
myself.ShowQuestPage(talker, "abel_q0305_04.htm", 155);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 155, 1);

}
return;

}
super;
	}


}