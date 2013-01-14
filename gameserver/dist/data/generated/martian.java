package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class martian extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2628) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 4 && gg.OwnItemCount(talker, 2629) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2629)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) >= 7) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 6) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4290) > 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 10000 / 1000 == 1 && gg.OwnItemCount(talker, 4293) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4293) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4399) > 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) < 3000 && gg.GetMemoState(talker, 503) >= 2000) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) > 3000) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2628) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 4 && gg.OwnItemCount(talker, 2629) == 0) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2629)) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_04.htm");
myself.DeleteItem1(talker, 2629, 1);
myself.SetMemoState(talker, 211, 5);
myself.SetFlagJournal(talker, 211, 6);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 5) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) >= 7) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 6) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0211_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4290) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 348, 1);
i0 = i0 + 1000;
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 50693, 158674, 376, 1);

} else {
myself.SetFlagJournal(talker, 348, 13);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.DeleteItem1(talker, 4290, 1);
myself.ShowPage(talker, "martian_q0348_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 10000 / 1000 == 1 && gg.OwnItemCount(talker, 4293) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 50693, 158674, 376, 1);

}
myself.ShowPage(talker, "martian_q0348_03.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4293) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 50693, 158674, 376, 1);

}
myself.ShowPage(talker, "martian_q0348_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4399) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0348_05.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0503_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 1000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0503_02.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) < 3000 && gg.GetMemoState(talker, 503) >= 2000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3839) < 10 || gg.OwnItemCount(talker, 3840) < 10 || gg.OwnItemCount(talker, 3842) < 10 || gg.OwnItemCount(talker, 3841) < 10) {
myself.ShowPage(talker, "martian_q0503_04.htm");

} else {
myself.DeleteItem1(talker, 3839, gg.OwnItemCount(talker, 3839));
myself.DeleteItem1(talker, 3840, gg.OwnItemCount(talker, 3840));
myself.DeleteItem1(talker, 3841, gg.OwnItemCount(talker, 3841));
myself.DeleteItem1(talker, 3842, gg.OwnItemCount(talker, 3842));
myself.SetMemoState(talker, 503, 3000);
myself.ShowPage(talker, "martian_q0503_05.htm");
myself.SetJournal(talker, 503, 3);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 3000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0503_07.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) > 3000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "martian_q0503_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 211) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 211) {
if (reply == 1 && gg.OwnItemCount(talker, 2628) > 0) {
myself.ShowPage(talker, "martian_q0211_02.htm");
myself.DeleteItem1(talker, 2628, 1);
myself.SetMemoState(talker, 211, 4);
myself.SetFlagJournal(talker, 211, 4);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
myself.ShowPage(talker, "martian_q0348_02.htm");

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
myself.DeleteItem1(talker, 3866, gg.OwnItemCount(talker, 3866));
myself.SetMemoState(talker, 503, 2000);
myself.ShowPage(talker, "martian_q0503_03.htm");
myself.SetJournal(talker, 503, 2);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}