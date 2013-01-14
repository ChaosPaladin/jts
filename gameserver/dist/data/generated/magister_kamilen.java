package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_kamilen extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) >= 2 && gg.GetMemoState(talker, 90) <= 4 && gg.OwnItemCount(talker, 7531) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) >= 2 && gg.GetMemoState(talker, 90) <= 4 && gg.OwnItemCount(talker, 7531) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 11) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 12) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 3) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 4) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 10) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 11) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 12) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Shillien Saint (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) >= 2 && gg.GetMemoState(talker, 90) <= 4 && gg.OwnItemCount(talker, 7531) == 0) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) >= 2 && gg.GetMemoState(talker, 90) <= 4 && gg.OwnItemCount(talker, 7531) >= 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 5) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0121.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0124.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0125.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 10) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0126.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 11) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0131.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 12) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0090_0132.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 2) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0093_0111.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 3) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "magister_kamilen_q0093_0113.htm");

} else {
myself.ShowPage(talker, "magister_kamilen_q0093_0112.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 4) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0093_0114.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0121.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0124.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0125.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 10) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0126.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 11) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0131.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 12) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kamilen_q0098_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 1) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 1) {
myself.SetMemoState(talker, 90, 2);
myself.ShowPage(talker, "magister_kamilen_q0090_0105.htm");
myself.SetFlagJournal(talker, 90, 2);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) >= 2 && gg.GetMemoState(talker, 90) <= 4 && gg.OwnItemCount(talker, 7531) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7288, 1);
myself.DeleteItem1(talker, 7531, gg.OwnItemCount(talker, 7531));
myself.SetMemoState(talker, 90, 5);
myself.ShowPage(talker, "magister_kamilen_q0090_0106.htm");
myself.SetFlagJournal(talker, 90, 5);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 5) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
myself.ShowPage(talker, "magister_kamilen_q0090_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
myself.SetMemoState(talker, 90, 9);
myself.ShowPage(talker, "magister_kamilen_q0090_0122.htm");
myself.SetFlagJournal(talker, 90, 11);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 8) {
myself.SetMemoState(talker, 90, 9);
myself.ShowPage(talker, "magister_kamilen_q0090_0123.htm");
myself.SetFlagJournal(talker, 90, 12);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7381, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 90, 10);
myself.ShowPage(talker, "magister_kamilen_q0090_0128.htm");
myself.SetFlagJournal(talker, 90, 13);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 9) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 11) {
myself.SetMemoState(talker, 90, 12);
myself.ShowPage(talker, "magister_kamilen_q0090_0133.htm");
myself.SetFlagJournal(talker, 90, 15);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 3) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 2) {
myself.SetMemoState(talker, 93, 3);
myself.ShowPage(talker, "magister_kamilen_q0093_0115.htm");
myself.SetFlagJournal(talker, 93, 3);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7606, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 93, 4);
myself.ShowPage(talker, "magister_kamilen_q0093_0116.htm");
myself.SetFlagJournal(talker, 93, 4);
myself.ShowQuestMark(talker, 93);
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
if (reply == 5) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
myself.ShowPage(talker, "magister_kamilen_q0098_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
myself.SetMemoState(talker, 98, 9);
myself.ShowPage(talker, "magister_kamilen_q0098_0122.htm");
myself.SetFlagJournal(talker, 98, 11);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
myself.SetMemoState(talker, 98, 9);
myself.ShowPage(talker, "magister_kamilen_q0098_0123.htm");
myself.SetFlagJournal(talker, 98, 12);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7389, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 98, 10);
myself.ShowPage(talker, "magister_kamilen_q0098_0128.htm");
myself.SetFlagJournal(talker, 98, 13);
myself.ShowQuestMark(talker, 98);
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
if (reply == 9) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 11) {
myself.SetMemoState(talker, 98, 12);
myself.ShowPage(talker, "magister_kamilen_q0098_0133.htm");
myself.SetFlagJournal(talker, 98, 15);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}