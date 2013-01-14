package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_justin extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) >= 2 && gg.GetMemoState(talker, 88) <= 4 && gg.OwnItemCount(talker, 7529) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) >= 2 && gg.GetMemoState(talker, 88) <= 4 && gg.OwnItemCount(talker, 7529) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 11) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 12) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) >= 2 && gg.GetMemoState(talker, 69) <= 4 && gg.OwnItemCount(talker, 9761) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) >= 2 && gg.GetMemoState(talker, 69) <= 4 && gg.OwnItemCount(talker, 9761) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 5) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Trickster (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) >= 2 && gg.GetMemoState(talker, 88) <= 4 && gg.OwnItemCount(talker, 7529) == 0) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) >= 2 && gg.GetMemoState(talker, 88) <= 4 && gg.OwnItemCount(talker, 7529) >= 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 5) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0121.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0124.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0125.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 10) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0126.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 11) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0131.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 12) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0088_0132.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 1) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0069_0101.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) >= 2 && gg.GetMemoState(talker, 69) <= 4 && gg.OwnItemCount(talker, 9761) == 0) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0069_0102.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) >= 2 && gg.GetMemoState(talker, 69) <= 4 && gg.OwnItemCount(talker, 9761) >= 1) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0069_0103.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 5) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_justin_q0069_0104.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 1) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 1) {
myself.SetMemoState(talker, 88, 2);
myself.ShowPage(talker, "magister_justin_q0088_0105.htm");
myself.SetFlagJournal(talker, 88, 2);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) >= 2 && gg.GetMemoState(talker, 88) <= 4 && gg.OwnItemCount(talker, 7529) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7286, 1);
myself.DeleteItem1(talker, 7529, gg.OwnItemCount(talker, 7529));
myself.SetMemoState(talker, 88, 5);
myself.ShowPage(talker, "magister_justin_q0088_0106.htm");
myself.SetFlagJournal(talker, 88, 5);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 5) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
myself.ShowPage(talker, "magister_justin_q0088_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
myself.SetMemoState(talker, 88, 9);
myself.ShowPage(talker, "magister_justin_q0088_0122.htm");
myself.SetFlagJournal(talker, 88, 11);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 8) {
myself.SetMemoState(talker, 88, 9);
myself.ShowPage(talker, "magister_justin_q0088_0123.htm");
myself.SetFlagJournal(talker, 88, 12);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7379, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 88, 10);
myself.ShowPage(talker, "magister_justin_q0088_0128.htm");
myself.SetFlagJournal(talker, 88, 13);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 9) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 11) {
myself.SetMemoState(talker, 88, 12);
myself.ShowPage(talker, "magister_justin_q0088_0133.htm");
myself.SetFlagJournal(talker, 88, 15);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 69) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 69) {
if (reply == 1) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 1) {
myself.SetMemoState(talker, 69, 2);
myself.ShowPage(talker, "magister_justin_q0069_0105.htm");
myself.SetFlagJournal(talker, 69, 2);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) >= 2 && gg.GetMemoState(talker, 69) <= 4 && gg.OwnItemCount(talker, 9761) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 9724, 1);
myself.DeleteItem1(talker, 9761, gg.OwnItemCount(talker, 9761));
myself.SetMemoState(talker, 69, 5);
myself.ShowPage(talker, "magister_justin_q0069_0106.htm");
myself.SetFlagJournal(talker, 69, 5);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}