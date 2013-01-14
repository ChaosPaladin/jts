package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class highpriest_orven extends master_lv3_hec {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3857) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3857) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21110 || gg.GetMemoState(talker, 337) == 21101 || gg.GetMemoState(talker, 337) == 21100 || gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 30000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4273) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 359) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "For a Sleepless Deadman");

}
if (gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 1 && gg.OwnItemCount(talker, 5869) < 60) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "For a Sleepless Deadman (In Progress)");

}
if (gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 1 && gg.OwnItemCount(talker, 5869) >= 60) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "For a Sleepless Deadman (In Progress)");

}
if (gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "For a Sleepless Deadman (In Progress)");

}
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) == 1 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path to Becoming a Lord - Aden (In progress)");

}
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 2 && gg.GetMemoState(talker, 713) / 100 < 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path to Becoming a Lord - Aden (In progress)");

}
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 12 && gg.GetMemoState(talker, 713) / 100 < 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Path to Becoming a Lord - Aden (In progress)");

}
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 2 && gg.GetMemoState(talker, 713) / 100 >= 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Path to Becoming a Lord - Aden (In progress)");

}
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 12 && gg.GetMemoState(talker, 713) / 100 >= 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Path to Becoming a Lord - Aden (In progress)");

}
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Seven Signs, the Sacred Book of Seal (In progress)");

}
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) >= 2) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Seven Signs, the Sacred Book of Seal (In progress)");

}
if (gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Journey to Gracia");

}
if (gg.HaveMemo(talker, 10267) == 0 && talker.level < 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Journey to Gracia");

}
if (myself.GetOneTimeQuestFlag(talker, 10267) == 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Journey to Gracia (Done)");

}
if (gg.HaveMemo(talker, 10267) == 1 && gg.GetMemoState(talker, 10267) == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Journey to Gracia (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3857) == 0) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0337_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3857) == 1) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3864, 1);
myself.DeleteItem1(talker, 3857, gg.OwnItemCount(talker, 3857));
if (gg.GetMemoState(talker, 337) + 100 == 21111) {
myself.SetMemoState(talker, 337, 30000);

} else {
myself.SetMemoState(talker, 337, gg.GetMemoState(talker, 337) + 100);

}
myself.ShowPage(talker, "highpriest_orven_q0337_02.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21110 || gg.GetMemoState(talker, 337) == 21101 || gg.GetMemoState(talker, 337) == 21100 || gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0337_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 30000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0337_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4273) >= 1) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 49) {
myself.GiveItem1(talker, 1875, 19);

} else if (i0 <= 69) {
myself.GiveItem1(talker, 952, 5);

} else {
myself.GiveItem1(talker, 2437, 1);

}
myself.DeleteItem1(talker, 4273, gg.OwnItemCount(talker, 4273));
myself.SetMemoState(talker, 344, 8);
myself.ShowPage(talker, "highpriest_orven_q0344_01.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 8) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0344_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 359) == 0) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 60) {
myself.ShowPage(talker, "highpriest_orven_q0359_01.htm");

} else if (talker.level >= 60) {
myself.ShowQuestPage(talker, "highpriest_orven_q0359_02.htm", 359);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 1 && gg.OwnItemCount(talker, 5869) < 60) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0359_07.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 1 && gg.OwnItemCount(talker, 5869) >= 60) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 5869, gg.OwnItemCount(talker, 5869));
myself.SetMemoState(talker, 359, 2);
myself.SetFlagJournal(talker, 359, 3);
myself.ShowQuestMark(talker, 359);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "highpriest_orven_q0359_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 359) == 1 && gg.GetMemoState(talker, 359) == 2) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0359_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) == 1 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0713_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 2 && gg.GetMemoState(talker, 713) / 100 < 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0713_04.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 12 && gg.GetMemoState(talker, 713) / 100 < 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0713_05.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 2 && gg.GetMemoState(talker, 713) / 100 >= 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0713_06.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) % 100 == 12 && gg.GetMemoState(talker, 713) / 100 >= 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 713, 1000);
myself.ShowPage(talker, "highpriest_orven_q0713_07.htm");
myself.SetFlagJournal(talker, 713, 7);
myself.ShowQuestMark(talker, 713);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 1) {
myself.SetCurrentQuestID(197);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0197_01.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) >= 2) {
myself.SetCurrentQuestID(197);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q0197_05.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "highpriest_orven_q10267_01.htm", 10267);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10267) == 0 && talker.level < 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "highpriest_orven_q10267_02.htm", 10267);

}
break;

}
case 19: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 10267) == 1) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q10267_03.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10267) == 1 && gg.GetMemoState(talker, 10267) == 1) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriest_orven_q10267_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 359) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 359);
myself.SetMemoState(talker, 359, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "highpriest_orven_q0359_06.htm", 359);
myself.SetFlagJournal(talker, 359, 1);
gg.AddLog(1, talker, 359);

}
return;

}
if (quest_id == 10267) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.SetMemo(talker, 10267);
myself.GiveItem1(talker, 13810, 1);
myself.SetMemoState(talker, 10267, 1);
myself.ShowQuestPage(talker, "highpriest_orven_q10267_08.htm", 10267);
myself.SetFlagJournal(talker, 10267, 1);
myself.ShowQuestMark(talker, 10267);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 10267);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {

}
if (ask == 359) {
myself.SetCurrentQuestID(359);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 359) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "highpriest_orven_q0359_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 359);
myself.ShowQuestFHTML(talker, fhtml0, 359);

}
if (reply == 2 && gg.GetMemoState(talker, 359) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(8);
switch (i0) {
case 0: {
myself.GiveItem1(talker, 6341, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 1: {
myself.GiveItem1(talker, 6343, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 2: {
myself.GiveItem1(talker, 6345, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 3: {
myself.GiveItem1(talker, 6342, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 4: {
myself.GiveItem1(talker, 6344, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 5: {
myself.GiveItem1(talker, 6346, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 6: {
myself.GiveItem1(talker, 5494, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}
case 7: {
myself.GiveItem1(talker, 5495, 4);
myself.ShowPage(talker, "highpriest_orven_q0359_10.htm");
break;

}

}
myself.RemoveMemo(talker, 359);
gg.AddLog(2, talker, 359);
gg.AddLog(3, talker, 359);
myself.SoundEffect(talker, "ItemSound.quest_finish");
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 713) == 1 && gg.GetMemoState(c0, 713) % 100 == 2 || gg.GetMemoState(c0, 713) % 100 == 12 && gg.GetMemoState(c0, 713) / 100 < 5) {
i1 = gg.GetMemoState(c0, 713);
if (i1 / 100 >= 4) {
if (i1 % 100 == 2) {
myself.SetFlagJournal(c0, 713, 4);

} else if (i1 % 100 == 12) {
myself.SetFlagJournal(c0, 713, 6);

}

}
myself.SetMemoState(c0, 713, i1 + 100);
myself.ShowQuestMark(c0, 713);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

}

}

}

}
if (ask == 713) {
myself.SetCurrentQuestID(713);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 713) {
if (reply == 1) {
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) == 1 && myself.IsMyLord(talker) == 1) {
myself.ShowPage(talker, "highpriest_orven_q0713_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 713) == 1 && gg.GetMemoState(talker, 713) == 1 && myself.IsMyLord(talker) == 1) {
myself.SetMemoState(talker, 713, 2);
myself.ShowPage(talker, "highpriest_orven_q0713_03.htm");
myself.SetFlagJournal(talker, 713, 2);
myself.ShowQuestMark(talker, 713);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 197) {
myself.SetCurrentQuestID(197);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 197) {
if (reply == 1) {
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 1) {
myself.ShowPage(talker, "highpriest_orven_q0197_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 1) {
myself.ShowPage(talker, "highpriest_orven_q0197_03.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 197) == 1 && gg.GetMemoState(talker, 197) == 1) {
myself.SetMemoState(talker, 197, 2);
myself.ShowPage(talker, "highpriest_orven_q0197_04.htm");
myself.SetFlagJournal(talker, 197, 2);
myself.ShowQuestMark(talker, 197);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 10267) {
myself.SetCurrentQuestID(10267);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10267) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.ShowQuestPage(talker, "highpriest_orven_q10267_04.htm", 10267);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.FHTML_SetFileName(fhtml0, "highpriest_orven_q10267_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10267);
myself.ShowQuestFHTML(talker, fhtml0, 10267);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 10267) == 0 && talker.level >= 75 && myself.GetOneTimeQuestFlag(talker, 10267) == 0) {
myself.ShowQuestPage(talker, "highpriest_orven_q10267_07.htm", 10267);

}

}

}
super;
	}


}