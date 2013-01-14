package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tree_q0225 extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2806) == 0 && gg.OwnItemCount(talker, 2807) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2806) == 1 && gg.OwnItemCount(talker, 2807) >= 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2806) == 0 && gg.OwnItemCount(talker, 2807) == 0) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tree_q0225_q0225_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 && gg.OwnItemCount(talker, 2806) == 1 && gg.OwnItemCount(talker, 2807) >= 20) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tree_q0225_q0225_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 225) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 225) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tree_q0225_q0225_01a.htm");
if (myself.Maker_GetNpcCount() < 5) {
myself.GiveItem1(talker, 2806, 1);
myself.CreateOnePrivate(1030628, "strong_wooden_chest", 0, 1);
myself.SetFlagJournal(talker, 225, 17);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}