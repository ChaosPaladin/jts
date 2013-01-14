package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_marina extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2661) == 1 && gg.OwnItemCount(talker, 2662) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2664) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2665) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2661) == 1 && gg.OwnItemCount(talker, 2662) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_marina_q0213_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_marina_q0213_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2664) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_marina_q0213_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2665) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_marina_q0213_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 213) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (ask == 213) {
if (reply == 1) {
myself.ShowPage(talker, "magister_marina_q0213_02.htm");
myself.DeleteItem1(talker, 2661, gg.OwnItemCount(talker, 2661));
myself.DeleteItem1(talker, 2662, gg.OwnItemCount(talker, 2662));
myself.GiveItem1(talker, 2663, 1);
myself.SetFlagJournal(talker, 213, 12);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 2) {
myself.ShowPage(talker, "magister_marina_q0213_05.htm");
myself.DeleteItem1(talker, 2664, gg.OwnItemCount(talker, 2664));
myself.GiveItem1(talker, 2665, 1);
myself.SetFlagJournal(talker, 213, 14);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}