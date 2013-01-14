package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merc_cap_peace extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 66 && gg.HaveMemo(talker, 629) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Cleaning up the Swamp of Screams");

}
if (talker.level < 66 && gg.HaveMemo(talker, 629) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Cleaning up the Swamp of Screams");

}
if (gg.HaveMemo(talker, 629) == 1 && gg.GetMemoState(talker, 629) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Cleaning up the Swamp of Screams (In Progress)");

}
if (talker.level >= 81 && gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "In Search of the Nest");

}
if (talker.level < 81 && gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "In Search of the Nest");

}
if (gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "In Search of the Nest (Done)");

}
if (gg.HaveMemo(talker, 109) == 1 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.GetMemoState(talker, 109) == 21) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "In Search of the Nest (In Progress)");

}
if (gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) == 25 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.OwnItemCount(talker, 8083) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "In Search of the Nest (In Progress)");

}
if (gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) == 25 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.OwnItemCount(talker, 14858) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "In Search of the Nest (In Progress)");

}
if (gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) > 30 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "In Search of the Nest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 66 && gg.HaveMemo(talker, 629) == 0) {
myself.SetCurrentQuestID(629);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "merc_cap_peace_q0629_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 629);
myself.ShowQuestFHTML(talker, fhtml0, 629);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 66 && gg.HaveMemo(talker, 629) == 0) {
myself.SetCurrentQuestID(629);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "merc_cap_peace_q0629_0103.htm", 629);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 629) == 1 && gg.GetMemoState(talker, 629) == 1 * 10 + 1) {
myself.SetCurrentQuestID(629);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7250) == 0) {
myself.ShowPage(talker, "merc_cap_peace_q0629_0106.htm");

} else {
myself.SetHTMLCookie(talker, 629, 1);
myself.ShowPage(talker, "merc_cap_peace_q0629_0105.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level >= 81 && gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "merc_cap_peace_q0109_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 109);
myself.ShowQuestFHTML(talker, fhtml0, 109);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level < 81 && gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "merc_cap_peace_q0109_0103.htm", 109);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 1) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 1 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.GetMemoState(talker, 109) == 21) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_cap_peace_q0109_0105.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) == 25 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.OwnItemCount(talker, 8083) >= 1) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 109, 2);
myself.ShowPage(talker, "merc_cap_peace_q0109_0201.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) == 25 && myself.GetOneTimeQuestFlag(talker, 109) == 0 && gg.OwnItemCount(talker, 14858) >= 1) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 109, 2);
myself.ShowPage(talker, "merc_cap_peace_q0109_0201.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) > 30 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_cap_peace_q0109_0303.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 629) {
myself.SetCurrentQuestID(629);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 629);
myself.ShowQuestMark(talker, 629);
myself.SetMemoState(talker, 629, 1 * 10 + 1);
gg.AddLog(1, talker, 629);
myself.SetFlagJournal(talker, 629, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "merc_cap_peace_q0629_0104.htm", 629);

}
return;

}
if (quest_id == 109) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.level >= 81 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 109);
myself.SetMemoState(talker, 109, 21);
gg.AddLog(1, talker, 109);
myself.SetFlagJournal(talker, 109, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "merc_cap_peace_q0109_0104.htm", 109);
myself.ShowQuestMark(talker, 109);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 629) {
myself.SetCurrentQuestID(629);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 629) {
i0 = myself.GetHTMLCookie(talker, 629, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 629) == 1) {
myself.ShowPage(talker, "merc_cap_peace_q0629_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 629) == 1) {
if (gg.OwnItemCount(talker, 7250) >= 100) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7250, 100);
if (i1 < 1000) {
myself.GiveItem1(talker, 7251, 20);

}

}
gg.AddLog(3, talker, 629);
myself.ShowPage(talker, "merc_cap_peace_q0629_0202.htm");

} else {
myself.ShowPage(talker, "merc_cap_peace_q0629_0203.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7250, gg.OwnItemCount(talker, 7250));
gg.AddLog(2, talker, 629);
myself.RemoveMemo(talker, 629);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "merc_cap_peace_q0629_0204.htm");

}

}

}

}
if (ask == 109) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 109) {
i0 = myself.GetHTMLCookie(talker, 109, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 109) == 1 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
if (gg.OwnItemCount(talker, 8083) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 8083, gg.OwnItemCount(talker, 8083));
myself.ShowPage(talker, "merc_cap_peace_q0109_0301a.htm");
myself.SetMemoState(talker, 109, 31);
myself.SetFlagJournal(talker, 109, 3);
myself.ShowQuestMark(talker, 109);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 14858) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 14858, gg.OwnItemCount(talker, 14858));
myself.ShowPage(talker, "merc_cap_peace_q0109_0301a.htm");
myself.SetMemoState(talker, 109, 35);
myself.SetFlagJournal(talker, 109, 3);
myself.ShowQuestMark(talker, 109);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}

}
super;
	}


}