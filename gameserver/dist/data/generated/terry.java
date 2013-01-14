package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class terry extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2647) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2648) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2649) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2650) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2651) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2652) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2659) == 1 || gg.OwnItemCount(talker, 2662) == 1 || gg.OwnItemCount(talker, 2663) == 1 || gg.OwnItemCount(talker, 2664) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2665) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2666) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2667) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2672) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Trial of the Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2647) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2648) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2653) == 0) {
myself.ShowPage(talker, "terry_q0213_04.htm");

} else {
myself.ShowPage(talker, "terry_q0213_05.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2649) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2649) == 1) {
if (gg.OwnItemCount(talker, 2654) + gg.OwnItemCount(talker, 2655) + gg.OwnItemCount(talker, 2656) + gg.OwnItemCount(talker, 2657) < 4) {
myself.ShowPage(talker, "terry_q0213_08.htm");

} else {
myself.ShowPage(talker, "terry_q0213_09.htm");

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2650) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_11.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2651) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_12.htm");
myself.DeleteItem1(talker, 2651, gg.OwnItemCount(talker, 2651));
myself.GiveItem1(talker, 2652, 1);
myself.SetFlagJournal(talker, 213, 8);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2652) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_13.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2659) == 1 || gg.OwnItemCount(talker, 2662) == 1 || gg.OwnItemCount(talker, 2663) == 1 || gg.OwnItemCount(talker, 2664) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_14.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2665) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_15.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2666) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 36) {
myself.ShowPage(talker, "terry_q0213_20.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_21.htm");
myself.DeleteItem1(talker, 2666, 1);
myself.GiveItem1(talker, 2667, 1);
myself.SetFlagJournal(talker, 213, 15);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2667) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2668) + gg.OwnItemCount(talker, 2669) + gg.OwnItemCount(talker, 2670) + gg.OwnItemCount(talker, 2671) < 4) {
myself.ShowPage(talker, "terry_q0213_22.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_23.htm");
myself.SetFlagJournal(talker, 213, 17);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2672, 1);
myself.DeleteItem1(talker, 2667, gg.OwnItemCount(talker, 2667));
myself.DeleteItem1(talker, 2668, gg.OwnItemCount(talker, 2668));
myself.DeleteItem1(talker, 2669, gg.OwnItemCount(talker, 2669));
myself.DeleteItem1(talker, 2670, gg.OwnItemCount(talker, 2670));
myself.DeleteItem1(talker, 2671, gg.OwnItemCount(talker, 2671));

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2672) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "terry_q0213_24.htm");

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
if (ask == 213) {
if (reply == 1) {
myself.ShowPage(talker, "terry_q0213_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 2647) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_03.htm");
myself.DeleteItem1(talker, 2647, 1);
myself.GiveItem1(talker, 2648, 1);
myself.SetFlagJournal(talker, 213, 2);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 2648) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_06.htm");
myself.DeleteItem1(talker, 2653, gg.OwnItemCount(talker, 2653));
myself.DeleteItem1(talker, 2648, 1);
myself.GiveItem1(talker, 2649, 1);
myself.SetFlagJournal(talker, 213, 4);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_10.htm");
myself.SetFlagJournal(talker, 213, 6);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2654, gg.OwnItemCount(talker, 2654));
myself.DeleteItem1(talker, 2655, gg.OwnItemCount(talker, 2655));
myself.DeleteItem1(talker, 2656, gg.OwnItemCount(talker, 2656));
myself.DeleteItem1(talker, 2657, gg.OwnItemCount(talker, 2657));
myself.DeleteItem1(talker, 2649, gg.OwnItemCount(talker, 2649));
myself.GiveItem1(talker, 2650, 1);
myself.GiveItem1(talker, 2658, 1);

}

}
if (reply == 5) {
myself.ShowPage(talker, "terry_q0213_16.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 2665) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "terry_q0213_18.htm");
myself.DeleteItem1(talker, 2665, 1);
myself.GiveItem1(talker, 2667, 1);
myself.SetFlagJournal(talker, 213, 15);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}