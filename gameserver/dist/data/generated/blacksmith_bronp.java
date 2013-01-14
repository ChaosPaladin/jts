package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_bronp extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1562)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1563) && gg.OwnItemCount(talker, 1564) + gg.OwnItemCount(talker, 1565) < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1563) && gg.OwnItemCount(talker, 1564) + gg.OwnItemCount(talker, 1565) >= 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1567)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1569) || gg.OwnItemCount(talker, 1570) || gg.OwnItemCount(talker, 1571)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1549) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1549)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2664) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Go Get the Calculator.");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 700) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 100) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 300) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Go Get the Calculator. (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1562)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0108_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1563) && gg.OwnItemCount(talker, 1564) + gg.OwnItemCount(talker, 1565) < 20) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0108_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1563) && gg.OwnItemCount(talker, 1564) + gg.OwnItemCount(talker, 1565) >= 20) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_bronp_q0108_04.htm");
myself.DeleteItem1(talker, 1563, 1);
myself.DeleteItem1(talker, 1564, gg.OwnItemCount(talker, 1564));
myself.DeleteItem1(talker, 1565, gg.OwnItemCount(talker, 1565));
myself.GiveItem1(talker, 1566, 1);
myself.SetFlagJournal(talker, 108, 7);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0108_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1567)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_bronp_q0108_06.htm");
myself.DeleteItem1(talker, 1567, 1);
myself.GiveItem1(talker, 1568, 1);
myself.SetFlagJournal(talker, 108, 9);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0108_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1569) || gg.OwnItemCount(talker, 1570) || gg.OwnItemCount(talker, 1571)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0108_08.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1549) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0005_01.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1549)) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0005_03.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_bronp_q0213_01.htm");
myself.DeleteItem1(talker, 2663, gg.OwnItemCount(talker, 2663));
myself.GiveItem1(talker, 2664, 1);
myself.SetFlagJournal(talker, 213, 13);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2664) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0213_02.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 0) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 12) {
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_01.htm", 347);

} else if (talker.level < 12) {
myself.ShowPage(talker, "blacksmith_bronp_q0347_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) >= 1) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4285, gg.OwnItemCount(talker, 4285));
myself.SetMemoState(talker, 347, 700);
myself.ShowPage(talker, "blacksmith_bronp_q0347_09.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 700) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0347_12.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 100) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0347_13.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 300) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0347_14.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.OwnItemCount(talker, 4285) == 0 && gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_bronp_q0347_15.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 347) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 347);
myself.SetMemoState(talker, 347, 100);
gg.AddLog(1, talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 347, 1);
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_08.htm", 347);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 108) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 108 && reply == 1 && gg.OwnItemCount(talker, 1562) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_bronp_q0108_02.htm");
myself.DeleteItem1(talker, 1562, 1);
myself.GiveItem1(talker, 1563, 1);
myself.SetFlagJournal(talker, 108, 5);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 5) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 5 && reply == 1) {
if (gg.OwnItemCount(talker, 1552) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_bronp_q0005_02.htm");
myself.DeleteItem1(talker, 1552, 1);
myself.GiveItem1(talker, 1549, 1);
if (gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 3) {
myself.SetFlagJournal(talker, 5, 2);
myself.ShowQuestMark(talker, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else {
myself.ShowPage(talker, "blacksmith_bronp_q0005_04.htm");

}

}
if (ask == 347) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 347) {
if (reply == 2) {
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_03.htm", 347);

}
if (reply == 3) {
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_04.htm", 347);

}
if (reply == 4) {
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_05.htm", 347);

}
if (reply == 5) {
myself.ShowQuestPage(talker, "blacksmith_bronp_q0347_06.htm", 347);

}
if (reply == 6) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_bronp_q0347_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 347);
myself.ShowQuestFHTML(talker, fhtml0, 347);

}
if (reply == 7) {
if (gg.GetMemoState(talker, 347) >= 700) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4393, 1);
myself.RemoveMemo(talker, 347);
gg.AddLog(2, talker, 347);
gg.AddLog(3, talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "blacksmith_bronp_q0347_10.htm");

}

}

}
if (reply == 8) {
if (gg.GetMemoState(talker, 347) >= 700) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 1500);
myself.RemoveMemo(talker, 347);
gg.AddLog(2, talker, 347);
gg.AddLog(3, talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "blacksmith_bronp_q0347_11.htm");

}

}

}

}
super;
	}


}