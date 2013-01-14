package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sage_kasian extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 16) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 17) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1 && gg.OwnItemCount(talker, 2709) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 3) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 7 && gg.OwnItemCount(talker, 4328) < 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 7 && gg.OwnItemCount(talker, 4328) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 11) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 370) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "An Elder Sows Seeds");

}
if (gg.HaveMemo(talker, 370) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "An Elder Sows Seeds (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) < 4 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 4 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 5 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 6 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 7 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) < 4 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 4 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 6 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Fallen Angel - Request of Dusk (In Progress)");

}
if (gg.HaveMemo(talker, 130) == 0 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Path to Hellbound");

}
if (myself.GetOneTimeQuestFlag(talker, 130) == 1) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Path to Hellbound (Done)");

}
if (gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 1 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Path to Hellbound (In Progress)");

}
if (gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 2 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Path to Hellbound (In Progress)");

}
if (gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 3 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Path to Hellbound (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 16) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_kasian_q0215_01.htm");
myself.SetMemoState(talker, 215, 17);
myself.DeleteItem1(talker, 2727, gg.OwnItemCount(talker, 2727));
myself.DeleteItem1(talker, 2724, gg.OwnItemCount(talker, 2724));
myself.DeleteItem1(talker, 2730, gg.OwnItemCount(talker, 2730));
if (gg.OwnItemCount(talker, 2722) == 0) {
myself.GiveItem1(talker, 2722, 1);

}
if (gg.OwnItemCount(talker, 2731)) {
myself.IncrementParam(talker, 0, 5000);
myself.IncrementParam(talker, 1, 500);
myself.DeleteItem1(talker, 2731, 1);

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 17) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0215_02.htm");
myself.SetFlagJournal(talker, 215, 17);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0228_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2844) >= 1 && gg.OwnItemCount(talker, 2845) >= 1 && gg.OwnItemCount(talker, 2846) >= 1) {
myself.ShowPage(talker, "sage_kasian_q0228_04.htm");

} else {
myself.ShowPage(talker, "sage_kasian_q0228_03.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0228_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1) {
myself.ShowPage(talker, "sage_kasian_q0214_02.htm");

} else {
myself.ShowPage(talker, "sage_kasian_q0214_01.htm");
myself.SetFlagJournal(talker, 214, 27);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2716) + gg.OwnItemCount(talker, 2717) + gg.OwnItemCount(talker, 2718) + gg.OwnItemCount(talker, 2719) < 32) {
myself.ShowPage(talker, "sage_kasian_q0214_05.htm");

} else {
myself.ShowPage(talker, "sage_kasian_q0214_06.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1 && gg.OwnItemCount(talker, 2709) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0214_08.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 3) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 7);
myself.ShowPage(talker, "sage_kasian_q0422_01.htm");
myself.SetFlagJournal(talker, 422, 8);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 7 && gg.OwnItemCount(talker, 4328) < 1) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0422_02.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 7 && gg.OwnItemCount(talker, 4328) >= 1) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 11);
myself.DeleteItem1(talker, 4328, gg.OwnItemCount(talker, 4328));
myself.ShowPage(talker, "sage_kasian_q0422_03.htm");
myself.SetFlagJournal(talker, 422, 12);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 11) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0422_04.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 370) == 0) {
myself.SetCurrentQuestID(370);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 28) {
myself.ShowPage(talker, "sage_kasian_q0370_01.htm");

} else if (talker.level >= 28) {
myself.ShowQuestPage(talker, "sage_kasian_q0370_02.htm", 370);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 370) == 1) {
myself.SetCurrentQuestID(370);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0370_06.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) < 4 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0142_01.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 4 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 142, 5);
myself.ShowPage(talker, "sage_kasian_q0142_02.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 5 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0142_03.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 6 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0142_07.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 7 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0142_11.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) < 4 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0143_01.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 4 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0143_02.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0143_04.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) >= 6 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0143_10.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 130) == 0 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.GetStep_FieldCycle(1) >= 1) {
if (talker.level >= 78) {
myself.ShowQuestPage(talker, "sage_kasian_q0130_01.htm", 130);

} else {
myself.ShowQuestPage(talker, "sage_kasian_q0130_02.htm", 130);

}

} else {
myself.ShowQuestPage(talker, "sage_kasian_q0130_03.htm", 130);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 24: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 130) == 1) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 1 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0130_06.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 2 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0130_07.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 3 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sage_kasian_q0130_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 370) {
myself.SetCurrentQuestID(370);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 370);
gg.AddLog(1, talker, 370);
myself.SetFlagJournal(talker, 370, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sage_kasian_q0370_05.htm", 370);

}
return;

}
if (quest_id == 130) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 130) == 0 && talker.level >= 78 && gg.GetStep_FieldCycle(1) >= 1) {
myself.SetMemoState(talker, 130, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sage_kasian_q0130_05.htm", 130);
myself.SetFlagJournal(talker, 130, 1);
myself.ShowQuestMark(talker, 130);

}
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 228) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 228) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_kasian_q0228_02.htm");
myself.GiveItem1(talker, 2843, 1);
myself.DeleteItem1(talker, 2842, gg.OwnItemCount(talker, 2842));
myself.SetFlagJournal(talker, 228, 3);
myself.ShowQuestMark(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
myself.ShowPage(talker, "sage_kasian_q0214_03.htm");

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_kasian_q0214_04.htm");
myself.SetFlagJournal(talker, 214, 28);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2715, 1);

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sage_kasian_q0214_07.htm");
myself.SetFlagJournal(talker, 214, 30);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2709, 1);
myself.DeleteItem1(talker, 2715, gg.OwnItemCount(talker, 2715));
myself.DeleteItem1(talker, 2716, gg.OwnItemCount(talker, 2716));
myself.DeleteItem1(talker, 2717, gg.OwnItemCount(talker, 2717));
myself.DeleteItem1(talker, 2718, gg.OwnItemCount(talker, 2718));
myself.DeleteItem1(talker, 2719, gg.OwnItemCount(talker, 2719));
myself.DeleteItem1(talker, 2711, gg.OwnItemCount(talker, 2711));

}

}

}
if (ask == 370) {
myself.SetCurrentQuestID(370);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 370) {
if (reply == 1) {
myself.ShowQuestPage(talker, "sage_kasian_q0370_03.htm", 370);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "sage_kasian_q0370_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 370);
myself.ShowQuestFHTML(talker, fhtml0, 370);

}
if (reply == 3 && gg.HaveMemo(talker, 370) == 1) {
if (gg.OwnItemCount(talker, 5918) == 0 || gg.OwnItemCount(talker, 5920) == 0 || gg.OwnItemCount(talker, 5919) == 0 || gg.OwnItemCount(talker, 5917) == 0) {
myself.ShowPage(talker, "sage_kasian_q0370_07.htm");

} else if (gg.OwnItemCount(talker, 5918) >= 1 && gg.OwnItemCount(talker, 5920) >= 1 && gg.OwnItemCount(talker, 5919) >= 1 && gg.OwnItemCount(talker, 5917) >= 1) {
i0 = gg.OwnItemCount(talker, 5918);
if (i0 > gg.OwnItemCount(talker, 5920)) {
i0 = gg.OwnItemCount(talker, 5920);

}
if (i0 > gg.OwnItemCount(talker, 5919)) {
i0 = gg.OwnItemCount(talker, 5919);

}
if (i0 > gg.OwnItemCount(talker, 5917)) {
i0 = gg.OwnItemCount(talker, 5917);

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, i0 * 3600);
myself.DeleteItem1(talker, 5918, i0);
myself.DeleteItem1(talker, 5920, i0);
myself.DeleteItem1(talker, 5919, i0);
myself.DeleteItem1(talker, 5917, i0);
myself.ShowPage(talker, "sage_kasian_q0370_08.htm");
gg.AddLog(3, talker, 370);

}

}

}
if (reply == 4) {
myself.ShowPage(talker, "sage_kasian_q0370_09.htm");

}
if (reply == 5 && gg.HaveMemo(talker, 370) == 1) {
if (gg.OwnItemCount(talker, 5918) == 0 || gg.OwnItemCount(talker, 5920) == 0 || gg.OwnItemCount(talker, 5919) == 0 || gg.OwnItemCount(talker, 5917) == 0) {
myself.RemoveMemo(talker, 370);
gg.AddLog(2, talker, 370);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sage_kasian_q0370_10.htm");

} else if (gg.OwnItemCount(talker, 5918) >= 1 && gg.OwnItemCount(talker, 5920) >= 1 && gg.OwnItemCount(talker, 5919) >= 1 && gg.OwnItemCount(talker, 5917) >= 1) {
i0 = gg.OwnItemCount(talker, 5918);
if (i0 > gg.OwnItemCount(talker, 5920)) {
i0 = gg.OwnItemCount(talker, 5920);

}
if (i0 > gg.OwnItemCount(talker, 5919)) {
i0 = gg.OwnItemCount(talker, 5919);

}
if (i0 > gg.OwnItemCount(talker, 5917)) {
i0 = gg.OwnItemCount(talker, 5917);

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, i0 * 3600);
myself.DeleteItem1(talker, 5918, i0);
myself.DeleteItem1(talker, 5920, i0);
myself.DeleteItem1(talker, 5919, i0);
myself.DeleteItem1(talker, 5917, i0);
gg.AddLog(2, talker, 370);
myself.RemoveMemo(talker, 370);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sage_kasian_q0370_11.htm");

}

}

}

}
if (ask == 142) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 142) {
if (reply == 5) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 5 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "sage_kasian_q0142_04.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 5 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "sage_kasian_q0142_05.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 5 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetMemoState(talker, 142, 6);
myself.ShowPage(talker, "sage_kasian_q0142_06.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 6 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "sage_kasian_q0142_08.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 6 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "sage_kasian_q0142_09.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 6 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetMemoState(talker, 142, 7);
myself.ShowPage(talker, "sage_kasian_q0142_10.htm");
myself.SetFlagJournal(talker, 142, 4);
myself.ShowQuestMark(talker, 142);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 143) {
myself.SetCurrentQuestID(143);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 143) {
if (reply == 5) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 4 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.DeleteItem1(talker, 10355, gg.OwnItemCount(talker, 10355));
myself.SetMemoState(talker, 143, 5);
myself.ShowPage(talker, "sage_kasian_q0143_03.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "sage_kasian_q0143_05.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "sage_kasian_q0143_06.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "sage_kasian_q0143_07.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.ShowPage(talker, "sage_kasian_q0143_08.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 143) == 1 && gg.GetMemoState(talker, 143) == 5 && myself.GetOneTimeQuestFlag(talker, 143) == 0) {
myself.GiveItem1(talker, 10357, 1);
myself.SetMemoState(talker, 143, 8);
myself.ShowPage(talker, "sage_kasian_q0143_09.htm");
myself.SetFlagJournal(talker, 143, 4);
myself.ShowQuestMark(talker, 143);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 130) {
myself.SetCurrentQuestID(130);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 130) {
if (reply == 1) {
if (gg.HaveMemo(talker, 130) == 0 && talker.level >= 78 && gg.GetStep_FieldCycle(1) >= 1 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.FHTML_SetFileName(fhtml0, "sage_kasian_q0130_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 130);
myself.ShowQuestFHTML(talker, fhtml0, 130);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 130) == 1 && gg.GetMemoState(talker, 130) == 2 && myself.GetOneTimeQuestFlag(talker, 130) == 0) {
myself.GiveItem1(talker, 12823, 1);
myself.SetMemoState(talker, 130, 3);
myself.ShowPage(talker, "sage_kasian_q0130_08.htm");
myself.SetFlagJournal(talker, 130, 3);
myself.ShowQuestMark(talker, 130);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}