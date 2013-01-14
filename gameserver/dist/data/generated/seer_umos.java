package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_umos extends mage_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1623)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1624) == 1 && gg.OwnItemCount(talker, 1625) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1624) == 1 && gg.OwnItemCount(talker, 1625) >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1626) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1628) == 1 || gg.OwnItemCount(talker, 1627) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1630) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Orc Shaman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1623)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_umos_q0416_01.htm");
myself.GiveItem1(talker, 1624, 1);
myself.DeleteItem1(talker, 1623, 1);
myself.SetFlagJournal(talker, 416, 6);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1624) == 1 && gg.OwnItemCount(talker, 1625) < 3) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_umos_q0416_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1624) == 1 && gg.OwnItemCount(talker, 1625) >= 3) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_umos_q0416_03.htm");
myself.DeleteItem1(talker, 1624, 1);
myself.DeleteItem1(talker, 1625, gg.OwnItemCount(talker, 1625));
myself.GiveItem1(talker, 1626, 1);
myself.SetFlagJournal(talker, 416, 8);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1626) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_umos_q0416_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1628) == 1 || gg.OwnItemCount(talker, 1627) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_umos_q0416_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1630) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_umos_q0416_06.htm");

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
if (ask == 416 && reply == 2 && gg.OwnItemCount(talker, 1630) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_umos_q0416_07.htm");
myself.DeleteItem1(talker, 1630, gg.OwnItemCount(talker, 1630));
myself.GiveItem1(talker, 1631, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 22992);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 29690);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 36388);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 416);
gg.AddLog(2, talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
super;
	}


}