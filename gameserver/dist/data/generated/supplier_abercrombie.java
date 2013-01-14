package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class supplier_abercrombie extends merchant_for_friend_special {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 18) == 1 && gg.OwnItemCount(talker, 7245) >= 1 && gg.GetMemoState(talker, 18) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Meeting with the Golden Ram (In Progress)");

}
if (talker.level >= 66 && gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Secret Buried in the Swamp");

}
if (talker.level < 66 && gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Secret Buried in the Swamp");

}
if (gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Secret Buried in the Swamp (Done)");

}
if (gg.HaveMemo(talker, 31) == 1 && myself.GetOneTimeQuestFlag(talker, 31) == 0 && gg.GetMemoState(talker, 31) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Secret Buried in the Swamp (In Progress)");

}
if (gg.HaveMemo(talker, 31) == 1 && gg.OwnItemCount(talker, 7252) >= 1 && gg.GetMemoState(talker, 31) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Secret Buried in the Swamp (In Progress)");

}
if (gg.HaveMemo(talker, 31) == 1 && gg.GetMemoState(talker, 31) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Secret Buried in the Swamp (In Progress)");

}
if (gg.HaveMemo(talker, 31) == 1 && gg.GetMemoState(talker, 31) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Secret Buried in the Swamp (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 18) == 1 && gg.OwnItemCount(talker, 7245) >= 1 && gg.GetMemoState(talker, 18) == 2 * 10 + 1) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 18, 2);
myself.ShowPage(talker, "supplier_abercrombie_q0018_0201.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 66 && gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "supplier_abercrombie_q0031_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 31);
myself.ShowQuestFHTML(talker, fhtml0, 31);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 66 && gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "supplier_abercrombie_q0031_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 31) == 0 && myself.GetOneTimeQuestFlag(talker, 31) == 1) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 31) == 1 && myself.GetOneTimeQuestFlag(talker, 31) == 0 && gg.GetMemoState(talker, 31) == 1 * 10 + 1) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "supplier_abercrombie_q0031_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 31) == 1 && gg.OwnItemCount(talker, 7252) >= 1 && gg.GetMemoState(talker, 31) == 2 * 10 + 1) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 31, 2);
myself.ShowPage(talker, "supplier_abercrombie_q0031_0201.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 31) == 1 && gg.GetMemoState(talker, 31) == 3 * 10 + 1) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "supplier_abercrombie_q0031_0303.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 31) == 1 && gg.GetMemoState(talker, 31) == 7 * 10 + 1) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 31, 7);
myself.ShowPage(talker, "supplier_abercrombie_q0031_0701.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 31) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 31);
myself.ShowQuestMark(talker, 31);
myself.SetMemoState(talker, 31, 1 * 10 + 1);
gg.AddLog(1, talker, 31);
myself.SetFlagJournal(talker, 31, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "supplier_abercrombie_q0031_0104.htm", 31);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 18) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 18 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
i0 = myself.GetHTMLCookie(talker, 18, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 18) == 1 && myself.GetOneTimeQuestFlag(talker, 18) == 0) {
if (gg.OwnItemCount(talker, 7245) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7245, gg.OwnItemCount(talker, 7245));
myself.GiveItem1(talker, 57, 40000);
myself.IncrementParam(talker, 0, 126668);
myself.IncrementParam(talker, 1, 11731);

}
gg.AddLog(2, talker, 18);
myself.RemoveMemo(talker, 18);
myself.SetOneTimeQuestFlag(talker, 18, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "supplier_abercrombie_q0018_0301.htm");

} else {
myself.ShowPage(talker, "supplier_abercrombie_q0018_0302.htm");

}

}

}

}
if (ask == 31) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 31) {
i0 = myself.GetHTMLCookie(talker, 31, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 31) == 1) {
if (gg.OwnItemCount(talker, 7252) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7252, 1);
myself.ShowPage(talker, "supplier_abercrombie_q0031_0301.htm");
myself.SetMemoState(talker, 31, 3 * 10 + 1);
myself.SetFlagJournal(talker, 31, 3);
myself.ShowQuestMark(talker, 31);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "supplier_abercrombie_q0031_0302.htm");

}

}

}

}
if (ask == 31) {
myself.SetCurrentQuestID(31);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 31 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
i0 = myself.GetHTMLCookie(talker, 31, 8 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 31) == 1 && myself.GetOneTimeQuestFlag(talker, 31) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 120000);
myself.IncrementParam(talker, 0, 490000);
myself.IncrementParam(talker, 1, 45880);

}
gg.AddLog(2, talker, 31);
myself.RemoveMemo(talker, 31);
myself.SetOneTimeQuestFlag(talker, 31, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "supplier_abercrombie_q0031_0801.htm");

}

}

}
super;
	}


}