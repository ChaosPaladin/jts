package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class perrin extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 409) && gg.OwnItemCount(talker, 1231) && gg.OwnItemCount(talker, 1234) && gg.OwnItemCount(talker, 1236)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Oracle (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 1 && gg.OwnItemCount(talker, 2810)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 409) && gg.OwnItemCount(talker, 1231) && gg.OwnItemCount(talker, 1234) && gg.OwnItemCount(talker, 1236)) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1275) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1232, 1);
myself.DeleteItem1(talker, 1275, 1);
myself.ShowPage(talker, "perrin_q0409_04.htm");
myself.SetFlagJournal(talker, 409, 6);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1232) > 0) {
myself.ShowPage(talker, "perrin_q0409_05.htm");

} else if (gg.GetMemoState(talker, 409) == 3) {
myself.ShowPage(talker, "perrin_q0409_06.htm");

} else {
myself.ShowPage(talker, "perrin_q0409_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 1 && gg.OwnItemCount(talker, 2810)) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "perrin_q0226_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 2) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "perrin_q0226_03.htm");
myself.SetMemoState(talker, 226, 3);
myself.DeleteItem1(talker, 2810, gg.OwnItemCount(talker, 2810));
myself.SetFlagJournal(talker, 226, 4);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 3) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "perrin_q0226_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 409) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 409) {
if (reply == 1) {
if (gg.GetMemoState(talker, 409) == 2) {
myself.ShowPage(talker, "perrin_q0409_02.htm");

}

} else if (reply == 2) {
if (gg.GetMemoState(talker, 409) == 2) {
myself.ShowPage(talker, "perrin_q0409_03.htm");

}

} else if (reply == 3) {
if (gg.GetMemoState(talker, 409) == 2) {
myself.CreateOnePrivate(1027035, "tamato", 0, 1);
myself.SetMemoState(talker, 409, 3);

}

}

}
if (ask == 226) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 226) {
if (reply == 1 && gg.GetMemoState(talker, 226) == 1 && gg.OwnItemCount(talker, 2810) > 0) {
myself.ShowPage(talker, "perrin_q0226_02.htm");
myself.SetFlagJournal(talker, 226, 2);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.Maker_GetNpcCount() == 1) {
myself.CreateOnePrivate(1027134, "tatoma", 0, 1);

}

}

}
super;
	}


}