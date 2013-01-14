package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_sorius extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 406) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Knight");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) > 0 && gg.OwnItemCount(talker, 1205) < 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) == 0 && gg.OwnItemCount(talker, 1276) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) && gg.OwnItemCount(talker, 1203) != 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) >= 6 && gg.GetMemoState(talker, 226) < 9) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 9 && gg.OwnItemCount(talker, 2811)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) >= 10) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) == 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "master_sorius_q0406_01.htm", 406);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) == 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0406_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) > 0 && gg.OwnItemCount(talker, 1205) < 20) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0406_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) == 0 && gg.OwnItemCount(talker, 1276) == 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1202) == 0) {
myself.GiveItem1(talker, 1202, 1);

}
myself.ShowPage(talker, "master_sorius_q0406_09.htm");
myself.SetFlagJournal(talker, 406, 3);
myself.ShowQuestMark(talker, 406);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) != 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0406_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0406_11.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) && gg.OwnItemCount(talker, 1203) != 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1203, gg.OwnItemCount(talker, 1203));
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 23152);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 29850);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 33328);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 406);
gg.AddLog(2, talker, 406);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (gg.OwnItemCount(talker, 1204) == 0) {
myself.GiveItem1(talker, 1204, 1);

}
myself.ShowPage(talker, "master_sorius_q0406_10.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 5) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_sorius_q0226_01.htm");
myself.GiveItem1(talker, 2815, 1);
myself.SetMemoState(talker, 226, 6);
myself.SetFlagJournal(talker, 226, 10);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) >= 6 && gg.GetMemoState(talker, 226) < 9) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0226_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 9 && gg.OwnItemCount(talker, 2811)) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_sorius_q0226_03.htm");
myself.DeleteItem1(talker, 2811, 1);
myself.SetMemoState(talker, 226, 10);
myself.SetFlagJournal(talker, 226, 23);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) >= 10) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sorius_q0226_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 406) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 406);
gg.AddLog(1, talker, 406);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 406, 1);
myself.ShowQuestPage(talker, "master_sorius_q0406_06.htm", 406);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 406) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 406 && reply == 1) {
if (talker.occupation != 18) {
if (talker.occupation == 19) {
myself.ShowQuestPage(talker, "master_sorius_q0406_02a.htm", 406);

} else {
myself.ShowQuestPage(talker, "master_sorius_q0406_02.htm", 406);

}

} else if (talker.level < 18) {
myself.ShowQuestPage(talker, "master_sorius_q0406_03.htm", 406);

} else if (gg.OwnItemCount(talker, 1204) != 0) {
myself.ShowQuestPage(talker, "master_sorius_q0406_04.htm", 406);

} else {
myself.ShowQuestPage(talker, "master_sorius_q0406_05.htm", 406);

}

}
super;
	}


}