package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_feynn extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) >= 2 && gg.GetMemoState(talker, 72) <= 4 && gg.OwnItemCount(talker, 7536) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) >= 2 && gg.GetMemoState(talker, 72) <= 4 && gg.OwnItemCount(talker, 7536) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Sword Muse (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_feynn_q0072_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) >= 2 && gg.GetMemoState(talker, 72) <= 4 && gg.OwnItemCount(talker, 7536) == 0) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_feynn_q0072_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) >= 2 && gg.GetMemoState(talker, 72) <= 4 && gg.OwnItemCount(talker, 7536) >= 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_feynn_q0072_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 5) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_feynn_q0072_0104.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 1) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 1) {
myself.SetMemoState(talker, 72, 2);
myself.ShowPage(talker, "blacksmith_feynn_q0072_0105.htm");
myself.SetFlagJournal(talker, 72, 2);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) >= 2 && gg.GetMemoState(talker, 72) <= 4 && gg.OwnItemCount(talker, 7536) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7270, 1);
myself.DeleteItem1(talker, 7536, gg.OwnItemCount(talker, 7536));
myself.SetMemoState(talker, 72, 5);
myself.ShowPage(talker, "blacksmith_feynn_q0072_0106.htm");
myself.SetFlagJournal(talker, 72, 5);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}