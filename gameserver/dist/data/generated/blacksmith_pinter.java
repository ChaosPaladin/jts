package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_pinter extends blacksmith {
	protected void TALKED(HandlerParam talker) {
if (myself.IsAcademyMember(talker) == 1) {
myself.ShowPage(talker, fnForAcademy);

} else {
super;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (ask == 418) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 418 && reply == 1) {
myself.ShowPage(talker, "blacksmith_pinter_q0418_02.htm");

}
if (ask == 418 && reply == 2 && gg.OwnItemCount(talker, 1638) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pinter_q0418_03.htm");
myself.DeleteItem1(talker, 1638, 1);
myself.GiveItem1(talker, 1639, 1);
myself.SetFlagJournal(talker, 418, 5);
myself.ShowQuestMark(talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 418 && reply == 3 && gg.OwnItemCount(talker, 1639) > 0 && gg.OwnItemCount(talker, 1640) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pinter_q0418_06.htm");
myself.DeleteItem1(talker, 1640, 1);
myself.DeleteItem1(talker, 1639, 1);
myself.GiveItem1(talker, 1641, 1);
myself.GiveItem1(talker, 1634, 1);
myself.SetFlagJournal(talker, 418, 7);
myself.ShowQuestMark(talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 216) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 216) {
if (reply == 1) {
myself.ShowPage(talker, "blacksmith_pinter_q0216_03.htm");

}
if (reply == 2) {
if (talker.occupation == 54) {
if (gg.OwnItemCount(talker, 3124) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pinter_q0216_04.htm");
myself.DeleteItem1(talker, 3124, 1);
myself.GiveItem1(talker, 3135, 1);

}

}

} else if (gg.OwnItemCount(talker, 3124) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pinter_q0216_05.htm");
myself.DeleteItem1(talker, 3124, 1);
myself.GiveItem1(talker, 3025, 1);
myself.GiveItem1(talker, 3135, 1);

}

}

}

}
if (ask == 118) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 118) {
if (reply == 1) {
if (myself.HasAcademyMember(talker) == 1) {
c0 = myself.GetAcademyMember(talker);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 1500) {
if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 1 && gg.OwnItemCount(talker, 1458) >= 922) {
myself.DeleteItem1(talker, 1458, 922);
myself.SetMemoState(c0, 118, 3);
myself.SetFlagJournal(c0, 118, 6);
myself.ShowQuestMark(c0, 118);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_10.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 2 && gg.OwnItemCount(talker, 1458) >= 771) {
myself.DeleteItem1(talker, 1458, 771);
myself.SetMemoState(c0, 118, 3);
myself.SetFlagJournal(c0, 118, 6);
myself.ShowQuestMark(c0, 118);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_10.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 3 && gg.OwnItemCount(talker, 1458) >= 771) {
myself.DeleteItem1(talker, 1458, 771);
myself.SetMemoState(c0, 118, 3);
myself.SetFlagJournal(c0, 118, 6);
myself.ShowQuestMark(c0, 118);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_10.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 1 && gg.OwnItemCount(talker, 1458) < 922) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_11.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 2 && gg.OwnItemCount(talker, 1458) < 771) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_11a.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2 && gg.GetMemoStateEx(c0, 118, 1) == 3 && gg.OwnItemCount(talker, 1458) < 771) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_11a.htm");

}

}

}

}
if (reply == 21) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_05a.htm");

}
if (reply == 22) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_05b.htm");

}
if (reply == 23) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_05c.htm");

}
if (reply == 24) {
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) >= 10) {
myself.DeleteItem1(talker, 8062, gg.OwnItemCount(talker, 8062));
myself.SetMemoState(talker, 118, 2);
myself.SetMemoStateEx(talker, 118, 1, 1);
myself.SetFlagJournal(talker, 118, 3);
myself.ShowQuestMark(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_05d.htm");

}

}
if (reply == 25) {
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) >= 10) {
myself.DeleteItem1(talker, 8062, gg.OwnItemCount(talker, 8062));
myself.SetMemoState(talker, 118, 2);
myself.SetMemoStateEx(talker, 118, 1, 2);
myself.SetFlagJournal(talker, 118, 4);
myself.ShowQuestMark(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_05e.htm");

}

}
if (reply == 26) {
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) >= 10) {
myself.DeleteItem1(talker, 8062, gg.OwnItemCount(talker, 8062));
myself.SetMemoState(talker, 118, 2);
myself.SetMemoStateEx(talker, 118, 1, 3);
myself.SetFlagJournal(talker, 118, 5);
myself.ShowQuestMark(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_05f.htm");

}

}
if (reply == 27) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_05g.htm");

}

}
if (ask == 708) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 708) {
if (reply == 1) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) == 4) {
myself.ShowQuestPage(talker, "blacksmith_pinter_q0708_04.htm", 708);

}

}

}
if (reply == 2) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) == 4) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(70853, "", "", "", "", ""));
myself.ShowPage(talker, "blacksmith_pinter_q0708_05.htm");
myself.SetMemoState(c0, 708, 5);
myself.SetMemoStateEx(c0, 708, 1, 0);
myself.SetFlagJournal(c0, 708, 4);
myself.ShowQuestMark(c0, 708);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_06.htm");

}

}
if (reply == 3) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) % 10 == 5) {
i0 = gg.GetMemoState(c0, 708) / 10;
if (gg.OwnItemCount(talker, 1867) >= 100 && gg.OwnItemCount(talker, 1865) >= 100 && gg.OwnItemCount(talker, 1869) >= 100 && gg.OwnItemCount(talker, 1879) >= 50) {
myself.DeleteItem1(talker, 1867, 100);
myself.DeleteItem1(talker, 1865, 100);
myself.DeleteItem1(talker, 1869, 100);
myself.DeleteItem1(talker, 1879, 50);
myself.SetMemoState(c0, 708, 9 + i0 * 10);
myself.ShowPage(talker, "blacksmith_pinter_q0708_09.htm");

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_10.htm");

}

}

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_11.htm");

}

}

}
if (ask == 501) {
if (reply == 1) {
if (myself.IsAcademyMember(talker) == 1) {
myself.ShowMultisell(620, talker);

}

}

} else {
super;

}
	}

	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1638)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1639) && gg.OwnItemCount(talker, 1640) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1639) && gg.OwnItemCount(talker, 1640)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3124) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3135) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3135) == 0 && gg.OwnItemCount(talker, 3138) >= 1 || gg.OwnItemCount(talker, 3139) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && talker.level >= 19 && myself.IsAcademyMember(talker) == 1 && myself.HasAcademyMaster(talker) == 1 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "To Lead and Be Led");

}
if (gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && talker.level < 19 || myself.IsAcademyMember(talker) == 0 || myself.HasAcademyMaster(talker) == 0 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "To Lead and Be Led");

}
if (gg.HaveMemo(talker, 123) == 1 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "To Lead and Be Led");

}
if (gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && myself.GetOneTimeQuestFlag(talker, 118) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "To Lead and Be Led (Done)");

}
if (gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "To Lead and Be Led");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) < 10) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "To Lead and Be Led (In Progress)");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) >= 10) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "To Lead and Be Led (In Progress)");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 2) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "To Lead and Be Led (In Progress)");

}
if (myself.HasAcademyMember(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "To Lead and Be Led (Sponsor)");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 3) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "To Lead and Be Led (In Progress)");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 4 && gg.OwnItemCount(talker, 8063) < 8) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "To Lead and Be Led (In Progress)");

}
if (gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 4 && gg.OwnItemCount(talker, 8063) >= 8) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "To Lead and Be Led (In Progress)");

}
if (myself.IsMyLord(talker) == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Path to Becoming a Lord - Gludio (In progress)");

}
if (myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Path to Becoming a Lord - Gludio (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1638)) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0418_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1639) && gg.OwnItemCount(talker, 1640) == 0) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0418_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1639) && gg.OwnItemCount(talker, 1640)) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0418_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0418_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3124) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0216_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3135) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3136) < 70) {
myself.ShowPage(talker, "blacksmith_pinter_q0216_06.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pinter_q0216_07.htm");
myself.DeleteItem1(talker, 3135, gg.OwnItemCount(talker, 3135));
myself.DeleteItem1(talker, 3136, gg.OwnItemCount(talker, 3136));
myself.DeleteItem1(talker, 3025, gg.OwnItemCount(talker, 3025));
myself.DeleteItem1(talker, 3137, gg.OwnItemCount(talker, 3137));
myself.GiveItem1(talker, 3138, 7);
if (gg.OwnItemCount(talker, 3134) >= 7) {
myself.SetFlagJournal(talker, 216, 6);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3135) == 0 && gg.OwnItemCount(talker, 3138) >= 1 || gg.OwnItemCount(talker, 3139) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0216_08.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && talker.level >= 19 && myself.IsAcademyMember(talker) == 1 && myself.HasAcademyMaster(talker) == 1 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_pinter_q0118_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 118);
myself.ShowQuestFHTML(talker, fhtml0, 118);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && talker.level < 19 || myself.IsAcademyMember(talker) == 0 || myself.HasAcademyMaster(talker) == 0 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "blacksmith_pinter_q0118_02.htm", 118);

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 123) == 1 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0118_02b.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && myself.GetOneTimeQuestFlag(talker, 118) == 1) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 1) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "blacksmith_pinter_q0118_02a.htm", 118);

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) < 10) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0118_04.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 1 && gg.OwnItemCount(talker, 8062) >= 10) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0118_05.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 2) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.HasAcademyMaster(talker) == 0) {
if (gg.GetMemoStateEx(talker, 118, 1) == 1) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06a.htm");

} else if (gg.GetMemoStateEx(talker, 118, 1) == 2) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06b.htm");

} else if (gg.GetMemoStateEx(talker, 118, 1) == 3) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06c.htm");

}

} else {
c0 = myself.GetAcademyMaster(talker);
if (myself.IsNullCreature(c0) == 1 || myself.DistFromMe(c0) > 1500) {
if (gg.GetMemoStateEx(talker, 118, 1) == 1) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06.htm");

} else if (gg.GetMemoStateEx(talker, 118, 1) == 2) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06d.htm");

} else if (gg.GetMemoStateEx(talker, 118, 1) == 3) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_06e.htm");

}

} else if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 1500) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_07.htm");

}

}

}
break;

}
case 15: {
if (_from_choice == 0 || myself.HasAcademyMember(talker) == 1) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.GetAcademyMember(talker);
if (myself.IsNullCreature(c0) == 1 || myself.DistFromMe(c0) > 1500) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_09.htm");

} else if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 1500) {
if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 2) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_08.htm");

} else if (gg.HaveMemo(c0, 118) == 1 && gg.GetMemoState(c0, 118) == 3) {
myself.ShowPage(talker, "blacksmith_pinter_q0118_12.htm");

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0118_14.htm");

}

}

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 3) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 118, 4);
myself.SetFlagJournal(talker, 118, 7);
myself.ShowQuestMark(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_pinter_q0118_15.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 4 && gg.OwnItemCount(talker, 8063) < 8) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0118_16.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 118) == 1 && gg.GetMemoState(talker, 118) == 4 && gg.OwnItemCount(talker, 8063) >= 8) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 118, 1) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7850, 1);
myself.GiveItem1(talker, 7851, 1);
myself.GiveItem1(talker, 7852, 1);
myself.GiveItem1(talker, 7853, 1);
myself.DeleteItem1(talker, 8063, gg.OwnItemCount(talker, 8063));
myself.RemoveMemo(talker, 118);
gg.AddLog(2, talker, 118);
myself.SetOneTimeQuestFlag(talker, 118, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

} else if (gg.GetMemoStateEx(talker, 118, 1) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7850, 1);
myself.GiveItem1(talker, 7854, 1);
myself.GiveItem1(talker, 7855, 1);
myself.GiveItem1(talker, 7856, 1);
myself.DeleteItem1(talker, 8063, gg.OwnItemCount(talker, 8063));
myself.RemoveMemo(talker, 118);
myself.SetOneTimeQuestFlag(talker, 118, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

} else if (gg.GetMemoStateEx(talker, 118, 1) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7850, 1);
myself.GiveItem1(talker, 7857, 1);
myself.GiveItem1(talker, 7858, 1);
myself.GiveItem1(talker, 7859, 1);
myself.DeleteItem1(talker, 8063, gg.OwnItemCount(talker, 8063));
myself.RemoveMemo(talker, 118);
myself.SetOneTimeQuestFlag(talker, 118, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
myself.ShowPage(talker, "blacksmith_pinter_q0118_17.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) <= 3) {
myself.ShowPage(talker, "blacksmith_pinter_q0708_02.htm");

} else if (gg.GetMemoState(c0, 708) == 4) {
i1 = gg.GetMemoStateEx(c0, 708, 1);
if (talker.dbid == i1) {
myself.ShowPage(talker, "blacksmith_pinter_q0708_03.htm");

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_03a.htm");

}

} else if (gg.GetMemoState(c0, 708) % 10 == 5) {
if (gg.OwnItemCount(talker, 1867) >= 100 && gg.OwnItemCount(talker, 1865) >= 100 && gg.OwnItemCount(talker, 1869) >= 100 && gg.OwnItemCount(talker, 1879) >= 50) {
myself.ShowPage(talker, "blacksmith_pinter_q0708_08.htm");

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_07.htm");

}

} else if (gg.GetMemoState(c0, 708) % 10 == 9) {
myself.ShowPage(talker, "blacksmith_pinter_q0708_12.htm");

}

} else {
myself.ShowPage(talker, "blacksmith_pinter_q0708_01.htm");

}

}
break;

}
case 20: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(708);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pinter_q0708_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 118) {
myself.SetCurrentQuestID(118);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 118) == 0 && gg.HaveMemo(talker, 123) == 0 && talker.level >= 19 && myself.IsAcademyMember(talker) == 1 && myself.HasAcademyMaster(talker) == 1 && myself.GetOneTimeQuestFlag(talker, 118) == 0 && myself.GetOneTimeQuestFlag(talker, 123) == 0) {
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 118, 1);
myself.SetFlagJournal(talker, 118, 1);
myself.ShowQuestMark(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "blacksmith_pinter_q0118_03.htm", 118);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}


}