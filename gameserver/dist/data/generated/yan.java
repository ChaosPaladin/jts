package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class yan extends master_lv3_hew {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 88) == 0 && myself.GetOneTimeQuestFlag(talker, 88) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Archmage");

}
if (gg.HaveMemo(talker, 88) == 0 && myself.GetOneTimeQuestFlag(talker, 88) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Archmage (Done)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Archmage (In Progress)");

}
if (myself.IsMyLord(talker) == 0 && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path to Becoming a Lord - Oren (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 0 && myself.GetOneTimeQuestFlag(talker, 88) == 0) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 12) {
myself.ShowQuestPage(talker, "yan_q0088_0101.htm", 88);

} else {
myself.ShowQuestPage(talker, "yan_q0088_0102.htm", 88);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 0 && myself.GetOneTimeQuestFlag(talker, 88) == 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "yan_q0088_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 15) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "yan_q0088_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 16) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 94);
myself.SetOneTimeQuestFlag(talker, 88, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 88);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "yan_q0088_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "yan_q0088_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0 && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 5) {
myself.ShowPage(talker, "yan_q0712_01.htm");

} else if (gg.GetMemoState(c0, 712) >= 5) {
myself.ShowPage(talker, "yan_q0712_03.htm");

}

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
if (quest_id == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 88) == 0 && myself.GetOneTimeQuestFlag(talker, 88) == 0 && talker.level >= 76 && talker.occupation == 12) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7082, 1);
myself.SetMemo(talker, 88);
myself.ShowQuestMark(talker, 88);
myself.SetMemoState(talker, 88, 1);
myself.SetFlagJournal(talker, 88, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "yan_q0088_0103.htm", 88);
gg.AddLog(1, talker, 88);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 1) {
if (gg.HaveMemo(talker, 88) == 0 && talker.occupation == 12 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 88) == 0) {
myself.FHTML_SetFileName(fhtml0, "yan_q0088_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 88);
myself.ShowQuestFHTML(talker, fhtml0, 88);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7082, gg.OwnItemCount(talker, 7082));
myself.ClassChange(talker, 94);
myself.SetOneTimeQuestFlag(talker, 88, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 88);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "yan_q0088_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 88, 16);
myself.SetFlagJournal(talker, 88, 20);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7082, gg.OwnItemCount(talker, 7082));
myself.ShowPage(talker, "yan_q0088_0108.htm");

}

}

}

}
if (ask == 712) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 712) {
if (reply == 1) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 5) {
myself.SetMemoState(c0, 712, 6);
myself.ShowPage(talker, "yan_q0712_02.htm");
myself.SetFlagJournal(c0, 712, 5);
myself.ShowQuestMark(c0, 712);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}