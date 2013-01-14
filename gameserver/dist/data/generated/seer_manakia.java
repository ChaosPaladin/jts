package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_manakia extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 1 && gg.OwnItemCount(talker, 2757)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 11) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 12 && gg.OwnItemCount(talker, 2756) == 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 13) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3397) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3397) >= 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3397) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3399) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3400) >= 1 && gg.OwnItemCount(talker, 3392) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3397) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 0 && gg.OwnItemCount(talker, 2913) == 0 && gg.OwnItemCount(talker, 2880) == 0 && gg.OwnItemCount(talker, 2901) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 0 && gg.OwnItemCount(talker, 2901) >= 1 || gg.OwnItemCount(talker, 2913) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 375) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 5887) > 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Whisper of Dreams - Part 2");

}
if (gg.HaveMemo(talker, 375) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 5887) > 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Whisper of Dreams - Part 2");

}
if (gg.HaveMemo(talker, 375) == 1 && gg.OwnItemCount(talker, 5888) < 100 && gg.OwnItemCount(talker, 5889) <= 100 || gg.OwnItemCount(talker, 5888) <= 100 && gg.OwnItemCount(talker, 5889) < 100) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Whisper of Dreams - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 375) == 1 && gg.OwnItemCount(talker, 5888) >= 100 && gg.OwnItemCount(talker, 5889) >= 100) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Whisper of Dreams - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 374) == 0 && talker.level >= 56) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Whisper of Dreams - Part 1");

}
if (gg.HaveMemo(talker, 374) == 0 && talker.level < 56) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Whisper of Dreams - Part 1");

}
if (gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5884) < 65 && gg.OwnItemCount(talker, 5885) <= 65 || gg.OwnItemCount(talker, 5884) <= 65 && gg.OwnItemCount(talker, 5885) < 65 && gg.OwnItemCount(talker, 5886) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Whisper of Dreams - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65 && gg.OwnItemCount(talker, 5886) == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Whisper of Dreams - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5886) > 0 && gg.GetMemoState(talker, 374) == 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Whisper of Dreams - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5886) > 0 && gg.GetMemoState(talker, 374) == 2) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Whisper of Dreams - Part 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.OwnItemCount(talker, 2757)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0217_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 11) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0217_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 12 && gg.OwnItemCount(talker, 2756) == 10) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0217_04.htm");
myself.GiveItem1(talker, 2758, 1);
myself.DeleteItem1(talker, 2756, gg.OwnItemCount(talker, 2756));
myself.SetMemoState(talker, 217, 13);
myself.SetFlagJournal(talker, 217, 16);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 13) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0217_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0220_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0220_08.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3397) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0232_01.htm");
myself.GiveItem1(talker, 3397, 1);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3397) >= 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3398) < 20) {
myself.ShowPage(talker, "seer_manakia_q0232_02.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0232_03.htm");
myself.DeleteItem1(talker, 3397, 1);
myself.GiveItem1(talker, 3399, 1);
myself.DeleteItem1(talker, 3398, gg.OwnItemCount(talker, 3398));

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3397) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3399) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0232_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3400) >= 1 && gg.OwnItemCount(talker, 3392) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3397) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0232_05.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 0 && gg.OwnItemCount(talker, 2913) == 0 && gg.OwnItemCount(talker, 2880) == 0 && gg.OwnItemCount(talker, 2901) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0233_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2896) >= 1 && gg.OwnItemCount(talker, 2897) >= 1 && gg.OwnItemCount(talker, 2898) >= 1 && gg.OwnItemCount(talker, 2899) >= 1 && gg.OwnItemCount(talker, 2900) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0233_04.htm");
myself.DeleteItem1(talker, 2895, gg.OwnItemCount(talker, 2895));
myself.DeleteItem1(talker, 2896, gg.OwnItemCount(talker, 2896));
myself.DeleteItem1(talker, 2897, gg.OwnItemCount(talker, 2897));
myself.DeleteItem1(talker, 2898, gg.OwnItemCount(talker, 2898));
myself.DeleteItem1(talker, 2899, gg.OwnItemCount(talker, 2899));
myself.DeleteItem1(talker, 2900, 1);
myself.GiveItem1(talker, 2901, 1);
myself.SetFlagJournal(talker, 233, 2);
myself.ShowQuestMark(talker, 233);

}

} else {
myself.ShowPage(talker, "seer_manakia_q0233_03.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2895) == 0 && gg.OwnItemCount(talker, 2901) >= 1 || gg.OwnItemCount(talker, 2913) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0233_05.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 375) == 0 && talker.level >= 60 && gg.OwnItemCount(talker, 5887) > 0) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "seer_manakia_q0375_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 375);
myself.ShowQuestFHTML(talker, fhtml0, 375);

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 375) == 0 && talker.level < 60 && gg.OwnItemCount(talker, 5887) > 0) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0375_02.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 375) == 1 && gg.OwnItemCount(talker, 5888) < 100 && gg.OwnItemCount(talker, 5889) <= 100 || gg.OwnItemCount(talker, 5888) <= 100 && gg.OwnItemCount(talker, 5889) < 100) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0375_04.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 375) == 1 && gg.OwnItemCount(talker, 5888) >= 100 && gg.OwnItemCount(talker, 5889) >= 100) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.Rand(100);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 34) {
myself.GiveItem1(talker, 5348, 1);

} else if (i0 < 67) {
myself.GiveItem1(talker, 5352, 1);

} else {
myself.GiveItem1(talker, 5350, 1);

}
myself.DeleteItem1(talker, 5888, gg.OwnItemCount(talker, 5888));
myself.DeleteItem1(talker, 5889, gg.OwnItemCount(talker, 5889));
myself.ShowPage(talker, "seer_manakia_q0375_05.htm");
gg.AddLog(3, talker, 375);

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 0 && talker.level >= 56) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "seer_manakia_q0374_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 374);
myself.ShowQuestFHTML(talker, fhtml0, 374);

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 0 && talker.level < 56) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0374_02.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5884) < 65 && gg.OwnItemCount(talker, 5885) <= 65 || gg.OwnItemCount(talker, 5884) <= 65 && gg.OwnItemCount(talker, 5885) < 65 && gg.OwnItemCount(talker, 5886) == 0) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0374_04.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65 && gg.OwnItemCount(talker, 5886) == 0) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0374_05.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5886) > 0 && gg.GetMemoState(talker, 374) == 1) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 374, 2);
myself.ShowPage(talker, "seer_manakia_q0374_08.htm");
myself.SetJournal(talker, 374, 2);
myself.ShowQuestMark(talker, 374);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 374) == 1 && gg.OwnItemCount(talker, 5886) > 0 && gg.GetMemoState(talker, 374) == 2) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_manakia_q0374_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 375) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 375, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 375);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "seer_manakia_q0375_03.htm", 375);
myself.SetJournal(talker, 375, 1);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
if (quest_id == 374) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 374, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 374);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetJournal(talker, 374, 1);
myself.ShowQuestPage(talker, "seer_manakia_q0374_03.htm", 374);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1 && gg.OwnItemCount(talker, 2757) > 0) {
myself.ShowPage(talker, "seer_manakia_q0217_02.htm");
myself.DeleteItem1(talker, 2757, 1);
myself.SetMemoState(talker, 217, 11);
myself.SetFlagJournal(talker, 217, 14);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3211) == 0 && gg.OwnItemCount(talker, 3228)) {
myself.ShowPage(talker, "seer_manakia_q0220_04.htm");
myself.ShowRadar(talker, 80100, 119991, -2264, 1);

} else if (gg.OwnItemCount(talker, 3211)) {
myself.ShowPage(talker, "seer_manakia_q0220_02.htm");

} else if (gg.OwnItemCount(talker, 3211) == 0 && gg.OwnItemCount(talker, 3228) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0220_03.htm");
myself.GiveItem1(talker, 3228, 1);
myself.ShowRadar(talker, 80100, 119991, -2264, 1);

}

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 3212)) {
myself.ShowPage(talker, "seer_manakia_q0220_05.htm");

} else if (gg.OwnItemCount(talker, 3212) == 0 && gg.OwnItemCount(talker, 3229) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0220_06.htm");
myself.GiveItem1(talker, 3229, 1);
myself.ShowRadar(talker, 12805, 189249, -3616, 1);

}

} else if (gg.OwnItemCount(talker, 3212) == 0 && gg.OwnItemCount(talker, 3229)) {
myself.ShowPage(talker, "seer_manakia_q0220_07.htm");
myself.ShowRadar(talker, 12805, 189249, -3616, 1);

}

}

}
if (ask == 233) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 233) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_manakia_q0233_02.htm");
myself.GiveItem1(talker, 2895, 1);

}

}

}
if (ask == 375) {
myself.SetCurrentQuestID(375);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 375) {
if (reply == 1) {
myself.ShowPage(talker, "seer_manakia_q0375_06.htm");

}
if (reply == 2) {
myself.RemoveMemo(talker, 375);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "seer_manakia_q0375_07.htm");
gg.AddLog(2, talker, 375);

}

}
if (ask == 374) {
myself.SetCurrentQuestID(374);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 374) {
if (reply == 1) {
myself.ShowPage(talker, "seer_manakia_q0374_06.htm");

}
if (reply == 2) {
gg.AddLog(2, talker, 374);
myself.RemoveMemo(talker, 374);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "seer_manakia_q0374_07.htm");

}
if (reply == 3 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65) {
myself.GiveItem1(talker, 5486, 3);
myself.GiveItem1(talker, 57, 15886);
myself.DeleteItem1(talker, 5884, gg.OwnItemCount(talker, 5884));
myself.DeleteItem1(talker, 5885, gg.OwnItemCount(talker, 5885));
myself.ShowPage(talker, "seer_manakia_q0374_10.htm");
gg.AddLog(3, talker, 374);

}
if (reply == 4 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65) {
myself.GiveItem1(talker, 5487, 2);
myself.GiveItem1(talker, 57, 28458);
myself.DeleteItem1(talker, 5884, gg.OwnItemCount(talker, 5884));
myself.DeleteItem1(talker, 5885, gg.OwnItemCount(talker, 5885));
myself.ShowPage(talker, "seer_manakia_q0374_10.htm");
gg.AddLog(3, talker, 374);

}
if (reply == 5 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65) {
myself.GiveItem1(talker, 5488, 2);
myself.GiveItem1(talker, 57, 28458);
myself.DeleteItem1(talker, 5884, gg.OwnItemCount(talker, 5884));
myself.DeleteItem1(talker, 5885, gg.OwnItemCount(talker, 5885));
myself.ShowPage(talker, "seer_manakia_q0374_10.htm");
gg.AddLog(3, talker, 374);

}
if (reply == 6 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65) {
myself.GiveItem1(talker, 5485, 4);
myself.GiveItem1(talker, 57, 22150);
myself.DeleteItem1(talker, 5884, gg.OwnItemCount(talker, 5884));
myself.DeleteItem1(talker, 5885, gg.OwnItemCount(talker, 5885));
myself.ShowPage(talker, "seer_manakia_q0374_10.htm");
gg.AddLog(3, talker, 374);

}
if (reply == 7 && gg.OwnItemCount(talker, 5884) >= 65 && gg.OwnItemCount(talker, 5885) >= 65) {
myself.GiveItem1(talker, 5489, 6);
myself.GiveItem1(talker, 57, 26368);
myself.DeleteItem1(talker, 5884, gg.OwnItemCount(talker, 5884));
myself.DeleteItem1(talker, 5885, gg.OwnItemCount(talker, 5885));
myself.ShowPage(talker, "seer_manakia_q0374_10.htm");
gg.AddLog(3, talker, 374);

}

}
super;
	}


}