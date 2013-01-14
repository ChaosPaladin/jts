package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_mia extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shadow Fox - 1");

}
if (myself.GetOneTimeQuestFlag(talker, 139) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shadow Fox - 1 (Done)");

}
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shadow Fox - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 2 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Shadow Fox - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 3 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shadow Fox - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 4 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Shadow Fox - 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 1) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "warehouse_keeper_mia_q0139_01.htm", 139);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 139) == 1) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 2 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_13.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 3 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10345) < 10 || gg.OwnItemCount(talker, 10346) < 1) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_16.htm");

} else {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_17.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 4 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_22.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 139) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 139) == 0 && talker.level >= 37 && myself.GetOneTimeQuestFlag(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 1) {
myself.SetMemoState(talker, 139, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_mia_q0139_05.htm", 139);
myself.SetFlagJournal(talker, 139, 1);
myself.ShowQuestMark(talker, 139);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 139) {
myself.SetCurrentQuestID(139);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 139) {
if (reply == 1) {
if (gg.HaveMemo(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 139) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 1) {
if (talker.level >= 37) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_mia_q0139_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 139);
myself.ShowQuestFHTML(talker, fhtml0, 139);

} else {
myself.ShowQuestPage(talker, "warehouse_keeper_mia_q0139_03.htm", 139);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_07.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_08.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_09.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_10.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_11.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 1 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetMemoState(talker, 139, 2);
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_12.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 2 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_14.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 2 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.SetMemoState(talker, 139, 3);
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_15.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 139, 2);
myself.ShowQuestMark(talker, 139);

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 3 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
i0 = gg.Rand(20);
if (i0 == 0) {
myself.DeleteItem1(talker, 10345, 10);
myself.DeleteItem1(talker, 10346, 1);
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_18.htm");

} else if (i0 == 1) {
myself.DeleteItem1(talker, 10345, 10);
myself.DeleteItem1(talker, 10346, 1);
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_19.htm");

} else if (i0 >= 2) {
myself.DeleteItem1(talker, 10345, gg.OwnItemCount(talker, 10345));
myself.DeleteItem1(talker, 10346, gg.OwnItemCount(talker, 10346));
myself.SetMemoState(talker, 139, 4);
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_20.htm");

}

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 4 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_21.htm");

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 139) == 1 && gg.GetMemoState(talker, 139) == 4 && myself.GetOneTimeQuestFlag(talker, 139) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 43) {
myself.GiveItem1(talker, 57, 14050);
myself.IncrementParam(talker, 0, 30000);
myself.IncrementParam(talker, 1, 2000);

} else {
myself.GiveItem1(talker, 57, 14050);

}
gg.AddLog(3, talker, 139);

}
myself.RemoveMemo(talker, 139);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_mia_q0139_23.htm");
myself.SetOneTimeQuestFlag(talker, 139, 1);
gg.AddLog(2, talker, 139);

}

}

}
super;
	}


}