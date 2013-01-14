package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dudamara_totem_spirit extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1626)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1627) && gg.OwnItemCount(talker, 1628) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1627) == 0 && gg.OwnItemCount(talker, 1628)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1630)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Shaman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1626)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1627) && gg.OwnItemCount(talker, 1628) == 0) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1627) == 0 && gg.OwnItemCount(talker, 1628)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_05.htm");
myself.DeleteItem1(talker, 1628, 1);
myself.GiveItem1(talker, 1630, 1);
myself.SetFlagJournal(talker, 416, 11);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1630)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 416) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 416 && reply == 1) {
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_02.htm");

}
if (ask == 416 && reply == 2 && gg.OwnItemCount(talker, 1626) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dudamara_totem_spirit_q0416_03.htm");
myself.DeleteItem1(talker, 1626, 1);
myself.GiveItem1(talker, 1627, 1);
myself.SetFlagJournal(talker, 416, 9);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}