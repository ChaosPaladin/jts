package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_forest_stone2 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 1 && gg.OwnItemCount(talker, 7152) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Inhabitants of the Forest of the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 1 && gg.OwnItemCount(talker, 7152) >= 1) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone2_q0024_01.htm");
myself.SoundEffect(talker, "AmdSound.d_wind_loot_02");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 2) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone2_q0024_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone2_q0025_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 12) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone2_q0025_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 24) {
myself.SetCurrentQuestID(24);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 24) {
if (reply == 1) {
if (gg.HaveMemo(talker, 24) == 1 && gg.GetMemoState(talker, 24) == 1 && gg.OwnItemCount(talker, 7152) >= 1) {
myself.DeleteItem1(talker, 7152, gg.OwnItemCount(talker, 7152));
myself.SetMemoState(talker, 24, 2);
myself.ShowPage(talker, "q_forest_stone2_q0024_02.htm");
myself.SetFlagJournal(talker, 24, 2);
myself.ShowQuestMark(talker, 24);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 1) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
myself.ShowPage(talker, "q_forest_stone2_q0025_02.htm");
myself.CreateOnePrivateEx(1031536, "q_forest_box1", 0, 0, 60104, -35820, -681, 0, 0, 0, 0);
myself.SetFlagJournal(talker, 25, 12);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}