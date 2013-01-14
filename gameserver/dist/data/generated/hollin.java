package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hollin extends master_lv3_hec {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 0 && myself.GetOneTimeQuestFlag(talker, 217) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust");

}
if (gg.HaveMemo(talker, 217) == 0 && myself.GetOneTimeQuestFlag(talker, 217) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (Done)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 7 && gg.OwnItemCount(talker, 2741) && gg.OwnItemCount(talker, 2740)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18 && gg.OwnItemCount(talker, 2742) && gg.OwnItemCount(talker, 2743)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 19) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 8) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 0 && myself.GetOneTimeQuestFlag(talker, 85) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Cardinal");

}
if (gg.HaveMemo(talker, 85) == 0 && myself.GetOneTimeQuestFlag(talker, 85) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Cardinal (Done)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 15) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 16) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 0 && myself.GetOneTimeQuestFlag(talker, 86) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Hierophant");

}
if (gg.HaveMemo(talker, 86) == 0 && myself.GetOneTimeQuestFlag(talker, 86) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Hierophant (Done)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 15) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 16) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 0 && myself.GetOneTimeQuestFlag(talker, 87) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of Eva's Saint");

}
if (gg.HaveMemo(talker, 87) == 0 && myself.GetOneTimeQuestFlag(talker, 87) == 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of Eva's Saint (Done)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 15) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 16) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 7) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 0) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Seven Signs, Dying Message");

}
if (gg.HaveMemo(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 1 && myself.GetOneTimeQuestFlag(talker, 192) == 1) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Seven Signs, Dying Message (Done)");

}
if (gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 1) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Seven Signs, Dying Message (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 0 && myself.GetOneTimeQuestFlag(talker, 217) == 0) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 0 && talker.level >= 37 && myself.IsInCategory(18, talker.occupation)) {
myself.FHTML_SetFileName(fhtml0, "hollin_q0217_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 217);
myself.ShowQuestFHTML(talker, fhtml0, 217);

} else if (talker.race == 0 && talker.level >= 37 && myself.IsInCategory(6, talker.occupation)) {
myself.ShowPage(talker, "hollin_q0217_01a.htm");

} else if (talker.race == 0 && talker.level >= 37) {
myself.ShowPage(talker, "hollin_q0217_01b.htm");

} else if (talker.race == 0) {
myself.ShowPage(talker, "hollin_q0217_01.htm");

} else {
myself.ShowPage(talker, "hollin_q0217_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 0 && myself.GetOneTimeQuestFlag(talker, 217) == 1) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 7 && gg.OwnItemCount(talker, 2741) && gg.OwnItemCount(talker, 2740)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "hollin_q0217_05.htm");
myself.GiveItem1(talker, 2739, 1);
myself.DeleteItem1(talker, 2740, 1);
myself.DeleteItem1(talker, 2741, 1);
myself.SetMemoState(talker, 217, 8);
myself.SetFlagJournal(talker, 217, 10);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18 && gg.OwnItemCount(talker, 2742) && gg.OwnItemCount(talker, 2743)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "hollin_q0217_06.htm");
myself.GiveItem1(talker, 2744, 1);
myself.DeleteItem1(talker, 2742, 1);
myself.DeleteItem1(talker, 2743, 1);
myself.SetMemoState(talker, 217, 19);
myself.SetFlagJournal(talker, 217, 23);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 19) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0217_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 1) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0217_08.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 8) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0217_09.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 0 && myself.GetOneTimeQuestFlag(talker, 85) == 0) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 16) {
myself.ShowQuestPage(talker, "hollin_q0085_0101.htm", 85);

} else {
myself.ShowQuestPage(talker, "hollin_q0085_0102.htm", 85);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 0 && myself.GetOneTimeQuestFlag(talker, 85) == 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0085_0104.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 15) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0085_0106.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 16) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 97);
myself.SetOneTimeQuestFlag(talker, 85, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.GiveItem1(talker, 15307, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 85);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0085_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "hollin_q0085_0110.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 0 && myself.GetOneTimeQuestFlag(talker, 86) == 0) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 17) {
myself.ShowQuestPage(talker, "hollin_q0086_0101.htm", 86);

} else {
myself.ShowQuestPage(talker, "hollin_q0086_0102.htm", 86);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 0 && myself.GetOneTimeQuestFlag(talker, 86) == 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0086_0104.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 15) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0086_0106.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 16) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 98);
myself.SetOneTimeQuestFlag(talker, 86, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 86);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0086_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "hollin_q0086_0110.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 0 && myself.GetOneTimeQuestFlag(talker, 87) == 0) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 30) {
myself.ShowQuestPage(talker, "hollin_q0087_0101.htm", 87);

} else {
myself.ShowQuestPage(talker, "hollin_q0087_0102.htm", 87);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 0 && myself.GetOneTimeQuestFlag(talker, 87) == 1) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 1) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0087_0104.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 15) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hollin_q0087_0106.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 16) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 105);
myself.SetOneTimeQuestFlag(talker, 87, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.GiveItem1(talker, 15308, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 87);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0087_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "hollin_q0087_0110.htm");

}

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 7) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13815) >= 1) {
myself.ShowPage(talker, "hollin_q0192_01.htm");

}

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 0) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetOneTimeQuestFlag(talker, 192) == 1 && talker.level >= 79) {
myself.FHTML_SetFileName(fhtml0, "hollin_q0193_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 193);
myself.ShowQuestFHTML(talker, fhtml0, 193);

} else {
myself.ShowQuestPage(talker, "hollin_q0193_03.htm", 193);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 1 && myself.GetOneTimeQuestFlag(talker, 192) == 1) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 193) == 1 && gg.GetMemoState(talker, 193) == 1) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "hollin_q0193_05.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 217) == 0 && myself.GetOneTimeQuestFlag(talker, 217) == 0 && myself.GetMemoCount(talker) < 41 && talker.race == 0 && talker.level >= 37 && myself.IsInCategory(18, talker.occupation)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 217);
myself.SetFlagJournal(talker, 217, 1);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 217, 1);
myself.GiveItem1(talker, 2735, 1);
myself.GiveItem1(talker, 2736, 1);
talker.flag = 0;
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);
myself.ShowQuestPage(talker, "hollin_q0217_04a.htm", 217);

} else {
myself.ShowQuestPage(talker, "hollin_q0217_04.htm", 217);

}

}

}
return;

}
if (quest_id == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 85) == 0 && myself.GetOneTimeQuestFlag(talker, 85) == 0 && talker.level >= 76 && talker.occupation == 16) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7087, 1);
myself.SetMemo(talker, 85);
myself.ShowQuestMark(talker, 85);
myself.SetMemoState(talker, 85, 1);
myself.SetFlagJournal(talker, 85, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hollin_q0085_0103.htm", 85);
gg.AddLog(1, talker, 85);

}

}
return;

}
if (quest_id == 86) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 86) == 0 && myself.GetOneTimeQuestFlag(talker, 86) == 0 && talker.level >= 76 && talker.occupation == 17) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7089, 1);
myself.SetMemo(talker, 86);
myself.ShowQuestMark(talker, 86);
myself.SetMemoState(talker, 86, 1);
myself.SetFlagJournal(talker, 86, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hollin_q0086_0103.htm", 86);
gg.AddLog(1, talker, 86);

}

}
return;

}
if (quest_id == 87) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 87) == 0 && myself.GetOneTimeQuestFlag(talker, 87) == 0 && talker.level >= 76 && talker.occupation == 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7088, 1);
myself.SetMemo(talker, 87);
myself.ShowQuestMark(talker, 87);
myself.SetMemoState(talker, 87, 1);
myself.SetFlagJournal(talker, 87, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hollin_q0087_0103.htm", 87);
gg.AddLog(1, talker, 87);

}

}
return;

}
if (quest_id == 193) {
myself.SetCurrentQuestID(193);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 79 && gg.HaveMemo(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 193) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 1) {
myself.GiveItem1(talker, 13814, 1);
myself.SetMemoState(talker, 193, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "hollin_q0193_04.htm", 193);
myself.SetFlagJournal(talker, 193, 1);
myself.ShowQuestMark(talker, 193);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 1) {
if (gg.HaveMemo(talker, 85) == 0 && talker.occupation == 16 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 85) == 0) {
myself.FHTML_SetFileName(fhtml0, "hollin_q0085_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 85);
myself.ShowQuestFHTML(talker, fhtml0, 85);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7087, gg.OwnItemCount(talker, 7087));
myself.ClassChange(talker, 97);
myself.SetOneTimeQuestFlag(talker, 85, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.GiveItem1(talker, 15307, 1);
myself.RemoveMemo(talker, 85);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0085_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 85, 16);
myself.SetFlagJournal(talker, 85, 20);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7087, gg.OwnItemCount(talker, 7087));
myself.ShowPage(talker, "hollin_q0085_0108.htm");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 86) == 0 && talker.occupation == 17 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 86) == 0) {
myself.FHTML_SetFileName(fhtml0, "hollin_q0086_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 86);
myself.ShowQuestFHTML(talker, fhtml0, 86);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7089, gg.OwnItemCount(talker, 7089));
myself.ClassChange(talker, 98);
myself.SetOneTimeQuestFlag(talker, 86, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 86);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0086_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 86, 16);
myself.SetFlagJournal(talker, 86, 20);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7089, gg.OwnItemCount(talker, 7089));
myself.ShowPage(talker, "hollin_q0086_0108.htm");

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
if (reply == 1) {
if (gg.HaveMemo(talker, 87) == 0 && talker.occupation == 30 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 87) == 0) {
myself.FHTML_SetFileName(fhtml0, "hollin_q0087_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 87);
myself.ShowQuestFHTML(talker, fhtml0, 87);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7088, gg.OwnItemCount(talker, 7088));
myself.ClassChange(talker, 105);
myself.SetOneTimeQuestFlag(talker, 87, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.GiveItem1(talker, 15308, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 87);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "hollin_q0087_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 87, 16);
myself.SetFlagJournal(talker, 87, 20);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7088, gg.OwnItemCount(talker, 7088));
myself.ShowPage(talker, "hollin_q0087_0108.htm");

}

}

}

}
if (ask == 192) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 192) {
if (reply == 1) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 7) {
if (gg.OwnItemCount(talker, 13815) >= 1) {
myself.ShowPage(talker, "hollin_q0192_02.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 7) {
if (gg.OwnItemCount(talker, 13815) >= 1 && talker.level >= 79) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "hollin_q0192_03.htm");
myself.IncrementParam(talker, 0, 52518015);
myself.IncrementParam(talker, 1, 5817677);
myself.DeleteItem1(talker, 13815, gg.OwnItemCount(talker, 13815));
myself.RemoveMemo(talker, 192);
gg.AddLog(2, talker, 192);
gg.AddLog(3, talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 192, 1);

}

} else if (gg.OwnItemCount(talker, 13815) >= 1 && talker.level < 79) {
myself.ShowPage(talker, "level_check_q0192_01.htm");

}

}

}

}
super;
	}


}