package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_tobias extends dark_elf_lv2_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 9) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) >= 11) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Warder (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) < 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 3 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 4 && gg.GetMemoState(talker, 143) < 11 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 11 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 6) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Oath (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 8) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9767, gg.OwnItemCount(talker, 9767));
myself.SetMemoState(talker, 63, 9);
myself.ShowPage(talker, "master_tobias_q0063_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 9) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0063_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 10) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9768, 1);
myself.SetMemoState(talker, 63, 11);
myself.ShowPage(talker, "master_tobias_q0063_05.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 63, 8);
myself.ShowQuestMark(talker, 63);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) >= 11) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0063_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) < 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0143_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0143_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 3 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0143_03a.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 4 && gg.GetMemoState(talker, 143) < 11 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0143_06.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 11 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10358, gg.OwnItemCount(talker, 10358));
myself.RemoveMemo(talker, 143);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "master_tobias_q0143_07.htm");
gg.AddLog(2, talker, 143);
myself.SetOneTimeQuestFlag(talker, 143, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 44) {
myself.GiveItem1(talker, 57, 89046);
myself.IncrementParam(talker, 0, 223036);
myself.IncrementParam(talker, 1, 13901);

} else {
myself.GiveItem1(talker, 57, 89046);

}
gg.AddLog(3, talker, 143);

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 6) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_tobias_q0464_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 63) {
myself.SetCurrentQuestID(63);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 63) {
if (reply == 1) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 9) {
myself.ShowPage(talker, "master_tobias_q0063_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 9) {
myself.SetMemoState(talker, 63, 10);
myself.ShowPage(talker, "master_tobias_q0063_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 63) == 1 && gg.GetMemoState(talker, 63) == 10) {
myself.GiveItem1(talker, 9768, 1);
myself.SetMemoState(talker, 63, 11);
myself.ShowPage(talker, "master_tobias_q0063_06.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 63, 8);
myself.ShowQuestMark(talker, 63);

}

}

}
if (ask == 143) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 143) {
if (reply == 3) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 2 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.DeleteItem1(talker, 10354, gg.OwnItemCount(talker, 10354));
myself.SetMemoState(talker, 143, 3);
myself.ShowPage(talker, "master_tobias_q0143_03.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 3 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "master_tobias_q0143_04.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 3 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.GiveItem1(talker, 10355, 1);
myself.GiveItem1(talker, 10356, 1);
myself.SetMemoState(talker, 143, 4);
myself.ShowPage(talker, "master_tobias_q0143_05.htm");
myself.SetFlagJournal(talker, 143, 3);
myself.ShowQuestMark(talker, 143);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 464) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 464) {
if (reply == 1) {
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 6) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 210806);
myself.IncrementParam(talker, 0, 24146);
myself.IncrementParam(talker, 1, 58551);
myself.DeleteItem1(talker, 15539, gg.OwnItemCount(talker, 15539));
myself.RemoveMemo(talker, 464);
gg.SetDailyQuestFlag(talker, 464);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 464);
gg.AddLog(3, talker, 464);
myself.ShowPage(talker, "master_tobias_q0464_02.htm");

}

}

}

}
super;
	}


}