package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class falsepriest_agripel extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 2 || gg.GetMemoStateEx(talker, 21, 1) == 4) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 6) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 6) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 6) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 20 && gg.OwnItemCount(talker, 7158) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 21) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 22) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 2 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Path to Becoming a Lord - Rune (In progress)");

}
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 3 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Path to Becoming a Lord - Rune (In progress)");

}
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Path to Becoming a Lord - Rune (In progress)");

}
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 2 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Path to Becoming a Lord - Rune (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7 && gg.OwnItemCount(talker, 7140) >= 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, gg.GetMemoState(talker, 21) + 1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 1);
myself.ShowPage(talker, "falsepriest_agripel_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 2 || gg.GetMemoStateEx(talker, 21, 1) == 4) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, gg.GetMemoState(talker, 21) + 1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 1);
myself.ShowPage(talker, "falsepriest_agripel_q0021_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0021_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 6) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, 10);
myself.ShowPage(talker, "falsepriest_agripel_q0021_03.htm");
myself.SetFlagJournal(talker, 21, 7);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 6) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0021_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0021_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 2) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 3) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_03.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 6) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_08a.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 20 && gg.OwnItemCount(talker, 7158) >= 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 21) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_10a.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 22) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_15.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_18.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0025_19.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 2 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0716_01.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 3 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0716_04.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0716_05.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 2 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_agripel_q0716_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 4) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 2) {
myself.DeleteItem1(talker, 7156, gg.OwnItemCount(talker, 7156));
myself.SetMemoState(talker, 25, 3);
myself.ShowPage(talker, "falsepriest_agripel_q0025_02.htm");

}

}
if (reply == 5) {
myself.ShowPage(talker, "falsepriest_agripel_q0025_07.htm");

}
if (reply == 6) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7157, 1);
myself.SetMemoState(talker, 25, 6);
myself.ShowPage(talker, "falsepriest_agripel_q0025_08.htm");
myself.SetFlagJournal(talker, 25, 5);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 25) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 20 && gg.OwnItemCount(talker, 7158) >= 1) {
myself.DeleteItem1(talker, 7158, gg.OwnItemCount(talker, 7158));
myself.SetMemoState(talker, 25, 21);
myself.ShowPage(talker, "falsepriest_agripel_q0025_10.htm");

}

}
if (reply == 20) {
myself.ShowPage(talker, "falsepriest_agripel_q0025_12.htm");

}
if (reply == 21) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 21) {
myself.SetMemoState(talker, 25, 22);
myself.ShowPage(talker, "falsepriest_agripel_q0025_13.htm");

}

}
if (reply == 22) {
myself.ShowPage(talker, "falsepriest_agripel_q0025_14.htm");

}
if (reply == 23) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 22) {
myself.SetMemoState(talker, 25, 23);
myself.ShowPage(talker, "falsepriest_agripel_q0025_16.htm");
myself.SetFlagJournal(talker, 25, 17);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 24) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 22) {
myself.SetMemoState(talker, 25, 24);
myself.ShowPage(talker, "falsepriest_agripel_q0025_17.htm");
myself.SetFlagJournal(talker, 25, 18);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 716) {
myself.SetCurrentQuestID(716);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 716) {
if (reply == 1) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 2) {
myself.ShowPage(talker, "falsepriest_agripel_q0716_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) == 2) {
myself.ShowPage(talker, "falsepriest_agripel_q0716_03.htm");
myself.SetMemoState(talker, 716, 3);
myself.SetFlagJournal(talker, 716, 3);
myself.ShowQuestMark(talker, 716);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1) {
if (gg.GetMemoStateEx(talker, 716, 1) >= 100) {
myself.ShowPage(talker, "falsepriest_agripel_q0716_07.htm");

} else {
myself.ShowPage(talker, "falsepriest_agripel_q0716_06.htm");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1 && gg.GetMemoStateEx(talker, 716, 1) < 100) {
myself.ShowPage(talker, "falsepriest_agripel_q0716_08.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1 && gg.GetMemoStateEx(talker, 716, 1) >= 100) {
myself.ShowPage(talker, "falsepriest_agripel_q0716_09.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 716) == 1 && gg.GetMemoState(talker, 716) / 10 == 1 && gg.GetMemoStateEx(talker, 716, 1) >= 100) {
i0 = gg.GetMemoState(talker, 716);
myself.SetMemoState(talker, 716, i0 + 10);
myself.ShowPage(talker, "falsepriest_agripel_q0716_10.htm");
myself.SetFlagJournal(talker, 716, 8);
myself.ShowQuestMark(talker, 716);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}