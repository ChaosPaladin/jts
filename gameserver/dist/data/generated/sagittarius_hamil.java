package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sagittarius_hamil extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 1 && gg.OwnItemCount(talker, 3294)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 2 && gg.OwnItemCount(talker, 3295)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 4 && gg.OwnItemCount(talker, 3298) == 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 5 && gg.OwnItemCount(talker, 3296)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 9 && gg.OwnItemCount(talker, 3297)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 12 && gg.OwnItemCount(talker, 3028)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 13) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 14 && gg.OwnItemCount(talker, 3300)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of Sagittarius (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 1 && gg.OwnItemCount(talker, 3294)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 2 && gg.OwnItemCount(talker, 3295)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 4 && gg.OwnItemCount(talker, 3298) == 10) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 5 && gg.OwnItemCount(talker, 3296)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 8) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sagittarius_hamil_q0224_09.htm");
myself.GiveItem1(talker, 3297, 1);
myself.DeleteItem1(talker, 3299, gg.OwnItemCount(talker, 3299));
myself.SetMemoState(talker, 224, 9);
myself.SetFlagJournal(talker, 224, 9);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 9 && gg.OwnItemCount(talker, 3297)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 12 && gg.OwnItemCount(talker, 3028)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_11.htm");
myself.SetMemoState(talker, 224, 13);
myself.SetFlagJournal(talker, 224, 13);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 13) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_12.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 14 && gg.OwnItemCount(talker, 3300)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sagittarius_hamil_q0224_13.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3293, 1);
myself.DeleteItem1(talker, 3028, gg.OwnItemCount(talker, 3028));
myself.DeleteItem1(talker, 3300, 1);
myself.DeleteItem1(talker, 3306, gg.OwnItemCount(talker, 3306));
myself.IncrementParam(talker, 0, 894888);
myself.IncrementParam(talker, 1, 61408);
myself.GiveItem1(talker, 57, 161806);
myself.RemoveMemo(talker, 224);
gg.AddLog(2, talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 224, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);

}

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 224) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 224) {
if (reply == 1) {
myself.ShowPage(talker, "sagittarius_hamil_q0224_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 3294) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sagittarius_hamil_q0224_03.htm");
myself.GiveItem1(talker, 3295, 1);
myself.DeleteItem1(talker, 3294, 1);
myself.SetMemoState(talker, 224, 2);
myself.SetFlagJournal(talker, 224, 2);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 3) {
myself.ShowPage(talker, "sagittarius_hamil_q0224_06.htm");

} else if (reply == 4 && gg.OwnItemCount(talker, 3298) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sagittarius_hamil_q0224_07.htm");
myself.GiveItem1(talker, 3296, 1);
myself.DeleteItem1(talker, 3298, 10);
myself.SetMemoState(talker, 224, 5);
myself.SetFlagJournal(talker, 224, 5);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}