package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bavarin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 4) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 3) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 4) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 3) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 4) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Fortune Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 2) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0094_0111.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 3) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "bavarin_q0094_0113.htm");

} else {
myself.ShowPage(talker, "bavarin_q0094_0112.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 4) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0094_0114.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 2) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0095_0111.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 3) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "bavarin_q0095_0113.htm");

} else {
myself.ShowPage(talker, "bavarin_q0095_0112.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 4) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0095_0114.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 2) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0096_0111.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 3) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "bavarin_q0096_0113.htm");

} else {
myself.ShowPage(talker, "bavarin_q0096_0112.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 4) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0096_0114.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 2) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0097_0111.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 3) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "bavarin_q0097_0113.htm");

} else {
myself.ShowPage(talker, "bavarin_q0097_0112.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 4) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0097_0114.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 2) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0099_0111.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 3) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "bavarin_q0099_0113.htm");

} else {
myself.ShowPage(talker, "bavarin_q0099_0112.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 4) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bavarin_q0099_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 94) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 94) {
if (reply == 3) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 2) {
myself.SetMemoState(talker, 94, 3);
myself.ShowPage(talker, "bavarin_q0094_0115.htm");
myself.SetFlagJournal(talker, 94, 3);
myself.ShowQuestMark(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7533, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 94, 4);
myself.ShowPage(talker, "bavarin_q0094_0116.htm");
myself.SetFlagJournal(talker, 94, 4);
myself.ShowQuestMark(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 95) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 95) {
if (reply == 3) {
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 2) {
myself.SetMemoState(talker, 95, 3);
myself.ShowPage(talker, "bavarin_q0095_0115.htm");
myself.SetFlagJournal(talker, 95, 3);
myself.ShowQuestMark(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7532, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 95, 4);
myself.ShowPage(talker, "bavarin_q0095_0116.htm");
myself.SetFlagJournal(talker, 95, 4);
myself.ShowQuestMark(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 3) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 2) {
myself.SetMemoState(talker, 96, 3);
myself.ShowPage(talker, "bavarin_q0096_0115.htm");
myself.SetFlagJournal(talker, 96, 3);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7527, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 96, 4);
myself.ShowPage(talker, "bavarin_q0096_0116.htm");
myself.SetFlagJournal(talker, 96, 4);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 97) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 97) {
if (reply == 3) {
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 2) {
myself.SetMemoState(talker, 97, 3);
myself.ShowPage(talker, "bavarin_q0097_0115.htm");
myself.SetFlagJournal(talker, 97, 3);
myself.ShowQuestMark(talker, 97);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7526, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 97, 4);
myself.ShowPage(talker, "bavarin_q0097_0116.htm");
myself.SetFlagJournal(talker, 97, 4);
myself.ShowQuestMark(talker, 97);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 99) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 99) {
if (reply == 3) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 2) {
myself.SetMemoState(talker, 99, 3);
myself.ShowPage(talker, "bavarin_q0099_0115.htm");
myself.SetFlagJournal(talker, 99, 3);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7608, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 99, 4);
myself.ShowPage(talker, "bavarin_q0099_0116.htm");
myself.SetFlagJournal(talker, 99, 4);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}