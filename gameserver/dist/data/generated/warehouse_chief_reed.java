package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_reed extends lv1_warehouse_chief {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1551) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1551)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && myself.GetOneTimeQuestFlag(talker, 10) == 0 && gg.GetMemoState(talker, 10) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Into the World (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Into the World (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Into the World (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Into the World (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1551) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_chief_reed_q0005_01.htm");
myself.GiveItem1(talker, 1551, 1);
if (gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 3) {
myself.SetFlagJournal(talker, 5, 2);
myself.ShowQuestMark(talker, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1551)) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_reed_q0005_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && myself.GetOneTimeQuestFlag(talker, 10) == 0 && gg.GetMemoState(talker, 10) == 1 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 10, 1);
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 2 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0202.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 3 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 10, 3);
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0301.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 4 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0402.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 10) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10) {
i0 = myself.GetHTMLCookie(talker, 10, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 10) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7574, 1);
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0201.htm");
myself.SetMemoState(talker, 10, 2 * 10 + 1);
myself.SetFlagJournal(talker, 10, 2);
myself.ShowQuestMark(talker, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 10) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10) {
i0 = myself.GetHTMLCookie(talker, 10, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 10) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_chief_reed_q0010_0401.htm");
myself.SetMemoState(talker, 10, 4 * 10 + 1);
myself.SetFlagJournal(talker, 10, 4);
myself.ShowQuestMark(talker, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}