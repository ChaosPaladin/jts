package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class iason_haine extends citizen {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 351) == 1 && gg.GetMemoState(talker, 351) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Black Swan (In Progress)");

}
if (myself.IsMyLord(talker) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path to Becoming a Lord - Innadril (In progress)");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seven Signs, Seal of the Emperor");

}
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Seven Signs, Seal of the Emperor (Done)");

}
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Seven Signs, Seal of the Emperor (In progress)");

}
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Seven Signs, Seal of the Emperor (In progress)");

}
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) >= 3 && gg.GetMemoState(talker, 196) < 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Seven Signs, Seal of the Emperor (In progress)");

}
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 5) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Seven Signs, Seal of the Emperor (In progress)");

}
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 6) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Seven Signs, Seal of the Emperor (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1 && gg.OwnItemCount(talker, 14862) < 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 5) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 8 < 4) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 8 >= 4) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 1 && gg.GetMemoState(talker, 351) == 1) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0351_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0) {
myself.SetCurrentQuestID(711);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) <= 3) {
myself.ShowPage(talker, "iason_haine_q0711_02.htm");

} else if (gg.GetMemoState(c0, 711) == 4) {
i1 = gg.GetMemoStateEx(c0, 711, 1);
if (talker.dbid == i1) {
myself.ShowPage(talker, "iason_haine_q0711_03.htm");

} else {
myself.ShowPage(talker, "iason_haine_q0711_03a.htm");

}

} else if (gg.GetMemoState(c0, 711) % 100 >= 5 && gg.GetMemoState(c0, 711) % 100 < 15) {
myself.ShowPage(talker, "iason_haine_q0711_07.htm");

} else if (gg.GetMemoState(c0, 711) % 100 >= 15) {
if (gg.GetMemoState(c0, 711) / 1000 < 101) {
myself.ShowPage(talker, "iason_haine_q0711_08.htm");

} else {
myself.ShowPage(talker, "iason_haine_q0711_09.htm");

}

}

} else {
myself.ShowPage(talker, "iason_haine_q0711_01.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13823) >= 1) {
myself.ShowPage(talker, "iason_haine_q0195_01.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 79 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
myself.ShowQuestPage(talker, "iason_haine_q0196_01.htm", 196);

} else {
myself.ShowQuestPage(talker, "iason_haine_q0196_03.htm", 196);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 1) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 1) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0196_08.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 2) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 196, 3);
myself.ShowPage(talker, "iason_haine_q0196_12.htm");
myself.SetFlagJournal(talker, 196, 3);
myself.ShowQuestMark(talker, 196);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) >= 3 && gg.GetMemoState(talker, 196) < 5) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iason_haine_q0196_13.htm", 196);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 5) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0196_14.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 6) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0196_16a.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1 && gg.OwnItemCount(talker, 14862) < 1) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_03.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_02a.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_09.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_10.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 5) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0237_17.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 8 < 4) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4295) >= 6) {
myself.DeleteItem1(talker, 4295, 6);
i0 = gg.GetMemoStateEx(talker, 348, 1) + 4;
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.ShowPage(talker, "iason_haine_q0348_01.htm");

} else if (gg.OwnItemCount(talker, 4295) < 6) {
myself.ShowPage(talker, "iason_haine_q0348_03.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 8 >= 4) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iason_haine_q0348_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 196) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1 && talker.level >= 79) {
myself.SetMemoState(talker, 196, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestPage(talker, "iason_haine_q0196_07.htm", 196);
myself.SetFlagJournal(talker, 196, 1);
myself.ShowQuestMark(talker, 196);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 351) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 351) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4297) == 0) {
myself.ShowPage(talker, "iason_haine_q0351_02.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 4297) >= 10) {
myself.GiveItem1(talker, 57, 3880 + 20 * gg.OwnItemCount(talker, 4297));

} else {
myself.GiveItem1(talker, 57, 20 * gg.OwnItemCount(talker, 4297));

}
myself.DeleteItem1(talker, 4297, gg.OwnItemCount(talker, 4297));
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "iason_haine_q0351_03.htm");
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) % 100 >= 5 && gg.GetMemoState(c0, 711) % 100 < 15) {
i0 = gg.GetMemoState(c0, 711);
myself.SetMemoState(c0, 711, i0 + 1);

}

}

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 4298) == 0) {
myself.ShowPage(talker, "iason_haine_q0351_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4407, gg.OwnItemCount(talker, 4298));
myself.GiveItem1(talker, 57, 3880);
myself.DeleteItem1(talker, 4298, gg.OwnItemCount(talker, 4298));
gg.AddLog(3, talker, 351);
myself.ShowPage(talker, "iason_haine_q0351_05.htm");
myself.SetFlagJournal(talker, 351, 2);
myself.ShowQuestMark(talker, 351);
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) % 100 >= 5 && gg.GetMemoState(c0, 711) % 100 < 15) {
i0 = gg.GetMemoState(c0, 711);
myself.SetMemoState(c0, 711, i0 + 1);

}

}

}

}
if (reply == 3) {
myself.ShowPage(talker, "iason_haine_q0351_06.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 4298) == 0 && gg.OwnItemCount(talker, 4297) == 0) {
myself.ShowPage(talker, "iason_haine_q0351_07.htm");

} else {
myself.ShowPage(talker, "iason_haine_q0351_08.htm");

}

}
if (reply == 5) {
myself.ShowPage(talker, "iason_haine_q0351_09.htm");
if (gg.OwnItemCount(talker, 4296) > 0) {
myself.DeleteItem1(talker, 4296, 1);

}
myself.RemoveMemo(talker, 351);
gg.AddLog(2, talker, 351);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
if (ask == 711) {
myself.SetCurrentQuestID(711);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 711) {
if (reply == 1) {
myself.ShowPage(talker, "iason_haine_q0711_04.htm");

}
if (reply == 2) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) == 4) {
myself.SetMemoState(c0, 711, 5);
myself.ShowPage(talker, "iason_haine_q0711_05.htm");
myself.SetFlagJournal(c0, 711, 4);
myself.ShowQuestMark(c0, 711);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "iason_haine_q0711_06.htm");

}

}

}
if (ask == 195) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 195) {
if (reply == 1) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
if (gg.OwnItemCount(talker, 13823) >= 1) {
myself.ShowPage(talker, "iason_haine_q0195_02.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
if (gg.OwnItemCount(talker, 13823) >= 1 && talker.level >= 79) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 52518015);
myself.IncrementParam(talker, 1, 5817677);
myself.DeleteItem1(talker, 13823, 1);
myself.RemoveMemo(talker, 195);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 195);
gg.AddLog(3, talker, 195);
myself.ShowPage(talker, "iason_haine_q0195_03.htm");
myself.SetOneTimeQuestFlag(talker, 195, 1);

}

} else if (gg.OwnItemCount(talker, 13823) >= 1 && talker.level < 79) {
myself.ShowPage(talker, "level_check_q0192_01.htm");

}

}

}

}
if (ask == 196) {
myself.SetCurrentQuestID(196);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 196) {
if (reply == 1) {
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
if (talker.level >= 79) {
myself.ShowQuestPage(talker, "iason_haine_q0196_04.htm", 196);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
if (talker.level >= 79) {
myself.ShowQuestPage(talker, "iason_haine_q0196_05.htm", 196);

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 196) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
if (talker.level >= 79) {
myself.FHTML_SetFileName(fhtml0, "iason_haine_q0196_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 196);
myself.ShowQuestFHTML(talker, fhtml0, 196);

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 1) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "iason_haine_q0196_09.htm");
myself.CreateOnePrivateEx(1032584, "ssq_mammon", 0, 0, 109743, 219975, -3512, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else {
myself.ShowPage(talker, "iason_haine_q0196_11.htm");

}

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 5) {
myself.ShowPage(talker, "iason_haine_q0196_15.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 196) == 1 && gg.GetMemoState(talker, 196) == 5) {
myself.ShowPage(talker, "iason_haine_q0196_16.htm");
myself.SetMemoState(talker, 196, 6);
myself.SetFlagJournal(talker, 196, 6);
myself.ShowQuestMark(talker, 196);

}

}

}
if (ask == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 237) {
if (reply == 6) {
myself.DeleteItem1(talker, 14862, gg.OwnItemCount(talker, 14862));
myself.SetMemoState(talker, 237, 2);
myself.ShowPage(talker, "iason_haine_q0237_02.htm");

}
if (reply == 1) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.ShowPage(talker, "iason_haine_q0237_04.htm");

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.ShowPage(talker, "iason_haine_q0237_05.htm");

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.ShowPage(talker, "iason_haine_q0237_06.htm");

}

}
if (reply == 13) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.ShowPage(talker, "iason_haine_q0237_07.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 2) {
myself.SetMemoState(talker, 237, 3);
myself.ShowPage(talker, "iason_haine_q0237_08.htm");
myself.SetFlagJournal(talker, 237, 2);
myself.ShowQuestMark(talker, 237);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 237) {
if (reply == 3) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.ShowPage(talker, "iason_haine_q0237_11.htm");

}

}
if (reply == 31) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.ShowPage(talker, "iason_haine_q0237_12.htm");

}

}
if (reply == 41) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.ShowPage(talker, "iason_haine_q0237_13.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.ShowPage(talker, "iason_haine_q0237_14.htm");

}

}
if (reply == 32) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.GiveItem1(talker, 14863, 1);
myself.SetMemoState(talker, 237, 6);
myself.ShowPage(talker, "iason_haine_q0237_15.htm");
myself.SetFlagJournal(talker, 237, 5);
myself.ShowQuestMark(talker, 237);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 42) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 5) {
myself.GiveItem1(talker, 14864, 1);
myself.SetMemoState(talker, 237, 7);
myself.ShowPage(talker, "iason_haine_q0237_16.htm");
myself.SetFlagJournal(talker, 237, 6);
myself.ShowQuestMark(talker, 237);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}