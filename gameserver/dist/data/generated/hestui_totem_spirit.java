package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hestui_totem_spirit extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1620) && gg.OwnItemCount(talker, 1621)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1622)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1625) || gg.OwnItemCount(talker, 1624) || gg.OwnItemCount(talker, 1626) || gg.OwnItemCount(talker, 1627) || gg.OwnItemCount(talker, 1628) || gg.OwnItemCount(talker, 1630) || gg.OwnItemCount(talker, 1623)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Shaman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1620) && gg.OwnItemCount(talker, 1621)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hestui_totem_spirit_q0416_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1622)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hestui_totem_spirit_q0416_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1625) || gg.OwnItemCount(talker, 1624) || gg.OwnItemCount(talker, 1626) || gg.OwnItemCount(talker, 1627) || gg.OwnItemCount(talker, 1628) || gg.OwnItemCount(talker, 1630) || gg.OwnItemCount(talker, 1623)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hestui_totem_spirit_q0416_05.htm");

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
myself.ShowPage(talker, "hestui_totem_spirit_q0416_02.htm");

}
if (ask == 416 && reply == 2 && gg.OwnItemCount(talker, 1620) > 0 && gg.OwnItemCount(talker, 1621) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "hestui_totem_spirit_q0416_03.htm");
myself.DeleteItem1(talker, 1620, 1);
myself.DeleteItem1(talker, 1621, 1);
myself.GiveItem1(talker, 1622, 1);
myself.SetFlagJournal(talker, 416, 4);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}