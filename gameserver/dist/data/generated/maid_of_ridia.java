package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maid_of_ridia extends citizen {
	protected void TALKED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_08.htm");
myself.SoundEffect(talker, "SkillSound5.horror_01");

}
break;

}

}
return;

}
super;
	}

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 5) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 6 && gg.OwnItemCount(talker, 7065) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 8) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 9) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 10) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 11) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 9 && gg.OwnItemCount(talker, 7066) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 12 && gg.OwnItemCount(talker, 7155) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 13) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 14) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 15) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 16) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 5) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 6 && gg.OwnItemCount(talker, 7065) >= 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 7) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_07a.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 8) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 9) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 10) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_15.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 11) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0024_20.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 9 && gg.OwnItemCount(talker, 7066) >= 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_01.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 10) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_03.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 12 && gg.OwnItemCount(talker, 7155) >= 1) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 7155, gg.OwnItemCount(talker, 7155));
myself.SetMemoState(talker, 25, 13);
myself.ShowPage(talker, "maid_of_ridia_q0025_09.htm");
myself.SetFlagJournal(talker, 25, 14);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 13) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 25, 1, 0);
myself.ShowPage(talker, "maid_of_ridia_q0025_10.htm");
myself.SoundEffect(talker, "ChrSound.FDElf_Cry");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 14) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_13.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 15) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_18.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 16) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_22.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_23.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 24) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "maid_of_ridia_q0025_24.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 7) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7065, 1);
myself.SetMemoState(talker, 24, 6);
myself.ShowPage(talker, "maid_of_ridia_q0024_04.htm");
myself.SetFlagJournal(talker, 24, 6);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 8) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 6 || gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) >= 1) {
myself.DeleteItem1(talker, 7065, gg.OwnItemCount(talker, 7065));
myself.DeleteItem1(talker, 7148, gg.OwnItemCount(talker, 7148));
myself.SetMemoState(talker, 24, 8);
myself.ShowPage(talker, "maid_of_ridia_q0024_06.htm");

} else if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 6 || gg.GetMemoState(talker, 24) == 7 && gg.OwnItemCount(talker, 7148) == 0) {
myself.SetMemoState(talker, 24, 7);
myself.ShowPage(talker, "maid_of_ridia_q0024_07.htm");
myself.SetFlagJournal(talker, 24, 7);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 9) {
myself.ShowPage(talker, "maid_of_ridia_q0024_09.htm");

}
if (reply == 10) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 8) {
myself.SetMemoState(talker, 24, 9);
myself.ShowPage(talker, "maid_of_ridia_q0024_10.htm");

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 9) {
myself.SetMemoState(talker, 24, 10);
myself.ShowPage(talker, "maid_of_ridia_q0024_14.htm");

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 10) {
myself.SetMemoState(talker, 24, 11);
myself.ShowPage(talker, "maid_of_ridia_q0024_19.htm");
myself.SetFlagJournal(talker, 24, 9);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (reply == 11) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 9 && gg.OwnItemCount(talker, 7066) >= 1) {
myself.DeleteItem1(talker, 7066, gg.OwnItemCount(talker, 7066));
myself.SetMemoState(talker, 25, 10);
myself.ShowPage(talker, "maid_of_ridia_q0025_02.htm");

}

}
if (reply == 12) {
myself.ShowPage(talker, "maid_of_ridia_q0025_04.htm");

}
if (reply == 13) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 10) {
myself.SetMemoState(talker, 25, 11);
myself.ShowPage(talker, "maid_of_ridia_q0025_07.htm");
myself.SoundEffect(talker, "SkillSound5.horror_01");
myself.SetFlagJournal(talker, 25, 11);
myself.ShowQuestMark(talker, 25);

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
if (reply == 14) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 13) {
if (gg.GetMemoStateEx(talker, 25, 1) <= 3) {
myself.SetMemoStateEx(talker, 25, 1, gg.GetMemoStateEx(talker, 25, 1) + 1);
myself.ShowPage(talker, "maid_of_ridia_q0025_11.htm");
myself.SoundEffect(talker, "ChrSound.FDElf_Cry");

} else {
myself.SetMemoState(talker, 25, 14);
myself.ShowPage(talker, "maid_of_ridia_q0025_12.htm");

}

}

} else if (reply == 15) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 14) {
myself.SetMemoState(talker, 25, 15);
myself.ShowPage(talker, "maid_of_ridia_q0025_17.htm");

}

} else if (reply == 16) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 15) {
myself.SetMemoState(talker, 25, 16);
myself.ShowPage(talker, "maid_of_ridia_q0025_21.htm");
myself.SetFlagJournal(talker, 25, 15);
myself.ShowQuestMark(talker, 25);

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
if (reply == 22) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 23) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 874, 1);
myself.GiveItem1(talker, 905, 2);
myself.DeleteItem1(talker, 7063, gg.OwnItemCount(talker, 7063));
myself.IncrementParam(talker, 0, 572277);
myself.IncrementParam(talker, 1, 53750);
myself.ShowPage(talker, "maid_of_ridia_q0025_25.htm");
myself.RemoveMemo(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 25, 1);
gg.AddLog(2, talker, 25);

}

}

}

}
super;
	}


}