package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sage_cronos extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam item0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2691) == 0 && gg.OwnItemCount(talker, 2720) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2720) == 1 && gg.OwnItemCount(talker, 2691) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 0 && talker.level < 45 && gg.OwnItemCount(talker, 3500) || gg.OwnItemCount(talker, 3501) || gg.OwnItemCount(talker, 3502)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Little Wing's Big Adventure");

}
if (gg.HaveMemo(talker, 421) == 0 && talker.level >= 45 && gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) >= 2) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Little Wing's Big Adventure");

}
if (gg.HaveMemo(talker, 421) == 0 && talker.level >= 45 && gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Little Wing's Big Adventure");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 100 || gg.GetMemoState(talker, 421) == 200 || gg.GetMemoState(talker, 421) >= 0 && gg.GetMemoState(talker, 421) <= 16) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Little Wing's Big Adventure (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2691) == 0 && gg.OwnItemCount(talker, 2720) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1 && gg.OwnItemCount(talker, 2709) >= 1) {
myself.ShowPage(talker, "sage_cronos_q0214_12.htm");

} else {
myself.ShowPage(talker, "sage_cronos_q0214_11.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2720) == 1 && gg.OwnItemCount(talker, 2691) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0214_15.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 420, 3);
myself.ShowPage(talker, "sage_cronos_q0420_08.htm");
myself.SetJournal(talker, 420, 3);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_14.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 3) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_09.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 10) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_10.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0420_11.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 0 && talker.level < 45 && gg.OwnItemCount(talker, 3500) || gg.OwnItemCount(talker, 3501) || gg.OwnItemCount(talker, 3502)) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "sage_cronos_q0421_01.htm", 421);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 0 && talker.level >= 45 && gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) >= 2) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "sage_cronos_q0421_02.htm", 421);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 0 && talker.level >= 45 && gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) == 1) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 3500) == 1) {
item0 = myself.GetItemData(talker, 3500);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_03.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "sage_cronos_q0421_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 421);
myself.ShowQuestFHTML(talker, fhtml0, 421);

}

}

}
if (gg.OwnItemCount(talker, 3501) == 1) {
item0 = myself.GetItemData(talker, 3501);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_03.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "sage_cronos_q0421_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 421);
myself.ShowQuestFHTML(talker, fhtml0, 421);

}

}

}
if (gg.OwnItemCount(talker, 3502) == 1) {
item0 = myself.GetItemData(talker, 3502);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_03.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "sage_cronos_q0421_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 421);
myself.ShowQuestFHTML(talker, fhtml0, 421);

}

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 100 || gg.GetMemoState(talker, 421) == 200 || gg.GetMemoState(talker, 421) >= 0 && gg.GetMemoState(talker, 421) <= 16) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_cronos_q0421_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam item0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 421) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) == 1) {
if (gg.OwnItemCount(talker, 3500) == 1) {
item0 = myself.GetItemData(talker, 3500);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_06.htm");

} else {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 421);
myself.SetMemoState(talker, 421, 100);
myself.SetMemoStateEx(talker, 421, 1, item0.dbid);
gg.AddLog(1, talker, 421);
myself.SetFlagJournal(talker, 421, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sage_cronos_q0421_05.htm", 421);

}

}

}
if (gg.OwnItemCount(talker, 3501) == 1) {
item0 = myself.GetItemData(talker, 3501);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_06.htm");

} else {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 421);
myself.SetMemoState(talker, 421, 100);
myself.SetMemoStateEx(talker, 421, 1, item0.dbid);
gg.AddLog(1, talker, 421);
myself.SetFlagJournal(talker, 421, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sage_cronos_q0421_05.htm", 421);

}

}

}
if (gg.OwnItemCount(talker, 3502) == 1) {
item0 = myself.GetItemData(talker, 3502);
if (item0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, "sage_cronos_q0421_06.htm");

} else {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 421);
myself.SetMemoState(talker, 421, 100);
myself.SetMemoStateEx(talker, 421, 1, item0.dbid);
gg.AddLog(1, talker, 421);
myself.SetFlagJournal(talker, 421, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sage_cronos_q0421_05.htm", 421);

}

}

}

} else {
myself.ShowQuestPage(talker, "sage_cronos_q0421_06.htm", 421);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
myself.ShowPage(talker, "sage_cronos_q0214_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "sage_cronos_q0214_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "sage_cronos_q0214_04.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "sage_cronos_q0214_05.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "sage_cronos_q0214_06.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "sage_cronos_q0214_07.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "sage_cronos_q0214_08.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "sage_cronos_q0214_09.htm");

}
if (reply == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_cronos_q0214_10.htm");
myself.SetFlagJournal(talker, 214, 20);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2691, 1);
myself.GiveItem1(talker, 2699, 1);

}

}
if (reply == 10) {
myself.ShowPage(talker, "sage_cronos_q0214_13.htm");

}
if (reply == 11) {
if (gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1 && gg.OwnItemCount(talker, 2709) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_cronos_q0214_14.htm");
myself.SetFlagJournal(talker, 214, 31);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2706, gg.OwnItemCount(talker, 2706));
myself.DeleteItem1(talker, 2707, gg.OwnItemCount(talker, 2707));
myself.DeleteItem1(talker, 2708, gg.OwnItemCount(talker, 2708));
myself.DeleteItem1(talker, 2709, gg.OwnItemCount(talker, 2709));
myself.DeleteItem1(talker, 2691, gg.OwnItemCount(talker, 2691));
myself.DeleteItem1(talker, 2705, gg.OwnItemCount(talker, 2705));
myself.DeleteItem1(talker, 2703, gg.OwnItemCount(talker, 2703));
myself.GiveItem1(talker, 2720, 1);

}

}

}

}
if (ask == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 1) {
myself.ShowPage(talker, "sage_cronos_q0420_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "sage_cronos_q0420_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "sage_cronos_q0420_04.htm");

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3818, 1);
myself.SetMemoState(talker, 420, 2);
myself.ShowPage(talker, "sage_cronos_q0420_05.htm");
myself.SetJournal(talker, 420, 2);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3819, 1);
myself.SetMemoState(talker, 420, 2);
myself.ShowPage(talker, "sage_cronos_q0420_06.htm");
myself.SetJournal(talker, 420, 2);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3818, 1);
myself.SetMemoState(talker, 420, 11);
myself.ShowPage(talker, "sage_cronos_q0420_12.htm");
myself.SetJournal(talker, 420, 2);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3819, 1);
myself.SetMemoState(talker, 420, 11);
myself.ShowPage(talker, "sage_cronos_q0420_13.htm");
myself.SetJournal(talker, 420, 2);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}