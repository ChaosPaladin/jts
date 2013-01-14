package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_presbyter extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 16) == 0 && talker.level >= 62 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Coming Darkness");

}
if (gg.HaveMemo(talker, 16) == 0 && talker.level < 62 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Coming Darkness");

}
if (gg.HaveMemo(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 16) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Coming Darkness (Done)");

}
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) >= 1 && gg.GetMemoState(talker, 16) <= 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.GetMemoState(talker, 16) + gg.OwnItemCount(talker, 7167) >= 6) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "The Coming Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) >= 1 && gg.GetMemoState(talker, 16) <= 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.GetMemoState(talker, 16) + gg.OwnItemCount(talker, 7167) < 6) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "The Coming Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 6 && myself.GetOneTimeQuestFlag(talker, 16) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "The Coming Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 17) == 0 && talker.level >= 61 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Light and Darkness");

}
if (gg.HaveMemo(talker, 17) == 0 && talker.level < 61 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Light and Darkness");

}
if (gg.HaveMemo(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Light and Darkness (Done)");

}
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) >= 1 && gg.GetMemoState(talker, 17) <= 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.GetMemoState(talker, 17) + gg.OwnItemCount(talker, 7168) >= 5) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Light and Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) >= 1 && gg.GetMemoState(talker, 17) <= 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.GetMemoState(talker, 17) + gg.OwnItemCount(talker, 7168) < 5) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Light and Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 5 && myself.GetOneTimeQuestFlag(talker, 17) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Light and Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Sweet Whispers (In Progress)");

}
if (talker.level >= 60 && gg.HaveMemo(talker, 626) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "A Dark Twilight");

}
if (talker.level < 60 && gg.HaveMemo(talker, 626) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "A Dark Twilight");

}
if (gg.HaveMemo(talker, 626) == 1 && gg.GetMemoState(talker, 626) >= 1 * 10 + 1 && gg.GetMemoState(talker, 626) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "A Dark Twilight (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 0 && talker.level >= 62 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "dark_presbyter_q0016_01.htm", 16);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 0 && talker.level < 62 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_presbyter_q0016_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 0 && myself.GetOneTimeQuestFlag(talker, 16) == 1) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) >= 1 && gg.GetMemoState(talker, 16) <= 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.GetMemoState(talker, 16) + gg.OwnItemCount(talker, 7167) >= 6) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_presbyter_q0016_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) >= 1 && gg.GetMemoState(talker, 16) <= 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.GetMemoState(talker, 16) + gg.OwnItemCount(talker, 7167) < 6) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7167, gg.OwnItemCount(talker, 7167));
myself.RemoveMemo(talker, 16);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0016_06.htm");
gg.AddLog(2, talker, 16);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 6 && myself.GetOneTimeQuestFlag(talker, 16) == 0) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 865187);
myself.IncrementParam(talker, 1, 69172);
myself.DeleteItem1(talker, 7167, gg.OwnItemCount(talker, 7167));
myself.RemoveMemo(talker, 16);
myself.SetOneTimeQuestFlag(talker, 16, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0016_07.htm");
gg.AddLog(2, talker, 16);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 0 && talker.level >= 61 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "dark_presbyter_q0017_01.htm", 17);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 0 && talker.level < 61 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_presbyter_q0017_03.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 1) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) >= 1 && gg.GetMemoState(talker, 17) <= 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.GetMemoState(talker, 17) + gg.OwnItemCount(talker, 7168) >= 5) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_presbyter_q0017_05.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) >= 1 && gg.GetMemoState(talker, 17) <= 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.GetMemoState(talker, 17) + gg.OwnItemCount(talker, 7168) < 5) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7168, gg.OwnItemCount(talker, 7168));
myself.RemoveMemo(talker, 17);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0017_06.htm");
gg.AddLog(2, talker, 17);

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 5 && myself.GetOneTimeQuestFlag(talker, 17) == 0) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 697040);
myself.IncrementParam(talker, 1, 54887);
myself.DeleteItem1(talker, 7168, gg.OwnItemCount(talker, 7168));
myself.RemoveMemo(talker, 17);
myself.SetOneTimeQuestFlag(talker, 17, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0017_07.htm");
gg.AddLog(2, talker, 17);

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 2 * 10 + 1) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 15, 2);
myself.ShowPage(talker, "dark_presbyter_q0015_0201.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 626) == 0) {
myself.SetCurrentQuestID(626);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "dark_presbyter_q0626_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 626);
myself.ShowQuestFHTML(talker, fhtml0, 626);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 626) == 0) {
myself.SetCurrentQuestID(626);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "dark_presbyter_q0626_0103.htm", 626);

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 626) == 1 && gg.GetMemoState(talker, 626) >= 1 * 10 + 1 && gg.GetMemoState(talker, 626) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(626);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 626) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7169) >= 300) {
myself.SetHTMLCookie(talker, 626, 1);
myself.ShowPage(talker, "dark_presbyter_q0626_0105.htm");

} else {
myself.ShowPage(talker, "dark_presbyter_q0626_0106.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 16) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7167, 5);
myself.SetMemoState(talker, 16, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 16);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 16, 1);
myself.ShowQuestPage(talker, "dark_presbyter_q0016_04.htm", 16);
gg.AddLog(1, talker, quest_id);

}
return;

}
if (quest_id == 17) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7168, 4);
myself.SetMemoState(talker, 17, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 17);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 17, 1);
myself.ShowQuestPage(talker, "dark_presbyter_q0017_04.htm", 17);
gg.AddLog(1, talker, quest_id);

}
return;

}
if (quest_id == 626) {
myself.SetCurrentQuestID(626);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 626);
myself.ShowQuestMark(talker, 626);
myself.SetMemoState(talker, 626, 1 * 10 + 1);
gg.AddLog(1, talker, 626);
myself.SetFlagJournal(talker, 626, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dark_presbyter_q0626_0104.htm", 626);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 16) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 16) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "dark_presbyter_q0016_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 16);
myself.ShowQuestFHTML(talker, fhtml0, 16);

}

}
if (ask == 17) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 17) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "dark_presbyter_q0017_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 17);
myself.ShowQuestFHTML(talker, fhtml0, 17);

}

}
if (ask == 15) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 15 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
i0 = myself.GetHTMLCookie(talker, 15, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 350531);
myself.IncrementParam(talker, 1, 28204);

}
gg.AddLog(2, talker, 15);
myself.RemoveMemo(talker, 15);
myself.SetOneTimeQuestFlag(talker, 15, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0015_0301.htm");

}

}

}
if (ask == 626) {
myself.SetCurrentQuestID(626);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 626) {
i0 = myself.GetHTMLCookie(talker, 626, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 626) == 1) {
myself.ShowPage(talker, "dark_presbyter_q0626_0201.htm");

}
if (reply == 11 && gg.HaveMemo(talker, 626) == 1) {
if (gg.OwnItemCount(talker, 7169) >= 300) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7169, gg.OwnItemCount(talker, 7169));
myself.IncrementParam(talker, 0, 162773);
myself.IncrementParam(talker, 1, 12500);
gg.AddLog(2, talker, 626);
gg.AddLog(3, talker, 626);
myself.RemoveMemo(talker, 626);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0626_0202.htm");

}

} else {
myself.ShowPage(talker, "dark_presbyter_q0626_0203.htm");

}

}
if (reply == 12 && gg.HaveMemo(talker, 626) == 1) {
if (gg.OwnItemCount(talker, 7169) >= 300) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7169, gg.OwnItemCount(talker, 7169));
myself.GiveItem1(talker, 57, 100000);
gg.AddLog(2, talker, 626);
gg.AddLog(3, talker, 626);
myself.RemoveMemo(talker, 626);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_presbyter_q0626_0202.htm");

}

} else {
myself.ShowPage(talker, "dark_presbyter_q0626_0203.htm");

}

}

}

}
super;
	}


}