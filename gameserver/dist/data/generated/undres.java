package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class undres extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam fhtml1, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 166) == 0 && myself.GetOneTimeQuestFlag(talker, 166) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mass of Darkness");

}
if (gg.HaveMemo(talker, 166) == 0 && myself.GetOneTimeQuestFlag(talker, 166) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mass of Darkness (Done)");

}
if (gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1091) < 1 || gg.OwnItemCount(talker, 1090) < 1 || gg.OwnItemCount(talker, 1089) < 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Mass of Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1089) == 1 && gg.OwnItemCount(talker, 1090) == 1 && gg.OwnItemCount(talker, 1091) == 1 && myself.GetOneTimeQuestFlag(talker, 166) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Mass of Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) < 1 && gg.OwnItemCount(talker, 3461) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) >= 1 && gg.OwnItemCount(talker, 3461) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3461) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Hunt of the Black Lion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 0 && myself.GetOneTimeQuestFlag(talker, 166) == 0) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "undres_q0322_00.htm", 166);

} else if (talker.level >= 2) {
myself.FHTML_SetFileName(fhtml1, "undres_q0322_03.htm");
myself.FHTML_SetInt(fhtml1, "quest_id", 166);
myself.ShowQuestFHTML(talker, fhtml1, 166);

} else {
myself.ShowQuestPage(talker, "undres_q0322_02.htm", 166);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 0 && myself.GetOneTimeQuestFlag(talker, 166) == 1) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1091) < 1 || gg.OwnItemCount(talker, 1090) < 1 || gg.OwnItemCount(talker, 1089) < 1) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "undres_q0322_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1089) == 1 && gg.OwnItemCount(talker, 1090) == 1 && gg.OwnItemCount(talker, 1091) == 1 && myself.GetOneTimeQuestFlag(talker, 166) == 0) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "undres_q0322_06.htm");
myself.DeleteItem1(talker, 1089, 1);
myself.DeleteItem1(talker, 1090, 1);
myself.DeleteItem1(talker, 1091, 1);
myself.DeleteItem1(talker, 1088, 1);
myself.IncrementParam(talker, 0, 5672);
myself.IncrementParam(talker, 1, 446);
myself.GiveItem1(talker, 57, 2966);
myself.RemoveMemo(talker, 166);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
gg.AddLog(2, talker, 166);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 166, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) < 1 && gg.OwnItemCount(talker, 3461) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "undres_q0333_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) >= 1 && gg.OwnItemCount(talker, 3461) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "undres_q0333_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3461) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "undres_q0333_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 166) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "undres_q0322_04.htm", 166);
myself.GiveItem1(talker, 1088, 1);
myself.SetMemo(talker, 166);
myself.ShowQuestMark(talker, 166);
gg.AddLog(1, talker, 166);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 166, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 333) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3461) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 30000);
myself.DeleteItem1(talker, 3461, 1);
myself.ShowPage(talker, "undres_q0333_04.htm");
gg.AddLog(3, talker, 333);

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "undres_q0333_05.htm");

}

}
super;
	}


}