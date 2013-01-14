package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class biralri extends master_lv3_hew {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 89) == 0 && myself.GetOneTimeQuestFlag(talker, 89) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Mystic Muse");

}
if (gg.HaveMemo(talker, 89) == 0 && myself.GetOneTimeQuestFlag(talker, 89) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Mystic Muse (Done)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 0 && myself.GetOneTimeQuestFlag(talker, 92) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Elemental Master");

}
if (gg.HaveMemo(talker, 92) == 0 && myself.GetOneTimeQuestFlag(talker, 92) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Elemental Master (Done)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 15) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 16) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Elemental Master (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 0 && myself.GetOneTimeQuestFlag(talker, 89) == 0) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 27) {
myself.ShowQuestPage(talker, "biralri_q0089_0101.htm", 89);

} else {
myself.ShowQuestPage(talker, "biralri_q0089_0102.htm", 89);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 0 && myself.GetOneTimeQuestFlag(talker, 89) == 1) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 1) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "biralri_q0089_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 15) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "biralri_q0089_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 16) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 103);
myself.SetOneTimeQuestFlag(talker, 89, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 89);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "biralri_q0089_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "biralri_q0089_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 0 && myself.GetOneTimeQuestFlag(talker, 92) == 0) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 28) {
myself.ShowQuestPage(talker, "biralri_q0092_0101.htm", 92);

} else {
myself.ShowQuestPage(talker, "biralri_q0092_0102.htm", 92);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 0 && myself.GetOneTimeQuestFlag(talker, 92) == 1) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 1) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "biralri_q0092_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 15) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "biralri_q0092_0106.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 16) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 104);
myself.SetOneTimeQuestFlag(talker, 92, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 92);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "biralri_q0092_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "biralri_q0092_0110.htm");

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
if (quest_id == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 89) == 0 && myself.GetOneTimeQuestFlag(talker, 89) == 0 && talker.level >= 76 && talker.occupation == 27) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7083, 1);
myself.SetMemo(talker, 89);
myself.ShowQuestMark(talker, 89);
myself.SetMemoState(talker, 89, 1);
myself.SetFlagJournal(talker, 89, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "biralri_q0089_0103.htm", 89);
gg.AddLog(1, talker, 89);

}

}
return;

}
if (quest_id == 92) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 92) == 0 && myself.GetOneTimeQuestFlag(talker, 92) == 0 && talker.level >= 76 && talker.occupation == 28) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7111, 1);
myself.SetMemo(talker, 92);
myself.ShowQuestMark(talker, 92);
myself.SetMemoState(talker, 92, 1);
myself.SetFlagJournal(talker, 92, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "biralri_q0092_0103.htm", 92);
gg.AddLog(1, talker, 92);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 89) {
if (reply == 1) {
if (gg.HaveMemo(talker, 89) == 0 && talker.occupation == 27 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 89) == 0) {
myself.FHTML_SetFileName(fhtml0, "biralri_q0089_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 89);
myself.ShowQuestFHTML(talker, fhtml0, 89);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7083, gg.OwnItemCount(talker, 7083));
myself.ClassChange(talker, 103);
myself.SetOneTimeQuestFlag(talker, 89, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 89);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "biralri_q0089_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 89, 16);
myself.SetFlagJournal(talker, 89, 20);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7083, gg.OwnItemCount(talker, 7083));
myself.ShowPage(talker, "biralri_q0089_0108.htm");

}

}

}

}
if (ask == 92) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 92) {
if (reply == 1) {
if (gg.HaveMemo(talker, 92) == 0 && talker.occupation == 28 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 92) == 0) {
myself.FHTML_SetFileName(fhtml0, "biralri_q0092_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 92);
myself.ShowQuestFHTML(talker, fhtml0, 92);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7111, gg.OwnItemCount(talker, 7111));
myself.ClassChange(talker, 104);
myself.SetOneTimeQuestFlag(talker, 92, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 92);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "biralri_q0092_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 92, 16);
myself.SetFlagJournal(talker, 92, 20);
myself.ShowQuestMark(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7111, gg.OwnItemCount(talker, 7111));
myself.ShowPage(talker, "biralri_q0092_0108.htm");

}

}

}

}
super;
	}


}