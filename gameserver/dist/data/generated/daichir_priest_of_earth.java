package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class daichir_priest_of_earth extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 451) == 0 && talker.level >= 80 && gg.GetDailyQuestFlag(talker, 451) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Lucien's Altar");

}
if (gg.HaveMemo(talker, 451) == 0 && talker.level < 80) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Lucien's Altar");

}
if (gg.GetDailyQuestFlag(talker, 451) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Lucien's Altar (Done)");

}
if (gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 1 && gg.GetMemoStateEx(talker, 451, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Lucien's Altar (In progress)");

}
if (gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 1 && gg.GetMemoStateEx(talker, 451, 1) >= 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Lucien's Altar (In progress)");

}
if (gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Lucien's Altar (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 451) == 0 && talker.level >= 80 && gg.GetDailyQuestFlag(talker, 451) == 1) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "daichir_priest_of_earth_q0451_01.htm", 451);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 451) == 0 && talker.level < 80) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "daichir_priest_of_earth_q0451_02.htm", 451);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.GetDailyQuestFlag(talker, 451) == 0) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "daichir_priest_of_earth_q0451_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 1 && gg.GetMemoStateEx(talker, 451, 1) == 1) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "daichir_priest_of_earth_q0451_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 1 && gg.GetMemoStateEx(talker, 451, 1) >= 2) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "daichir_priest_of_earth_q0451_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 451) == 1 && gg.GetMemoState(talker, 451) == 2) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 14878, gg.OwnItemCount(talker, 14878));
myself.GiveItem1(talker, 57, 255380);
myself.RemoveMemo(talker, 451);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 451);
gg.AddLog(3, talker, 451);
gg.SetDailyQuestFlag(talker, 451);
myself.ShowPage(talker, "daichir_priest_of_earth_q0451_12.htm");

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
if (quest_id == 451) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 451) == 0 && talker.level >= 80 && gg.GetDailyQuestFlag(talker, 451) == 1) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 451);
myself.SetMemoState(talker, 451, 1);
myself.SetMemoStateEx(talker, 451, 1, 1);
myself.GiveItem1(talker, 14877, 5);
myself.ShowQuestPage(talker, "daichir_priest_of_earth_q0451_07.htm", 451);
myself.SetFlagJournal(talker, 451, 1);
myself.ShowQuestMark(talker, 451);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 451) {
myself.SetCurrentQuestID(451);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 451) {
if (reply == 1) {
if (gg.HaveMemo(talker, 451) == 0 && talker.level >= 80 && gg.GetDailyQuestFlag(talker, 451) == 1) {
myself.FHTML_SetFileName(fhtml0, "daichir_priest_of_earth_q0451_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 451);
myself.ShowQuestFHTML(talker, fhtml0, 451);

}

}

}
super;
	}


}