package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alankell extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2784) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2785) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 || gg.OwnItemCount(talker, 2788) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2790) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2793) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2799) == 1 || gg.OwnItemCount(talker, 2800) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2807) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2807) == 20) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2808) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 660) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Aiding the Floran Village.");

}
if (gg.HaveMemo(talker, 660) == 1 && gg.GetMemoState(talker, 660) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Aiding the Floran Village (In Progress)");

}
if (gg.HaveMemo(talker, 660) == 1 && gg.GetMemoState(talker, 660) == 2) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Aiding the Floran Village (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) < 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 2) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 3) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 4 && gg.OwnItemCount(talker, 10330) < 10) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10330) >= 10 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10330) >= 10 && gg.OwnItemCount(talker, 10331) >= 1 && gg.OwnItemCount(talker, 10332) >= 1 && gg.OwnItemCount(talker, 10333) < 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 6) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Temple Executor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2784) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alankell_q0225_01.htm");
myself.GiveItem1(talker, 2785, 1);
myself.DeleteItem1(talker, 2784, gg.OwnItemCount(talker, 2784));
myself.SetFlagJournal(talker, 225, 2);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2785) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2786) == 1 || gg.OwnItemCount(talker, 2788) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2790) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2793) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2799) == 1 || gg.OwnItemCount(talker, 2800) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2807) == 0) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_10.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2794) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2807) == 20) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alankell_q0225_11.htm");
myself.DeleteItem1(talker, 2794, 1);
myself.GiveItem1(talker, 2808, 1);
myself.DeleteItem1(talker, 2805, gg.OwnItemCount(talker, 2805));
myself.DeleteItem1(talker, 2807, gg.OwnItemCount(talker, 2807));
myself.DeleteRadar(talker, 10133, 157155, -2383, 2);
myself.SetFlagJournal(talker, 225, 19);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2808) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0225_12.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 0) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 30) {
myself.ShowQuestPage(talker, "alankell_q0660_02.htm", 660);

} else {
myself.FHTML_SetFileName(fhtml0, "alankell_q0660_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 660);
myself.ShowQuestFHTML(talker, fhtml0, 660);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 1 && gg.GetMemoState(talker, 660) == 1) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 660, 2);
myself.SetFlagJournal(talker, 660, 2);
myself.ShowQuestMark(talker, 660);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "alankell_q0660_04.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 1 && gg.GetMemoState(talker, 660) == 2) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0660_05.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) < 2) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0135_01.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 2) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 135, 3);
myself.ShowPage(talker, "alankell_q0135_02.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 3) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0135_03.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 4 && gg.OwnItemCount(talker, 10330) < 10) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0135_08.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10330) >= 10 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alankell_q0135_09.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 5 && gg.OwnItemCount(talker, 10330) >= 10 && gg.OwnItemCount(talker, 10331) >= 1 && gg.OwnItemCount(talker, 10332) >= 1 && gg.OwnItemCount(talker, 10333) < 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 10333, 1);
myself.DeleteItem1(talker, 10330, gg.OwnItemCount(talker, 10330));
myself.SetMemoState(talker, 135, 6);
myself.SetFlagJournal(talker, 135, 5);
myself.ShowQuestMark(talker, 135);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "alankell_q0135_10.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 6) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10333) == 0) {
myself.GiveItem1(talker, 10333, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "alankell_q0135_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 660) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 30) {
myself.ShowQuestPage(talker, "alankell_q0660_02.htm", 660);

} else if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 660, 2);
myself.SetFlagJournal(talker, 660, 2);
myself.ShowQuestMark(talker, 660);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "alankell_q0660_03.htm", 660);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 225) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 225) {
if (reply == 1) {
myself.ShowPage(talker, "alankell_q0225_05.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "alankell_q0225_06.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 2790) >= 1 && gg.OwnItemCount(talker, 2791) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alankell_q0225_07.htm");
myself.DeleteItem1(talker, 2790, 1);
myself.GiveItem1(talker, 2792, 1);
myself.DeleteItem1(talker, 2791, 1);
myself.GiveItem1(talker, 2793, 1);
myself.GiveItem1(talker, 2794, 1);
myself.SetFlagJournal(talker, 225, 8);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 660) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 660) {
if (reply == 1) {
i1 = gg.OwnItemCount(talker, 8074);
i2 = gg.OwnItemCount(talker, 8075);
i3 = gg.OwnItemCount(talker, 8076);
i0 = i1 + i2 + i3;
if (i0 > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, i0 * 100);
myself.DeleteItem1(talker, 8074, gg.OwnItemCount(talker, 8074));
myself.DeleteItem1(talker, 8075, gg.OwnItemCount(talker, 8075));
myself.DeleteItem1(talker, 8076, gg.OwnItemCount(talker, 8076));
myself.ShowPage(talker, "alankell_q0660_06.htm");
gg.AddLog(3, talker, 660);

}

} else {
myself.ShowPage(talker, "alankell_q0660_08.htm");

}

}
if (reply == 3) {
myself.DeleteItem1(talker, 8074, gg.OwnItemCount(talker, 8074));
myself.DeleteItem1(talker, 8075, gg.OwnItemCount(talker, 8075));
myself.DeleteItem1(talker, 8076, gg.OwnItemCount(talker, 8076));
myself.RemoveMemo(talker, 660);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "alankell_q0660_08a.htm");
gg.AddLog(2, talker, 660);

}
if (reply == 2) {
myself.ShowPage(talker, "alankell_q0660_09.htm");

}
if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i1 = gg.OwnItemCount(talker, 8074);
i2 = gg.OwnItemCount(talker, 8075);
i3 = gg.OwnItemCount(talker, 8076);
i0 = i1 + i2 + i3;
if (i0 < 100) {
myself.ShowPage(talker, "alankell_q0660_11.htm");

} else {
gg.AddLog(3, talker, 660);
i5 = 100;
i4 = 100;
if (i1 < i4) {
myself.DeleteItem1(talker, 8074, i1);
i4 = i4 - i1;

} else {
myself.DeleteItem1(talker, 8074, i4);
i4 = 0;

}
if (i2 < i4) {
myself.DeleteItem1(talker, 8075, i2);
i4 = i4 - i2;

} else {
myself.DeleteItem1(talker, 8075, i4);
i4 = 0;

}
if (i3 < i4) {
myself.DeleteItem1(talker, 8076, i3);
i4 = i4 - i3;

} else {
myself.DeleteItem1(talker, 8076, i4);
i4 = 0;

}
if (gg.Rand(99) > 50) {
myself.GiveItem1(talker, 956, 1);
myself.GiveItem1(talker, 57, 13000);
myself.ShowPage(talker, "alankell_q0660_12.htm");

} else {
myself.GiveItem1(talker, 57, 1000);
myself.ShowPage(talker, "alankell_q0660_13.htm");

}

}

}

}
if (reply == 14) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i1 = gg.OwnItemCount(talker, 8074);
i2 = gg.OwnItemCount(talker, 8075);
i3 = gg.OwnItemCount(talker, 8076);
i0 = i1 + i2 + i3;
if (i0 < 200) {
myself.ShowPage(talker, "alankell_q0660_15.htm");

} else {
gg.AddLog(3, talker, 660);
i5 = 200;
i4 = 200;
if (i1 < i4) {
myself.DeleteItem1(talker, 8074, i1);
i4 = i4 - i1;

} else {
myself.DeleteItem1(talker, 8074, i4);
i4 = 0;

}
if (i2 < i4) {
myself.DeleteItem1(talker, 8075, i2);
i4 = i4 - i2;

} else {
myself.DeleteItem1(talker, 8075, i4);
i4 = 0;

}
if (i3 < i4) {
myself.DeleteItem1(talker, 8076, i3);
i4 = i4 - i3;

} else {
myself.DeleteItem1(talker, 8076, i4);
i4 = 0;

}
if (gg.Rand(100) >= 50) {
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 956, 1);
myself.GiveItem1(talker, 57, 20000);

} else {
myself.GiveItem1(talker, 955, 1);

}
myself.ShowPage(talker, "alankell_q0660_16.htm");

} else {
myself.GiveItem1(talker, 57, 2000);
myself.ShowPage(talker, "alankell_q0660_17.htm");

}

}

}

}
if (reply == 18) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i1 = gg.OwnItemCount(talker, 8074);
i2 = gg.OwnItemCount(talker, 8075);
i3 = gg.OwnItemCount(talker, 8076);
i0 = i1 + i2 + i3;
if (i0 < 500) {
myself.ShowPage(talker, "alankell_q0660_19.htm");

} else {
gg.AddLog(3, talker, 660);
i5 = 500;
i4 = 500;
if (i1 < i4) {
myself.DeleteItem1(talker, 8074, i1);
i4 = i4 - i1;

} else {
myself.DeleteItem1(talker, 8074, i4);
i4 = 0;

}
if (i2 < i4) {
myself.DeleteItem1(talker, 8075, i2);
i4 = i4 - i2;

} else {
myself.DeleteItem1(talker, 8075, i4);
i4 = 0;

}
if (i3 < i4) {
myself.DeleteItem1(talker, 8076, i3);
i4 = i4 - i3;

} else {
myself.DeleteItem1(talker, 8076, i4);
i4 = 0;

}
if (gg.Rand(100) >= 50) {
myself.GiveItem1(talker, 955, 1);
myself.GiveItem1(talker, 57, 45000);
myself.ShowPage(talker, "alankell_q0660_20.htm");

} else {
myself.GiveItem1(talker, 57, 5000);
myself.ShowPage(talker, "alankell_q0660_21.htm");

}

}

}

}
if (reply == 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i1 = gg.OwnItemCount(talker, 8074);
i2 = gg.OwnItemCount(talker, 8075);
i3 = gg.OwnItemCount(talker, 8076);
i0 = i1 + i2 + i3;
if (i0 <= 0) {
myself.ShowPage(talker, "alankell_q0660_23.htm");

} else {
i4 = i0 * 100;
myself.GiveItem1(talker, 57, i4);
myself.ShowPage(talker, "alankell_q0660_22.htm");
gg.AddLog(3, talker, 660);

}
myself.DeleteItem1(talker, 8074, gg.OwnItemCount(talker, 8074));
myself.DeleteItem1(talker, 8075, gg.OwnItemCount(talker, 8075));
myself.DeleteItem1(talker, 8076, gg.OwnItemCount(talker, 8076));
myself.RemoveMemo(talker, 660);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 660);

}

}

}
if (ask == 135) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 135) {
if (reply == 1) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 3) {
myself.ShowPage(talker, "alankell_q0135_02a.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 3) {
myself.ShowPage(talker, "alankell_q0135_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 3) {
myself.ShowPage(talker, "alankell_q0135_05.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 3) {
myself.ShowPage(talker, "alankell_q0135_06.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 3) {
myself.ShowPage(talker, "alankell_q0135_07.htm");
myself.SetMemoState(talker, 135, 4);
myself.SetFlagJournal(talker, 135, 3);
myself.ShowQuestMark(talker, 135);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}