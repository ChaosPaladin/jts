package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rylith extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 156) == 0 && myself.GetOneTimeQuestFlag(talker, 156) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Millennium Love");

}
if (gg.HaveMemo(talker, 156) == 0 && myself.GetOneTimeQuestFlag(talker, 156) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Millennium Love (Done)");

}
if (gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1022) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Millennium Love (In Progress)");

}
if (gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1023) > 0 && myself.GetOneTimeQuestFlag(talker, 156) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Millennium Love (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3428) >= 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) >= 1 && gg.OwnItemCount(talker, 3428) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) == 0 && myself.GetOneTimeQuestFlag(talker, 156) == 0) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "rylith_q0307_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 156);
myself.ShowQuestPage(talker, "rylith_q0307_02.htm", 156);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) == 0 && myself.GetOneTimeQuestFlag(talker, 156) == 1) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1022) != 0) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rylith_q0307_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1023) > 0 && myself.GetOneTimeQuestFlag(talker, 156) == 0) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1023, gg.OwnItemCount(talker, 1023));
myself.RemoveMemo(talker, 156);
gg.AddLog(2, talker, 156);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 156, 1);
myself.IncrementParam(talker, 0, 3000);
myself.GiveItem1(talker, 5250, 1);
myself.ShowPage(talker, "rylith_q0307_08.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3428) >= 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rylith_q0221_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) >= 1 && gg.OwnItemCount(talker, 3428) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rylith_q0221_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rylith_q0221_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 156) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level >= 15) {
myself.ShowQuestPage(talker, "rylith_q0307_06.htm", 156);
myself.GiveItem1(talker, 1022, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 156);
gg.AddLog(1, talker, 156);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 156, 1);

} else {
myself.ShowPage(talker, "rylith_q0307_05.htm");

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
myself.ShowPage(talker, "rylith_q0221_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3428) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "rylith_q0221_03.htm");
myself.DeleteItem1(talker, 3428, 1);
myself.GiveItem1(talker, 3244, 1);
if (gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3242) >= 1 && gg.OwnItemCount(talker, 3243) >= 1) {
myself.SetFlagJournal(talker, 221, 2);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}

}
super;
	}


}