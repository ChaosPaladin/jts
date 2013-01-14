package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lizardman_of_wasteland extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1283) != 0 && gg.OwnItemCount(talker, 1284) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1283) != 0 && gg.OwnItemCount(talker, 1284) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1283) != 0 && gg.OwnItemCount(talker, 1284) == 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lizardman_of_wasteland_q0404_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1283) != 0 && gg.OwnItemCount(talker, 1284) != 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lizardman_of_wasteland_q0404_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 404) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 404) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1284) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lizardman_of_wasteland_q0404_03.htm");
myself.GiveItem1(talker, 1284, 1);
myself.SetFlagJournal(talker, 404, 6);
myself.ShowQuestMark(talker, 404);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}