package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_skahi extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 10) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 11) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 12) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 8) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 10) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 11) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 12) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 10) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 11) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 12) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Doomcryer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 10) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 11) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 12) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0075_0132.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0121.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0124.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0125.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 10) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0126.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 11) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0131.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 12) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0076_0132.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 8) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0121.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0124.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0125.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 10) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0126.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 11) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0131.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 12) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0077_0132.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0121.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0124.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0125.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 10) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0126.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 11) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0131.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 12) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_skahi_q0078_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 75) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 75) {
if (reply == 5) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
myself.ShowPage(talker, "seer_skahi_q0075_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
myself.SetMemoState(talker, 75, 9);
myself.ShowPage(talker, "seer_skahi_q0075_0122.htm");
myself.SetFlagJournal(talker, 75, 11);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
myself.SetMemoState(talker, 75, 9);
myself.ShowPage(talker, "seer_skahi_q0075_0123.htm");
myself.SetFlagJournal(talker, 75, 12);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7366, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 75, 10);
myself.ShowPage(talker, "seer_skahi_q0075_0128.htm");
myself.SetFlagJournal(talker, 75, 13);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 75) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 75) {
if (reply == 9) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 11) {
myself.SetMemoState(talker, 75, 12);
myself.ShowPage(talker, "seer_skahi_q0075_0133.htm");
myself.SetFlagJournal(talker, 75, 15);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 76) {
if (reply == 5) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
myself.ShowPage(talker, "seer_skahi_q0076_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
myself.SetMemoState(talker, 76, 9);
myself.ShowPage(talker, "seer_skahi_q0076_0122.htm");
myself.SetFlagJournal(talker, 76, 11);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 8) {
myself.SetMemoState(talker, 76, 9);
myself.ShowPage(talker, "seer_skahi_q0076_0123.htm");
myself.SetFlagJournal(talker, 76, 12);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7367, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 76, 10);
myself.ShowPage(talker, "seer_skahi_q0076_0128.htm");
myself.SetFlagJournal(talker, 76, 13);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 76) {
if (reply == 9) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 11) {
myself.SetMemoState(talker, 76, 12);
myself.ShowPage(talker, "seer_skahi_q0076_0133.htm");
myself.SetFlagJournal(talker, 76, 15);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 77) {
if (reply == 5) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 8) {
myself.ShowPage(talker, "seer_skahi_q0077_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 8) {
myself.SetMemoState(talker, 77, 9);
myself.ShowPage(talker, "seer_skahi_q0077_0122.htm");
myself.SetFlagJournal(talker, 77, 11);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 8) {
myself.SetMemoState(talker, 77, 9);
myself.ShowPage(talker, "seer_skahi_q0077_0123.htm");
myself.SetFlagJournal(talker, 77, 12);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7368, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 77, 10);
myself.ShowPage(talker, "seer_skahi_q0077_0128.htm");
myself.SetFlagJournal(talker, 77, 13);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 77) {
if (reply == 9) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 11) {
myself.SetMemoState(talker, 77, 12);
myself.ShowPage(talker, "seer_skahi_q0077_0133.htm");
myself.SetFlagJournal(talker, 77, 15);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 78) {
if (reply == 5) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
myself.ShowPage(talker, "seer_skahi_q0078_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
myself.SetMemoState(talker, 78, 9);
myself.ShowPage(talker, "seer_skahi_q0078_0122.htm");
myself.SetFlagJournal(talker, 78, 11);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 8) {
myself.SetMemoState(talker, 78, 9);
myself.ShowPage(talker, "seer_skahi_q0078_0123.htm");
myself.SetFlagJournal(talker, 78, 12);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7369, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 78, 10);
myself.ShowPage(talker, "seer_skahi_q0078_0128.htm");
myself.SetFlagJournal(talker, 78, 13);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 78) {
if (reply == 9) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 11) {
myself.SetMemoState(talker, 78, 12);
myself.ShowPage(talker, "seer_skahi_q0078_0133.htm");
myself.SetFlagJournal(talker, 78, 15);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}