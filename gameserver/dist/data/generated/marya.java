package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marya extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2692) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2679) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2681) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2683) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2682) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2684) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2685) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1 && gg.OwnItemCount(talker, 2687) < 5) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1 && gg.OwnItemCount(talker, 2687) >= 5) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2688) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2710) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2710) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3818) == 1 && gg.OwnItemCount(talker, 1870) < 10 || gg.OwnItemCount(talker, 1871) < 10 || gg.OwnItemCount(talker, 2130) == 0 || gg.OwnItemCount(talker, 1873) < 3 || gg.OwnItemCount(talker, 3820) < 10 || gg.OwnItemCount(talker, 3819) == 1 && gg.OwnItemCount(talker, 1870) < 10 || gg.OwnItemCount(talker, 1871) < 10 || gg.OwnItemCount(talker, 2131) == 0 || gg.OwnItemCount(talker, 1875) == 0 || gg.OwnItemCount(talker, 1873) < 5 || gg.OwnItemCount(talker, 3820) < 20) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3818) == 1 && gg.OwnItemCount(talker, 1870) >= 10 && gg.OwnItemCount(talker, 1871) >= 10 && gg.OwnItemCount(talker, 2130) >= 1 && gg.OwnItemCount(talker, 1873) >= 3 && gg.OwnItemCount(talker, 3820) >= 10) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3819) == 1 && gg.OwnItemCount(talker, 1870) >= 10 && gg.OwnItemCount(talker, 1871) >= 10 && gg.OwnItemCount(talker, 2131) >= 1 && gg.OwnItemCount(talker, 1875) >= 1 && gg.OwnItemCount(talker, 1873) >= 5 && gg.OwnItemCount(talker, 3820) >= 20) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 660) == 0 && talker.level >= 30) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Aiding the Floran Village.");

}
if (gg.HaveMemo(talker, 660) == 0 && talker.level < 30) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Aiding the Floran Village.");

}
if (gg.HaveMemo(talker, 660) == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Aiding the Floran Village (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2692) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2679) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2681) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_04.htm");
myself.SetFlagJournal(talker, 214, 5);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2681, 1);
myself.GiveItem1(talker, 2680, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2683) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2682) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2684) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_10.htm");
myself.SetFlagJournal(talker, 214, 9);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2684, 1);
myself.GiveItem1(talker, 2685, 1);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2685) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_11.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1 && gg.OwnItemCount(talker, 2687) < 5) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_12.htm");
myself.SetFlagJournal(talker, 214, 11);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1 && gg.OwnItemCount(talker, 2687) >= 5) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_13.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2688) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_15.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_16.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2710) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0214_17.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2710) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_18.htm");
myself.DeleteItem1(talker, 2710, 1);
myself.GiveItem1(talker, 2714, 1);

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3818) == 1 && gg.OwnItemCount(talker, 1870) < 10 || gg.OwnItemCount(talker, 1871) < 10 || gg.OwnItemCount(talker, 2130) == 0 || gg.OwnItemCount(talker, 1873) < 3 || gg.OwnItemCount(talker, 3820) < 10 || gg.OwnItemCount(talker, 3819) == 1 && gg.OwnItemCount(talker, 1870) < 10 || gg.OwnItemCount(talker, 1871) < 10 || gg.OwnItemCount(talker, 2131) == 0 || gg.OwnItemCount(talker, 1875) == 0 || gg.OwnItemCount(talker, 1873) < 5 || gg.OwnItemCount(talker, 3820) < 20) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0420_01.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3818) == 1 && gg.OwnItemCount(talker, 1870) >= 10 && gg.OwnItemCount(talker, 1871) >= 10 && gg.OwnItemCount(talker, 2130) >= 1 && gg.OwnItemCount(talker, 1873) >= 3 && gg.OwnItemCount(talker, 3820) >= 10) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0420_02.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 2 || gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3819) == 1 && gg.OwnItemCount(talker, 1870) >= 10 && gg.OwnItemCount(talker, 1871) >= 10 && gg.OwnItemCount(talker, 2131) >= 1 && gg.OwnItemCount(talker, 1875) >= 1 && gg.OwnItemCount(talker, 1873) >= 5 && gg.OwnItemCount(talker, 3820) >= 20) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0420_04.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0420_06.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 0 && talker.level >= 30) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "marya_q0660_01.htm", 660);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 0 && talker.level < 30) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0660_04.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 660) == 1) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marya_q0660_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 660) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoState(talker, 660, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "marya_q0660_06.htm", 660);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowQuestPage(talker, "marya_q0660_06a.htm", 660);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2692) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_02.htm");
myself.SetFlagJournal(talker, 214, 3);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2692, 1);
myself.GiveItem1(talker, 2679, 1);

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "marya_q0214_07.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 2683) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_08.htm");
myself.SetFlagJournal(talker, 214, 7);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2683, 1);
myself.GiveItem1(talker, 2682, 1);

}

}

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 2686) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marya_q0214_14.htm");
myself.SetFlagJournal(talker, 214, 13);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2687, gg.OwnItemCount(talker, 2687));
myself.DeleteItem1(talker, 2686, 1);
myself.GiveItem1(talker, 2688, 1);

}

}

}

}
if (ask == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3818, gg.OwnItemCount(talker, 3818));
myself.DeleteItem1(talker, 1870, 10);
myself.DeleteItem1(talker, 1871, 10);
myself.DeleteItem1(talker, 2130, 1);
myself.DeleteItem1(talker, 1873, 3);
myself.DeleteItem1(talker, 3820, gg.OwnItemCount(talker, 3820));
myself.GiveItem1(talker, 3816, 1);
myself.ShowPage(talker, "marya_q0420_03.htm");

}

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3819, gg.OwnItemCount(talker, 3819));
myself.DeleteItem1(talker, 1870, 10);
myself.DeleteItem1(talker, 1871, 10);
myself.DeleteItem1(talker, 2131, 1);
myself.DeleteItem1(talker, 1875, 1);
myself.DeleteItem1(talker, 1873, 5);
myself.DeleteItem1(talker, 3820, gg.OwnItemCount(talker, 3820));
myself.GiveItem1(talker, 3817, 1);
myself.ShowPage(talker, "marya_q0420_05.htm");

}

}

}
if (ask == 660) {
myself.SetCurrentQuestID(660);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 660) {
if (reply == 20) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "marya_q0660_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 660);
myself.ShowQuestFHTML(talker, fhtml0, 660);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}

}
super;
	}


}