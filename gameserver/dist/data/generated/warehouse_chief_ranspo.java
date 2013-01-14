package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_ranspo extends lv2_warehouse_chief {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 10000 < 1000) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 10000 >= 1000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 378) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Grand Feast");

}
if (gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Grand Feast (In Progress)");

}
if (gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Grand Feast (In Progress)");

}
if (gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Grand Feast (In Progress)");

}
if (gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 4) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Grand Feast (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 10000 < 1000) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 363, 1);
myself.SetMemoStateEx(talker, 363, 1, i0 + 1001);
myself.SetMemoStateEx(talker, 363, 0, 2);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.ShowPage(talker, "ranspo_q0363_01.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 1) {
myself.ShowPage(talker, "ranspo_q0363_02.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 2) {
myself.ShowPage(talker, "ranspo_q0363_03.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 10000 >= 1000) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ranspo_q0363_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 378) == 0) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 20) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_01.htm");

} else if (talker.level >= 20) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_ranspo_q0378_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 378);
myself.ShowQuestFHTML(talker, fhtml0, 378);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 1) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 2) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4421) == 0) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_10.htm");

} else if (gg.OwnItemCount(talker, 4421) >= 1) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_11.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 3) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_13.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 378) == 1 && gg.GetMemoState(talker, 378) == 4) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 5959) == 0) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_19.htm");

} else if (gg.OwnItemCount(talker, 5959) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5959, 1);
if (gg.GetMemoStateEx(talker, 378, 1) == 11) {
myself.GiveItem1(talker, 847, 1);
myself.GiveItem1(talker, 57, 5700);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 12) {
myself.GiveItem1(talker, 846, 2);
myself.GiveItem1(talker, 57, 1200);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 13) {
myself.GiveItem1(talker, 879, 1);
myself.GiveItem1(talker, 57, 8100);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 21) {
myself.GiveItem1(talker, 846, 2);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 22) {
myself.GiveItem1(talker, 879, 1);
myself.GiveItem1(talker, 57, 6900);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 23) {
myself.GiveItem1(talker, 910, 1);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 31) {
myself.GiveItem1(talker, 909, 1);
myself.GiveItem1(talker, 57, 25400);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 32) {
myself.GiveItem1(talker, 890, 2);
myself.GiveItem1(talker, 57, 8500);

} else if (gg.GetMemoStateEx(talker, 378, 1) == 33) {
myself.GiveItem1(talker, 848, 1);
myself.GiveItem1(talker, 57, 2200);

}
myself.RemoveMemo(talker, 378);
gg.AddLog(2, talker, 378);
gg.AddLog(3, talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_20.htm");

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
if (quest_id == 378) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 378);
gg.AddLog(1, talker, 378);
myself.SetFlagJournal(talker, 378, 1);
myself.SetMemoStateEx(talker, 378, 0, 1);
myself.SetMemoStateEx(talker, 378, 1, 0);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_chief_ranspo_q0378_03.htm", 378);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 378) {
myself.SetCurrentQuestID(378);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 378) {
if (reply == 1) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 5956) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5956, 1);
myself.SetFlagJournal(talker, 378, 2);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 2);
myself.SetMemoStateEx(talker, 378, 1, i0 + 10);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_05.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_08.htm");

}

}
if (reply == 2) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 5957) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5957, 1);
myself.SetFlagJournal(talker, 378, 2);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 2);
myself.SetMemoStateEx(talker, 378, 1, i0 + 20);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_06.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_08.htm");

}

}
if (reply == 3) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 5958) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5958, 1);
myself.SetFlagJournal(talker, 378, 2);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 2);
myself.SetMemoStateEx(talker, 378, 1, i0 + 30);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_07.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_08.htm");

}

}
if (reply == 4) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_09.htm");

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 4421) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 4421, 1);
myself.SetFlagJournal(talker, 378, 3);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 3);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_12.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_08.htm");

}

}
if (reply == 6) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 1455) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1455, 1);
myself.SetFlagJournal(talker, 378, 4);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 4);
myself.SetMemoStateEx(talker, 378, 1, i0 + 1);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_14.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_17.htm");

}

}
if (reply == 7) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 1456) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1456, 1);
myself.SetFlagJournal(talker, 378, 4);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 4);
myself.SetMemoStateEx(talker, 378, 1, i0 + 2);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_15.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_17.htm");

}

}
if (reply == 8) {
i0 = gg.GetMemoStateEx(talker, 378, 1);
if (gg.OwnItemCount(talker, 1457) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1457, 1);
myself.SetFlagJournal(talker, 378, 4);
myself.ShowQuestMark(talker, 378);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 378, 0, 4);
myself.SetMemoStateEx(talker, 378, 1, i0 + 3);
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_16.htm");

}

} else {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_17.htm");

}

}
if (reply == 9) {
myself.ShowPage(talker, "warehouse_chief_ranspo_q0378_18.htm");

}

}
super;
	}


}