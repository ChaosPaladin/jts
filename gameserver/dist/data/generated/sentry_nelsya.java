package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentry_nelsya extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 165) == 0 && myself.GetOneTimeQuestFlag(talker, 165) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shilen's Hunt");

}
if (gg.HaveMemo(talker, 165) == 0 && myself.GetOneTimeQuestFlag(talker, 165) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shilen's Hunt (Done)");

}
if (gg.HaveMemo(talker, 165) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shilen's Hunt (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 165) == 0 && myself.GetOneTimeQuestFlag(talker, 165) == 0) {
myself.SetCurrentQuestID(165);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "sentry_nelsya_q0321_00.htm", 165);

} else if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "sentry_nelsya_q0321_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 165);
myself.ShowQuestFHTML(talker, fhtml0, 165);

} else {
myself.ShowQuestPage(talker, "sentry_nelsya_q0321_01.htm", 165);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 165) == 0 && myself.GetOneTimeQuestFlag(talker, 165) == 1) {
myself.SetCurrentQuestID(165);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 165) == 1) {
myself.SetCurrentQuestID(165);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1160) < 13) {
myself.ShowPage(talker, "sentry_nelsya_q0321_04.htm");

} else if (gg.OwnItemCount(talker, 1160) >= 13 && myself.GetOneTimeQuestFlag(talker, 165) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentry_nelsya_q0321_05.htm");
myself.DeleteItem1(talker, 1160, gg.OwnItemCount(talker, 1160));
myself.GiveItem1(talker, 1060, 5);
myself.IncrementParam(talker, 0, 1000);
myself.RemoveMemo(talker, 165);
gg.AddLog(2, talker, 165);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 165, 1);

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
if (quest_id == 165) {
myself.SetCurrentQuestID(165);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 165);
gg.AddLog(1, talker, 165);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentry_nelsya_q0321_03.htm", 165);
myself.SetFlagJournal(talker, 165, 1);

}
return;

}
super;
	}


}