package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class freighter_stefano extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Trickster (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 2) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "freighter_stefano_q0069_0111.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 3) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "freighter_stefano_q0069_0113.htm");

} else {
myself.ShowPage(talker, "freighter_stefano_q0069_0112.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 4) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "freighter_stefano_q0069_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 69) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 69) {
if (reply == 3) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 2) {
myself.SetMemoState(talker, 69, 3);
myself.ShowPage(talker, "freighter_stefano_q0069_0115.htm");
myself.SetFlagJournal(talker, 69, 3);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 9761, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 69, 4);
myself.ShowPage(talker, "freighter_stefano_q0069_0116.htm");
myself.SetFlagJournal(talker, 69, 4);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}