package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dunkeen extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 4) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 3) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 4) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Shillien Saint (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 2) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0085_0111.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 3) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "dunkeen_q0085_0113.htm");

} else {
myself.ShowPage(talker, "dunkeen_q0085_0112.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 4) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0085_0114.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 2) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0086_0111.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 3) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "dunkeen_q0086_0113.htm");

} else {
myself.ShowPage(talker, "dunkeen_q0086_0112.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 4) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0086_0114.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 2) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0087_0111.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 3) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "dunkeen_q0087_0113.htm");

} else {
myself.ShowPage(talker, "dunkeen_q0087_0112.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 4) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0087_0114.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 2) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0098_0111.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 3) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "dunkeen_q0098_0113.htm");

} else {
myself.ShowPage(talker, "dunkeen_q0098_0112.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 4) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dunkeen_q0098_0114.htm");

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
if (reply == 3) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 2) {
myself.SetMemoState(talker, 85, 3);
myself.ShowPage(talker, "dunkeen_q0085_0115.htm");
myself.SetFlagJournal(talker, 85, 3);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7522, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 85, 4);
myself.ShowPage(talker, "dunkeen_q0085_0116.htm");
myself.SetFlagJournal(talker, 85, 4);
myself.ShowQuestMark(talker, 85);
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
if (reply == 3) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 2) {
myself.SetMemoState(talker, 86, 3);
myself.ShowPage(talker, "dunkeen_q0086_0115.htm");
myself.SetFlagJournal(talker, 86, 3);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7523, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 86, 4);
myself.ShowPage(talker, "dunkeen_q0086_0116.htm");
myself.SetFlagJournal(talker, 86, 4);
myself.ShowQuestMark(talker, 86);
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
if (reply == 3) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 2) {
myself.SetMemoState(talker, 87, 3);
myself.ShowPage(talker, "dunkeen_q0087_0115.htm");
myself.SetFlagJournal(talker, 87, 3);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7524, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 87, 4);
myself.ShowPage(talker, "dunkeen_q0087_0116.htm");
myself.SetFlagJournal(talker, 87, 4);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 98) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 98) {
if (reply == 3) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 2) {
myself.SetMemoState(talker, 98, 3);
myself.ShowPage(talker, "dunkeen_q0098_0115.htm");
myself.SetFlagJournal(talker, 98, 3);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7525, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 98, 4);
myself.ShowPage(talker, "dunkeen_q0098_0116.htm");
myself.SetFlagJournal(talker, 98, 4);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}