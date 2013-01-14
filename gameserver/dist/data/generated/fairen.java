package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fairen extends master_lv3_de {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 90) == 0 && myself.GetOneTimeQuestFlag(talker, 90) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Storm Screamer");

}
if (gg.HaveMemo(talker, 90) == 0 && myself.GetOneTimeQuestFlag(talker, 90) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Storm Screamer (Done)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 0 && myself.GetOneTimeQuestFlag(talker, 93) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Spectral Master");

}
if (gg.HaveMemo(talker, 93) == 0 && myself.GetOneTimeQuestFlag(talker, 93) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Spectral Master (Done)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 15) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 16) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 8) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 10) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Spectral Master (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 0 && myself.GetOneTimeQuestFlag(talker, 90) == 0) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 40) {
myself.ShowQuestPage(talker, "fairen_q0090_0101.htm", 90);

} else {
myself.ShowQuestPage(talker, "fairen_q0090_0102.htm", 90);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 0 && myself.GetOneTimeQuestFlag(talker, 90) == 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0090_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 15) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0090_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 16) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 110);
myself.SetOneTimeQuestFlag(talker, 90, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 90);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "fairen_q0090_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "fairen_q0090_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 0 && myself.GetOneTimeQuestFlag(talker, 93) == 0) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 41) {
myself.ShowQuestPage(talker, "fairen_q0093_0101.htm", 93);

} else {
myself.ShowQuestPage(talker, "fairen_q0093_0102.htm", 93);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 0 && myself.GetOneTimeQuestFlag(talker, 93) == 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 15) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0106.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 16) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 111);
myself.SetOneTimeQuestFlag(talker, 93, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 93);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "fairen_q0093_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "fairen_q0093_0110.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 8) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0121.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0124.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0125.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 10) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairen_q0093_0126.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 90) == 0 && myself.GetOneTimeQuestFlag(talker, 90) == 0 && talker.level >= 76 && talker.occupation == 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7084, 1);
myself.SetMemo(talker, 90);
myself.ShowQuestMark(talker, 90);
myself.SetMemoState(talker, 90, 1);
myself.SetFlagJournal(talker, 90, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fairen_q0090_0103.htm", 90);
gg.AddLog(1, talker, 90);

}

}
return;

}
if (quest_id == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 93) == 0 && myself.GetOneTimeQuestFlag(talker, 93) == 0 && talker.level >= 76 && talker.occupation == 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7112, 1);
myself.SetMemo(talker, 93);
myself.ShowQuestMark(talker, 93);
myself.SetMemoState(talker, 93, 1);
myself.SetFlagJournal(talker, 93, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fairen_q0093_0103.htm", 93);
gg.AddLog(1, talker, 93);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 1) {
if (gg.HaveMemo(talker, 90) == 0 && talker.occupation == 40 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 90) == 0) {
myself.FHTML_SetFileName(fhtml0, "fairen_q0090_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 90);
myself.ShowQuestFHTML(talker, fhtml0, 90);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7084, gg.OwnItemCount(talker, 7084));
myself.ClassChange(talker, 110);
myself.SetOneTimeQuestFlag(talker, 90, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 90);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "fairen_q0090_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 90, 16);
myself.SetFlagJournal(talker, 90, 20);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7084, gg.OwnItemCount(talker, 7084));
myself.ShowPage(talker, "fairen_q0090_0108.htm");

}

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 1) {
if (gg.HaveMemo(talker, 93) == 0 && talker.occupation == 41 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 93) == 0) {
myself.FHTML_SetFileName(fhtml0, "fairen_q0093_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 93);
myself.ShowQuestFHTML(talker, fhtml0, 93);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7112, gg.OwnItemCount(talker, 7112));
myself.ClassChange(talker, 111);
myself.SetOneTimeQuestFlag(talker, 93, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 93);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "fairen_q0093_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 93, 16);
myself.SetFlagJournal(talker, 93, 20);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7112, gg.OwnItemCount(talker, 7112));
myself.ShowPage(talker, "fairen_q0093_0108.htm");

}

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 5) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 8) {
myself.ShowPage(talker, "fairen_q0093_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 8) {
myself.SetMemoState(talker, 93, 9);
myself.ShowPage(talker, "fairen_q0093_0122.htm");
myself.SetFlagJournal(talker, 93, 11);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 8) {
myself.SetMemoState(talker, 93, 9);
myself.ShowPage(talker, "fairen_q0093_0123.htm");
myself.SetFlagJournal(talker, 93, 12);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7384, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 93, 10);
myself.ShowPage(talker, "fairen_q0093_0128.htm");
myself.SetFlagJournal(talker, 93, 13);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}