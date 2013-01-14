package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class priest_bastian extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 10) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 11) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 12) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 8) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 10) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 11) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 12) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of Eva's Saint (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 10) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 11) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 12) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0085_0132.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0121.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0124.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0125.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 10) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0126.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 11) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0131.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 12) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0086_0132.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 8) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0121.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0124.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0125.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 10) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0126.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 11) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0131.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 12) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_bastian_q0087_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 5) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
myself.ShowPage(talker, "priest_bastian_q0085_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
myself.SetMemoState(talker, 85, 9);
myself.ShowPage(talker, "priest_bastian_q0085_0122.htm");
myself.SetFlagJournal(talker, 85, 11);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
myself.SetMemoState(talker, 85, 9);
myself.ShowPage(talker, "priest_bastian_q0085_0123.htm");
myself.SetFlagJournal(talker, 85, 12);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7376, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 85, 10);
myself.ShowPage(talker, "priest_bastian_q0085_0128.htm");
myself.SetFlagJournal(talker, 85, 13);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 9) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 11) {
myself.SetMemoState(talker, 85, 12);
myself.ShowPage(talker, "priest_bastian_q0085_0133.htm");
myself.SetFlagJournal(talker, 85, 15);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 86) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 86) {
if (reply == 5) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
myself.ShowPage(talker, "priest_bastian_q0086_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
myself.SetMemoState(talker, 86, 9);
myself.ShowPage(talker, "priest_bastian_q0086_0122.htm");
myself.SetFlagJournal(talker, 86, 11);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 8) {
myself.SetMemoState(talker, 86, 9);
myself.ShowPage(talker, "priest_bastian_q0086_0123.htm");
myself.SetFlagJournal(talker, 86, 12);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7377, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 86, 10);
myself.ShowPage(talker, "priest_bastian_q0086_0128.htm");
myself.SetFlagJournal(talker, 86, 13);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 86) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 86) {
if (reply == 9) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 11) {
myself.SetMemoState(talker, 86, 12);
myself.ShowPage(talker, "priest_bastian_q0086_0133.htm");
myself.SetFlagJournal(talker, 86, 15);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 87) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 87) {
if (reply == 5) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 8) {
myself.ShowPage(talker, "priest_bastian_q0087_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 8) {
myself.SetMemoState(talker, 87, 9);
myself.ShowPage(talker, "priest_bastian_q0087_0122.htm");
myself.SetFlagJournal(talker, 87, 11);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 8) {
myself.SetMemoState(talker, 87, 9);
myself.ShowPage(talker, "priest_bastian_q0087_0123.htm");
myself.SetFlagJournal(talker, 87, 12);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7378, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 87, 10);
myself.ShowPage(talker, "priest_bastian_q0087_0128.htm");
myself.SetFlagJournal(talker, 87, 13);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 87) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 87) {
if (reply == 9) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 11) {
myself.SetMemoState(talker, 87, 12);
myself.ShowPage(talker, "priest_bastian_q0087_0133.htm");
myself.SetFlagJournal(talker, 87, 15);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}