package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandmaster_sedrick extends master_lv3_hef {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 0 && myself.GetOneTimeQuestFlag(talker, 70) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight");

}
if (gg.HaveMemo(talker, 70) == 0 && myself.GetOneTimeQuestFlag(talker, 70) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (Done)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 0 && myself.GetOneTimeQuestFlag(talker, 73) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Duelist");

}
if (gg.HaveMemo(talker, 73) == 0 && myself.GetOneTimeQuestFlag(talker, 73) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Duelist (Done)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 15) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 16) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Duelist (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 0 && myself.GetOneTimeQuestFlag(talker, 70) == 0) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 5) {
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0070_0101.htm", 70);

} else {
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0070_0102.htm", 70);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 0 && myself.GetOneTimeQuestFlag(talker, 70) == 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 15) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 16) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 90);
myself.SetOneTimeQuestFlag(talker, 70, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 70);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0121.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0124.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0125.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 10) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0126.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 0 && myself.GetOneTimeQuestFlag(talker, 73) == 0) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 2) {
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0073_0101.htm", 73);

} else {
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0073_0102.htm", 73);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 0 && myself.GetOneTimeQuestFlag(talker, 73) == 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0104.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 15) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0106.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 16) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 88);
myself.SetOneTimeQuestFlag(talker, 73, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 73);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0110.htm");

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
if (quest_id == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 70) == 0 && myself.GetOneTimeQuestFlag(talker, 70) == 0 && talker.level >= 76 && talker.occupation == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7093, 1);
myself.SetMemo(talker, 70);
myself.ShowQuestMark(talker, 70);
myself.SetMemoState(talker, 70, 1);
myself.SetFlagJournal(talker, 70, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0070_0103.htm", 70);
gg.AddLog(1, talker, 70);

}

}
return;

}
if (quest_id == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 73) == 0 && myself.GetOneTimeQuestFlag(talker, 73) == 0 && talker.level >= 76 && talker.occupation == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7096, 1);
myself.SetMemo(talker, 73);
myself.ShowQuestMark(talker, 73);
myself.SetMemoState(talker, 73, 1);
myself.SetFlagJournal(talker, 73, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmaster_sedrick_q0073_0103.htm", 73);
gg.AddLog(1, talker, 73);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 1) {
if (gg.HaveMemo(talker, 70) == 0 && talker.occupation == 5 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 70) == 0) {
myself.FHTML_SetFileName(fhtml0, "grandmaster_sedrick_q0070_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 70);
myself.ShowQuestFHTML(talker, fhtml0, 70);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7093, gg.OwnItemCount(talker, 7093));
myself.ClassChange(talker, 90);
myself.SetOneTimeQuestFlag(talker, 70, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 70);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 70, 16);
myself.SetFlagJournal(talker, 70, 20);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7093, gg.OwnItemCount(talker, 7093));
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0108.htm");

}

}

}

}
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 5) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
myself.SetMemoState(talker, 70, 9);
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0122.htm");
myself.SetFlagJournal(talker, 70, 11);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 8) {
myself.SetMemoState(talker, 70, 9);
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0123.htm");
myself.SetFlagJournal(talker, 70, 12);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7361, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 70, 10);
myself.ShowPage(talker, "grandmaster_sedrick_q0070_0128.htm");
myself.SetFlagJournal(talker, 70, 13);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 73) {
if (reply == 1) {
if (gg.HaveMemo(talker, 73) == 0 && talker.occupation == 2 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 73) == 0) {
myself.FHTML_SetFileName(fhtml0, "grandmaster_sedrick_q0073_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 73);
myself.ShowQuestFHTML(talker, fhtml0, 73);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7096, gg.OwnItemCount(talker, 7096));
myself.ClassChange(talker, 88);
myself.SetOneTimeQuestFlag(talker, 73, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 73);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 73, 16);
myself.SetFlagJournal(talker, 73, 20);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7096, gg.OwnItemCount(talker, 7096));
myself.ShowPage(talker, "grandmaster_sedrick_q0073_0108.htm");

}

}

}

}
super;
	}


}