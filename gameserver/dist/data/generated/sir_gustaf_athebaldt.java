package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_gustaf_athebaldt extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam pledge0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 6) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Seven Signs, Dying Message (In progress)");

}
if (gg.HaveMemo(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seven Signs, Mammon's Contract");

}
if (gg.HaveMemo(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seven Signs, Mammon's Contract (Done)");

}
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seven Signs, Mammon's Contract (In progress)");

}
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Seven Signs, Mammon's Contract (In progress)");

}
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Seven Signs, Mammon's Contract (In progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 2 == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 2 == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Pursuit of Clan Ambition!");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 2000) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 5000) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 6000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 6000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8000 && gg.GetMemoState(talker, 503) < 8700) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8700 && gg.GetMemoState(talker, 503) < 10000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 9000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 6) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0193_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 0) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 79 && myself.GetOneTimeQuestFlag(talker, 193) == 1) {
myself.FHTML_SetFileName(fhtml0, "sir_gustaf_athebaldt_q0194_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 194);
myself.ShowQuestFHTML(talker, fhtml0, 194);

} else {
myself.ShowQuestPage(talker, "sir_gustaf_athebaldt_q0194_03.htm", 194);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 194);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 1) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 2) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 3) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13818) >= 1) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_13.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 2 == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4295) >= 3) {
myself.DeleteItem1(talker, 4295, 3);
i0 = gg.GetMemoStateEx(talker, 348, 1) + 1;
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0348_01.htm");

} else if (gg.OwnItemCount(talker, 4295) < 3) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0348_03.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoStateEx(talker, 348, 0) == 18 && gg.GetMemoStateEx(talker, 348, 1) % 2 == 1) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0348_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level < 4) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_01.htm");

} else if (pledge0.skill_level >= 5) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_02.htm");

} else if (pledge0.skill_level == 4 && gg.OwnItemCount(talker, 3870) == 1) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_03.htm");

} else if (pledge0.skill_level == 4 && gg.OwnItemCount(talker, 3870) == 0) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_04.htm");

}

}

} else {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_04t.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 2000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_10.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_11.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_11t.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_13.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 5000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_14.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 6000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_15.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 6000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_15t.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_17.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8000 && gg.GetMemoState(talker, 503) < 8700) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_18.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 8700 && gg.GetMemoState(talker, 503) < 10000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_19.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 9000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_19t.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_24.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_24t.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 194) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 79 && gg.HaveMemo(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 1) {
myself.SetMemoState(talker, 194, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sir_gustaf_athebaldt_q0194_04.htm", 194);
myself.SetFlagJournal(talker, 194, 1);
myself.ShowQuestMark(talker, 194);
gg.AddLog(1, talker, quest_id);

}
return;

}
if (quest_id == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3866, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 503);
gg.AddLog(1, talker, 503);
myself.SetJournal(talker, 503, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_08.htm");
myself.SetMemoState(talker, 503, 1000);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 193) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (reply == 1) {
if (gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 6) {
if (talker.level >= 79) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0193_02.htm");
myself.IncrementParam(talker, 0, 52518015);
myself.IncrementParam(talker, 1, 5817677);
myself.RemoveMemo(talker, 193);
gg.AddLog(2, talker, 193);
gg.AddLog(3, talker, 193);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 193, 1);

}

} else if (talker.level < 79) {
myself.ShowPage(talker, "level_check_q0192_01.htm");

}

}

}
if (ask == 194) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 194) {
if (reply == 1) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 1) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_06.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 1) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_07.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 1) {
myself.SetMemoState(talker, 194, 2);
myself.SetFlagJournal(talker, 194, 2);
myself.ShowQuestMark(talker, 194);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.StartScenePlayer(talker, 10);

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 2) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_11.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 2) {
myself.GiveItem1(talker, 13818, 1);
myself.SetMemoState(talker, 194, 3);
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0194_12.htm");
myself.SetFlagJournal(talker, 194, 3);
myself.ShowQuestMark(talker, 194);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {
if (reply == 1) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_05.htm");

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "sir_gustaf_athebaldt_q0503_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 503);
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "sir_gustaf_athebaldt_q0503_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 503);
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3867, 1);
myself.SetMemoState(talker, 503, 4000);
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_12.htm");
myself.SetJournal(talker, 503, 4);
myself.ShowQuestMark(talker, 503);

}

}
if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3868, 1);
myself.SetMemoState(talker, 503, 7000);
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_16.htm");
myself.SetJournal(talker, 503, 7);
myself.ShowQuestMark(talker, 503);

}

}
if (reply == 6) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.OwnItemCount(talker, 3869) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3870, 1);
myself.DeleteItem1(talker, 3869, gg.OwnItemCount(talker, 3869));
myself.IncrementParam(talker, 1, 250000);
myself.RemoveMemo(talker, 503);
gg.AddLog(2, talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_20.htm");

}

}

}
if (reply == 7) {
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_21.htm");

}
if (reply == 8) {
myself.SetMemoState(talker, 503, 10000);
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_22.htm");
myself.SetJournal(talker, 503, 12);
myself.ShowQuestMark(talker, 503);

}
if (reply == 9) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.OwnItemCount(talker, 3869) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3870, 1);
myself.IncrementParam(talker, 1, 250000);
myself.DeleteItem1(talker, 3869, gg.OwnItemCount(talker, 3869));
myself.RemoveMemo(talker, 503);
gg.AddLog(2, talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sir_gustaf_athebaldt_q0503_23.htm");

}

}

}

}
super;
	}


}