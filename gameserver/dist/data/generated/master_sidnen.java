package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_sidnen extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 71) == 0 && myself.GetOneTimeQuestFlag(talker, 71) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of Eva's Templar");

}
if (gg.HaveMemo(talker, 71) == 0 && myself.GetOneTimeQuestFlag(talker, 71) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of Eva's Templar (Done)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of Eva's Templar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 0 && myself.GetOneTimeQuestFlag(talker, 71) == 0) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 20) {
myself.ShowQuestPage(talker, "master_sidnen_q0071_0101.htm", 71);

} else {
myself.ShowQuestPage(talker, "master_sidnen_q0071_0102.htm", 71);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 0 && myself.GetOneTimeQuestFlag(talker, 71) == 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 15) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 16) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 99);
myself.SetOneTimeQuestFlag(talker, 71, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 71);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "master_sidnen_q0071_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "master_sidnen_q0071_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0121.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0124.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0125.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 10) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_sidnen_q0071_0126.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 71) == 0 && myself.GetOneTimeQuestFlag(talker, 71) == 0 && talker.level >= 76 && talker.occupation == 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7094, 1);
myself.SetMemo(talker, 71);
myself.ShowQuestMark(talker, 71);
myself.SetMemoState(talker, 71, 1);
myself.SetFlagJournal(talker, 71, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "master_sidnen_q0071_0103.htm", 71);
gg.AddLog(1, talker, 71);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 1) {
if (gg.HaveMemo(talker, 71) == 0 && talker.occupation == 20 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 71) == 0) {
myself.FHTML_SetFileName(fhtml0, "master_sidnen_q0071_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 71);
myself.ShowQuestFHTML(talker, fhtml0, 71);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7094, gg.OwnItemCount(talker, 7094));
myself.ClassChange(talker, 99);
myself.SetOneTimeQuestFlag(talker, 71, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 71);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "master_sidnen_q0071_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 71, 16);
myself.SetFlagJournal(talker, 71, 20);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7094, gg.OwnItemCount(talker, 7094));
myself.ShowPage(talker, "master_sidnen_q0071_0108.htm");

}

}

}

}
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 5) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
myself.ShowPage(talker, "master_sidnen_q0071_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
myself.SetMemoState(talker, 71, 9);
myself.ShowPage(talker, "master_sidnen_q0071_0122.htm");
myself.SetFlagJournal(talker, 71, 11);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
myself.SetMemoState(talker, 71, 9);
myself.ShowPage(talker, "master_sidnen_q0071_0123.htm");
myself.SetFlagJournal(talker, 71, 12);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7362, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 71, 10);
myself.ShowPage(talker, "master_sidnen_q0071_0128.htm");
myself.SetFlagJournal(talker, 71, 13);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}