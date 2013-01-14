package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class researcher_lorain extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) && gg.OwnItemCount(talker, 2875) == 0 && gg.OwnItemCount(talker, 2874) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2875) && gg.OwnItemCount(talker, 2876) < 10 || gg.OwnItemCount(talker, 2877) < 10 || gg.OwnItemCount(talker, 2878) < 10 && gg.OwnItemCount(talker, 2874) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2875) && gg.OwnItemCount(talker, 2876) >= 10 && gg.OwnItemCount(talker, 2877) >= 10 && gg.OwnItemCount(talker, 2878) >= 10 && gg.OwnItemCount(talker, 2874) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2874)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1 || gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3815) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 367) == 0 && talker.level >= 37) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Electrifying Recharge!");

}
if (gg.HaveMemo(talker, 367) == 0 && talker.level < 37) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Electrifying Recharge!");

}
if (gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5879) == 0 && gg.OwnItemCount(talker, 5880) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Electrifying Recharge! (In Progress)");

}
if (gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5880) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Electrifying Recharge! (In Progress)");

}
if (gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5879) > 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Electrifying Recharge! (In Progress)");

}
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Relics Exploration (In Progress)");

}
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 2) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Relics Exploration (In Progress)");

}
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Art of Persuasion (In Progress)");

}
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 2) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Art of Persuasion (In Progress)");

}
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) >= 3 && gg.GetMemoState(talker, 184) <= 5) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Art of Persuasion (In Progress)");

}
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 6) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Art of Persuasion (In Progress)");

}
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Nikola's Cooperation (In Progress)");

}
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 2) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Nikola's Cooperation (In Progress)");

}
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) >= 3 && gg.GetMemoState(talker, 185) <= 5) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Nikola's Cooperation (In Progress)");

}
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 6) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Nikola's Cooperation (In Progress)");

}
if (gg.HaveMemo(talker, 186) == 0 && gg.OwnItemCount(talker, 10362) >= 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Contract Execution");

}
if (myself.GetOneTimeQuestFlag(talker, 186) == 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Contract Execution (Done)");

}
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) >= 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Contract Execution (In Progress)");

}
if (gg.HaveMemo(talker, 187) == 0 && gg.OwnItemCount(talker, 10362) >= 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 1) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Nikola's Heart");

}
if (myself.GetOneTimeQuestFlag(talker, 187) == 1) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Nikola's Heart (Done)");

}
if (gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) >= 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Nikola's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 188) == 0 && gg.OwnItemCount(talker, 10362) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1 || myself.GetOneTimeQuestFlag(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && gg.HaveMemo(talker, 187) == 0 && gg.HaveMemo(talker, 186) == 0) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Seal Removal");

}
if (myself.GetOneTimeQuestFlag(talker, 188) == 1) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Seal Removal (Done)");

}
if (gg.HaveMemo(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Seal Removal (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 1 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 3 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 4 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Contract Completion (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 3 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 1 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 3 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "Vain Conclusion (In Progress)");

}
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 4 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "Vain Conclusion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2873) && gg.OwnItemCount(talker, 2875) == 0 && gg.OwnItemCount(talker, 2874) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "researcher_lorain_q0231_01.htm");
myself.GiveItem1(talker, 2875, 1);
myself.DeleteItem1(talker, 2873, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2875) && gg.OwnItemCount(talker, 2876) < 10 || gg.OwnItemCount(talker, 2877) < 10 || gg.OwnItemCount(talker, 2878) < 10 && gg.OwnItemCount(talker, 2874) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0231_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) == 4 && gg.OwnItemCount(talker, 2875) && gg.OwnItemCount(talker, 2876) >= 10 && gg.OwnItemCount(talker, 2877) >= 10 && gg.OwnItemCount(talker, 2878) >= 10 && gg.OwnItemCount(talker, 2874) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0231_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2874)) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0231_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1 || gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3815) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
talker.weight_point = 0;
talker.param1 = 0;
talker.param2 = 0;
talker.param3 = 0;
talker.flag = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 367) == 0 && talker.level >= 37) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "researcher_lorain_q0367_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 367);
myself.ShowQuestFHTML(talker, fhtml0, 367);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 367) == 0 && talker.level < 37) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0367_02.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5879) == 0 && gg.OwnItemCount(talker, 5880) == 0) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0367_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5880) > 0) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5875, 1);
myself.DeleteItem1(talker, 5880, gg.OwnItemCount(talker, 5880));
myself.ShowPage(talker, "researcher_lorain_q0367_05.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 367) == 1 && gg.OwnItemCount(talker, 5879) > 0) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(14);
if (i0 == 0) {
myself.GiveItem1(talker, 4553, 1);

} else if (i0 == 1) {
myself.GiveItem1(talker, 4554, 1);

} else if (i0 == 2) {
myself.GiveItem1(talker, 4555, 1);

} else if (i0 == 3) {
myself.GiveItem1(talker, 4556, 1);

} else if (i0 == 4) {
myself.GiveItem1(talker, 4557, 1);

} else if (i0 == 5) {
myself.GiveItem1(talker, 4558, 1);

} else if (i0 == 6) {
myself.GiveItem1(talker, 4559, 1);

} else if (i0 == 7) {
myself.GiveItem1(talker, 4560, 1);

} else if (i0 == 8) {
myself.GiveItem1(talker, 4561, 1);

} else if (i0 == 9) {
myself.GiveItem1(talker, 4562, 1);

} else if (i0 == 10) {
myself.GiveItem1(talker, 4563, 1);

} else if (i0 == 11) {
myself.GiveItem1(talker, 4564, 1);

} else {
myself.GiveItem1(talker, 4445, 1);

}
myself.DeleteItem1(talker, 5879, gg.OwnItemCount(talker, 5879));
gg.AddLog(3, talker, 367);
myself.ShowPage(talker, "researcher_lorain_q0367_06.htm");
myself.GiveItem1(talker, 5875, 1);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 1) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0183_01.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 2) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0183_05.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 1) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0184_01.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 2) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0184_04.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) >= 3 && gg.GetMemoState(talker, 184) <= 5) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0184_06.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 6) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0184_07.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 1) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0185_01.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 2) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0185_04.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) >= 3 && gg.GetMemoState(talker, 185) <= 5) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0185_06.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 6) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0185_07.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 0 && gg.OwnItemCount(talker, 10362) >= 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 41) {
myself.FHTML_SetFileName(fhtml0, "researcher_lorain_q0186_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 186);
myself.ShowQuestFHTML(talker, fhtml0, 186);

} else {
myself.ShowQuestPage(talker, "researcher_lorain_q0186_02.htm", 186);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 21: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 186) == 1) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) >= 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0186_04.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 187) == 0 && gg.OwnItemCount(talker, 10362) >= 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 1) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 41) {
myself.FHTML_SetFileName(fhtml0, "researcher_lorain_q0187_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 187);
myself.ShowQuestFHTML(talker, fhtml0, 187);

} else {
myself.ShowQuestPage(talker, "researcher_lorain_q0187_02.htm", 187);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 24: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 187) == 1) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 187) == 1 && gg.GetMemoState(talker, 187) >= 1 && myself.GetOneTimeQuestFlag(talker, 187) == 0) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0187_04.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 188) == 0 && gg.OwnItemCount(talker, 10362) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1 || myself.GetOneTimeQuestFlag(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && gg.HaveMemo(talker, 187) == 0 && gg.HaveMemo(talker, 186) == 0) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 41) {
myself.FHTML_SetFileName(fhtml0, "researcher_lorain_q0188_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 188);
myself.ShowQuestFHTML(talker, fhtml0, 188);

} else {
myself.ShowQuestPage(talker, "researcher_lorain_q0188_02.htm", 188);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 27: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 188) == 1) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 188) == 1 && myself.GetOneTimeQuestFlag(talker, 188) == 0) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0188_04.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 1 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0189_01.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 2 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0189_03.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 3 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 189, 4);
myself.ShowPage(talker, "researcher_lorain_q0189_04.htm");
myself.SetFlagJournal(talker, 189, 4);
myself.ShowQuestMark(talker, 189);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 4 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0189_05.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 3 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 190, 4);
myself.ShowPage(talker, "researcher_lorain_q0190_01.htm");
myself.SetFlagJournal(talker, 190, 4);
myself.ShowQuestMark(talker, 190);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 4 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0190_02.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 1 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0191_01.htm");

}
break;

}
case 36: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 2 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0191_03.htm");

}
break;

}
case 37: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 3 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 191, 4);
myself.ShowPage(talker, "researcher_lorain_q0191_04.htm");
myself.SetFlagJournal(talker, 191, 4);
myself.ShowQuestMark(talker, 191);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 4 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "researcher_lorain_q0191_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 367) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5875, 1);
myself.SetMemoState(talker, 367, 1);
myself.SetJournal(talker, 367, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "researcher_lorain_q0367_03.htm", 367);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
if (quest_id == 186) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 186) == 0 && talker.level >= 41 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && gg.OwnItemCount(talker, 10362) >= 1 && myself.GetOneTimeQuestFlag(talker, 184) == 1) {
myself.GiveItem1(talker, 10366, 1);
myself.DeleteItem1(talker, 10362, gg.OwnItemCount(talker, 10362));
myself.SetMemoState(talker, 186, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "researcher_lorain_q0186_03.htm", 186);
myself.SetFlagJournal(talker, 186, 1);
myself.ShowQuestMark(talker, 186);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 187) {
myself.SetCurrentQuestID(187);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 187) == 0 && talker.level >= 41 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && myself.GetOneTimeQuestFlag(talker, 185) == 1) {
myself.GiveItem1(talker, 10368, 1);
myself.DeleteItem1(talker, 10362, gg.OwnItemCount(talker, 10362));
myself.SetMemoState(talker, 187, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "researcher_lorain_q0187_03.htm", 187);
myself.SetFlagJournal(talker, 187, 1);
myself.ShowQuestMark(talker, 187);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
if (quest_id == 188) {
myself.SetCurrentQuestID(188);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 188) == 0 && talker.level >= 41 && gg.OwnItemCount(talker, 10362) == 0 && myself.GetOneTimeQuestFlag(talker, 188) == 0 && myself.GetOneTimeQuestFlag(talker, 184) == 1 || myself.GetOneTimeQuestFlag(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && myself.GetOneTimeQuestFlag(talker, 187) == 0 && gg.HaveMemo(talker, 187) == 0 && gg.HaveMemo(talker, 186) == 0) {
myself.GiveItem1(talker, 10369, 1);
myself.SetMemoState(talker, 188, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "researcher_lorain_q0188_03.htm", 188);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 188, 1);
myself.ShowQuestMark(talker, 188);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 231) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 231) {
if (reply == 1 && gg.OwnItemCount(talker, 2875) && gg.OwnItemCount(talker, 2876) >= 10 && gg.OwnItemCount(talker, 2877) >= 10 && gg.OwnItemCount(talker, 2878) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "researcher_lorain_q0231_04.htm");
myself.GiveItem1(talker, 2874, 1);
myself.DeleteItem1(talker, 2876, gg.OwnItemCount(talker, 2876));
myself.DeleteItem1(talker, 2877, gg.OwnItemCount(talker, 2877));
myself.DeleteItem1(talker, 2878, gg.OwnItemCount(talker, 2878));
myself.DeleteItem1(talker, 2875, gg.OwnItemCount(talker, 2875));

}

}

}
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_02.htm");
talker.param2 = 11;

} else if (reply == 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_03.htm");
talker.param2 = 21;

} else if (reply == 3) {
myself.ShowPage(talker, "researcher_lorain_q0336_04.htm");
talker.param2 = 31;

} else if (reply == 4) {
myself.ShowPage(talker, "researcher_lorain_q0336_05.htm");
talker.param2 = 42;

} else if (reply == 5) {
myself.ShowPage(talker, "researcher_lorain_q0336_06.htm");

} else if (reply == 6) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 4 * 2) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 4 * 2);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3472, 4 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3490, 4 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 4 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 7) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 8 * 2) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 8 * 2);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3472, 8 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3490, 8 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 8 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 8) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 9 * 2) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 9 * 2);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3472, 9 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3490, 9 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3482, 9 * 1);
myself.ShowPage(talker, "researcher_lorain_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 9) {
myself.ShowPage(talker, "researcher_lorain_q0336_53.htm");

} else if (reply == 10) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3489, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3472, 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3475, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3490, 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3494, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3483, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 11) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 5 * 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3489, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 10 * 5 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3472, 10 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3475, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 10 * 5 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3490, 10 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3494, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 5 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3483, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 12) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 10 * 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3489, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3472) >= 10 * 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3472, 10 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3475, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3490) >= 10 * 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3490, 10 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3494, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3482) >= 10 * 10 * 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_07.htm");
myself.DeleteItem1(talker, 3482, 10 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3483, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "researcher_lorain_q0336_10.htm");

}

}

} else if (reply == 13 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_14.htm");
talker.flag = talker.flag + 4 * 4 * 1;

} else if (reply == 14 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_15.htm");
talker.flag = talker.flag + 4 * 4 * 2;

} else if (reply == 15 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_16.htm");
talker.flag = talker.flag + 4 * 4 * 3;

} else if (reply == 16) {
myself.ShowPage(talker, "researcher_lorain_q0336_17.htm");
talker.flag = talker.flag + 4 * 1 * 1;

} else if (reply == 17) {
myself.ShowPage(talker, "researcher_lorain_q0336_18.htm");
talker.flag = talker.flag + 4 * 1 * 2;

} else if (reply == 18) {
myself.ShowPage(talker, "researcher_lorain_q0336_19.htm");
talker.flag = talker.flag + 4 * 1 * 3;

} else if (reply == 19) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 1;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3489, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3475, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3494, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3483, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "researcher_lorain_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "researcher_lorain_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "researcher_lorain_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "researcher_lorain_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "researcher_lorain_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "researcher_lorain_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "researcher_lorain_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "researcher_lorain_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "researcher_lorain_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "researcher_lorain_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "researcher_lorain_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "researcher_lorain_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "researcher_lorain_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "researcher_lorain_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "researcher_lorain_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "researcher_lorain_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "researcher_lorain_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "researcher_lorain_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "researcher_lorain_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "researcher_lorain_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "researcher_lorain_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "researcher_lorain_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "researcher_lorain_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "researcher_lorain_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "researcher_lorain_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "researcher_lorain_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "researcher_lorain_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "researcher_lorain_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 20) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 2;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3489, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3475, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3494, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3483, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "researcher_lorain_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "researcher_lorain_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "researcher_lorain_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "researcher_lorain_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "researcher_lorain_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "researcher_lorain_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "researcher_lorain_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "researcher_lorain_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "researcher_lorain_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "researcher_lorain_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "researcher_lorain_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "researcher_lorain_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "researcher_lorain_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "researcher_lorain_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "researcher_lorain_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "researcher_lorain_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "researcher_lorain_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "researcher_lorain_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "researcher_lorain_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "researcher_lorain_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "researcher_lorain_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "researcher_lorain_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "researcher_lorain_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "researcher_lorain_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "researcher_lorain_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "researcher_lorain_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "researcher_lorain_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "researcher_lorain_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 21) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 3;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "researcher_lorain_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3489, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3475, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3494, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3483, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "researcher_lorain_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "researcher_lorain_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "researcher_lorain_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "researcher_lorain_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "researcher_lorain_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "researcher_lorain_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "researcher_lorain_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "researcher_lorain_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "researcher_lorain_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "researcher_lorain_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "researcher_lorain_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "researcher_lorain_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "researcher_lorain_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "researcher_lorain_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "researcher_lorain_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "researcher_lorain_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "researcher_lorain_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "researcher_lorain_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "researcher_lorain_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "researcher_lorain_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "researcher_lorain_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "researcher_lorain_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "researcher_lorain_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "researcher_lorain_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "researcher_lorain_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "researcher_lorain_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "researcher_lorain_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "researcher_lorain_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "researcher_lorain_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "researcher_lorain_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 22) {
myself.ShowPage(talker, "researcher_lorain_q0336_01.htm");

}

}
if (ask == 367) {
myself.SetCurrentQuestID(367);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 367) {
if (reply == 1) {
myself.ShowPage(talker, "researcher_lorain_q0367_07.htm");

}
if (reply == 2) {
gg.AddLog(2, talker, 367);
myself.DeleteItem1(talker, 5875, gg.OwnItemCount(talker, 5875));
myself.DeleteItem1(talker, 5876, gg.OwnItemCount(talker, 5876));
myself.DeleteItem1(talker, 5877, gg.OwnItemCount(talker, 5877));
myself.DeleteItem1(talker, 5878, gg.OwnItemCount(talker, 5878));
myself.RemoveMemo(talker, 367);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "researcher_lorain_q0367_08.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "researcher_lorain_q0367_09.htm");

}

}
if (ask == 183) {
myself.SetCurrentQuestID(183);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 183) {
if (reply == 1) {
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 1) {
myself.ShowPage(talker, "researcher_lorain_q0183_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 1) {
myself.ShowPage(talker, "researcher_lorain_q0183_03.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 183) == 1 && myself.GetOneTimeQuestFlag(talker, 183) == 0 && gg.GetMemoState(talker, 183) == 1) {
myself.SetMemoState(talker, 183, 2);
myself.ShowPage(talker, "researcher_lorain_q0183_04.htm");
myself.SetFlagJournal(talker, 183, 2);
myself.ShowQuestMark(talker, 183);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 184) {
myself.SetCurrentQuestID(184);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 184) {
if (reply == 1) {
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 1) {
myself.ShowPage(talker, "researcher_lorain_q0184_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 1) {
myself.DeleteItem1(talker, 10361, gg.OwnItemCount(talker, 10361));
myself.SetMemoState(talker, 184, 2);
myself.ShowPage(talker, "researcher_lorain_q0184_03.htm");
myself.SetFlagJournal(talker, 184, 2);
myself.ShowQuestMark(talker, 184);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 2) {
myself.SetMemoState(talker, 184, 3);
myself.ShowPage(talker, "researcher_lorain_q0184_05.htm");
myself.SetFlagJournal(talker, 184, 3);
myself.ShowQuestMark(talker, 184);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 6) {
myself.ShowPage(talker, "researcher_lorain_q0184_08.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 184) == 1 && myself.GetOneTimeQuestFlag(talker, 184) == 0 && gg.GetMemoState(talker, 184) == 6) {
if (gg.OwnItemCount(talker, 10359) >= 1) {
myself.GiveItem1(talker, 10362, 1);
myself.DeleteItem1(talker, 10359, gg.OwnItemCount(talker, 10359));
myself.RemoveMemo(talker, 184);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "researcher_lorain_q0184_09.htm");
gg.AddLog(2, talker, 184);
myself.SetOneTimeQuestFlag(talker, 184, 1);

} else {
myself.DeleteItem1(talker, 10360, gg.OwnItemCount(talker, 10360));
myself.RemoveMemo(talker, 184);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "researcher_lorain_q0184_10.htm");
gg.AddLog(2, talker, 184);
myself.SetOneTimeQuestFlag(talker, 184, 1);

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 46) {
myself.GiveItem1(talker, 57, 72527);
myself.IncrementParam(talker, 0, 203717);
myself.IncrementParam(talker, 1, 14032);

} else {
myself.GiveItem1(talker, 57, 72527);

}
gg.AddLog(3, talker, 184);

}

}

}

}
if (ask == 185) {
myself.SetCurrentQuestID(185);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 185) {
if (reply == 1) {
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 1) {
myself.ShowPage(talker, "researcher_lorain_q0185_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 1) {
myself.DeleteItem1(talker, 10365, gg.OwnItemCount(talker, 10365));
myself.SetMemoState(talker, 185, 2);
myself.ShowPage(talker, "researcher_lorain_q0185_03.htm");
myself.SetFlagJournal(talker, 185, 2);
myself.ShowQuestMark(talker, 185);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 2) {
myself.SetMemoState(talker, 185, 3);
myself.ShowPage(talker, "researcher_lorain_q0185_05.htm");
myself.SetFlagJournal(talker, 185, 3);
myself.ShowQuestMark(talker, 185);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 6) {
myself.ShowPage(talker, "researcher_lorain_q0185_08.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 185) == 1 && myself.GetOneTimeQuestFlag(talker, 185) == 0 && gg.GetMemoState(talker, 185) == 6) {
if (gg.OwnItemCount(talker, 10363) >= 1) {
myself.GiveItem1(talker, 10362, 1);
myself.DeleteItem1(talker, 10363, gg.OwnItemCount(talker, 10363));
myself.RemoveMemo(talker, 185);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "researcher_lorain_q0185_09.htm");
gg.AddLog(2, talker, 185);
myself.SetOneTimeQuestFlag(talker, 185, 1);

} else {
myself.DeleteItem1(talker, 10364, gg.OwnItemCount(talker, 10364));
myself.RemoveMemo(talker, 185);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "researcher_lorain_q0185_10.htm");
gg.AddLog(2, talker, 185);
myself.SetOneTimeQuestFlag(talker, 185, 1);

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 46) {
myself.GiveItem1(talker, 57, 72527);
myself.IncrementParam(talker, 0, 203717);
myself.IncrementParam(talker, 1, 14032);

} else {
myself.GiveItem1(talker, 57, 72527);

}
gg.AddLog(3, talker, 185);

}

}

}

}
if (ask == 189) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 189) {
if (reply == 1) {
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) == 1 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.DeleteItem1(talker, 10370, gg.OwnItemCount(talker, 10370));
myself.SetMemoState(talker, 189, 2);
myself.ShowPage(talker, "researcher_lorain_q0189_02.htm");
myself.SetFlagJournal(talker, 189, 2);
myself.ShowQuestMark(talker, 189);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 191) {
myself.SetCurrentQuestID(191);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 191) {
if (reply == 1) {
if (gg.HaveMemo(talker, 191) == 1 && gg.GetMemoState(talker, 191) == 1 && myself.GetOneTimeQuestFlag(talker, 191) == 0) {
myself.DeleteItem1(talker, 10371, gg.OwnItemCount(talker, 10371));
myself.SetMemoState(talker, 191, 2);
myself.ShowPage(talker, "researcher_lorain_q0191_02.htm");
myself.SetFlagJournal(talker, 191, 2);
myself.ShowQuestMark(talker, 191);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}