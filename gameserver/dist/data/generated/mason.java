package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mason extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3277)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279) && gg.OwnItemCount(talker, 3290) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279) && gg.OwnItemCount(talker, 3290) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3278)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Champion (In Progress)");

}
if (gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3280) || gg.OwnItemCount(talker, 3281) || gg.OwnItemCount(talker, 3282) || gg.OwnItemCount(talker, 3283) || gg.OwnItemCount(talker, 3284) || gg.OwnItemCount(talker, 3285) || gg.OwnItemCount(talker, 3286)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Champion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3277)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mason_q0223_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279) && gg.OwnItemCount(talker, 3290) < 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mason_q0223_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3279) && gg.OwnItemCount(talker, 3290) >= 10) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mason_q0223_05.htm");
myself.GiveItem1(talker, 3278, 1);
myself.DeleteItem1(talker, 3279, 1);
myself.DeleteItem1(talker, 3290, gg.OwnItemCount(talker, 3290));
myself.SetFlagJournal(talker, 223, 4);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3278)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mason_q0223_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 223) == 1 && gg.OwnItemCount(talker, 3280) || gg.OwnItemCount(talker, 3281) || gg.OwnItemCount(talker, 3282) || gg.OwnItemCount(talker, 3283) || gg.OwnItemCount(talker, 3284) || gg.OwnItemCount(talker, 3285) || gg.OwnItemCount(talker, 3286)) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mason_q0223_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 223) {
myself.SetCurrentQuestID(223);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 223) {
if (reply == 1) {
myself.ShowPage(talker, "mason_q0223_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 3277) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mason_q0223_03.htm");
myself.GiveItem1(talker, 3279, 1);
myself.DeleteItem1(talker, 3277, 1);
myself.SetFlagJournal(talker, 223, 2);
myself.ShowQuestMark(talker, 223);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}