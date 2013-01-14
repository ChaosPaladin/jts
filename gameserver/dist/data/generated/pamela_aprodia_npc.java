package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pamela_aprodia_npc extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) >= 2 && gg.GetMemoState(talker, 99) <= 4 && gg.OwnItemCount(talker, 7608) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) >= 2 && gg.GetMemoState(talker, 99) <= 4 && gg.OwnItemCount(talker, 7608) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 11) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 12) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Fortune Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) >= 2 && gg.GetMemoState(talker, 99) <= 4 && gg.OwnItemCount(talker, 7608) == 0) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) >= 2 && gg.GetMemoState(talker, 99) <= 4 && gg.OwnItemCount(talker, 7608) >= 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 5) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0121.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0124.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0125.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 10) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0126.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 11) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0131.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 12) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 99) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 99) {
if (reply == 1) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 1) {
myself.SetMemoState(talker, 99, 2);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0105.htm");
myself.SetFlagJournal(talker, 99, 2);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) >= 2 && gg.GetMemoState(talker, 99) <= 4 && gg.OwnItemCount(talker, 7608) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7297, 1);
myself.DeleteItem1(talker, 7608, gg.OwnItemCount(talker, 7608));
myself.SetMemoState(talker, 99, 5);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0106.htm");
myself.SetFlagJournal(talker, 99, 5);
myself.ShowQuestMark(talker, 99);
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
if (reply == 5) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
myself.SetMemoState(talker, 99, 9);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0122.htm");
myself.SetFlagJournal(talker, 99, 11);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 8) {
myself.SetMemoState(talker, 99, 9);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0123.htm");
myself.SetFlagJournal(talker, 99, 12);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7390, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 99, 10);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0128.htm");
myself.SetFlagJournal(talker, 99, 13);
myself.ShowQuestMark(talker, 99);
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
if (reply == 9) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 11) {
myself.SetMemoState(talker, 99, 12);
myself.ShowPage(talker, "pamela_aprodia_npc_q0099_0133.htm");
myself.SetFlagJournal(talker, 99, 15);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}