package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shegfield extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 3 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 3 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 0 && myself.GetOneTimeQuestFlag(talker, 135) < 1 && talker.level >= 35) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Temple Executor");

}
if (gg.HaveMemo(talker, 135) == 0 && myself.GetOneTimeQuestFlag(talker, 135) < 1 && talker.level < 35) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Temple Executor");

}
if (myself.GetOneTimeQuestFlag(talker, 135) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Temple Executor (Done)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 2 && gg.GetMemoState(talker, 135) < 5 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1 || gg.OwnItemCount(talker, 10333) < 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 5 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1 || gg.OwnItemCount(talker, 10333) < 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 6 && gg.OwnItemCount(talker, 10331) >= 1 && gg.OwnItemCount(talker, 10332) >= 1 && gg.OwnItemCount(talker, 10333) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Temple Executor (In Progress)");

}
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 7) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Temple Executor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0189_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 3 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0189_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0191_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 3 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0191_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 0 && myself.GetOneTimeQuestFlag(talker, 135) < 1 && talker.level >= 35) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "shegfield_q0135_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 135);
myself.ShowQuestFHTML(talker, fhtml0, 135);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 0 && myself.GetOneTimeQuestFlag(talker, 135) < 1 && talker.level < 35) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "shegfield_q0135_02.htm", 135);

}
break;

}
case 6: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 135) >= 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 135, 2);
myself.SetFlagJournal(talker, 135, 2);
myself.ShowQuestMark(talker, 135);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "shegfield_q0135_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 2 && gg.GetMemoState(talker, 135) < 5 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1 || gg.OwnItemCount(talker, 10333) < 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0135_06.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) >= 5 && gg.OwnItemCount(talker, 10331) < 1 || gg.OwnItemCount(talker, 10332) < 1 || gg.OwnItemCount(talker, 10333) < 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0135_07.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 6 && gg.OwnItemCount(talker, 10331) >= 1 && gg.OwnItemCount(talker, 10332) >= 1 && gg.OwnItemCount(talker, 10333) >= 1) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10331, 1);
myself.DeleteItem1(talker, 10332, 1);
myself.DeleteItem1(talker, 10333, 1);
myself.SetMemoState(talker, 135, 7);
myself.ShowPage(talker, "shegfield_q0135_08.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 7) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shegfield_q0135_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 135) {
myself.SetCurrentQuestID(135);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 135) == 0 && myself.GetOneTimeQuestFlag(talker, 135) < 1 && talker.level >= 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 135, 1);
myself.SetMemoStateEx(talker, 135, 1, 0);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "shegfield_q0135_03.htm", 135);
myself.SetFlagJournal(talker, 135, 1);
myself.ShowQuestMark(talker, 135);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 189) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 189) {
if (reply == 1) {
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.ShowPage(talker, "shegfield_q0189_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetMemoState(talker, 189, 3);
myself.ShowPage(talker, "shegfield_q0189_03.htm");
myself.SetFlagJournal(talker, 189, 3);
myself.ShowQuestMark(talker, 189);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 191) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 191) {
if (reply == 1) {
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.ShowPage(talker, "shegfield_q0191_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetMemoState(talker, 191, 3);
myself.ShowPage(talker, "shegfield_q0191_03.htm");
myself.SetFlagJournal(talker, 191, 3);
myself.ShowQuestMark(talker, 191);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (gg.HaveMemo(talker, 135) == 1 && gg.GetMemoState(talker, 135) == 1) {
myself.SetMemoState(talker, 135, 2);
myself.SetFlagJournal(talker, 135, 2);
myself.ShowQuestMark(talker, 135);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "shegfield_q0135_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 7) {
myself.ShowPage(talker, "shegfield_q0135_10.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 7) {
myself.ShowPage(talker, "shegfield_q0135_11.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 7) {
myself.ShowPage(talker, "shegfield_q0135_12.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 135) >= 1 && gg.GetMemoState(talker, 135) == 7) {
myself.GiveItem1(talker, 10334, 1);
if (talker.level < 41) {
myself.IncrementParam(talker, 0, 30000);
myself.IncrementParam(talker, 1, 2000);

}
myself.GiveItem1(talker, 57, 10000 + 3234 + 3690);
myself.RemoveMemo(talker, 135);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "shegfield_q0135_13.htm");
myself.SetOneTimeQuestFlag(talker, 135, 1);
gg.AddLog(2, talker, 135);
gg.AddLog(3, talker, 135);

}

}

}
super;
	}


}