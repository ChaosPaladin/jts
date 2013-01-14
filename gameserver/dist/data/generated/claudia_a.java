package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class claudia_a extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 372) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of Insolence (In Progress)");

}
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seven Signs, Mammon's Contract (In progress)");

}
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && talker.transformID != 113) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seven Signs, Secret Ritual of the Priests");

}
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seven Signs, Secret Ritual of the Priests (Done)");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4289) > 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 1 && gg.OwnItemCount(talker, 4292) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4292) > 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4397) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 1) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5972) < 1 || gg.OwnItemCount(talker, 5973) < 1 || gg.OwnItemCount(talker, 5974) < 1 || gg.OwnItemCount(talker, 5975) < 1 || gg.OwnItemCount(talker, 5976) < 1 || gg.OwnItemCount(talker, 5977) < 1 || gg.OwnItemCount(talker, 5978) < 1) {
myself.ShowPage(talker, "claudia_a_q0372_01.htm");

} else if (gg.OwnItemCount(talker, 5972) >= 1 && gg.OwnItemCount(talker, 5973) >= 1 && gg.OwnItemCount(talker, 5974) >= 1 && gg.OwnItemCount(talker, 5975) >= 1 && gg.OwnItemCount(talker, 5976) >= 1 && gg.OwnItemCount(talker, 5977) >= 1 && gg.OwnItemCount(talker, 5978) >= 1) {
myself.DeleteItem1(talker, 5972, 1);
myself.DeleteItem1(talker, 5973, 1);
myself.DeleteItem1(talker, 5974, 1);
myself.DeleteItem1(talker, 5975, 1);
myself.DeleteItem1(talker, 5976, 1);
myself.DeleteItem1(talker, 5977, 1);
myself.DeleteItem1(talker, 5978, 1);
gg.AddLog(3, talker, 372);
i1 = gg.Rand(100);
if (i1 < 31) {
myself.GiveItem1(talker, 5502, 1);

} else if (i1 < 62) {
myself.GiveItem1(talker, 5514, 1);

} else if (i1 < 75) {
myself.GiveItem1(talker, 5527, 1);

} else if (i1 < 83) {
myself.GiveItem1(talker, 5502, 1);
myself.GiveItem1(talker, 5514, 1);
myself.GiveItem1(talker, 5527, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 57, 4000);

}
myself.ShowPage(talker, "claudia_a_q0372_02.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 12) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "claudia_a_q0194_13.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && talker.transformID != 113) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetOneTimeQuestFlag(talker, 194) == 1 && talker.level >= 79) {
myself.ShowQuestPage(talker, "claudia_a_q0195_01.htm", 195);

} else {
myself.ShowQuestPage(talker, "claudia_a_q0195_03.htm", 195);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 1) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 1) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "claudia_a_q0195_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4289) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 348, 1);
i0 = i0 + 100;
if (i0 % 10 == 0) {
myself.ShowRadar(talker, 181472, 7158, -2725, 1);

} else {
myself.SetFlagJournal(talker, 348, 9);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.DeleteItem1(talker, 4289, 1);
myself.ShowPage(talker, "claudia_a_q0348_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 1 && gg.OwnItemCount(talker, 4292) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 181472, 7158, -2725, 1);

}
myself.ShowPage(talker, "claudia_a_q0348_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4292) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 181472, 7158, -2725, 1);

}
myself.ShowPage(talker, "claudia_a_q0348_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4397) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "claudia_a_q0348_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 195) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1 && talker.level >= 79 && talker.transformID != 113) {
myself.SetMemoState(talker, 195, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "claudia_a_q0195_07.htm", 195);
myself.SetFlagJournal(talker, 195, 1);
myself.ShowQuestMark(talker, 195);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 194) {
myself.SetCurrentQuestID(194);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 194) {
if (reply == 1) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 12) {
myself.ShowPage(talker, "claudia_a_q0194_10.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 194) == 1 && gg.GetMemoState(talker, 194) == 12) {
if (talker.level >= 79) {
myself.IncrementParam(talker, 0, 52518015);
myself.IncrementParam(talker, 1, 5817677);
myself.RemoveMemo(talker, 194);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 194);
gg.AddLog(3, talker, 194);
myself.ShowPage(talker, "claudia_a_q0194_11.htm");
myself.SetOneTimeQuestFlag(talker, 194, 1);

} else if (talker.level < 79) {
myself.ShowPage(talker, "level_check_q0192_01.htm");

}

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
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1) {
if (talker.level >= 79) {
myself.ShowQuestPage(talker, "claudia_a_q0195_04.htm", 195);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1) {
if (talker.level >= 79) {
myself.ShowQuestPage(talker, "claudia_a_q0195_05.htm", 195);

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 194) == 1) {
if (talker.level >= 79) {
myself.FHTML_SetFileName(fhtml0, "claudia_a_q0195_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 195);
myself.ShowQuestFHTML(talker, fhtml0, 195);

}

}

}

}
if (ask == 348) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 348) {
if (reply == 1) {
myself.ShowPage(talker, "claudia_a_q0348_02.htm");

}

}
super;
	}


}