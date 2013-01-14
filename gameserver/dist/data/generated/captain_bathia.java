package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class captain_bathia extends inzone_raid_controller {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1168) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1162) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1168) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1162) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 39) == 1 && myself.GetOneTimeQuestFlag(talker, 39) == 0 && gg.GetMemoState(talker, 39) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Red-eyed Invaders (In Progress)");

}
if (gg.HaveMemo(talker, 39) == 1 && gg.GetMemoState(talker, 39) <= 2 * 10 + 2 && gg.GetMemoState(talker, 39) >= 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Red-eyed Invaders (In Progress)");

}
if (gg.HaveMemo(talker, 39) == 1 && gg.GetMemoState(talker, 39) <= 3 * 10 + 2 && gg.GetMemoState(talker, 39) >= 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Red-eyed Invaders (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 4) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) < 4) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 5) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 6) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) > 6) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path to Becoming a Lord - Gludio (In progress)");

}
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Path to Becoming a Lord - Gludio (In progress)");

}
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 3) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Path to Becoming a Lord - Gludio (In progress)");

}
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 4) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Path to Becoming a Lord - Gludio (In progress)");

}
if (gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Mutated Kaneus - Gludio");

}
if (gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Mutated Kaneus - Gludio (Done)");

}
if (gg.HaveMemo(talker, 10276) == 1 && gg.GetMemoState(talker, 10276) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Mutated Kaneus - Gludio (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1168) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1162) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0402_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1168) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1169) < 10) {
myself.ShowPage(talker, "captain_bathia_q0402_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bathia_q0402_04.htm");
myself.DeleteItem1(talker, 1169, gg.OwnItemCount(talker, 1169));
myself.DeleteItem1(talker, 1168, 1);
myself.GiveItem1(talker, 1162, 1);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1162) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0402_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 39) == 1 && myself.GetOneTimeQuestFlag(talker, 39) == 0 && gg.GetMemoState(talker, 39) == 1 * 10 + 1) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 39, 1);
myself.ShowPage(talker, "captain_bathia_q0039_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 39) == 1 && gg.GetMemoState(talker, 39) <= 2 * 10 + 2 && gg.GetMemoState(talker, 39) >= 2 * 10 + 1) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 39) == 2 * 10 + 2 && gg.OwnItemCount(talker, 7178) >= 100 && gg.OwnItemCount(talker, 7179) >= 100) {
myself.SetHTMLCookie(talker, 39, 2);
myself.ShowPage(talker, "captain_bathia_q0039_0202.htm");

} else {
myself.ShowPage(talker, "captain_bathia_q0039_0203.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 39) == 1 && gg.GetMemoState(talker, 39) <= 3 * 10 + 2 && gg.GetMemoState(talker, 39) >= 3 * 10 + 1) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 39) == 3 * 10 + 2 && gg.OwnItemCount(talker, 7180) >= 30 && gg.OwnItemCount(talker, 7181) >= 30) {
myself.SetHTMLCookie(talker, 39, 3);
myself.ShowPage(talker, "captain_bathia_q0039_0303.htm");

} else {
myself.ShowPage(talker, "captain_bathia_q0039_0304.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 4) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0063_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) < 4) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0063_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 5) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0063_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 6) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0063_07.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) > 6) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0063_08.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 1) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0708_01.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 2) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0708_03.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 3) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0708_04.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 4) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q0708_06.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 18) {
myself.ShowQuestPage(talker, "captain_bathia_q10276_01.htm", 10276);

} else {
myself.ShowQuestPage(talker, "captain_bathia_q10276_04.htm", 10276);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 1) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bathia_q10276_02.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10276) == 1 && gg.GetMemoState(talker, 10276) == 1) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13830) >= 1 && gg.OwnItemCount(talker, 13831) >= 1) {
myself.ShowPage(talker, "captain_bathia_q10276_07.htm");

} else {
myself.ShowPage(talker, "captain_bathia_q10276_06.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10276) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 10276) == 0 && talker.level >= 18 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
myself.SetMemoState(talker, 10276, 1);
myself.SetMemo(talker, 10276);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "captain_bathia_q10276_05.htm", 10276);
myself.SetFlagJournal(talker, 10276, 1);
myself.ShowQuestMark(talker, 10276);
gg.AddLog(1, talker, 10276);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply = 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bathia_q0402_02.htm");
myself.GiveItem1(talker, 1168, 1);

}

}

}
if (ask == 39) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 39) {
i0 = myself.GetHTMLCookie(talker, 39, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 39) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bathia_q0039_0201.htm");
myself.SetMemoState(talker, 39, 2 * 10 + 1);
myself.SetFlagJournal(talker, 39, 2);
myself.ShowQuestMark(talker, 39);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 39) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 39) {
i0 = myself.GetHTMLCookie(talker, 39, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 39) == 1) {
if (gg.OwnItemCount(talker, 7178) >= 100 && gg.OwnItemCount(talker, 7179) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7178, 100);
myself.DeleteItem1(talker, 7179, 100);
myself.ShowPage(talker, "captain_bathia_q0039_0301.htm");
myself.SetMemoState(talker, 39, 3 * 10 + 1);
myself.SetFlagJournal(talker, 39, 4);
myself.ShowQuestMark(talker, 39);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "captain_bathia_q0039_0302.htm");

}

}

}

}
if (ask == 39) {
myself.SetCurrentQuestID(39);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 39 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
i0 = myself.GetHTMLCookie(talker, 39, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 39) == 1 && myself.GetOneTimeQuestFlag(talker, 39) == 0) {
if (gg.OwnItemCount(talker, 7180) >= 30 && gg.OwnItemCount(talker, 7181) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7180, gg.OwnItemCount(talker, 7180));
myself.DeleteItem1(talker, 7181, gg.OwnItemCount(talker, 7181));
myself.GiveItem1(talker, 6529, 1);
myself.GiveItem1(talker, 6535, 500);
myself.GiveItem1(talker, 6521, 60);
myself.IncrementParam(talker, 0, 62366);
myself.IncrementParam(talker, 1, 2783);

}
gg.AddLog(2, talker, 39);
myself.RemoveMemo(talker, 39);
myself.SetOneTimeQuestFlag(talker, 39, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "captain_bathia_q0039_0401.htm");

} else {
myself.ShowPage(talker, "captain_bathia_q0039_0402.htm");

}

}

}

}
if (ask == 63) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 63) {
if (reply == 1) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 4) {
myself.GiveItem1(talker, 9766, 1);
myself.DeleteItem1(talker, 9765, gg.OwnItemCount(talker, 9765));
myself.SetMemoState(talker, 63, 5);
myself.ShowPage(talker, "captain_bathia_q0063_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 5) {
myself.ShowPage(talker, "captain_bathia_q0063_05.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 5) {
myself.SetMemoState(talker, 63, 6);
myself.ShowPage(talker, "captain_bathia_q0063_06.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 63, 6);
myself.ShowQuestMark(talker, 63);

}

}

}
if (ask == 708) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 708) {
if (reply == 1) {
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 1) {
i0 = gg.GetMemoState(talker, 708);
myself.SetMemoState(talker, 708, i0 + 10);
myself.ShowPage(talker, "captain_bathia_q0708_02.htm");
myself.SetFlagJournal(talker, 708, 6);
myself.ShowQuestMark(talker, 708);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 708) == 1 && gg.GetMemoState(talker, 708) / 10 == 3) {
if (gg.GetMemoState(talker, 708) % 10 == 9) {
myself.DeleteItem1(talker, 13848, gg.OwnItemCount(talker, 13848));
i0 = gg.GetMemoState(talker, 708);
myself.SetMemoState(talker, 708, i0 + 10);
myself.ShowPage(talker, "captain_bathia_q0708_05.htm");
myself.SetFlagJournal(talker, 708, 9);
myself.ShowQuestMark(talker, 708);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.DeleteItem1(talker, 13848, gg.OwnItemCount(talker, 13848));
i0 = gg.GetMemoState(talker, 708);
myself.SetMemoState(talker, 708, i0 + 10);
myself.ShowPage(talker, "captain_bathia_q0708_05.htm");
myself.SetFlagJournal(talker, 708, 8);
myself.ShowQuestMark(talker, 708);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.Say(gg.MakeFString(70854, "", "", "", "", ""));

}

}

}
if (ask == 10276) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10276) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
if (talker.level >= 18) {
myself.FHTML_SetFileName(fhtml0, "captain_bathia_q10276_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10276);
myself.ShowQuestFHTML(talker, fhtml0, 10276);

}

}

}

}
super;
	}


}