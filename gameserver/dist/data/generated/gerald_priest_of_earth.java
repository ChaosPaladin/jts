package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gerald_priest_of_earth extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.OwnItemCount(talker, 2727) && gg.OwnItemCount(talker, 2726)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.OwnItemCount(talker, 7574) >= 1 && gg.GetMemoState(talker, 10) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Into the World (In Progress)");

}
if (gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Into the World (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gerald_priest_of_earth_q0215_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.OwnItemCount(talker, 2727) && gg.OwnItemCount(talker, 2726)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gerald_priest_of_earth_q0215_04.htm");
myself.GiveItem1(talker, 57, 100000);
myself.DeleteItem1(talker, 2726, 1);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.OwnItemCount(talker, 7574) >= 1 && gg.GetMemoState(talker, 10) == 2 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 10, 2);
myself.ShowPage(talker, "gerald_priest_of_earth_q0010_0201.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10) == 1 && gg.GetMemoState(talker, 10) == 3 * 10 + 1) {
myself.SetCurrentQuestID(10);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gerald_priest_of_earth_q0010_0303.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 215) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 215) {
if (reply == 1 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733) > 0) {
if (gg.OwnItemCount(talker, 57) >= 100000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gerald_priest_of_earth_q0215_02.htm");
myself.GiveItem1(talker, 2726, 1);
myself.DeleteItem1(talker, 57, 100000);
myself.SetMemoState(talker, 215, 7);

}

} else {
myself.ShowPage(talker, "gerald_priest_of_earth_q0215_03.htm");

}

} else if (reply == 2 && gg.GetMemoState(talker, 215) == 6 && gg.OwnItemCount(talker, 2733) > 0) {
myself.ShowPage(talker, "gerald_priest_of_earth_q0215_03.htm");

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
i0 = myself.GetHTMLCookie(talker, 10, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 10) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7574, 1);
myself.DeleteItem1(talker, 0, 0);
myself.DeleteItem1(talker, 0, 0);
myself.ShowPage(talker, "gerald_priest_of_earth_q0010_0301.htm");
myself.SetMemoState(talker, 10, 3 * 10 + 1);
myself.SetFlagJournal(talker, 10, 3);
myself.ShowQuestMark(talker, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "gerald_priest_of_earth_q0010_0302.htm");

}

}

}

}
super;
	}


}