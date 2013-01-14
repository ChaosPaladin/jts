package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class falsepriest_dominic extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1 || gg.GetMemoStateEx(talker, 21, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 10 && gg.OwnItemCount(talker, 7140) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 4) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Oath (In progress)");

}
if (gg.HaveMemo(talker, 639) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Guardians of the Holy Grail");

}
if (gg.HaveMemo(talker, 639) == 1 && gg.OwnItemCount(talker, 8069) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Guardians of the Holy Grail (In Progress)");

}
if (gg.HaveMemo(talker, 639) == 1 && gg.OwnItemCount(talker, 8069) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Guardians of the Holy Grail (In Progress)");

}
if (gg.HaveMemo(talker, 10288) == 0 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Secret Mission");

}
if (myself.GetOneTimeQuestFlag(talker, 10288) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Secret Mission (Done)");

}
if (gg.HaveMemo(talker, 10288) == 1 && gg.GetMemoState(talker, 10288) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Secret Mission (In progress)");

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
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 4);
myself.ShowPage(talker, "falsepriest_dominic_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 1 || gg.GetMemoStateEx(talker, 21, 1) == 2) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, gg.GetMemoState(talker, 21) + 1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 4);
myself.ShowPage(talker, "falsepriest_dominic_q0021_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 8 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 4) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q0021_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) == 3) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, 10);
myself.ShowPage(talker, "falsepriest_dominic_q0021_03.htm");
myself.SetFlagJournal(talker, 21, 7);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 9 && gg.OwnItemCount(talker, 7140) >= 1 && gg.GetMemoStateEx(talker, 21, 1) != 3) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q0021_02.htm");

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
myself.ShowPage(talker, "falsepriest_dominic_q0021_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 4) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q0464_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 639) == 0) {
myself.SetCurrentQuestID(639);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q12345_01n.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 639) == 1 && gg.OwnItemCount(talker, 8069) >= 1) {
myself.SetCurrentQuestID(639);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q0639_05.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 639) == 1 && gg.OwnItemCount(talker, 8069) == 0) {
myself.SetCurrentQuestID(639);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q0639_06.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10288) == 0 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.SetCurrentQuestID(10288);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "falsepriest_dominic_q10288_01.htm", 10288);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 10288) == 1) {
myself.SetCurrentQuestID(10288);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q10288_02.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10288) == 1 && gg.GetMemoState(talker, 10288) == 1) {
myself.SetCurrentQuestID(10288);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "falsepriest_dominic_q10288_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10288) {
myself.SetCurrentQuestID(10288);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 10288) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.GiveItem1(talker, 15529, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 10288);
myself.SetMemoState(talker, 10288, 1);
myself.ShowQuestPage(talker, "falsepriest_dominic_q10288_06.htm", 10288);
myself.SetFlagJournal(talker, 10288, 1);
myself.ShowQuestMark(talker, 10288);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 464) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 464) {
if (reply == 1) {
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 4) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 69210);
myself.IncrementParam(talker, 0, 249180);
myself.IncrementParam(talker, 1, 28542);
myself.DeleteItem1(talker, 15539, gg.OwnItemCount(talker, 15539));
myself.RemoveMemo(talker, 464);
gg.SetDailyQuestFlag(talker, 464);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 464);
gg.AddLog(3, talker, 464);
myself.ShowPage(talker, "falsepriest_dominic_q0464_02.htm");

}

}

}

}
if (ask == 639) {
myself.SetCurrentQuestID(639);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 639) {
if (reply == 1) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "falsepriest_dominic_q0639_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 639);
myself.ShowQuestFHTML(talker, fhtml0, 639);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
if (reply == 2) {
myself.ShowPage(talker, "falsepriest_dominic_q0639_07.htm");

}
if (reply == 3) {
if (gg.HaveMemo(talker, 639) == 1 && gg.OwnItemCount(talker, 8069) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 8069) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 8069) * 1625 + 33940);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 8069) * 1625);

}
myself.DeleteItem1(talker, 8069, gg.OwnItemCount(talker, 8069));
gg.AddLog(3, talker, 639);
myself.ShowPage(talker, "falsepriest_dominic_q0639_08.htm");

}

}

}
if (reply == 4) {
myself.RemoveMemo(talker, 639);
gg.AddLog(2, talker, 639);
myself.DeleteItem1(talker, 8070, gg.OwnItemCount(talker, 8070));
myself.DeleteItem1(talker, 8071, gg.OwnItemCount(talker, 8071));
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "falsepriest_dominic_q0639_09.htm");

}

}
if (ask == 10288) {
myself.SetCurrentQuestID(10288);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10288) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10288) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.ShowPage(talker, "falsepriest_dominic_q10288_02a.htm");

} else if (gg.HaveMemo(talker, 10288) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.ShowPage(talker, "falsepriest_dominic_q10288_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 10288) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.ShowPage(talker, "falsepriest_dominic_q10288_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 10288) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 10288) == 0) {
myself.FHTML_SetFileName(fhtml0, "falsepriest_dominic_q10288_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10288);
myself.ShowQuestFHTML(talker, fhtml0, 10288);

}

}

}
super;
	}


}