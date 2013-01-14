package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class urutu_chief_hatos extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 107) == 0 && myself.GetOneTimeQuestFlag(talker, 107) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Merciless Punishment");

}
if (gg.HaveMemo(talker, 107) == 0 && myself.GetOneTimeQuestFlag(talker, 107) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Merciless Punishment (Done)");

}
if (gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Merciless Punishment (In Progress)");

}
if (gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Merciless Punishment (In Progress)");

}
if (gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Merciless Punishment (In Progress)");

}
if (gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 3 && myself.GetOneTimeQuestFlag(talker, 107) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Merciless Punishment (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3394) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 0 && myself.GetOneTimeQuestFlag(talker, 107) == 0) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "urutu_chief_hatos_q0107_00.htm", 107);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "urutu_chief_hatos_q0107_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 107);
myself.ShowQuestFHTML(talker, fhtml0, 107);

} else {
myself.ShowQuestPage(talker, "urutu_chief_hatos_q0107_01.htm", 107);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 0 && myself.GetOneTimeQuestFlag(talker, 107) == 1) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 0) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "urutu_chief_hatos_q0107_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 1) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "urutu_chief_hatos_q0107_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 2) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "urutu_chief_hatos_q0107_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 3 && myself.GetOneTimeQuestFlag(talker, 107) == 0) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 25) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 7000);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

}
myself.IncrementParam(talker, 0, 34565);
myself.IncrementParam(talker, 1, 2962);
myself.GiveItem1(talker, 57, 14666);
myself.ShowPage(talker, "urutu_chief_hatos_q0107_10.htm");
myself.GiveItem1(talker, 1060, 100);
myself.GiveItem1(talker, 4414, 10);
myself.GiveItem1(talker, 4415, 10);
myself.GiveItem1(talker, 4416, 10);
myself.GiveItem1(talker, 4413, 10);
myself.GiveItem1(talker, 4412, 10);
myself.DeleteItem1(talker, 1556, gg.OwnItemCount(talker, 1556));
myself.DeleteItem1(talker, 1557, gg.OwnItemCount(talker, 1557));
myself.DeleteItem1(talker, 1558, gg.OwnItemCount(talker, 1558));
myself.DeleteItem1(talker, 1555, gg.OwnItemCount(talker, 1555));
myself.GiveItem1(talker, 1510, 1);
myself.RemoveMemo(talker, 107);
gg.AddLog(2, talker, 107);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 107, 1);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3394) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "urutu_chief_hatos_q0232_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3402) == 1 && gg.OwnItemCount(talker, 3403) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0232_04.htm");
myself.DeleteItem1(talker, 3394, gg.OwnItemCount(talker, 3394));
myself.DeleteItem1(talker, 3402, gg.OwnItemCount(talker, 3402));
myself.DeleteItem1(talker, 3403, gg.OwnItemCount(talker, 3403));
myself.GiveItem1(talker, 3404, 1);
if (gg.OwnItemCount(talker, 3400) == 1 && gg.OwnItemCount(talker, 3406) == 1 && gg.OwnItemCount(talker, 3409) == 1 && gg.OwnItemCount(talker, 3411) == 1) {
myself.SetFlagJournal(talker, 232, 2);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else {
myself.ShowPage(talker, "urutu_chief_hatos_q0232_03.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "urutu_chief_hatos_q0232_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 107) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "urutu_chief_hatos_q0107_03.htm", 107);
myself.SetMemo(talker, 107);
myself.ShowQuestMark(talker, 107);
gg.AddLog(1, talker, 107);
myself.GiveItem1(talker, 1553, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 107, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 107) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 107 && reply == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0107_06.htm");
myself.DeleteItem1(talker, 1554, gg.OwnItemCount(talker, 1554));
myself.DeleteItem1(talker, 1556, gg.OwnItemCount(talker, 1556));
myself.DeleteItem1(talker, 1557, gg.OwnItemCount(talker, 1557));
myself.DeleteItem1(talker, 1558, gg.OwnItemCount(talker, 1558));
myself.DeleteItem1(talker, 1553, gg.OwnItemCount(talker, 1553));
myself.DeleteItem1(talker, 1555, gg.OwnItemCount(talker, 1555));
myself.GiveItem1(talker, 57, 100);
myself.RemoveMemo(talker, 107);
gg.AddLog(2, talker, 107);
myself.SoundEffect(talker, "ItemSound.quest_giveup");

}

} else if (ask == 107 && reply == 2 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0107_07.htm");
myself.SetFlagJournal(talker, 107, 4);
myself.ShowQuestMark(talker, 107);
myself.DeleteItem1(talker, 1553, gg.OwnItemCount(talker, 1553));
if (gg.OwnItemCount(talker, 1554) == 0) {
myself.GiveItem1(talker, 1554, 1);

}

}

} else if (ask == 107 && reply == 3 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0107_06.htm");
myself.DeleteItem1(talker, 1554, gg.OwnItemCount(talker, 1554));
myself.DeleteItem1(talker, 1556, gg.OwnItemCount(talker, 1556));
myself.DeleteItem1(talker, 1557, gg.OwnItemCount(talker, 1557));
myself.DeleteItem1(talker, 1558, gg.OwnItemCount(talker, 1558));
myself.DeleteItem1(talker, 1553, gg.OwnItemCount(talker, 1553));
myself.DeleteItem1(talker, 1555, gg.OwnItemCount(talker, 1555));
myself.GiveItem1(talker, 57, 200);
myself.RemoveMemo(talker, 107);
gg.AddLog(2, talker, 107);
myself.SoundEffect(talker, "ItemSound.quest_giveup");

}

} else if (ask == 107 && reply == 4 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555) && gg.OwnItemCount(talker, 1558) + gg.OwnItemCount(talker, 1557) + gg.OwnItemCount(talker, 1556) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0107_09.htm");
myself.SetFlagJournal(talker, 107, 6);
myself.ShowQuestMark(talker, 107);
myself.DeleteItem1(talker, 1554, gg.OwnItemCount(talker, 1554));
if (gg.OwnItemCount(talker, 1555) == 0) {
myself.GiveItem1(talker, 1555, 1);

}

}

}
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "urutu_chief_hatos_q0232_02.htm");
myself.GiveItem1(talker, 3394, 1);

}

}

}
super;
	}


}